package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbm<E> extends zzbg<E> implements Set<E> {
    @NullableDecl
    private transient zzbl<E> zza;

    @SafeVarargs
    public static <E> zzbm<E> zzf(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        Object[] objArr = new Object[8];
        objArr[0] = "common";
        objArr[1] = "vision-common";
        objArr[2] = "play-services-mlkit-barcode-scanning";
        objArr[3] = "barcode-scanning";
        objArr[4] = "play-services-mlkit-face-detection";
        objArr[5] = "face-detection";
        System.arraycopy(eArr, 0, objArr, 6, 2);
        return zzk(8, objArr);
    }

    public static int zzg(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    private static <E> zzbm<E> zzk(int i, Object... objArr) {
        if (i == 0) {
            return zzcb.zza;
        }
        if (i == 1) {
            return new zzce(objArr[0]);
        }
        int zzg = zzg(i);
        Object[] objArr2 = new Object[zzg];
        int i2 = zzg - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            zzbz.zzb(obj, i5);
            int hashCode = obj.hashCode();
            int zza2 = zzbd.zza(hashCode);
            while (true) {
                int i6 = zza2 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += hashCode;
                    i4++;
                    break;
                } else if (obj2.equals(obj)) {
                    break;
                } else {
                    zza2++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new zzce(objArr[0], i3);
        }
        if (zzg(i4) < zzg / 2) {
            return zzk(i4, objArr);
        }
        if (i4 < 6) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzcb(objArr, i3, objArr2, i2, i4);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbm) && zzh() && ((zzbm) obj).zzh() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() != set.size() || !containsAll(set)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        for (Object next : this) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: zza */
    public abstract zzcg<E> iterator();

    public boolean zzh() {
        throw null;
    }

    public final zzbl<E> zzi() {
        zzbl<E> zzbl = this.zza;
        if (zzbl != null) {
            return zzbl;
        }
        zzbl<E> zzj = zzj();
        this.zza = zzj;
        return zzj;
    }

    public zzbl<E> zzj() {
        throw null;
    }
}
