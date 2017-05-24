package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import beans.User;

public interface IUserDao {

    public void addUser(User user);

    @Delete("delete from f_user_t where id=#{id}")
    public void delUser(Integer userId);

    @Select("select * from f_user_t where id=#{id")
    public User queryUserById(Integer userId);

    @Select("select * from f_user_t")
    public List<User> queryAll();
    
}