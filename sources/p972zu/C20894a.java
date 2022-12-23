package p972zu;

import android.content.Context;
import ce0.C21100e;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import e20.C16769e;
import h40.C5051b;
import p977zz.C20941h;

/* renamed from: zu.a */
public abstract class C20894a<T extends Leg> implements C5051b {

    /* renamed from: b */
    public final Context f52646b;

    /* renamed from: c */
    public final Navigable f52647c;

    /* renamed from: d */
    public final T f52648d;

    /* renamed from: e */
    public final NavigationProgressEvent f52649e;

    /* renamed from: f */
    public final C4231d<?> f52650f;

    /* renamed from: g */
    public final C16769e.C16772c f52651g;

    public C20894a(Context context, Navigable navigable, T t, NavigationProgressEvent navigationProgressEvent, C4231d<?> dVar, C16769e.C16772c cVar) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f52646b = context;
        C21100e.m49373x(navigable, "navigable");
        this.f52647c = navigable;
        C21100e.m49373x(t, "leg");
        this.f52648d = t;
        this.f52649e = navigationProgressEvent;
        this.f52650f = dVar;
        this.f52651g = cVar;
    }

    /* renamed from: b */
    public Integer mo20773b() {
        return null;
    }

    /* renamed from: c */
    public final void mo20774c() {
    }

    /* renamed from: d */
    public final Integer mo20775d() {
        if (mo52998r()) {
            return Integer.valueOf(C20941h.m49043f(R.attr.colorGood, this.f52646b));
        }
        if (mo52997q()) {
            return Integer.valueOf(C20941h.m49043f(R.attr.colorOnSurfaceEmphasisHigh, this.f52646b));
        }
        return null;
    }

    /* renamed from: e */
    public int mo20776e() {
        return mo52995o();
    }

    /* renamed from: f */
    public CharSequence mo20777f() {
        return mo52994n(this.f52648d, this.f52649e);
    }

    /* renamed from: g */
    public final String mo20781g() {
        if (mo52997q()) {
            return this.f52646b.getString(R.string.tripplan_itinerary_notification_battery);
        }
        return null;
    }

    public final int getIcon() {
        return mo52992l(this.f52649e != null);
    }

    public final CharSequence getTitle() {
        return mo52996p(this.f52648d);
    }

    /* renamed from: h */
    public final int mo20782h() {
        if (mo52997q()) {
            return R.drawable.ic_battery_16_green;
        }
        return 0;
    }

    /* renamed from: i */
    public final CharSequence mo20780i() {
        return mo52993m(this.f52648d, this.f52649e);
    }

    /* renamed from: j */
    public final void mo20783j() {
    }

    /* renamed from: l */
    public abstract int mo52992l(boolean z);

    /* renamed from: m */
    public abstract String mo52993m(Leg leg, NavigationProgressEvent navigationProgressEvent);

    /* renamed from: n */
    public CharSequence mo52994n(T t, NavigationProgressEvent navigationProgressEvent) {
        return null;
    }

    /* renamed from: o */
    public int mo52995o() {
        return 0;
    }

    /* renamed from: p */
    public abstract CharSequence mo52996p(Leg leg);

    /* renamed from: q */
    public boolean mo52997q() {
        return this.f52650f == null && this.f52649e != null;
    }

    /* renamed from: r */
    public boolean mo52998r() {
        return (this.f52650f == null || this.f52649e == null) ? false : true;
    }
}
