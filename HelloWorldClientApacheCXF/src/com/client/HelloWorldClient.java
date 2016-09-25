package com.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.service.*;


public class HelloWorldClient {
	public static void main(String... args) throws ServiceException, RemoteException {
		HelloWorldWSService service = new HelloWorldWSService();
		HelloWorldWS helloWorld = service.getHelloWorldWSPort();
		System.out.println(helloWorld.sayHello());
	}
}
