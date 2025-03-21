package com.newService.superDuper;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class UserDao {

    public User findById(int id) {
        return HibernateSessionFactoryUtill.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtill.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public List<User> findAll() {
        List<User> users = (List<User>)  HibernateSessionFactoryUtill.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }
}
