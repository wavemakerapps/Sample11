/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.sample11.salesdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.sample11.salesdb.Quotes;
import com.sample11.salesdb.Reps;
import com.sample11.salesdb.Tasks;
import com.sample11.salesdb.service.RepsService;


/**
 * Controller object for domain model class Reps.
 * @see Reps
 */
@RestController("salesdb.RepsController")
@Api(value = "RepsController", description = "Exposes APIs to work with Reps resource.")
@RequestMapping("/salesdb/Reps")
public class RepsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepsController.class);

    @Autowired
	@Qualifier("salesdb.RepsService")
	private RepsService repsService;

	@ApiOperation(value = "Creates a new Reps instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Reps createReps(@RequestBody Reps reps) {
		LOGGER.debug("Create Reps with information: {}" , reps);

		reps = repsService.create(reps);
		LOGGER.debug("Created Reps with information: {}" , reps);

	    return reps;
	}

    @ApiOperation(value = "Returns the Reps instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Reps getReps(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting Reps with id: {}" , id);

        Reps foundReps = repsService.getById(id);
        LOGGER.debug("Reps details with id: {}" , foundReps);

        return foundReps;
    }

    @ApiOperation(value = "Updates the Reps instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Reps editReps(@PathVariable("id") Integer id, @RequestBody Reps reps) throws EntityNotFoundException {
        LOGGER.debug("Editing Reps with id: {}" , reps.getId());

        reps.setId(id);
        reps = repsService.update(reps);
        LOGGER.debug("Reps details with id: {}" , reps);

        return reps;
    }

    @ApiOperation(value = "Deletes the Reps instance associated with the given id.")
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteReps(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting Reps with id: {}" , id);

        Reps deletedReps = repsService.delete(id);

        return deletedReps != null;
    }

    /**
     * @deprecated Use {@link #findReps(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of Reps instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Reps> searchRepsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering Reps list");
        return repsService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Reps instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Reps> findReps(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Reps list");
        return repsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of Reps instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Reps> filterReps(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering Reps list");
        return repsService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportReps(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return repsService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of Reps instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countReps( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting Reps");
		return repsService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getRepsAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return repsService.getAggregatedValues(aggregationInfo, pageable);
    }

    @RequestMapping(value="/{id:.+}/taskses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the taskses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Tasks> findAssociatedTaskses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated taskses");
        return repsService.findAssociatedTaskses(id, pageable);
    }

    @RequestMapping(value="/{id:.+}/quoteses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the quoteses instance associated with the given id.")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<Quotes> findAssociatedQuoteses(@PathVariable("id") Integer id, Pageable pageable) {

        LOGGER.debug("Fetching all associated quoteses");
        return repsService.findAssociatedQuoteses(id, pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service RepsService instance
	 */
	protected void setRepsService(RepsService service) {
		this.repsService = service;
	}

}

