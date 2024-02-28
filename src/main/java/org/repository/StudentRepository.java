package org.repository;

import org.entities.Student;

public interface StudentRepository {
    public void insert(Student student);
    public void get(int id);
    public void delete(int id);
    public void update (int id, String rollno);
}
