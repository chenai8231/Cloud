package com.czf.hello.spring.cloud.web.admin.feign.server;

import com.czf.hello.spring.cloud.web.admin.feign.server.hystrix.AdminServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="hello-spring-cloud-service-admin",fallback = AdminServerHystrix.class)
public interface AdminService {

  @RequestMapping(value = "hi",method= RequestMethod.GET)
  public String sayHi(@RequestParam(value="message") String message);
}
