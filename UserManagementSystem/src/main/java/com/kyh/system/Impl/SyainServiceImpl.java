package com.kyh.system.Impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kyh.system.entity.Syain;

import com.kyh.system.mapper.SyainMapper;

import com.kyh.system.service.SyainService;


@Service(value = "syainService")
public class SyainServiceImpl implements SyainService {

    // データベース操作のマッパーをインジェクションする
    @Autowired
    private SyainMapper syainMapper; // コンパイルエラーが発生する場合がありますが、影響はありません。メソッドを削除し、settingsのspring beanで設定できます

	@Override
	public Syain getUserByName(Syain syain) {
		// TODO Auto-generated method stub
		return syainMapper.select(syain);
	}




}
