package p596jx;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.app.tod.model.TodRideVehicleAction;
import com.moovit.app.tod.model.TodRideVehicleActionInfo;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAction;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionRequest;
import com.usebutton.sdk.internal.events.Events;
import p596jx.C17964m;

/* renamed from: jx.x */
public final class C17976x extends C13778r<C17976x, C17977y, MVTodVehicleActionRequest> {

    /* renamed from: w */
    public final String f46060w;

    /* renamed from: x */
    public final TodRideVehicleAction f46061x;

    public C17976x(C13752e eVar, String str, TodRideVehicleAction todRideVehicleAction, TodRideVehicleActionInfo todRideVehicleActionInfo) {
        super(eVar, R.string.api_path_tod_ride_report_vehicle_action_request, C17977y.class);
        MVTodVehicleAction mVTodVehicleAction;
        C21100e.m49373x(str, "rideId");
        this.f46060w = str;
        C21100e.m49373x(todRideVehicleAction, Events.PROPERTY_ACTION);
        this.f46061x = todRideVehicleAction;
        int i = C17964m.C17965a.f46045e[todRideVehicleAction.ordinal()];
        if (i == 1) {
            mVTodVehicleAction = MVTodVehicleAction.COLOR_BAR;
        } else if (i == 2) {
            mVTodVehicleAction = MVTodVehicleAction.AC;
        } else if (i == 3) {
            mVTodVehicleAction = MVTodVehicleAction.AUDIO;
        } else if (i == 4) {
            mVTodVehicleAction = MVTodVehicleAction.BEEP;
        } else if (i == 5) {
            mVTodVehicleAction = MVTodVehicleAction.FLASH;
        } else {
            throw new IllegalStateException("Unknown action type: " + todRideVehicleAction);
        }
        String name = mVTodVehicleAction.name();
        RO mVTodVehicleActionRequest = new MVTodVehicleActionRequest();
        mVTodVehicleActionRequest.rideId = str;
        mVTodVehicleActionRequest.action = name;
        if (todRideVehicleActionInfo != null) {
            MVTodVehicleActionInfo mVTodVehicleActionInfo = new MVTodVehicleActionInfo();
            todRideVehicleActionInfo.mo46340b(mVTodVehicleActionInfo);
            mVTodVehicleActionRequest.actionInfo = mVTodVehicleActionInfo;
        }
        this.f33922v = mVTodVehicleActionRequest;
    }
}
