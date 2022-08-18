package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class config {

    @Bean
    public Tea getbag()
    {
        return new Bag();
    }


    @Bean(name={"emp"})
    public Emp getEmp()
    {
        Emp emp=new Emp(getTea());
        return emp;
    }

}
