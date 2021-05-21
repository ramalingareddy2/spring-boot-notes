package com.bootprofiles.beans;

// no source code
public class Agent {
	private int agentNo;
	private String agentName;
	private String mobileNo;
	private String emailAddress;

	public int getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(int agentNo) {
		this.agentNo = agentNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Agent [agentNo=" + agentNo + ", agentName=" + agentName + ", mobileNo=" + mobileNo + ", emailAddress="
				+ emailAddress + "]";
	}

}
