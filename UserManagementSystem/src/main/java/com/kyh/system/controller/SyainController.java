package com.kyh.system.controller;



import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kyh.system.entity.Syain;
import com.kyh.system.service.SyainService;


@Controller
public class SyainController {

	@Autowired
    private SyainService syainService;
	
	// register
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
	
	// management
	@RequestMapping("/syain/management")
	public String list(@RequestParam String lastNameKanji, 
			@RequestParam String syozokuKaisya,
			@RequestParam String syokugyoKind,
			Model model) {
	    System.out.println("입력된 lastNameKanji: " + lastNameKanji); 

	    List<Syain> list = syainService.listByinfo(lastNameKanji, syozokuKaisya, syokugyoKind);
	    Integer count = syainService.searchCount(lastNameKanji, syozokuKaisya, syokugyoKind);

	    model.addAttribute("item", list);  
	    model.addAttribute("count", count);
	    
	    System.out.println(count);

	    return "/login/management";   
	}
	
	// update
	@GetMapping("/modify")
	public String updatePage(@RequestParam String firstNameKanji, @RequestParam String lastNameKanji,
			@RequestParam String seibetu, @RequestParam String syozokuKaisya,  @RequestParam String syokugyoKind, @RequestParam String nyuusyaDate, @RequestParam String taisyaDate, Model model) {
		Syain info = new Syain();
		
		// seibetu를 문자열에서 정수로 변환
	    int seibetuInt = "男".equals(seibetu) ? 1 : 2; // 남성이면 1, 여성이면 2로 설정
	    int syozokuKaisyaInt = "株式会社ブライトスター" .equals(syozokuKaisya) ? 1: 2;
	    int syokugyoKindInt = 0; // 기본값을 0으로 설정
	    if ("役員".equals(syokugyoKind)) {
	        syokugyoKindInt = 1;
	    } else if ("総務".equals(syokugyoKind)) {
	        syokugyoKindInt = 2;
	    } else if ("IT営業".equals(syokugyoKind)) {
	        syokugyoKindInt = 3;
	    } else if ("ITエンジニア".equals(syokugyoKind)) {
	        syokugyoKindInt = 4;
	    } else if ("不動産スタッフ".equals(syokugyoKind)) {
	        syokugyoKindInt = 5;
	    } else if ("個人事業主".equals(syokugyoKind)) {
	        syokugyoKindInt = 6;
	    }
	    

		info.setFirstNameKanji(firstNameKanji); 
		info.setLastNameKanji(lastNameKanji);
		
		info.setSeibetu(seibetuInt); // 정수형으로 설정
		info.setSyozokuKaisya(syozokuKaisyaInt);
		info.setSyokugyoKind(syokugyoKindInt);
		
		 // nyuusyaDate가 "N/A"가 아닌 경우에만 파싱
	    if (!"N/A".equals(nyuusyaDate) && !nyuusyaDate.isEmpty()) {
	        SimpleDateFormat dateFormat_n = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date nyuusyaDateParsed = dateFormat_n.parse(nyuusyaDate);
	            info.setNyuusyaDate(nyuusyaDateParsed);
	           
	        } catch (ParseException e) {
	            e.printStackTrace();
	            info.setNyuusyaDate(null); // 오류 발생 시 null 설정
	        }
	    } else {
	        info.setNyuusyaDate(null); // "N/A"일 경우 null 설정
	    }

	    // taisyaDate가 "N/A"가 아닌 경우에만 파싱
	    if (!"N/A".equals(taisyaDate) && !taisyaDate.isEmpty()) {
	        SimpleDateFormat dateFormat_t = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date taisyaDateParsed = dateFormat_t.parse(taisyaDate);
	            info.setTaisyaDate(taisyaDateParsed);
	            
	         
	            
	        } catch (ParseException e) {
	            e.printStackTrace();
	            info.setTaisyaDate(null); // 오류 발생 시 null 설정
	        }
	    } else {
	        info.setTaisyaDate(null); // "N/A"일 경우 null 설정
	    }
	    System.out.println("Before parsing taisyaDate: " + taisyaDate);
        System.out.println("Parsed taisyaDate: " + info.getTaisyaDate());

		 model.addAttribute("info", info);  
		 
		 
	    
	    return "/login/update";  // 업데이트 페이지로 이동
	}
	
	//delete
	@GetMapping("/delete")
	public String delete(@RequestParam String firstNameKanji, 
	                                      @RequestParam String lastNameKanji) {
	    int result = syainService.deleteSyain(firstNameKanji, lastNameKanji);

	    if (result > 0) {
	        // 삭제 성공 시 리다이렉트
	        return "/login/management";
	                          
	        
	    } else {
	    	return "/login/management";
	    	
	    }
	
	
    }
	

}