package com.umo.ads.p350u;

import android.os.Parcel;
import android.os.Parcelable;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import mf0.C24362h;

/* renamed from: com.umo.ads.u.zzr */
public final class zzr implements Parcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C12097a();

    /* renamed from: b */
    public String f30879b;

    /* renamed from: c */
    public String f30880c;

    /* renamed from: d */
    public String f30881d;

    /* renamed from: e */
    public String f30882e;

    /* renamed from: f */
    public UMOAdKitInlineVideoPlayMode f30883f;

    /* renamed from: g */
    public zzc f30884g;

    /* renamed from: com.umo.ads.u.zzr$a */
    public static final class C12097a implements Parcelable.Creator<zzr> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new zzr(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), UMOAdKitInlineVideoPlayMode.valueOf(parcel.readString()), zzc.valueOf(parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new zzr[i];
        }
    }

    public zzr() {
        this(0);
    }

    public zzr(String str, String str2, String str3, String str4, UMOAdKitInlineVideoPlayMode uMOAdKitInlineVideoPlayMode, zzc zzc) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitInlineVideoPlayMode, "videoPlayMode");
        C24362h.m61211f(zzc, "adPlacement");
        this.f30879b = str;
        this.f30880c = str2;
        this.f30881d = str3;
        this.f30882e = str4;
        this.f30883f = uMOAdKitInlineVideoPlayMode;
        this.f30884g = zzc;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f30879b);
        parcel.writeString(this.f30880c);
        parcel.writeString(this.f30881d);
        parcel.writeString(this.f30882e);
        parcel.writeString(this.f30883f.name());
        parcel.writeString(this.f30884g.name());
    }

    public /* synthetic */ zzr(int i) {
        this("", (String) null, (String) null, (String) null, UMOAdKitInlineVideoPlayMode.NONE, zzc.INLINE);
    }
}
