package com.greatlearning.Department;

//creating Admin Department which is extending Super Department

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}
