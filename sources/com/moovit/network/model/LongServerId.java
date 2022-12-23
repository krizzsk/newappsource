package com.moovit.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public final class LongServerId implements Parcelable {
    public static final Parcelable.Creator<LongServerId> CREATOR = new C4251a();

    /* renamed from: c */
    public static final C4252b f15136c = new C4252b(LongServerId.class);

    /* renamed from: b */
    public final long f15137b;

    /* renamed from: com.moovit.network.model.LongServerId$a */
    public class C4251a implements Parcelable.Creator<LongServerId> {
        public final Object createFromParcel(Parcel parcel) {
            return (LongServerId) C19612n.m46981v(parcel, LongServerId.f15136c);
        }

        public final Object[] newArray(int i) {
            return new LongServerId[i];
        }
    }

    /* renamed from: com.moovit.network.model.LongServerId$b */
    public class C4252b extends C19619s<LongServerId> {
        public C4252b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new LongServerId(pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51940m(((LongServerId) obj).f15137b);
        }
    }

    public LongServerId(long j) {
        this.f15137b = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof LongServerId) && this.f15137b == ((LongServerId) obj).f15137b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44334E(this.f15137b);
    }

    public final String toString() {
        return Long.toString(this.f15137b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15136c);
    }
}
