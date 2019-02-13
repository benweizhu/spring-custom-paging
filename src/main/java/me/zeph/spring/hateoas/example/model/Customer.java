package me.zeph.spring.hateoas.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.hateoas.ResourceSupport;

@AllArgsConstructor
@Data
public class Customer extends ResourceSupport {
  private String name;
}
