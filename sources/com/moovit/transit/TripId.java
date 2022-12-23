package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.network.model.LongServerId;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class TripId implements Parcelable, Comparable<TripId> {
    public static final Parcelable.Creator<TripId> CREATOR = new C7839a();

    /* renamed from: d */
    public static C7840b f23763d = new C7840b(TripId.class);

    /* renamed from: b */
    public final LongServerId f23764b;

    /* renamed from: c */
    public final long f23765c;

    /* renamed from: com.moovit.transit.TripId$a */
    public class C7839a implements Parcelable.Creator<TripId> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripId) C19612n.m46981v(parcel, TripId.f23763d);
        }

        public final Object[] newArray(int i) {
            return new TripId[i];
        }
    }

    /* renamed from: com.moovit.transit.TripId$b */
    public class C7840b extends C19619s<TripId> {
        public C7840b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            LongServerId longServerId;
            if (i >= 1) {
                LongServerId.C4252b bVar = LongServerId.f15136c;
                pVar.getClass();
                longServerId = (LongServerId) bVar.read(pVar);
            } else {
                pVar.getClass();
                longServerId = new LongServerId((long) pVar.mo51924l());
            }
            return new TripId(longServerId, pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TripId tripId = (TripId) obj;
            LongServerId longServerId = tripId.f23764b;
            LongServerId.C4252b bVar = LongServerId.f15136c;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(longServerId, qVar);
            qVar.mo51940m(tripId.f23765c);
        }
    }

    public TripId(LongServerId longServerId, long j) {
        C21100e.m49373x(longServerId, "serverId");
        this.f23764b = longServerId;
        this.f23765c = j;
    }

    public final int compareTo(Object obj) {
        TripId tripId = (TripId) obj;
        int compare = Long.compare(this.f23765c, tripId.f23765c);
        if (compare == 0) {
            return C20975x0.m49115b(this.f23764b.f15137b, tripId.f23764b.f15137b);
        }
        return compare;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TripId)) {
            return false;
        }
        TripId tripId = (TripId) obj;
        if (!this.f23764b.equals(tripId.f23764b) || this.f23765c != tripId.f23765c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23764b), C17884p.m44334E(this.f23765c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TripId[");
        k.append(this.f23764b);
        k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        return C25541a.m63884o(k, this.f23765c, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23763d);
    }
}
