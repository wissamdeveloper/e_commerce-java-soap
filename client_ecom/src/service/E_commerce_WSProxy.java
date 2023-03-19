package service;

public class E_commerce_WSProxy implements service.E_commerce_WS {
  private String _endpoint = null;
  private service.E_commerce_WS e_commerce_WS = null;
  
  public E_commerce_WSProxy() {
    _initE_commerce_WSProxy();
  }
  
  public E_commerce_WSProxy(String endpoint) {
    _endpoint = endpoint;
    _initE_commerce_WSProxy();
  }
  
  private void _initE_commerce_WSProxy() {
    try {
      e_commerce_WS = (new service.E_commerce_WSServiceLocator()).gete_commerce_WSPort();
      if (e_commerce_WS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)e_commerce_WS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)e_commerce_WS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (e_commerce_WS != null)
      ((javax.xml.rpc.Stub)e_commerce_WS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.E_commerce_WS getE_commerce_WS() {
    if (e_commerce_WS == null)
      _initE_commerce_WSProxy();
    return e_commerce_WS;
  }
  
  public void allproduct() throws java.rmi.RemoteException{
    if (e_commerce_WS == null)
      _initE_commerce_WSProxy();
    e_commerce_WS.allproduct();
  }
  
  public boolean connection(java.lang.String user, java.lang.String password) throws java.rmi.RemoteException{
    if (e_commerce_WS == null)
      _initE_commerce_WSProxy();
    return e_commerce_WS.connection(user, password);
  }
  
  public boolean commander(java.lang.String numcompte) throws java.rmi.RemoteException{
    if (e_commerce_WS == null)
      _initE_commerce_WSProxy();
    return e_commerce_WS.commander(numcompte);
  }
  
  
}