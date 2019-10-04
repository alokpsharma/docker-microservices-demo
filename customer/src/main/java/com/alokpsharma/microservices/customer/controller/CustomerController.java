package com.alokpsharma.microservices.customer.controller;

import java.util.logging.Logger;

import com.alokpsharma.microservices.customer.models.Customer;
import com.alokpsharma.microservices.customer.services.InventoryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alokpsharma.microservices.customer.repository.CustomerRepository;

import javax.validation.Valid;

/**
 * @author Alok Sharma
 *
 */
@RestController
public class CustomerController {
    protected Logger logger = Logger.getLogger(CustomerController.class
            .getName());
	
	
	@Autowired
	CustomerRepository customerRepository;

	
	@Autowired
    InventoryService inventoryService;

	@RequestMapping(value="/sample/", method= RequestMethod.GET, produces = "application/json")
	public String getSample(){
		System.out.println("Inside Customers");
		return "REST Service is Up";
	}

	@RequestMapping(value="/customers/", method= RequestMethod.GET, produces = "application/json")
	public Iterable<Customer> getAllCustomers(){
		System.out.println("Inside Customers");
		return customerRepository.findAll();
	}

	@RequestMapping(value="/customers/", method= RequestMethod.GET, produces = "application/json")
	public Customer getCustomerById(@RequestParam("_id") String id){
		return customerRepository.(id);
	}


	@RequestMapping(value="/customers/", method= RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Customer addCustomer(@Valid @RequestBody Customer customer){
		System.out.println(customer);
		System.out.println(customer.getFirstName());
		//Customer customer = (Customer) JSON.parse(customerString);
		return customerRepository.save(customer);
	}


//	@RequestMapping(value="/customers/", method= RequestMethod.PUT, produces = "application/json", consumes = "application/json")
//	public Customer updateCustomer(@Valid @RequestBody Customer customer, Ob){
//		System.out.println(customer);
//		System.out.println(customer.getFirstName());
//		return customerRepository.(customer);
//	}
//	@RequestMapping(value="/customers/{id}/orders", method= RequestMethod.GET, produces = "application/json")
//	public CustomerOrders getCustomerOrders(@PathVariable("id") String id){
////		//    System.out.println("Calling a load balanced Rest template");
////		//        return invoiceService.getInvoices(id);
////		CustomerOrders customerOrders= new CustomerOrders();
////		Customer customer = customerRepository.findOne(Long.parseLong(id));
////		customerOrders.setCustomer(customer);
////		logger.info("Calling feign client to get invoices"+id);
////		List<Invoice> invoiceList =  invoiceServiceClient.getInvoices(id);
////		customerOrders.setInvoiceList(invoiceList);
//		return null;
//	}
	




}
