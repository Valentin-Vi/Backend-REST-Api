
package soapws.impl;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;
import soapws.interf.Alquiler;
import soapws.interf.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "AlquilerPORT", targetNamespace = "http://interf.soapws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlquilerPORT {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAlquiler", targetNamespace = "http://interf.soapws/", className = "soapws.interf.CreateAlquiler")
    @ResponseWrapper(localName = "createAlquilerResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.CreateAlquilerResponse")
    @Action(input = "http://interf.soapws/AlquilerPORT/createAlquilerRequest", output = "http://interf.soapws/AlquilerPORT/createAlquilerResponse")
    public Integer createAlquiler(
        @WebParam(name = "arg0", targetNamespace = "")
        Alquiler arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns soapws.interf.Alquiler
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAlquilerById", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAlquilerById")
    @ResponseWrapper(localName = "readAlquilerByIdResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAlquilerByIdResponse")
    @Action(input = "http://interf.soapws/AlquilerPORT/readAlquilerByIdRequest", output = "http://interf.soapws/AlquilerPORT/readAlquilerByIdResponse")
    public Alquiler readAlquilerById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<soapws.interf.Alquiler>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readAllAlquiler", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAllAlquiler")
    @ResponseWrapper(localName = "readAllAlquilerResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.ReadAllAlquilerResponse")
    @Action(input = "http://interf.soapws/AlquilerPORT/readAllAlquilerRequest", output = "http://interf.soapws/AlquilerPORT/readAllAlquilerResponse")
    public List<Alquiler> readAllAlquiler();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateAlquiler", targetNamespace = "http://interf.soapws/", className = "soapws.interf.UpdateAlquiler")
    @ResponseWrapper(localName = "updateAlquilerResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.UpdateAlquilerResponse")
    @Action(input = "http://interf.soapws/AlquilerPORT/updateAlquilerRequest", output = "http://interf.soapws/AlquilerPORT/updateAlquilerResponse")
    public Integer updateAlquiler(
        @WebParam(name = "arg0", targetNamespace = "")
        Alquiler arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteAlquiler", targetNamespace = "http://interf.soapws/", className = "soapws.interf.DeleteAlquiler")
    @ResponseWrapper(localName = "deleteAlquilerResponse", targetNamespace = "http://interf.soapws/", className = "soapws.interf.DeleteAlquilerResponse")
    @Action(input = "http://interf.soapws/AlquilerPORT/deleteAlquilerRequest", output = "http://interf.soapws/AlquilerPORT/deleteAlquilerResponse")
    public Integer deleteAlquiler(
        @WebParam(name = "arg0", targetNamespace = "")
        Alquiler arg0);

}
