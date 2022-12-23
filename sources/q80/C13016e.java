package q80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.filter.PurchaseFilterSelectionStepResult;
import com.moovit.ticketing.purchase.itinerary.PurchaseItineraryLegSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStepResult;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilterSelectionStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryLegSelectionStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoredValueSelectionStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareSelectionStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTypeSelectionStepResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVSuggestedTicketFareSelectionStepResult;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;
import p80.C12991b;
import p810sz.C19617r;
import r80.C13048b;

/* renamed from: q80.e */
public final class C13016e extends C13778r<C13016e, C13017f, MVPurchaseTicketFareStepCompleteRequest> implements Callable<PurchaseStep>, PurchaseStepResult.C7646a<Void, ServerException> {

    /* renamed from: w */
    public final C12991b f32211w;

    /* renamed from: x */
    public final PurchaseStepResult f32212x;

    public C13016e(C13752e eVar, C12991b bVar, PurchaseStepResult purchaseStepResult) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_next_step, C13017f.class);
        C21100e.m49373x(bVar, "ticketingConfiguration");
        this.f32211w = bVar;
        C21100e.m49373x(purchaseStepResult, "result");
        this.f32212x = purchaseStepResult;
        this.f51770m = new C14291m0(eVar, "ticketing_step_completed");
    }

    /* renamed from: E */
    public final List<C13017f> mo21059E() throws IOException, ServerException {
        C13017f perform = C13048b.f32272c.perform(this.f51759b, this.f32211w, this.f32212x);
        if (perform == null) {
            this.f32212x.mo24018b(this);
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(perform);
    }

    /* renamed from: a */
    public final Object mo24019a(PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        String str = purchaseTicketFareSelectionStepResult.f23303c.f23326b;
        MVPurchaseTicketFareSelectionStepResult mVPurchaseTicketFareSelectionStepResult = new MVPurchaseTicketFareSelectionStepResult();
        mVPurchaseTicketFareSelectionStepResult.fareId = str;
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.FARE_SELECTED_STEP_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVPurchaseTicketFareSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(purchaseTicketFareSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }

    /* renamed from: b */
    public final Object mo24020b(PurchaseStationSelectionStepResult purchaseStationSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Station selection does not supported by moovit server!");
    }

    public final Object call() throws Exception {
        return ((C13017f) mo52626J()).f32213m;
    }

    /* renamed from: e */
    public final Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        MVSuggestedTicketFareSelectionStepResult mVSuggestedTicketFareSelectionStepResult = new MVSuggestedTicketFareSelectionStepResult();
        SuggestedTicketFare suggestedTicketFare = suggestedTicketFareSelectionStepResult.f23324c;
        if (suggestedTicketFare != null) {
            mVSuggestedTicketFareSelectionStepResult.fareId = suggestedTicketFare.f23315d;
            mVSuggestedTicketFareSelectionStepResult.providerId = suggestedTicketFare.f23313b.f15142b;
            mVSuggestedTicketFareSelectionStepResult.mo33001i();
            mVSuggestedTicketFareSelectionStepResult.agencyKey = suggestedTicketFare.f23317f.f23495b;
        }
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.SUGGESTED_FARE_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVSuggestedTicketFareSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(suggestedTicketFareSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }

    /* renamed from: g */
    public final Object mo24022g(PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        String str = purchaseTypeSelectionStepResult.f23468c;
        MVPurchaseTypeSelectionStepResult mVPurchaseTypeSelectionStepResult = new MVPurchaseTypeSelectionStepResult();
        mVPurchaseTypeSelectionStepResult.selectedTypeId = str;
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.PURCHASE_TYPE_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVPurchaseTypeSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(purchaseTypeSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }

    /* renamed from: h */
    public final Object mo24023h(PurchaseItineraryLegSelectionStepResult purchaseItineraryLegSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        List<String> list = purchaseItineraryLegSelectionStepResult.f23390c;
        MVPurchaseItineraryLegSelectionStepResult mVPurchaseItineraryLegSelectionStepResult = new MVPurchaseItineraryLegSelectionStepResult();
        mVPurchaseItineraryLegSelectionStepResult.legIds = list;
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.ITINERARY_LEG_SELECTION_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVPurchaseItineraryLegSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(purchaseItineraryLegSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }

    /* renamed from: k */
    public final Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) {
        throw new UnsupportedOperationException("Masabi does not supported!");
    }

    /* renamed from: m */
    public final Object mo24025m(PurchaseFilterSelectionStepResult purchaseFilterSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        String str = purchaseFilterSelectionStepResult.f23358c;
        String str2 = purchaseFilterSelectionStepResult.f23359d;
        MVPurchaseFilterSelectionStepResult mVPurchaseFilterSelectionStepResult = new MVPurchaseFilterSelectionStepResult();
        mVPurchaseFilterSelectionStepResult.type = str;
        mVPurchaseFilterSelectionStepResult.selectedFilterId = str2;
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.FILTER_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVPurchaseFilterSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(purchaseFilterSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }

    /* renamed from: n */
    public final Object mo24026n(PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult) throws Exception {
        C19617r rVar = C13036y.f32248a;
        MVCurrencyAmount p = C13749c.m34330p(purchaseStoredValueSelectionStepResult.f23452c);
        MVPurchaseStoredValueSelectionStepResult mVPurchaseStoredValueSelectionStepResult = new MVPurchaseStoredValueSelectionStepResult();
        mVPurchaseStoredValueSelectionStepResult.currencyAmount = p;
        MVPurchaseTicketFareStepResult mVPurchaseTicketFareStepResult = new MVPurchaseTicketFareStepResult();
        mVPurchaseTicketFareStepResult.setField_ = MVPurchaseTicketFareStepResult._Fields.STORED_VALUE_STEP_RESULT;
        mVPurchaseTicketFareStepResult.value_ = mVPurchaseStoredValueSelectionStepResult;
        this.f33922v = new MVPurchaseTicketFareStepCompleteRequest(purchaseStoredValueSelectionStepResult.f23249b, mVPurchaseTicketFareStepResult);
        return null;
    }
}
