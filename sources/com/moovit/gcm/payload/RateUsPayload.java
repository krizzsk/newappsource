package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class RateUsPayload extends GcmPayload {
    public static final Parcelable.Creator<RateUsPayload> CREATOR = new C15945a();

    /* renamed from: c */
    public static final C15946b f41569c = new C15946b();

    /* renamed from: d */
    public static final C15947c f41570d = new C15947c(RateUsPayload.class);

    /* renamed from: com.moovit.gcm.payload.RateUsPayload$a */
    public class C15945a implements Parcelable.Creator<RateUsPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (RateUsPayload) C19612n.m46981v(parcel, RateUsPayload.f41570d);
        }

        public final Object[] newArray(int i) {
            return new RateUsPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.RateUsPayload$b */
    public class C15946b extends C19621u<RateUsPayload> {
        public C15946b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((RateUsPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.RateUsPayload$c */
    public class C15947c extends C19620t<RateUsPayload> {
        public C15947c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new RateUsPayload(pVar.mo51947p());
        }
    }

    public RateUsPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48028s(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "rate_us";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41569c);
    }
}
