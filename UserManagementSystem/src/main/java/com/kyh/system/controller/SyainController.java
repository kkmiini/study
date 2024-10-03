package com.kyh.system.controller;

import com.kyh.system.entity.Syain;
import com.kyh.system.repository.SyainRepository;
import com.kyh.system.service.SyainService;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/syain")
public class SyainController {

	 @Autowired
	    private SyainService syainService;

	    private static final String ERROR_VIEW = "error";  // 에러 페이지
	    private static final String SUCCESS_VIEW = "redirect:/success";  // 성공 페이지

	    @PostMapping("/register")
	    public String registerSyain(@ModelAttribute @Valid Syain syain, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {
	            // 유효성 검사 실패 시 처리 로직
	            return ERROR_VIEW;  // 에러 페이지로 이동
	        }
	        syainService.saveSyain(syain);
	        return SUCCESS_VIEW;  // 성공 페이지로 리디렉션
	    }

	    @Autowired
	    private SyainRepository syainRepository;

	    @GetMapping("/management")
	    public String getSyainList(Model model) {
	        // 모든 사원 정보를 가져와서 Model에 추가
	        List<Syain> syainList = syainRepository.findAll();
	        model.addAttribute("syainList", syainList);

	        // management.html 뷰로 이동
	        return "/login/management";  // 뷰 경로는 필요에 따라 상수로 관리
	    }
    

    
    
}
    
    





