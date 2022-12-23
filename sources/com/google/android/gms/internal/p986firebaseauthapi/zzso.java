package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.zze;
import java.util.List;
import p583jk.C17884p;

@SafeParcelable.Class(creator = "OnFailedMfaSignInAidlResponseCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzso */
public final class zzso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzso> CREATOR = new zzsp();
    @SafeParcelable.Field(getter = "getMfaPendingCredential", mo65739id = 1)
    public final String zza;
    @SafeParcelable.Field(getter = "getMfaInfoList", mo65739id = 2)
    public final List zzb;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", mo65739id = 3)
    public final zze zzc;

    @SafeParcelable.Constructor
    public zzso(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) List list, @SafeParcelable.Param(mo65742id = 3) zze zze) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zze;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zze zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final List zzc() {
        return C17884p.m44367f0(this.zzb);
    }
}
