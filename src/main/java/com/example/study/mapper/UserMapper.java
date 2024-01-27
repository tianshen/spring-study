package com.example.study.mapper;

import com.example.study.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
  int insertUser(User user);

  User selectUserById(Integer id);
}