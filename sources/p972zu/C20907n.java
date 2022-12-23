package p972zu;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import c00.C13720d;
import c00.C13722f;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import g20.C17161i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p641lu.C18277b;
import p716oy.C18860a;
import p824tp.C19728f;
import p824tp.C19746x;
import p952yy.C20787c;
import p977zz.C20958p0;
import p977zz.C20964s0;

/* renamed from: zu.n */
public final class C20907n extends C20894a<WaitToMultiTransitLinesLeg> {
    public C20907n(Context context, Navigable navigable, WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, waitToMultiTransitLinesLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: b */
    public final Integer mo20773b() {
        return mo52999s() != null ? 4 : null;
    }

    /* renamed from: e */
    public final int mo20776e() {
        if (mo52999s() != null) {
            return R.drawable.ic_real_time_12_live;
        }
        return 0;
    }

    /* renamed from: f */
    public final CharSequence mo20777f() {
        SpannableStringBuilder g;
        Time s = mo52999s();
        if (s == null || (g = C7925b.f23937d.mo24607g(this.f52646b, s.mo24631g(), MinutesSpanFormatter.f23890b)) == null) {
            return null;
        }
        return g.toString();
    }

    /* renamed from: l */
    public final int mo52992l(boolean z) {
        return z ? R.drawable.notification_center_wait : R.drawable.notification_center_wait_disable;
    }

    /* renamed from: m */
    public final String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent) {
        WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
        Time s = mo52999s();
        if (s == null || !s.mo24633j()) {
            Context context = this.f52646b;
            C18277b bVar = C16783l.f43688a;
            List<WaitToTransitLineLeg> list = waitToMultiTransitLinesLeg.f42117b;
            ArrayList arrayList = new ArrayList(list.size());
            for (WaitToTransitLineLeg waitToTransitLineLeg : list) {
                arrayList.add(waitToTransitLineLeg.f42138i.f42142b);
            }
            String y = C16783l.m42493y(context, Schedule.m17781C(arrayList));
            if (!C20964s0.m49090h(y)) {
                return this.f52646b.getString(R.string.tripplan_itinerary_schedule_time, new Object[]{y});
            }
        } else if (C7925b.m18026n(System.currentTimeMillis(), s.mo24631g()) > 0) {
            return this.f52646b.getString(R.string.tripplan_itinerary_arrive_in_label);
        }
        return "";
    }

    /* renamed from: p */
    public final CharSequence mo52996p(Leg leg) {
        Context context = this.f52646b;
        ArrayList<O> c = C13720d.m34273c(((WaitToMultiTransitLinesLeg) leg).f42117b, (C13722f) null, C16783l.f43688a);
        Object[] objArr = {context.getString(C19746x.tripplan_itinerary_alt_route_divide_label)};
        String str = C20964s0.f52718a;
        SpannableString spannableString = new SpannableString(String.format((Locale) null, " %s ", objArr));
        HashSet hashSet = C19728f.f50164e;
        C17161i<C16181a.C16184c, TransitLine> b = ((C19728f) context.getSystemService("metro_context")).mo52082b(LinePresentationType.ITINERARY);
        C16181a.C16183b bVar = new C16181a.C16183b();
        HashSet hashSet2 = new HashSet(c.size());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = true;
        for (O o : c) {
            if (o != null) {
                b.mo48496a(context, bVar, o);
                CharSequence charSequence = bVar.f42181c;
                if (charSequence == null) {
                    charSequence = o.mo24369b().f23697e;
                }
                if (!hashSet2.contains(charSequence)) {
                    hashSet2.add(charSequence);
                    if (!z) {
                        spannableStringBuilder.append(spannableString);
                    }
                    spannableStringBuilder.append(new SpannableString(charSequence));
                    z = false;
                }
            }
        }
        return C20958p0.m49077a(context.getString(R.string.tripplan_itinerary_minimized_wait), spannableStringBuilder);
    }

    /* renamed from: q */
    public final boolean mo52997q() {
        return false;
    }

    /* renamed from: r */
    public final boolean mo52998r() {
        return mo52999s() != null;
    }

    /* renamed from: s */
    public final Time mo52999s() {
        Time time;
        C16769e.C16772c cVar = this.f52651g;
        if (cVar == null) {
            return null;
        }
        WaitToTransitLineLeg b = ((WaitToMultiTransitLinesLeg) this.f52648d).mo48467b();
        ServerId serverId = b.f42135f.getServerId();
        ServerId serverId2 = b.f42136g.getServerId();
        ServerId serverId3 = b.f42137h.getServerId();
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(b.f42132c);
        } else {
            time = null;
        }
        C20787c b2 = cVar.mo49467b(serverId, serverId2, serverId3, time);
        if (b2 == null) {
            return null;
        }
        return b2.f52458c.mo24326m();
    }
}
