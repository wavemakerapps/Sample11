/**This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

package com.test.wavem.services;
import com.test.wavem.*;
import java.util.List;

import com.wavemaker.runtime.soap.util.SoapSettingsResolver;
import com.wavemaker.runtime.soap.SoapServiceSettings;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.xml.ws.BindingProvider;



@Service
public class ServnameService{

    @Autowired
    @Qualifier("servnameSoapServiceSettings")
    private SoapServiceSettings soapServiceSettings;


	public MultiplyResponse multiply(  com.test.wavem.Multiply parameters )
	          {
 	    Calculator calculator = new Calculator();
 ICalculator icalculator = calculator.getICalculator();
 SoapSettingsResolver.setBindingProperties((BindingProvider)icalculator, soapServiceSettings);
 return icalculator.multiply(parameters );
	}

	public SubtractResponse subtract(  com.test.wavem.Subtract parameters )
	          {
 	    Calculator calculator = new Calculator();
 ICalculator icalculator = calculator.getICalculator();
 SoapSettingsResolver.setBindingProperties((BindingProvider)icalculator, soapServiceSettings);
 return icalculator.subtract(parameters );
	}

	public AddResponse add(  com.test.wavem.Add parameters )
	          {
 	    Calculator calculator = new Calculator();
 ICalculator icalculator = calculator.getICalculator();
 SoapSettingsResolver.setBindingProperties((BindingProvider)icalculator, soapServiceSettings);
 return icalculator.add(parameters );
	}

	public DivideResponse divide(  com.test.wavem.Divide parameters )
	          {
 	    Calculator calculator = new Calculator();
 ICalculator icalculator = calculator.getICalculator();
 SoapSettingsResolver.setBindingProperties((BindingProvider)icalculator, soapServiceSettings);
 return icalculator.divide(parameters );
	}
}
