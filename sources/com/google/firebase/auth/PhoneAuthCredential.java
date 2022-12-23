package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p357ae.C13420g;

@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new C13420g();
    @SafeParcelable.Field(getter = "getSessionInfo", mo65739id = 1)

    /* renamed from: b */
    public String f36398b;
    @SafeParcelable.Field(getter = "getSmsCode", mo65739id = 2)

    /* renamed from: c */
    public String f36399c;
    @SafeParcelable.Field(getter = "getHasVerificationProof", mo65739id = 3)

    /* renamed from: d */
    public boolean f36400d;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 4)

    /* renamed from: e */
    public String f36401e;
    @SafeParcelable.Field(getter = "getAutoCreate", mo65739id = 5)

    /* renamed from: f */
    public boolean f36402f;
    @SafeParcelable.Field(getter = "getTemporaryProof", mo65739id = 6)

    /* renamed from: g */
    public String f36403g;
    @SafeParcelable.Field(getter = "getMfaEnrollmentId", mo65739id = 7)

    /* renamed from: h */
    public String f36404h;

    @SafeParcelable.Constructor
    public PhoneAuthCredential(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 4) String str3, @SafeParcelable.Param(mo65742id = 6) String str4, @SafeParcelable.Param(mo65742id = 7) String str5, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 5) boolean z2) {
        boolean z3 = false;
        if ((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || ((z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))))) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f36398b = str;
        this.f36399c = str2;
        this.f36400d = z;
        this.f36401e = str3;
        this.f36402f = z2;
        this.f36403g = str4;
        this.f36404h = str5;
    }

    public final Object clone() throws CloneNotSupportedException {
        String str = this.f36398b;
        String str2 = this.f36399c;
        boolean z = this.f36400d;
        return new PhoneAuthCredential(str, str2, this.f36401e, this.f36403g, this.f36404h, z, this.f36402f);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return "phone";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36398b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36399c, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f36400d);
        SafeParcelWriter.writeString(parcel, 4, this.f36401e, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f36402f);
        SafeParcelWriter.writeString(parcel, 6, this.f36403g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f36404h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
