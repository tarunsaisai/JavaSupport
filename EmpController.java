/**
 * 
 */
package com.java.support.JavaSupport.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.support.JavaSupport.Model.EmployeeModel;
import com.java.support.JavaSupport.ServiceImpl.EmployeeImpl;

/**
 * @author TARUN BADDULA
 *
 */
@RestController
@RequestMapping(value = "/get/emloyee")
public class EmpController {
	
	private static final Logger logger=LoggerFactory.getLogger(EmpController.class);

	@Autowired(required = true)
	EmployeeImpl employee;

	@GetMapping(value = "/details/EMP1234")
	public ResponseEntity<List<EmployeeModel>> getEmpDetails() {
		List<EmployeeModel> resp=employee.getEmpDetails();
		logger.info("EmployeeImpl entering >>>>");
		return new ResponseEntity<List<EmployeeModel>>(resp,HttpStatus.OK);

	}
	
	@GetMapping(value = "/details")
	public ResponseEntity<List<EmployeeModel>> getEmployeeDetails() {
		List<EmployeeModel> resp=employee.getEmplyeeDetails();
		logger.info("EmployeeImpl entering >>>>");
		return new ResponseEntity<List<EmployeeModel>>(resp,HttpStatus.OK);

	}
	
	@GetMapping(value = "/tarun")
	public ResponseEntity<List<EmployeeModel>> sam() {
		List<EmployeeModel> resp=employee.sam();
		logger.info("EmployeeImpl entering >>>>");
		return new ResponseEntity<List<EmployeeModel>>(resp,HttpStatus.OK);

	}
	@GetMapping(value = "/naga/sai")
	public ResponseEntity<List<EmployeeModel>> king() {
		List<EmployeeModel> resp=employee.king();
		logger.info("EmployeeImpl entering >>>>");
		return new ResponseEntity<List<EmployeeModel>>(resp,HttpStatus.OK);

	}
	

}
