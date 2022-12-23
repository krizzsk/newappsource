package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class zzayk {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzayk(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzayy.zzc(z2);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1 : j3;
            zzayy.zzc(z3);
            this.zza = uri;
            this.zzb = j;
            this.zzc = j2;
            this.zzd = j3;
        }
        z3 = true;
        zzayy.zzc(z3);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.zzb;
        long j2 = this.zzc;
        long j3 = this.zzd;
        StringBuilder h = C16759e.m42352h("DataSpec[", valueOf, ", ", arrays, ", ");
        h.append(j);
        h.append(", ");
        h.append(j2);
        h.append(", ");
        return C25541a.m63884o(h, j3, ", null, 0]");
    }
}
