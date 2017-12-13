/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.sample11.services.calculator1.controller;

import com.sample11.services.calculator1.services.Calculator1Service;
import com.sample11.services.calculator1.Add;
import com.sample11.services.calculator1.AddResponse;
import com.sample11.services.calculator1.Divide;
import com.sample11.services.calculator1.DivideResponse;
import com.sample11.services.calculator1.Multiply;
import com.sample11.services.calculator1.MultiplyResponse;
import com.sample11.services.calculator1.Subtract;
import com.sample11.services.calculator1.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/calculator1")
public class Calculator1Controller {

    @Autowired
    private Calculator1Service calculator1Service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@RequestBody Add parameters) {
        return calculator1Service.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public DivideResponse divide(@RequestParam(value = "denominator", required = false) float denominator, @RequestParam(value = "numerator", required = false) float numerator) {
        Divide parameters = new Divide();
        parameters.setDenominator(denominator);
        parameters.setNumerator(numerator);
        return calculator1Service.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MultiplyResponse multiply(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Multiply parameters = new Multiply();
        parameters.setX(x);
        parameters.setY(y);
        return calculator1Service.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public SubtractResponse subtract(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Subtract parameters = new Subtract();
        parameters.setX(x);
        parameters.setY(y);
        return calculator1Service.subtract(parameters);
    }
}
