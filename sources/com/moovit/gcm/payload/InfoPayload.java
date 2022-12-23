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

public class InfoPayload extends GcmPayload {
    public static final Parcelable.Creator<InfoPayload> CREATOR = new C15924a();

    /* renamed from: c */
    public static final C15925b f41547c = new C15925b();

    /* renamed from: d */
    public static final C15926c f41548d = new C15926c(InfoPayload.class);

    /* renamed from: com.moovit.gcm.payload.InfoPayload$a */
    public class C15924a implements Parcelable.Creator<InfoPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (InfoPayload) C19612n.m46981v(parcel, InfoPayload.f41548d);
        }

        public final Object[] newArray(int i) {
            return new InfoPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.InfoPayload$b */
    public class C15925b extends C19621u<InfoPayload> {
        public C15925b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((InfoPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.InfoPayload$c */
    public class C15926c extends C19620t<InfoPayload> {
        public C15926c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new InfoPayload(pVar.mo51947p());
        }
    }

    public InfoPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48015g();
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "info";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41547c);
    }
}
