package me.zeph.spring.hateoas.example.controller;

import me.zeph.spring.hateoas.example.model.Customer;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
public class CustomerController {
  @GetMapping(value = "/customer")
  public Customer getCustomer() {
    Customer customer = new Customer("Benwei");
    Link next = linkTo(methodOn(CustomerController.class).getCustomer()).withRel("next");
    Link previes = linkTo(methodOn(CustomerController.class).getCustomer()).withRel("previes");
    customer.add(next);
    customer.add(previes);
    return customer;
  }
}
