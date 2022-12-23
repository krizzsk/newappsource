package p972zu;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.MinutesSpanFormatter;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import p716oy.C18860a;
import p952yy.C20787c;
import p977zz.C20964s0;

/* renamed from: zu.p */
public final class C20909p extends C20894a<WaitToTransitLineLeg> {
    public C20909p(Context context, Navigable navigable, WaitToTransitLineLeg waitToTransitLineLeg, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        super(context, navigable, waitToTransitLineLeg, navigationProgressEvent, dVar, cVar);
    }

    /* renamed from: b */
    public final Integer mo20773b() {
        return mo53000s() != null ? 4 : null;
    }

    /* renamed from: e */
    public final int mo20776e() {
        if (mo53000s() != null) {
            return R.drawable.ic_real_time_12_live;
        }
        return 0;
    }

    /* renamed from: f */
    public final CharSequence mo20777f() {
        SpannableStringBuilder g;
        Time s = mo53000s();
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
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
        Time s = mo53000s();
        if (s == null || !s.mo24633j()) {
            String y = C16783l.m42493y(this.f52646b, waitToTransitLineLeg.f42138i.f42142b);
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
        return context.getString(R.string.tripplan_itinerary_minimized_wait, new Object[]{C16783l.m42479k(context, ((WaitToTransitLineLeg) leg).f42135f.get())});
    }

    /* renamed from: q */
    public final boolean mo52997q() {
        return false;
    }

    /* renamed from: r */
    public final boolean mo52998r() {
        return mo53000s() != null;
    }

    /* renamed from: s */
    public final Time mo53000s() {
        Time time;
        C16769e.C16772c cVar = this.f52651g;
        if (cVar == null) {
            return null;
        }
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) this.f52648d;
        ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
        ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
        ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
        } else {
            time = null;
        }
        C20787c b = cVar.mo49467b(serverId, serverId2, serverId3, time);
        if (b == null) {
            return null;
        }
        return b.f52458c.mo24326m();
    }
}
