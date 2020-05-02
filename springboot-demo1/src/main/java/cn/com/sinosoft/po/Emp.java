package cn.com.sinosoft.po;

import java.io.Serializable;
import java.util.Date;


public class Emp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4062634427305650899L;

	private Integer empNo = null;
	
	private String eName = null;
	
	private String job = null;
	
	private Date hireDate = null;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
}
