package com.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.service.*;


public class HelloWorldClient {
	public static void main(String... args) throws ServiceException, RemoteException {
		HelloWorldWSServiceLocator service = new HelloWorldWSServiceLocator();
		HelloWorldWS helloWorld = service.getHelloWorldWSPort();
		System.out.println(helloWorld.sayHello());
	}
}
