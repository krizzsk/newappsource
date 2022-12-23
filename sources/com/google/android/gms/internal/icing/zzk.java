package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentSectionCreator")
@SafeParcelable.Reserved({1000})
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    public static final int zza = Integer.parseInt("-1");
    private static final zzs zzf;
    @SafeParcelable.Field(mo65739id = 1)
    public final String zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final zzs zzc;
    @SafeParcelable.Field(defaultValue = "-1", mo65739id = 4)
    public final int zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final byte[] zze;

    static {
        zzr zzr = new zzr("SsbContext");
        zzr.zzb(true);
        zzr.zza("blob");
        zzf = zzr.zze();
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 3) zzs zzs, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) byte[] bArr) {
        int i2 = zza;
        boolean z = true;
        if (i != i2 && zzq.zza(i) == null) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Invalid section type ");
        sb.append(i);
        Preconditions.checkArgument(z, sb.toString());
        this.zzb = str;
        this.zzc = zzs;
        this.zzd = i;
        this.zze = bArr;
        String str2 = null;
        if (i != i2 && zzq.zza(i) == null) {
            str2 = C13715c.m34241g(32, "Invalid section type ", i);
        } else if (!(str == null || bArr == null)) {
            str2 = "Both content and blobContent set";
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static zzk zza(byte[] bArr) {
        return new zzk((String) null, zzf, zza, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(byte[] bArr, zzs zzs) {
        this((String) null, zzs, zza, bArr);
    }
}
