package p596jx;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionAdditionalInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionPinCodeAdditionalInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionQrCodeAdditionalInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodPassengerActionRequest;
import p502fx.C17118c;
import p502fx.C17119d;

/* renamed from: jx.v */
public final class C17974v extends C13778r<C17974v, C17975w, MVTodPassengerActionRequest> {

    /* renamed from: w */
    public final String f46057w;

    /* renamed from: x */
    public final String f46058x;

    public C17974v(C13752e eVar, String str, String str2, C14333w2 w2Var, LatLonE6 latLonE6) {
        super(eVar, R.string.api_path_tod_ride_report_action_request, C17975w.class);
        MVTodPassengerActionAdditionalInfo mVTodPassengerActionAdditionalInfo;
        C21100e.m49373x(str, "rideId");
        this.f46057w = str;
        C21100e.m49373x(str2, "actionId");
        this.f46058x = str2;
        RO mVTodPassengerActionRequest = new MVTodPassengerActionRequest();
        mVTodPassengerActionRequest.rideId = str;
        mVTodPassengerActionRequest.actionId = str2;
        if (w2Var != null) {
            C17119d dVar = (C17119d) w2Var.f36107c;
            if (dVar != null) {
                String str3 = dVar.f44306b;
                MVTodPassengerActionQrCodeAdditionalInfo mVTodPassengerActionQrCodeAdditionalInfo = new MVTodPassengerActionQrCodeAdditionalInfo();
                mVTodPassengerActionQrCodeAdditionalInfo.qrCode = str3;
                mVTodPassengerActionAdditionalInfo = new MVTodPassengerActionAdditionalInfo();
                mVTodPassengerActionAdditionalInfo.setField_ = MVTodPassengerActionAdditionalInfo._Fields.QR_CODE;
                mVTodPassengerActionAdditionalInfo.value_ = mVTodPassengerActionQrCodeAdditionalInfo;
            } else {
                C17118c cVar = (C17118c) w2Var.f36108d;
                if (cVar != null) {
                    String str4 = cVar.f44304c;
                    MVTodPassengerActionPinCodeAdditionalInfo mVTodPassengerActionPinCodeAdditionalInfo = new MVTodPassengerActionPinCodeAdditionalInfo();
                    mVTodPassengerActionPinCodeAdditionalInfo.pinCode = str4;
                    mVTodPassengerActionAdditionalInfo = new MVTodPassengerActionAdditionalInfo();
                    mVTodPassengerActionAdditionalInfo.setField_ = MVTodPassengerActionAdditionalInfo._Fields.PIN_CODE;
                    mVTodPassengerActionAdditionalInfo.value_ = mVTodPassengerActionPinCodeAdditionalInfo;
                } else {
                    throw new IllegalStateException("Illegal passenger action additional information - " + w2Var);
                }
            }
            mVTodPassengerActionRequest.actionInfo = mVTodPassengerActionAdditionalInfo;
        }
        if (latLonE6 != null) {
            mVTodPassengerActionRequest.currentUserLocation = C13749c.m34332r(latLonE6);
        }
        this.f33922v = mVTodPassengerActionRequest;
    }
}
