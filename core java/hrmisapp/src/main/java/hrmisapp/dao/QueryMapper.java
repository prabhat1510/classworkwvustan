package hrmisapp.dao;

public interface QueryMapper {
	public static final String GET_EMPLOYEE_BY_JOB_TITLE="select * from employee where jobtitle=?;";
	public static final String GET_ALL_EMPLOYEES="select * from employee;";
}
