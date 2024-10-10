package com.kyh.system.service;



import java.util.List;

import com.kyh.system.entity.Syain;


public interface SyainService {
	
	//public  Syain getUserByName(Syain syain);
	
	//int addSyain(Syain syain);
	
	//public List<Syain> list();

	public int register(Syain syain);

	public List<Syain> listByinfo(String lastNameKanji, String syozokuKaisya, String syokugyoKind);

	public Integer searchCount(String lastNameKanji, String syozokuKaisya, String syokugyoKind);

	

	public int deleteSyain(String firstNameKanji, String lastNameKanji);
	
	


	
}
