package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class zzvf extends zzvk {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final zzfsp zzb = zzfsp.zzb(zzuo.zza);
    /* access modifiers changed from: private */
    public static final zzfsp zzc = zzfsp.zzb(zzup.zza);
    private final AtomicReference zzd;
    private final zzue zze;

    @Deprecated
    public zzvf() {
        zzuu zzuu = zzuu.zzC;
        throw null;
    }

    public static int zza(zzad zzad, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzad.zzd)) {
            return 4;
        }
        String zzf = zzf(str);
        String zzf2 = zzf(zzad.zzd);
        if (zzf2 == null || zzf == null) {
            if (!z || zzf2 != null) {
                return 0;
            }
            return 1;
        } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
            return 3;
        } else {
            if (zzeg.zzag(zzf2, "-")[0].equals(zzeg.zzag(zzf, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    public static String zzf(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean zzi(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzo(zztz zztz, zzcp zzcp, Map map) {
        int i = 0;
        while (i < zztz.zzc) {
            if (((zzcm) zzcp.zzA.get(zztz.zzb(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    private static final Pair zzp(int i, zzvj zzvj, int[][][] iArr, zzva zzva, Comparator comparator) {
        Object obj;
        zzvj zzvj2 = zzvj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzvj2.zzc(i2)) {
                zztz zzd2 = zzvj2.zzd(i2);
                for (int i3 = 0; i3 < zzd2.zzc; i3++) {
                    zzck zzb2 = zzd2.zzb(i3);
                    List zza2 = zzva.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        zzvb zzvb = (zzvb) zza2.get(i6);
                        int zzb3 = zzvb.zzb();
                        if (!zArr[i6] && zzb3 != 0) {
                            if (zzb3 == i5) {
                                obj = zzfrh.zzp(zzvb);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvb);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    zzvb zzvb2 = (zzvb) zza2.get(i7);
                                    if (zzvb2.zzb() == 2 && zzvb.zzc(zzvb2)) {
                                        arrayList2.add(zzvb2);
                                        zArr[i7] = true;
                                    }
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        i5 = 1;
                    }
                }
            }
            zzva zzva2 = zzva;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzvb) list.get(i8)).zzc;
        }
        zzvb zzvb3 = (zzvb) list.get(0);
        return Pair.create(new zzvg(zzvb3.zzb, iArr2, 0), Integer.valueOf(zzvb3.zza));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.zzvh[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.google.android.gms.internal.ads.zzuf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: com.google.android.gms.internal.ads.zzvi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.gms.internal.ads.zzvi} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzvj r24, int[][][] r25, int[] r26, com.google.android.gms.internal.ads.zzsb r27, com.google.android.gms.internal.ads.zzci r28) throws com.google.android.gms.internal.ads.zzgu {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.concurrent.atomic.AtomicReference r3 = r0.zzd
            java.lang.Object r3 = r3.get()
            com.google.android.gms.internal.ads.zzuu r3 = (com.google.android.gms.internal.ads.zzuu) r3
            r4 = 2
            com.google.android.gms.internal.ads.zzvg[] r5 = new com.google.android.gms.internal.ads.zzvg[r4]
            com.google.android.gms.internal.ads.zzuk r6 = new com.google.android.gms.internal.ads.zzuk
            r7 = r26
            r6.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzul r7 = com.google.android.gms.internal.ads.zzul.zza
            android.util.Pair r6 = zzp(r4, r1, r2, r6, r7)
            if (r6 == 0) goto L_0x002e
            java.lang.Object r7 = r6.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.zzvg r6 = (com.google.android.gms.internal.ads.zzvg) r6
            r5[r7] = r6
        L_0x002e:
            r6 = 0
            r7 = 0
        L_0x0030:
            r8 = 1
            if (r7 >= r4) goto L_0x0046
            int r9 = r1.zzc(r7)
            if (r9 != r4) goto L_0x0043
            com.google.android.gms.internal.ads.zztz r9 = r1.zzd(r7)
            int r9 = r9.zzc
            if (r9 <= 0) goto L_0x0043
            r7 = 1
            goto L_0x0047
        L_0x0043:
            int r7 = r7 + 1
            goto L_0x0030
        L_0x0046:
            r7 = 0
        L_0x0047:
            com.google.android.gms.internal.ads.zzui r9 = new com.google.android.gms.internal.ads.zzui
            r9.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzuj r7 = com.google.android.gms.internal.ads.zzuj.zza
            android.util.Pair r7 = zzp(r8, r1, r2, r9, r7)
            if (r7 == 0) goto L_0x0062
            java.lang.Object r9 = r7.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.zzvg r10 = (com.google.android.gms.internal.ads.zzvg) r10
            r5[r9] = r10
        L_0x0062:
            if (r7 != 0) goto L_0x0066
            r7 = 0
            goto L_0x0079
        L_0x0066:
            java.lang.Object r7 = r7.first
            r10 = r7
            com.google.android.gms.internal.ads.zzvg r10 = (com.google.android.gms.internal.ads.zzvg) r10
            com.google.android.gms.internal.ads.zzck r10 = r10.zza
            com.google.android.gms.internal.ads.zzvg r7 = (com.google.android.gms.internal.ads.zzvg) r7
            int[] r7 = r7.zzb
            r7 = r7[r6]
            com.google.android.gms.internal.ads.zzad r7 = r10.zzb(r7)
            java.lang.String r7 = r7.zzd
        L_0x0079:
            com.google.android.gms.internal.ads.zzum r10 = new com.google.android.gms.internal.ads.zzum
            r10.<init>(r3, r7)
            com.google.android.gms.internal.ads.zzun r7 = com.google.android.gms.internal.ads.zzun.zza
            r11 = 3
            android.util.Pair r7 = zzp(r11, r1, r2, r10, r7)
            if (r7 == 0) goto L_0x0095
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.zzvg r7 = (com.google.android.gms.internal.ads.zzvg) r7
            r5[r10] = r7
        L_0x0095:
            r7 = 0
        L_0x0096:
            if (r7 >= r4) goto L_0x0108
            int r10 = r1.zzc(r7)
            if (r10 == r4) goto L_0x00ff
            if (r10 == r8) goto L_0x00ff
            if (r10 == r11) goto L_0x00ff
            com.google.android.gms.internal.ads.zztz r10 = r1.zzd(r7)
            r12 = r2[r7]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x00ad:
            int r11 = r10.zzc
            if (r13 >= r11) goto L_0x00ee
            com.google.android.gms.internal.ads.zzck r11 = r10.zzb(r13)
            r17 = r12[r13]
            r9 = r16
            r4 = 0
        L_0x00ba:
            int r6 = r11.zzb
            if (r4 > 0) goto L_0x00e4
            r6 = r17[r4]
            boolean r8 = r3.zzP
            boolean r6 = zzi(r6, r8)
            if (r6 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.zzad r6 = r11.zzb(r4)
            com.google.android.gms.internal.ads.zzur r8 = new com.google.android.gms.internal.ads.zzur
            r2 = r17[r4]
            r8.<init>(r6, r2)
            if (r9 == 0) goto L_0x00db
            int r2 = r8.compareTo(r9)
            if (r2 <= 0) goto L_0x00de
        L_0x00db:
            r15 = r4
            r9 = r8
            r14 = r11
        L_0x00de:
            int r4 = r4 + 1
            r2 = r25
            r8 = 1
            goto L_0x00ba
        L_0x00e4:
            int r13 = r13 + 1
            r2 = r25
            r16 = r9
            r4 = 2
            r6 = 0
            r8 = 1
            goto L_0x00ad
        L_0x00ee:
            if (r14 != 0) goto L_0x00f2
            r2 = 0
            goto L_0x00fd
        L_0x00f2:
            com.google.android.gms.internal.ads.zzvg r2 = new com.google.android.gms.internal.ads.zzvg
            r4 = 1
            int[] r6 = new int[r4]
            r4 = 0
            r6[r4] = r15
            r2.<init>(r14, r6, r4)
        L_0x00fd:
            r5[r7] = r2
        L_0x00ff:
            int r7 = r7 + 1
            r2 = r25
            r4 = 2
            r6 = 0
            r8 = 1
            r11 = 3
            goto L_0x0096
        L_0x0108:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4 = 0
            r6 = 2
        L_0x010f:
            if (r4 >= r6) goto L_0x011b
            com.google.android.gms.internal.ads.zztz r7 = r1.zzd(r4)
            zzo(r7, r3, r2)
            int r4 = r4 + 1
            goto L_0x010f
        L_0x011b:
            com.google.android.gms.internal.ads.zztz r4 = r24.zze()
            zzo(r4, r3, r2)
            r4 = 0
        L_0x0123:
            if (r4 >= r6) goto L_0x013a
            int r7 = r1.zzc(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            com.google.android.gms.internal.ads.zzcm r7 = (com.google.android.gms.internal.ads.zzcm) r7
            if (r7 != 0) goto L_0x0138
            int r4 = r4 + 1
            goto L_0x0123
        L_0x0138:
            r4 = 0
            throw r4
        L_0x013a:
            r4 = 0
            r2 = 0
        L_0x013c:
            if (r2 >= r6) goto L_0x0156
            com.google.android.gms.internal.ads.zztz r6 = r1.zzd(r2)
            boolean r7 = r3.zzg(r2, r6)
            if (r7 != 0) goto L_0x0149
            goto L_0x0151
        L_0x0149:
            com.google.android.gms.internal.ads.zzuy r6 = r3.zze(r2, r6)
            if (r6 != 0) goto L_0x0155
            r5[r2] = r4
        L_0x0151:
            int r2 = r2 + 1
            r6 = 2
            goto L_0x013c
        L_0x0155:
            throw r4
        L_0x0156:
            r2 = 2
            r4 = 0
        L_0x0158:
            if (r4 >= r2) goto L_0x017a
            int r2 = r1.zzc(r4)
            boolean r6 = r3.zzf(r4)
            if (r6 != 0) goto L_0x0173
            com.google.android.gms.internal.ads.zzfrm r6 = r3.zzB
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r2 = 0
            goto L_0x0176
        L_0x0173:
            r2 = 0
            r5[r4] = r2
        L_0x0176:
            int r4 = r4 + 1
            r2 = 2
            goto L_0x0158
        L_0x017a:
            r2 = 0
            com.google.android.gms.internal.ads.zzue r4 = r0.zze
            com.google.android.gms.internal.ads.zzvv r12 = r23.zzl()
            com.google.android.gms.internal.ads.zzfrh r13 = com.google.android.gms.internal.ads.zzuf.zzf(r5)
            r6 = 2
            com.google.android.gms.internal.ads.zzvh[] r14 = new com.google.android.gms.internal.ads.zzvh[r6]
            r15 = 0
        L_0x0189:
            if (r15 >= r6) goto L_0x01d2
            r6 = r5[r15]
            if (r6 == 0) goto L_0x01ca
            int[] r8 = r6.zzb
            int r7 = r8.length
            if (r7 != 0) goto L_0x0195
            goto L_0x01ca
        L_0x0195:
            r11 = 1
            if (r7 != r11) goto L_0x01b0
            com.google.android.gms.internal.ads.zzvi r7 = new com.google.android.gms.internal.ads.zzvi
            com.google.android.gms.internal.ads.zzck r6 = r6.zza
            r16 = 0
            r19 = r8[r16]
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r18 = 1
            goto L_0x01c7
        L_0x01b0:
            r16 = 0
            com.google.android.gms.internal.ads.zzck r7 = r6.zza
            r9 = 0
            java.lang.Object r6 = r13.get(r15)
            r17 = r6
            com.google.android.gms.internal.ads.zzfrh r17 = (com.google.android.gms.internal.ads.zzfrh) r17
            r6 = r4
            r10 = r12
            r18 = 1
            r11 = r17
            com.google.android.gms.internal.ads.zzuf r7 = r6.zza(r7, r8, r9, r10, r11)
        L_0x01c7:
            r14[r15] = r7
            goto L_0x01ce
        L_0x01ca:
            r16 = 0
            r18 = 1
        L_0x01ce:
            int r15 = r15 + 1
            r6 = 2
            goto L_0x0189
        L_0x01d2:
            r16 = 0
            com.google.android.gms.internal.ads.zzjw[] r4 = new com.google.android.gms.internal.ads.zzjw[r6]
            r5 = 0
        L_0x01d7:
            if (r5 >= r6) goto L_0x0204
            int r7 = r1.zzc(r5)
            boolean r8 = r3.zzf(r5)
            if (r8 != 0) goto L_0x01fe
            com.google.android.gms.internal.ads.zzfrm r8 = r3.zzB
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x01f0
            goto L_0x01fe
        L_0x01f0:
            int r7 = r1.zzc(r5)
            r8 = -2
            if (r7 == r8) goto L_0x01fb
            r7 = r14[r5]
            if (r7 == 0) goto L_0x01fe
        L_0x01fb:
            com.google.android.gms.internal.ads.zzjw r7 = com.google.android.gms.internal.ads.zzjw.zza
            goto L_0x01ff
        L_0x01fe:
            r7 = r2
        L_0x01ff:
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x01d7
        L_0x0204:
            boolean r1 = r3.zzQ
            android.util.Pair r1 = android.util.Pair.create(r4, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvf.zzb(com.google.android.gms.internal.ads.zzvj, int[][][], int[], com.google.android.gms.internal.ads.zzsb, com.google.android.gms.internal.ads.zzci):android.util.Pair");
    }

    public final zzuu zzc() {
        return (zzuu) this.zzd.get();
    }

    public final void zzg(zzuw zzuw) {
        zzuu zzuu = new zzuu(zzuw);
        if (!((zzuu) this.zzd.getAndSet(zzuu)).equals(zzuu)) {
            zzn();
        }
    }

    public final boolean zzh() {
        return true;
    }

    public zzvf(Context context) {
        zzue zzue = new zzue();
        zzuu zzc2 = zzuu.zzc(context);
        this.zze = zzue;
        this.zzd = new AtomicReference(zzc2);
    }
}
