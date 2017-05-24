package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.IUserDao;
import beans.User;
import service.IUserService;

@Service  
@Transactional 
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void deleteUser(Integer userId) {
        userDao.delUser(userId);
    }

    public User queryUserById(Integer userId) {
        return userDao.queryUserById(userId);
    }

    public List<User> queryAllUser() {
        return userDao.queryAll();
    }
    
}