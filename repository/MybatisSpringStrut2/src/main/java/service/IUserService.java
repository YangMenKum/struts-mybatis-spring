package service;

import java.util.List;
import beans.User;

public interface IUserService {

    public abstract void addUser(User user);

    public abstract void deleteUser(Integer userId);

    public abstract User queryUserById(Integer userId);

    public abstract List<User> queryAllUser();

}