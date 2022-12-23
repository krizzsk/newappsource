package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.zze;
import java.util.List;
import p382be.C13592c0;

@SafeParcelable.Class(creator = "DefaultAuthResultCreator")
public final class zzr implements AuthResult {
    public static final Parcelable.Creator<zzr> CREATOR = new C13592c0();
    @SafeParcelable.Field(getter = "getUser", mo65739id = 1)

    /* renamed from: b */
    public zzx f36439b;
    @SafeParcelable.Field(getter = "getAdditionalUserInfo", mo65739id = 2)

    /* renamed from: c */
    public zzp f36440c;
    @SafeParcelable.Field(getter = "getOAuthCredential", mo65739id = 3)

    /* renamed from: d */
    public zze f36441d;

    public zzr(zzx zzx) {
        zzx zzx2 = (zzx) Preconditions.checkNotNull(zzx);
        this.f36439b = zzx2;
        List list = zzx2.f36454f;
        this.f36440c = null;
        for (int i = 0; i < list.size(); i++) {
            if (!TextUtils.isEmpty(((zzt) list.get(i)).f36449i)) {
                this.f36440c = new zzp(((zzt) list.get(i)).f36443c, ((zzt) list.get(i)).f36449i, zzx.f36459k);
            }
        }
        if (this.f36440c == null) {
            this.f36440c = new zzp(zzx.f36459k);
        }
        this.f36441d = zzx.f36460l;
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(mo65742id = 1) zzx zzx, @SafeParcelable.Param(mo65742id = 2) zzp zzp, @SafeParcelable.Param(mo65742id = 3) zze zze) {
        this.f36439b = zzx;
        this.f36440c = zzp;
        this.f36441d = zze;
    }

    /* renamed from: F0 */
    public final zzx mo43267F0() {
        return this.f36439b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f36439b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f36440c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f36441d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
