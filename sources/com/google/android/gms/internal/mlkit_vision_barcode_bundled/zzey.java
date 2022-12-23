package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

final class zzey extends zzez {
    private zzey() {
        super((zzew) null);
    }

    public /* synthetic */ zzey(zzew zzew) {
        super((zzew) null);
    }

    public final void zza(Object obj, long j) {
        ((zzek) zzgz.zzf(obj, j)).zzb();
    }

    public final void zzb(Object obj, Object obj2, long j) {
        zzek zzek = (zzek) zzgz.zzf(obj, j);
        zzek zzek2 = (zzek) zzgz.zzf(obj2, j);
        int size = zzek.size();
        int size2 = zzek2.size();
        if (size > 0 && size2 > 0) {
            if (!zzek.zzc()) {
                zzek = zzek.zzd(size2 + size);
            }
            zzek.addAll(zzek2);
        }
        if (size > 0) {
            zzek2 = zzek;
        }
        zzgz.zzs(obj, j, zzek2);
    }
}
