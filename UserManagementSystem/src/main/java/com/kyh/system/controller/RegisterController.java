package com.kyh.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kyh.system.entity.User;
import com.kyh.system.service.UserService;

@Controller
@RequestMapping(value = "")
public class RegisterController {



    @RequestMapping(value = "/register", method = {RequestMethod.POST, RequestMethod.GET})
    public String register() {
        return "/login/register";
    }
    
    @RequestMapping(value = "/management", method = {RequestMethod.POST, RequestMethod.GET})
    public String management() {
        return "/login/management";
    }
    


}
