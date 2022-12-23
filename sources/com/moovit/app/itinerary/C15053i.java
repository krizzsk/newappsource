package com.moovit.app.itinerary;

import androidx.fragment.app.Fragment;
import c00.C13722f;
import com.moovit.C15682c;
import com.moovit.app.itinerary.view.leg.C15087l;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.itinerary.C16080a;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities;
import com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideAttributes;
import p503fy.C17125a;
import p810sz.C19617r;
import q80.C13036y;
import t60.C19634d;
import w40.C25765g;

/* renamed from: com.moovit.app.itinerary.i */
public final /* synthetic */ class C15053i implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f38592b;

    public /* synthetic */ C15053i(int i) {
        this.f38592b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f38592b) {
            case 0:
                return ((Time) obj).mo24633j();
            case 1:
                int i = C15087l.f38717E;
                return ServiceStatusCategory.IMPORTANT_LEVEL.contains(((LineServiceAlertDigest) obj).f23186c.f23213b);
            case 2:
                ServerId serverId = C15284a.f39471U;
                return SearchLocationItem.Type.EVENT.equals(((SearchLocationItem) obj).f39458c);
            case 3:
                return !C17125a.m43087g((GcmNotification) obj);
            case 4:
                MVCarpoolRideAttributes mVCarpoolRideAttributes = (MVCarpoolRideAttributes) obj;
                C19617r rVar = C16080a.f41870a;
                if (mVCarpoolRideAttributes != null) {
                    return true;
                }
                return false;
            case 5:
                int i2 = MicroMobilityPurchaseActivity.f14911Y;
                return ((Fragment) obj) instanceof C15682c;
            case 6:
                C19617r rVar2 = C25765g.f64279a;
                return ((C19634d) ((Fragment) obj)).mo51977D0();
            default:
                MVTicketingAgencyCapabilities mVTicketingAgencyCapabilities = (MVTicketingAgencyCapabilities) obj;
                C19617r rVar3 = C13036y.f32248a;
                if (mVTicketingAgencyCapabilities != null) {
                    return true;
                }
                return false;
        }
    }
}
