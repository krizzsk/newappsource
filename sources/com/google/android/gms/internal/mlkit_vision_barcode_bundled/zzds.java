package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

final class zzds {
    private static final zzds zzb = new zzds(true);
    public final zzgl zza = new zzge(16);
    private boolean zzc;
    private boolean zzd;

    private zzds() {
    }

    public static int zza(zzdr zzdr, Object obj) {
        zzhf zzd2 = zzdr.zzd();
        int zza2 = zzdr.zza();
        zzdr.zzg();
        int zzC = zzdi.zzC(zza2);
        if (zzd2 == zzhf.GROUP) {
            zzel.zzi((zzfl) obj);
            zzC += zzC;
        }
        zzhg zzhg = zzhg.INT;
        int i = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = zzdi.zzE(((Long) obj).longValue());
                break;
            case 3:
                i = zzdi.zzE(((Long) obj).longValue());
                break;
            case 4:
                i = zzdi.zzx(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i = 1;
                break;
            case 8:
                if (!(obj instanceof zzdb)) {
                    i = zzdi.zzB((String) obj);
                    break;
                } else {
                    i = zzdi.zzu((zzdb) obj);
                    break;
                }
            case 9:
                i = zzdi.zzw((zzfl) obj);
                break;
            case 10:
                if (!(obj instanceof zzes)) {
                    i = zzdi.zzz((zzfl) obj);
                    break;
                } else {
                    i = zzdi.zzy((zzes) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof zzdb)) {
                    i = zzdi.zzt((byte[]) obj);
                    break;
                } else {
                    i = zzdi.zzu((zzdb) obj);
                    break;
                }
            case 12:
                i = zzdi.zzD(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzee)) {
                    i = zzdi.zzx(((Integer) obj).intValue());
                    break;
                } else {
                    i = zzdi.zzx(((zzee) obj).zza());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = zzdi.zzD((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzdi.zzE((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        i = 8;
        return zzC + i;
    }

    public static zzds zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzfq) {
            return ((zzfq) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        Object obj;
        zzdr zzdr = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzes)) {
            zzdr.zzg();
            if (zzdr.zze() == zzhg.MESSAGE) {
                Object zze = zze(zzdr);
                if (zze == null) {
                    this.zza.put(zzdr, zzl(value));
                    return;
                }
                if (zze instanceof zzfq) {
                    obj = zzdr.zzc((zzfq) zze, (zzfq) value);
                } else {
                    zzfk zzV = ((zzfl) zze).zzV();
                    zzdr.zzb(zzV, (zzfl) value);
                    obj = zzV.zzl();
                }
                this.zza.put(zzdr, obj);
                return;
            }
            this.zza.put(zzdr, zzl(value));
            return;
        }
        zzes zzes = (zzes) value;
        throw null;
    }

    private static boolean zzn(Map.Entry entry) {
        zzdr zzdr = (zzdr) entry.getKey();
        if (zzdr.zze() != zzhg.MESSAGE) {
            return true;
        }
        zzdr.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfm) {
            return ((zzfm) value).zzY();
        }
        if (value instanceof zzes) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        zzdr zzdr = (zzdr) entry.getKey();
        Object value = entry.getValue();
        if (zzdr.zze() != zzhg.MESSAGE) {
            return zza(zzdr, value);
        }
        zzdr.zzg();
        zzdr.zzf();
        if (value instanceof zzes) {
            int zza2 = ((zzdr) entry.getKey()).zza();
            int zzD = zzdi.zzD(8);
            int zza3 = ((zzes) value).zza();
            return zzdi.zzD(zza3) + zza3 + zzdi.zzD(24) + zzdi.zzD(zza2) + zzdi.zzD(16) + zzD + zzD;
        }
        int zza4 = ((zzdr) entry.getKey()).zza();
        int zzD2 = zzdi.zzD(8);
        return zzdi.zzz((zzfl) value) + zzdi.zzD(24) + zzdi.zzD(zza4) + zzdi.zzD(16) + zzD2 + zzD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzds)) {
            return false;
        }
        return this.zza.equals(((zzds) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzo(this.zza.zzg(i2));
        }
        for (Map.Entry zzo : this.zza.zzc()) {
            i += zzo(zzo);
        }
        return i;
    }

    /* renamed from: zzc */
    public final zzds clone() {
        zzds zzds = new zzds();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzds.zzi((zzdr) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzds.zzi((zzdr) entry.getKey(), entry.getValue());
        }
        zzds.zzd = this.zzd;
        return zzds;
    }

    public final Object zze(zzdr zzdr) {
        Object obj = this.zza.get(zzdr);
        if (!(obj instanceof zzes)) {
            return obj;
        }
        zzes zzes = (zzes) obj;
        throw null;
    }

    public final Iterator zzf() {
        if (this.zzd) {
            return new zzer(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzds zzds) {
        for (int i = 0; i < zzds.zza.zzb(); i++) {
            zzm(zzds.zza.zzg(i));
        }
        for (Map.Entry zzm : zzds.zza.zzc()) {
            zzm(zzm);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if ((r7 instanceof byte[]) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r0 != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r5.zzd = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r5.zza.zze(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0083, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{java.lang.Integer.valueOf(r6.zza()), r6.zzd().zza(), r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee) == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r0 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel.zze(r7)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf.DOUBLE
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r0 = r0.zza()
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x002d;
                case 7: goto L_0x0024;
                case 8: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0055
        L_0x001b:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfl
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0024:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzee
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x002d:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0036:
            boolean r0 = r7 instanceof java.lang.String
            goto L_0x0047
        L_0x0039:
            boolean r0 = r7 instanceof java.lang.Boolean
            goto L_0x0047
        L_0x003c:
            boolean r0 = r7 instanceof java.lang.Double
            goto L_0x0047
        L_0x003f:
            boolean r0 = r7 instanceof java.lang.Float
            goto L_0x0047
        L_0x0042:
            boolean r0 = r7 instanceof java.lang.Long
            goto L_0x0047
        L_0x0045:
            boolean r0 = r7 instanceof java.lang.Integer
        L_0x0047:
            if (r0 == 0) goto L_0x0055
        L_0x0049:
            boolean r0 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzes
            if (r0 == 0) goto L_0x004f
            r5.zzd = r1
        L_0x004f:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgl r0 = r5.zza
            r0.put(r6, r7)
            return
        L_0x0055:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r6.zza()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhf r6 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhg r6 = r6.zza()
            r2[r1] = r6
            r6 = 2
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r2[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds.zzi(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdr, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzn(this.zza.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry zzn : this.zza.zzc()) {
            if (!zzn(zzn)) {
                return false;
            }
        }
        return true;
    }

    private zzds(boolean z) {
        zzg();
        zzg();
    }
}
