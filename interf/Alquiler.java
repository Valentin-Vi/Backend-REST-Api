
package soapws.interf;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alquiler complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alquiler"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://interf.soapws/}cliente" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://interf.soapws/}sucursal" minOccurs="0"/&gt;
 *         &lt;element name="fecha_creacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecha_devolucion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fecha_estimada_devolucion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id_alquiler" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="origen" type="{http://interf.soapws/}sucursal" minOccurs="0"/&gt;
 *         &lt;element name="vehiculo" type="{http://interf.soapws/}vehiculo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alquiler", propOrder = {
    "cliente",
    "destino",
    "fechaCreacion",
    "fechaDevolucion",
    "fechaEstimadaDevolucion",
    "idAlquiler",
    "origen",
    "vehiculo"
})
public class Alquiler {

    protected Cliente cliente;
    protected Sucursal destino;
    @XmlElement(name = "fecha_creacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(name = "fecha_devolucion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDevolucion;
    @XmlElement(name = "fecha_estimada_devolucion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEstimadaDevolucion;
    @XmlElement(name = "id_alquiler")
    protected Long idAlquiler;
    protected Sucursal origen;
    protected Vehiculo vehiculo;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setDestino(Sucursal value) {
        this.destino = value;
    }

    /**
     * Gets the value of the fechaCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Sets the value of the fechaCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Gets the value of the fechaDevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Sets the value of the fechaDevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDevolucion(XMLGregorianCalendar value) {
        this.fechaDevolucion = value;
    }

    /**
     * Gets the value of the fechaEstimadaDevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEstimadaDevolucion() {
        return fechaEstimadaDevolucion;
    }

    /**
     * Sets the value of the fechaEstimadaDevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEstimadaDevolucion(XMLGregorianCalendar value) {
        this.fechaEstimadaDevolucion = value;
    }

    /**
     * Gets the value of the idAlquiler property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdAlquiler() {
        return idAlquiler;
    }

    /**
     * Sets the value of the idAlquiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdAlquiler(Long value) {
        this.idAlquiler = value;
    }

    /**
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link Sucursal }
     *     
     */
    public Sucursal getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sucursal }
     *     
     */
    public void setOrigen(Sucursal value) {
        this.origen = value;
    }

    /**
     * Gets the value of the vehiculo property.
     * 
     * @return
     *     possible object is
     *     {@link Vehiculo }
     *     
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Sets the value of the vehiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehiculo }
     *     
     */
    public void setVehiculo(Vehiculo value) {
        this.vehiculo = value;
    }

}
