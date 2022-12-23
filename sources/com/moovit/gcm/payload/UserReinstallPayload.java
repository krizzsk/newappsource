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

public class UserReinstallPayload extends GcmPayload {
    public static final Parcelable.Creator<UserReinstallPayload> CREATOR = new C15981a();

    /* renamed from: c */
    public static final C15982b f41606c = new C15982b();

    /* renamed from: d */
    public static final C15983c f41607d = new C15983c(UserReinstallPayload.class);

    /* renamed from: com.moovit.gcm.payload.UserReinstallPayload$a */
    public class C15981a implements Parcelable.Creator<UserReinstallPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserReinstallPayload) C19612n.m46981v(parcel, UserReinstallPayload.f41607d);
        }

        public final Object[] newArray(int i) {
            return new UserReinstallPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.UserReinstallPayload$b */
    public class C15982b extends C19621u<UserReinstallPayload> {
        public C15982b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((UserReinstallPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.UserReinstallPayload$c */
    public class C15983c extends C19620t<UserReinstallPayload> {
        public C15983c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new UserReinstallPayload(pVar.mo51947p());
        }
    }

    public UserReinstallPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48033x(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "user_reinstall";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41606c);
    }
}
