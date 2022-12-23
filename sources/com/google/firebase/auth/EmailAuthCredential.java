package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13428o;

@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new C13428o();
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 1)

    /* renamed from: b */
    public String f36375b;
    @SafeParcelable.Field(getter = "getPassword", mo65739id = 2)

    /* renamed from: c */
    public String f36376c;
    @SafeParcelable.Field(getter = "getSignInLink", mo65739id = 3)

    /* renamed from: d */
    public final String f36377d;
    @SafeParcelable.Field(getter = "getCachedState", mo65739id = 4)

    /* renamed from: e */
    public String f36378e;
    @SafeParcelable.Field(getter = "isForLinking", mo65739id = 5)

    /* renamed from: f */
    public boolean f36379f;

    @SafeParcelable.Constructor
    public EmailAuthCredential(@SafeParcelable.Param(mo65742id = 5) boolean z, @SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) String str4) {
        this.f36375b = Preconditions.checkNotEmpty(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f36376c = str2;
            this.f36377d = str3;
            this.f36378e = str4;
            this.f36379f = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "password";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36375b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36376c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36377d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36378e, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f36379f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
