/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.wavemake;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-12-13T09:07:13.161Z
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://www.parasoft.com/wsdl/calculator/", name = "ICalculator")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ICalculator {

    @WebMethod(action = "multiply")
    @WebResult(name = "multiplyResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", partName = "parameters")
    public MultiplyResponse multiply(
        @WebParam(partName = "parameters", name = "multiply", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        Multiply parameters
    );

    @WebMethod(action = "subtract")
    @WebResult(name = "subtractResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", partName = "parameters")
    public SubtractResponse subtract(
        @WebParam(partName = "parameters", name = "subtract", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        Subtract parameters
    );

    @WebMethod(action = "add")
    @WebResult(name = "addResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", partName = "parameters")
    public AddResponse add(
        @WebParam(partName = "parameters", name = "add", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        Add parameters
    );

    @WebMethod(action = "divide")
    @WebResult(name = "divideResponse", targetNamespace = "http://www.parasoft.com/wsdl/calculator/", partName = "parameters")
    public DivideResponse divide(
        @WebParam(partName = "parameters", name = "divide", targetNamespace = "http://www.parasoft.com/wsdl/calculator/")
        Divide parameters
    );
}
