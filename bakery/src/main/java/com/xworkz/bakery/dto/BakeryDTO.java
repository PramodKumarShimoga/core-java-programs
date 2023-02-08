package com.xworkz.bakery.dto;

public class BakeryDTO {


	private String bakeryName;
	private String ownerName;
	private String wifeName;
	private String married;
	private String famouseFor;
	private int Since;
	public BakeryDTO() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}
	public BakeryDTO(String bakeryName, String ownerName, String wifeName, String married, String famouseFor,
			int since) {
		super();
		this.bakeryName = bakeryName;
		this.ownerName = ownerName;
		this.wifeName = wifeName;
		this.married = married;
		this.famouseFor = famouseFor;
		Since = since;
	}
	@Override
	public String toString() {
		return "BakeryDTO [bakeryName=" + bakeryName + ", ownerName=" + ownerName + ", wifeName=" + wifeName
				+ ", married=" + married + ", famouseFor=" + famouseFor + ", Since=" + Since + "]";
	}
	public String getBakeryName() {
		return bakeryName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getWifeName() {
		return wifeName;
	}
	public String getMarried() {
		return married;
	}
	public String getFamouseFor() {
		return famouseFor;
	}
	public int getSince() {
		return Since;
	}
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	public void setMarried(String married) {
		this.married = married;
	}
	public void setFamouseFor(String famouseFor) {
		this.famouseFor = famouseFor;
	}
	public void setSince(int since) {
		Since = since;
	}



}
