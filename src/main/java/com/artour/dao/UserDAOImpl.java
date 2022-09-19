package com.artour.dao;

import com.artour.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @ In the name of Allah, most gracious and most merciful 12.09.2022
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT c FROM User c", User.class).getResultList();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public void updateUser(long id, User updatedUser) {
        entityManager.merge(updatedUser);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        entityManager.remove(getUserById(id));
    }
}