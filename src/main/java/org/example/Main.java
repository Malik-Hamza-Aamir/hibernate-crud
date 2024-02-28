package org.example;

import org.entities.Student;
import org.repository.StudentRepositoryImpl;

public class Main {
    public static void main(String[] args) {
        StudentRepositoryImpl s = new StudentRepositoryImpl();
        Student student = new Student(3, "hamza aamir", "rawalpindi", "190900");
        Student student1 = new Student(4, "aliza sarim", "islamabad", "190876");

        s.insert(student);
        s.insert(student1);

        s.get(2);

        s.update(1, "190902");

        s.delete(1);
    }
}