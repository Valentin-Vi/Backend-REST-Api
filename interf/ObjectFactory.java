
package soapws.interf;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soapws.interf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Punto1_QNAME = new QName("http://interf.soapws/", "punto1");
    private final static QName _Punto1Response_QNAME = new QName("http://interf.soapws/", "punto1Response");
    private final static QName _Punto2_QNAME = new QName("http://interf.soapws/", "punto2");
    private final static QName _Punto2Response_QNAME = new QName("http://interf.soapws/", "punto2Response");
    private final static QName _Punto3_QNAME = new QName("http://interf.soapws/", "punto3");
    private final static QName _Punto3Response_QNAME = new QName("http://interf.soapws/", "punto3Response");
    private final static QName _Punto4_QNAME = new QName("http://interf.soapws/", "punto4");
    private final static QName _Punto4Response_QNAME = new QName("http://interf.soapws/", "punto4Response");
    private final static QName _Punto5_QNAME = new QName("http://interf.soapws/", "punto5");
    private final static QName _Punto5Response_QNAME = new QName("http://interf.soapws/", "punto5Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soapws.interf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Punto1 }
     * 
     */
    public Punto1 createPunto1() {
        return new Punto1();
    }

    /**
     * Create an instance of {@link Punto1Response }
     * 
     */
    public Punto1Response createPunto1Response() {
        return new Punto1Response();
    }

    /**
     * Create an instance of {@link Punto2 }
     * 
     */
    public Punto2 createPunto2() {
        return new Punto2();
    }

    /**
     * Create an instance of {@link Punto2Response }
     * 
     */
    public Punto2Response createPunto2Response() {
        return new Punto2Response();
    }

    /**
     * Create an instance of {@link Punto3 }
     * 
     */
    public Punto3 createPunto3() {
        return new Punto3();
    }

    /**
     * Create an instance of {@link Punto3Response }
     * 
     */
    public Punto3Response createPunto3Response() {
        return new Punto3Response();
    }

    /**
     * Create an instance of {@link Punto4 }
     * 
     */
    public Punto4 createPunto4() {
        return new Punto4();
    }

    /**
     * Create an instance of {@link Punto4Response }
     * 
     */
    public Punto4Response createPunto4Response() {
        return new Punto4Response();
    }

    /**
     * Create an instance of {@link Punto5 }
     * 
     */
    public Punto5 createPunto5() {
        return new Punto5();
    }

    /**
     * Create an instance of {@link Punto5Response }
     * 
     */
    public Punto5Response createPunto5Response() {
        return new Punto5Response();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto1 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto1 }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto1")
    public JAXBElement<Punto1> createPunto1(Punto1 value) {
        return new JAXBElement<Punto1>(_Punto1_QNAME, Punto1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto1Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto1Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto1Response")
    public JAXBElement<Punto1Response> createPunto1Response(Punto1Response value) {
        return new JAXBElement<Punto1Response>(_Punto1Response_QNAME, Punto1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto2")
    public JAXBElement<Punto2> createPunto2(Punto2 value) {
        return new JAXBElement<Punto2>(_Punto2_QNAME, Punto2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto2Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto2Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto2Response")
    public JAXBElement<Punto2Response> createPunto2Response(Punto2Response value) {
        return new JAXBElement<Punto2Response>(_Punto2Response_QNAME, Punto2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto3 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto3 }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto3")
    public JAXBElement<Punto3> createPunto3(Punto3 value) {
        return new JAXBElement<Punto3>(_Punto3_QNAME, Punto3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto3Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto3Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto3Response")
    public JAXBElement<Punto3Response> createPunto3Response(Punto3Response value) {
        return new JAXBElement<Punto3Response>(_Punto3Response_QNAME, Punto3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto4 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto4 }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto4")
    public JAXBElement<Punto4> createPunto4(Punto4 value) {
        return new JAXBElement<Punto4>(_Punto4_QNAME, Punto4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto4Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto4Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto4Response")
    public JAXBElement<Punto4Response> createPunto4Response(Punto4Response value) {
        return new JAXBElement<Punto4Response>(_Punto4Response_QNAME, Punto4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto5 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto5 }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto5")
    public JAXBElement<Punto5> createPunto5(Punto5 value) {
        return new JAXBElement<Punto5>(_Punto5_QNAME, Punto5 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Punto5Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Punto5Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://interf.soapws/", name = "punto5Response")
    public JAXBElement<Punto5Response> createPunto5Response(Punto5Response value) {
        return new JAXBElement<Punto5Response>(_Punto5Response_QNAME, Punto5Response.class, null, value);
    }

}
