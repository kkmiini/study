package com.kyh.system.Impl;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.kyh.system.entity.Syain;

import com.kyh.system.mapper.SyainMapper;

import com.kyh.system.service.SyainService;



//@Service(value = "syainService")
@Repository
public class SyainServiceImpl implements SyainService {

    // データベース操作のマッパーをインジェクションする
    @Autowired
    private SyainMapper syainMapper; // コンパイルエラーが発生する場合がありますが、影響はありません。メソッドを削除し、settingsのspring beanで設定できます
    

	/* @Override
	public Syain getUserByName(Syain syain) {
		// TODO Auto-generated method stub
		return syainMapper.select(syain);
	}

	@Override
	public int addSyain(Syain syain) {
		// TODO Auto-generated method stub
		return syainMapper.insert(syain);
	} 


	@Override
	public List<Syain> list() {
	
		return syainMapper.selectList();
	}  */

	@Override
	public List<Syain> listByLastNameKanji(String lastNameKanji) {
		// TODO Auto-generated method stub
		return syainMapper.listByLastNameKanji(lastNameKanji);
	}

	@Override
	public int register(Syain syain) {
		// TODO Auto-generated method stub
		return syainMapper.register(syain);
	}






}
