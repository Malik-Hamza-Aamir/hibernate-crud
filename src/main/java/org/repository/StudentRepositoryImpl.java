package org.repository;

import org.entities.Student;
import org.example.HibernateConfig;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentRepositoryImpl implements StudentRepository {
    SessionFactory sessionFactory = HibernateConfig.getSessionFactory();

    public Session openSession () {
        Session session = sessionFactory.openSession();
        return session;
    }

    public void closeSession (Session session) {
        session.close();
    }

    public Transaction startTransaction (Session session) {
        Transaction tx = session.beginTransaction();
        return tx;
    }

    public void commitTransaction (Transaction tx) {
        tx.commit();
    }

    public StudentRepositoryImpl () {
        super();
    }

    @Override
    public void insert(Student student) {
        Session session = openSession();
        Transaction tx = startTransaction(session);
        session.save(student);
        commitTransaction(tx);
        closeSession(session);
    }

    @Override
    public void get(int id) {
        Session session = openSession();
        Student s = session.get(Student.class, id);
        System.out.println("ID : " + s.getId());
        System.out.println("Name : " + s.getName());
        System.out.println("City : " + s.getCity());
        System.out.println("Roll No : " + s.getRollno());
    }

    @Override
    public void delete(int id) {
        Session session = openSession();
        Transaction tx = startTransaction(session);
        Student s = session.get(Student.class, id);
        session.delete(s);
        commitTransaction(tx);
        closeSession(session);
    }

    @Override
    public void update(int id, String rollno) {
        Session session = openSession();
        Transaction tx = startTransaction(session);
        Student s = session.get(Student.class, id);
        s.setRollno(rollno);
        session.save(s);
        commitTransaction(tx);
        closeSession(session);
    }
}
