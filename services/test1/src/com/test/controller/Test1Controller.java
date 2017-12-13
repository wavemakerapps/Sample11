/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.test.controller;

import com.test.services.Test1Service;
import com.test.Add;
import com.test.AddResponse;
import com.test.Divide;
import com.test.DivideResponse;
import com.test.Multiply;
import com.test.MultiplyResponse;
import com.test.Subtract;
import com.test.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/test1")
public class Test1Controller {

    @Autowired
    private Test1Service test1Service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@RequestBody Add parameters) {
        return test1Service.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public DivideResponse divide(@RequestParam(value = "denominator", required = false) float denominator, @RequestParam(value = "numerator", required = false) float numerator) {
        Divide parameters = new Divide();
        parameters.setDenominator(denominator);
        parameters.setNumerator(numerator);
        return test1Service.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MultiplyResponse multiply(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Multiply parameters = new Multiply();
        parameters.setX(x);
        parameters.setY(y);
        return test1Service.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public SubtractResponse subtract(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Subtract parameters = new Subtract();
        parameters.setX(x);
        parameters.setY(y);
        return test1Service.subtract(parameters);
    }
}