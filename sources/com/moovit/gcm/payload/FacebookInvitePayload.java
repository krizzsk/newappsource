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

public class FacebookInvitePayload extends GcmPayload {
    public static final Parcelable.Creator<FacebookInvitePayload> CREATOR = new C15914a();

    /* renamed from: c */
    public static final C15915b f41540c = new C15915b();

    /* renamed from: d */
    public static final C15916c f41541d = new C15916c(FacebookInvitePayload.class);

    /* renamed from: com.moovit.gcm.payload.FacebookInvitePayload$a */
    public class C15914a implements Parcelable.Creator<FacebookInvitePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (FacebookInvitePayload) C19612n.m46981v(parcel, FacebookInvitePayload.f41541d);
        }

        public final Object[] newArray(int i) {
            return new FacebookInvitePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.FacebookInvitePayload$b */
    public class C15915b extends C19621u<FacebookInvitePayload> {
        public C15915b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((FacebookInvitePayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.FacebookInvitePayload$c */
    public class C15916c extends C19620t<FacebookInvitePayload> {
        public C15916c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new FacebookInvitePayload(pVar.mo51947p());
        }
    }

    public FacebookInvitePayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48021l(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "fb_invite";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41540c);
    }
}
