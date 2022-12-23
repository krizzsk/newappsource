package com.moovit.navigation.event;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.navigation.ArrivalState;
import com.moovit.network.model.ServerId;
import e40.C4553a;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p834tz.C19794a;
import p977zz.C20964s0;

public class NavigationProgressEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigationProgressEvent> CREATOR = new C4239a();

    /* renamed from: s */
    public static final C4240b f15110s = new C4240b();

    /* renamed from: t */
    public static final C4241c f15111t = new C4241c(NavigationProgressEvent.class);

    /* renamed from: c */
    public final int f15112c;

    /* renamed from: d */
    public final int f15113d;

    /* renamed from: e */
    public final ServerId f15114e;

    /* renamed from: f */
    public final ArrivalState f15115f;

    /* renamed from: g */
    public final float f15116g;

    /* renamed from: h */
    public final float f15117h;

    /* renamed from: i */
    public final int f15118i;

    /* renamed from: j */
    public final int f15119j;

    /* renamed from: k */
    public final int f15120k;

    /* renamed from: l */
    public final int f15121l;

    /* renamed from: m */
    public final int f15122m;

    /* renamed from: n */
    public final float f15123n;

    /* renamed from: o */
    public final int f15124o;

    /* renamed from: p */
    public final float f15125p;

    /* renamed from: q */
    public final Location f15126q;

    /* renamed from: r */
    public final int f15127r;

    /* renamed from: com.moovit.navigation.event.NavigationProgressEvent$a */
    public class C4239a implements Parcelable.Creator<NavigationProgressEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationProgressEvent) C19612n.m46981v(parcel, NavigationProgressEvent.f15111t);
        }

        public final Object[] newArray(int i) {
            return new NavigationProgressEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationProgressEvent$b */
    public class C4240b extends C19621u<NavigationProgressEvent> {
        public C4240b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationProgressEvent navigationProgressEvent = (NavigationProgressEvent) obj;
            qVar.mo51954p(navigationProgressEvent.f15109b);
            qVar.mo51939l(navigationProgressEvent.f15112c);
            qVar.mo51939l(navigationProgressEvent.f15113d);
            qVar.mo51939l(navigationProgressEvent.f15114e.f15142b);
            qVar.mo51967q(navigationProgressEvent.f15115f, ArrivalState.CODER);
            qVar.mo51938j(navigationProgressEvent.f15116g);
            qVar.mo51938j(navigationProgressEvent.f15117h);
            qVar.mo51939l(navigationProgressEvent.f15118i);
            qVar.mo51939l(navigationProgressEvent.f15119j);
            qVar.mo51939l(navigationProgressEvent.f15120k);
            qVar.mo51939l(navigationProgressEvent.f15121l);
            qVar.mo51939l(navigationProgressEvent.f15122m);
            qVar.mo51938j(navigationProgressEvent.f15123n);
            qVar.mo51939l(navigationProgressEvent.f15124o);
            qVar.mo51938j(navigationProgressEvent.f15125p);
            qVar.mo51967q(navigationProgressEvent.f15126q, C19794a.f50329g);
            qVar.mo51939l(navigationProgressEvent.f15127r);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationProgressEvent$c */
    public class C4241c extends C19620t<NavigationProgressEvent> {
        public C4241c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            int i2;
            float f;
            Location location;
            int i3;
            C19615p pVar2 = pVar;
            int i4 = i;
            String p = pVar.mo51947p();
            if (i4 == 0) {
                i2 = 0;
            } else {
                i2 = pVar.mo51924l();
            }
            int l = pVar.mo51924l();
            ServerId serverId = new ServerId(pVar.mo51924l());
            ArrivalState arrivalState = (ArrivalState) pVar2.mo51962q(ArrivalState.CODER);
            float j = pVar.mo51923j();
            float j2 = pVar.mo51923j();
            int l2 = pVar.mo51924l();
            int l3 = pVar.mo51924l();
            int l4 = pVar.mo51924l();
            int l5 = pVar.mo51924l();
            int l6 = pVar.mo51924l();
            float j3 = pVar.mo51923j();
            int l7 = pVar.mo51924l();
            float j4 = pVar.mo51923j();
            int i5 = l7;
            if (i4 <= 1) {
                LatLonE6 latLonE6 = (LatLonE6) pVar2.mo51962q(LatLonE6.f40979g);
                f = j3;
                location = null;
                if (latLonE6 != null) {
                    location = latLonE6.mo46929u((Location) null);
                }
            } else {
                f = j3;
                location = (Location) pVar2.mo51962q(C19794a.f50329g);
            }
            Location location2 = location;
            if (i4 == 0) {
                i3 = (int) TimeUnit.HOURS.toSeconds(1);
            } else {
                i3 = pVar.mo51924l();
            }
            return new NavigationProgressEvent(p, i2, l, serverId, arrivalState, j, j2, l2, l3, l4, l5, l6, f, i5, j4, location2, i3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationProgressEvent(String str, int i, int i2, ServerId serverId, ArrivalState arrivalState, float f, float f2, int i3, int i4, int i5, int i6, int i7, float f3, int i8, float f4, Location location, int i9) {
        super(str);
        int i11 = i;
        int i12 = i2;
        ServerId serverId2 = serverId;
        float f5 = f;
        float f6 = f2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        int i16 = i7;
        float f7 = f3;
        float f8 = f4;
        int i17 = i9;
        C21100e.m49359q(i11, "legIndex");
        this.f15112c = i11;
        C21100e.m49359q(i12, "pathIndex");
        this.f15113d = i12;
        C21100e.m49373x(serverId2, "currentGeofenceId");
        this.f15114e = serverId2;
        this.f15115f = arrivalState;
        C21100e.m49363s(f5, "distanceProgress");
        this.f15116g = f5;
        C21100e.m49363s(f6, "timeProgress");
        this.f15117h = f6;
        C21100e.m49359q(i13, "distToDest");
        this.f15118i = i13;
        C21100e.m49359q(i14, "stopsToDest");
        this.f15119j = i14;
        C21100e.m49359q(i15, "timeToDest");
        this.f15120k = i15;
        this.f15121l = i6;
        C21100e.m49359q(i16, "distanceToNextStop");
        this.f15122m = i16;
        C21100e.m49363s(f7, "distanceProgressToNextStop");
        this.f15123n = f7;
        this.f15124o = i8;
        C21100e.m49363s(f8, "timeProgressToNextStop");
        this.f15125p = f8;
        this.f15126q = location;
        C21100e.m49359q(i17, "expirationFromEtaSeconds");
        this.f15127r = i17;
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19864a(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_progress";
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f15113d), this.f15114e, Float.valueOf(this.f15116g), Float.valueOf(this.f15117h), Integer.valueOf(this.f15118i), Integer.valueOf(this.f15119j), Integer.valueOf(this.f15120k), Integer.valueOf(this.f15124o), Integer.valueOf(this.f15121l), Float.valueOf(this.f15123n), Float.valueOf(this.f15125p), this.f15126q, this.f15115f.name()};
        String str = C20964s0.f52718a;
        return String.format((Locale) null, "NavigationProgressEvent[pathIndex=%d currentGeofenceId=%s distanceProgress=%g timeProgress=%g distToDest=%d stopsToDest=%d timeToDest=%d timeToNextStop=%d nextStopIndex=%d distanceProgressToNextStop=%g timeProgressToNextStop=%g location=%s arrivalState=%s]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15110s);
    }
}
