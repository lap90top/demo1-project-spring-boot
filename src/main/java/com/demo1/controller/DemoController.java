package com.demo1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // syntax of signature method: access_specifier return_type methodName (Optional parameter or input parameter){code}


    // End Point:to run the program or code ,and we will write End point(@RequestMapping) above that of method
    // which we want to access or run without this our program will not run

    // END POINT 1
    @RequestMapping ("/welcome")
    public void Demo (){

        System.out.println("Hello ,Welcome to Spring Boot");  // its result will show in console
        // after hitting the url (localhost:8081/welcome) on Google _chrome web browser
    }

    // END POINT 2
    @RequestMapping ("/welcome_screen")
    public String Demo_screen () {

        return "Hello ,Welcome to Spring Boot";

    }

    // END POINT 3
    @RequestMapping ("/age")
    public int age () {

        return  33;

    }


    // END POINT 4
    @RequestMapping ("/price")
    public double price () {

        return  404.50;

    }



}
