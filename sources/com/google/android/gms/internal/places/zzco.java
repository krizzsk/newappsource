package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001a0.C0016g;
import p001a0.C0017h;
import sun.misc.Unsafe;

final class zzco<T> implements zzda<T> {
    private static final int[] zzkq = new int[0];
    private static final Unsafe zzkr = zzdy.zzdn();
    private final int[] zzks;
    private final Object[] zzkt;
    private final int zzku;
    private final int zzkv;
    private final zzck zzkw;
    private final boolean zzkx;
    private final boolean zzky;
    private final boolean zzkz;
    private final boolean zzla;
    private final int[] zzlb;
    private final int zzlc;
    private final int zzld;
    private final zzcs zzle;
    private final zzbu zzlf;
    private final zzds<?, ?> zzlg;
    private final zzar<?> zzlh;
    private final zzcd zzli;

    private zzco(int[] iArr, Object[] objArr, int i, int i2, zzck zzck, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        boolean z3;
        this.zzks = iArr;
        this.zzkt = objArr;
        this.zzku = i;
        this.zzkv = i2;
        this.zzky = zzck instanceof zzbc;
        this.zzkz = z;
        if (zzar == null || !zzar.zzf(zzck)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.zzkx = z3;
        this.zzla = false;
        this.zzlb = iArr2;
        this.zzlc = i3;
        this.zzld = i4;
        this.zzle = zzcs;
        this.zzlf = zzbu;
        this.zzlg = zzds;
        this.zzlh = zzar;
        this.zzkw = zzck;
        this.zzli = zzcd;
    }

    private final zzda zzaf(int i) {
        int i2 = (i / 3) << 1;
        zzda zzda = (zzda) this.zzkt[i2];
        if (zzda != null) {
            return zzda;
        }
        zzda zzf = zzcv.zzcq().zzf((Class) this.zzkt[i2 + 1]);
        this.zzkt[i2] = zzf;
        return zzf;
    }

    private final Object zzag(int i) {
        return this.zzkt[(i / 3) << 1];
    }

    private final zzbf zzah(int i) {
        return (zzbf) this.zzkt[((i / 3) << 1) + 1];
    }

    private final int zzai(int i) {
        return this.zzks[i + 1];
    }

    private final int zzaj(int i) {
        return this.zzks[i + 2];
    }

    private final int zzak(int i) {
        if (i < this.zzku || i > this.zzkv) {
            return -1;
        }
        return zzr(i, 0);
    }

    public static <T> zzco<T> zzb(Class<T> cls, zzci zzci, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        int i;
        char c;
        int[] iArr;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        boolean z;
        int i4;
        zzcx zzcx;
        int i5;
        Class<?> cls2;
        int i6;
        String str;
        int i7;
        int i8;
        char c7;
        char c8;
        Field field;
        int i9;
        char charAt;
        int i11;
        Field field2;
        Field field3;
        int i12;
        char charAt2;
        int i13;
        char charAt3;
        int i14;
        char charAt4;
        int i15;
        int i16;
        char charAt5;
        int i17;
        char charAt6;
        int i18;
        char charAt7;
        int i19;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        char charAt10;
        int i23;
        char charAt11;
        int i24;
        char charAt12;
        int i25;
        char charAt13;
        char charAt14;
        zzci zzci2 = zzci;
        if (zzci2 instanceof zzcx) {
            zzcx zzcx2 = (zzcx) zzci2;
            char c9 = 0;
            boolean z2 = zzcx2.zzcj() == zzbc.zze.zziu;
            String zzcr = zzcx2.zzcr();
            int length = zzcr.length();
            char charAt15 = zzcr.charAt(0);
            if (charAt15 >= 55296) {
                char c11 = charAt15 & 8191;
                int i26 = 1;
                int i27 = 13;
                while (true) {
                    i = i26 + 1;
                    charAt14 = zzcr.charAt(i26);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c11 |= (charAt14 & 8191) << i27;
                    i27 += 13;
                    i26 = i;
                }
                charAt15 = c11 | (charAt14 << i27);
            } else {
                i = 1;
            }
            int i28 = i + 1;
            char charAt16 = zzcr.charAt(i);
            if (charAt16 >= 55296) {
                char c12 = charAt16 & 8191;
                int i29 = 13;
                while (true) {
                    i25 = i28 + 1;
                    charAt13 = zzcr.charAt(i28);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c12 |= (charAt13 & 8191) << i29;
                    i29 += 13;
                    i28 = i25;
                }
                charAt16 = c12 | (charAt13 << i29);
                i28 = i25;
            }
            if (charAt16 == 0) {
                iArr = zzkq;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
            } else {
                int i31 = i28 + 1;
                char charAt17 = zzcr.charAt(i28);
                if (charAt17 >= 55296) {
                    char c13 = charAt17 & 8191;
                    int i32 = 13;
                    while (true) {
                        i24 = i31 + 1;
                        charAt12 = zzcr.charAt(i31);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c13 |= (charAt12 & 8191) << i32;
                        i32 += 13;
                        i31 = i24;
                    }
                    charAt17 = c13 | (charAt12 << i32);
                    i31 = i24;
                }
                int i33 = i31 + 1;
                char charAt18 = zzcr.charAt(i31);
                if (charAt18 >= 55296) {
                    char c14 = charAt18 & 8191;
                    int i34 = 13;
                    while (true) {
                        i23 = i33 + 1;
                        charAt11 = zzcr.charAt(i33);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c14 |= (charAt11 & 8191) << i34;
                        i34 += 13;
                        i33 = i23;
                    }
                    charAt18 = c14 | (charAt11 << i34);
                    i33 = i23;
                }
                int i35 = i33 + 1;
                c3 = zzcr.charAt(i33);
                if (c3 >= 55296) {
                    char c15 = c3 & 8191;
                    int i36 = 13;
                    while (true) {
                        i22 = i35 + 1;
                        charAt10 = zzcr.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        c15 |= (charAt10 & 8191) << i36;
                        i36 += 13;
                        i35 = i22;
                    }
                    c3 = c15 | (charAt10 << i36);
                    i35 = i22;
                }
                int i37 = i35 + 1;
                char charAt19 = zzcr.charAt(i35);
                if (charAt19 >= 55296) {
                    char c16 = charAt19 & 8191;
                    int i38 = 13;
                    while (true) {
                        i21 = i37 + 1;
                        charAt9 = zzcr.charAt(i37);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c16 |= (charAt9 & 8191) << i38;
                        i38 += 13;
                        i37 = i21;
                    }
                    charAt19 = c16 | (charAt9 << i38);
                    i37 = i21;
                }
                int i39 = i37 + 1;
                c2 = zzcr.charAt(i37);
                if (c2 >= 55296) {
                    char c17 = c2 & 8191;
                    int i41 = 13;
                    while (true) {
                        i19 = i39 + 1;
                        charAt8 = zzcr.charAt(i39);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c17 |= (charAt8 & 8191) << i41;
                        i41 += 13;
                        i39 = i19;
                    }
                    c2 = c17 | (charAt8 << i41);
                    i39 = i19;
                }
                int i42 = i39 + 1;
                char charAt20 = zzcr.charAt(i39);
                if (charAt20 >= 55296) {
                    char c18 = charAt20 & 8191;
                    int i43 = 13;
                    while (true) {
                        i18 = i42 + 1;
                        charAt7 = zzcr.charAt(i42);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c18 |= (charAt7 & 8191) << i43;
                        i43 += 13;
                        i42 = i18;
                    }
                    charAt20 = c18 | (charAt7 << i43);
                    i42 = i18;
                }
                int i44 = i42 + 1;
                char charAt21 = zzcr.charAt(i42);
                if (charAt21 >= 55296) {
                    char c19 = charAt21 & 8191;
                    int i45 = i44;
                    int i46 = 13;
                    while (true) {
                        i17 = i45 + 1;
                        charAt6 = zzcr.charAt(i45);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c19 |= (charAt6 & 8191) << i46;
                        i46 += 13;
                        i45 = i17;
                    }
                    charAt21 = c19 | (charAt6 << i46);
                    i15 = i17;
                } else {
                    i15 = i44;
                }
                int i47 = i15 + 1;
                char charAt22 = zzcr.charAt(i15);
                if (charAt22 >= 55296) {
                    char c21 = charAt22 & 8191;
                    int i48 = i47;
                    int i49 = 13;
                    while (true) {
                        i16 = i48 + 1;
                        charAt5 = zzcr.charAt(i48);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c21 |= (charAt5 & 8191) << i49;
                        i49 += 13;
                        i48 = i16;
                    }
                    charAt22 = c21 | (charAt5 << i49);
                    i47 = i16;
                }
                int i51 = (charAt17 << 1) + charAt18;
                c4 = charAt19;
                i2 = i51;
                c = charAt22;
                c9 = charAt17;
                i28 = i47;
                char c22 = charAt20;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                c5 = c22;
            }
            Unsafe unsafe = zzkr;
            Object[] zzcs2 = zzcx2.zzcs();
            Class<?> cls3 = zzcx2.zzcl().getClass();
            int i52 = i28;
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i53 = c + c5;
            char c23 = c;
            int i54 = i52;
            int i55 = i53;
            int i56 = 0;
            int i57 = 0;
            while (i54 < length) {
                int i58 = i54 + 1;
                int charAt23 = zzcr.charAt(i54);
                int i59 = length;
                if (charAt23 >= 55296) {
                    int i61 = charAt23 & 8191;
                    int i62 = i58;
                    int i63 = 13;
                    while (true) {
                        i14 = i62 + 1;
                        charAt4 = zzcr.charAt(i62);
                        c6 = c;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i61 |= (charAt4 & 8191) << i63;
                        i63 += 13;
                        i62 = i14;
                        c = c6;
                    }
                    charAt23 = i61 | (charAt4 << i63);
                    i3 = i14;
                } else {
                    c6 = c;
                    i3 = i58;
                }
                int i64 = i3 + 1;
                char charAt24 = zzcr.charAt(i3);
                int i65 = i64;
                if (charAt24 >= 55296) {
                    char c24 = charAt24 & 8191;
                    int i66 = i65;
                    int i67 = 13;
                    while (true) {
                        i13 = i66 + 1;
                        charAt3 = zzcr.charAt(i66);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        c24 |= (charAt3 & 8191) << i67;
                        i67 += 13;
                        i66 = i13;
                        z2 = z;
                    }
                    charAt24 = c24 | (charAt3 << i67);
                    i4 = i13;
                } else {
                    z = z2;
                    i4 = i65;
                }
                char c25 = charAt24 & 255;
                char c26 = c4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i56] = i57;
                    i56++;
                }
                char c27 = c3;
                if (c25 >= '3') {
                    int i68 = i4 + 1;
                    char charAt25 = zzcr.charAt(i4);
                    char c28 = 55296;
                    if (charAt25 >= 55296) {
                        char c29 = charAt25 & 8191;
                        int i69 = 13;
                        while (true) {
                            i12 = i68 + 1;
                            charAt2 = zzcr.charAt(i68);
                            if (charAt2 < c28) {
                                break;
                            }
                            c29 |= (charAt2 & 8191) << i69;
                            i69 += 13;
                            i68 = i12;
                            c28 = 55296;
                        }
                        charAt25 = c29 | (charAt2 << i69);
                        i68 = i12;
                    }
                    int i71 = c25 - '3';
                    int i72 = i68;
                    if (i71 == 9 || i71 == 17) {
                        objArr[((i57 / 3) << 1) + 1] = zzcs2[i2];
                        i2++;
                    } else if (i71 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i57 / 3) << 1) + 1] = zzcs2[i2];
                        i2++;
                    }
                    int i73 = charAt25 << 1;
                    Object obj = zzcs2[i73];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = zzb(cls3, (String) obj);
                        zzcs2[i73] = field2;
                    }
                    zzcx = zzcx2;
                    String str2 = zzcr;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    int i74 = i73 + 1;
                    Object obj2 = zzcs2[i74];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = zzb(cls3, (String) obj2);
                        zzcs2[i74] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i72;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    c7 = c9;
                } else {
                    zzcx = zzcx2;
                    String str3 = zzcr;
                    int i75 = i2 + 1;
                    Field zzb = zzb(cls3, (String) zzcs2[i2]);
                    if (c25 == 9 || c25 == 17) {
                        c8 = 1;
                        objArr[((i57 / 3) << 1) + 1] = zzb.getType();
                    } else {
                        if (c25 == 27 || c25 == '1') {
                            c8 = 1;
                            i11 = i75 + 1;
                            objArr[((i57 / 3) << 1) + 1] = zzcs2[i75];
                        } else if (c25 == 12 || c25 == 30 || c25 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i11 = i75 + 1;
                                objArr[((i57 / 3) << 1) + 1] = zzcs2[i75];
                            }
                        } else {
                            if (c25 == '2') {
                                int i76 = c23 + 1;
                                iArr[c23] = i57;
                                int i77 = (i57 / 3) << 1;
                                int i78 = i75 + 1;
                                objArr[i77] = zzcs2[i75];
                                if ((charAt24 & 2048) != 0) {
                                    i75 = i78 + 1;
                                    objArr[i77 + 1] = zzcs2[i78];
                                    c23 = i76;
                                } else {
                                    i75 = i78;
                                    c8 = 1;
                                    c23 = i76;
                                }
                            }
                            c8 = 1;
                        }
                        i75 = i11;
                    }
                    i8 = (int) unsafe.objectFieldOffset(zzb);
                    if ((charAt15 & 1) != c8 || c25 > 17) {
                        i5 = i75;
                        c7 = c9;
                        cls2 = cls3;
                        str = str3;
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int i79 = i4 + 1;
                        str = str3;
                        char charAt26 = str.charAt(i4);
                        if (charAt26 >= 55296) {
                            char c31 = charAt26 & 8191;
                            int i81 = 13;
                            while (true) {
                                i9 = i79 + 1;
                                charAt = str.charAt(i79);
                                if (charAt < 55296) {
                                    break;
                                }
                                c31 |= (charAt & 8191) << i81;
                                i81 += 13;
                                i79 = i9;
                            }
                            charAt26 = c31 | (charAt << i81);
                            i79 = i9;
                        }
                        int i82 = (charAt26 / ' ') + (c9 << 1);
                        Object obj3 = zzcs2[i82];
                        i5 = i75;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = zzb(cls3, (String) obj3);
                            zzcs2[i82] = field;
                        }
                        c7 = c9;
                        cls2 = cls3;
                        i7 = (int) unsafe.objectFieldOffset(field);
                        i6 = charAt26 % ' ';
                        i4 = i79;
                    }
                    if (c25 >= 18 && c25 <= '1') {
                        iArr[i55] = i8;
                        i55++;
                    }
                }
                int i83 = i57 + 1;
                iArr2[i57] = charAt23;
                int i84 = i83 + 1;
                iArr2[i83] = i8 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | (c25 << 20);
                i57 = i84 + 1;
                iArr2[i84] = (i6 << 20) | i7;
                c9 = c7;
                zzcr = str;
                i54 = i4;
                c4 = c26;
                length = i59;
                c = c6;
                z2 = z;
                cls3 = cls2;
                c3 = c27;
                i2 = i5;
                zzcx2 = zzcx;
            }
            char c32 = c4;
            boolean z3 = z2;
            return new zzco(iArr2, objArr, c3, c4, zzcx2.zzcl(), z2, false, iArr, c, i53, zzcs, zzbu, zzds, zzar, zzcd);
        }
        ((zzdl) zzci2).zzcj();
        throw new NoSuchMethodError();
    }

    private final void zzc(T t, T t2, int i) {
        int zzai = zzai(i);
        int i2 = this.zzks[i];
        long j = (long) (zzai & 1048575);
        if (zzb(t2, i2, i)) {
            Object zzp = zzdy.zzp(t, j);
            Object zzp2 = zzdy.zzp(t2, j);
            if (zzp != null && zzp2 != null) {
                zzdy.zzb((Object) t, j, zzbd.zzb(zzp, zzp2));
                zzc(t, i2, i);
            } else if (zzp2 != null) {
                zzdy.zzb((Object) t, j, zzp2);
                zzc(t, i2, i);
            }
        }
    }

    private static List<?> zze(Object obj, long j) {
        return (List) zzdy.zzp(obj, j);
    }

    private static <T> double zzf(T t, long j) {
        return ((Double) zzdy.zzp(t, j)).doubleValue();
    }

    private static <T> float zzg(T t, long j) {
        return ((Float) zzdy.zzp(t, j)).floatValue();
    }

    private static <T> int zzh(T t, long j) {
        return ((Integer) zzdy.zzp(t, j)).intValue();
    }

    private static <T> long zzi(T t, long j) {
        return ((Long) zzdy.zzp(t, j)).longValue();
    }

    private static <T> boolean zzj(T t, long j) {
        return ((Boolean) zzdy.zzp(t, j)).booleanValue();
    }

    private static zzdr zzo(Object obj) {
        zzbc zzbc = (zzbc) obj;
        zzdr zzdr = zzbc.zzih;
        if (zzdr != zzdr.zzdh()) {
            return zzdr;
        }
        zzdr zzdi = zzdr.zzdi();
        zzbc.zzih = zzdi;
        return zzdi;
    }

    private final int zzq(int i, int i2) {
        if (i < this.zzku || i > this.zzkv) {
            return -1;
        }
        return zzr(i, i2);
    }

    private final int zzr(int i, int i2) {
        int length = (this.zzks.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzks[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzm(r10, r6) == com.google.android.gms.internal.places.zzdy.zzm(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzk(r10, r6) == com.google.android.gms.internal.places.zzdy.zzk(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.places.zzdy.zzl(r10, r6) == com.google.android.gms.internal.places.zzdy.zzl(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.zzn(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.zzn(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.zzo(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.zzo(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.places.zzdc.zze(com.google.android.gms.internal.places.zzdy.zzp(r10, r6), com.google.android.gms.internal.places.zzdy.zzp(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.zzks
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.zzai(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.zzaj(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r10, r4)
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.zzp(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.zzp(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.zze((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.places.zzdy.zzm(r10, r6)
            boolean r5 = com.google.android.gms.internal.places.zzdy.zzm(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.zzk(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.zzk(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.zzl(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.zzl(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.places.zzdy.zzn(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.places.zzdy.zzn(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.zzd(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.places.zzdy.zzo(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.places.zzdy.zzo(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r9.zzlg
            java.lang.Object r0 = r0.zzr(r10)
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r9.zzlg
            java.lang.Object r2 = r2.zzr(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.zzkx
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.places.zzar<?> r0 = r9.zzlh
            com.google.android.gms.internal.places.zzav r10 = r0.zzb((java.lang.Object) r10)
            com.google.android.gms.internal.places.zzar<?> r0 = r9.zzlh
            com.google.android.gms.internal.places.zzav r11 = r0.zzb((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f4, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0225, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzks
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.zzai(r1)
            int[] r4 = r8.zzks
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ee;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01dc;
                case 7: goto L_0x01d1;
                case 8: goto L_0x01c4;
                case 9: goto L_0x01b6;
                case 10: goto L_0x01aa;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019c;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0227
        L_0x0020:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0032:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0044:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x0052:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0064:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x0072:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x0080:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x008e:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00a0:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b2:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c6:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = zzj(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zze((boolean) r3)
            goto L_0x0225
        L_0x00d8:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x00e6:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x00f8:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = zzh(r9, r5)
            goto L_0x01f4
        L_0x0106:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0118:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = zzi(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x012a:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = zzg(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013c:
            boolean r3 = r8.zzb(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = zzf(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            if (r3 == 0) goto L_0x01c0
            int r7 = r3.hashCode()
            goto L_0x01c0
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
            goto L_0x01f4
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
            goto L_0x01f4
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
            goto L_0x01f4
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
            goto L_0x01f4
        L_0x01aa:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b6:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            if (r3 == 0) goto L_0x01c0
            int r7 = r3.hashCode()
        L_0x01c0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c4:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d1:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.places.zzdy.zzm(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zze((boolean) r3)
            goto L_0x0225
        L_0x01dc:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
            goto L_0x01f4
        L_0x01e3:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x01ee:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r9, r5)
        L_0x01f4:
            int r2 = r2 + r3
            goto L_0x0227
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.zzl(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.places.zzdy.zzn(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.places.zzdy.zzo(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.zzl(r3)
        L_0x0225:
            int r3 = r3 + r2
            r2 = r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r8.zzlg
            java.lang.Object r0 = r0.zzr(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.zzkx
            if (r1 == 0) goto L_0x0249
            int r0 = r0 * 53
            com.google.android.gms.internal.places.zzar<?> r1 = r8.zzlh
            com.google.android.gms.internal.places.zzav r9 = r1.zzb((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x0249:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.hashCode(java.lang.Object):int");
    }

    public final T newInstance() {
        return this.zzle.newInstance(this.zzkw);
    }

    public final void zzd(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzks.length; i += 3) {
            int zzai = zzai(i);
            long j = (long) (1048575 & zzai);
            int i2 = this.zzks[i];
            switch ((zzai & 267386880) >>> 20) {
                case 0:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzo(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 1:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzn(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 2:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 3:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 4:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 5:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 6:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 7:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzm(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 8:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 9:
                    zzb(t, t2, i);
                    break;
                case 10:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 11:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 12:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 13:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 14:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 15:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzk(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 16:
                    if (!zzb(t2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzl(t2, j));
                        zzc(t, i);
                        break;
                    }
                case 17:
                    zzb(t, t2, i);
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
                    this.zzlf.zzb(t, t2, j);
                    break;
                case 50:
                    zzdc.zzb(this.zzli, t, t2, j);
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
                    if (!zzb(t2, i2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                        zzc(t, i2, i);
                        break;
                    }
                case 60:
                    zzc(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzb(t2, i2, i)) {
                        break;
                    } else {
                        zzdy.zzb((Object) t, j, zzdy.zzp(t2, j));
                        zzc(t, i2, i);
                        break;
                    }
                case 68:
                    zzc(t, t2, i);
                    break;
            }
        }
        if (!this.zzkz) {
            zzdc.zzb(this.zzlg, t, t2);
            if (this.zzkx) {
                zzdc.zzb(this.zzlh, t, t2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0323, code lost:
        r11 = p379.C16530d.m42011d(r13, r12, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0833, code lost:
        r6 = p379.C16530d.m42011d(r10, r9, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09f4, code lost:
        r7 = r7 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0a00, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a01, code lost:
        r4 = r4 + 3;
        r6 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzn(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.zzkz
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 1
            r7 = 0
            r9 = 0
            if (r2 == 0) goto L_0x04f7
            sun.misc.Unsafe r2 = zzkr
            r10 = 0
            r11 = 0
        L_0x0016:
            int[] r12 = r0.zzks
            int r12 = r12.length
            if (r10 >= r12) goto L_0x04ef
            int r12 = r0.zzai(r10)
            r3 = r3 & r12
            int r3 = r3 >>> 20
            int[] r13 = r0.zzks
            r13 = r13[r10]
            r12 = r12 & r5
            long r14 = (long) r12
            com.google.android.gms.internal.places.zzaw r12 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r12 = r12.mo81573id()
            if (r3 < r12) goto L_0x0040
            com.google.android.gms.internal.places.zzaw r12 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r12 = r12.mo81573id()
            if (r3 > r12) goto L_0x0040
            int[] r12 = r0.zzks
            int r16 = r10 + 2
            r12 = r12[r16]
            r12 = r12 & r5
            goto L_0x0041
        L_0x0040:
            r12 = 0
        L_0x0041:
            switch(r3) {
                case 0: goto L_0x04db;
                case 1: goto L_0x04d0;
                case 2: goto L_0x04c1;
                case 3: goto L_0x04b2;
                case 4: goto L_0x04a3;
                case 5: goto L_0x0498;
                case 6: goto L_0x048d;
                case 7: goto L_0x0482;
                case 8: goto L_0x0466;
                case 9: goto L_0x0451;
                case 10: goto L_0x0440;
                case 11: goto L_0x0431;
                case 12: goto L_0x0422;
                case 13: goto L_0x0417;
                case 14: goto L_0x040c;
                case 15: goto L_0x03fd;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d8;
                case 18: goto L_0x03ce;
                case 19: goto L_0x03c4;
                case 20: goto L_0x03ba;
                case 21: goto L_0x03b0;
                case 22: goto L_0x03a6;
                case 23: goto L_0x039c;
                case 24: goto L_0x0392;
                case 25: goto L_0x0388;
                case 26: goto L_0x037e;
                case 27: goto L_0x0370;
                case 28: goto L_0x0366;
                case 29: goto L_0x035c;
                case 30: goto L_0x0352;
                case 31: goto L_0x0348;
                case 32: goto L_0x033e;
                case 33: goto L_0x0334;
                case 34: goto L_0x032a;
                case 35: goto L_0x0307;
                case 36: goto L_0x02ea;
                case 37: goto L_0x02cd;
                case 38: goto L_0x02b0;
                case 39: goto L_0x0292;
                case 40: goto L_0x0274;
                case 41: goto L_0x0256;
                case 42: goto L_0x0238;
                case 43: goto L_0x021a;
                case 44: goto L_0x01fc;
                case 45: goto L_0x01de;
                case 46: goto L_0x01c0;
                case 47: goto L_0x01a2;
                case 48: goto L_0x0184;
                case 49: goto L_0x0176;
                case 50: goto L_0x0166;
                case 51: goto L_0x0158;
                case 52: goto L_0x014c;
                case 53: goto L_0x013c;
                case 54: goto L_0x012c;
                case 55: goto L_0x011c;
                case 56: goto L_0x0110;
                case 57: goto L_0x0104;
                case 58: goto L_0x00f8;
                case 59: goto L_0x00da;
                case 60: goto L_0x00c6;
                case 61: goto L_0x00b4;
                case 62: goto L_0x00a4;
                case 63: goto L_0x0094;
                case 64: goto L_0x0088;
                case 65: goto L_0x007c;
                case 66: goto L_0x006c;
                case 67: goto L_0x005c;
                case 68: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x04e9
        L_0x0046:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzck r3 = (com.google.android.gms.internal.places.zzck) r3
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzaj.zzd(r13, r3, r12)
            goto L_0x0463
        L_0x005c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = zzi(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzg((int) r13, (long) r14)
            goto L_0x0463
        L_0x006c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = zzh(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzj(r13, r3)
            goto L_0x0463
        L_0x007c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r13, (long) r7)
            goto L_0x0463
        L_0x0088:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzl(r13, r9)
            goto L_0x0463
        L_0x0094:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = zzh(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzm(r13, r3)
            goto L_0x0463
        L_0x00a4:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = zzh(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r13, (int) r3)
            goto L_0x0463
        L_0x00b4:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzw r3 = (com.google.android.gms.internal.places.zzw) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (com.google.android.gms.internal.places.zzw) r3)
            goto L_0x0463
        L_0x00c6:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r13, (java.lang.Object) r3, (com.google.android.gms.internal.places.zzda) r12)
            goto L_0x0463
        L_0x00da:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            boolean r12 = r3 instanceof com.google.android.gms.internal.places.zzw
            if (r12 == 0) goto L_0x00f0
            com.google.android.gms.internal.places.zzw r3 = (com.google.android.gms.internal.places.zzw) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (com.google.android.gms.internal.places.zzw) r3)
            goto L_0x0463
        L_0x00f0:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (java.lang.String) r3)
            goto L_0x0463
        L_0x00f8:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (boolean) r6)
            goto L_0x0463
        L_0x0104:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzk(r13, r9)
            goto L_0x0463
        L_0x0110:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r13, (long) r7)
            goto L_0x0463
        L_0x011c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = zzh(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r13, (int) r3)
            goto L_0x0463
        L_0x012c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = zzi(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzf((int) r13, (long) r14)
            goto L_0x0463
        L_0x013c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = zzi(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zze((int) r13, (long) r14)
            goto L_0x0463
        L_0x014c:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (float) r4)
            goto L_0x0463
        L_0x0158:
            boolean r3 = r0.zzb(r1, (int) r13, (int) r10)
            if (r3 == 0) goto L_0x04e9
            r14 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (double) r14)
            goto L_0x0463
        L_0x0166:
            com.google.android.gms.internal.places.zzcd r3 = r0.zzli
            java.lang.Object r12 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            java.lang.Object r14 = r0.zzag(r10)
            int r3 = r3.zzc(r13, r12, r14)
            goto L_0x0463
        L_0x0176:
            java.util.List r3 = zze(r1, r14)
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzdc.zze(r13, r3, r12)
            goto L_0x0463
        L_0x0184:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzg((java.util.List<java.lang.Long>) r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x0198
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x0198:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x01a2:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzk(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x01b6
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x01b6:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzm(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x01d4
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x01d4:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x01de:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzl(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x01f2
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x01f2:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x01fc:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzh(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x0210
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x0210:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x021a:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzj(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x022e
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x022e:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x0238:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzn(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x024c
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x024c:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x0256:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzl(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x026a
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x026a:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x0274:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzm(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x0288
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x0288:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x0292:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzi(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x02a6
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x02a6:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x02b0:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzf((java.util.List<java.lang.Long>) r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x02c4
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x02c4:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x02cd:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zze(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x02e1
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x02e1:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x02ea:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzl(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x02fe
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x02fe:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
            goto L_0x0323
        L_0x0307:
            java.lang.Object r3 = r2.getObject(r1, r14)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.places.zzdc.zzm(r3)
            if (r3 <= 0) goto L_0x04e9
            boolean r14 = r0.zzla
            if (r14 == 0) goto L_0x031b
            long r14 = (long) r12
            r2.putInt(r1, r14, r3)
        L_0x031b:
            int r12 = com.google.android.gms.internal.places.zzaj.zzr(r13)
            int r13 = com.google.android.gms.internal.places.zzaj.zzt(r3)
        L_0x0323:
            int r3 = p379.C16530d.m42011d(r13, r12, r3, r11)
            r11 = r3
            goto L_0x04e9
        L_0x032a:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzr(r13, r3, r9)
            goto L_0x0463
        L_0x0334:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzv(r13, r3, r9)
            goto L_0x0463
        L_0x033e:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r13, r3, r9)
            goto L_0x0463
        L_0x0348:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r13, r3, r9)
            goto L_0x0463
        L_0x0352:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzs(r13, r3, r9)
            goto L_0x0463
        L_0x035c:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzu(r13, r3, r9)
            goto L_0x0463
        L_0x0366:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zze((int) r13, (java.util.List<com.google.android.gms.internal.places.zzw>) r3)
            goto L_0x0463
        L_0x0370:
            java.util.List r3 = zze(r1, r14)
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r13, (java.util.List<?>) r3, (com.google.android.gms.internal.places.zzda) r12)
            goto L_0x0463
        L_0x037e:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd(r13, r3)
            goto L_0x0463
        L_0x0388:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzy(r13, r3, r9)
            goto L_0x0463
        L_0x0392:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r13, r3, r9)
            goto L_0x0463
        L_0x039c:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r13, r3, r9)
            goto L_0x0463
        L_0x03a6:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzt(r13, r3, r9)
            goto L_0x0463
        L_0x03b0:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzq(r13, r3, r9)
            goto L_0x0463
        L_0x03ba:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzp(r13, r3, r9)
            goto L_0x0463
        L_0x03c4:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzw(r13, r3, r9)
            goto L_0x0463
        L_0x03ce:
            java.util.List r3 = zze(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzdc.zzx(r13, r3, r9)
            goto L_0x0463
        L_0x03d8:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzck r3 = (com.google.android.gms.internal.places.zzck) r3
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzaj.zzd(r13, r3, r12)
            goto L_0x0463
        L_0x03ee:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = com.google.android.gms.internal.places.zzdy.zzl(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzg((int) r13, (long) r14)
            goto L_0x0463
        L_0x03fd:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzj(r13, r3)
            goto L_0x0463
        L_0x040c:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r13, (long) r7)
            goto L_0x0463
        L_0x0417:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzl(r13, r9)
            goto L_0x0463
        L_0x0422:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzm(r13, r3)
            goto L_0x0463
        L_0x0431:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzi((int) r13, (int) r3)
            goto L_0x0463
        L_0x0440:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzw r3 = (com.google.android.gms.internal.places.zzw) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (com.google.android.gms.internal.places.zzw) r3)
            goto L_0x0463
        L_0x0451:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            com.google.android.gms.internal.places.zzda r12 = r0.zzaf(r10)
            int r3 = com.google.android.gms.internal.places.zzdc.zzd((int) r13, (java.lang.Object) r3, (com.google.android.gms.internal.places.zzda) r12)
        L_0x0463:
            int r11 = r11 + r3
            goto L_0x04e9
        L_0x0466:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.zzp(r1, r14)
            boolean r12 = r3 instanceof com.google.android.gms.internal.places.zzw
            if (r12 == 0) goto L_0x047b
            com.google.android.gms.internal.places.zzw r3 = (com.google.android.gms.internal.places.zzw) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (com.google.android.gms.internal.places.zzw) r3)
            goto L_0x0463
        L_0x047b:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (java.lang.String) r3)
            goto L_0x0463
        L_0x0482:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzd((int) r13, (boolean) r6)
            goto L_0x0463
        L_0x048d:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzk(r13, r9)
            goto L_0x0463
        L_0x0498:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r13, (long) r7)
            goto L_0x0463
        L_0x04a3:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzdy.zzk(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzh((int) r13, (int) r3)
            goto L_0x0463
        L_0x04b2:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = com.google.android.gms.internal.places.zzdy.zzl(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zzf((int) r13, (long) r14)
            goto L_0x0463
        L_0x04c1:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            long r14 = com.google.android.gms.internal.places.zzdy.zzl(r1, r14)
            int r3 = com.google.android.gms.internal.places.zzaj.zze((int) r13, (long) r14)
            goto L_0x0463
        L_0x04d0:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (float) r4)
            goto L_0x0463
        L_0x04db:
            boolean r3 = r0.zzb(r1, (int) r10)
            if (r3 == 0) goto L_0x04e9
            r14 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.zzc((int) r13, (double) r14)
            goto L_0x0463
        L_0x04e9:
            int r10 = r10 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ef:
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r0.zzlg
            int r1 = zzb(r2, r1)
            int r11 = r11 + r1
            return r11
        L_0x04f7:
            sun.misc.Unsafe r2 = zzkr
            r3 = -1
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x04fd:
            int[] r9 = r0.zzks
            int r9 = r9.length
            if (r4 >= r9) goto L_0x0a06
            int r9 = r0.zzai(r4)
            int[] r10 = r0.zzks
            r11 = r10[r4]
            r12 = 267386880(0xff00000, float:2.3665827E-29)
            r12 = r12 & r9
            int r12 = r12 >>> 20
            r13 = 17
            if (r12 > r13) goto L_0x0525
            int r13 = r4 + 2
            r10 = r10[r13]
            r13 = r10 & r5
            int r14 = r10 >>> 20
            int r6 = r6 << r14
            if (r13 == r3) goto L_0x0545
            long r14 = (long) r13
            int r8 = r2.getInt(r1, r14)
            r3 = r13
            goto L_0x0545
        L_0x0525:
            boolean r6 = r0.zzla
            if (r6 == 0) goto L_0x0542
            com.google.android.gms.internal.places.zzaw r6 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r6 = r6.mo81573id()
            if (r12 < r6) goto L_0x0542
            com.google.android.gms.internal.places.zzaw r6 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r6 = r6.mo81573id()
            if (r12 > r6) goto L_0x0542
            int[] r6 = r0.zzks
            int r10 = r4 + 2
            r6 = r6[r10]
            r6 = r6 & r5
            r10 = r6
            goto L_0x0544
        L_0x0542:
            r6 = 0
            r10 = 0
        L_0x0544:
            r6 = 0
        L_0x0545:
            r9 = r9 & r5
            long r13 = (long) r9
            switch(r12) {
                case 0: goto L_0x09f6;
                case 1: goto L_0x09ec;
                case 2: goto L_0x09df;
                case 3: goto L_0x09d3;
                case 4: goto L_0x09c7;
                case 5: goto L_0x09bd;
                case 6: goto L_0x09b4;
                case 7: goto L_0x09ab;
                case 8: goto L_0x0992;
                case 9: goto L_0x0982;
                case 10: goto L_0x0973;
                case 11: goto L_0x0966;
                case 12: goto L_0x0959;
                case 13: goto L_0x094f;
                case 14: goto L_0x0944;
                case 15: goto L_0x0937;
                case 16: goto L_0x092a;
                case 17: goto L_0x0917;
                case 18: goto L_0x090a;
                case 19: goto L_0x08fd;
                case 20: goto L_0x08f0;
                case 21: goto L_0x08e3;
                case 22: goto L_0x08d6;
                case 23: goto L_0x08c9;
                case 24: goto L_0x08bc;
                case 25: goto L_0x08af;
                case 26: goto L_0x08a3;
                case 27: goto L_0x0893;
                case 28: goto L_0x0887;
                case 29: goto L_0x087a;
                case 30: goto L_0x086d;
                case 31: goto L_0x0860;
                case 32: goto L_0x0853;
                case 33: goto L_0x0846;
                case 34: goto L_0x0839;
                case 35: goto L_0x0817;
                case 36: goto L_0x07fa;
                case 37: goto L_0x07dd;
                case 38: goto L_0x07c0;
                case 39: goto L_0x07a2;
                case 40: goto L_0x0784;
                case 41: goto L_0x0766;
                case 42: goto L_0x0748;
                case 43: goto L_0x072a;
                case 44: goto L_0x070c;
                case 45: goto L_0x06ee;
                case 46: goto L_0x06d0;
                case 47: goto L_0x06b2;
                case 48: goto L_0x0694;
                case 49: goto L_0x0684;
                case 50: goto L_0x0674;
                case 51: goto L_0x0666;
                case 52: goto L_0x0659;
                case 53: goto L_0x0649;
                case 54: goto L_0x0639;
                case 55: goto L_0x0629;
                case 56: goto L_0x061b;
                case 57: goto L_0x060e;
                case 58: goto L_0x0601;
                case 59: goto L_0x05e3;
                case 60: goto L_0x05cf;
                case 61: goto L_0x05bd;
                case 62: goto L_0x05ad;
                case 63: goto L_0x059d;
                case 64: goto L_0x0590;
                case 65: goto L_0x0582;
                case 66: goto L_0x0572;
                case 67: goto L_0x0562;
                case 68: goto L_0x054c;
                default: goto L_0x054a;
            }
        L_0x054a:
            goto L_0x0a01
        L_0x054c:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzck r6 = (com.google.android.gms.internal.places.zzck) r6
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzaj.zzd(r11, r6, r9)
            goto L_0x09ea
        L_0x0562:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            long r9 = zzi(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzg((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0572:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            int r6 = zzh(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzj(r11, r6)
            goto L_0x09ea
        L_0x0582:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzi((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0590:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzl(r11, r6)
            goto L_0x09ea
        L_0x059d:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            int r6 = zzh(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzm(r11, r6)
            goto L_0x09ea
        L_0x05ad:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            int r6 = zzh(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzi((int) r11, (int) r6)
            goto L_0x09ea
        L_0x05bd:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzw r6 = (com.google.android.gms.internal.places.zzw) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (com.google.android.gms.internal.places.zzw) r6)
            goto L_0x09ea
        L_0x05cf:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzdc.zzd((int) r11, (java.lang.Object) r6, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x09ea
        L_0x05e3:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            boolean r9 = r6 instanceof com.google.android.gms.internal.places.zzw
            if (r9 == 0) goto L_0x05f9
            com.google.android.gms.internal.places.zzw r6 = (com.google.android.gms.internal.places.zzw) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (com.google.android.gms.internal.places.zzw) r6)
            goto L_0x09ea
        L_0x05f9:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (java.lang.String) r6)
            goto L_0x09ea
        L_0x0601:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r6 = 1
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (boolean) r6)
            goto L_0x09ea
        L_0x060e:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzk(r11, r6)
            goto L_0x09ea
        L_0x061b:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzh((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0629:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            int r6 = zzh(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzh((int) r11, (int) r6)
            goto L_0x09ea
        L_0x0639:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            long r9 = zzi(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzf((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0649:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            long r9 = zzi(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zze((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0659:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (float) r6)
            goto L_0x09ea
        L_0x0666:
            boolean r6 = r0.zzb(r1, (int) r11, (int) r4)
            if (r6 == 0) goto L_0x0a01
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (double) r9)
            goto L_0x09ea
        L_0x0674:
            com.google.android.gms.internal.places.zzcd r6 = r0.zzli
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.lang.Object r10 = r0.zzag(r4)
            int r6 = r6.zzc(r11, r9, r10)
            goto L_0x09ea
        L_0x0684:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzdc.zze(r11, r6, r9)
            goto L_0x09ea
        L_0x0694:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzg((java.util.List<java.lang.Long>) r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x06a8
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x06a8:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x06b2:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzk(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x06c6
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x06c6:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x06d0:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzm(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x06e4
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x06e4:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x06ee:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzl(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x0702
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x0702:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x070c:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzh(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x0720
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x0720:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x072a:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzj(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x073e
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x073e:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x0748:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzn(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x075c
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x075c:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x0766:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzl(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x077a
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x077a:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x0784:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzm(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x0798
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x0798:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x07a2:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzi(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x07b6
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x07b6:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x07c0:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzf((java.util.List<java.lang.Long>) r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x07d4
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x07d4:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x07dd:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zze(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x07f1
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x07f1:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x07fa:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzl(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x080e
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x080e:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
            goto L_0x0833
        L_0x0817:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzm(r6)
            if (r6 <= 0) goto L_0x0a01
            boolean r9 = r0.zzla
            if (r9 == 0) goto L_0x082b
            long r9 = (long) r10
            r2.putInt(r1, r9, r6)
        L_0x082b:
            int r9 = com.google.android.gms.internal.places.zzaj.zzr(r11)
            int r10 = com.google.android.gms.internal.places.zzaj.zzt(r6)
        L_0x0833:
            int r6 = p379.C16530d.m42011d(r10, r9, r6, r7)
            goto L_0x0a00
        L_0x0839:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzdc.zzr(r11, r6, r9)
            goto L_0x09ea
        L_0x0846:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzv(r11, r9, r6)
            goto L_0x09ea
        L_0x0853:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzx(r11, r9, r6)
            goto L_0x09ea
        L_0x0860:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzw(r11, r9, r6)
            goto L_0x09ea
        L_0x086d:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzs(r11, r9, r6)
            goto L_0x09ea
        L_0x087a:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzu(r11, r9, r6)
            goto L_0x09ea
        L_0x0887:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zze((int) r11, (java.util.List<com.google.android.gms.internal.places.zzw>) r6)
            goto L_0x09ea
        L_0x0893:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzdc.zzd((int) r11, (java.util.List<?>) r6, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x09ea
        L_0x08a3:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.places.zzdc.zzd(r11, r6)
            goto L_0x09ea
        L_0x08af:
            java.lang.Object r6 = r2.getObject(r1, r13)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzdc.zzy(r11, r6, r9)
            goto L_0x09ea
        L_0x08bc:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzw(r11, r9, r6)
            goto L_0x09ea
        L_0x08c9:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzx(r11, r9, r6)
            goto L_0x09ea
        L_0x08d6:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzt(r11, r9, r6)
            goto L_0x09ea
        L_0x08e3:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzq(r11, r9, r6)
            goto L_0x09ea
        L_0x08f0:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzp(r11, r9, r6)
            goto L_0x09ea
        L_0x08fd:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzw(r11, r9, r6)
            goto L_0x09ea
        L_0x090a:
            r6 = 0
            java.lang.Object r9 = r2.getObject(r1, r13)
            java.util.List r9 = (java.util.List) r9
            int r6 = com.google.android.gms.internal.places.zzdc.zzx(r11, r9, r6)
            goto L_0x09ea
        L_0x0917:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzck r6 = (com.google.android.gms.internal.places.zzck) r6
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzaj.zzd(r11, r6, r9)
            goto L_0x09ea
        L_0x092a:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            long r9 = r2.getLong(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzg((int) r11, (long) r9)
            goto L_0x09ea
        L_0x0937:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            int r6 = r2.getInt(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzj(r11, r6)
            goto L_0x09ea
        L_0x0944:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzi((int) r11, (long) r9)
            goto L_0x09ea
        L_0x094f:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzl(r11, r6)
            goto L_0x09ea
        L_0x0959:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            int r6 = r2.getInt(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzm(r11, r6)
            goto L_0x09ea
        L_0x0966:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            int r6 = r2.getInt(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzi((int) r11, (int) r6)
            goto L_0x09ea
        L_0x0973:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzw r6 = (com.google.android.gms.internal.places.zzw) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (com.google.android.gms.internal.places.zzw) r6)
            goto L_0x09ea
        L_0x0982:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r4)
            int r6 = com.google.android.gms.internal.places.zzdc.zzd((int) r11, (java.lang.Object) r6, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x09ea
        L_0x0992:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            java.lang.Object r6 = r2.getObject(r1, r13)
            boolean r9 = r6 instanceof com.google.android.gms.internal.places.zzw
            if (r9 == 0) goto L_0x09a4
            com.google.android.gms.internal.places.zzw r6 = (com.google.android.gms.internal.places.zzw) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (com.google.android.gms.internal.places.zzw) r6)
            goto L_0x09ea
        L_0x09a4:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (java.lang.String) r6)
            goto L_0x09ea
        L_0x09ab:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r6 = 1
            int r6 = com.google.android.gms.internal.places.zzaj.zzd((int) r11, (boolean) r6)
            goto L_0x09f4
        L_0x09b4:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzk(r11, r6)
            goto L_0x09f4
        L_0x09bd:
            r6 = r6 & r8
            r9 = 0
            if (r6 == 0) goto L_0x0a01
            int r6 = com.google.android.gms.internal.places.zzaj.zzh((int) r11, (long) r9)
            goto L_0x09ea
        L_0x09c7:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            int r6 = r2.getInt(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzh((int) r11, (int) r6)
            goto L_0x09ea
        L_0x09d3:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            long r9 = r2.getLong(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zzf((int) r11, (long) r9)
            goto L_0x09ea
        L_0x09df:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            long r9 = r2.getLong(r1, r13)
            int r6 = com.google.android.gms.internal.places.zzaj.zze((int) r11, (long) r9)
        L_0x09ea:
            int r7 = r7 + r6
            goto L_0x0a01
        L_0x09ec:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r6 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (float) r6)
        L_0x09f4:
            int r7 = r7 + r6
            goto L_0x0a01
        L_0x09f6:
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0a01
            r9 = 0
            int r6 = com.google.android.gms.internal.places.zzaj.zzc((int) r11, (double) r9)
            int r6 = r6 + r7
        L_0x0a00:
            r7 = r6
        L_0x0a01:
            int r4 = r4 + 3
            r6 = 1
            goto L_0x04fd
        L_0x0a06:
            r2 = 0
            com.google.android.gms.internal.places.zzds<?, ?> r3 = r0.zzlg
            int r3 = zzb(r3, r1)
            int r7 = r7 + r3
            boolean r3 = r0.zzkx
            if (r3 == 0) goto L_0x0a60
            com.google.android.gms.internal.places.zzar<?> r3 = r0.zzlh
            com.google.android.gms.internal.places.zzav r1 = r3.zzb((java.lang.Object) r1)
            r3 = 0
        L_0x0a19:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r4 = r1.zzfj
            int r4 = r4.zzcu()
            if (r3 >= r4) goto L_0x0a39
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r4 = r1.zzfj
            java.util.Map$Entry r4 = r4.zzam(r3)
            java.lang.Object r5 = r4.getKey()
            com.google.android.gms.internal.places.zzax r5 = (com.google.android.gms.internal.places.zzax) r5
            java.lang.Object r4 = r4.getValue()
            int r4 = com.google.android.gms.internal.places.zzav.zzc((com.google.android.gms.internal.places.zzax<?>) r5, (java.lang.Object) r4)
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L_0x0a19
        L_0x0a39:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r1.zzfj
            java.lang.Iterable r1 = r1.zzcv()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a43:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0a5f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.google.android.gms.internal.places.zzax r4 = (com.google.android.gms.internal.places.zzax) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.places.zzav.zzc((com.google.android.gms.internal.places.zzax<?>) r4, (java.lang.Object) r3)
            int r2 = r2 + r3
            goto L_0x0a43
        L_0x0a5f:
            int r7 = r7 + r2
        L_0x0a60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzn(java.lang.Object):int");
    }

    public final boolean zzp(T t) {
        int i;
        boolean z;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i3 < this.zzlc) {
                int i5 = this.zzlb[i3];
                int i6 = this.zzks[i5];
                int zzai = zzai(i5);
                if (!this.zzkz) {
                    int i7 = this.zzks[i5 + 2];
                    int i8 = i7 & 1048575;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = zzkr.getInt(t, (long) i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if ((268435456 & zzai) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !zzb(t, i5, i4, i)) {
                    return false;
                }
                int i9 = (267386880 & zzai) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (zzb(t, i6, i5) && !zzb((Object) t, zzai, zzaf(i5))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                Map<?, ?> zzh = this.zzli.zzh(zzdy.zzp(t, (long) (zzai & 1048575)));
                                if (!zzh.isEmpty()) {
                                    if (this.zzli.zzl(zzag(i5)).zzkl.zzdr() == zzem.MESSAGE) {
                                        zzda<?> zzda = null;
                                        Iterator<?> it = zzh.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (zzda == null) {
                                                zzda = zzcv.zzcq().zzf(next.getClass());
                                            }
                                            if (!zzda.zzp(next)) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z2) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) zzdy.zzp(t, (long) (zzai & 1048575));
                    if (!list.isEmpty()) {
                        zzda zzaf = zzaf(i5);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= list.size()) {
                                break;
                            } else if (!zzaf.zzp(list.get(i11))) {
                                z2 = false;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!z2) {
                        return false;
                    }
                } else if (zzb(t, i5, i4, i) && !zzb((Object) t, zzai, zzaf(i5))) {
                    return false;
                }
                i3++;
            } else if (!this.zzkx || this.zzlh.zzb((Object) t).isInitialized()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzc(T r19, com.google.android.gms.internal.places.zzel r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.zzkx
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.places.zzar<?> r3 = r0.zzlh
            com.google.android.gms.internal.places.zzav r3 = r3.zzb((java.lang.Object) r1)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r5 = r3.zzfj
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.iterator()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.zzks
            int r7 = r7.length
            sun.misc.Unsafe r8 = zzkr
            r10 = 0
            r11 = 0
        L_0x002d:
            if (r10 >= r7) goto L_0x0494
            int r12 = r0.zzai(r10)
            int[] r13 = r0.zzks
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.zzkz
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005d
            r4 = 17
            if (r15 > r4) goto L_0x005d
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0057
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0060
        L_0x005d:
            r17 = r10
            r4 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.zzlh
            int r9 = r9.zzb((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r14) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.zzlh
            r9.zzb(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0060
        L_0x007c:
            r5 = 0
            goto L_0x0060
        L_0x007e:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0485;
                case 1: goto L_0x0479;
                case 2: goto L_0x046d;
                case 3: goto L_0x0461;
                case 4: goto L_0x0455;
                case 5: goto L_0x0449;
                case 6: goto L_0x043d;
                case 7: goto L_0x0431;
                case 8: goto L_0x0425;
                case 9: goto L_0x0414;
                case 10: goto L_0x0405;
                case 11: goto L_0x03f8;
                case 12: goto L_0x03eb;
                case 13: goto L_0x03de;
                case 14: goto L_0x03d1;
                case 15: goto L_0x03c4;
                case 16: goto L_0x03b7;
                case 17: goto L_0x03a6;
                case 18: goto L_0x0396;
                case 19: goto L_0x0386;
                case 20: goto L_0x0376;
                case 21: goto L_0x0366;
                case 22: goto L_0x0356;
                case 23: goto L_0x0346;
                case 24: goto L_0x0336;
                case 25: goto L_0x0326;
                case 26: goto L_0x0317;
                case 27: goto L_0x0304;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c5;
                case 32: goto L_0x02b5;
                case 33: goto L_0x02a5;
                case 34: goto L_0x0295;
                case 35: goto L_0x0285;
                case 36: goto L_0x0275;
                case 37: goto L_0x0265;
                case 38: goto L_0x0255;
                case 39: goto L_0x0245;
                case 40: goto L_0x0235;
                case 41: goto L_0x0225;
                case 42: goto L_0x0215;
                case 43: goto L_0x0205;
                case 44: goto L_0x01f5;
                case 45: goto L_0x01e5;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01b5;
                case 49: goto L_0x01a2;
                case 50: goto L_0x0199;
                case 51: goto L_0x018a;
                case 52: goto L_0x017b;
                case 53: goto L_0x016c;
                case 54: goto L_0x015d;
                case 55: goto L_0x014e;
                case 56: goto L_0x013f;
                case 57: goto L_0x0130;
                case 58: goto L_0x0121;
                case 59: goto L_0x0112;
                case 60: goto L_0x00ff;
                case 61: goto L_0x00ef;
                case 62: goto L_0x00e1;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c5;
                case 65: goto L_0x00b7;
                case 66: goto L_0x00a9;
                case 67: goto L_0x009b;
                case 68: goto L_0x0089;
                default: goto L_0x0086;
            }
        L_0x0086:
            r13 = 0
            goto L_0x0490
        L_0x0089:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0086
        L_0x009b:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x0086
        L_0x00a9:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0086
        L_0x00b7:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzk(r14, r9)
            goto L_0x0086
        L_0x00c5:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x0086
        L_0x00d3:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x0086
        L_0x00e1:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0086
        L_0x00ef:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.zzb((int) r14, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x0086
        L_0x00ff:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0086
        L_0x0112:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0086
        L_0x0121:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            boolean r4 = zzj(r1, r9)
            r2.zzc((int) r14, (boolean) r4)
            goto L_0x0086
        L_0x0130:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x0086
        L_0x013f:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzd((int) r14, (long) r9)
            goto L_0x0086
        L_0x014e:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            int r4 = zzh(r1, r9)
            r2.zzd((int) r14, (int) r4)
            goto L_0x0086
        L_0x015d:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0086
        L_0x016c:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            long r9 = zzi(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0086
        L_0x017b:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            float r4 = zzg(r1, r9)
            r2.zzb((int) r14, (float) r4)
            goto L_0x0086
        L_0x018a:
            boolean r4 = r0.zzb(r1, (int) r14, (int) r12)
            if (r4 == 0) goto L_0x0086
            double r9 = zzf(r1, r9)
            r2.zzb((int) r14, (double) r9)
            goto L_0x0086
        L_0x0199:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.zzb((com.google.android.gms.internal.places.zzel) r2, (int) r14, (java.lang.Object) r4, (int) r12)
            goto L_0x0086
        L_0x01a2:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.zzaf(r12)
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r2, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x0086
        L_0x01b5:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.places.zzdc.zzf(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01c5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01d5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01e5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01f5:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0205:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0215:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0225:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0235:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0245:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0255:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0265:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0275:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0086
        L_0x0285:
            r13 = 1
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0086
        L_0x0295:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.zzf(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02a5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02b5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02c5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02d5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02e5:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02f5:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc(r4, r9, r2)
            goto L_0x0086
        L_0x0304:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.zzaf(r12)
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r2, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x0086
        L_0x0317:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0086
        L_0x0326:
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.zzo(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0336:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0346:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0356:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0366:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0376:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0386:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0490
        L_0x0396:
            r13 = 0
            int[] r4 = r0.zzks
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r2, (boolean) r13)
            goto L_0x0490
        L_0x03a6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzc((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0490
        L_0x03b7:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzc((int) r14, (long) r9)
            goto L_0x0490
        L_0x03c4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzf(r14, r4)
            goto L_0x0490
        L_0x03d1:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzk(r14, r9)
            goto L_0x0490
        L_0x03de:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzn(r14, r4)
            goto L_0x0490
        L_0x03eb:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzo(r14, r4)
            goto L_0x0490
        L_0x03f8:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zze(r14, r4)
            goto L_0x0490
        L_0x0405:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.zzb((int) r14, (com.google.android.gms.internal.places.zzw) r4)
            goto L_0x0490
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.zzaf(r12)
            r2.zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzda) r9)
            goto L_0x0490
        L_0x0425:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            zzb((int) r14, (java.lang.Object) r4, (com.google.android.gms.internal.places.zzel) r2)
            goto L_0x0490
        L_0x0431:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            boolean r4 = com.google.android.gms.internal.places.zzdy.zzm(r1, r9)
            r2.zzc((int) r14, (boolean) r4)
            goto L_0x0490
        L_0x043d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzg(r14, r4)
            goto L_0x0490
        L_0x0449:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzd((int) r14, (long) r9)
            goto L_0x0490
        L_0x0455:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.zzd((int) r14, (int) r4)
            goto L_0x0490
        L_0x0461:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzb((int) r14, (long) r9)
            goto L_0x0490
        L_0x046d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.zzj(r14, r9)
            goto L_0x0490
        L_0x0479:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            float r4 = com.google.android.gms.internal.places.zzdy.zzn(r1, r9)
            r2.zzb((int) r14, (float) r4)
            goto L_0x0490
        L_0x0485:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            double r9 = com.google.android.gms.internal.places.zzdy.zzo(r1, r9)
            r2.zzb((int) r14, (double) r9)
        L_0x0490:
            int r10 = r12 + 3
            goto L_0x002d
        L_0x0494:
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.places.zzar<?> r4 = r0.zzlh
            r4.zzb(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0494
        L_0x04a9:
            r5 = 0
            goto L_0x0494
        L_0x04ab:
            com.google.android.gms.internal.places.zzds<?, ?> r3 = r0.zzlg
            zzb(r3, r1, (com.google.android.gms.internal.places.zzel) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzc(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    public final void zzd(T t) {
        int i;
        int i2 = this.zzlc;
        while (true) {
            i = this.zzld;
            if (i2 >= i) {
                break;
            }
            long zzai = (long) (zzai(this.zzlb[i2]) & 1048575);
            Object zzp = zzdy.zzp(t, zzai);
            if (zzp != null) {
                zzdy.zzb((Object) t, zzai, this.zzli.zzj(zzp));
            }
            i2++;
        }
        int length = this.zzlb.length;
        while (i < length) {
            this.zzlf.zzb(t, (long) this.zzlb[i]);
            i++;
        }
        this.zzlg.zzd(t);
        if (this.zzkx) {
            this.zzlh.zzd(t);
        }
    }

    private final boolean zzd(T t, T t2, int i) {
        return zzb(t, i) == zzb(t2, i);
    }

    private static Field zzb(Class<?> cls, String str) {
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
            throw new RuntimeException(C0016g.m31o(C0017h.m58O(C0016g.m25h(arrays, name.length() + C0016g.m25h(str, 40)), "Field ", str, " for ", name), " not found. Known fields are ", arrays));
        }
    }

    private final void zzb(T t, T t2, int i) {
        long zzai = (long) (zzai(i) & 1048575);
        if (zzb(t2, i)) {
            Object zzp = zzdy.zzp(t, zzai);
            Object zzp2 = zzdy.zzp(t2, zzai);
            if (zzp != null && zzp2 != null) {
                zzdy.zzb((Object) t, zzai, zzbd.zzb(zzp, zzp2));
                zzc(t, i);
            } else if (zzp2 != null) {
                zzdy.zzb((Object) t, zzai, zzp2);
                zzc(t, i);
            }
        }
    }

    private static <UT, UB> int zzb(zzds<UT, UB> zzds, T t) {
        return zzds.zzn(zzds.zzr(t));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(T r14, com.google.android.gms.internal.places.zzel r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.zzam()
            int r1 = com.google.android.gms.internal.places.zzbc.zze.zzix
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.zzlg
            zzb(r0, r14, (com.google.android.gms.internal.places.zzel) r15)
            boolean r0 = r13.zzkx
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.places.zzar<?> r0 = r13.zzlh
            com.google.android.gms.internal.places.zzav r0 = r0.zzb((java.lang.Object) r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.zzfj
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.zzks
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.zzai(r7)
            int[] r9 = r13.zzks
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.zzlh
            int r10 = r10.zzb((java.util.Map.Entry<?, ?>) r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.zzlh
            r10.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzc((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzn(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.zzb((int) r9, (com.google.android.gms.internal.places.zzw) r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = zzj(r14, r10)
            r15.zzc((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = zzh(r14, r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = zzi(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = zzg(r14, r10)
            r15.zzb((int) r9, (float) r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.zzb(r14, (int) r9, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = zzf(r14, r10)
            r15.zzb((int) r9, (double) r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            r13.zzb((com.google.android.gms.internal.places.zzel) r15, (int) r9, (java.lang.Object) r8, (int) r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzf(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzk(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzh(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzm(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzn(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzj(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzo(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzl(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzg(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzi(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zze(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzd(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzf(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzk(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzh(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzm(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzn(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzj(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzo(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzl(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzg(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzi(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zze(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzd(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzc((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.zzks
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.zzb((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzc((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzc((int) r9, (long) r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzf(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzk(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzn(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzo(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zze(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.zzb((int) r9, (com.google.android.gms.internal.places.zzw) r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.zzaf(r7)
            r15.zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzda) r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.zzp(r14, r10)
            zzb((int) r9, (java.lang.Object) r8, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.places.zzdy.zzm(r14, r10)
            r15.zzc((int) r9, (boolean) r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzg(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzd((int) r9, (long) r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.zzk(r14, r10)
            r15.zzd((int) r9, (int) r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzb((int) r9, (long) r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.zzl(r14, r10)
            r15.zzj(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.places.zzdy.zzn(r14, r10)
            r15.zzb((int) r9, (float) r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.zzb(r14, (int) r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.places.zzdy.zzo(r14, r10)
            r15.zzb((int) r9, (double) r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.places.zzar<?> r14 = r13.zzlh
            r14.zzb(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.zzkz
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.zzkx
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.places.zzar<?> r0 = r13.zzlh
            com.google.android.gms.internal.places.zzav r0 = r0.zzb((java.lang.Object) r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.zzfj
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.zzks
            int r7 = r7.length
            r8 = 0
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.zzai(r8)
            int[] r10 = r13.zzks
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.zzlh
            int r11 = r11.zzb((java.util.Map.Entry<?, ?>) r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.zzlh
            r11.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzc((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzn(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.zzb((int) r10, (com.google.android.gms.internal.places.zzw) r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = zzj(r14, r11)
            r15.zzc((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = zzh(r14, r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = zzi(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = zzg(r14, r11)
            r15.zzb((int) r10, (float) r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.zzb(r14, (int) r10, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = zzf(r14, r11)
            r15.zzb((int) r10, (double) r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            r13.zzb((com.google.android.gms.internal.places.zzel) r15, (int) r10, (java.lang.Object) r9, (int) r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzf(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzf(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzk(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzh(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzm(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzn(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzj(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<?>) r9, (com.google.android.gms.internal.places.zzel) r15, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzo(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzl(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzg(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzi(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zze(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzd(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzc((int) r10, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.zzks
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.zzb((int) r10, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.places.zzel) r15, (boolean) r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzc((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzc((int) r10, (long) r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzf(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzk(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzn(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzo(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zze(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.zzb((int) r10, (com.google.android.gms.internal.places.zzw) r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.zzaf(r8)
            r15.zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzda) r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.zzp(r14, r11)
            zzb((int) r10, (java.lang.Object) r9, (com.google.android.gms.internal.places.zzel) r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.places.zzdy.zzm(r14, r11)
            r15.zzc((int) r10, (boolean) r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzg(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzd((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.zzk(r14, r11)
            r15.zzd((int) r10, (int) r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzb((int) r10, (long) r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.zzl(r14, r11)
            r15.zzj(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.places.zzdy.zzn(r14, r11)
            r15.zzb((int) r10, (float) r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.zzb(r14, (int) r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.places.zzdy.zzo(r14, r11)
            r15.zzb((int) r10, (double) r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.places.zzar<?> r2 = r13.zzlh
            r2.zzb(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.zzlg
            zzb(r0, r14, (com.google.android.gms.internal.places.zzel) r15)
            return
        L_0x0a44:
            r13.zzc(r14, (com.google.android.gms.internal.places.zzel) r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    private final void zzc(T t, int i) {
        if (!this.zzkz) {
            int zzaj = zzaj(i);
            long j = (long) (zzaj & 1048575);
            zzdy.zzb((Object) t, j, zzdy.zzk(t, j) | (1 << (zzaj >>> 20)));
        }
    }

    private final void zzc(T t, int i, int i2) {
        zzdy.zzb((Object) t, (long) (zzaj(i2) & 1048575), i);
    }

    private final <K, V> void zzb(zzel zzel, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzel.zzb(i, this.zzli.zzl(zzag(i2)), this.zzli.zzh(obj));
        }
    }

    private static <UT, UB> void zzb(zzds<UT, UB> zzds, T t, zzel zzel) throws IOException {
        zzds.zzb(zzds.zzr(t), zzel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(byte[] r1, int r2, int r3, com.google.android.gms.internal.places.zzef r4, java.lang.Class<?> r5, com.google.android.gms.internal.places.zzr r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.places.zzcn.zzfi
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.places.zzs.zze(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            long r2 = com.google.android.gms.internal.places.zzai.zzb(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2, r6)
            int r2 = r6.zzdz
            int r2 = com.google.android.gms.internal.places.zzai.zzm(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.places.zzcv r4 = com.google.android.gms.internal.places.zzcv.zzcq()
            com.google.android.gms.internal.places.zzda r4 = r4.zzf(r5)
            int r1 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r4, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzr) r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2, r6)
            int r2 = r6.zzdz
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zzeb = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.places.zzs.zze(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zzeb = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.places.zzs.zzc(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.zzeb = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zzeb = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.places.zzs.zzd(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.zzeb = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.places.zzs.zzf(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r1, r2, r6)
            long r2 = r6.zzea
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.zzeb = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(byte[], int, int, com.google.android.gms.internal.places.zzef, java.lang.Class, com.google.android.gms.internal.places.zzr):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0420 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e8  */
    private final int zzb(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.places.zzr r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzkr
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.places.zzbh r12 = (com.google.android.gms.internal.places.zzbh) r12
            boolean r13 = r12.zzaa()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.places.zzbh r12 = r12.zzh(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x03a3;
                case 20: goto L_0x0362;
                case 21: goto L_0x0362;
                case 22: goto L_0x0348;
                case 23: goto L_0x0309;
                case 24: goto L_0x02ca;
                case 25: goto L_0x0273;
                case 26: goto L_0x01c0;
                case 27: goto L_0x01a6;
                case 28: goto L_0x014e;
                case 29: goto L_0x0348;
                case 30: goto L_0x0116;
                case 31: goto L_0x02ca;
                case 32: goto L_0x0309;
                case 33: goto L_0x00c9;
                case 34: goto L_0x007c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x03a3;
                case 37: goto L_0x0362;
                case 38: goto L_0x0362;
                case 39: goto L_0x0348;
                case 40: goto L_0x0309;
                case 41: goto L_0x02ca;
                case 42: goto L_0x0273;
                case 43: goto L_0x0348;
                case 44: goto L_0x0116;
                case 45: goto L_0x02ca;
                case 46: goto L_0x0309;
                case 47: goto L_0x00c9;
                case 48: goto L_0x007c;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x041f
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x041f
            com.google.android.gms.internal.places.zzda r1 = r15.zzaf(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.google.android.gms.internal.places.zzr) r26)
            java.lang.Object r8 = r7.zzeb
            r12.add(r8)
        L_0x005c:
            if (r4 >= r5) goto L_0x041f
            int r8 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r9 = r7.zzdz
            if (r2 != r9) goto L_0x041f
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.google.android.gms.internal.places.zzr) r26)
            java.lang.Object r8 = r7.zzeb
            r12.add(r8)
            goto L_0x005c
        L_0x007c:
            if (r6 != r13) goto L_0x00a0
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x0087:
            if (r1 >= r2) goto L_0x0097
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r1, r7)
            long r4 = r7.zzea
            long r4 = com.google.android.gms.internal.places.zzai.zzb(r4)
            r12.zzm(r4)
            goto L_0x0087
        L_0x0097:
            if (r1 != r2) goto L_0x009b
            goto L_0x0420
        L_0x009b:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x00a0:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            long r8 = com.google.android.gms.internal.places.zzai.zzb(r8)
            r12.zzm(r8)
        L_0x00b1:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            long r8 = com.google.android.gms.internal.places.zzai.zzb(r8)
            r12.zzm(r8)
            goto L_0x00b1
        L_0x00c9:
            if (r6 != r13) goto L_0x00ed
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x00d4:
            if (r1 >= r2) goto L_0x00e4
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r12.zzac(r4)
            goto L_0x00d4
        L_0x00e4:
            if (r1 != r2) goto L_0x00e8
            goto L_0x0420
        L_0x00e8:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x00ed:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r12.zzac(r4)
        L_0x00fe:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = com.google.android.gms.internal.places.zzai.zzm(r4)
            r12.zzac(r4)
            goto L_0x00fe
        L_0x0116:
            if (r6 != r13) goto L_0x011d
            int r2 = com.google.android.gms.internal.places.zzs.zzb((byte[]) r3, (int) r4, (com.google.android.gms.internal.places.zzbh<?>) r12, (com.google.android.gms.internal.places.zzr) r7)
            goto L_0x012e
        L_0x011d:
            if (r6 != 0) goto L_0x041f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.places.zzs.zzb((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzbh<?>) r6, (com.google.android.gms.internal.places.zzr) r7)
        L_0x012e:
            com.google.android.gms.internal.places.zzbc r1 = (com.google.android.gms.internal.places.zzbc) r1
            com.google.android.gms.internal.places.zzdr r3 = r1.zzih
            com.google.android.gms.internal.places.zzdr r4 = com.google.android.gms.internal.places.zzdr.zzdh()
            if (r3 != r4) goto L_0x0139
            r3 = 0
        L_0x0139:
            com.google.android.gms.internal.places.zzbf r4 = r15.zzah(r8)
            com.google.android.gms.internal.places.zzds<?, ?> r5 = r0.zzlg
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdc.zzb(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.places.zzdr r3 = (com.google.android.gms.internal.places.zzdr) r3
            if (r3 == 0) goto L_0x014b
            r1.zzih = r3
        L_0x014b:
            r1 = r2
            goto L_0x0420
        L_0x014e:
            if (r6 != r13) goto L_0x041f
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x01a1
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019c
            if (r4 != 0) goto L_0x0164
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.zzeg
            r12.add(r4)
            goto L_0x016c
        L_0x0164:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.zzc((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
        L_0x016b:
            int r1 = r1 + r4
        L_0x016c:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            if (r4 < 0) goto L_0x0197
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0192
            if (r4 != 0) goto L_0x018a
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.zzeg
            r12.add(r4)
            goto L_0x016c
        L_0x018a:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.zzc((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
            goto L_0x016b
        L_0x0192:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0197:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x019c:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x01a1:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x01a6:
            if (r6 != r13) goto L_0x041f
            com.google.android.gms.internal.places.zzda r1 = r15.zzaf(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0420
        L_0x01c0:
            if (r6 != r13) goto L_0x041f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0213
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r6 = r7.zzdz
            if (r6 < 0) goto L_0x020e
            if (r6 != 0) goto L_0x01db
            r12.add(r1)
            goto L_0x01e6
        L_0x01db:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.UTF_8
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01e5:
            int r4 = r4 + r6
        L_0x01e6:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r6, r7)
            int r6 = r7.zzdz
            if (r6 < 0) goto L_0x0209
            if (r6 != 0) goto L_0x01fe
            r12.add(r1)
            goto L_0x01e6
        L_0x01fe:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.UTF_8
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01e5
        L_0x0209:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x020e:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0213:
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r6 = r7.zzdz
            if (r6 < 0) goto L_0x026e
            if (r6 != 0) goto L_0x0221
            r12.add(r1)
            goto L_0x0234
        L_0x0221:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.places.zzea.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x0269
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.UTF_8
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0233:
            r4 = r8
        L_0x0234:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r6, r7)
            int r6 = r7.zzdz
            if (r6 < 0) goto L_0x0264
            if (r6 != 0) goto L_0x024c
            r12.add(r1)
            goto L_0x0234
        L_0x024c:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.places.zzea.zzf(r3, r4, r8)
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.UTF_8
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0233
        L_0x025f:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x0264:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0269:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x026e:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbq()
            throw r1
        L_0x0273:
            r1 = 0
            if (r6 != r13) goto L_0x029b
            com.google.android.gms.internal.places.zzu r12 = (com.google.android.gms.internal.places.zzu) r12
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r4 = r7.zzdz
            int r4 = r4 + r2
        L_0x027f:
            if (r2 >= r4) goto L_0x0292
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r2, r7)
            long r5 = r7.zzea
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x028d
            r5 = 1
            goto L_0x028e
        L_0x028d:
            r5 = 0
        L_0x028e:
            r12.addBoolean(r5)
            goto L_0x027f
        L_0x0292:
            if (r2 != r4) goto L_0x0296
            goto L_0x014b
        L_0x0296:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x029b:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzu r12 = (com.google.android.gms.internal.places.zzu) r12
            int r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ab
            r6 = 1
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            r12.addBoolean(r6)
        L_0x02af:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r8 = r7.zzdz
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r6, r7)
            long r8 = r7.zzea
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02c5
            r6 = 1
            goto L_0x02c6
        L_0x02c5:
            r6 = 0
        L_0x02c6:
            r12.addBoolean(r6)
            goto L_0x02af
        L_0x02ca:
            if (r6 != r13) goto L_0x02ea
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1)
            r12.zzac(r4)
            int r1 = r1 + 4
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x0420
        L_0x02e5:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x02ea:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r17, r18)
            r12.zzac(r1)
        L_0x02f5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4)
            r12.zzac(r1)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r13) goto L_0x0329
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x0314:
            if (r1 >= r2) goto L_0x0320
            long r4 = com.google.android.gms.internal.places.zzs.zzc(r3, r1)
            r12.zzm(r4)
            int r1 = r1 + 8
            goto L_0x0314
        L_0x0320:
            if (r1 != r2) goto L_0x0324
            goto L_0x0420
        L_0x0324:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0329:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            long r8 = com.google.android.gms.internal.places.zzs.zzc(r17, r18)
            r12.zzm(r8)
        L_0x0334:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            long r8 = com.google.android.gms.internal.places.zzs.zzc(r3, r4)
            r12.zzm(r8)
            goto L_0x0334
        L_0x0348:
            if (r6 != r13) goto L_0x0350
            int r1 = com.google.android.gms.internal.places.zzs.zzb((byte[]) r3, (int) r4, (com.google.android.gms.internal.places.zzbh<?>) r12, (com.google.android.gms.internal.places.zzr) r7)
            goto L_0x0420
        L_0x0350:
            if (r6 != 0) goto L_0x041f
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.places.zzs.zzb((int) r20, (byte[]) r21, (int) r22, (int) r23, (com.google.android.gms.internal.places.zzbh<?>) r24, (com.google.android.gms.internal.places.zzr) r25)
            goto L_0x0420
        L_0x0362:
            if (r6 != r13) goto L_0x0382
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x036d:
            if (r1 >= r2) goto L_0x0379
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r1, r7)
            long r4 = r7.zzea
            r12.zzm(r4)
            goto L_0x036d
        L_0x0379:
            if (r1 != r2) goto L_0x037d
            goto L_0x0420
        L_0x037d:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0382:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            r12.zzm(r8)
        L_0x038f:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r7)
            long r8 = r7.zzea
            r12.zzm(r8)
            goto L_0x038f
        L_0x03a3:
            if (r6 != r13) goto L_0x03c2
            com.google.android.gms.internal.places.zzbb r12 = (com.google.android.gms.internal.places.zzbb) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x03ae:
            if (r1 >= r2) goto L_0x03ba
            float r4 = com.google.android.gms.internal.places.zzs.zze(r3, r1)
            r12.zzf((float) r4)
            int r1 = r1 + 4
            goto L_0x03ae
        L_0x03ba:
            if (r1 != r2) goto L_0x03bd
            goto L_0x0420
        L_0x03bd:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x03c2:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.places.zzbb r12 = (com.google.android.gms.internal.places.zzbb) r12
            float r1 = com.google.android.gms.internal.places.zzs.zze(r17, r18)
            r12.zzf((float) r1)
        L_0x03cd:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            float r1 = com.google.android.gms.internal.places.zzs.zze(r3, r4)
            r12.zzf((float) r1)
            goto L_0x03cd
        L_0x03e1:
            if (r6 != r13) goto L_0x0400
            com.google.android.gms.internal.places.zzao r12 = (com.google.android.gms.internal.places.zzao) r12
            int r1 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r7)
            int r2 = r7.zzdz
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03f8
            double r4 = com.google.android.gms.internal.places.zzs.zzd(r3, r1)
            r12.zzd(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03f8:
            if (r1 != r2) goto L_0x03fb
            goto L_0x0420
        L_0x03fb:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r1
        L_0x0400:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.places.zzao r12 = (com.google.android.gms.internal.places.zzao) r12
            double r8 = com.google.android.gms.internal.places.zzs.zzd(r17, r18)
            r12.zzd(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.zzb(r3, r1, r7)
            int r6 = r7.zzdz
            if (r2 != r6) goto L_0x0420
            double r8 = com.google.android.gms.internal.places.zzs.zzd(r3, r4)
            r12.zzd(r8)
            goto L_0x040b
        L_0x041f:
            r1 = r4
        L_0x0420:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int zzb(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.places.zzr r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = zzkr
            java.lang.Object r12 = r7.zzag(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.places.zzcd r2 = r7.zzli
            boolean r2 = r2.zzi(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.places.zzcd r2 = r7.zzli
            java.lang.Object r2 = r2.zzk(r12)
            com.google.android.gms.internal.places.zzcd r3 = r7.zzli
            r3.zzc(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.places.zzcd r8 = r7.zzli
            com.google.android.gms.internal.places.zzcb r8 = r8.zzl(r12)
            com.google.android.gms.internal.places.zzcd r12 = r7.zzli
            java.util.Map r12 = r12.zzg(r1)
            int r10 = com.google.android.gms.internal.places.zzs.zzb(r9, r10, r15)
            int r13 = r15.zzdz
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.zzkk
            V r0 = r8.zzkm
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.places.zzs.zzb((int) r10, (byte[]) r9, (int) r1, (com.google.android.gms.internal.places.zzr) r15)
            int r10 = r15.zzdz
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.places.zzef r1 = r8.zzkl
            int r1 = r1.zzds()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.zzkl
            V r10 = r8.zzkm
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zzb((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzef) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.places.zzr) r6)
            java.lang.Object r0 = r15.zzeb
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.places.zzef r1 = r8.zzkj
            int r1 = r1.zzds()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.zzkj
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = zzb((byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzef) r4, (java.lang.Class<?>) r5, (com.google.android.gms.internal.places.zzr) r6)
            java.lang.Object r14 = r15.zzeb
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.places.zzs.zzb((int) r10, (byte[]) r9, (int) r2, (int) r11, (com.google.android.gms.internal.places.zzr) r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.zzbp()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzb(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.places.zzr r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = zzkr
            int[] r7 = r0.zzks
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.places.zzda r2 = r0.zzaf(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.places.zzr) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.zzeb
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            long r3 = com.google.android.gms.internal.places.zzai.zzb(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r3 = r11.zzdz
            int r3 = com.google.android.gms.internal.places.zzai.zzm(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r4 = r11.zzdz
            com.google.android.gms.internal.places.zzbf r5 = r0.zzah(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.zzad(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.places.zzdr r1 = zzo(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.zzc(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzf(r3, r4, r11)
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.places.zzda r2 = r0.zzaf(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzr) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.zzeb
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.zzeb
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r15, (java.lang.Object) r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r4 = r11.zzdz
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.places.zzea.zzf(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.zzbu()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.places.zzbd.UTF_8
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.places.zzs.zzc(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzb(r3, r4, r11)
            int r3 = r11.zzdz
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.zzc(r3, r4, r11)
            long r3 = r11.zzea
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.places.zzs.zze(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.places.zzs.zzd(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x036a, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b3, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0174, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0213, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r34;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023f, code lost:
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b6, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r6 = r6 | r22;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bc, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c0, code lost:
        r13 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c6, code lost:
        r2 = r7;
        r19 = r9;
        r26 = r10;
        r7 = r32;
        r9 = r8;
        r32 = r11;
        r8 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.places.zzr r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = zzkr
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x047f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.places.zzr) r9)
            int r3 = r9.zzdz
            r4 = r0
            r5 = r3
            goto L_0x002d
        L_0x002b:
            r5 = r0
            r4 = r3
        L_0x002d:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x003a
            int r2 = r2 / r8
            int r1 = r15.zzq(r3, r2)
            goto L_0x003e
        L_0x003a:
            int r1 = r15.zzak(r3)
        L_0x003e:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004d
            r32 = r3
            r2 = r4
            r9 = r5
            r26 = r10
            r8 = r11
            r19 = 0
            goto L_0x03e1
        L_0x004d:
            int[] r1 = r15.zzks
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02d4
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r17
            r5 = -1
            if (r1 == r7) goto L_0x007e
            if (r7 == r5) goto L_0x0078
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0078:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x007e:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x029e;
                case 1: goto L_0x0284;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x0243;
                case 5: goto L_0x021e;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01ae;
                case 9: goto L_0x0178;
                case 10: goto L_0x015d;
                case 11: goto L_0x0243;
                case 12: goto L_0x012b;
                case 13: goto L_0x01fb;
                case 14: goto L_0x021e;
                case 15: goto L_0x0110;
                case 16: goto L_0x00e3;
                case 17: goto L_0x0091;
                default: goto L_0x0082;
            }
        L_0x0082:
            r12 = r31
            r13 = r35
            r9 = r2
            r11 = r3
            r32 = r7
            r8 = r19
            r19 = -1
        L_0x008e:
            r7 = r4
            goto L_0x02c6
        L_0x0091:
            r8 = 3
            if (r0 != r8) goto L_0x00d7
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r2)
            r1 = r31
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r33
            r4 = r8
            r8 = r19
            r19 = -1
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.places.zzr) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00ba
            r5 = r35
            java.lang.Object r1 = r5.zzeb
            r10.putObject(r14, r12, r1)
            goto L_0x00c9
        L_0x00ba:
            r5 = r35
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r12, r1)
        L_0x00c9:
            r6 = r6 | r22
            r12 = r31
            r13 = r33
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r34
            r9 = r5
            goto L_0x0017
        L_0x00d7:
            r9 = r2
            r11 = r3
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            goto L_0x023f
        L_0x00e3:
            r5 = r35
            r9 = r2
            r11 = r3
            r8 = r19
            r19 = -1
            if (r0 != 0) goto L_0x010b
            r2 = r12
            r12 = r31
            int r13 = com.google.android.gms.internal.places.zzs.zzc(r12, r4, r5)
            long r0 = r5.zzea
            long r17 = com.google.android.gms.internal.places.zzai.zzb(r0)
            r0 = r10
            r1 = r30
            r32 = r13
            r13 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r32
            goto L_0x02bc
        L_0x010b:
            r12 = r31
            r13 = r5
            goto L_0x023f
        L_0x0110:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r4, r13)
            int r1 = r13.zzdz
            int r1 = com.google.android.gms.internal.places.zzai.zzm(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x012b:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r4, r13)
            int r1 = r13.zzdz
            com.google.android.gms.internal.places.zzbf r4 = r15.zzah(r9)
            if (r4 == 0) goto L_0x0159
            boolean r4 = r4.zzad(r1)
            if (r4 == 0) goto L_0x014b
            goto L_0x0159
        L_0x014b:
            com.google.android.gms.internal.places.zzdr r2 = zzo(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzc(r8, r1)
            goto L_0x02bc
        L_0x0159:
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x015d:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.zzf(r12, r4, r13)
            java.lang.Object r1 = r13.zzeb
            r10.putObject(r14, r2, r1)
        L_0x0174:
            r6 = r6 | r22
            goto L_0x02bc
        L_0x0178:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r9)
            r5 = r33
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r12, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzr) r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = r13.zzeb
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x019b:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01aa:
            r5 = r33
            goto L_0x023f
        L_0x01ae:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01c9
            int r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r4, r13)
            goto L_0x01cd
        L_0x01c9:
            int r0 = com.google.android.gms.internal.places.zzs.zze(r12, r4, r13)
        L_0x01cd:
            java.lang.Object r1 = r13.zzeb
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01d3:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.zzc(r12, r4, r13)
            r32 = r0
            long r0 = r13.zzea
            r20 = 0
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x01f2
            r0 = 1
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (boolean) r0)
            r6 = r6 | r22
            r0 = r32
            goto L_0x0215
        L_0x01fb:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0213:
            r6 = r6 | r22
        L_0x0215:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r34
            r13 = r5
            goto L_0x0017
        L_0x021e:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            long r17 = com.google.android.gms.internal.places.zzs.zzc(r12, r4)
            r0 = r10
            r1 = r30
            r32 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02b6
        L_0x023f:
            r32 = r7
            goto L_0x008e
        L_0x0243:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r7, r13)
            int r1 = r13.zzdz
            r10.putInt(r14, r2, r1)
            goto L_0x02b8
        L_0x025e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r7 = com.google.android.gms.internal.places.zzs.zzc(r12, r7, r13)
            long r4 = r13.zzea
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r32
            goto L_0x02c0
        L_0x0284:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            float r0 = com.google.android.gms.internal.places.zzs.zze(r12, r7)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r7 + 4
            goto L_0x02b8
        L_0x029e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            double r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r7)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x02b6:
            int r0 = r7 + 8
        L_0x02b8:
            r6 = r6 | r22
            r7 = r32
        L_0x02bc:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c0:
            r13 = r33
            r11 = r34
            goto L_0x0017
        L_0x02c6:
            r2 = r7
            r19 = r9
            r26 = r10
            r7 = r32
            r9 = r8
            r32 = r11
            r8 = r34
            goto L_0x03e1
        L_0x02d4:
            r5 = r3
            r18 = r7
            r8 = r19
            r19 = -1
            r7 = r4
            r27 = r12
            r12 = r31
            r13 = r9
            r9 = r2
            r2 = r27
            r1 = 27
            if (r11 != r1) goto L_0x0339
            r1 = 2
            if (r0 != r1) goto L_0x032c
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r1 = r0.zzaa()
            if (r1 != 0) goto L_0x0309
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0300
            r1 = 10
            goto L_0x0302
        L_0x0300:
            int r1 = r1 << 1
        L_0x0302:
            com.google.android.gms.internal.places.zzbh r0 = r0.zzh(r1)
            r10.putObject(r14, r2, r0)
        L_0x0309:
            r11 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r9)
            r1 = r8
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r11
            r22 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r18
            r6 = r22
            r13 = r33
            goto L_0x0017
        L_0x032c:
            r22 = r6
            r32 = r5
            r15 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            goto L_0x03b6
        L_0x0339:
            r22 = r6
            r1 = 49
            if (r11 > r1) goto L_0x0388
            r6 = r20
            long r12 = (long) r6
            r6 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r7
            r4 = r33
            r32 = r5
            r5 = r8
            r20 = r6
            r6 = r32
            r15 = r7
            r7 = r20
            r25 = r8
            r8 = r9
            r19 = r9
            r26 = r10
            r9 = r12
            r12 = r34
            r12 = r23
            r14 = r35
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.places.zzr) r14)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x036e:
            r15 = r29
            r14 = r30
            r12 = r31
            r1 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r7 = r18
            r2 = r19
            r6 = r22
            r3 = r25
            r10 = r26
            goto L_0x0017
        L_0x0388:
            r23 = r2
            r32 = r5
            r15 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            r6 = r20
            r20 = r0
            r0 = 50
            if (r11 != r0) goto L_0x03c0
            r7 = r20
            r0 = 2
            if (r7 != r0) goto L_0x03b6
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r23
            r8 = r35
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.places.zzr) r8)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x03b6:
            r8 = r34
            r2 = r15
        L_0x03b9:
            r7 = r18
            r6 = r22
            r9 = r25
            goto L_0x03e1
        L_0x03c0:
            r7 = r20
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r25
            r8 = r6
            r6 = r32
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r35
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.places.zzr) r13)
            if (r0 != r15) goto L_0x0463
        L_0x03dd:
            r8 = r34
            r2 = r0
            goto L_0x03b9
        L_0x03e1:
            if (r9 != r8) goto L_0x03ef
            if (r8 != 0) goto L_0x03e6
            goto L_0x03ef
        L_0x03e6:
            r10 = r29
            r13 = r30
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x048d
        L_0x03ef:
            r10 = r29
            boolean r0 = r10.zzkx
            if (r0 == 0) goto L_0x043e
            r11 = r35
            com.google.android.gms.internal.places.zzap r0 = r11.zzec
            com.google.android.gms.internal.places.zzap r1 = com.google.android.gms.internal.places.zzap.zzao()
            if (r0 == r1) goto L_0x0439
            com.google.android.gms.internal.places.zzck r0 = r10.zzkw
            com.google.android.gms.internal.places.zzap r1 = r11.zzec
            r12 = r32
            com.google.android.gms.internal.places.zzbc$zzf r0 = r1.zzb(r0, r12)
            if (r0 != 0) goto L_0x0429
            com.google.android.gms.internal.places.zzdr r4 = zzo(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
            r14 = r30
            r13 = r33
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r2 = r19
            r10 = r26
            r12 = r31
            goto L_0x0460
        L_0x0429:
            r13 = r30
            r0 = r13
            com.google.android.gms.internal.places.zzbc$zzc r0 = (com.google.android.gms.internal.places.zzbc.zzc) r0
            r0.zzbm()
            com.google.android.gms.internal.places.zzav<java.lang.Object> r0 = r0.zzik
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0439:
            r13 = r30
            r12 = r32
            goto L_0x0444
        L_0x043e:
            r13 = r30
            r12 = r32
            r11 = r35
        L_0x0444:
            com.google.android.gms.internal.places.zzdr r4 = zzo(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r14 = r13
            r2 = r19
            r10 = r26
            r12 = r31
            r13 = r33
        L_0x0460:
            r11 = r8
            goto L_0x0017
        L_0x0463:
            r12 = r32
            r9 = r25
            r15 = r29
            r14 = r30
            r13 = r33
            r11 = r34
            r3 = r9
            r1 = r12
            r7 = r18
            r2 = r19
            r6 = r22
            r10 = r26
            r12 = r31
            r9 = r35
            goto L_0x0017
        L_0x047f:
            r22 = r6
            r18 = r7
            r26 = r10
            r8 = r11
            r13 = r14
            r10 = r15
            r7 = r0
            r9 = r3
            r0 = r18
            r1 = -1
        L_0x048d:
            if (r0 == r1) goto L_0x0495
            long r0 = (long) r0
            r2 = r26
            r2.putInt(r13, r0, r6)
        L_0x0495:
            r0 = 0
            int r1 = r10.zzlc
            r5 = r0
            r11 = r1
        L_0x049a:
            int r0 = r10.zzld
            if (r11 >= r0) goto L_0x04ce
            int[] r0 = r10.zzlb
            r1 = r0[r11]
            com.google.android.gms.internal.places.zzds<?, ?> r6 = r10.zzlg
            int[] r0 = r10.zzks
            r2 = r0[r1]
            int r0 = r10.zzai(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.places.zzdy.zzp(r13, r3)
            if (r0 != 0) goto L_0x04b6
            goto L_0x04c9
        L_0x04b6:
            com.google.android.gms.internal.places.zzbf r4 = r10.zzah(r1)
            if (r4 != 0) goto L_0x04bd
            goto L_0x04c9
        L_0x04bd:
            com.google.android.gms.internal.places.zzcd r3 = r10.zzli
            java.util.Map r3 = r3.zzg(r0)
            r0 = r29
            java.lang.Object r5 = r0.zzb((int) r1, (int) r2, r3, (com.google.android.gms.internal.places.zzbf) r4, r5, r6)
        L_0x04c9:
            com.google.android.gms.internal.places.zzdr r5 = (com.google.android.gms.internal.places.zzdr) r5
            int r11 = r11 + 1
            goto L_0x049a
        L_0x04ce:
            if (r5 == 0) goto L_0x04d5
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r10.zzlg
            r0.zzg(r13, r5)
        L_0x04d5:
            if (r8 != 0) goto L_0x04e1
            r0 = r33
            if (r7 != r0) goto L_0x04dc
            goto L_0x04e7
        L_0x04dc:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        L_0x04e1:
            r0 = r33
            if (r7 > r0) goto L_0x04e8
            if (r9 != r8) goto L_0x04e8
        L_0x04e7:
            return r7
        L_0x04e8:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.places.zzr r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.zzkz
            if (r0 == 0) goto L_0x025d
            sun.misc.Unsafe r9 = zzkr
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0254
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r12, (int) r3, (com.google.android.gms.internal.places.zzr) r11)
            int r3 = r11.zzdz
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.zzq(r7, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.zzak(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.zzks
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            r19 = r1
            long r0 = r11.zzea
            long r21 = com.google.android.gms.internal.places.zzai.zzb(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            int r1 = com.google.android.gms.internal.places.zzai.zzm(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = com.google.android.gms.internal.places.zzs.zzf(r12, r8, r11)
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r4)
            int r0 = com.google.android.gms.internal.places.zzs.zzb((com.google.android.gms.internal.places.zzda) r0, (byte[]) r12, (int) r8, (int) r13, (com.google.android.gms.internal.places.zzr) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.zzeb
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.zzb((java.lang.Object) r1, (java.lang.Object) r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = com.google.android.gms.internal.places.zzs.zze(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.zzeb
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            long r5 = r11.zzea
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (boolean) r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x0251
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = com.google.android.gms.internal.places.zzs.zzc(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r12, r8, r11)
            int r1 = r11.zzdz
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = com.google.android.gms.internal.places.zzs.zzc(r12, r8, r11)
            long r4 = r11.zzea
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = com.google.android.gms.internal.places.zzs.zze(r12, r8)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (float) r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = com.google.android.gms.internal.places.zzs.zzd(r12, r8)
            com.google.android.gms.internal.places.zzdy.zzb((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x0251
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r3 = r0.zzaa()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            com.google.android.gms.internal.places.zzbh r0 = r0.zzh(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.zzaf(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.android.gms.internal.places.zzs.zzb(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0251
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.places.zzr) r14)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (long) r6, (com.google.android.gms.internal.places.zzr) r8)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.places.zzr) r13)
            if (r0 != r15) goto L_0x0241
        L_0x0230:
            r2 = r0
        L_0x0231:
            com.google.android.gms.internal.places.zzdr r4 = zzo(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.android.gms.internal.places.zzs.zzb((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.google.android.gms.internal.places.zzdr) r4, (com.google.android.gms.internal.places.zzr) r5)
        L_0x0241:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0251:
            r10 = -1
            goto L_0x0017
        L_0x0254:
            r4 = r13
            if (r0 != r4) goto L_0x0258
            return
        L_0x0258:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.zzbt()
            throw r0
        L_0x025d:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.zzb(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.places.zzr) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.zzb(java.lang.Object, byte[], int, int, com.google.android.gms.internal.places.zzr):void");
    }

    private final <K, V, UT, UB> UB zzb(int i, int i2, Map<K, V> map, zzbf zzbf, UB ub, zzds<UT, UB> zzds) {
        zzcb<?, ?> zzl = this.zzli.zzl(zzag(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzbf.zzad(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzds.zzdk();
                }
                zzae zzk = zzw.zzk(zzcc.zzb(zzl, next.getKey(), next.getValue()));
                try {
                    zzcc.zzb(zzk.zzai(), zzl, next.getKey(), next.getValue());
                    zzds.zzb(ub, i2, zzk.zzah());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private static boolean zzb(Object obj, int i, zzda zzda) {
        return zzda.zzp(zzdy.zzp(obj, (long) (i & 1048575)));
    }

    private static void zzb(int i, Object obj, zzel zzel) throws IOException {
        if (obj instanceof String) {
            zzel.zzb(i, (String) obj);
        } else {
            zzel.zzb(i, (zzw) obj);
        }
    }

    private final boolean zzb(T t, int i, int i2, int i3) {
        if (this.zzkz) {
            return zzb(t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zzb(T t, int i) {
        if (this.zzkz) {
            int zzai = zzai(i);
            long j = (long) (zzai & 1048575);
            switch ((zzai & 267386880) >>> 20) {
                case 0:
                    return zzdy.zzo(t, j) != 0.0d;
                case 1:
                    return zzdy.zzn(t, j) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return zzdy.zzl(t, j) != 0;
                case 3:
                    return zzdy.zzl(t, j) != 0;
                case 4:
                    return zzdy.zzk(t, j) != 0;
                case 5:
                    return zzdy.zzl(t, j) != 0;
                case 6:
                    return zzdy.zzk(t, j) != 0;
                case 7:
                    return zzdy.zzm(t, j);
                case 8:
                    Object zzp = zzdy.zzp(t, j);
                    if (zzp instanceof String) {
                        return !((String) zzp).isEmpty();
                    }
                    if (zzp instanceof zzw) {
                        return !zzw.zzeg.equals(zzp);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzdy.zzp(t, j) != null;
                case 10:
                    return !zzw.zzeg.equals(zzdy.zzp(t, j));
                case 11:
                    return zzdy.zzk(t, j) != 0;
                case 12:
                    return zzdy.zzk(t, j) != 0;
                case 13:
                    return zzdy.zzk(t, j) != 0;
                case 14:
                    return zzdy.zzl(t, j) != 0;
                case 15:
                    return zzdy.zzk(t, j) != 0;
                case 16:
                    return zzdy.zzl(t, j) != 0;
                case 17:
                    return zzdy.zzp(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int zzaj = zzaj(i);
            return (zzdy.zzk(t, (long) (zzaj & 1048575)) & (1 << (zzaj >>> 20))) != 0;
        }
    }

    private final boolean zzb(T t, int i, int i2) {
        return zzdy.zzk(t, (long) (zzaj(i2) & 1048575)) == i;
    }
}
