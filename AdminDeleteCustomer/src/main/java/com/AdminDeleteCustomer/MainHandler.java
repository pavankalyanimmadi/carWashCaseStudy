package com.AdminDeleteCustomer;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.AdminDeleteCustomer.pojo.Customer;

public class MainHandler extends SpringBootRequestHandler<Customer, Customer> {

}
