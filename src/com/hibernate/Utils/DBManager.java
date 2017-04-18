package com.hibernate.Utils;

import com.hibernate.entity.ManEntity;

import java.io.*;
import java.sql.*;
import java.util.*;

/**
 * Created by user on 2017/4/11.
 */
public class DBManager {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;
    private static DBManager instance = null;
    private DBManager(){}
    public static DBManager getInstance(){
        if(instance == null){
            instance = new DBManager();
        }
        return instance;
    }

    static{
        try{
            ResourceBundle rb = ResourceBundle.getBundle("database");
            driver = rb.getString("driver").trim();
            url = rb.getString("url").trim();
            user = rb.getString("user").trim();
            password= rb.getString("password").trim();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnetion(){
        Connection conn = null;
        try{
            System.out.print(driver);
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.print("���ݿ�����δ�ҵ�");
        }

        try{
            System.out.print(url+user+password);
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("���ݿ����ӳ�������URL,�û����������Ƿ���ȷ");
        }
        return conn;
    }
    //将图片保存到oracle数据库中
    public int writeBlob(String path,String id) throws SQLException, IOException{
        Connection conn = null;
        PreparedStatement ps =null;
        conn = getConnetion();
        int result = 0;
        String sql = "insert into man(id,picture) values(?,?)";
        conn = getConnetion();
        try {
            ps = conn.prepareStatement(sql);
            //1.����Blob
            Blob image = conn.createBlob();
            //2.��������blob
            OutputStream out = image.setBinaryStream(1);
            //3.��ȡͼƬ,��д�������
            FileInputStream fis = new FileInputStream(path);
            byte []buf = new byte[1024];
            int len = 0;
            while((len=fis.read(buf))!=-1){
                out.write(buf, 0, len);
            }
            ps.setObject(1,id);
            ps.setBlob(2,image);
            result = ps.executeUpdate();
            fis.close();
            out.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }

        return result;
    }

    public List<ManEntity> getAllEntity(){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;

        List<ManEntity> list = new ArrayList<ManEntity>();
        try {
            conn = getConnetion();
            String sql = "Select * from MAN";
            ps =conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                ManEntity man = new ManEntity();
                man.setId(rs.getString(1));
                man.setName(rs.getString(2));
                man.setSex(rs.getString(3));
                man.setAddress(rs.getString(5));
                man.setBirthday(rs.getTimestamp(7));
                man.setAge(rs.getInt(6));
                list.add(man);
            }
        }catch (Exception e){

        }finally {
            try {

                if(rs != null){
                    rs.close();
                }

                if(ps != null){
                    ps.close();
                }

                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }
        return  list;
    }
    public ArrayList findByParameters(String sql, Object ...paras){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
      //  sql = "Select * from MAN";
     //   List<ManEntity> list = new ArrayList<ManEntity>();
        ArrayList<HashMap<String,Object>> result = new ArrayList<HashMap<String,Object>>();
        try {
            conn = getConnetion();
            ps =conn.prepareStatement(sql);
            for(int i = 0; i < paras.length; i++){
                ps.setObject(i+1, paras[i]);
            }
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            System.out.print(rs.getRow());
            int columCount = rsmd.getColumnCount();
            while(rs.next()) {
                HashMap<String, Object> row = new HashMap<String, Object>();
                for (int i = 1; i <= columCount; i++) {
                    String name = rsmd.getColumnName(i);
                    row.put(rsmd.getColumnName(i), rs.getObject(i));

                }
             //   ManEntity man = convert(rs,rsmd);
             //   list.add(man);
                result.add(row);
            }
        }catch (Exception e){
            System.out.print(e);
        }finally {
            try {

                if(rs != null){
                    rs.close();
                }

                if(ps != null){
                    ps.close();
                }

                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }

        }
        return  result;
    }
    //从数据库中获取图片，path是保存路径
    //get picture from oracle
    public void downPicture(String id, String path){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        ArrayList<HashMap<String,Object>> result = new ArrayList<HashMap<String,Object>>();
        try {
            String sql = "Select * from man Where ID = ?";
            conn = getConnetion();
            ps =conn.prepareStatement(sql);
            ps.setObject(1, id);
            rs = ps.executeQuery();
            Blob blob =null;
            while(rs.next()) {
                blob = rs.getBlob("picture");
                break;
            }
            InputStream ins = blob.getBinaryStream();
            path = path + "jppicture" + id + ".jpg";
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            OutputStream fos = new FileOutputStream(file);
            byte[] b = new byte[1024];
            int len = 0;
            while((len = ins.read(b))!=-1){
                fos.write(b,0,len);
            }
            fos.close();
            ins.close();
        }catch (Exception e){
            System.out.print("something error");
        }finally {
            try {

                if(rs != null){
                    rs.close();
                }

                if(ps != null){
                    ps.close();
                }

                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("���ݿ�رճ���");
            }

        }

    }
    public void updatePicture(String id,String path){

        Connection conn = null;
        PreparedStatement ps = null;
        boolean flag = false;
        String sql = "update man set PICTURE = ? where ID = ?";
        conn = getConnetion();
        try {
            Blob image = conn.createBlob();
            //2.��������blob
            OutputStream out = image.setBinaryStream(1);
            //3.��ȡͼƬ,��д�������
            FileInputStream fis = new FileInputStream(path);
            byte []buf = new byte[1024];
            int len = 0;
            while((len=fis.read(buf))!=-1){
                out.write(buf, 0, len);
            }
            ps = conn.prepareStatement(sql);
            ps.setObject(2,id);
            ps.setObject(1,image);

            int i = ps.executeUpdate();
            if(i != 0){
                flag = true;
            }
            fis.close();
            out.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }

    }
    public void updateWithPicture(ManEntity manEntity,String path){
        String id = manEntity.getId();
        Connection conn = null;
        PreparedStatement ps = null;
        boolean flag = false;
        String sql = "update man set NAME = ?, SEX = ?, PICTURE = ?,ADDRESS = ?, AGE = ?, BIRTHDAY = ? where ID = ?";
        conn = getConnetion();
        try {
            Blob image = conn.createBlob();
            //2.��������blob
            OutputStream out = image.setBinaryStream(1);
            //3.��ȡͼƬ,��д�������
            FileInputStream fis = new FileInputStream(path);
            byte []buf = new byte[1024];
            int len = 0;
            while((len=fis.read(buf))!=-1){
                out.write(buf, 0, len);
            }
            ps = conn.prepareStatement(sql);
            ps.setObject(7,manEntity.getId());
            ps.setObject(1,manEntity.getName());
            ps.setObject(2,manEntity.getSex());
            ps.setObject(3,image);
            ps.setObject(4,manEntity.getAddress());
            ps.setObject(5,manEntity.getAge());
            ps.setObject(6,manEntity.getBirthday());
            int i = ps.executeUpdate();
            if(i != 0){
                flag = true;
            }
            fis.close();
            out.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }

    }
    public void update(ManEntity manEntity){
        String id = manEntity.getId();
        Connection conn = null;
        PreparedStatement ps = null;
        boolean flag = false;
        String sql = "update man set NAME = ?, SEX = ?, PICTURE = ?,ADDRESS = ?, AGE = ?, BIRTHDAY = ? where ID = ?";
        conn = getConnetion();
        try {
            ps = conn.prepareStatement(sql);
            ps.setObject(7,manEntity.getId());
            ps.setObject(1,manEntity.getName());
            ps.setObject(2,manEntity.getSex());
            ps.setObject(3,manEntity.getPicture());
            ps.setObject(4,manEntity.getAddress());
            ps.setObject(5,manEntity.getAge());
            ps.setObject(6,manEntity.getBirthday());
            int i = ps.executeUpdate();
            if(i != 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }

    }

    public ManEntity convert(ResultSet rs, ResultSetMetaData rsmd) {
        ManEntity man = new ManEntity();

        try {
            int columCount = rsmd.getColumnCount();
            while (rs.next()) {

                for (int i = 1; i <= columCount; i++) {
                    String name = rsmd.getColumnName(i);
                    if (name.equals("ID"))
                        man.setId(rs.getString(i));
                    if (name.equals("NAME"))
                        man.setName(rs.getString(i));
                    if (name.equals("SEX"))
                        man.setName(rs.getString(i));
                    if (name.equals("ADDRESS"))
                        man.setName(rs.getString(i));
                    if (name.equals("BIRTHDAY"))
                        man.setBirthday(rs.getTimestamp(i));

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  man;
    }
    public ManEntity getManEntityById(String id){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        ManEntity man = new ManEntity();
        try {
            conn = getConnetion();
            String sql = "Select * from man Where ID = ?";
            ps =conn.prepareStatement(sql);
            ps.setObject(1,id);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            int columCount = rsmd.getColumnCount();
            while(rs.next()) {
                for (int i = 1; i <= columCount; i++) {
                    String name = rsmd.getColumnName(i);
                    if(name.equals("ID"))
                        man.setId(rs.getString(i));
                    if(name.equals("NAME"))
                        man.setName(rs.getString(i));
                    if(name.equals("SEX"))
                        man.setName(rs.getString(i));
                    if(name.equals("ADDRESS"))
                        man.setName(rs.getString(i));
                    if(name.equals("BIRTHDAY"))
                        man.setBirthday(rs.getTimestamp(i));
                    if(name.equals("AGE"))
                        man.setAge(rs.getInt(i));
                }
            }
        }catch (Exception e){

        }finally {
            try {

                if(rs != null){
                    rs.close();
                }

                if(ps != null){
                    ps.close();
                }

                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }
        return man;
    }
    public ManEntity getManEntityByIdAnother(String id){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        ManEntity man = new ManEntity();
        try {
            conn = getConnetion();
            String sql = "Select * from man Where ID = ?";
            ps =conn.prepareStatement(sql);
            ps.setObject(1,id);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            int columCount = rsmd.getColumnCount();
            while(rs.next()) {
                man.setId(rs.getString(1));
                man.setName(rs.getString(2));
                man.setSex(rs.getString(3));
                man.setAddress(rs.getString(5));
                man.setBirthday(rs.getTimestamp(7));
                man.setAge(rs.getInt(6));
            }
        }catch (Exception e){

        }finally {
            try {

                if(rs != null){
                    rs.close();
                }

                if(ps != null){
                    ps.close();
                }

                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }
        return man;
    }


    public boolean insert(ManEntity manEntity){
        Connection conn = null;
        PreparedStatement ps = null;
        boolean flag = false;

        String sql = "insert into man(id,name,sex,picture,address,age,birthday) values(?,?,?,?,?,?,?)";
        conn = getConnetion();
        try {
            ps = conn.prepareStatement(sql);
            ps.setObject(1,manEntity.getId());
            ps.setObject(2,manEntity.getName());
            ps.setObject(3,manEntity.getSex());
            ps.setObject(4,manEntity.getPicture());
            ps.setObject(5,manEntity.getAddress());
            ps.setObject(6,manEntity.getAge());
            ps.setObject(7,manEntity.getBirthday());
            int i = ps.executeUpdate();
            if(i != 0){
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {


                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }
        return flag;
    }


    public boolean insertWithPicture(ManEntity manEntity,String path){
        Connection conn = null;
        PreparedStatement ps = null;
        boolean flag = false;

        String sql = "insert into man(id,NAME,sex,picture,address,age,birthday) values(?,?,?,?,?,?,?)";
        conn = getConnetion();
        try {
            Blob image = conn.createBlob();
            //2.��������blob
            OutputStream out = image.setBinaryStream(1);
            //3.��ȡͼƬ,��д�������
            FileInputStream fis = new FileInputStream(path);
            byte []buf = new byte[1024];
            int len = 0;
            while((len=fis.read(buf))!=-1){
                out.write(buf, 0, len);
            }
            ps = conn.prepareStatement(sql);
            ps.setObject(1,manEntity.getId());
            ps.setObject(2,manEntity.getName());
            ps.setObject(3,manEntity.getSex());
            ps.setBlob(4, image);
            ps.setObject(5,manEntity.getAddress());
            ps.setObject(6,manEntity.getAge());
            ps.setObject(7,manEntity.getBirthday());
            int i = ps.executeUpdate();
            if(i != 0){
                flag = true;
            }
            fis.close();
            out.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            }
        }
        return flag;
    }

    public void delete(String id){
        Connection conn = null;
        PreparedStatement ps =null;
        try {
            String sql = "DELETE  FROM  MAN WHERE ID = ?";
            conn = getConnetion();
            ps =conn.prepareStatement(sql);
            ps.setObject(1, id);
            boolean execute = ps.execute();
        }catch (Exception e){
            System.out.print(e);
        }finally {
            try {

                if (ps != null) {
                    ps.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.print("error close");
            } finally {
                try {


                    if (ps != null) {
                        ps.close();
                    }

                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    System.out.print("error close");
                }

            }
        }
    }
}



















