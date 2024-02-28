package org.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String city;
    private String rollno;

    public Student(int id, String name, String city, String rollno) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.rollno = rollno;
    }

    public Student() {
        super();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}
