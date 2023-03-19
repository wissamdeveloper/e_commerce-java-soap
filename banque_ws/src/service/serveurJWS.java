package service;

import javax.xml.ws.Endpoint;

public class serveurJWS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url="http://localhost:8585/";
		Endpoint.publish(url, new banque_WS());
		System.out.println(url);
	}

}
