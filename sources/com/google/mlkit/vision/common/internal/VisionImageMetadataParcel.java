package com.google.mlkit.vision.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p815tg.C19679i;

@KeepForSdk
@SafeParcelable.Class(creator = "VisionImageMetadataParcelCreator")
public class VisionImageMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisionImageMetadataParcel> CREATOR = new C19679i();
    @SafeParcelable.Field(mo65739id = 1)
    @KeepForSdk

    /* renamed from: b */
    public final int f36792b;
    @SafeParcelable.Field(mo65739id = 2)
    @KeepForSdk

    /* renamed from: c */
    public final int f36793c;
    @SafeParcelable.Field(mo65739id = 4)
    @KeepForSdk

    /* renamed from: d */
    public final long f36794d;
    @SafeParcelable.Field(mo65739id = 5)
    @KeepForSdk

    /* renamed from: e */
    public final int f36795e;
    @SafeParcelable.Field(mo65739id = 3)

    /* renamed from: f */
    public final int f36796f;

    @SafeParcelable.Constructor
    public VisionImageMetadataParcel(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) long j, @SafeParcelable.Param(mo65742id = 5) int i4) {
        this.f36792b = i;
        this.f36793c = i2;
        this.f36796f = i3;
        this.f36794d = j;
        this.f36795e = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f36792b);
        SafeParcelWriter.writeInt(parcel, 2, this.f36793c);
        SafeParcelWriter.writeInt(parcel, 3, this.f36796f);
        SafeParcelWriter.writeLong(parcel, 4, this.f36794d);
        SafeParcelWriter.writeInt(parcel, 5, this.f36795e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
