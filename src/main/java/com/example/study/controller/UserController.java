package com.example.study.controller;

import com.example.study.entity.User;
import com.example.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserController {

  @Resource
  private UserService userService;

    /**
     * 插入数据
     * @param user
     * @return
     */
  @PostMapping("user/insert")
  public Response insertUser(@RequestBody User user) {
      int result = userService.insertUser(user);
      return Response.success(result);
  }

    @GetMapping("user/selectUserById")
    public Response selectUserById(@RequestParam Integer id) {
        User user = userService.selectUserById(id);
        return Response.success(user);
    }
}
