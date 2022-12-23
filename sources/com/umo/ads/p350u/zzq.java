package com.umo.ads.p350u;

import android.os.Parcel;
import android.os.Parcelable;
import mf0.C24362h;

/* renamed from: com.umo.ads.u.zzq */
public final class zzq implements Parcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C12096a();

    /* renamed from: b */
    public String f30873b;

    /* renamed from: c */
    public String f30874c;

    /* renamed from: d */
    public String f30875d;

    /* renamed from: e */
    public String f30876e;

    /* renamed from: f */
    public String f30877f;

    /* renamed from: g */
    public String f30878g;

    /* renamed from: com.umo.ads.u.zzq$a */
    public static final class C12096a implements Parcelable.Creator<zzq> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new zzq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new zzq[i];
        }
    }

    public zzq() {
        this(0);
    }

    public zzq(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f30873b = str;
        this.f30874c = str2;
        this.f30875d = str3;
        this.f30876e = str4;
        this.f30877f = str5;
        this.f30878g = str6;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f30873b);
        parcel.writeString(this.f30874c);
        parcel.writeString(this.f30875d);
        parcel.writeString(this.f30876e);
        parcel.writeString(this.f30877f);
        parcel.writeString(this.f30878g);
    }

    public /* synthetic */ zzq(int i) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
