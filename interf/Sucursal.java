
package soapws.interf;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sucursal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sucursal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alquilerDestino" type="{http://interf.soapws/}alquiler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="alquilerList" type="{http://interf.soapws/}alquiler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_sucursal" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehiculoList" type="{http://interf.soapws/}vehiculo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sucursal", propOrder = {
    "alquilerDestino",
    "alquilerList",
    "direccion",
    "idSucursal",
    "nombre",
    "vehiculoList"
})
public class Sucursal {

    @XmlElement(nillable = true)
    protected List<Alquiler> alquilerDestino;
    @XmlElement(nillable = true)
    protected List<Alquiler> alquilerList;
    protected String direccion;
    @XmlElement(name = "id_sucursal")
    protected Long idSucursal;
    protected String nombre;
    @XmlElement(nillable = true)
    protected List<Vehiculo> vehiculoList;

    /**
     * Gets the value of the alquilerDestino property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alquilerDestino property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlquilerDestino().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alquiler }
     * 
     * 
     */
    public List<Alquiler> getAlquilerDestino() {
        if (alquilerDestino == null) {
            alquilerDestino = new ArrayList<Alquiler>();
        }
        return this.alquilerDestino;
    }

    /**
     * Gets the value of the alquilerList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alquilerList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlquilerList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Alquiler }
     * 
     * 
     */
    public List<Alquiler> getAlquilerList() {
        if (alquilerList == null) {
            alquilerList = new ArrayList<Alquiler>();
        }
        return this.alquilerList;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the idSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdSucursal() {
        return idSucursal;
    }

    /**
     * Sets the value of the idSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdSucursal(Long value) {
        this.idSucursal = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the vehiculoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehiculoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiculoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehiculo }
     * 
     * 
     */
    public List<Vehiculo> getVehiculoList() {
        if (vehiculoList == null) {
            vehiculoList = new ArrayList<Vehiculo>();
        }
        return this.vehiculoList;
    }

}
