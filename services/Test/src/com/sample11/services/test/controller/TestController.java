/**
 * This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.
 */
package com.sample11.services.test.controller;

import com.sample11.services.test.services.TestService;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddPenalties;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddPenaltiesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddTaxes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.AddTaxesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAllTaxes;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAllTaxesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAutoCancel;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CancelPNRFFPAutoCancelResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRExt;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRExtResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.CreatePNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.EvaluateModificationOfPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetApisInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetApisInfoResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservation;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationBalance;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.GetReservationBalanceResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HistoryPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HoldInventory;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.HoldInventoryResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ImportPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRFFP;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ModifyPNRFFPResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverBook;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverBookResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationCharges;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.OverrideReservationChargesResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ReleaseInventory;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.ReleaseInventoryResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.RetrievePNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SetApisInfo;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SetApisInfoResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNR;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRResponse;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRExt;
import com.gzipcompressiontest.services.connectpoint_reservation.model.tempuri.SummaryPNRExtResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/penalties", method = RequestMethod.POST)
    public AddPenaltiesResponse addPenalties(@RequestBody AddPenalties parameters) {
        return testService.addPenalties(parameters);
    }

    @RequestMapping(value = "/taxes", method = RequestMethod.POST)
    public AddTaxesResponse addTaxes(@RequestBody AddTaxes parameters) {
        return testService.addTaxes(parameters);
    }

    @RequestMapping(value = "/cancelPNR", method = RequestMethod.POST)
    public CancelPNRResponse cancelPNR(@RequestBody CancelPNR parameters) {
        return testService.cancelPNR(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFP", method = RequestMethod.POST)
    public CancelPNRFFPResponse cancelPNRFFP(@RequestBody CancelPNRFFP parameters) {
        return testService.cancelPNRFFP(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFPAllTaxes", method = RequestMethod.POST)
    public CancelPNRFFPAllTaxesResponse cancelPNRFFPAllTaxes(@RequestBody CancelPNRFFPAllTaxes parameters) {
        return testService.cancelPNRFFPAllTaxes(parameters);
    }

    @RequestMapping(value = "/cancelPNRFFPAutoCancel", method = RequestMethod.POST)
    public CancelPNRFFPAutoCancelResponse cancelPNRFFPAutoCancel(@RequestBody CancelPNRFFPAutoCancel parameters) {
        return testService.cancelPNRFFPAutoCancel(parameters);
    }

    @RequestMapping(value = "/pNR", method = RequestMethod.POST)
    public CreatePNRResponse createPNR(@RequestBody CreatePNR parameters) {
        return testService.createPNR(parameters);
    }

    @RequestMapping(value = "/pNRExt", method = RequestMethod.POST)
    public CreatePNRExtResponse createPNRExt(@RequestBody CreatePNRExt parameters) {
        return testService.createPNRExt(parameters);
    }

    @RequestMapping(value = "/pNRFFp", method = RequestMethod.POST)
    public CreatePNRFFPResponse createPNRFFP(@RequestBody CreatePNRFFP parameters) {
        return testService.createPNRFFP(parameters);
    }

    @RequestMapping(value = "/evaluateModificationOfPNR", method = RequestMethod.POST)
    public EvaluateModificationOfPNRResponse evaluateModificationOfPNR(@RequestBody EvaluateModificationOfPNR parameters) {
        return testService.evaluateModificationOfPNR(parameters);
    }

    @RequestMapping(value = "/apisInfo", method = RequestMethod.POST)
    public GetApisInfoResponse getApisInfo(@RequestBody GetApisInfo parameters) {
        return testService.getApisInfo(parameters);
    }

    @RequestMapping(value = "/reservation", method = RequestMethod.POST)
    public GetReservationResponse getReservation(@RequestBody GetReservation parameters) {
        return testService.getReservation(parameters);
    }

    @RequestMapping(value = "/reservationBalance", method = RequestMethod.POST)
    public GetReservationBalanceResponse getReservationBalance(@RequestBody GetReservationBalance parameters) {
        return testService.getReservationBalance(parameters);
    }

    @RequestMapping(value = "/historyPNR", method = RequestMethod.POST)
    public HistoryPNRResponse historyPNR(@RequestBody HistoryPNR parameters) {
        return testService.historyPNR(parameters);
    }

    @RequestMapping(value = "/holdInventory", method = RequestMethod.POST)
    public HoldInventoryResponse holdInventory(@RequestBody HoldInventory parameters) {
        return testService.holdInventory(parameters);
    }

    @RequestMapping(value = "/importPNR", method = RequestMethod.POST)
    public ImportPNRResponse importPNR(@RequestBody ImportPNR parameters) {
        return testService.importPNR(parameters);
    }

    @RequestMapping(value = "/modifyPNR", method = RequestMethod.POST)
    public ModifyPNRResponse modifyPNR(@RequestBody ModifyPNR parameters) {
        return testService.modifyPNR(parameters);
    }

    @RequestMapping(value = "/modifyPNRFFP", method = RequestMethod.POST)
    public ModifyPNRFFPResponse modifyPNRFFP(@RequestBody ModifyPNRFFP parameters) {
        return testService.modifyPNRFFP(parameters);
    }

    @RequestMapping(value = "/overBook", method = RequestMethod.POST)
    public OverBookResponse overBook(@RequestBody OverBook parameters) {
        return testService.overBook(parameters);
    }

    @RequestMapping(value = "/overrideReservationCharges", method = RequestMethod.POST)
    public OverrideReservationChargesResponse overrideReservationCharges(@RequestBody OverrideReservationCharges parameters) {
        return testService.overrideReservationCharges(parameters);
    }

    @RequestMapping(value = "/releaseInventory", method = RequestMethod.POST)
    public ReleaseInventoryResponse releaseInventory(@RequestBody ReleaseInventory parameters) {
        return testService.releaseInventory(parameters);
    }

    @RequestMapping(value = "/retrievePNR", method = RequestMethod.POST)
    public RetrievePNRResponse retrievePNR(@RequestBody RetrievePNR parameters) {
        return testService.retrievePNR(parameters);
    }

    @RequestMapping(value = "/apisInfo", method = RequestMethod.PUT)
    public SetApisInfoResponse setApisInfo(@RequestBody SetApisInfo parameters) {
        return testService.setApisInfo(parameters);
    }

    @RequestMapping(value = "/summaryPNR", method = RequestMethod.POST)
    public SummaryPNRResponse summaryPNR(@RequestBody SummaryPNR parameters) {
        return testService.summaryPNR(parameters);
    }

    @RequestMapping(value = "/summaryPNRExt", method = RequestMethod.POST)
    public SummaryPNRExtResponse summaryPNRExt(@RequestBody SummaryPNRExt parameters) {
        return testService.summaryPNRExt(parameters);
    }
}
