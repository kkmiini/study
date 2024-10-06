package com.kyh.system.controller;


import com.kyh.system.entity.Syain;
import com.kyh.system.mapper.SyainMapper;
import com.kyh.system.service.SyainService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;


@Controller
public class SyainController {

	@Autowired
    private SyainService syainService;
	
	@RequestMapping(value = "myInfo", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView myInfo(@RequestParam("lastNameKanji") String lastNameKanji,
	                           @RequestParam("taisyaDate") LocalDateTime taisyaDate,
	                           @RequestParam("nyuusyaDate") LocalDateTime nyuusyaDate,
	                           @RequestParam("seibetu") boolean seibetu,
	                           @RequestParam("syokugyoKind") boolean syokugyoKind,
	                           HttpSession session) {
	    ModelAndView model = new ModelAndView();

	    // 세션에서 사용자 정보 가져오기
	    Syain syain = (Syain) session.getAttribute("syain");

	    // 받은 데이터를 기반으로 Syain 정보 처리 (예: 데이터베이스 조회 등)
	    Syain logSyain = syainService.getUserByName(syain);
	    session.setAttribute("syain", logSyain);
	    
	    // 결과 데이터를 모델에 추가
	    model.addObject("syain", logSyain);
	    
	    // Ajax 요청에 대한 응답 (HTML로 반환할 수 있음)
	    model.setViewName("/login/management");
	    return model;
	}
	
	/* @PostMapping("/syain/register")
	@ResponseBody
    public String registerSyain(Syain syain, Model model) {
        int result = syainService.addSyain(syain);

        if (result == 1) {
            model.addAttribute("message", "登録が成功しました。");
        } else {
            model.addAttribute("message", "登録に失敗しました。");
        }
        
        return "register_result";  // 결과 페이지로 이동
    } */
	
	@RequestMapping("/syain/management")
	public String list(Model model) {

		List<Syain> list = syainService.list();
		model.addAttribute("item", list);
		
		/*for (Syain syain : list) {
		    System.out.println("ID: " + syain.getSyainId() + ", 이름: " + syain.getFirstNameKanji() + " " + syain.getLastNameKanji());
		} */
		return "/login/management";
	}
	
	@GetMapping("/modify")
	public String updatePage(@RequestParam String firstNameKanji, @RequestParam String lastNameKanji,
			@RequestParam String seibetu, @RequestParam String syokugyoKind, @RequestParam String nyuusyaDate, @RequestParam String taisyaDate, Model model) {
		Syain info = new Syain();
		info.setFirstNameKanji(firstNameKanji); 
		info.setLastNameKanji(lastNameKanji);
		info.setSeibetu(null);
		info.setSyokugyoKind(null);
		info.setNyuusyaDate(null);
		info.setTaisyaDate(null);
		
		 model.addAttribute("info", info);  
	    
	    return "/login/update";  // 업데이트 페이지로 이동
	}
	
	
    }
	
	
	
	

    

    
    





