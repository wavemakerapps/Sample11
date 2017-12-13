/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/

package com.sample11.services.calculator1;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2017-12-13T08:52:32.852Z
 * Generated source version: 2.7.11
 * 
 */
public final class ICalculator_ICalculator_Client {

    private static final QName SERVICE_NAME = new QName("http://www.parasoft.com/wsdl/calculator/", "Calculator");

    private ICalculator_ICalculator_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Calculator.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Calculator ss = new Calculator(wsdlURL, SERVICE_NAME);
        ICalculator port = ss.getICalculator();  
        
        {
        System.out.println("Invoking multiply...");
        com.sample11.services.calculator1.Multiply _multiply_parameters = null;
        com.sample11.services.calculator1.MultiplyResponse _multiply__return = port.multiply(_multiply_parameters);
        System.out.println("multiply.result=" + _multiply__return);


        }
        {
        System.out.println("Invoking subtract...");
        com.sample11.services.calculator1.Subtract _subtract_parameters = null;
        com.sample11.services.calculator1.SubtractResponse _subtract__return = port.subtract(_subtract_parameters);
        System.out.println("subtract.result=" + _subtract__return);


        }
        {
        System.out.println("Invoking add...");
        com.sample11.services.calculator1.Add _add_parameters = null;
        com.sample11.services.calculator1.AddResponse _add__return = port.add(_add_parameters);
        System.out.println("add.result=" + _add__return);


        }
        {
        System.out.println("Invoking divide...");
        com.sample11.services.calculator1.Divide _divide_parameters = null;
        com.sample11.services.calculator1.DivideResponse _divide__return = port.divide(_divide_parameters);
        System.out.println("divide.result=" + _divide__return);


        }

        System.exit(0);
    }

}
