package com.home.webforumpage.controllers;

import com.home.webforumpage.dao.UsersDao;
import com.home.webforumpage.entity.Users;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @RequestMapping(value = "/getAllUsers", produces = "application/json; charset=utf-8")
    public List getAllUsers(){
        UsersDao usersDao = new UsersDao();
        List<Users> listUsers = usersDao.getAll();
        usersDao.closeCurrentSession();
        return listUsers;
    }
}
