package Test;

import com.hibernate.Utils.DBManager;
import com.hibernate.entity.ManEntity;
import org.junit.Test;

/**
 * Created by user on 2017/4/11.
 */

import java.sql.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JDBCTest {
    public ResultSet findByParameters(String sql, Object ...paras){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        try {
            conn = DBManager.getInstance().getConnetion();
            ps =conn.prepareStatement(sql);
            for(int i = 0; i < paras.length; i++){
                ps.setObject(i+1, paras[i]);


            }
            rs = ps.executeQuery();
        }catch (Exception e){
            System.out.print("find error!");
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
                System.out.print("数据库关闭出错");
            }

        }
        return  rs;
    }
    @Test
    public void getPictureById(){
        String path = "D:\\";
        DBManager.getInstance().downPicture("10",path);
    }
    @Test
    public void updatePictureById(){
        DBManager.getInstance().updatePicture("10","D:\\test.jpg");
    }
    @Test
    public void Insert(){
        String id = "13";
        String name = "sinitek";
        String sex = "m";
        long age = 23;
        String address = "china";
        Timestamp birthday = new Timestamp(System.currentTimeMillis());
        ManEntity manEntity = new ManEntity(id,  name, sex, null, address, age, birthday);
       // DBManager.getInstance().insert(manEntity);
        DBManager.getInstance().insertWithPicture(manEntity,"D:\\test01.jpg");
    }
    @Test
    public void update(){
        ManEntity man = DBManager.getInstance().getManEntityById("10");
        if(man != null) {
            man.setSex("m");
         //   DBManager.getInstance().update(man);
            DBManager.getInstance().updateWithPicture(man,"D:\\test.jpg");
        }else{
            System.out.print("No date with the id");
        }
    }
    //根据Id获取封装后的数据
    @Test
    public void getManEntityById(){
        ManEntity manEntity = DBManager.getInstance().getManEntityById("1");
        ManEntity manEntity1 = DBManager.getInstance().getManEntityByIdAnother("1");

        System.out.print("ID"+manEntity.getId()+" name:"+manEntity.getName()+" sex"+manEntity.getSex()+
                " age:"+manEntity1.getAge() +"birthday"+DateFormat.getDateInstance().format(manEntity.getBirthday()));
    }
    //获取所有并封装所有数据
    @Test
    public void getAllEntity(){
        List<ManEntity> list = DBManager.getInstance().getAllEntity();
        for (ManEntity manEntity : list){
            String formateDate = "";
            if(manEntity.getBirthday()!=null)
                formateDate = DateFormat.getDateInstance().format(manEntity.getBirthday());
            System.out.print("ID"+manEntity.getId()+" name:"+manEntity.getName()+" sex:"+manEntity.getSex()+
                    " age:"+manEntity.getAge() +" birthday"+formateDate+"\n");
        }
    }
    //根据sql以及参数获取数据
    @Test
    public void findByPatameters() throws SQLException {
        String sql="Select * from man Where age = ?";
        ArrayList<HashMap<String,Object>> list = DBManager.getInstance().findByParameters(sql,23);
        for(HashMap<String,Object> obj : list){
            String formateDate = DateFormat.getDateInstance().format(obj.get("BIRTHDAY"));
            System.out.print("\n"+"ID:"+ obj.get("ID"));
            System.out.print(" name:"+ obj.get("NAME"));
            System.out.print(" sex:"+ obj.get("SEX"));
            System.out.print(" age:"+ obj.get("AGE"));
            System.out.print(" birthday:"+formateDate+"\n");
        }
    }
    //删除数据
    @Test
    public void delte(){
        DBManager.getInstance().delete("10");

    }
}
