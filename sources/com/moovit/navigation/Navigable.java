package com.moovit.navigation;

import android.app.Notification;
import android.os.Parcelable;
import com.moovit.commons.geo.Geofence;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import d40.C4351g;
import java.util.List;

public interface Navigable extends Parcelable {
    /* renamed from: D1 */
    void mo19599D1();

    /* renamed from: H0 */
    RequestedNavigationMode mo19636H0();

    /* renamed from: J1 */
    void mo19600J1(C4231d<?> dVar);

    /* renamed from: L0 */
    void mo19601L0(C4351g gVar);

    /* renamed from: P1 */
    ServerIdMap<TransitStop> mo19637P1();

    /* renamed from: T0 */
    long mo19602T0();

    /* renamed from: X */
    List<Geofence> mo19638X();

    /* renamed from: Z */
    void mo19603Z();

    /* renamed from: a */
    void mo19604a(NavigationProgressEvent navigationProgressEvent);

    /* renamed from: e0 */
    String mo19639e0();

    /* renamed from: g2 */
    void mo19608g2();

    long getExpirationTime();

    /* renamed from: j0 */
    long mo19641j0();

    /* renamed from: k0 */
    long mo19642k0(NavigationProgressEvent navigationProgressEvent);

    /* renamed from: o0 */
    void mo19609o0();

    /* renamed from: r1 */
    Notification mo19643r1();

    /* renamed from: u0 */
    List<NavigationLeg> mo19644u0();

    /* renamed from: y0 */
    void mo19610y0();

    /* renamed from: y1 */
    void mo19611y1();
}
