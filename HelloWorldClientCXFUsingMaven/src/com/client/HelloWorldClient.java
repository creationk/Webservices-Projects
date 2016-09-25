package com.client;

import com.service.*;

public class HelloWorldClient {
	public static void main(String... args) {
		HelloWorldWSService service = new HelloWorldWSService();
		HelloWorldWS helloWorld = service.getHelloWorldWSPort();
		System.out.println(helloWorld.sayHello());
	}
}
