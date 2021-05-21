package com.bootprofiles.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "parcel")
public class Parcel {
	private int parcelNo;
	private String sourceAddress;
	private String destinationAddress;
	@Autowired
	private Agent agent;

	public int getParcelNo() {
		return parcelNo;
	}

	public void setParcelNo(int parcelNo) {
		this.parcelNo = parcelNo;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "Parcel [parcelNo=" + parcelNo + ", sourceAddress=" + sourceAddress + ", destinationAddress="
				+ destinationAddress + ", agent=" + agent + "]";
	}

}
