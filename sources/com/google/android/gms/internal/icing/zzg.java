package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.BitSet;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentContentsCreator")
@SafeParcelable.Reserved({1000})
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    @SafeParcelable.Field(mo65739id = 1)
    public final zzk[] zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final String zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final boolean zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final Account zzd;

    public zzg(String str, boolean z, Account account, zzk... zzkArr) {
        this(zzkArr, str, z, account);
        String str2;
        if (zzkArr != null) {
            int length = zzq.zza.length;
            BitSet bitSet = new BitSet(10);
            for (zzk zzk : zzkArr) {
                int i = zzk.zzd;
                if (i != -1) {
                    if (bitSet.get(i)) {
                        String valueOf = String.valueOf(zzq.zza(i));
                        if (valueOf.length() != 0) {
                            str2 = "Duplicate global search section type ".concat(valueOf);
                        } else {
                            str2 = new String("Duplicate global search section type ");
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    bitSet.set(i);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzg) {
            zzg zzg = (zzg) obj;
            if (!Objects.equal(this.zzb, zzg.zzb) || !Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzg.zzc)) || !Objects.equal(this.zzd, zzg.zzd) || !Arrays.equals(this.zza, zzg.zza)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, Boolean.valueOf(this.zzc), this.zzd, Integer.valueOf(Arrays.hashCode(this.zza)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(mo65742id = 1) zzk[] zzkArr, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) Account account) {
        this.zza = zzkArr;
        this.zzb = str;
        this.zzc = z;
        this.zzd = account;
    }
}
