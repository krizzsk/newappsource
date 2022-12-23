package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13426m;

@SafeParcelable.Class(creator = "DefaultForceResendingTokenCreator")
public class PhoneAuthProvider$ForceResendingToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PhoneAuthProvider$ForceResendingToken> CREATOR = new C13426m();

    public final void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }
}
