package com.moovit.ticketing.purchase;

import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;

public abstract class PurchaseStepResult implements Parcelable {

    /* renamed from: b */
    public final String f23249b;

    /* renamed from: com.moovit.ticketing.purchase.PurchaseStepResult$a */
    public interface C7646a<R, E extends Exception> {
        /* renamed from: a */
        R mo24019a(PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult) throws Exception;

        /* renamed from: b */
        R mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception;

        /* renamed from: e */
        R mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception;

        /* renamed from: g */
        R mo24022g(PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult) throws Exception;

        /* renamed from: h */
        R mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception;

        /* renamed from: k */
        R mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) throws Exception;

        /* renamed from: m */
        R mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception;

        /* renamed from: n */
        R mo24026n(PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult) throws Exception;
    }

    public PurchaseStepResult(String str) {
        C21100e.m49373x(str, "contextId");
        this.f23249b = str;
    }

    /* renamed from: b */
    public abstract <R, E extends Exception> R mo24018b(C7646a<R, E> aVar) throws Exception;
}
