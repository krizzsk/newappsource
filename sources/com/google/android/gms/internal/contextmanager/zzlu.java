package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.internal.contextmanager.zzlt;
import java.util.Iterator;
import java.util.Map;

final class zzlu<T extends zzlt<T>> {
    private static final zzlu zzb = new zzlu(true);
    public final zzoj<T, Object> zza = new zzoc(16);
    private boolean zzc;
    private boolean zzd;

    private zzlu() {
    }

    public static int zza(zzlt<?> zzlt, Object obj) {
        zzpd zzd2 = zzlt.zzd();
        zzlt.zza();
        zzlt.zzg();
        int zzC = zzlk.zzC(106879161);
        if (zzd2 == zzpd.GROUP) {
            zzmn.zzi((zznn) obj);
            zzC += zzC;
        }
        zzpe zzpe = zzpe.INT;
        int i = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = zzlk.zzE(((Long) obj).longValue());
                break;
            case 3:
                i = zzlk.zzE(((Long) obj).longValue());
                break;
            case 4:
                i = zzlk.zzx(((Integer) obj).intValue());
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
                if (!(obj instanceof zzld)) {
                    i = zzlk.zzB((String) obj);
                    break;
                } else {
                    i = zzlk.zzu((zzld) obj);
                    break;
                }
            case 9:
                i = zzlk.zzw((zznn) obj);
                break;
            case 10:
                if (!(obj instanceof zzmu)) {
                    i = zzlk.zzz((zznn) obj);
                    break;
                } else {
                    i = zzlk.zzy((zzmu) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof zzld)) {
                    i = zzlk.zzt((byte[]) obj);
                    break;
                } else {
                    i = zzlk.zzu((zzld) obj);
                    break;
                }
            case 12:
                i = zzlk.zzD(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zzmh)) {
                    i = zzlk.zzx(((Integer) obj).intValue());
                    break;
                } else {
                    i = zzlk.zzx(((zzmh) obj).zza());
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
                i = zzlk.zzD((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzlk.zzE((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        i = 8;
        return zzC + i;
    }

    public static <T extends zzlt<T>> zzlu<T> zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzns) {
            return ((zzns) obj).zzc();
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

    private final void zzm(Map.Entry<T, Object> entry) {
        Object obj;
        zzlt zzlt = (zzlt) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzmu)) {
            zzlt.zzg();
            if (zzlt.zze() == zzpe.MESSAGE) {
                Object zze = zze(zzlt);
                if (zze == null) {
                    this.zza.put(zzlt, zzl(value));
                    return;
                }
                if (zze instanceof zzns) {
                    obj = zzlt.zzc((zzns) zze, (zzns) value);
                } else {
                    zznm zzK = ((zznn) zze).zzK();
                    zzlt.zzb(zzK, (zznn) value);
                    obj = zzK.zzs();
                }
                this.zza.put(zzlt, obj);
                return;
            }
            this.zza.put(zzlt, zzl(value));
            return;
        }
        zzmu zzmu = (zzmu) value;
        throw null;
    }

    private static <T extends zzlt<T>> boolean zzn(Map.Entry<T, Object> entry) {
        zzlt zzlt = (zzlt) entry.getKey();
        if (zzlt.zze() == zzpe.MESSAGE) {
            zzlt.zzg();
            Object value = entry.getValue();
            if (value instanceof zznn) {
                if (!((zznn) value).zzw()) {
                    return false;
                }
            } else if (value instanceof zzmu) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static final int zzo(Map.Entry<T, Object> entry) {
        zzlt zzlt = (zzlt) entry.getKey();
        Object value = entry.getValue();
        if (zzlt.zze() != zzpe.MESSAGE) {
            return zza(zzlt, value);
        }
        zzlt.zzg();
        zzlt.zzf();
        if (value instanceof zzmu) {
            ((zzlt) entry.getKey()).zza();
            int zzD = zzlk.zzD(8);
            int zza2 = ((zzmu) value).zza();
            return zzlk.zzD(zza2) + zza2 + zzlk.zzD(24) + zzlk.zzD(106879161) + zzlk.zzD(16) + zzD + zzD;
        }
        ((zzlt) entry.getKey()).zza();
        int zzD2 = zzlk.zzD(8);
        return zzlk.zzz((zznn) value) + zzlk.zzD(24) + zzlk.zzD(106879161) + zzlk.zzD(16) + zzD2 + zzD2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlu)) {
            return false;
        }
        return this.zza.equals(((zzlu) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzo(this.zza.zzg(i2));
        }
        for (Map.Entry<T, Object> zzo : this.zza.zzc()) {
            i += zzo(zzo);
        }
        return i;
    }

    /* renamed from: zzc */
    public final zzlu<T> clone() {
        zzlu<T> zzlu = new zzlu<>();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry<T, Object> zzg = this.zza.zzg(i);
            zzlu.zzi((zzlt) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry next : this.zza.zzc()) {
            zzlu.zzi((zzlt) next.getKey(), next.getValue());
        }
        zzlu.zzd = this.zzd;
        return zzlu;
    }

    public final Object zze(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzmu)) {
            return obj;
        }
        zzmu zzmu = (zzmu) obj;
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> zzf() {
        if (this.zzd) {
            return new zzmt(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzlu<T> zzlu) {
        for (int i = 0; i < zzlu.zza.zzb(); i++) {
            zzm(zzlu.zza.zzg(i));
        }
        for (Map.Entry<T, Object> zzm : zzlu.zza.zzc()) {
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
        if ((r7 instanceof com.google.android.gms.internal.contextmanager.zzmu) == false) goto L_0x004f;
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
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r6.zza();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new java.lang.Object[]{106879161, r6.zzd().zza(), r7.getClass().getName()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if ((r7 instanceof com.google.android.gms.internal.contextmanager.zzmu) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if ((r7 instanceof com.google.android.gms.internal.contextmanager.zzmh) == false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzi(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            r6.zzg()
            com.google.android.gms.internal.contextmanager.zzpd r0 = r6.zzd()
            com.google.android.gms.internal.contextmanager.zzmn.zze(r7)
            com.google.android.gms.internal.contextmanager.zzpd r1 = com.google.android.gms.internal.contextmanager.zzpd.DOUBLE
            com.google.android.gms.internal.contextmanager.zzpe r1 = com.google.android.gms.internal.contextmanager.zzpe.INT
            com.google.android.gms.internal.contextmanager.zzpe r0 = r0.zza()
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
            boolean r0 = r7 instanceof com.google.android.gms.internal.contextmanager.zznn
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.contextmanager.zzmu
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x0024:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0049
            boolean r0 = r7 instanceof com.google.android.gms.internal.contextmanager.zzmh
            if (r0 == 0) goto L_0x0055
            goto L_0x0049
        L_0x002d:
            boolean r0 = r7 instanceof com.google.android.gms.internal.contextmanager.zzld
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
            boolean r0 = r7 instanceof com.google.android.gms.internal.contextmanager.zzmu
            if (r0 == 0) goto L_0x004f
            r5.zzd = r1
        L_0x004f:
            com.google.android.gms.internal.contextmanager.zzoj<T, java.lang.Object> r0 = r5.zza
            r0.put(r6, r7)
            return
        L_0x0055:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r6.zza()
            r3 = 0
            r4 = 106879161(0x65ed8b9, float:4.1912782E-35)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            com.google.android.gms.internal.contextmanager.zzpd r6 = r6.zzd()
            com.google.android.gms.internal.contextmanager.zzpe r6 = r6.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.contextmanager.zzlu.zzi(com.google.android.gms.internal.contextmanager.zzlt, java.lang.Object):void");
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
        for (Map.Entry<T, Object> zzn : this.zza.zzc()) {
            if (!zzn(zzn)) {
                return false;
            }
        }
        return true;
    }

    private zzlu(boolean z) {
        zzg();
        zzg();
    }
}
