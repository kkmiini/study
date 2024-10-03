package com.kyh.system.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "SYAIN_MAIN")
public class Syain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SYAIN_ID;
	
    private String FIRST_NAME_KANJI;
    private String LAST_NAME_KANJI;
    private Integer SEIBETU;
    private Integer SYOZOKU_KAISYA;
    private Date NYUUSYA_DATE;
    private Date TAISYA_DATE;
    private Integer SYOKUGYO_KIND;
    private String KINYUKIKAN_CODE;
    private String KINYUKIKAN_NAME;
    private String SITEN_CODE;
    private String SITEN_NAME;
    private Integer KOUZA_KIND;
    
	private String KOUZA_NUM;
    private String MEIGI_NAME;
    private String IT_OS;
    private String IT_BIKOU;
    
	public Integer getSYAIN_ID() {
		return SYAIN_ID;
	}
	public void setSYAIN_ID(Integer sYAIN_ID) {
		SYAIN_ID = sYAIN_ID;
	}
	public String getFIRST_NAME_KANJI() {
		return FIRST_NAME_KANJI;
	}
	public void setFIRST_NAME_KANJI(String fIRST_NAME_KANJI) {
		FIRST_NAME_KANJI = fIRST_NAME_KANJI;
	}
	public String getLAST_NAME_KANJI() {
		return LAST_NAME_KANJI;
	}
	public void setLAST_NAME_KANJI(String lAST_NAME_KANJI) {
		LAST_NAME_KANJI = lAST_NAME_KANJI;
	}
	public Integer getSEIBETU() {
		return SEIBETU;
	}
	public void setSEIBETU(Integer sEIBETU) {
		SEIBETU = sEIBETU;
	}
	public Integer getSYOZOKU_KAISYA() {
		return SYOZOKU_KAISYA;
	}
	public void setSYOZOKU_KAISYA(Integer sYOZOKU_KAISYA) {
		SYOZOKU_KAISYA = sYOZOKU_KAISYA;
	}
	public Date getNYUUSYA_DATE() {
		return NYUUSYA_DATE;
	}
	public void setNYUUSYA_DATE(Date nYUUSYA_DATE) {
		NYUUSYA_DATE = nYUUSYA_DATE;
	}
	public Date getTAISYA_DATE() {
		return TAISYA_DATE;
	}
	public void setTAISYA_DATE(Date tAISYA_DATE) {
		TAISYA_DATE = tAISYA_DATE;
	}
	public Integer getSYOKUGYO_KIND() {
		return SYOKUGYO_KIND;
	}
	public void setSYOKUGYO_KIND(Integer sYOKUGYO_KIND) {
		SYOKUGYO_KIND = sYOKUGYO_KIND;
	}
	public String getKINYUKIKAN_CODE() {
		return KINYUKIKAN_CODE;
	}
	public void setKINYUKIKAN_CODE(String kINYUKIKAN_CODE) {
		KINYUKIKAN_CODE = kINYUKIKAN_CODE;
	}
	public String getKINYUKIKAN_NAME() {
		return KINYUKIKAN_NAME;
	}
	public void setKINYUKIKAN_NAME(String kINYUKIKAN_NAME) {
		KINYUKIKAN_NAME = kINYUKIKAN_NAME;
	}
	public String getSITEN_CODE() {
		return SITEN_CODE;
	}
	public void setSITEN_CODE(String sITEN_CODE) {
		SITEN_CODE = sITEN_CODE;
	}
	public String getSITEN_NAME() {
		return SITEN_NAME;
	}
	public void setSITEN_NAME(String sITEN_NAME) {
		SITEN_NAME = sITEN_NAME;
	}
	public Integer getKOUZA_KIND() {
		return KOUZA_KIND;
	}
	public void setKOUZA_KIND(Integer kOUZA_KIND) {
		KOUZA_KIND = kOUZA_KIND;
	}
	
	public String getKOUZA_NUM() {
		return KOUZA_NUM;
	}
	public void setKOUZA_NUM(String kOUZA_NUM) {
		KOUZA_NUM = kOUZA_NUM;
	}
	public String getMEIGI_NAME() {
		return MEIGI_NAME;
	}
	public void setMEIGI_NAME(String mEIGI_NAME) {
		MEIGI_NAME = mEIGI_NAME;
	}
	public String getIT_OS() {
		return IT_OS;
	}
	public void setIT_OS(String iT_OS) {
		IT_OS = iT_OS;
	}
	public String getIT_BIKOU() {
		return IT_BIKOU;
	}
	public void setIT_BIKOU(String iT_BIKOU) {
		IT_BIKOU = iT_BIKOU;
	}

   

}