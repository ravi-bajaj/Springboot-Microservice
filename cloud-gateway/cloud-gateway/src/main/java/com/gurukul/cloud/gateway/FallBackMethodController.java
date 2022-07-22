package com.gurukul.cloud.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {



    @GetMapping("/studentServiceFallBack")
    public String studentServiceFallBackMethod(){

        return "Student-Service is taking Longer than expected." +
                " Please try again later";

    }


    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){

        return "Department-Service is taking Longer than expected." +
                " Please try again later";

    }

}
