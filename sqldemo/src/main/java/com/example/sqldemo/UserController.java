package com.example.sqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntity> list(){
        return  userJPA.findAll();
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String getString(){
        return  "this is string ";
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Integer id){
          userJPA.deleteById(id);
        return userJPA.findAll();
    }

}
