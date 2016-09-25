package com.service;

public class HelloWorldWSProxy implements com.service.HelloWorldWS {
  private String _endpoint = null;
  private com.service.HelloWorldWS helloWorldWS = null;
  
  public HelloWorldWSProxy() {
    _initHelloWorldWSProxy();
  }
  
  public HelloWorldWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldWSProxy();
  }
  
  private void _initHelloWorldWSProxy() {
    try {
      helloWorldWS = (new com.service.HelloWorldWSServiceLocator()).getHelloWorldWSPort();
      if (helloWorldWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldWS != null)
      ((javax.xml.rpc.Stub)helloWorldWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.HelloWorldWS getHelloWorldWS() {
    if (helloWorldWS == null)
      _initHelloWorldWSProxy();
    return helloWorldWS;
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (helloWorldWS == null)
      _initHelloWorldWSProxy();
    return helloWorldWS.sayHello();
  }
  
  
}