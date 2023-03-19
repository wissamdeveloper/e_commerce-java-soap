package service;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
@WebService(name="banque_WS")
public class banque_WS {
	@WebMethod(operationName="verifInfoComp")
	public boolean verifInfoComp(@WebParam(name="num")String num) {
		return false;
	}
	@WebMethod(operationName="verifSoldComp")
	public boolean verifSoldComp(@WebParam(name="pay")int pay) {
		//at end send confirmation
		return false;
	}
	
}
