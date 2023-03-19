package service;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(name="e_commerce_WS")
public class e_commerce_WS {
	@WebMethod(operationName="connection")
	public boolean connection(@WebParam(name="user")String user,@WebParam(name="password")String password) {
		return false;
	}
	@WebMethod(operationName="allproduct")
	public void allproduct() {
	
	}
	@WebMethod(operationName="commander")
	public boolean commander(@WebParam(name="numcompte")String numcompte) {
		return false;
	}

}
