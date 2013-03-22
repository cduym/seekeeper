package com.cduym.seekeeper.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cduym.seekeeper.config.user.UserService;
import com.cduym.seekeeper.model.user.User;

@Controller
public class SystemConfigController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String updateSystemConfig(ModelMap model) {
        List<User> users = userService.listAllUsers();
        model.addAttribute("users", users);

        for (User user : users) {
            System.out.println(user.getName());
        }

        return "demo";
    }
}
