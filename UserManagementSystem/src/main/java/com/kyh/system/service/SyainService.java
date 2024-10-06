package com.kyh.system.service;



import java.util.List;

import com.kyh.system.entity.Syain;


public interface SyainService {
	
	public  Syain getUserByName(Syain syain);
	
	int addSyain(Syain syain);
	
	public List<Syain> list();
}
