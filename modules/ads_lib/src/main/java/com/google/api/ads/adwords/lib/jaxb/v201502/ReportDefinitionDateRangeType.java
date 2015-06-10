//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.10 at 09:15:07 AM PDT 
//


package com.google.api.ads.adwords.lib.jaxb.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinition.DateRangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinition.DateRangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODAY"/&gt;
 *     &lt;enumeration value="YESTERDAY"/&gt;
 *     &lt;enumeration value="LAST_7_DAYS"/&gt;
 *     &lt;enumeration value="LAST_WEEK"/&gt;
 *     &lt;enumeration value="LAST_BUSINESS_WEEK"/&gt;
 *     &lt;enumeration value="THIS_MONTH"/&gt;
 *     &lt;enumeration value="LAST_MONTH"/&gt;
 *     &lt;enumeration value="ALL_TIME"/&gt;
 *     &lt;enumeration value="CUSTOM_DATE"/&gt;
 *     &lt;enumeration value="LAST_14_DAYS"/&gt;
 *     &lt;enumeration value="LAST_30_DAYS"/&gt;
 *     &lt;enumeration value="THIS_WEEK_SUN_TODAY"/&gt;
 *     &lt;enumeration value="THIS_WEEK_MON_TODAY"/&gt;
 *     &lt;enumeration value="LAST_WEEK_SUN_SAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinition.DateRangeType")
@XmlEnum
public enum ReportDefinitionDateRangeType {

    TODAY,
    YESTERDAY,
    LAST_7_DAYS,
    LAST_WEEK,
    LAST_BUSINESS_WEEK,
    THIS_MONTH,
    LAST_MONTH,
    ALL_TIME,
    CUSTOM_DATE,
    LAST_14_DAYS,
    LAST_30_DAYS,
    THIS_WEEK_SUN_TODAY,
    THIS_WEEK_MON_TODAY,
    LAST_WEEK_SUN_SAT;

    public String value() {
        return name();
    }

    public static ReportDefinitionDateRangeType fromValue(String v) {
        return valueOf(v);
    }

}
