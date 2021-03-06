/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.test.wavem.controller;

import com.test.wavem.services.ServnameService;
import com.test.wavem.Add;
import com.test.wavem.AddResponse;
import com.test.wavem.Divide;
import com.test.wavem.DivideResponse;
import com.test.wavem.Multiply;
import com.test.wavem.MultiplyResponse;
import com.test.wavem.Subtract;
import com.test.wavem.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/servname")
public class ServnameController {

    @Autowired
    private ServnameService servnameservice;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@RequestBody Add parameters) {
        return servnameservice.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public DivideResponse divide(@RequestParam(value = "denominator", required = false) float denominator, @RequestParam(value = "numerator", required = false) float numerator) {
        Divide parameters = new Divide();
        parameters.setDenominator(denominator);
        parameters.setNumerator(numerator);
        return servnameservice.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MultiplyResponse multiply(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Multiply parameters = new Multiply();
        parameters.setX(x);
        parameters.setY(y);
        return servnameservice.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public SubtractResponse subtract(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Subtract parameters = new Subtract();
        parameters.setX(x);
        parameters.setY(y);
        return servnameservice.subtract(parameters);
    }
}
