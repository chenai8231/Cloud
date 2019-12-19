package com.czf.hello.spring.cloud.web.admin.feign.server.hystrix;

import com.czf.hello.spring.cloud.web.admin.feign.server.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServerHystrix implements AdminService {

  @Override
  public String sayHi(String message) {
    return String.format("Hi your message is: %s but request bad",message);
  }
}
