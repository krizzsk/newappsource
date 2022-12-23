package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "FinalizeMfaSignInAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqq */
public final class zzqq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqq> CREATOR = new zzqr();
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", mo65739id = 1)
    private final PhoneAuthCredential zza;
    @SafeParcelable.Field(getter = "getPendingCredential", mo65739id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zzqq(@SafeParcelable.Param(mo65742id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(mo65742id = 2) String str) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
