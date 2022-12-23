package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p986firebaseauthapi.zzaaa;
import com.google.android.gms.internal.p986firebaseauthapi.zzag;
import p357ae.C13427n;

@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new C13427n();
    @SafeParcelable.Field(getter = "getProvider", mo65739id = 1)

    /* renamed from: b */
    public final String f36464b;
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 2)

    /* renamed from: c */
    public final String f36465c;
    @SafeParcelable.Field(getter = "getAccessToken", mo65739id = 3)

    /* renamed from: d */
    public final String f36466d;
    @SafeParcelable.Field(getter = "getWebSignInCredential", mo65739id = 4)

    /* renamed from: e */
    public final zzaaa f36467e;
    @SafeParcelable.Field(getter = "getPendingToken", mo65739id = 5)

    /* renamed from: f */
    public final String f36468f;
    @SafeParcelable.Field(getter = "getSecret", mo65739id = 6)

    /* renamed from: g */
    public final String f36469g;
    @SafeParcelable.Field(getter = "getRawNonce", mo65739id = 7)

    /* renamed from: h */
    public final String f36470h;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) zzaaa zzaaa, @SafeParcelable.Param(mo65742id = 5) String str4, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) String str6) {
        this.f36464b = zzag.zzc(str);
        this.f36465c = str2;
        this.f36466d = str3;
        this.f36467e = zzaaa;
        this.f36468f = str4;
        this.f36469g = str5;
        this.f36470h = str6;
    }

    /* renamed from: k2 */
    public static zze m35960k2(zzaaa zzaaa) {
        Preconditions.checkNotNull(zzaaa, "Must specify a non-null webSignInCredential");
        return new zze((String) null, (String) null, (String) null, zzaaa, (String) null, (String) null, (String) null);
    }

    /* renamed from: i2 */
    public final String mo43266i2() {
        return this.f36464b;
    }

    /* renamed from: j2 */
    public final AuthCredential mo43328j2() {
        return new zze(this.f36464b, this.f36465c, this.f36466d, this.f36467e, this.f36468f, this.f36469g, this.f36470h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36464b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36465c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36466d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f36467e, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f36468f, false);
        SafeParcelWriter.writeString(parcel, 6, this.f36469g, false);
        SafeParcelWriter.writeString(parcel, 7, this.f36470h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
