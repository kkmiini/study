package com.kyh.system.dto;

import java.util.Date;

import com.kyh.system.entity.SyainEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class SyainDTO {
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

	private Integer syainId; 
    private String firstNameKanji; 
    private String lastNameKanji; 
    private Integer seibetu; 
    private Integer syozokuKaisya; 
    private Date nyuusyaDate; 
    private Date taisyaDate; 
    private Integer syokugyoKind; 
    private String kinyukikanCode; 
    private String kinyukikanName; 
    private String sitenCode; 
    private String sitenName; 
    private Integer kouzaKind; 
	private String kouzaNum; 
    private String meigiName; 
    private String itOs; 
    private String itBikou; 
    
    public static SyainDTO toSyainDTO(SyainEntity syainEntity) {
    	SyainDTO syainDTO = new SyainDTO();
    	syainDTO.setSyainId(syainEntity.getSyainId());
    	syainDTO.setFirstNameKanji(syainEntity.getFirstNameKanji());
    	syainDTO.setLastNameKanji(syainEntity.getLastNameKanji());
    	syainDTO.setSeibetu(syainEntity.getSeibetu());
    	syainDTO.setSyozokuKaisya(syainEntity.getSyozokuKaisya());
    	syainDTO.setNyuusyaDate(syainEntity.getNyuusyaDate());
    	syainDTO.setTaisyaDate(syainEntity.getTaisyaDate());
    	
    	syainDTO.setSyokugyoKind(syainEntity.getSyokugyoKind());
    	syainDTO.setKinyukikanCode(syainEntity.getKinyukikanCode());
    	syainDTO.setKinyukikanName(syainEntity.getKinyukikanName());
    	syainDTO.setSitenCode(syainEntity.getSitenCode());
    	syainDTO.setSitenName(syainEntity.getSitenName());
    	syainDTO.setKouzaKind(syainEntity.getKouzaKind());
    	syainDTO.setKouzaNum(syainEntity.getKouzaNum());
    	
    	syainDTO.setMeigiName(syainEntity.getMeigiName());
    	syainDTO.setItOs(syainEntity.getItOs());
    	syainDTO.setItBikou(syainEntity.getItBikou());
    	
    	return syainDTO;
    }

}
