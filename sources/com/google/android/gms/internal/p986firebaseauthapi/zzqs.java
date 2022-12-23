package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GetAccessTokenAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqs */
public final class zzqs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqs> CREATOR = new zzqt();
    @SafeParcelable.Field(getter = "getRefreshToken", mo65739id = 1)
    private final String zza;

    @SafeParcelable.Constructor
    public zzqs(@SafeParcelable.Param(mo65742id = 1) String str) {
        this.zza = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zza;
    }
}
