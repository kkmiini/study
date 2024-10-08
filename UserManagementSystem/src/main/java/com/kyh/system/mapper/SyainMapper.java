package com.kyh.system.mapper;

import java.util.List;

import com.kyh.system.entity.Syain;

public interface SyainMapper {
	
	//Syain select(Syain lastNameKanji);
	
	//int insert(Syain record);

	 //List<Syain> selectList();

	//List<Syain> listByLastNameKanji();

	//List<Syain> listByLastNameKanji(String lastNameKanji);

	int register(Syain syain);

	List<Syain> listByinfo(String lastNameKanji, String syozokuKaisya, String syokugyoKind);

	Integer searchCount(String lastNameKanji, String syozokuKaisya, String syokugyoKind);

	int deleteSyain(String firstNameKanji, String lastNameKanji);
	

}
