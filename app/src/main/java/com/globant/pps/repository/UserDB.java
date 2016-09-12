package com.globant.pps.repository;

import com.globant.pps.repository.entity.User;

import java.util.List;

public class UserDB implements UserRepository {
    @Override
    public User load(Long id) {
        return User.findById(User.class, id);
    }

    @Override
    public Long create(String height, Long date) {
        final User user = new User(height, date);
        user.save();
        return user.getId();
    }

    @Override
    public void update(Long id, String height, Long date) {
        final User user = User.findById(User.class, id);
        if (user == null) {
            return;
        }
        user.setHeight(height);
        user.setDate(date);
        user.save();
    }

    @Override
    public List<User> list() {
        return User.listAll(User.class);
    }
}
