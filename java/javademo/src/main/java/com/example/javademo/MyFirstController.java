package com.example.javademo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class MyFirstController {
	@RequestMapping (path="/add/{a}/{b}")
	//add function to add 2 numbers
	public String add(@PathVariable(value = "a")int a,
			@PathVariable(value = "b")int b)
	{
		return ("The addition of "+ a + " and " + b + " gives " + (a+b));
	}
	@RequestMapping (path="/sub/{a}/{b}")
	//sub function to subtract 2 numbers
	public String sub(@PathVariable(value = "a")int a,
			@PathVariable(value = "b")int b)
	{
		return ("The subtraction of "+ a + " and " + b + " gives " + (a-b));
	}
	@RequestMapping (path="/mul/{a}/{b}")
	//mul function to multiply 2 numbers
	public String mul(@PathVariable(value = "a")int a,
			@PathVariable(value = "b")int b)
	{
		return ("The multiplication of "+ a + " and " + b + " gives " + (a*b));
	}
	@RequestMapping (path="/div/{a}/{b}")
	//div function to divide 2 numbers
	public String div(@PathVariable(value = "a")int a,
			@PathVariable(value = "b")int b)
	{
		return ("The addition of "+ a + " and " + b + " gives " + (a/b));
	}
}