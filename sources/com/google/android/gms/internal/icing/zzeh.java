package com.google.android.gms.internal.icing;

import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import p001a0.C0016g;
import p001a0.C0017h;
import sun.misc.Unsafe;

final class zzeh<T> implements zzep<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfn.zzq();
    private final int[] zzc;
    private final Object[] zzd;
    private final zzee zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzds zzk;
    private final zzfd<?, ?> zzl;
    private final zzcq<?> zzm;
    private final zzej zzn;
    private final zzdz zzo;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.icing.zzee} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.gms.internal.icing.zzej} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.icing.zzdz} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzcq<?>] */
    /* JADX WARNING: type inference failed for: r3v6, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [com.google.android.gms.internal.icing.zzds] */
    /* JADX WARNING: type inference failed for: r3v10, types: [com.google.android.gms.internal.icing.zzfd<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzeh(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.icing.zzee r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.icing.zzej r17, com.google.android.gms.internal.icing.zzds r18, com.google.android.gms.internal.icing.zzfd<?, ?> r19, com.google.android.gms.internal.icing.zzcq<?> r20, com.google.android.gms.internal.icing.zzdz r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.zzc = r3
            r3 = r7
            r0.zzd = r3
            r3 = r11
            r0.zzg = r3
            r3 = 0
            if (r2 == 0) goto L_0x001a
            boolean r4 = r2.zza(r10)
            if (r4 == 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            r0.zzf = r3
            r3 = r13
            r0.zzh = r3
            r3 = r14
            r0.zzi = r3
            r3 = r15
            r0.zzj = r3
            r3 = r16
            r0.zzn = r3
            r3 = r17
            r0.zzk = r3
            r3 = r18
            r0.zzl = r3
            r0.zzm = r2
            r0.zze = r1
            r1 = r20
            r0.zzo = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.icing.zzee, boolean, boolean, int[], int, int, com.google.android.gms.internal.icing.zzej, com.google.android.gms.internal.icing.zzds, com.google.android.gms.internal.icing.zzfd, com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzdz, byte[]):void");
    }

    private final boolean zzA(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzB(t, i) : (i3 & i4) != 0;
    }

    private final boolean zzB(T t, int i) {
        int zzs = zzs(i);
        long j = (long) (zzs & 1048575);
        if (j == 1048575) {
            int zzr = zzr(i);
            long j2 = (long) (zzr & 1048575);
            switch (zzt(zzr)) {
                case 0:
                    if (zzfn.zzl(t, j2) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (zzfn.zzj(t, j2) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzfn.zzf(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzfn.zzf(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzfn.zzf(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return zzfn.zzh(t, j2);
                case 8:
                    Object zzn2 = zzfn.zzn(t, j2);
                    if (zzn2 instanceof String) {
                        if (!((String) zzn2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzn2 instanceof zzcf)) {
                        throw new IllegalArgumentException();
                    } else if (!zzcf.zzb.equals(zzn2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzfn.zzn(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzcf.zzb.equals(zzfn.zzn(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzfn.zzf(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzfn.zzd(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzfn.zzf(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzfn.zzn(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzfn.zzd(t, j) & (1 << (zzs >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final void zzC(T t, int i) {
        int zzs = zzs(i);
        long j = (long) (1048575 & zzs);
        if (j != 1048575) {
            zzfn.zze(t, j, (1 << (zzs >>> 20)) | zzfn.zzd(t, j));
        }
    }

    private final boolean zzD(T t, int i, int i2) {
        if (zzfn.zzd(t, (long) (zzs(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    private final void zzE(T t, int i, int i2) {
        zzfn.zze(t, (long) (zzs(i2) & 1048575), i);
    }

    private final void zzF(T t, zzcn zzcn) throws IOException {
        int i;
        T t2 = t;
        zzcn zzcn2 = zzcn;
        if (!this.zzf) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzr = zzr(i3);
                int i6 = this.zzc[i3];
                int zzt = zzt(zzr);
                if (zzt <= 17) {
                    int i7 = this.zzc[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (zzr & i2);
                switch (zzt) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzcn2.zzf(i6, zzfn.zzl(t2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzcn2.zze(i6, zzfn.zzj(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzcn2.zzc(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzcn2.zzh(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzcn2.zzi(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzcn2.zzj(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzcn2.zzk(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzcn2.zzl(i6, zzfn.zzh(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            zzH(i6, unsafe.getObject(t2, j), zzcn2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzcn2.zzr(i6, unsafe.getObject(t2, j), zzo(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzcn2.zzn(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzcn2.zzo(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzcn2.zzg(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzcn2.zzb(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzcn2.zzd(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzcn2.zzp(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzcn2.zzq(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzcn2.zzs(i6, unsafe.getObject(t2, j), zzo(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzer.zzH(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 19:
                        zzer.zzI(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 20:
                        zzer.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 21:
                        zzer.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 22:
                        zzer.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 23:
                        zzer.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 24:
                        zzer.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 25:
                        zzer.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        continue;
                    case 26:
                        zzer.zzV(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2);
                        break;
                    case 27:
                        zzer.zzX(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, zzo(i3));
                        break;
                    case 28:
                        zzer.zzW(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2);
                        break;
                    case 29:
                        zzer.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 30:
                        zzer.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 31:
                        zzer.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 32:
                        zzer.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 33:
                        zzer.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 34:
                        zzer.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, false);
                        break;
                    case 35:
                        zzer.zzH(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 36:
                        zzer.zzI(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 37:
                        zzer.zzJ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 38:
                        zzer.zzK(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 39:
                        zzer.zzO(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 40:
                        zzer.zzM(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 41:
                        zzer.zzR(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 42:
                        zzer.zzU(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 43:
                        zzer.zzP(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 44:
                        zzer.zzT(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 45:
                        zzer.zzS(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 46:
                        zzer.zzN(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 47:
                        zzer.zzQ(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 48:
                        zzer.zzL(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, true);
                        break;
                    case 49:
                        zzer.zzY(this.zzc[i3], (List) unsafe.getObject(t2, j), zzcn2, zzo(i3));
                        break;
                    case 50:
                        zzG(zzcn2, i6, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzf(i6, zzu(t2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zze(i6, zzv(t2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzc(i6, zzx(t2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzh(i6, zzx(t2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzi(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzj(i6, zzx(t2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzk(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzl(i6, zzy(t2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzD(t2, i6, i3)) {
                            zzH(i6, unsafe.getObject(t2, j), zzcn2);
                            break;
                        }
                        break;
                    case 60:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzr(i6, unsafe.getObject(t2, j), zzo(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzn(i6, (zzcf) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzo(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzg(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzb(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzd(i6, zzx(t2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzp(i6, zzw(t2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzq(i6, zzx(t2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzD(t2, i6, i3)) {
                            zzcn2.zzs(i6, unsafe.getObject(t2, j), zzo(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzfd<?, ?> zzfd = this.zzl;
            zzfd.zzg(zzfd.zzb(t2), zzcn2);
            return;
        }
        this.zzm.zzb(t2);
        throw null;
    }

    private final <K, V> void zzG(zzcn zzcn, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzdx zzdx = (zzdx) zzp(i2);
            throw null;
        }
    }

    private static final void zzH(int i, Object obj, zzcn zzcn) throws IOException {
        if (obj instanceof String) {
            zzcn.zzm(i, (String) obj);
        } else {
            zzcn.zzn(i, (zzcf) obj);
        }
    }

    public static <T> zzeh<T> zzg(Class<T> cls, zzeb zzeb, zzej zzej, zzds zzds, zzfd<?, ?> zzfd, zzcq<?> zzcq, zzdz zzdz) {
        if (zzeb instanceof zzeo) {
            return zzh((zzeo) zzeb, zzej, zzds, zzfd, zzcq, zzdz);
        }
        zzfa zzfa = (zzfa) zzeb;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.icing.zzeh<T> zzh(com.google.android.gms.internal.icing.zzeo r33, com.google.android.gms.internal.icing.zzej r34, com.google.android.gms.internal.icing.zzds r35, com.google.android.gms.internal.icing.zzfd<?, ?> r36, com.google.android.gms.internal.icing.zzcq<?> r37, com.google.android.gms.internal.icing.zzdz r38) {
        /*
            int r0 = r33.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r33.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = zza
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r32 = r12
            r12 = r9
            r9 = r32
        L_0x0165:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r33.zze()
            com.google.android.gms.internal.icing.zzee r18 = r33.zzb()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            r31 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r30
            r12 = r31
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r30
            goto L_0x0226
        L_0x0222:
            r31 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzj(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r30 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzj(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r26 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r11 = r0
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r30 = r7
            r14 = r8
            r31 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzj(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r26 = r26 + r7
            r7 = r17[r26]
            boolean r11 = r7 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x0365
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x036d
        L_0x0365:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zzj(r1, r7)
            r17[r26] = r7
        L_0x036d:
            r11 = r0
            r26 = r1
            long r0 = r15.objectFieldOffset(r7)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r11 = r0
            r26 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r30[r9] = r4
            int r4 = r0 + 1
            r7 = r2 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x039e
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r7 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r7
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r30[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r30[r4] = r0
            r0 = r11
            r8 = r14
            r14 = r24
            r1 = r26
            r4 = r27
            r3 = r28
            r11 = r29
            r7 = r30
            r12 = r31
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r30 = r7
            r29 = r11
            r31 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.icing.zzeh r0 = new com.google.android.gms.internal.icing.zzeh
            r4 = r0
            com.google.android.gms.internal.icing.zzee r9 = r33.zzb()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r30
            r6 = r1
            r7 = r14
            r8 = r31
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r19 = r38
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zzh(com.google.android.gms.internal.icing.zzeo, com.google.android.gms.internal.icing.zzej, com.google.android.gms.internal.icing.zzds, com.google.android.gms.internal.icing.zzfd, com.google.android.gms.internal.icing.zzcq, com.google.android.gms.internal.icing.zzdz):com.google.android.gms.internal.icing.zzeh");
    }

    private static Field zzj(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(C16530d.m42011d(String.valueOf(str).length(), 40, name.length(), String.valueOf(arrays).length()));
            C0017h.m61R(sb, "Field ", str, " for ", name);
            throw new RuntimeException(C0016g.m31o(sb, " not found. Known fields are ", arrays));
        }
    }

    private final void zzk(T t, T t2, int i) {
        long zzr = (long) (zzr(i) & 1048575);
        if (zzB(t2, i)) {
            Object zzn2 = zzfn.zzn(t, zzr);
            Object zzn3 = zzfn.zzn(t2, zzr);
            if (zzn2 != null && zzn3 != null) {
                zzfn.zzo(t, zzr, zzdh.zzi(zzn2, zzn3));
                zzC(t, i);
            } else if (zzn3 != null) {
                zzfn.zzo(t, zzr, zzn3);
                zzC(t, i);
            }
        }
    }

    private final void zzl(T t, T t2, int i) {
        Object obj;
        int zzr = zzr(i);
        int i2 = this.zzc[i];
        long j = (long) (zzr & 1048575);
        if (zzD(t2, i2, i)) {
            if (zzD(t, i2, i)) {
                obj = zzfn.zzn(t, j);
            } else {
                obj = null;
            }
            Object zzn2 = zzfn.zzn(t2, j);
            if (obj != null && zzn2 != null) {
                zzfn.zzo(t, j, zzdh.zzi(obj, zzn2));
                zzE(t, i2, i);
            } else if (zzn2 != null) {
                zzfn.zzo(t, j, zzn2);
                zzE(t, i2, i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r9 = (r9 + r8) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04a5, code lost:
        r9 = (r9 + r7) + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04a7, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04c1, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04eb, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0512, code lost:
        r4 = (r8 + r7) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0520, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x052e, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0532, code lost:
        r3 = r3 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzm(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.zzc
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0536
            int r7 = r14.zzr(r3)
            int[] r8 = r14.zzc
            r8 = r8[r3]
            int r9 = zzt(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.zzc
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0524;
                case 1: goto L_0x0516;
                case 2: goto L_0x0500;
                case 3: goto L_0x04ed;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04b7;
                case 8: goto L_0x0489;
                case 9: goto L_0x0476;
                case 10: goto L_0x045d;
                case 11: goto L_0x0449;
                case 12: goto L_0x0435;
                case 13: goto L_0x0429;
                case 14: goto L_0x041d;
                case 15: goto L_0x0404;
                case 16: goto L_0x03ec;
                case 17: goto L_0x03d8;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03c0;
                case 20: goto L_0x03b4;
                case 21: goto L_0x03a8;
                case 22: goto L_0x039c;
                case 23: goto L_0x0390;
                case 24: goto L_0x0384;
                case 25: goto L_0x0378;
                case 26: goto L_0x036c;
                case 27: goto L_0x035c;
                case 28: goto L_0x0350;
                case 29: goto L_0x0344;
                case 30: goto L_0x0338;
                case 31: goto L_0x032c;
                case 32: goto L_0x0320;
                case 33: goto L_0x0314;
                case 34: goto L_0x0308;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0532
        L_0x0041:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzee r7 = (com.google.android.gms.internal.icing.zzee) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzE(r8, r7, r9)
            goto L_0x0486
        L_0x0057:
            boolean r9 = r14.zzD(r15, r8, r3)
            if (r9 == 0) goto L_0x0532
            long r9 = zzx(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
            goto L_0x04eb
        L_0x0071:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzw(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04eb
        L_0x008c:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x052e
        L_0x009a:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0520
        L_0x00a8:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzw(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzv(r7)
            goto L_0x04eb
        L_0x00be:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzw(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04eb
        L_0x00d4:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04a5
        L_0x00f0:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.zzw(r8, r7, r9)
            goto L_0x0486
        L_0x0104:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.icing.zzcf
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04a5
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzy(r7)
            goto L_0x04eb
        L_0x0132:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04c1
        L_0x0140:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0520
        L_0x014e:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x052e
        L_0x015c:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = zzw(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzv(r7)
            goto L_0x04eb
        L_0x0172:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzx(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
            goto L_0x0512
        L_0x0188:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            long r9 = zzx(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
            goto L_0x0512
        L_0x019e:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0520
        L_0x01ac:
            boolean r7 = r14.zzD(r15, r8, r3)
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x052e
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.zzp(r3)
            com.google.android.gms.internal.icing.zzdz.zza(r8, r7, r9)
            goto L_0x0532
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.zzz(r8, r7, r9)
            goto L_0x0486
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzf(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzn(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzr(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzp(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzh(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzl(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzt(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzp(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzr(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzj(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzd(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzb(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzp(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzr(r7)
            if (r7 <= 0) goto L_0x0532
            int r8 = com.google.android.gms.internal.icing.zzcm.zzu(r8)
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
        L_0x0304:
            int r9 = r9 + r8
            int r9 = r9 + r7
            goto L_0x04a7
        L_0x0308:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzg(r8, r7, r2)
            goto L_0x0486
        L_0x0314:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzo(r8, r7, r2)
            goto L_0x0486
        L_0x0320:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzs(r8, r7, r2)
            goto L_0x0486
        L_0x032c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzq(r8, r7, r2)
            goto L_0x0486
        L_0x0338:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzi(r8, r7, r2)
            goto L_0x0486
        L_0x0344:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzm(r8, r7, r2)
            goto L_0x0486
        L_0x0350:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzy(r8, r7)
            goto L_0x0486
        L_0x035c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.zzx(r8, r7, r9)
            goto L_0x0486
        L_0x036c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzv(r8, r7)
            goto L_0x0486
        L_0x0378:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzu(r8, r7, r2)
            goto L_0x0486
        L_0x0384:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzq(r8, r7, r2)
            goto L_0x0486
        L_0x0390:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzs(r8, r7, r2)
            goto L_0x0486
        L_0x039c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzk(r8, r7, r2)
            goto L_0x0486
        L_0x03a8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zze(r8, r7, r2)
            goto L_0x0486
        L_0x03b4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzc(r8, r7, r2)
            goto L_0x0486
        L_0x03c0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzq(r8, r7, r2)
            goto L_0x0486
        L_0x03cc:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.icing.zzer.zzs(r8, r7, r2)
            goto L_0x0486
        L_0x03d8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzee r7 = (com.google.android.gms.internal.icing.zzee) r7
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzE(r8, r7, r9)
            goto L_0x0486
        L_0x03ec:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
            goto L_0x04eb
        L_0x0404:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04eb
        L_0x041d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x052e
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0520
        L_0x0435:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzv(r7)
            goto L_0x04eb
        L_0x0449:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04eb
        L_0x045d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x04a5
        L_0x0476:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.icing.zzep r9 = r14.zzo(r3)
            int r7 = com.google.android.gms.internal.icing.zzer.zzw(r8, r7, r9)
        L_0x0486:
            int r4 = r4 + r7
            goto L_0x0532
        L_0x0489:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.icing.zzcf
            if (r9 == 0) goto L_0x04aa
            com.google.android.gms.internal.icing.zzcf r7 = (com.google.android.gms.internal.icing.zzcf) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = r7.zzc()
            int r9 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
        L_0x04a5:
            int r9 = r9 + r7
            int r9 = r9 + r8
        L_0x04a7:
            int r4 = r4 + r9
            goto L_0x0532
        L_0x04aa:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzy(r7)
            goto L_0x04eb
        L_0x04b7:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
        L_0x04c1:
            int r7 = r7 + r11
            goto L_0x0486
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x0520
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            goto L_0x052e
        L_0x04d9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.icing.zzcm.zzw(r8)
            int r7 = com.google.android.gms.internal.icing.zzcm.zzv(r7)
        L_0x04eb:
            int r7 = r7 + r8
            goto L_0x0486
        L_0x04ed:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
            goto L_0x0512
        L_0x0500:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
            int r8 = com.google.android.gms.internal.icing.zzcm.zzx(r9)
        L_0x0512:
            int r8 = r8 + r7
            int r8 = r8 + r4
            r4 = r8
            goto L_0x0532
        L_0x0516:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
        L_0x0520:
            int r7 = r7 + 4
            goto L_0x0486
        L_0x0524:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0532
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.icing.zzcm.zzw(r7)
        L_0x052e:
            int r7 = r7 + 8
            goto L_0x0486
        L_0x0532:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x0536:
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r14.zzl
            java.lang.Object r1 = r0.zzb(r15)
            int r0 = r0.zzf(r1)
            int r4 = r4 + r0
            boolean r0 = r14.zzf
            if (r0 != 0) goto L_0x0546
            return r4
        L_0x0546:
            com.google.android.gms.internal.icing.zzcq<?> r0 = r14.zzm
            r0.zzb(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zzm(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r6 = (r6 + r5) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04b2, code lost:
        r6 = (r6 + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b4, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04d0, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0501, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x052c, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x053b, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x054b, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054f, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzn(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = zzb
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.zzc
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0553
            int r4 = r11.zzr(r2)
            int r5 = zzt(r4)
            int[] r6 = r11.zzc
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.icing.zzcv r4 = com.google.android.gms.internal.icing.zzcv.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.icing.zzcv r4 = com.google.android.gms.internal.icing.zzcv.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.zzc
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x053f;
                case 1: goto L_0x052f;
                case 2: goto L_0x0518;
                case 3: goto L_0x0503;
                case 4: goto L_0x04ed;
                case 5: goto L_0x04e0;
                case 6: goto L_0x04d3;
                case 7: goto L_0x04c4;
                case 8: goto L_0x0494;
                case 9: goto L_0x047f;
                case 10: goto L_0x0464;
                case 11: goto L_0x044e;
                case 12: goto L_0x0438;
                case 13: goto L_0x042a;
                case 14: goto L_0x041c;
                case 15: goto L_0x0401;
                case 16: goto L_0x03e6;
                case 17: goto L_0x03d0;
                case 18: goto L_0x03c4;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0394;
                case 23: goto L_0x0388;
                case 24: goto L_0x037c;
                case 25: goto L_0x0370;
                case 26: goto L_0x0364;
                case 27: goto L_0x0354;
                case 28: goto L_0x0348;
                case 29: goto L_0x033c;
                case 30: goto L_0x0330;
                case 31: goto L_0x0324;
                case 32: goto L_0x0318;
                case 33: goto L_0x030c;
                case 34: goto L_0x0300;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x054f
        L_0x0038:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzee r4 = (com.google.android.gms.internal.icing.zzee) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzE(r6, r4, r5)
            goto L_0x0491
        L_0x004e:
            boolean r5 = r11.zzD(r12, r6, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = zzx(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r6)
            goto L_0x0501
        L_0x0069:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzw(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x0501
        L_0x0084:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x054b
        L_0x0092:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x053b
        L_0x00a0:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzw(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzv(r4)
            goto L_0x0501
        L_0x00b6:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzw(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x0501
        L_0x00cc:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x04b2
        L_0x00e8:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.zzw(r6, r4, r5)
            goto L_0x0491
        L_0x00fc:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.icing.zzcf
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x04b2
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzy(r4)
            goto L_0x0501
        L_0x012a:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x04d0
        L_0x0138:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x053b
        L_0x0146:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x054b
        L_0x0154:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = zzw(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzv(r4)
            goto L_0x0501
        L_0x016a:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzx(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r4)
            goto L_0x052c
        L_0x0180:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = zzx(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r4)
            goto L_0x052c
        L_0x0196:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x053b
        L_0x01a4:
            boolean r4 = r11.zzD(r12, r6, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x054b
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.lang.Object r5 = r11.zzp(r2)
            com.google.android.gms.internal.icing.zzdz.zza(r6, r4, r5)
            goto L_0x054f
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.zzz(r6, r4, r5)
            goto L_0x0491
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzf(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzn(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzp(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzh(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzl(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzt(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzp(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzj(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzd(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzb(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzp(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzr(r4)
            if (r4 <= 0) goto L_0x054f
            int r5 = com.google.android.gms.internal.icing.zzcm.zzu(r6)
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
        L_0x02fc:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b4
        L_0x0300:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzg(r6, r4, r1)
            goto L_0x0491
        L_0x030c:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzo(r6, r4, r1)
            goto L_0x0491
        L_0x0318:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x0324:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0330:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzi(r6, r4, r1)
            goto L_0x0491
        L_0x033c:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzm(r6, r4, r1)
            goto L_0x0491
        L_0x0348:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzy(r6, r4)
            goto L_0x0491
        L_0x0354:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.zzx(r6, r4, r5)
            goto L_0x0491
        L_0x0364:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzv(r6, r4)
            goto L_0x0491
        L_0x0370:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzu(r6, r4, r1)
            goto L_0x0491
        L_0x037c:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x0388:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x0394:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzk(r6, r4, r1)
            goto L_0x0491
        L_0x03a0:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zze(r6, r4, r1)
            goto L_0x0491
        L_0x03ac:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzc(r6, r4, r1)
            goto L_0x0491
        L_0x03b8:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzq(r6, r4, r1)
            goto L_0x0491
        L_0x03c4:
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.icing.zzer.zzs(r6, r4, r1)
            goto L_0x0491
        L_0x03d0:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzee r4 = (com.google.android.gms.internal.icing.zzee) r4
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzE(r6, r4, r5)
            goto L_0x0491
        L_0x03e6:
            boolean r5 = r11.zzB(r12, r2)
            if (r5 == 0) goto L_0x054f
            long r7 = com.google.android.gms.internal.icing.zzfn.zzf(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r6)
            goto L_0x0501
        L_0x0401:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.icing.zzfn.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x0501
        L_0x041c:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x054b
        L_0x042a:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x053b
        L_0x0438:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.icing.zzfn.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzv(r4)
            goto L_0x0501
        L_0x044e:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.icing.zzfn.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x0501
        L_0x0464:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x04b2
        L_0x047f:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            com.google.android.gms.internal.icing.zzep r5 = r11.zzo(r2)
            int r4 = com.google.android.gms.internal.icing.zzer.zzw(r6, r4, r5)
        L_0x0491:
            int r3 = r3 + r4
            goto L_0x054f
        L_0x0494:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            java.lang.Object r4 = com.google.android.gms.internal.icing.zzfn.zzn(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.icing.zzcf
            if (r5 == 0) goto L_0x04b7
            com.google.android.gms.internal.icing.zzcf r4 = (com.google.android.gms.internal.icing.zzcf) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = r4.zzc()
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
        L_0x04b2:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b4:
            int r3 = r3 + r6
            goto L_0x054f
        L_0x04b7:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzy(r4)
            goto L_0x0501
        L_0x04c4:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
        L_0x04d0:
            int r4 = r4 + 1
            goto L_0x0491
        L_0x04d3:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x053b
        L_0x04e0:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
            goto L_0x054b
        L_0x04ed:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = com.google.android.gms.internal.icing.zzfn.zzd(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.icing.zzcm.zzw(r5)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzv(r4)
        L_0x0501:
            int r4 = r4 + r5
            goto L_0x0491
        L_0x0503:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.icing.zzfn.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r4)
            goto L_0x052c
        L_0x0518:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            long r4 = com.google.android.gms.internal.icing.zzfn.zzf(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.icing.zzcm.zzw(r6)
            int r4 = com.google.android.gms.internal.icing.zzcm.zzx(r4)
        L_0x052c:
            int r4 = r4 + r6
            goto L_0x0491
        L_0x052f:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
        L_0x053b:
            int r4 = r4 + 4
            goto L_0x0491
        L_0x053f:
            boolean r4 = r11.zzB(r12, r2)
            if (r4 == 0) goto L_0x054f
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.icing.zzcm.zzw(r4)
        L_0x054b:
            int r4 = r4 + 8
            goto L_0x0491
        L_0x054f:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0553:
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r11.zzl
            java.lang.Object r12 = r0.zzb(r12)
            int r12 = r0.zzf(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zzn(java.lang.Object):int");
    }

    private final zzep zzo(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzep zzep = (zzep) this.zzd[i3];
        if (zzep != null) {
            return zzep;
        }
        zzep zzb2 = zzem.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzp(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static boolean zzq(Object obj, int i, zzep zzep) {
        return zzep.zzf(zzfn.zzn(obj, (long) (i & 1048575)));
    }

    private final int zzr(int i) {
        return this.zzc[i + 1];
    }

    private final int zzs(int i) {
        return this.zzc[i + 2];
    }

    private static int zzt(int i) {
        return (i >>> 20) & ValidationUtils.APPBOY_STRING_MAX_LENGTH;
    }

    private static <T> double zzu(T t, long j) {
        return ((Double) zzfn.zzn(t, j)).doubleValue();
    }

    private static <T> float zzv(T t, long j) {
        return ((Float) zzfn.zzn(t, j)).floatValue();
    }

    private static <T> int zzw(T t, long j) {
        return ((Integer) zzfn.zzn(t, j)).intValue();
    }

    private static <T> long zzx(T t, long j) {
        return ((Long) zzfn.zzn(t, j)).longValue();
    }

    private static <T> boolean zzy(T t, long j) {
        return ((Boolean) zzfn.zzn(t, j)).booleanValue();
    }

    private final boolean zzz(T t, T t2, int i) {
        return zzB(t, i) == zzB(t2, i);
    }

    public final boolean zza(T t, T t2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzr = zzr(i);
            long j = (long) (zzr & 1048575);
            switch (zzt(zzr)) {
                case 0:
                    if (zzz(t, t2, i) && Double.doubleToLongBits(zzfn.zzl(t, j)) == Double.doubleToLongBits(zzfn.zzl(t2, j))) {
                        continue;
                    }
                case 1:
                    if (zzz(t, t2, i) && Float.floatToIntBits(zzfn.zzj(t, j)) == Float.floatToIntBits(zzfn.zzj(t2, j))) {
                        continue;
                    }
                case 2:
                    if (zzz(t, t2, i) && zzfn.zzf(t, j) == zzfn.zzf(t2, j)) {
                        continue;
                    }
                case 3:
                    if (zzz(t, t2, i) && zzfn.zzf(t, j) == zzfn.zzf(t2, j)) {
                        continue;
                    }
                case 4:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 5:
                    if (zzz(t, t2, i) && zzfn.zzf(t, j) == zzfn.zzf(t2, j)) {
                        continue;
                    }
                case 6:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 7:
                    if (zzz(t, t2, i) && zzfn.zzh(t, j) == zzfn.zzh(t2, j)) {
                        continue;
                    }
                case 8:
                    if (zzz(t, t2, i) && zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j))) {
                        continue;
                    }
                case 9:
                    if (zzz(t, t2, i) && zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j))) {
                        continue;
                    }
                case 10:
                    if (zzz(t, t2, i) && zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j))) {
                        continue;
                    }
                case 11:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 12:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 13:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 14:
                    if (zzz(t, t2, i) && zzfn.zzf(t, j) == zzfn.zzf(t2, j)) {
                        continue;
                    }
                case 15:
                    if (zzz(t, t2, i) && zzfn.zzd(t, j) == zzfn.zzd(t2, j)) {
                        continue;
                    }
                case 16:
                    if (zzz(t, t2, i) && zzfn.zzf(t, j) == zzfn.zzf(t2, j)) {
                        continue;
                    }
                case 17:
                    if (zzz(t, t2, i) && zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j));
                    break;
                case 50:
                    z = zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = (long) (zzs(i) & 1048575);
                    if (zzfn.zzd(t, zzs) == zzfn.zzd(t2, zzs) && zzer.zzD(zzfn.zzn(t, j), zzfn.zzn(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzl.zzb(t).equals(this.zzl.zzb(t2))) {
            return false;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zzb(t);
        this.zzm.zzb(t2);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bf, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0224, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.zzr(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzt(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0216;
                case 1: goto L_0x020b;
                case 2: goto L_0x0200;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e2;
                case 6: goto L_0x01db;
                case 7: goto L_0x01d0;
                case 8: goto L_0x01c3;
                case 9: goto L_0x01b5;
                case 10: goto L_0x01a9;
                case 11: goto L_0x01a2;
                case 12: goto L_0x019b;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0226
        L_0x001f:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0031:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzx(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0043:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x0051:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzx(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0063:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x0071:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x007f:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x008d:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x009f:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00b1:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x00c5:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = zzy(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zzf(r3)
            goto L_0x0224
        L_0x00d7:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x00e5:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzx(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x00f7:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = zzw(r9, r5)
            goto L_0x01f3
        L_0x0105:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzx(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0117:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = zzx(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0129:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = zzv(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x013b:
            boolean r3 = r8.zzD(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = zzu(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
            goto L_0x01bf
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
            goto L_0x01f3
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
            goto L_0x01f3
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
            goto L_0x01f3
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
            goto L_0x01f3
        L_0x01a9:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01b5:
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            if (r3 == 0) goto L_0x01bf
            int r7 = r3.hashCode()
        L_0x01bf:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.icing.zzfn.zzn(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0224
        L_0x01d0:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.icing.zzfn.zzh(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zzf(r3)
            goto L_0x0224
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
            goto L_0x01f3
        L_0x01e2:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.icing.zzfn.zzd(r9, r5)
        L_0x01f3:
            int r2 = r2 + r3
            goto L_0x0226
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x0200:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.icing.zzfn.zzf(r9, r5)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
            goto L_0x0224
        L_0x020b:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.icing.zzfn.zzj(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0224
        L_0x0216:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.icing.zzfn.zzl(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.icing.zzdh.zze(r3)
        L_0x0224:
            int r3 = r3 + r2
            r2 = r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.android.gms.internal.icing.zzfd<?, ?> r0 = r8.zzl
            java.lang.Object r0 = r0.zzb(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzf
            if (r1 != 0) goto L_0x023c
            return r0
        L_0x023c:
            com.google.android.gms.internal.icing.zzcq<?> r0 = r8.zzm
            r0.zzb(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.zzeh.zzb(java.lang.Object):int");
    }

    public final void zzc(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzr = zzr(i);
            long j = (long) (1048575 & zzr);
            int i2 = this.zzc[i];
            switch (zzt(zzr)) {
                case 0:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzm(t, j, zzfn.zzl(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 1:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzk(t, j, zzfn.zzj(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 2:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzg(t, j, zzfn.zzf(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 3:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzg(t, j, zzfn.zzf(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 4:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 5:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzg(t, j, zzfn.zzf(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 6:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 7:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzi(t, j, zzfn.zzh(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 8:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzo(t, j, zzfn.zzn(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 9:
                    zzk(t, t2, i);
                    break;
                case 10:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzo(t, j, zzfn.zzn(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 11:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 12:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 13:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 14:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzg(t, j, zzfn.zzf(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 15:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zze(t, j, zzfn.zzd(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 16:
                    if (!zzB(t2, i)) {
                        break;
                    } else {
                        zzfn.zzg(t, j, zzfn.zzf(t2, j));
                        zzC(t, i);
                        break;
                    }
                case 17:
                    zzk(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(t, t2, j);
                    break;
                case 50:
                    zzer.zzG(this.zzo, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzD(t2, i2, i)) {
                        break;
                    } else {
                        zzfn.zzo(t, j, zzfn.zzn(t2, j));
                        zzE(t, i2, i);
                        break;
                    }
                case 60:
                    zzl(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzD(t2, i2, i)) {
                        break;
                    } else {
                        zzfn.zzo(t, j, zzfn.zzn(t2, j));
                        zzE(t, i2, i);
                        break;
                    }
                case 68:
                    zzl(t, t2, i);
                    break;
            }
        }
        zzer.zzF(this.zzl, t, t2);
        if (this.zzf) {
            zzer.zzE(this.zzm, t, t2);
        }
    }

    public final int zzd(T t) {
        return this.zzg ? zzn(t) : zzm(t);
    }

    public final void zze(T t) {
        int i;
        int i2 = this.zzi;
        while (true) {
            i = this.zzj;
            if (i2 >= i) {
                break;
            }
            long zzr = (long) (zzr(this.zzh[i2]) & 1048575);
            Object zzn2 = zzfn.zzn(t, zzr);
            if (zzn2 != null) {
                ((zzdy) zzn2).zzc();
                zzfn.zzo(t, zzr, zzn2);
            }
            i2++;
        }
        int length = this.zzh.length;
        while (i < length) {
            this.zzk.zza(t, (long) this.zzh[i]);
            i++;
        }
        this.zzl.zzc(t);
        if (this.zzf) {
            this.zzm.zzc(t);
        }
    }

    public final boolean zzf(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzi) {
            int i6 = this.zzh[i5];
            int i7 = this.zzc[i6];
            int zzr = zzr(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i11 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & zzr) != 0 && !zzA(t, i6, i2, i, i11)) {
                return false;
            }
            int zzt = zzt(zzr);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzD(t2, i7, i6) && !zzq(t2, zzr, zzo(i6))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzdy) zzfn.zzn(t2, (long) (zzr & 1048575))).isEmpty()) {
                            zzdx zzdx = (zzdx) zzp(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzfn.zzn(t2, (long) (zzr & 1048575));
                if (!list.isEmpty()) {
                    zzep zzo2 = zzo(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzo2.zzf(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzA(t, i6, i2, i, i11) && !zzq(t2, zzr, zzo(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzf) {
            return true;
        }
        this.zzm.zzb(t2);
        throw null;
    }

    public final void zzi(T t, zzcn zzcn) throws IOException {
        if (!this.zzg) {
            zzF(t, zzcn);
        } else if (!this.zzf) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzr = zzr(i);
                int i2 = this.zzc[i];
                switch (zzt(zzr)) {
                    case 0:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzf(i2, zzfn.zzl(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zze(i2, zzfn.zzj(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzc(i2, zzfn.zzf(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzh(i2, zzfn.zzf(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzi(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzj(i2, zzfn.zzf(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzk(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzl(i2, zzfn.zzh(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzH(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzcn);
                            break;
                        }
                    case 9:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzr(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzo(i));
                            break;
                        }
                    case 10:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzn(i2, (zzcf) zzfn.zzn(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzo(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzg(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzb(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzd(i2, zzfn.zzf(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzp(i2, zzfn.zzd(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzq(i2, zzfn.zzf(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzB(t, i)) {
                            break;
                        } else {
                            zzcn.zzs(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzo(i));
                            break;
                        }
                    case 18:
                        zzer.zzH(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 19:
                        zzer.zzI(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 20:
                        zzer.zzJ(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 21:
                        zzer.zzK(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 22:
                        zzer.zzO(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 23:
                        zzer.zzM(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 24:
                        zzer.zzR(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 25:
                        zzer.zzU(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 26:
                        zzer.zzV(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn);
                        break;
                    case 27:
                        zzer.zzX(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, zzo(i));
                        break;
                    case 28:
                        zzer.zzW(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn);
                        break;
                    case 29:
                        zzer.zzP(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 30:
                        zzer.zzT(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 31:
                        zzer.zzS(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 32:
                        zzer.zzN(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 33:
                        zzer.zzQ(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 34:
                        zzer.zzL(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, false);
                        break;
                    case 35:
                        zzer.zzH(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 36:
                        zzer.zzI(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 37:
                        zzer.zzJ(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 38:
                        zzer.zzK(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 39:
                        zzer.zzO(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 40:
                        zzer.zzM(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 41:
                        zzer.zzR(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 42:
                        zzer.zzU(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 43:
                        zzer.zzP(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 44:
                        zzer.zzT(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 45:
                        zzer.zzS(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 46:
                        zzer.zzN(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 47:
                        zzer.zzQ(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 48:
                        zzer.zzL(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, true);
                        break;
                    case 49:
                        zzer.zzY(this.zzc[i], (List) zzfn.zzn(t, (long) (zzr & 1048575)), zzcn, zzo(i));
                        break;
                    case 50:
                        zzG(zzcn, i2, zzfn.zzn(t, (long) (zzr & 1048575)), i);
                        break;
                    case 51:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzf(i2, zzu(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zze(i2, zzv(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzc(i2, zzx(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzh(i2, zzx(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzi(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzj(i2, zzx(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzk(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzl(i2, zzy(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzH(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzcn);
                            break;
                        }
                    case 60:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzr(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzo(i));
                            break;
                        }
                    case 61:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzn(i2, (zzcf) zzfn.zzn(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzo(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzg(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzb(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzd(i2, zzx(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzp(i2, zzw(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzq(i2, zzx(t, (long) (zzr & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzD(t, i2, i)) {
                            break;
                        } else {
                            zzcn.zzs(i2, zzfn.zzn(t, (long) (zzr & 1048575)), zzo(i));
                            break;
                        }
                }
            }
            zzfd<?, ?> zzfd = this.zzl;
            zzfd.zzg(zzfd.zzb(t), zzcn);
        } else {
            this.zzm.zzb(t);
            throw null;
        }
    }
}
