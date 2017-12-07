package chn.liu.htax.dao.impl;

import chn.liu.htax.dao.IUserDao;
import chn.liu.htax.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {
    @Override
    public void dropTable() {

    }

    @Override
    public void createTable() {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<User> findByNameLike(String name) {
        return null;
    }
}
