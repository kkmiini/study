package com.kyh.system.controller;


import com.kyh.system.entity.Syain;
import com.kyh.system.mapper.SyainMapper;
import com.kyh.system.service.SyainService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
	
	@RequestMapping("/syain/register")
	public String register(
			@RequestParam Integer syainId,
			@RequestParam String firstNameKanji,
			@RequestParam String lastNameKanji,
			@RequestParam Integer seibetu,
			@RequestParam Integer syozokuKaisya,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date nyuusyaDate,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date taisyaDate,
			@RequestParam Integer syokugyoKind,
			@RequestParam String kinyukikanCode,
			@RequestParam(required = false) String kinyukikanName,
			@RequestParam String sitenCode,
			@RequestParam(required = false) String sitenName,
			@RequestParam(required = false) Integer kouzaKind,
			@RequestParam String kouzaNum,
			@RequestParam String meigiName,
			@RequestParam(required = false) String itOs,
			@RequestParam String itBikou,
			Model model) {
		
		Syain syain = new Syain();
		syain.setSyainId(syainId);
		syain.setFirstNameKanji(firstNameKanji);
		syain.setLastNameKanji(lastNameKanji);
		syain.setSeibetu(seibetu);
		syain.setSyozokuKaisya(syozokuKaisya);
		
		syain.setNyuusyaDate(nyuusyaDate);
		syain.setTaisyaDate(taisyaDate);
		syain.setSyokugyoKind(syokugyoKind);
		syain.setKinyukikanCode(kinyukikanCode);
		syain.setKinyukikanName(kinyukikanName);
		syain.setSitenCode(sitenCode);
		syain.setSitenName(sitenName);
		syain.setKouzaKind(kouzaKind);
		syain.setKouzaNum(kouzaNum);
		syain.setMeigiName(meigiName);
		syain.setItOs(itOs);
		syain.setItBikou(itBikou);
		
		model.addAttribute("person", syain);
		
		
		int list = syainService.register(syain);
		
		return "/login/register";
	}
	
	@RequestMapping("/syain/management")
	public String list(@RequestParam String lastNameKanji, Model model) {
	    System.out.println("입력된 lastNameKanji: " + lastNameKanji); // 값 확인

	    // 입력받은 lastNameKanji를 기반으로 검색
	    List<Syain> list = syainService.listByLastNameKanji(lastNameKanji);
	    
	    // 모델에 검색 결과 추가
	    model.addAttribute("item", list);  

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
	
	
	
	

    

    
    





