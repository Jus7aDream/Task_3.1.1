package com.artour.dao;

import com.artour.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
@Repository
public class UserDaoImpl implements UserDao {
    private final SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> allUsers(int page) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from User").setFirstResult(10 * (page - 1)).setMaxResults(10).list();
    }

    @Override
    public int usersCount() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select count(*) from User", Number.class).getSingleResult().intValue();
    }

    @Override
    public void add(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    public void delete(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(user);
    }

    @Override
    public void edit(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public User getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }
}
