package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p382be.C13606n;

@SafeParcelable.Class(creator = "MultiFactorInfoListCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new C13606n();
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", mo65739id = 1)

    /* renamed from: b */
    public final List f36435b;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(mo65742id = 1) ArrayList arrayList) {
        this.f36435b = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f36435b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
