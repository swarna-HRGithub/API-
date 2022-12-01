package com.rmgyantrapojoLibrary;

public class POJO {
	String createdBy;
	String ProjectName;
	String status;
	int teamSize;
	
	public POJO(String createBy, String projectName, String status, int teamSize) {
		
		this.createdBy = createBy;
		ProjectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	/**
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createdBy;
	}
	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createdBy = createBy;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return ProjectName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the teamSize
	 */
	public int getTeamSize() {
		return teamSize;
	}
	/**
	 * @param teamSize the teamSize to set
	 */
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	

}
