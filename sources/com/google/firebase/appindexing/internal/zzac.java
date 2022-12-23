package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import p955zd.C20835t;

@SafeParcelable.Class(creator = "MetadataCreator")
@SafeParcelable.Reserved({1000})
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C20835t();
    @SafeParcelable.Field(getter = "getWorksOffline", mo65739id = 1)

    /* renamed from: b */
    public final boolean f36339b;
    @SafeParcelable.Field(getter = "getScore", mo65739id = 2)

    /* renamed from: c */
    public final int f36340c;
    @SafeParcelable.Field(getter = "getAccountEmail", mo65739id = 3)

    /* renamed from: d */
    public final String f36341d;
    @SafeParcelable.Field(getter = "getPropertyBundle", mo65739id = 4)

    /* renamed from: e */
    public final Bundle f36342e;
    @SafeParcelable.Field(getter = "getEmbeddingProperties", mo65739id = 5)

    /* renamed from: f */
    public final Bundle f36343f;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(mo65742id = 1) boolean z, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) Bundle bundle, @SafeParcelable.Param(mo65742id = 5) Bundle bundle2) {
        this.f36339b = z;
        this.f36340c = i;
        this.f36341d = str;
        this.f36342e = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.f36343f = bundle2;
        ClassLoader classLoader = zzac.class.getClassLoader();
        zzbp.zza(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzac = (zzac) obj;
        if (!Objects.equal(Boolean.valueOf(this.f36339b), Boolean.valueOf(zzac.f36339b)) || !Objects.equal(Integer.valueOf(this.f36340c), Integer.valueOf(zzac.f36340c)) || !Objects.equal(this.f36341d, zzac.f36341d) || !Thing.m35908j2(this.f36342e, zzac.f36342e) || !Thing.m35908j2(this.f36343f, zzac.f36343f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f36339b), Integer.valueOf(this.f36340c), this.f36341d, Integer.valueOf(Thing.m35909k2(this.f36342e)), Integer.valueOf(Thing.m35909k2(this.f36343f)));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("worksOffline: ");
        k.append(this.f36339b);
        k.append(", score: ");
        k.append(this.f36340c);
        if (!this.f36341d.isEmpty()) {
            k.append(", accountEmail: ");
            k.append(this.f36341d);
        }
        Bundle bundle = this.f36342e;
        if (bundle != null && !bundle.isEmpty()) {
            k.append(", Properties { ");
            Thing.m35907i2(this.f36342e, k);
            k.append("}");
        }
        if (!this.f36343f.isEmpty()) {
            k.append(", embeddingProperties { ");
            Thing.m35907i2(this.f36343f, k);
            k.append("}");
        }
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f36339b);
        SafeParcelWriter.writeInt(parcel, 2, this.f36340c);
        SafeParcelWriter.writeString(parcel, 3, this.f36341d, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.f36342e, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.f36343f, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
