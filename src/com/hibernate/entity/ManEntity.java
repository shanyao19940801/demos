package com.hibernate.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by user on 2017/4/11.
 */
@Entity
@Table(name = "MAN", schema = "SHANYAO", catalog = "")
public class ManEntity {
    private String id;
    private String name;
    private String sex;
    private byte[] picture;
    private String address;
    private long age;
    private Timestamp birthday;


    public ManEntity(){}
    public ManEntity(String id, String name, String sex, byte[] picture, String address, long age, Timestamp birthday){
        this.id = id;
        this.sex = sex;
        this.picture = picture;
        this.address = address;
        this.age = age;
        this.birthday = birthday;
        this.name = name;
    }
    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 4)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, insertable = true, updatable = true, length = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SEX", nullable = true, insertable = true, updatable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "PICTURE", nullable = true, insertable = true, updatable = true)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, insertable = true, updatable = true, length = 30)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "AGE", nullable = true, insertable = true, updatable = true, precision = 0)
    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    @Basic
    @Column(name = "BIRTHDAY", nullable = true, insertable = true, updatable = true)
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManEntity manEntity = (ManEntity) o;

        if (id != null ? !id.equals(manEntity.id) : manEntity.id != null) return false;
        if (name != null ? !name.equals(manEntity.name) : manEntity.name != null) return false;
        if (sex != null ? !sex.equals(manEntity.sex) : manEntity.sex != null) return false;
        if (!Arrays.equals(picture, manEntity.picture)) return false;
        if (address != null ? !address.equals(manEntity.address) : manEntity.address != null) return false;
        if (age != null ? !age.equals(manEntity.age) : manEntity.age != null) return false;
        if (birthday != null ? !birthday.equals(manEntity.birthday) : manEntity.birthday != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (picture != null ? Arrays.hashCode(picture) : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }*/
}
