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

public class LoginPayload extends GcmPayload {
    public static final Parcelable.Creator<LoginPayload> CREATOR = new C15936a();

    /* renamed from: c */
    public static final C15937b f41562c = new C15937b();

    /* renamed from: d */
    public static final C15938c f41563d = new C15938c(LoginPayload.class);

    /* renamed from: com.moovit.gcm.payload.LoginPayload$a */
    public class C15936a implements Parcelable.Creator<LoginPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (LoginPayload) C19612n.m46981v(parcel, LoginPayload.f41563d);
        }

        public final Object[] newArray(int i) {
            return new LoginPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.LoginPayload$b */
    public class C15937b extends C19621u<LoginPayload> {
        public C15937b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((LoginPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.LoginPayload$c */
    public class C15938c extends C19620t<LoginPayload> {
        public C15938c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new LoginPayload(pVar.mo51947p());
        }
    }

    public LoginPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48027r(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "login";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41562c);
    }
}
