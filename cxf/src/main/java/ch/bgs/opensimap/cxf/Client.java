package ch.bgs.opensimap.cxf;

import java.util.Iterator;

import javax.xml.namespace.QName;

import de.autinform.exchange.common.soap.server.notice.Fault;
import de.autinform.exchange.common.soap.server.notice.SoapServer;
import de.autinform.exchange.common.soap.server.notice.SoapServerService;
import net.java.dev.jaxb.array.LongArray;

public class Client {
	public static void main(String[] args) throws Exception {
		// Create the service client with its default wsdlurl
		SoapServerService helloServiceService = new SoapServerService();
		
		
		System.out.println("service: " + helloServiceService.getServiceName());
		System.out.println("wsdl location: " + helloServiceService.getWSDLDocumentLocation());
		//HelloWorldPortType helloService = helloServiceService.getHelloWorldPort();
		
		Iterator<QName> ports = helloServiceService.getPorts();
		while (ports.hasNext()) {
			QName qName = (QName) ports.next();
			System.out.println("qName: " + qName);
		}

		SoapServer soapServerPort = helloServiceService.getSoapServerPort();
		boolean authentication = soapServerPort.getAuthentication();
		System.out.println("authentication: " + authentication);

		//System.out.println(helloService.greetings(System.getProperty("user.name")));
		
		try {
			LongArray actualCantonNoticeList = soapServerPort.getActualCantonNoticeList();
			System.out.println("actualCantonNoticeList: " + actualCantonNoticeList);
		} catch (Fault e) {
			System.out.println("error: " + e.getMessage());
		}
		
	}
}
