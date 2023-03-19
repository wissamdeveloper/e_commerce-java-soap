package service;

import javax.xml.ws.Endpoint;

public class serveurJWS {

	public static void main(String[] args) {
		String url="http://localhost:8585/";
		Endpoint.publish(url, new e_commerce_WS());
		System.out.println("jmlj");
	}

}
