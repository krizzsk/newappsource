package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import p908xd.C20458b;
import p955zd.C20819d;

@SafeParcelable.Class(creator = "ActionImplCreator")
@SafeParcelable.Reserved({1000})
public final class zzc extends AbstractSafeParcelable implements C20458b {
    public static final Parcelable.Creator<zzc> CREATOR = new C20819d();
    @SafeParcelable.Field(getter = "getActionType", mo65739id = 1)

    /* renamed from: b */
    public final String f36350b;
    @SafeParcelable.Field(getter = "getObjectName", mo65739id = 2)

    /* renamed from: c */
    public final String f36351c;
    @SafeParcelable.Field(getter = "getObjectUrl", mo65739id = 3)

    /* renamed from: d */
    public final String f36352d;
    @SafeParcelable.Field(getter = "getObjectSameAs", mo65739id = 4)

    /* renamed from: e */
    public final String f36353e;
    @SafeParcelable.Field(getter = "getMetadata", mo65739id = 5)

    /* renamed from: f */
    public final zzb f36354f;
    @SafeParcelable.Field(getter = "getActionStatus", mo65739id = 6)

    /* renamed from: g */
    public final String f36355g;
    @SafeParcelable.Field(getter = "getPropertyBundle", mo65739id = 7)

    /* renamed from: h */
    public final Bundle f36356h;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) String str4, @SafeParcelable.Param(mo65742id = 5) zzb zzb, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) Bundle bundle) {
        this.f36350b = str;
        this.f36351c = str2;
        this.f36352d = str3;
        this.f36353e = str4;
        this.f36354f = zzb;
        this.f36355g = str5;
        if (bundle != null) {
            this.f36356h = bundle;
        } else {
            this.f36356h = Bundle.EMPTY;
        }
        ClassLoader classLoader = zzc.class.getClassLoader();
        zzbp.zza(classLoader);
        this.f36356h.setClassLoader(classLoader);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ActionImpl { { actionType: '");
        k.append(this.f36350b);
        k.append("' } { objectName: '");
        k.append(this.f36351c);
        k.append("' } { objectUrl: '");
        k.append(this.f36352d);
        k.append("' } ");
        if (this.f36353e != null) {
            k.append("{ objectSameAs: '");
            k.append(this.f36353e);
            k.append("' } ");
        }
        if (this.f36354f != null) {
            k.append("{ metadata: '");
            k.append(this.f36354f.toString());
            k.append("' } ");
        }
        if (this.f36355g != null) {
            k.append("{ actionStatus: '");
            k.append(this.f36355g);
            k.append("' } ");
        }
        if (!this.f36356h.isEmpty()) {
            k.append("{ ");
            k.append(this.f36356h);
            k.append(" } ");
        }
        k.append("}");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f36350b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f36351c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f36352d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f36353e, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f36354f, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.f36355g, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f36356h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
