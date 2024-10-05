package com.kyh.system.controller;


import com.kyh.system.entity.Syain;

import com.kyh.system.service.SyainService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

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
	
	
   /* @RequestMapping(value = "myInfo", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView myInfo(HttpSession session) {
        ModelAndView model = new ModelAndView();
        Syain syain = (Syain) session.getAttribute("syain");
        String name = syain.getLastNameKanji();
        syain.setLastNameKanji(name);
        Syain logSyain = syainService.getUserByName(syain);
        session.setAttribute("syain", logSyain);
        model.addObject("syain", logSyain);
        model.setViewName("/login/management");
        return model;
    } */
	
	
	
	
}	

  /*  @GetMapping("/syain/register")
    public String saveForm(Model model) {
        model.addAttribute("syainDTO", new SyainDTO());
        return "/login/register"; 
    }

    @PostMapping("/syain/register")
    public String save(@Valid @ModelAttribute("syainDTO") SyainDTO syainDTO, 
                       BindingResult bindingResult, 
                       Model model) {
        // 유효성 검사 결과 확인
        if (bindingResult.hasErrors()) {
            // 유효성 검사에 실패한 경우
            return "/login/register"; 
        }

        // 유효성 검사 통과 시 저장 처리
        syainService.save(syainDTO);
        
        return "redirect:/syain/register"; // 성공적으로 저장 후 리다이렉트
    }



	

	
   public String save(@RequestParam("SYAIN_ID") Integer SYAIN_ID,
                       @RequestParam("FIRST_NAME_KANJI") String FIRST_NAME_KANJI,
                       @RequestParam("LAST_NAME_KANJI") String LAST_NAME_KANJI) {
        System.out.println("SyainController.save");
        System.out.println("SYAIN_ID = " + SYAIN_ID + ", FIRST_NAME_KANJI = " + FIRST_NAME_KANJI + ", LAST_NAME_KANJI = " + LAST_NAME_KANJI);
        return "/login/register";
    } */
    

    
    





