
package soapws.interf;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alquiler" type="{http://interf.soapws/}alquiler" minOccurs="0"/&gt;
 *         &lt;element name="id_vehiculo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="km_recorrido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="patente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sucursal" type="{http://interf.soapws/}sucursal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehiculo", propOrder = {
    "alquiler",
    "idVehiculo",
    "kmRecorrido",
    "patente",
    "stock",
    "sucursal"
})
public class Vehiculo {

    protected Alquiler alquiler;
    @XmlElement(name = "id_vehiculo")
    protected Long idVehiculo;
    @XmlElement(name = "km_recorrido")
    protected Double kmRecorrido;
    protected String patente;
    protected Integer stock;
    protected Sucursal sucursal;

    /**
     * Gets the value of the alquiler property.
     * 
     * @return
     *     possible object is
     *     {@link Alquiler }
     *     
     */
    public Alquiler getAlquiler() {
        return alquiler;
    }

    /**
     * Sets the value of the alquiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Alquiler }
     *     
     */
    public void setAlquiler(Alquiler value) {
        this.alquiler = value;
    }

    /**
     * Gets the value of the idVehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdVehiculo() {
        return idVehiculo;
    }

    /**
     * Sets the value of the idVehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdVehiculo(Long value) {
        this.idVehiculo = value;
    }

    /**
     * Gets the value of the kmRecorrido property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKmRecorrido() {
        return kmRecorrido;
    }

    /**
     * Sets the value of the kmRecorrido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKmRecorrido(Double value) {
        this.kmRecorrido = value;
    }

    /**
     * Gets the value of the patente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Sets the value of the patente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatente(String value) {
        this.patente = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStock(Integer value) {
        this.stock = value;
    }

    /**
     * Gets the value of the sucursal property.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Sets the value of the sucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setSucursal(Sucursal value) {
        this.sucursal = value;
    }

}
