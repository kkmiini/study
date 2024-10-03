package com.kyh.system.controller;

import com.kyh.system.dto.SyainDTO;
import com.kyh.system.entity.SyainEntity;
import com.kyh.system.repository.SyainRepository;
import com.kyh.system.service.SyainService;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class SyainController {
	
	private final SyainService syainService = new SyainService();
	
	
	@GetMapping("/syain/register")
	public String saveform() {
		return "save";
	}

	@PostMapping("/syain/register")    // name값을 requestparam에 담아온다
	public String save(@ModelAttribute SyainDTO syainDTO) {
        System.out.println("SyainController.save");
        System.out.println("syainDTO = " + syainDTO);
        syainService.save(syainDTO);

        return "/login/register";
    }
	

	
  /* public String save(@RequestParam("SYAIN_ID") Integer SYAIN_ID,
                       @RequestParam("FIRST_NAME_KANJI") String FIRST_NAME_KANJI,
                       @RequestParam("LAST_NAME_KANJI") String LAST_NAME_KANJI) {
        System.out.println("SyainController.save");
        System.out.println("SYAIN_ID = " + SYAIN_ID + ", FIRST_NAME_KANJI = " + FIRST_NAME_KANJI + ", LAST_NAME_KANJI = " + LAST_NAME_KANJI);
        return "/login/register";
    } */
    
}
    
    





