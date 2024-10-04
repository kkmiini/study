package com.kyh.system.service;



import com.kyh.system.dto.SyainDTO;
import com.kyh.system.entity.SyainEntity;
import com.kyh.system.repository.SyainRepository; // 변경된 패키지 경로

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SyainService {
    
	@Autowired
    private SyainRepository syainRepository; 

    public void save(SyainDTO syainDTO) {
    	  /* DTO의 날짜 형식을 Date로 변환
        if (syainDTO.getNyuusyaDate() != null) {
            syainDTO.setNyuusyaDate(java.sql.Date.valueOf(syainDTO.getNyuusyaDate()));
        }
        if (syainDTO.getTaisyaDate() != null) {
            syainDTO.setTaisyaDate(java.sql.Date.valueOf(syainDTO.getTaisyaDate()));
        } */

        // 엔티티 변환 및 저장
        SyainEntity syainEntity = SyainEntity.toSyainEntity(syainDTO);
    
        syainRepository.save(syainEntity);
        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }

}

