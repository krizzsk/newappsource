package p900wt;

import android.net.Uri;
import android.text.style.StyleSpan;
import c00.C13719c;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import ce0.C21100e;
import com.moovit.app.tod.TodRideRatingDialogFragment;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.app.tod.order.TodOrderActivity;
import com.moovit.app.wondo.tickets.codes.C15648a;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.database.DbEntityRef;
import com.moovit.gallery.C15878a;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.gallery.EmbeddedGalleryImage;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.confirmation.summary.discounts.Discount;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import com.moovit.ticketing.purchase.filter.PurchaseFilterConfirmation;
import com.moovit.transit.C7841a;
import com.moovit.tripplanner.TripPlannerTime;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.discounts.MVDiscount;
import com.tranzmate.moovit.protocol.gtfs.MVPlatformLines;
import com.tranzmate.moovit.protocol.payments.MVAccountProfileRequiredInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountProfile;
import com.tranzmate.moovit.protocol.subscriptions.MVUserSubscription;
import com.tranzmate.moovit.protocol.ticketingV2.MVConfirmation;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFilter;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationSourceType;
import com.tranzmate.moovit.protocol.tripplanner.MVWalkingInstruction;
import com.tranzmate.moovit.protocol.users.MVMetroArea;
import com.tranzmate.moovit.protocol.users.MVUserTag;
import com.tranzmate.moovit.protocol.wondo.MVWondoCampaign;
import h60.C17353s0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p009a8.C0114n;
import p227r.C6227a;
import p269u2.C6678b;
import p394br.C13660f;
import p525gw.C17246a;
import p525gw.C17247b;
import p80.C12989a;
import p810sz.C19617r;
import p881vy.C20255i;
import p924xt.C20596g;
import p924xt.C20604l;
import p977zz.C20949l;
import p977zz.C20964s0;
import q80.C13036y;
import x00.C20440a;
import z70.C13329g;

/* renamed from: wt.e */
public final /* synthetic */ class C20415e implements C13721e, C6227a, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f51726b;

    public /* synthetic */ C20415e(int i) {
        this.f51726b = i;
    }

    public /* synthetic */ C20415e(String str, int i) {
        this.f51726b = i;
    }

    public Object apply(Object obj) {
        TripPlannerTime tripPlannerTime;
        switch (this.f51726b) {
            case 0:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case 1:
                return ((C6678b) obj).getAttachedDbs();
            default:
                TodBookingOrderViewModel.OrderInformation orderInformation = (TodBookingOrderViewModel.OrderInformation) obj;
                if (orderInformation == null || orderInformation.f40085e == null || orderInformation.f40086f == null) {
                    return null;
                }
                long j = orderInformation.f40084d;
                if (j == -1 || j <= System.currentTimeMillis()) {
                    tripPlannerTime = null;
                } else {
                    tripPlannerTime = new TripPlannerTime(TripPlannerTime.Type.DEPART, orderInformation.f40084d);
                }
                return new TodOrderActivity.TodOrderInfo(orderInformation.f40085e, orderInformation.f40086f, tripPlannerTime, orderInformation.f40082b, orderInformation.f40083c, (String) null, (String) null);
        }
    }

    public Object convert(Object obj) {
        int i;
        List<MVAccountProfileRequiredInfo> list;
        long j;
        String str;
        String str2;
        Image image;
        PurchaseFilterConfirmation purchaseFilterConfirmation;
        String str3;
        String str4 = null;
        switch (this.f51726b) {
            case 0:
                return C13749c.m34325k((MVMetroArea) obj);
            case 1:
                C20596g gVar = C20604l.f52116a;
                return ((Itinerary) obj).f41895c.f41901c;
            case 2:
                return new C17247b(new C17246a(((MVUserSubscription) obj).activeStoreProduct.mo31823m().sku));
            case 3:
                return C13749c.m34324j((MVLocationDescriptor) obj, (MVLocationSourceType) null);
            case 4:
                return ((MVUserTag) obj).key;
            case 5:
                WondoCode wondoCode = (WondoCode) obj;
                if (wondoCode.f40700f) {
                    i = 2;
                } else {
                    i = 1;
                }
                return new C15648a.C15650b(i, wondoCode);
            case 6:
                MVWondoCampaign mVWondoCampaign = (MVWondoCampaign) obj;
                return new WondoCampaign(mVWondoCampaign.label, C20255i.m47823b(mVWondoCampaign.campaign));
            case 7:
                int i2 = EmbeddedGalleryFragment.f41475r;
                Uri parse = Uri.parse(((EmbeddedGalleryImage) obj).f41479b);
                C21100e.m49373x(parse, "image");
                return new C15878a.C15880b(parse, 3);
            case 8:
                return C16080a.m40946b((MVWalkingInstruction) obj);
            case 9:
                return C16080a.m40946b((MVWalkingInstruction) obj);
            case 10:
                return new ServerId(((Integer) obj).intValue());
            case 11:
                return C13749c.m34331q((InputFieldValue) obj);
            case 12:
                return ((DbEntityRef) obj).getServerId();
            case 13:
                MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) obj;
                C19617r rVar = C17353s0.f44739a;
                if (mVPaymentAccountProfile.mo30158h()) {
                    list = mVPaymentAccountProfile.requiredInfos;
                } else {
                    list = Collections.emptyList();
                }
                C13660f fVar = new C13660f(5);
                C0114n nVar = new C0114n(3);
                HashMap hashMap = new HashMap();
                for (MVAccountProfileRequiredInfo next : list) {
                    hashMap.put(fVar.convert(next), nVar.convert(next));
                }
                PaymentProfile m = C17353s0.m43399m(mVPaymentAccountProfile.profile, hashMap);
                if (mVPaymentAccountProfile.mo30156f()) {
                    j = mVPaymentAccountProfile.expirationDate;
                } else {
                    j = -1;
                }
                return new PaymentAccountProfile(m, j, C17353s0.m43393g(mVPaymentAccountProfile.status), C13749c.m34323i(mVPaymentAccountProfile.statusMessage));
            case 14:
                MVDiscount mVDiscount = (MVDiscount) obj;
                C19617r rVar2 = C17353s0.f44739a;
                return new Discount(mVDiscount.f25584id, mVDiscount.tag, mVDiscount.label, C13749c.m34318d(mVDiscount.amount), mVDiscount.isRemoveable);
            case 15:
                C20440a aVar = (C20440a) obj;
                StyleSpan styleSpan = C13329g.f33089a;
                if (aVar.mo52636a()) {
                    return new C20440a((CharSequence) C20964s0.m49082C(aVar.f51782b), (String) null);
                }
                return aVar;
            case 16:
                MVPurchaseFilter mVPurchaseFilter = (MVPurchaseFilter) obj;
                C19617r rVar3 = C13036y.f32248a;
                String str5 = mVPurchaseFilter.filterId;
                if (mVPurchaseFilter.mo32576j()) {
                    str = mVPurchaseFilter.title;
                } else {
                    str = null;
                }
                if (mVPurchaseFilter.mo32575i()) {
                    str2 = mVPurchaseFilter.subtitle;
                } else {
                    str2 = null;
                }
                if (mVPurchaseFilter.mo32573h()) {
                    image = C16028g.m40829g(mVPurchaseFilter.icon);
                } else {
                    image = null;
                }
                if (mVPurchaseFilter.mo32571f()) {
                    MVConfirmation mVConfirmation = mVPurchaseFilter.confirmation;
                    String str6 = mVConfirmation.title;
                    if (mVConfirmation.mo32371h()) {
                        str3 = mVConfirmation.text;
                    } else {
                        str3 = null;
                    }
                    String str7 = mVConfirmation.positiveText;
                    if (mVConfirmation.mo32369f()) {
                        str4 = mVConfirmation.negetiveText;
                    }
                    purchaseFilterConfirmation = new PurchaseFilterConfirmation(str6, str3, str7, str4);
                } else {
                    purchaseFilterConfirmation = null;
                }
                return new PurchaseFilter(str5, image, str, str2, purchaseFilterConfirmation);
            case 17:
                return ((C12989a) obj).f32150b.f23495b;
            default:
                C13719c cVar = C7841a.f23766a;
                return C13720d.m34273c(((MVPlatformLines) obj).lineIds, (C13722f) null, C7841a.f23766a);
        }
    }

    public boolean invoke(Object obj) {
        int i = this.f51726b;
        String str = TodRideRatingDialogFragment.f40018q;
        ((TodRideRatingDialogFragment.C15454b) obj).mo46194r0(i);
        return false;
    }
}
