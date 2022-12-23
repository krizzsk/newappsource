package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p955zd.C20822g;

@SafeParcelable.Class(creator = "CallStatusCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C20822g();
    @SafeParcelable.Field(mo65739id = 1)

    /* renamed from: b */
    public final int f36357b;

    static {
        new zzg(1);
        new zzg(2);
        new zzg(3);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(mo65742id = 1) int i) {
        this.f36357b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f36357b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
