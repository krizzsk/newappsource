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

public class LinesPayload extends GcmPayload {
    public static final Parcelable.Creator<LinesPayload> CREATOR = new C15933a();

    /* renamed from: d */
    public static final C15934b f41559d = new C15934b();

    /* renamed from: e */
    public static final C15935c f41560e = new C15935c(LinesPayload.class);

    /* renamed from: c */
    public final String f41561c;

    /* renamed from: com.moovit.gcm.payload.LinesPayload$a */
    public class C15933a implements Parcelable.Creator<LinesPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (LinesPayload) C19612n.m46981v(parcel, LinesPayload.f41560e);
        }

        public final Object[] newArray(int i) {
            return new LinesPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.LinesPayload$b */
    public class C15934b extends C19621u<LinesPayload> {
        public C15934b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LinesPayload linesPayload = (LinesPayload) obj;
            qVar.mo51954p(linesPayload.f41546b);
            qVar.mo51955t(linesPayload.f41561c);
        }
    }

    /* renamed from: com.moovit.gcm.payload.LinesPayload$c */
    public class C15935c extends C19620t<LinesPayload> {
        public C15935c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new LinesPayload(pVar.mo51947p(), pVar.mo51948t());
        }
    }

    public LinesPayload(String str, String str2) {
        super(str);
        this.f41561c = str2;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48032w(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "lines";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41559d);
    }
}
