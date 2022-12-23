package p641lu;

import c00.C13733n;
import com.moovit.app.metro.selection.MetroListActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicket;
import e20.C16783l;
import j40.C5384a;
import p798sn.C19493a;
import p977zz.C20944i0;
import s20.C19408h;
import s80.C13070g;

/* renamed from: lu.b */
public final /* synthetic */ class C18277b implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f46609b;

    public /* synthetic */ C18277b(int i) {
        this.f46609b = i;
    }

    public final Object convert(Object obj) {
        switch (this.f46609b) {
            case 0:
                C20944i0 i0Var = (C20944i0) obj;
                int i = MetroListActivity.f38959o0;
                StringBuilder sb = new StringBuilder();
                Country country = (Country) i0Var.f52692a;
                sb.append(country.f14797c);
                for (String append : country.f14800f) {
                    sb.append(' ');
                    sb.append(append);
                }
                MetroArea metroArea = (MetroArea) i0Var.f52693b;
                sb.append(' ');
                sb.append(metroArea.f14803c);
                for (String append2 : metroArea.f14804d) {
                    sb.append(' ');
                    sb.append(append2);
                }
                return sb.toString();
            case 1:
                return (SearchLineItem) ((C20944i0) obj).f52692a;
            case 2:
                C18277b bVar = C16783l.f43688a;
                return ((WaitToTransitLineLeg) obj).f42135f.get();
            case 3:
                return C19408h.m46736I((LatLonE6) obj);
            case 4:
                return ((C5384a) obj).getServerId();
            case 5:
                return ((MVTicket) obj).name;
            default:
                return C13070g.m33015g((C19493a) obj);
        }
    }
}
