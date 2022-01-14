package com.ita.u1.hw.Dao;

import com.ita.u1.hw.Model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    private static final String SELECT_USERS = "select * from users";
    private static final String SELECT_USER_BY_EMAIL = "select * from users WHERE email = ?";

    private SessionFactory sessionFactory;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery(SELECT_USERS);
        List<User> users = theQuery.list();
        return users;
    }

    @Override
    public User findUserByEmail(String email) {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery(SELECT_USER_BY_EMAIL);
        theQuery.setParameter(0, email);
        User user = (User) theQuery.getSingleResult();
        return user;
    }

}
