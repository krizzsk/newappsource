package com.google.android.gms.internal.mlkit_common;

final class zzaw extends zzao {
    public static final zzao zza = new zzaw((Object) null, new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    private zzaw(Object obj, Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    public static zzaw zzg(int i, Object[] objArr, zzan zzan) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzae.zza(obj, obj2);
        return new zzaw((Object) null, objArr, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.zzb
            int r1 = r4.zzc
            r2 = 0
            if (r5 != 0) goto L_0x0009
        L_0x0007:
            r5 = r2
            goto L_0x001d
        L_0x0009:
            r3 = 1
            if (r1 != r3) goto L_0x0007
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0007
            r5 = r0[r3]
            r5.getClass()
        L_0x001d:
            if (r5 != 0) goto L_0x0020
            return r2
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaw.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.zzc;
    }

    public final zzai zza() {
        return new zzav(this.zzb, 1, this.zzc);
    }

    public final zzap zzd() {
        return new zzat(this, this.zzb, 0, this.zzc);
    }

    public final zzap zze() {
        return new zzau(this, new zzav(this.zzb, 0, this.zzc));
    }
}
