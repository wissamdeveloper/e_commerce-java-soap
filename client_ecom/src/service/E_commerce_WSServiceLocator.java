/**
 * E_commerce_WSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class E_commerce_WSServiceLocator extends org.apache.axis.client.Service implements service.E_commerce_WSService {

    public E_commerce_WSServiceLocator() {
    }


    public E_commerce_WSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public E_commerce_WSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for e_commerce_WSPort
    private java.lang.String e_commerce_WSPort_address = "http://localhost:8585/";

    public java.lang.String gete_commerce_WSPortAddress() {
        return e_commerce_WSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String e_commerce_WSPortWSDDServiceName = "e_commerce_WSPort";

    public java.lang.String gete_commerce_WSPortWSDDServiceName() {
        return e_commerce_WSPortWSDDServiceName;
    }

    public void sete_commerce_WSPortWSDDServiceName(java.lang.String name) {
        e_commerce_WSPortWSDDServiceName = name;
    }

    public service.E_commerce_WS gete_commerce_WSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(e_commerce_WSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gete_commerce_WSPort(endpoint);
    }

    public service.E_commerce_WS gete_commerce_WSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.E_commerce_WSPortBindingStub _stub = new service.E_commerce_WSPortBindingStub(portAddress, this);
            _stub.setPortName(gete_commerce_WSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void sete_commerce_WSPortEndpointAddress(java.lang.String address) {
        e_commerce_WSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.E_commerce_WS.class.isAssignableFrom(serviceEndpointInterface)) {
                service.E_commerce_WSPortBindingStub _stub = new service.E_commerce_WSPortBindingStub(new java.net.URL(e_commerce_WSPort_address), this);
                _stub.setPortName(gete_commerce_WSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("e_commerce_WSPort".equals(inputPortName)) {
            return gete_commerce_WSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service/", "e_commerce_WSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service/", "e_commerce_WSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("e_commerce_WSPort".equals(portName)) {
            sete_commerce_WSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
