package me.zeph.spring.hateoas.example.controller;

import me.zeph.spring.hateoas.example.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class CustomerController {
  @GetMapping(value = "/customer")
  public Customer getCustomer() {
    Customer customer = new Customer("Benwei");
    customer.add(linkTo(methodOn(CustomerController.class).getCustomer()).withRel("next"));
    return customer;
  }
}
