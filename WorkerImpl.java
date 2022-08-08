package com.java.support.JavaSupport.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.java.support.JavaSupport.Model.EmployeeModel;
import com.java.support.JavaSupport.Service.Worker;

@Component
public class WorkerImpl implements Worker {

	private static final Logger logger = LoggerFactory.getLogger(WorkerImpl.class);

	public List<EmployeeModel> getWorkerDetails() {
		logger.info("getWorkerDetails entering >>>> ");
		List<EmployeeModel> response = new ArrayList<EmployeeModel>();
		EmployeeModel employee = new EmployeeModel();
		EmployeeModel employee1 = new EmployeeModel();
		String empId = "EMP12345";
		if (empId.equals("EMP12345")) {
			logger.info("Preparng emloye Details >>>>");

			employee.setId("EMP1234");
			employee.setName("Chinni Bukya");
			employee.setDepartment("IT");
			employee.setOrganization("S&P Global");
			employee.setAddres("Khammam");
			employee.setErrorCode("200");
			employee.setErrorMessage("Success");

			employee1.setId("EMP1234");
			employee1.setName("Tarun Sai");
			employee1.setDepartment("IT");
			employee1.setOrganization("S&P Global");
			employee1.setAddres("Khammam");
			employee.setErrorCode("200");
			employee.setErrorMessage("Success");

			logger.info("Worker Details Prepared >>>");

		} else {
			employee.setErrorCode("404");
			employee.setErrorMessage("Worker Details Not Found !...");

		}
		response.add(employee);
		response.add(employee1);
		logger.info("Returning Response >>>>");

		return response;
	}

}
