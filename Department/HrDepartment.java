package com.greatlearning.Department;

//Creating Human Resource Department which is also extending Super Department

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill  today's worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
}
