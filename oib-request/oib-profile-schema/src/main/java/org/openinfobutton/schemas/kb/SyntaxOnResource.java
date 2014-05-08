/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.18 at 11:24:03 AM MDT 
//


package org.openinfobutton.schemas.kb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="valuePrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nonHl7CompliantName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valueSuffix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "syntaxOnResource")
public class SyntaxOnResource {

    @XmlAttribute
    protected String valuePrefix;
    @XmlAttribute(required = true)
    protected String nonHl7CompliantName;
    @XmlAttribute
    protected String valueSuffix;

    /**
     * Gets the value of the valuePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**
     * Sets the value of the valuePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
    }

    /**
     * Gets the value of the nonHl7CompliantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonHl7CompliantName() {
        return nonHl7CompliantName;
    }

    /**
     * Sets the value of the nonHl7CompliantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonHl7CompliantName(String value) {
        this.nonHl7CompliantName = value;
    }

    /**
     * Gets the value of the valueSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueSuffix() {
        return valueSuffix;
    }

    /**
     * Sets the value of the valueSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueSuffix(String value) {
        this.valueSuffix = value;
    }

}