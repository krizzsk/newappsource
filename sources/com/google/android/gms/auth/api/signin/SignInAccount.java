package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "SignInAccountCreator")
@SafeParcelable.Reserved({1})
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new zbc();
    @SafeParcelable.Field(defaultValue = "", mo65739id = 4)
    @Deprecated
    public String zba;
    @SafeParcelable.Field(defaultValue = "", mo65739id = 8)
    @Deprecated
    public String zbb;
    @SafeParcelable.Field(getter = "getGoogleSignInAccount", mo65739id = 7)
    private GoogleSignInAccount zbc;

    @SafeParcelable.Constructor
    public SignInAccount(@SafeParcelable.Param(mo65742id = 4) String str, @SafeParcelable.Param(mo65742id = 7) GoogleSignInAccount googleSignInAccount, @SafeParcelable.Param(mo65742id = 8) String str2) {
        this.zbc = googleSignInAccount;
        this.zba = Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 4, this.zba, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zbc, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zbb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
