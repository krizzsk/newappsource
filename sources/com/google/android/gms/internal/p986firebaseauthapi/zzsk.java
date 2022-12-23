package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.ActionCodeSettings;

@SafeParcelable.Class(creator = "VerifyBeforeUpdateEmailAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsk */
public final class zzsk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsk> CREATOR = new zzsl();
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getNewEmail", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getActionCodeSettings", mo65739id = 3)
    private final ActionCodeSettings zzc;

    @SafeParcelable.Constructor
    public zzsk(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = actionCodeSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ActionCodeSettings zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
