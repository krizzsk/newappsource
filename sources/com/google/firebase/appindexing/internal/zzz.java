package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p955zd.C20816a;

@SafeParcelable.Class(creator = "MutateRequestCreator")
@SafeParcelable.Reserved({4})
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C20816a();
    @SafeParcelable.Field(mo65739id = 1)

    /* renamed from: b */
    public final int f36358b;
    @SafeParcelable.Field(mo65739id = 2)

    /* renamed from: c */
    public final Thing[] f36359c;
    @SafeParcelable.Field(mo65739id = 3)

    /* renamed from: d */
    public final String[] f36360d;
    @SafeParcelable.Field(mo65739id = 5)

    /* renamed from: e */
    public final String[] f36361e;
    @SafeParcelable.Field(mo65739id = 6)

    /* renamed from: f */
    public final zzc f36362f;
    @SafeParcelable.Field(mo65739id = 7)

    /* renamed from: g */
    public final String f36363g;
    @SafeParcelable.Field(mo65739id = 8)

    /* renamed from: h */
    public final String f36364h;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) Thing[] thingArr, @SafeParcelable.Param(mo65742id = 3) String[] strArr, @SafeParcelable.Param(mo65742id = 5) String[] strArr2, @SafeParcelable.Param(mo65742id = 6) zzc zzc, @SafeParcelable.Param(mo65742id = 7) String str, @SafeParcelable.Param(mo65742id = 8) String str2) {
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7)) {
            i = 0;
        }
        this.f36358b = i;
        this.f36359c = thingArr;
        this.f36360d = strArr;
        this.f36361e = strArr2;
        this.f36362f = zzc;
        this.f36363g = str;
        this.f36364h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f36358b);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f36359c, i, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.f36360d, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.f36361e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f36362f, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.f36363g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f36364h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
