/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package a.controller;

import a.services.CalculatorService;
import a.Add;
import a.AddResponse;
import a.Divide;
import a.DivideResponse;
import a.Multiply;
import a.MultiplyResponse;
import a.Subtract;
import a.SubtractResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public AddResponse add(@RequestBody Add parameters) {
        return calculatorService.add(parameters);
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public DivideResponse divide(@RequestParam(value = "denominator", required = false) float denominator, @RequestParam(value = "numerator", required = false) float numerator) {
        Divide parameters = new Divide();
        parameters.setDenominator(denominator);
        parameters.setNumerator(numerator);
        return calculatorService.divide(parameters);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public MultiplyResponse multiply(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Multiply parameters = new Multiply();
        parameters.setX(x);
        parameters.setY(y);
        return calculatorService.multiply(parameters);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.GET)
    public SubtractResponse subtract(@RequestParam(value = "x", required = false) float x, @RequestParam(value = "y", required = false) float y) {
        Subtract parameters = new Subtract();
        parameters.setX(x);
        parameters.setY(y);
        return calculatorService.subtract(parameters);
    }
}