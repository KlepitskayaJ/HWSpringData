package com.ita.u1.hw.Dao;


import com.ita.u1.hw.Model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User findUserByEmail(String email);
}
