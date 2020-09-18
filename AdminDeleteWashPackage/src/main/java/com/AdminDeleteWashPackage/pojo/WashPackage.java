package com.AdminDeleteWashPackage.pojo;

import org.springframework.data.annotation.Id;

public class WashPackage {
	
	
	private boolean packageDeleted;
	
	@Id
	private String packageID;
	private String packageName;
	private String packageDescription;
	private double packageCost;
	
	

	
	public boolean isPackageDeleted() {
		return packageDeleted;
	}
	public void setPackageDeleted(boolean packageDeleted) {
		this.packageDeleted = packageDeleted;
	}
	public String getPackageID() {
		return packageID;
	}
	public void setPackageID(String packageID) {
		this.packageID = packageID;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getPackageDescription() {
		return packageDescription;
	}
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	public double getPackageCost() {
		return packageCost;
	}
	public void setPackageCost(double packageCost) {
		this.packageCost = packageCost;
	}
	@Override
	public String toString() {
		return "Package [packageID=" + packageID + ", packageName=" + packageName + ", packageDescription="
				+ packageDescription + ", packageCost=" + packageCost + "]";
	}
	
	
	
	
	
	

}
