package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toindex")
    public String showIndex(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        Integer count = userService.insert(user);
        if(count>=1){
            return "index";
        }else {
            return  "error";
        }

    }

    @RequestMapping("/tologin")
    public String showLogin(HttpServletRequest request, Model model){
        String username = request.getParameter("username");
        System.out.print(username);
        String password = request.getParameter("password");
        User user =  userService.login(username,password);
        if(user!=null){
            model.addAttribute("account",username);
            model.addAttribute("password",password);
            return "login";
        }else{
            return "error";
        }
    }

    @RequestMapping("/toregist")
    public String showRegist(){
        return "regist";
    }
}
