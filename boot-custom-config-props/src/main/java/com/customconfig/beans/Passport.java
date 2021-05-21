package com.customconfig.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "passport")
public class Passport {
	// @Value("${passport.passportNo}")
	private int passportNo;
	// @Value("${passport.passportHolderName}")
	private String passportHolderName;
	// @Value("${passport.dob}")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dob;
	// @Value("${passport.gender}")
	private String gender;
	// @Value("${passport.issuedDate}")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date issuedDate;
	// @Value("${passport.issuedAuthority}")
	private String issuedAuthority;
	// @Value("${passport.expiryDate}")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date expiryDate;

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}

	public String getPassportHolderName() {
		return passportHolderName;
	}

	public void setPassportHolderName(String passportHolderName) {
		this.passportHolderName = passportHolderName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getIssuedAuthority() {
		return issuedAuthority;
	}

	public void setIssuedAuthority(String issuedAuthority) {
		this.issuedAuthority = issuedAuthority;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", passportHolderName=" + passportHolderName + ", dob=" + dob
				+ ", gender=" + gender + ", issuedDate=" + issuedDate + ", issuedAuthority=" + issuedAuthority
				+ ", expiryDate=" + expiryDate + "]";
	}

}
