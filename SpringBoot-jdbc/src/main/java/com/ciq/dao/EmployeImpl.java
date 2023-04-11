package com.ciq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ciq.model.Employee;

@Repository
public class EmployeImpl implements EmployDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public void save(Employee employee) {
		String s="insert into employees values(?,?,?,?)";
		Object []s1= {employee.getId(),employee.getName(),employee.getSal(),employee.getEmail()};
		System.out.println(s1);
		jdbcTemplate.update(s, s1);
 		
	}

	@Override
	public List<Employee> getEmployees() {
		return jdbcTemplate.query("select * from employees", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSal(rs.getString(3));
				e.setEmail(rs.getString(4));
			
				return e;
			} 
	});
	}

	@Override
	public int delete(int id) {
		String s="delete from employees where Eid=?";
		Object[]a= {id};
 int delete = jdbcTemplate.update(s, a) ;
return delete;
	}

	@Override
	public int update(Employee employee) {
		String s1="update employees set ename=?,esal=?,email=? where Eid=?";
		Object[]u= {employee.getName(),employee.getSal(),employee.getEmail(),employee.getId()};
		return jdbcTemplate.update(s1, u);
		}
	
 
	@Override 
	public Employee getbyid(int id) {
		String s="select * from employees where Eid=?";
		Object []s1= {id};
		return	 (Employee) jdbcTemplate.queryForObject(s,s1,new RowMapper<Employee>()	{

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e=new Employee();
				e.setId(rs.getInt(id));
				return e;
			}
			
		});
		}
	}


