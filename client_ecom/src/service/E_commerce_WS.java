/**
 * E_commerce_WS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface E_commerce_WS extends java.rmi.Remote {
    public void allproduct() throws java.rmi.RemoteException;
    public boolean connection(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException;
    public boolean commander(java.lang.String numcompte) throws java.rmi.RemoteException;
}
