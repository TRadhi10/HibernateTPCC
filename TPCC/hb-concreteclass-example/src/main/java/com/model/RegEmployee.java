package com.model;

	import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

	@Entity
	@Table(name="regemployee107")
	@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id")),
		@AttributeOverride(name="name",column=@Column(name="name")),
	})
	public class RegEmployee extends Employee{
		
		float salary;
		String dept;
		
		public RegEmployee(float salary, String dept, String name) {
			super(name);
			this.salary = salary;
			this.dept = dept;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept =dept;
		}
		
		
		}


