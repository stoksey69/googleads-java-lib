
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that is created by the specified creative template.
 *           
 * 
 * <p>Java class for TemplateCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201408}Creative">
 *       &lt;sequence>
 *         &lt;element name="creativeTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isInterstitial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isNativeEligible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creativeTemplateVariableValues" type="{https://www.google.com/apis/ads/publisher/v201408}BaseCreativeTemplateVariableValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201408}LockedOrientation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateCreative", propOrder = {
    "creativeTemplateId",
    "isInterstitial",
    "isNativeEligible",
    "destinationUrl",
    "creativeTemplateVariableValues",
    "lockedOrientation"
})
public class TemplateCreative
    extends Creative
{

    protected Long creativeTemplateId;
    protected Boolean isInterstitial;
    protected Boolean isNativeEligible;
    protected String destinationUrl;
    protected List<BaseCreativeTemplateVariableValue> creativeTemplateVariableValues;
    @XmlSchemaType(name = "string")
    protected LockedOrientation lockedOrientation;

    /**
     * Gets the value of the creativeTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeTemplateId() {
        return creativeTemplateId;
    }

    /**
     * Sets the value of the creativeTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeTemplateId(Long value) {
        this.creativeTemplateId = value;
    }

    /**
     * Gets the value of the isInterstitial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInterstitial() {
        return isInterstitial;
    }

    /**
     * Sets the value of the isInterstitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInterstitial(Boolean value) {
        this.isInterstitial = value;
    }

    /**
     * Gets the value of the isNativeEligible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNativeEligible() {
        return isNativeEligible;
    }

    /**
     * Sets the value of the isNativeEligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNativeEligible(Boolean value) {
        this.isNativeEligible = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the creativeTemplateVariableValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativeTemplateVariableValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativeTemplateVariableValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseCreativeTemplateVariableValue }
     * 
     * 
     */
    public List<BaseCreativeTemplateVariableValue> getCreativeTemplateVariableValues() {
        if (creativeTemplateVariableValues == null) {
            creativeTemplateVariableValues = new ArrayList<BaseCreativeTemplateVariableValue>();
        }
        return this.creativeTemplateVariableValues;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

}
