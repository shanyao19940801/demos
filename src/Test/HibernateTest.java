package Test;

import com.hibernate.entity.ManEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.List;

/**
 * Created by user on 2017/4/11.
 */
public class HibernateTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    @Before
    public void init() {

        Configuration config = new Configuration().configure();

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
                applySettings(config.getProperties()).buildServiceRegistry();
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    //运行之前初始化
    @After
    public void destory() {
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    private byte [] inputStreamToByte(InputStream is) throws IOException {
        ByteArrayOutputStream bAOutputStream = new ByteArrayOutputStream();
        int ch;
        while((ch = is.read() ) != -1){
            bAOutputStream.write(ch);
        }
        byte data [] =bAOutputStream.toByteArray();
        bAOutputStream.close();
        return data;
    }

    //保存
    @Test
    public void save() {
        String fileNamePath = "D:\\test01.jpg";
        byte[] picture = new byte[] {};
        File file = new File(fileNamePath);
        if(file.exists()){
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
                picture = this.inputStreamToByte(inputStream);//���ļ����浽�ֽ�������
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String id = "4";
        String name = "sinitek";
        String sex = "m";
        long age = 23;
        String address = "china";
        Timestamp birthday = new Timestamp(System.currentTimeMillis());
        ManEntity s = new ManEntity(id,  name, sex, picture, address, age, birthday);
        session.save(s);
    }
    //更新
    @Test
    public void update() {
        ManEntity man = (ManEntity) session.get(ManEntity.class, "1");
       man.setName("Tom");
        Timestamp birthday = new Timestamp(System.currentTimeMillis() );
        man.setBirthday(birthday);
        session.update(man);

    }
    //获取所有
    @Test
    public void getAll() {
        //ManEntityDao dao = new ManEntityDao();
        ManEntity man1 = (ManEntity) session.get(ManEntity.class, "1");
        //  ManEntity man1 = dao.findById("1");
        System.out.println("id:" + man1.getName() + "; age:" + man1.getAge() +
                "; address: " + man1.getAddress() + "; date: " + man1.getBirthday());

        String hql = "FROM ManEntity";
        Query query = session.createQuery(hql);
        // query.setParameter(0 "1");
        List<ManEntity> list = query.list();
        for(ManEntity man : list) {
            String formateDate = DateFormat.getDateInstance().format(man.getBirthday());
            System.out.println("id:" + man.getId() + "; age:" + man.getAge() +
                    "; address: " + man.getAddress() + "; date: " +formateDate);
        }
    }
    @Test
    public void getById(){
        ManEntity man1 = (ManEntity) session.get(ManEntity.class, "1");
        System.out.println("id:" + man1.getName() + "; age:" + man1.getAge() +
                "; address: " + man1.getAddress() + "; date: " + man1.getBirthday());
    }
    //获取图片
    @Test
    public void getPicture(){
        String id = "2";
        ManEntity man1 = (ManEntity) session.get(ManEntity.class, id);
        if(man1!=null) {
            byte[] picture = man1.getPicture();
            File file = null;
            FileOutputStream fos = null;

            String fileName = "picture" + man1.getId()+".jpg";
            try {
                file = new File("D:\\" + fileName);
                if (!file.exists()) {
                    file.createNewFile();
                }
                fos = new FileOutputStream(file);

                if (picture.length > 0) {
                    fos.write(picture, 0, picture.length);
                } else {

                    System.out.print("û��ͼƬ��");

                }

                fos.close();
                ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.print("û��IdΪ"+id+"������");
        }

    }
    //删除
    @Test
    public void delete() {
        ManEntity man = (ManEntity) session.get(ManEntity.class, "3");
     //   man.setAge(34);
        session.delete(man);
    }
}
