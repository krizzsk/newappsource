package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.braze.models.BrazeGeofence;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationFareInfo implements Parcelable {
    public static final Parcelable.Creator<MotActivationFareInfo> CREATOR = new C15143a();

    /* renamed from: d */
    public static final C15144b f39001d = new C15144b(MotActivationFareInfo.class);

    /* renamed from: b */
    public final ServerId f39002b;

    /* renamed from: c */
    public final int f39003c;

    /* renamed from: com.moovit.app.mot.model.MotActivationFareInfo$a */
    public class C15143a implements Parcelable.Creator<MotActivationFareInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationFareInfo) C19612n.m46981v(parcel, MotActivationFareInfo.f39001d);
        }

        public final Object[] newArray(int i) {
            return new MotActivationFareInfo[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationFareInfo$b */
    public class C15144b extends C19619s<MotActivationFareInfo> {
        public C15144b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new MotActivationFareInfo(pVar.mo51924l(), new ServerId(pVar.mo51924l()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationFareInfo motActivationFareInfo = (MotActivationFareInfo) obj;
            ServerId serverId = motActivationFareInfo.f39002b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(motActivationFareInfo.f39003c);
        }
    }

    public MotActivationFareInfo(int i, ServerId serverId) {
        this.f39002b = serverId;
        C21100e.m49359q(i, BrazeGeofence.RADIUS_METERS);
        this.f39003c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivationFareInfo)) {
            return false;
        }
        return this.f39002b.equals(((MotActivationFareInfo) obj).f39002b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f39002b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39001d);
    }
}
