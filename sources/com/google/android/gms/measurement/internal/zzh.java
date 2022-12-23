package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class zzh {
    private long zzA;
    private String zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private final zzfy zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private String zzq;
    private Boolean zzr;
    private long zzs;
    private List zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzh(zzfy zzfy, String str) {
        Preconditions.checkNotNull(zzfy);
        Preconditions.checkNotEmpty(str);
        this.zza = zzfy;
        this.zzb = str;
        zzfy.zzaz().zzg();
    }

    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    public final String zzB() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    public final List zzC() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    public final void zzD() {
        this.zza.zzaz().zzg();
        this.zzC = false;
    }

    public final void zzE() {
        this.zza.zzaz().zzg();
        long j = this.zzg + 1;
        if (j > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzeo.zzn(this.zzb));
            j = 0;
        }
        this.zzC = true;
        this.zzg = j;
    }

    public final void zzF(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzg.zza(this.zzq, str);
        this.zzq = str;
    }

    public final void zzG(boolean z) {
        boolean z2;
        this.zza.zzaz().zzg();
        boolean z3 = this.zzC;
        if (this.zzp != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzC = z3 | z2;
        this.zzp = z;
    }

    public final void zzH(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzc, str);
        this.zzc = str;
    }

    public final void zzI(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzl, str);
        this.zzl = str;
    }

    public final void zzJ(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzj, str);
        this.zzj = str;
    }

    public final void zzK(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzk != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzk = j;
    }

    public final void zzL(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzD != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzD = j;
    }

    public final void zzM(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzy != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzy = j;
    }

    public final void zzN(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzz != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzz = j;
    }

    public final void zzO(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzx != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzx = j;
    }

    public final void zzP(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzw != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzw = j;
    }

    public final void zzQ(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzA != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzA = j;
    }

    public final void zzR(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzv != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzv = j;
    }

    public final void zzS(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzn != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzn = j;
    }

    public final void zzT(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzs != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzs = j;
    }

    public final void zzU(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzE != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzE = j;
    }

    public final void zzV(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzf, str);
        this.zzf = str;
    }

    public final void zzW(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzg.zza(this.zzd, str);
        this.zzd = str;
    }

    public final void zzX(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzm != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzm = j;
    }

    public final void zzY(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzB, str);
        this.zzB = str;
    }

    public final void zzZ(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzi != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzi = j;
    }

    public final long zza() {
        this.zza.zzaz().zzg();
        return 0;
    }

    public final void zzaa(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.zza.zzaz().zzg();
        boolean z3 = this.zzC;
        if (this.zzg == j) {
            z2 = false;
        }
        this.zzC = z2 | z3;
        this.zzg = j;
    }

    public final void zzab(long j) {
        boolean z;
        this.zza.zzaz().zzg();
        boolean z2 = this.zzC;
        if (this.zzh != j) {
            z = true;
        } else {
            z = false;
        }
        this.zzC = z2 | z;
        this.zzh = j;
    }

    public final void zzac(boolean z) {
        boolean z2;
        this.zza.zzaz().zzg();
        boolean z3 = this.zzC;
        if (this.zzo != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzC = z3 | z2;
        this.zzo = z;
    }

    public final void zzad(Boolean bool) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzr, bool);
        this.zzr = bool;
    }

    public final void zzae(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zze, str);
        this.zze = str;
    }

    public final void zzaf(List list) {
        ArrayList arrayList;
        this.zza.zzaz().zzg();
        if (!zzg.zza(this.zzt, list)) {
            this.zzC = true;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = null;
            }
            this.zzt = arrayList;
        }
    }

    public final void zzag(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzg.zza(this.zzu, str);
        this.zzu = str;
    }

    public final boolean zzah() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    public final boolean zzaj() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }

    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzB;
        zzY((String) null);
        return str;
    }

    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }
}
