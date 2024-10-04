package com.kyh.system.controller;

import com.kyh.system.dto.SyainDTO;
import com.kyh.system.service.SyainService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class SyainController {

    private SyainService syainService;

    @GetMapping("/syain/register")
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



	

	
  /* public String save(@RequestParam("SYAIN_ID") Integer SYAIN_ID,
                       @RequestParam("FIRST_NAME_KANJI") String FIRST_NAME_KANJI,
                       @RequestParam("LAST_NAME_KANJI") String LAST_NAME_KANJI) {
        System.out.println("SyainController.save");
        System.out.println("SYAIN_ID = " + SYAIN_ID + ", FIRST_NAME_KANJI = " + FIRST_NAME_KANJI + ", LAST_NAME_KANJI = " + LAST_NAME_KANJI);
        return "/login/register";
    } */
    
}
    
    





