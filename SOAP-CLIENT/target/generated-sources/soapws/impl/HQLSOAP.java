
package soapws.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "HQLSOAP", targetNamespace = "http://impl.soapws/", wsdlLocation = "http://localhost:8080/SOAP_war_exploded/hql?wsdl")
public class HQLSOAP
    extends Service
{

    private final static URL HQLSOAP_WSDL_LOCATION;
    private final static WebServiceException HQLSOAP_EXCEPTION;
    private final static QName HQLSOAP_QNAME = new QName("http://impl.soapws/", "HQLSOAP");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/SOAP_war_exploded/hql?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HQLSOAP_WSDL_LOCATION = url;
        HQLSOAP_EXCEPTION = e;
    }

    public HQLSOAP() {
        super(__getWsdlLocation(), HQLSOAP_QNAME);
    }

    public HQLSOAP(WebServiceFeature... features) {
        super(__getWsdlLocation(), HQLSOAP_QNAME, features);
    }

    public HQLSOAP(URL wsdlLocation) {
        super(wsdlLocation, HQLSOAP_QNAME);
    }

    public HQLSOAP(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HQLSOAP_QNAME, features);
    }

    public HQLSOAP(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HQLSOAP(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HQLPORT
     */
    @WebEndpoint(name = "HQLSOAPImplPort")
    public HQLPORT getHQLSOAPImplPort() {
        return super.getPort(new QName("http://impl.soapws/", "HQLSOAPImplPort"), HQLPORT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HQLPORT
     */
    @WebEndpoint(name = "HQLSOAPImplPort")
    public HQLPORT getHQLSOAPImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.soapws/", "HQLSOAPImplPort"), HQLPORT.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HQLSOAP_EXCEPTION!= null) {
            throw HQLSOAP_EXCEPTION;
        }
        return HQLSOAP_WSDL_LOCATION;
    }

}
