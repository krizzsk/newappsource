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

public class CarpoolCenterPayload extends GcmPayload {
    public static final Parcelable.Creator<CarpoolCenterPayload> CREATOR = new C15902a();

    /* renamed from: c */
    public static final C15903b f41528c = new C15903b();

    /* renamed from: d */
    public static final C15904c f41529d = new C15904c(CarpoolCenterPayload.class);

    /* renamed from: com.moovit.gcm.payload.CarpoolCenterPayload$a */
    public class C15902a implements Parcelable.Creator<CarpoolCenterPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolCenterPayload) C19612n.m46981v(parcel, CarpoolCenterPayload.f41529d);
        }

        public final Object[] newArray(int i) {
            return new CarpoolCenterPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolCenterPayload$b */
    public class C15903b extends C19621u<CarpoolCenterPayload> {
        public C15903b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((CarpoolCenterPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolCenterPayload$c */
    public class C15904c extends C19620t<CarpoolCenterPayload> {
        public C15904c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarpoolCenterPayload(pVar.mo51947p());
        }
    }

    public CarpoolCenterPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48025p(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "carpool_tab";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41528c);
    }
}
