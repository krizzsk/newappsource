package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import p358af.C13437d;

final class zzaws {
    private final zzatv[] zza;
    private final zzatw zzb;
    private zzatv zzc;

    public zzaws(zzatv[] zzatvArr, zzatw zzatw) {
        this.zza = zzatvArr;
        this.zzb = zzatw;
    }

    public final void zza() {
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    public final zzatv zzb(zzatu zzatu, Uri uri) throws IOException, InterruptedException {
        zzatv zzatv = this.zzc;
        if (zzatv != null) {
            return zzatv;
        }
        zzatv[] zzatvArr = this.zza;
        int length = zzatvArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzatv zzatv2 = zzatvArr[i];
            try {
                if (zzatv2.zzg(zzatu)) {
                    this.zzc = zzatv2;
                    zzatu.zze();
                    break;
                }
                zzatu.zze();
                i++;
            } catch (EOFException unused) {
            } catch (Throwable th) {
                zzatu.zze();
                throw th;
            }
        }
        zzatv zzatv3 = this.zzc;
        if (zzatv3 != null) {
            zzatv3.zzd(this.zzb);
            return this.zzc;
        }
        throw new zzaxq(C13437d.m33706k("None of the available extractors (", zzazn.zzk(this.zza), ") could read the stream."), uri);
    }
}
