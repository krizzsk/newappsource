package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.Iterator;
import p382be.C13593d;

@SafeParcelable.Class(creator = "DefaultMultiFactorResolverCreator")
public final class zzae extends MultiFactorResolver {
    public static final Parcelable.Creator<zzae> CREATOR = new C13593d();
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfoList", mo65739id = 1)

    /* renamed from: b */
    public final ArrayList f36427b = new ArrayList();
    @SafeParcelable.Field(getter = "getSession", mo65739id = 2)

    /* renamed from: c */
    public final zzag f36428c;
    @SafeParcelable.Field(getter = "getFirebaseAppName", mo65739id = 3)

    /* renamed from: d */
    public final String f36429d;
    @SafeParcelable.Field(getter = "getDefaultOAuthCredential", mo65739id = 4)

    /* renamed from: e */
    public final zze f36430e;
    @SafeParcelable.Field(getter = "getReauthUser", mo65739id = 5)

    /* renamed from: f */
    public final zzx f36431f;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(mo65742id = 1) ArrayList arrayList, @SafeParcelable.Param(mo65742id = 2) zzag zzag, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) zze zze, @SafeParcelable.Param(mo65742id = 5) zzx zzx) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                this.f36427b.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        this.f36428c = (zzag) Preconditions.checkNotNull(zzag);
        this.f36429d = Preconditions.checkNotEmpty(str);
        this.f36430e = zze;
        this.f36431f = zzx;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f36427b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f36428c, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36429d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f36430e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f36431f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
