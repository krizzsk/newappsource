package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodShuttleStop implements Parcelable {
    public static final Parcelable.Creator<TodShuttleStop> CREATOR = new C15560a();

    /* renamed from: e */
    public static final C15561b f40426e = new C15561b(TodShuttleStop.class);

    /* renamed from: b */
    public final ServerId f40427b;

    /* renamed from: c */
    public final LatLonE6 f40428c;

    /* renamed from: d */
    public final String f40429d;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleStop$a */
    public class C15560a implements Parcelable.Creator<TodShuttleStop> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodShuttleStop) C19612n.m46981v(parcel, TodShuttleStop.f40426e);
        }

        public final Object[] newArray(int i) {
            return new TodShuttleStop[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleStop$b */
    public class C15561b extends C19619s<TodShuttleStop> {
        public C15561b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new TodShuttleStop(new ServerId(pVar.mo51924l()), (LatLonE6) LatLonE6.f40979g.read(pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodShuttleStop todShuttleStop = (TodShuttleStop) obj;
            ServerId serverId = todShuttleStop.f40427b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            LatLonE6.f40978f.write(todShuttleStop.f40428c, qVar);
            qVar.mo51954p(todShuttleStop.f40429d);
        }
    }

    public TodShuttleStop(ServerId serverId, LatLonE6 latLonE6, String str) {
        this.f40427b = serverId;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f40428c = latLonE6;
        C21100e.m49373x(str, "name");
        this.f40429d = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TodShuttleStop)) {
            return false;
        }
        return this.f40427b.equals(((TodShuttleStop) obj).f40427b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f40427b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodShuttleStop{id=");
        k.append(this.f40427b);
        k.append(", location=");
        k.append(this.f40428c);
        k.append(", name='");
        k.append(this.f40429d);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40426e);
    }
}
