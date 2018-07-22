package info.signaltrade.ws.statws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StatWs", targetNamespace = "http://signaltrade.info/ws/StatWs", wsdlLocation = "http://signaltrade.info/ws/statws.php?wsdl")
public class StatWsService
    extends Service
{

    private final static URL STATWS_WSDL_LOCATION;
    private final static WebServiceException STATWS_EXCEPTION;
    private final static QName STATWS_QNAME = new QName("http://signaltrade.info/ws/StatWs", "StatWs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://signaltrade.info/ws/statws.php?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STATWS_WSDL_LOCATION = url;
        STATWS_EXCEPTION = e;
    }

    public StatWsService() {
        super(__getWsdlLocation(), STATWS_QNAME);
    }

    public StatWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STATWS_QNAME, features);
    }

    public StatWsService(URL wsdlLocation) {
        super(wsdlLocation, STATWS_QNAME);
    }

    public StatWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STATWS_QNAME, features);
    }

    public StatWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StatWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StatWs
     */
    @WebEndpoint(name = "StatWsSOAP")
    public StatWs getStatWsSOAP() {
        return super.getPort(new QName("http://signaltrade.info/ws/StatWs", "StatWsSOAP"), StatWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StatWs
     */
    @WebEndpoint(name = "StatWsSOAP")
    public StatWs getStatWsSOAP(WebServiceFeature... features) {
        return super.getPort(new QName("http://signaltrade.info/ws/StatWs", "StatWsSOAP"), StatWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STATWS_EXCEPTION!= null) {
            throw STATWS_EXCEPTION;
        }
        return STATWS_WSDL_LOCATION;
    }

}