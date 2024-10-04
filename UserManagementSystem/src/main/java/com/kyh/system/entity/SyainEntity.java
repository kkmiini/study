package com.kyh.system.entity;

import javax.persistence.*;

import com.kyh.system.dto.SyainDTO;

import lombok.Getter;
import lombok.Setter;


import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "SYAIN_MAIN")
public class SyainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SYAIN_ID")
    private Integer syainId;
	


	public Integer getSyainId() {
		return syainId;
	}


	public void setSyainId(Integer syainId) {
		this.syainId = syainId;
	}


	public String getFirstNameKanji() {
		return firstNameKanji;
	}


	public void setFirstNameKanji(String firstNameKanji) {
		this.firstNameKanji = firstNameKanji;
	}


	public String getLastNameKanji() {
		return lastNameKanji;
	}


	public void setLastNameKanji(String lastNameKanji) {
		this.lastNameKanji = lastNameKanji;
	}


	public Integer getSeibetu() {
		return seibetu;
	}


	public void setSeibetu(Integer seibetu) {
		this.seibetu = seibetu;
	}


	public Integer getSyozokuKaisya() {
		return syozokuKaisya;
	}


	public void setSyozokuKaisya(Integer syozokuKaisya) {
		this.syozokuKaisya = syozokuKaisya;
	}


	public Date getNyuusyaDate() {
		return nyuusyaDate;
	}


	public void setNyuusyaDate(Date nyuusyaDate) {
		this.nyuusyaDate = nyuusyaDate;
	}


	public Date getTaisyaDate() {
		return taisyaDate;
	}


	public void setTaisyaDate(Date taisyaDate) {
		this.taisyaDate = taisyaDate;
	}


	public Integer getSyokugyoKind() {
		return syokugyoKind;
	}


	public void setSyokugyoKind(Integer syokugyoKind) {
		this.syokugyoKind = syokugyoKind;
	}


	public String getKinyukikanCode() {
		return kinyukikanCode;
	}


	public void setKinyukikanCode(String kinyukikanCode) {
		this.kinyukikanCode = kinyukikanCode;
	}


	public String getKinyukikanName() {
		return kinyukikanName;
	}


	public void setKinyukikanName(String kinyukikanName) {
		this.kinyukikanName = kinyukikanName;
	}


	public String getSitenCode() {
		return sitenCode;
	}


	public void setSitenCode(String sitenCode) {
		this.sitenCode = sitenCode;
	}


	public String getSitenName() {
		return sitenName;
	}


	public void setSitenName(String sitenName) {
		this.sitenName = sitenName;
	}


	public Integer getKouzaKind() {
		return kouzaKind;
	}


	public void setKouzaKind(Integer kouzaKind) {
		this.kouzaKind = kouzaKind;
	}


	public String getKouzaNum() {
		return kouzaNum;
	}


	public void setKouzaNum(String kouzaNum) {
		this.kouzaNum = kouzaNum;
	}


	public String getMeigiName() {
		return meigiName;
	}


	public void setMeigiName(String meigiName) {
		this.meigiName = meigiName;
	}


	public String getItOs() {
		return itOs;
	}


	public void setItOs(String itOs) {
		this.itOs = itOs;
	}


	public String getItBikou() {
		return itBikou;
	}


	public void setItBikou(String itBikou) {
		this.itBikou = itBikou;
	}

	@Column(name = "FIRST_NAME_KANJI")
    private String firstNameKanji; 
	@Column(name = "LAST_NAME_KANJI")
    private String lastNameKanji; 
	@Column(name = "SEIBETU")
    private Integer seibetu; 
	@Column(name = "SYOZOKU_KAISYA")
    private Integer syozokuKaisya; 
	@Column(name = "NYUUSYA_DATE")
    private Date nyuusyaDate; 
	@Column(name = "TAISYA_DATE")
    private Date taisyaDate; 
	
	@Column(name = "SYOKUGYO_KIND")
    private Integer syokugyoKind; 
	@Column(name = "KINYUKIKAN_CODE")
    private String kinyukikanCode; 
	@Column(name = "KINYUKIKAN_NAME")
    private String kinyukikanName; 
	@Column(name = "SITEN_CODE")
    private String sitenCode; 
	@Column(name = "SITEN_NAME")
    private String sitenName; 
	@Column(name = "KOUZA_KIND")
    private Integer kouzaKind; 
	@Column(name = "KOUZA_NUM")
	private String kouzaNum; 
	@Column(name = "MEIGI_NAME")
    private String meigiName; 
	@Column(name = "IT_OS")
    private String itOs; 
	@Column(name = "IT_BIKOU")
    private String itBikou; 
   
	
	 public static SyainEntity toSyainEntity(SyainDTO syainDTO) {

		 SyainEntity syainEntity = new SyainEntity();
		 syainEntity.setSyainId(syainDTO.getSyainId());
		 syainEntity.setFirstNameKanji(syainDTO.getFirstNameKanji());
		 syainEntity.setLastNameKanji(syainDTO.getLastNameKanji());
		 syainEntity.setSeibetu(syainDTO.getSeibetu());
		 syainEntity.setSyozokuKaisya(syainDTO.getSyozokuKaisya());
		 syainEntity.setNyuusyaDate(syainDTO.getNyuusyaDate());
		 syainEntity.setTaisyaDate(syainDTO.getTaisyaDate());
	    	
		 syainEntity.setSyokugyoKind(syainDTO.getSyokugyoKind());
		 syainEntity.setKinyukikanCode(syainDTO.getKinyukikanCode());
		 syainEntity.setKinyukikanName(syainDTO.getKinyukikanName());
		 syainEntity.setSitenCode(syainDTO.getSitenCode());
		 syainEntity.setSitenName(syainDTO.getSitenName());
	//	 syainEntity.setKouzaKind(syainDTO.getKouzaKind());
		 syainEntity.setKouzaNum(syainDTO.getKouzaNum());
	    	
		 syainEntity.setMeigiName(syainDTO.getMeigiName());
		 syainEntity.setItOs(syainDTO.getItOs());
		 syainEntity.setItBikou(syainDTO.getItBikou());
	    	
	    	return syainEntity;
	    }

   

}