package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SendVerificationCodeAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzri */
public final class zzri extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzri> CREATOR = new zzrj();
    @SafeParcelable.Field(getter = "getSendVerificationCodeRequest", mo65739id = 1)
    private final zzzn zza;

    @SafeParcelable.Constructor
    public zzri(@SafeParcelable.Param(mo65742id = 1) zzzn zzzn) {
        this.zza = zzzn;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzzn zza() {
        return this.zza;
    }
}
