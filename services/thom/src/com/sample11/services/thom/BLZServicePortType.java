/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.sample11.services.thom;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-12-13T09:28:17.473Z
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://thomas-bayer.com/blz/", name = "BLZServicePortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface BLZServicePortType {

    @WebMethod
    @Action(output = "http://thomas-bayer.com/blz/BLZService/getBankResponse")
    @WebResult(name = "getBankResponse", targetNamespace = "http://thomas-bayer.com/blz/", partName = "parameters")
    public GetBankResponseType getBank(
        @WebParam(partName = "parameters", name = "getBank", targetNamespace = "http://thomas-bayer.com/blz/")
        GetBankType parameters
    );
}