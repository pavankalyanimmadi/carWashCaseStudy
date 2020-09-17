package com.example.customerauth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.customerauth.pojo.Car;
import com.example.customerauth.pojo.Card;
import com.example.customerauth.pojo.Customer;
import com.example.customerauth.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	private CustomerService cs;
	
	@PostMapping("/login")
	public Customer login(@RequestBody Customer customer) {
		
		return cs.login(customer);
		
		
		/*
		 * Customer temp=new Customer();
		 * 
		 * temp.setAddress("rafasd"); temp.setEmailId("abcdsfgs@gmail.com");
		 * temp.setMobileNumber("34252345234"); temp.setName("abc");
		 * temp.setPassword("abc");
		 * 
		 * 
		 * System.out.println(cs.signup(temp));
		 */
		
		
		
	}
	
	
	@PostMapping("/signup")
	public Customer signup(@RequestBody Customer cust) {
		return cs.signup(cust);
		
	}
	
	
	
	@PostMapping("/addingcardeatils")
    public Customer addfiledetails(@RequestParam("car") String car,@RequestParam("file") MultipartFile file) throws IOException {
       
        ObjectMapper objectMapper = new ObjectMapper();
        Car c = objectMapper.readValue(car, Car.class);
        System.out.println(c);
        return cs.addfiledetails(c, file);
    }
	
	
	@PostMapping("/deletecar")
	public Customer deleteCar(@RequestBody Car car)
	{
		System.out.println("in controller");
		System.out.println(car);
		return cs.deleteCar(car);
		
	}
	
	@PostMapping("updateprofile")
	public Customer updateProfile(@RequestBody Customer customer)
	{
		return cs.editProfile(customer);
		
	}
	
	
	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers()
	{
		return cs.getAllCUstomers();
		
	}
	
	@PostMapping("/deletecustomer")
	public Customer deleteCustomer(@RequestBody Customer customer)
	{
		
		return cs.deleteCustomer(customer);
	}
	
	
	

}
