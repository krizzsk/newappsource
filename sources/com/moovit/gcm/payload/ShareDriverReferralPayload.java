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

public class ShareDriverReferralPayload extends GcmPayload {
    public static final Parcelable.Creator<ShareDriverReferralPayload> CREATOR = new C15954a();

    /* renamed from: c */
    public static final C15955b f41576c = new C15955b();

    /* renamed from: d */
    public static final C15956c f41577d = new C15956c(ShareDriverReferralPayload.class);

    /* renamed from: com.moovit.gcm.payload.ShareDriverReferralPayload$a */
    public class C15954a implements Parcelable.Creator<ShareDriverReferralPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (ShareDriverReferralPayload) C19612n.m46981v(parcel, ShareDriverReferralPayload.f41577d);
        }

        public final Object[] newArray(int i) {
            return new ShareDriverReferralPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.ShareDriverReferralPayload$b */
    public class C15955b extends C19621u<ShareDriverReferralPayload> {
        public C15955b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((ShareDriverReferralPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.ShareDriverReferralPayload$c */
    public class C15956c extends C19620t<ShareDriverReferralPayload> {
        public C15956c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new ShareDriverReferralPayload(pVar.mo51947p());
        }
    }

    public ShareDriverReferralPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48024o(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "share_driver_referral";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41576c);
    }
}
