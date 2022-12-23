package com.umo.ads.p350u;

import android.os.Parcel;
import android.os.Parcelable;
import com.cubic.umo.p045ad.ext.types.UMOAdKitInlineVideoPlayMode;
import mf0.C24362h;

/* renamed from: com.umo.ads.u.zzt */
public final class zzt implements Parcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C12098a();

    /* renamed from: b */
    public String f30885b;

    /* renamed from: c */
    public String f30886c;

    /* renamed from: d */
    public int f30887d;

    /* renamed from: e */
    public UMOAdKitInlineVideoPlayMode f30888e;

    /* renamed from: f */
    public zzc f30889f;

    /* renamed from: g */
    public zzq f30890g;

    /* renamed from: com.umo.ads.u.zzt$a */
    public static final class C12098a implements Parcelable.Creator<zzt> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new zzt(parcel.readString(), parcel.readString(), parcel.readInt(), UMOAdKitInlineVideoPlayMode.valueOf(parcel.readString()), zzc.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : zzq.CREATOR.createFromParcel(parcel));
        }

        public final Object[] newArray(int i) {
            return new zzt[i];
        }
    }

    public zzt() {
        this(0);
    }

    public zzt(String str, String str2, int i, UMOAdKitInlineVideoPlayMode uMOAdKitInlineVideoPlayMode, zzc zzc, zzq zzq) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(uMOAdKitInlineVideoPlayMode, "videoPlayMode");
        C24362h.m61211f(zzc, "adPlacement");
        this.f30885b = str;
        this.f30886c = str2;
        this.f30887d = i;
        this.f30888e = uMOAdKitInlineVideoPlayMode;
        this.f30889f = zzc;
        this.f30890g = zzq;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f30885b);
        parcel.writeString(this.f30886c);
        parcel.writeInt(this.f30887d);
        parcel.writeString(this.f30888e.name());
        parcel.writeString(this.f30889f.name());
        zzq zzq = this.f30890g;
        if (zzq == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        zzq.writeToParcel(parcel, i);
    }

    public /* synthetic */ zzt(int i) {
        this("", (String) null, 0, UMOAdKitInlineVideoPlayMode.NONE, zzc.INLINE, (zzq) null);
    }
}
