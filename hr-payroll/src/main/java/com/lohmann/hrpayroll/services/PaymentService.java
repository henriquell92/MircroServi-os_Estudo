package com.lohmann.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lohmann.hrpayroll.entities.Payment;
import com.lohmann.hrpayroll.entities.Worker;
import com.lohmann.hrpayroll.feingclientes.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient workerFeignCliente;

	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignCliente.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
