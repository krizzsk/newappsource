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

public class SpreadTheLovePayload extends GcmPayload {
    public static final Parcelable.Creator<SpreadTheLovePayload> CREATOR = new C15957a();

    /* renamed from: c */
    public static final C15958b f41578c = new C15958b();

    /* renamed from: d */
    public static final C15959c f41579d = new C15959c(SpreadTheLovePayload.class);

    /* renamed from: com.moovit.gcm.payload.SpreadTheLovePayload$a */
    public class C15957a implements Parcelable.Creator<SpreadTheLovePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (SpreadTheLovePayload) C19612n.m46981v(parcel, SpreadTheLovePayload.f41579d);
        }

        public final Object[] newArray(int i) {
            return new SpreadTheLovePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.SpreadTheLovePayload$b */
    public class C15958b extends C19621u<SpreadTheLovePayload> {
        public C15958b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((SpreadTheLovePayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.SpreadTheLovePayload$c */
    public class C15959c extends C19620t<SpreadTheLovePayload> {
        public C15959c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new SpreadTheLovePayload(pVar.mo51947p());
        }
    }

    public SpreadTheLovePayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48030u(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "spread_the_love";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41578c);
    }
}
