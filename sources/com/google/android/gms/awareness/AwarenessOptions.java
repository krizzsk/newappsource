package com.google.android.gms.awareness;

import android.accounts.Account;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public class AwarenessOptions implements Api.ApiOptions.Optional {
    public static final int NO_UID = -1;
    private final String zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;
    private final int zze;
    private final Account zzf;
    private String zzg;

    public AwarenessOptions(String str, int i, String str2, String str3, int i2, Account account) {
        Preconditions.checkNotNull(str, "moduleId must not be null");
        this.zza = str;
        this.zzb = i;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = i2;
        this.zzf = account;
    }

    @Deprecated
    public static AwarenessOptions create1p(String str) {
        Preconditions.checkNotEmpty(str);
        return new AwarenessOptions(str, 1, (String) null, (String) null, -1, (Account) null);
    }

    public static AwarenessOptions zzd(String str) {
        return new AwarenessOptions(str, 3, (String) null, (String) null, -1, (Account) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AwarenessOptions awarenessOptions = (AwarenessOptions) obj;
            if (this.zzb != awarenessOptions.zzb || this.zze != awarenessOptions.zze || !Objects.equal(this.zza, awarenessOptions.zza) || !Objects.equal(this.zzc, awarenessOptions.zzc) || !Objects.equal(this.zzd, awarenessOptions.zzd) || !Objects.equal(this.zzf, awarenessOptions.zzf)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), this.zzf);
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zze;
    }

    public final Account zzc() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzc;
    }

    public final void zzi(String str) {
        if (this.zzg == null) {
            this.zzg = str;
        }
    }

    public static AwarenessOptions create1p(String str, Account account) {
        Preconditions.checkNotEmpty(str);
        return new AwarenessOptions(str, 1, (String) null, (String) null, -1, account);
    }
}
