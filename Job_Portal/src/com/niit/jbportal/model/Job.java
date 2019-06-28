package com.niit.jbportal.model;

public class Job {

	private int jobId;
	private String jobRecruiter;
	private String jobTitle;
	private String jobDetails;
	private String skillSet;
	private String location;
	private String jobApplicant;
	
	public Job(){
		
	}

	public Job(String jobRecruiter, String jobTitle, String jobDetails, String skillSet, String location) {

		this.jobRecruiter = jobRecruiter;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
		this.skillSet = skillSet;
		this.location = location;
	}


	public Job(String jobApplicant) {
		
		this.jobApplicant = jobApplicant;
	}

	public Job(int jobId, String jobRecruiter, String jobTitle, String jobDetails, String skillSet, String location) {
		
		this.jobId = jobId;
		this.jobRecruiter = jobRecruiter;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
		this.skillSet = skillSet;
		this.location = location;
	}

	
	public Job(int jobId, String jobTitle, String skillSet, String location, String jobApplicant) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.skillSet = skillSet;
		this.location = location;
		this.jobApplicant = jobApplicant;
	}

	public Job(int jobId, String jobRecruiter, String jobTitle, String jobDetails, String skillSet, String location,
			String jobApplicant) {
		this.jobId = jobId;
		this.jobRecruiter = jobRecruiter;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
		this.skillSet = skillSet;
		this.location = location;
		this.jobApplicant = jobApplicant;
	}


	public Job(String jobRecruiter, String jobTitle, String jobDetails, String skillSet, String location,
			String jobApplicant) {
		this.jobRecruiter = jobRecruiter;
		this.jobTitle = jobTitle;
		this.jobDetails = jobDetails;
		this.skillSet = skillSet;
		this.location = location;
		this.jobApplicant = jobApplicant;
	}


	public String getJobRecruiter() {
		return jobRecruiter;
	}


	public void setJobRecruiter(String jobRecruiter) {
		this.jobRecruiter = jobRecruiter;
	}


	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDetails() {
		return jobDetails;
	}

	public void setJobDetails(String jobDetails) {
		this.jobDetails = jobDetails;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getJobApplicant() {
		return jobApplicant;
	}

	public void setJobApplicant(String jobApplicant) {
		this.jobApplicant = jobApplicant;
	}
	
	
	
}
