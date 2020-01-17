package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	private String currenthouseNo;
	private String currentstreetName;
	private String	currentarea;
	private String currentlandMark;
	private String currenttaluka;
	private String currentcity;
	private String currentdistrict;
	private String currentstate;
	private String currentcountry;
	private String currentpincode;
	
	private String permanenthouseNo;
	private String permanentstreetName;
	private String	permanentarea;
	private String permanentlandMark;
	private String permanenttaluka;
	private String permanentcity;
	private String permanentdistrict;
	private String permanentstate;
	private String permanentcountry;
	private String permanentpincode;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCurrenthouseNo() {
		return currenthouseNo;
	}
	public void setCurrenthouseNo(String currenthouseNo) {
		this.currenthouseNo = currenthouseNo;
	}
	public String getCurrentstreetName() {
		return currentstreetName;
	}
	public void setCurrentstreetName(String currentstreetName) {
		this.currentstreetName = currentstreetName;
	}
	public String getCurrentarea() {
		return currentarea;
	}
	public void setCurrentarea(String currentarea) {
		this.currentarea = currentarea;
	}
	public String getCurrentlandMark() {
		return currentlandMark;
	}
	public void setCurrentlandMark(String currentlandMark) {
		this.currentlandMark = currentlandMark;
	}
	public String getCurrenttaluka() {
		return currenttaluka;
	}
	public void setCurrenttaluka(String currenttaluka) {
		this.currenttaluka = currenttaluka;
	}
	public String getCurrentcity() {
		return currentcity;
	}
	public void setCurrentcity(String currentcity) {
		this.currentcity = currentcity;
	}
	public String getCurrentdistrict() {
		return currentdistrict;
	}
	public void setCurrentdistrict(String currentdistrict) {
		this.currentdistrict = currentdistrict;
	}
	public String getCurrentstate() {
		return currentstate;
	}
	public void setCurrentstate(String currentstate) {
		this.currentstate = currentstate;
	}
	public String getCurrentcountry() {
		return currentcountry;
	}
	public void setCurrentcountry(String currentcountry) {
		this.currentcountry = currentcountry;
	}
	public String getCurrentpincode() {
		return currentpincode;
	}
	public void setCurrentpincode(String currentpincode) {
		this.currentpincode = currentpincode;
	}
	public String getPermanenthouseNo() {
		return permanenthouseNo;
	}
	public void setPermanenthouseNo(String permanenthouseNo) {
		this.permanenthouseNo = permanenthouseNo;
	}
	public String getPermanentstreetName() {
		return permanentstreetName;
	}
	public void setPermanentstreetName(String permanentstreetName) {
		this.permanentstreetName = permanentstreetName;
	}
	public String getPermanentarea() {
		return permanentarea;
	}
	public void setPermanentarea(String permanentarea) {
		this.permanentarea = permanentarea;
	}
	public String getPermanentlandMark() {
		return permanentlandMark;
	}
	public void setPermanentlandMark(String permanentlandMark) {
		this.permanentlandMark = permanentlandMark;
	}
	public String getPermanenttaluka() {
		return permanenttaluka;
	}
	public void setPermanenttaluka(String permanenttaluka) {
		this.permanenttaluka = permanenttaluka;
	}
	public String getPermanentcity() {
		return permanentcity;
	}
	public void setPermanentcity(String permanentcity) {
		this.permanentcity = permanentcity;
	}
	public String getPermanentdistrict() {
		return permanentdistrict;
	}
	public void setPermanentdistrict(String permanentdistrict) {
		this.permanentdistrict = permanentdistrict;
	}
	public String getPermanentstate() {
		return permanentstate;
	}
	public void setPermanentstate(String permanentstate) {
		this.permanentstate = permanentstate;
	}
	public String getPermanentcountry() {
		return permanentcountry;
	}
	public void setPermanentcountry(String permanentcountry) {
		this.permanentcountry = permanentcountry;
	}
	public String getPermanentpincode() {
		return permanentpincode;
	}
	public void setPermanentpincode(String permanentpincode) {
		this.permanentpincode = permanentpincode;
	}
	
	
	
}
