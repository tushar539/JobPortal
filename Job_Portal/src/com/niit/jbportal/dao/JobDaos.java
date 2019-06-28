package com.niit.jbportal.dao;

import java.util.List;
import com.niit.jbportal.model.Job;

public interface JobDaos {
	
	public boolean addJob(Job job);
	public boolean deleteJob(int jobId);
	public List<Job> getAllJobs();
	public Job getJobByTitle(String jobTitle);
	public boolean applyForJob(String jobApplicant,int jobId);
	public List<Job> getJobByRecruiter(String jobRecruiter);
	public List<Job> getAppliedJobs(String jobApplicant);
}
