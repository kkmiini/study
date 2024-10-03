package com.kyh.system.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.kyh.system.entity.User;
import com.kyh.system.service.SyainService;
import com.kyh.system.service.UserService;

@Controller
@RequestMapping(value = "")
public class RegisterController {

    private static final String MANAGEMENT_VIEW = "/login/management";  // 관리 페이지 경로
    private static final String REGISTER_VIEW = "/login/register";  // 등록 페이지 경로
    private static final String UPDATE_VIEW = "/login/update";  // 수정 페이지 경로

    @RequestMapping(value = "/management", method = RequestMethod.GET)
    public String management() {
        return MANAGEMENT_VIEW;  // 관리 페이지로 이동
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return REGISTER_VIEW;  // 등록 페이지로 이동
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String update() {
        return UPDATE_VIEW;  // 수정 페이지로 이동
    }
    
    
    
}



