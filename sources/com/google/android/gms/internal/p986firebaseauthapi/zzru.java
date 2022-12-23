package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

@SafeParcelable.Class(creator = "SignInWithEmailLinkAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzru */
public final class zzru extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzru> CREATOR = new zzrv();
    @SafeParcelable.Field(getter = "getCredential", mo65739id = 1)
    private final EmailAuthCredential zza;

    @SafeParcelable.Constructor
    public zzru(@SafeParcelable.Param(mo65742id = 1) EmailAuthCredential emailAuthCredential) {
        this.zza = emailAuthCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final EmailAuthCredential zza() {
        return this.zza;
    }
}
