package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.FirebaseUserMetadata;
import p382be.C13591c;

@SafeParcelable.Class(creator = "DefaultFirebaseUserMetadataCreator")
public final class zzz implements FirebaseUserMetadata {
    public static final Parcelable.Creator<zzz> CREATOR = new C13591c();
    @SafeParcelable.Field(getter = "getLastSignInTimestamp", mo65739id = 1)

    /* renamed from: b */
    public final long f36462b;
    @SafeParcelable.Field(getter = "getCreationTimestamp", mo65739id = 2)

    /* renamed from: c */
    public final long f36463c;

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) long j2) {
        this.f36462b = j;
        this.f36463c = j2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f36462b);
        SafeParcelWriter.writeLong(parcel, 2, this.f36463c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
