package com.kyh.system.service;

import com.kyh.system.entity.Syain;
import com.kyh.system.repository.SyainRepository; // 변경된 패키지 경로

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyainService {
    
    @Autowired
    private SyainRepository syainRepository; // SyainMapper 대신 SyainRepository 사용

 

    public Syain saveSyain(Syain syain) {
        return syainRepository.save(syain);
    }

    public List<Syain> getAllSyain() {
        return syainRepository.findAll();
    }
    
    
    
    
}