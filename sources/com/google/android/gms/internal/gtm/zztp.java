package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;

final class zztp {
    private final zzto zza;

    private zztp(zzto zzto) {
        zzvi.zzf(zzto, "output");
        this.zza = zzto;
        zzto.zza = this;
    }

    public static zztp zza(zzto zzto) {
        zztp zztp = zzto.zza;
        return zztp != null ? zztp : new zztp(zzto);
    }

    public final void zzA(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = list.get(i4).intValue();
                i3 += zzto.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzto zzto = this.zza;
                int intValue2 = list.get(i2).intValue();
                zzto.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzto zzto2 = this.zza;
            int intValue3 = list.get(i2).intValue();
            zzto2.zzp(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void zzD(int i, long j) throws IOException {
        this.zza.zzr(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = list.get(i4).longValue();
                i3 += zzto.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzto zzto = this.zza;
                long longValue2 = list.get(i2).longValue();
                zzto.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzto zzto2 = this.zza;
            long longValue3 = list.get(i2).longValue();
            zzto2.zzr(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public final void zzF(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    public final void zzG(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    public final void zzH(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzvs) {
            zzvs zzvs = (zzvs) list;
            while (i2 < list.size()) {
                Object zzf = zzvs.zzf(i2);
                if (zzf instanceof String) {
                    this.zza.zzm(i, (String) zzf);
                } else {
                    this.zza.zze(i, (zztd) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzm(i, list.get(i2));
            i2++;
        }
    }

    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzp(i, i2);
    }

    public final void zzJ(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzto.zzD(list.get(i4).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzq(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzp(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzK(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    public final void zzL(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzto.zzE(list.get(i4).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzr(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    public final void zzc(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).booleanValue();
                i3++;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzb(list.get(i2).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    public final void zzd(int i, zztd zztd) throws IOException {
        this.zza.zze(i, zztd);
    }

    public final void zze(int i, List<zztd> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).doubleValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
            i2++;
        }
    }

    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzto.zzx(list.get(i4).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    public final void zzl(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).floatValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
            i2++;
        }
    }

    public final void zzq(int i, Object obj, zzwx zzwx) throws IOException {
        zzto zzto = this.zza;
        zzto.zzo(i, 3);
        zzwx.zzn((zzwk) obj, zzto.zza);
        zzto.zzo(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    public final void zzs(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzto.zzx(list.get(i4).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    public final void zzu(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzto.zzE(list.get(i4).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzr(i, list.get(i2).longValue());
            i2++;
        }
    }

    public final void zzv(int i, Object obj, zzwx zzwx) throws IOException {
        zzwk zzwk = (zzwk) obj;
        zztl zztl = (zztl) this.zza;
        zztl.zzq((i << 3) | 2);
        zzsh zzsh = (zzsh) zzwk;
        int zzQ = zzsh.zzQ();
        if (zzQ == -1) {
            zzQ = zzwx.zza(zzsh);
            zzsh.zzT(zzQ);
        }
        zztl.zzq(zzQ);
        zzwx.zzn(zzwk, zztl.zza);
    }

    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zztd) {
            zztl zztl = (zztl) this.zza;
            zztl.zzq(11);
            zztl.zzp(2, i);
            zztl.zze(3, (zztd) obj);
            zztl.zzq(12);
            return;
        }
        zzto zzto = this.zza;
        zzwk zzwk = (zzwk) obj;
        zztl zztl2 = (zztl) zzto;
        zztl2.zzq(11);
        zztl2.zzp(2, i);
        zztl2.zzq(26);
        zztl2.zzq(zzwk.zzX());
        zzwk.zzaq(zzto);
        zztl2.zzq(12);
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    public final void zzy(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzf(i, list.get(i2).intValue());
            i2++;
        }
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }
}
