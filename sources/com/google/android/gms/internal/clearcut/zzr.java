package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.clearcut.zzge;
import p001a0.C0016g;
import p358af.C13437d;

@SafeParcelable.Class(creator = "PlayLoggerContextCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(mo65739id = 2)
    private final String packageName;
    @SafeParcelable.Field(defaultValue = "true", mo65739id = 7)
    private final boolean zzay;
    @SafeParcelable.Field(mo65739id = 10)
    private final int zzaz;
    @SafeParcelable.Field(mo65739id = 3)
    private final int zzi;
    @SafeParcelable.Field(mo65739id = 8)
    public final String zzj;
    @SafeParcelable.Field(mo65739id = 4)
    public final int zzk;
    @SafeParcelable.Field(mo65739id = 5)
    private final String zzl;
    @SafeParcelable.Field(mo65739id = 6)
    private final String zzm;
    @SafeParcelable.Field(mo65739id = 9)
    private final boolean zzn;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, zzge.zzv.zzb zzb) {
        this.packageName = (String) Preconditions.checkNotNull(str);
        this.zzi = i;
        this.zzk = i2;
        this.zzj = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzay = !z;
        this.zzn = z;
        this.zzaz = zzb.zzc();
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) int i, @SafeParcelable.Param(mo65742id = 4) int i2, @SafeParcelable.Param(mo65742id = 5) String str2, @SafeParcelable.Param(mo65742id = 6) String str3, @SafeParcelable.Param(mo65742id = 7) boolean z, @SafeParcelable.Param(mo65742id = 8) String str4, @SafeParcelable.Param(mo65742id = 9) boolean z2, @SafeParcelable.Param(mo65742id = 10) int i3) {
        this.packageName = str;
        this.zzi = i;
        this.zzk = i2;
        this.zzl = str2;
        this.zzm = str3;
        this.zzay = z;
        this.zzj = str4;
        this.zzn = z2;
        this.zzaz = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return Objects.equal(this.packageName, zzr.packageName) && this.zzi == zzr.zzi && this.zzk == zzr.zzk && Objects.equal(this.zzj, zzr.zzj) && Objects.equal(this.zzl, zzr.zzl) && Objects.equal(this.zzm, zzr.zzm) && this.zzay == zzr.zzay && this.zzn == zzr.zzn && this.zzaz == zzr.zzaz;
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.packageName, Integer.valueOf(this.zzi), Integer.valueOf(this.zzk), this.zzj, this.zzl, this.zzm, Boolean.valueOf(this.zzay), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzaz));
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("PlayLoggerContext[", "package=");
        C25541a.m63890u(t, this.packageName, ',', "packageVersionCode=");
        t.append(this.zzi);
        t.append(',');
        t.append("logSource=");
        t.append(this.zzk);
        t.append(',');
        t.append("logSourceName=");
        C25541a.m63890u(t, this.zzj, ',', "uploadAccount=");
        C25541a.m63890u(t, this.zzl, ',', "loggingId=");
        C25541a.m63890u(t, this.zzm, ',', "logAndroidId=");
        t.append(this.zzay);
        t.append(',');
        t.append("isAnonymous=");
        t.append(this.zzn);
        t.append(',');
        t.append("qosTier=");
        return C13437d.m33707l(t, this.zzaz, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.packageName, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzi);
        SafeParcelWriter.writeInt(parcel, 4, this.zzk);
        SafeParcelWriter.writeString(parcel, 5, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzm, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzay);
        SafeParcelWriter.writeString(parcel, 8, this.zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzn);
        SafeParcelWriter.writeInt(parcel, 10, this.zzaz);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
