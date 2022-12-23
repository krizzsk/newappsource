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

public class UserMessagePayload extends GcmPayload {
    public static final Parcelable.Creator<UserMessagePayload> CREATOR = new C15978a();

    /* renamed from: d */
    public static final C15979b f41603d = new C15979b();

    /* renamed from: e */
    public static final C15980c f41604e = new C15980c(UserMessagePayload.class);

    /* renamed from: c */
    public String f41605c;

    /* renamed from: com.moovit.gcm.payload.UserMessagePayload$a */
    public class C15978a implements Parcelable.Creator<UserMessagePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (UserMessagePayload) C19612n.m46981v(parcel, UserMessagePayload.f41604e);
        }

        public final Object[] newArray(int i) {
            return new UserMessagePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.UserMessagePayload$b */
    public class C15979b extends C19621u<UserMessagePayload> {
        public C15979b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            UserMessagePayload userMessagePayload = (UserMessagePayload) obj;
            qVar.mo51954p(userMessagePayload.f41546b);
            qVar.mo51955t(userMessagePayload.f41605c);
        }
    }

    /* renamed from: com.moovit.gcm.payload.UserMessagePayload$c */
    public class C15980c extends C19620t<UserMessagePayload> {
        public C15980c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new UserMessagePayload(pVar.mo51947p(), pVar.mo51948t());
        }
    }

    public UserMessagePayload(String str, String str2) {
        super(str);
        this.f41605c = str2;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48011c(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "user_message";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41603d);
    }
}
