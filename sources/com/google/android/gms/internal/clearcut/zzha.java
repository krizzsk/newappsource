package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzge;
import java.io.IOException;
import java.util.Arrays;

public final class zzha extends zzfu<zzha> implements Cloneable {
    private String tag = "";
    public long zzbjf = 0;
    public long zzbjg = 0;
    private long zzbjh = 0;
    public int zzbji = 0;
    private String zzbjj = "";
    private int zzbjk = 0;
    private boolean zzbjl = false;
    private zzhb[] zzbjm = zzhb.zzge();
    private byte[] zzbjn;
    private zzge.zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzge.zzs zzbkb;
    public boolean zzbkc;

    public zzha() {
        byte[] bArr = zzgb.zzse;
        this.zzbjn = bArr;
        this.zzbjo = null;
        this.zzbjp = bArr;
        this.zzbjq = "";
        this.zzbjr = "";
        this.zzbjs = null;
        this.zzbjt = "";
        this.zzbju = 180000;
        this.zzbjv = null;
        this.zzbjw = bArr;
        this.zzbjx = "";
        this.zzbjy = 0;
        this.zzbjz = zzgb.zzrx;
        this.zzbka = 0;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzgd */
    public final zzha clone() {
        try {
            zzha zzha = (zzha) super.clone();
            zzhb[] zzhbArr = this.zzbjm;
            if (zzhbArr != null && zzhbArr.length > 0) {
                zzha.zzbjm = new zzhb[zzhbArr.length];
                int i = 0;
                while (true) {
                    zzhb[] zzhbArr2 = this.zzbjm;
                    if (i >= zzhbArr2.length) {
                        break;
                    }
                    zzhb zzhb = zzhbArr2[i];
                    if (zzhb != null) {
                        zzha.zzbjm[i] = (zzhb) zzhb.clone();
                    }
                    i++;
                }
            }
            zzge.zzd zzd = this.zzbjo;
            if (zzd != null) {
                zzha.zzbjo = zzd;
            }
            zzgy zzgy = this.zzbjs;
            if (zzgy != null) {
                zzha.zzbjs = (zzgy) zzgy.clone();
            }
            zzgz zzgz = this.zzbjv;
            if (zzgz != null) {
                zzha.zzbjv = (zzgz) zzgz.clone();
            }
            int[] iArr = this.zzbjz;
            if (iArr != null && iArr.length > 0) {
                zzha.zzbjz = (int[]) iArr.clone();
            }
            zzge.zzs zzs = this.zzbkb;
            if (zzs != null) {
                zzha.zzbkb = zzs;
            }
            return zzha;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzha)) {
            return false;
        }
        zzha zzha = (zzha) obj;
        if (this.zzbjf != zzha.zzbjf || this.zzbjg != zzha.zzbjg) {
            return false;
        }
        String str = this.tag;
        if (str == null) {
            if (zzha.tag != null) {
                return false;
            }
        } else if (!str.equals(zzha.tag)) {
            return false;
        }
        if (this.zzbji != zzha.zzbji) {
            return false;
        }
        String str2 = this.zzbjj;
        if (str2 == null) {
            if (zzha.zzbjj != null) {
                return false;
            }
        } else if (!str2.equals(zzha.zzbjj)) {
            return false;
        }
        if (!zzfy.equals((Object[]) this.zzbjm, (Object[]) zzha.zzbjm) || !Arrays.equals(this.zzbjn, zzha.zzbjn)) {
            return false;
        }
        zzge.zzd zzd = this.zzbjo;
        if (zzd == null) {
            if (zzha.zzbjo != null) {
                return false;
            }
        } else if (!zzd.equals(zzha.zzbjo)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjp, zzha.zzbjp)) {
            return false;
        }
        String str3 = this.zzbjq;
        if (str3 == null) {
            if (zzha.zzbjq != null) {
                return false;
            }
        } else if (!str3.equals(zzha.zzbjq)) {
            return false;
        }
        String str4 = this.zzbjr;
        if (str4 == null) {
            if (zzha.zzbjr != null) {
                return false;
            }
        } else if (!str4.equals(zzha.zzbjr)) {
            return false;
        }
        zzgy zzgy = this.zzbjs;
        if (zzgy == null) {
            if (zzha.zzbjs != null) {
                return false;
            }
        } else if (!zzgy.equals(zzha.zzbjs)) {
            return false;
        }
        String str5 = this.zzbjt;
        if (str5 == null) {
            if (zzha.zzbjt != null) {
                return false;
            }
        } else if (!str5.equals(zzha.zzbjt)) {
            return false;
        }
        if (this.zzbju != zzha.zzbju) {
            return false;
        }
        zzgz zzgz = this.zzbjv;
        if (zzgz == null) {
            if (zzha.zzbjv != null) {
                return false;
            }
        } else if (!zzgz.equals(zzha.zzbjv)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjw, zzha.zzbjw)) {
            return false;
        }
        String str6 = this.zzbjx;
        if (str6 == null) {
            if (zzha.zzbjx != null) {
                return false;
            }
        } else if (!str6.equals(zzha.zzbjx)) {
            return false;
        }
        if (!zzfy.equals(this.zzbjz, zzha.zzbjz)) {
            return false;
        }
        zzge.zzs zzs = this.zzbkb;
        if (zzs == null) {
            if (zzha.zzbkb != null) {
                return false;
            }
        } else if (!zzs.equals(zzha.zzbkb)) {
            return false;
        }
        if (this.zzbkc != zzha.zzbkc) {
            return false;
        }
        zzfw zzfw = this.zzrj;
        if (zzfw != null && !zzfw.isEmpty()) {
            return this.zzrj.equals(zzha.zzrj);
        }
        zzfw zzfw2 = zzha.zzrj;
        return zzfw2 == null || zzfw2.isEmpty();
    }

    public final int hashCode() {
        Class<zzha> cls = zzha.class;
        long j = this.zzbjf;
        long j2 = this.zzbjg;
        int i = (((553293672 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31 * 31;
        String str = this.tag;
        int i2 = 0;
        int hashCode = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        String str2 = this.zzbjj;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i3 = 1237;
        int hashCode3 = Arrays.hashCode(this.zzbjn) + ((((((hashCode + hashCode2) * 31 * 31) + 1237) * 31) + zzfy.hashCode((Object[]) this.zzbjm)) * 31);
        zzge.zzd zzd = this.zzbjo;
        int hashCode4 = (Arrays.hashCode(this.zzbjp) + (((hashCode3 * 31) + (zzd == null ? 0 : zzd.hashCode())) * 31)) * 31;
        String str3 = this.zzbjq;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzbjr;
        int hashCode6 = hashCode5 + (str4 == null ? 0 : str4.hashCode());
        zzgy zzgy = this.zzbjs;
        int hashCode7 = ((hashCode6 * 31) + (zzgy == null ? 0 : zzgy.hashCode())) * 31;
        String str5 = this.zzbjt;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        long j3 = this.zzbju;
        zzgz zzgz = this.zzbjv;
        int hashCode9 = (Arrays.hashCode(this.zzbjw) + ((((((hashCode7 + hashCode8) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (zzgz == null ? 0 : zzgz.hashCode())) * 31)) * 31;
        String str6 = this.zzbjx;
        int hashCode10 = str6 == null ? 0 : str6.hashCode();
        int hashCode11 = zzfy.hashCode(this.zzbjz);
        zzge.zzs zzs = this.zzbkb;
        int hashCode12 = (((hashCode11 + ((hashCode9 + hashCode10) * 31 * 31)) * 31 * 31) + (zzs == null ? 0 : zzs.hashCode())) * 31;
        if (this.zzbkc) {
            i3 = 1231;
        }
        int i4 = (hashCode12 + i3) * 31;
        zzfw zzfw = this.zzrj;
        if (zzfw != null && !zzfw.isEmpty()) {
            i2 = this.zzrj.hashCode();
        }
        return i4 + i2;
    }

    public final void zza(zzfs zzfs) throws IOException {
        long j = this.zzbjf;
        if (j != 0) {
            zzfs.zzi(1, j);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            zzfs.zza(2, this.tag);
        }
        zzhb[] zzhbArr = this.zzbjm;
        int i = 0;
        if (zzhbArr != null && zzhbArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbArr2 = this.zzbjm;
                if (i2 >= zzhbArr2.length) {
                    break;
                }
                zzhb zzhb = zzhbArr2[i2];
                if (zzhb != null) {
                    zzfs.zza(3, (zzfz) zzhb);
                }
                i2++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzfs.zza(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzfs.zza(6, this.zzbjp);
        }
        zzgy zzgy = this.zzbjs;
        if (zzgy != null) {
            zzfs.zza(7, (zzfz) zzgy);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzfs.zza(8, this.zzbjq);
        }
        zzge.zzd zzd = this.zzbjo;
        if (zzd != null) {
            zzfs.zze(9, zzd);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzfs.zzc(11, i3);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzfs.zza(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzfs.zza(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzfs.zzb(15, 0);
            zzfs.zzn(zzfs.zzj(j2));
        }
        zzgz zzgz = this.zzbjv;
        if (zzgz != null) {
            zzfs.zza(16, (zzfz) zzgz);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzfs.zzi(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzfs.zza(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.zzbjz;
                if (i >= iArr2.length) {
                    break;
                }
                zzfs.zzc(20, iArr2[i]);
                i++;
            }
        }
        zzge.zzs zzs = this.zzbkb;
        if (zzs != null) {
            zzfs.zze(23, zzs);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzfs.zza(24, this.zzbjx);
        }
        boolean z = this.zzbkc;
        if (z) {
            zzfs.zzb(25, z);
        }
        String str6 = this.zzbjj;
        if (str6 != null && !str6.equals("")) {
            zzfs.zza(26, this.zzbjj);
        }
        super.zza(zzfs);
    }

    public final int zzen() {
        int[] iArr;
        int zzen = super.zzen();
        long j = this.zzbjf;
        if (j != 0) {
            zzen += zzfs.zzd(1, j);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            zzen += zzfs.zzb(2, this.tag);
        }
        zzhb[] zzhbArr = this.zzbjm;
        int i = 0;
        if (zzhbArr != null && zzhbArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbArr2 = this.zzbjm;
                if (i2 >= zzhbArr2.length) {
                    break;
                }
                zzhb zzhb = zzhbArr2[i2];
                if (zzhb != null) {
                    zzen += zzfs.zzb(3, (zzfz) zzhb);
                }
                i2++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzen += zzfs.zzb(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzen += zzfs.zzb(6, this.zzbjp);
        }
        zzgy zzgy = this.zzbjs;
        if (zzgy != null) {
            zzen += zzfs.zzb(7, (zzfz) zzgy);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzen += zzfs.zzb(8, this.zzbjq);
        }
        zzge.zzd zzd = this.zzbjo;
        if (zzd != null) {
            zzen += zzbn.zzc(9, (zzdo) zzd);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzen += zzfs.zzs(i3) + zzfs.zzr(11);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzen += zzfs.zzb(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzen += zzfs.zzb(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzen += zzfs.zzo(zzfs.zzj(j2)) + zzfs.zzr(15);
        }
        zzgz zzgz = this.zzbjv;
        if (zzgz != null) {
            zzen += zzfs.zzb(16, (zzfz) zzgz);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzen += zzfs.zzd(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzen += zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr2 = this.zzbjz;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = this.zzbjz;
                if (i >= iArr.length) {
                    break;
                }
                i4 += zzfs.zzs(iArr[i]);
                i++;
            }
            zzen = zzen + i4 + (iArr.length * 2);
        }
        zzge.zzs zzs = this.zzbkb;
        if (zzs != null) {
            zzen += zzbn.zzc(23, (zzdo) zzs);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzen += zzfs.zzb(24, this.zzbjx);
        }
        if (this.zzbkc) {
            zzen += zzfs.zzr(25) + 1;
        }
        String str6 = this.zzbjj;
        return (str6 == null || str6.equals("")) ? zzen : zzen + zzfs.zzb(26, this.zzbjj);
    }

    public final /* synthetic */ zzfu zzeo() throws CloneNotSupportedException {
        return (zzha) clone();
    }

    public final /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzha) clone();
    }
}
