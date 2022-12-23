package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

final class zzfy {
    private final ArrayDeque zza = new ArrayDeque();

    private zzfy() {
    }

    public static /* synthetic */ zzdb zza(zzfy zzfy, zzdb zzdb, zzdb zzdb2) {
        zzfy.zzb(zzdb);
        zzfy.zzb(zzdb2);
        zzdb zzdb3 = (zzdb) zzfy.zza.pop();
        while (!zzfy.zza.isEmpty()) {
            zzdb3 = new zzga((zzdb) zzfy.zza.pop(), zzdb3, (zzfx) null);
        }
        return zzdb3;
    }

    private final void zzb(zzdb zzdb) {
        if (zzdb.zzh()) {
            int zzc = zzc(zzdb.zzd());
            int zzc2 = zzga.zzc(zzc + 1);
            if (this.zza.isEmpty() || ((zzdb) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzdb);
                return;
            }
            int zzc3 = zzga.zzc(zzc);
            zzdb zzdb2 = (zzdb) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzdb) this.zza.peek()).zzd() < zzc3) {
                zzdb2 = new zzga((zzdb) this.zza.pop(), zzdb2, (zzfx) null);
            }
            zzga zzga = new zzga(zzdb2, zzdb, (zzfx) null);
            while (!this.zza.isEmpty() && ((zzdb) this.zza.peek()).zzd() < zzga.zzc(zzc(zzga.zzd()) + 1)) {
                zzga = new zzga((zzdb) this.zza.pop(), zzga, (zzfx) null);
            }
            this.zza.push(zzga);
        } else if (zzdb instanceof zzga) {
            zzga zzga2 = (zzga) zzdb;
            zzb(zzga2.zzd);
            zzb(zzga2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzdb.getClass())));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzga.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    public /* synthetic */ zzfy(zzfx zzfx) {
    }
}
