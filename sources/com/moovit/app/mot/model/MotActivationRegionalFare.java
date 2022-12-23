package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.braze.models.BrazeGeofence;
import com.moovit.commons.utils.Color;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationRegionalFare implements Parcelable {
    public static final Parcelable.Creator<MotActivationRegionalFare> CREATOR = new C15151a();

    /* renamed from: f */
    public static final C15152b f39015f = new C15152b(MotActivationRegionalFare.class);

    /* renamed from: b */
    public final ServerId f39016b;

    /* renamed from: c */
    public final int f39017c;

    /* renamed from: d */
    public final Color f39018d;

    /* renamed from: e */
    public final List<MotActivationRegionFare> f39019e;

    /* renamed from: com.moovit.app.mot.model.MotActivationRegionalFare$a */
    public class C15151a implements Parcelable.Creator<MotActivationRegionalFare> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationRegionalFare) C19612n.m46981v(parcel, MotActivationRegionalFare.f39015f);
        }

        public final Object[] newArray(int i) {
            return new MotActivationRegionalFare[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationRegionalFare$b */
    public class C15152b extends C19619s<MotActivationRegionalFare> {
        public C15152b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new MotActivationRegionalFare(new ServerId(pVar.mo51924l()), pVar.mo51924l(), (Color) Color.f41006j.read(pVar), pVar.mo51959g(MotActivationRegionFare.f39012d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationRegionalFare motActivationRegionalFare = (MotActivationRegionalFare) obj;
            ServerId serverId = motActivationRegionalFare.f39016b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(motActivationRegionalFare.f39017c);
            Color.f41005i.write(motActivationRegionalFare.f39018d, qVar);
            qVar.mo51965h(motActivationRegionalFare.f39019e, MotActivationRegionFare.f39012d);
        }
    }

    public MotActivationRegionalFare(ServerId serverId, int i, Color color, ArrayList arrayList) {
        this.f39016b = serverId;
        C21100e.m49359q(i, BrazeGeofence.RADIUS_METERS);
        this.f39017c = i;
        C21100e.m49373x(color, "color");
        this.f39018d = color;
        C21100e.m49373x(arrayList, "regionFares");
        this.f39019e = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivationRegionalFare)) {
            return false;
        }
        return this.f39016b.equals(((MotActivationRegionalFare) obj).f39016b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f39016b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39015f);
    }
}
