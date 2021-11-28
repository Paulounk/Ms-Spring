package com.humanrosources.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanrosources.hrpayroll.entities.Payment;
import com.humanrosources.hrpayroll.entities.Worker;
import com.humanrosources.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
