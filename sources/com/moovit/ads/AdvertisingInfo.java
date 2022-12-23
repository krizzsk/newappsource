package com.moovit.ads;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class AdvertisingInfo implements Parcelable {
    public static final Parcelable.Creator<AdvertisingInfo> CREATOR = new C14699a();

    /* renamed from: f */
    public static final C14700b f37361f = new C14700b();

    /* renamed from: g */
    public static final C14701c f37362g = new C14701c(AdvertisingInfo.class);

    /* renamed from: b */
    public final String f37363b;

    /* renamed from: c */
    public final String f37364c;

    /* renamed from: d */
    public final String f37365d;

    /* renamed from: e */
    public final boolean f37366e;

    /* renamed from: com.moovit.ads.AdvertisingInfo$a */
    public class C14699a implements Parcelable.Creator<AdvertisingInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (AdvertisingInfo) C19612n.m46981v(parcel, AdvertisingInfo.f37362g);
        }

        public final Object[] newArray(int i) {
            return new AdvertisingInfo[i];
        }
    }

    /* renamed from: com.moovit.ads.AdvertisingInfo$b */
    public class C14700b extends C19621u<AdvertisingInfo> {
        public C14700b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
            qVar.mo51954p(advertisingInfo.f37363b);
            qVar.mo51954p(advertisingInfo.f37364c);
            qVar.mo51934b(advertisingInfo.f37366e);
            qVar.mo51955t(advertisingInfo.f37365d);
        }
    }

    /* renamed from: com.moovit.ads.AdvertisingInfo$c */
    public class C14701c extends C19620t<AdvertisingInfo> {
        public C14701c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            String str;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            boolean b = pVar.mo51919b();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new AdvertisingInfo(p, p2, str, b);
        }
    }

    public AdvertisingInfo(String str, String str2, String str3, boolean z) {
        C21100e.m49373x(str, "googleAdvertisingId");
        this.f37363b = str;
        C21100e.m49373x(str2, "appsFlyerId");
        this.f37364c = str2;
        this.f37365d = str3;
        this.f37366e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdvertisingInfo)) {
            return false;
        }
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj;
        if (!this.f37363b.equals(advertisingInfo.f37363b) || !this.f37364c.equals(advertisingInfo.f37364c) || !C20975x0.m49118e(this.f37365d, advertisingInfo.f37365d) || this.f37366e != advertisingInfo.f37366e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f37363b), C17884p.m44335F(this.f37364c), C17884p.m44335F(this.f37365d), this.f37366e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37361f);
    }
}
