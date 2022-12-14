package com.finzly.LoanApplication.Controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.finzly.LoanApplication.Entity.LoanApplicationEntity;
import com.finzly.LoanApplication.Entity.PaymentScheduleEntity;
import com.finzly.LoanApplication.Service.LoanApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.MethodArgumentBuilder;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoanApplicationController {
	@Autowired
	private LoanApplicationService service;
	
	@PostMapping("/applyLoan")
	public void applyLoan(@RequestBody @Valid LoanApplicationEntity obj) throws SQLException,NullPointerException {
		service.applyLoan(obj);
	}
	@GetMapping("/paidStatus/{name}")
	public List<PaymentScheduleEntity> paidStatus(@PathVariable String name) throws SQLException,NullPointerException {
		System.out.println(name);
		return service.paidStatus(name);
	}
	@GetMapping("/paid/{name}")
	public List<PaymentScheduleEntity> paid(@PathVariable String name) throws SQLException,NullPointerException{
//		System.out.println(getPaymentStatus());
		return service.paid(name);
	}
	
	@GetMapping("/displayLoan")
	public List<LoanApplicationEntity> displayLoan()  throws SQLException,NullPointerException  {
		return service.displayLoan();
	}
	
	@GetMapping("/displayPaymentSchedule")
	public List<PaymentScheduleEntity> displayPaymentSchedule() throws SQLException,NullPointerException{
		return service.displayPaymentSchedule();
	}
	
}
