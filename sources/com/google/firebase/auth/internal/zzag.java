package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorSession;
import java.util.ArrayList;
import java.util.List;
import p382be.C13595e;

@SafeParcelable.Class(creator = "DefaultMultiFactorSessionCreator")
public final class zzag extends MultiFactorSession {
    public static final Parcelable.Creator<zzag> CREATOR = new C13595e();
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 1)

    /* renamed from: b */
    public String f36432b;
    @SafeParcelable.Field(getter = "getPendingCredential", mo65739id = 2)

    /* renamed from: c */
    public String f36433c;
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", mo65739id = 3)

    /* renamed from: d */
    public List f36434d;

    public zzag() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36432b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36433c, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f36434d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzag(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) ArrayList arrayList) {
        this.f36432b = str;
        this.f36433c = str2;
        this.f36434d = arrayList;
    }
}
