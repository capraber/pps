package com.globant.pps.repository;

import com.globant.pps.repository.entity.User;

import java.util.List;

public interface UserRepository {

    User load(final Long id);

    Long create(final String height, final Long date);

    void update(final Long id, final String height, final Long date);

    List<User> list();

}
