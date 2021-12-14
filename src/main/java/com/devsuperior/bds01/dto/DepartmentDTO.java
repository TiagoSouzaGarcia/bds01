package com.devsuperior.bds01.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devsuperior.bds01.entities.Department;
import com.devsuperior.bds01.entities.Employee;

public class DepartmentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Long id;
	public String name;
	
	public List<Employee> employees = new ArrayList<>();
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}
	
	/*
	 * public DepartmentDTO(Department entity, Set<Employee> employess) {
	 * this(entity); employess.forEach(emp -> this.employees.add(new
	 * EmployeeDTO(emp))); }
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
