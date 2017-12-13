/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.test.wavem;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numerator",
    "denominator"
})
@XmlRootElement(name = "divide")
public class Divide {

    protected float numerator;
    protected float denominator;

    /**
     * Gets the value of the numerator property.
     * 
     */
    public float getNumerator() {
        return numerator;
    }

    /**
     * Sets the value of the numerator property.
     * 
     */
    public void setNumerator(float value) {
        this.numerator = value;
    }

    /**
     * Gets the value of the denominator property.
     * 
     */
    public float getDenominator() {
        return denominator;
    }

    /**
     * Sets the value of the denominator property.
     * 
     */
    public void setDenominator(float value) {
        this.denominator = value;
    }

}
