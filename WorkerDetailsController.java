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
import com.java.support.JavaSupport.ServiceImpl.WorkerImpl;

@RestController
@RequestMapping(value = "/get/worker")
public class WorkerDetailsController {
	
	private static final Logger logger=LoggerFactory.getLogger(WorkerDetailsController.class);
	
	@Autowired(required = true)
	WorkerImpl workDetail;
	
	@GetMapping(value = "/details")
	public ResponseEntity<List<EmployeeModel>> getWorkerDetails() {
		logger.info("WorkerImpl entering >>>>");
		List<EmployeeModel> resp=workDetail.getWorkerDetails();
		return new ResponseEntity<List<EmployeeModel>>(resp,HttpStatus.OK);

	}

}
