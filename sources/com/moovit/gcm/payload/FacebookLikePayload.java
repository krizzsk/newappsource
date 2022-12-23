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

public class FacebookLikePayload extends GcmPayload {
    public static final Parcelable.Creator<FacebookLikePayload> CREATOR = new C15917a();

    /* renamed from: c */
    public static final C15918b f41542c = new C15918b();

    /* renamed from: d */
    public static final C15919c f41543d = new C15919c(FacebookLikePayload.class);

    /* renamed from: com.moovit.gcm.payload.FacebookLikePayload$a */
    public class C15917a implements Parcelable.Creator<FacebookLikePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (FacebookLikePayload) C19612n.m46981v(parcel, FacebookLikePayload.f41543d);
        }

        public final Object[] newArray(int i) {
            return new FacebookLikePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.FacebookLikePayload$b */
    public class C15918b extends C19621u<FacebookLikePayload> {
        public C15918b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((FacebookLikePayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.FacebookLikePayload$c */
    public class C15919c extends C19620t<FacebookLikePayload> {
        public C15919c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new FacebookLikePayload(pVar.mo51947p());
        }
    }

    public FacebookLikePayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48035z(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "fb_like";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41542c);
    }
}
