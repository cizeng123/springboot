package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

public interface UserDao {
//    @Select("select * from user where username=#{username} and password = #{password}")
    public User login(@Param("username") String username,@Param("password") String password);

    public Integer insert(User user);
}
