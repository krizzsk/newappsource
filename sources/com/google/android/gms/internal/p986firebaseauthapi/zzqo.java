package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

@SafeParcelable.Class(creator = "FinalizeMfaEnrollmentAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqo */
public final class zzqo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqo> CREATOR = new zzqp();
    @SafeParcelable.Field(getter = "getPhoneAuthCredential", mo65739id = 1)
    private final PhoneAuthCredential zza;
    @SafeParcelable.Field(getter = "getCachedTokenState", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 3)
    private final String zzc;

    @SafeParcelable.Constructor
    public zzqo(@SafeParcelable.Param(mo65742id = 1) PhoneAuthCredential phoneAuthCredential, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2) {
        this.zza = phoneAuthCredential;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final PhoneAuthCredential zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }
}
