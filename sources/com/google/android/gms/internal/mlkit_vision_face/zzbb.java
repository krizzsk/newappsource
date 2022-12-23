package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzbb<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */
    public static final Object zzd = new Object();
    @NullableDecl
    public transient int[] zza;
    @NullableDecl
    public transient Object[] zzb;
    @NullableDecl
    public transient Object[] zzc;
    /* access modifiers changed from: private */
    @NullableDecl
    public transient Object zze;
    /* access modifiers changed from: private */
    public transient int zzf;
    private transient int zzg;
    @NullableDecl
    private transient Set<K> zzh;
    @NullableDecl
    private transient Set<Map.Entry<K, V>> zzi;
    @NullableDecl
    private transient Collection<V> zzj;

    public zzbb() {
        zza(3);
    }

    public static /* synthetic */ int zzn(zzbb zzbb) {
        int i = zzbb.zzg;
        zzbb.zzg = i - 1;
        return i;
    }

    private final void zzo(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & -32);
    }

    /* access modifiers changed from: private */
    public final int zzp() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzq(int i, int i2, int i3, int i4) {
        Object zza2 = zzbc.zza(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzbc.zzc(zza2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        int[] iArr = this.zza;
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb2 = zzbc.zzb(obj, i6);
            while (zzb2 != 0) {
                int i7 = zzb2 - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i11 = i9 & i5;
                int zzb3 = zzbc.zzb(zza2, i11);
                zzbc.zzc(zza2, i11, zzb2);
                iArr[i7] = ((~i5) & i9) | (zzb3 & i5);
                zzb2 = i8 & i;
            }
        }
        this.zze = zza2;
        zzo(i5);
        return i5;
    }

    /* access modifiers changed from: private */
    public final int zzr(@NullableDecl Object obj) {
        if (zzb()) {
            return -1;
        }
        int zzb2 = zzbd.zzb(obj);
        int zzp = zzp();
        int zzb3 = zzbc.zzb(this.zze, zzb2 & zzp);
        if (zzb3 != 0) {
            int i = ~zzp;
            int i2 = zzb2 & i;
            do {
                int i3 = zzb3 - 1;
                int i4 = this.zza[i3];
                if ((i4 & i) == i2 && zzw.zza(obj, this.zzb[i3])) {
                    return i3;
                }
                zzb3 = i4 & zzp;
            } while (zzb3 != 0);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    @NullableDecl
    public final Object zzs(@NullableDecl Object obj) {
        if (zzb()) {
            return zzd;
        }
        int zzp = zzp();
        int zze2 = zzbc.zze(obj, (Object) null, zzp, this.zze, this.zza, this.zzb, (Object[]) null);
        if (zze2 == -1) {
            return zzd;
        }
        Object obj2 = this.zzc[zze2];
        zze(zze2, zzp);
        this.zzg--;
        zzd();
        return obj2;
    }

    public final void clear() {
        if (!zzb()) {
            zzd();
            Map zzc2 = zzc();
            if (zzc2 != null) {
                this.zzf = zzci.zza(size(), 3, 1073741823);
                zzc2.clear();
                this.zze = null;
                this.zzg = 0;
                return;
            }
            Arrays.fill(this.zzb, 0, this.zzg, (Object) null);
            Arrays.fill(this.zzc, 0, this.zzg, (Object) null);
            Object obj = this.zze;
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(this.zza, 0, this.zzg, 0);
            this.zzg = 0;
        }
    }

    public final boolean containsKey(@NullableDecl Object obj) {
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.containsKey(obj);
        }
        if (zzr(obj) == -1) {
            return false;
        }
        return true;
    }

    public final boolean containsValue(@NullableDecl Object obj) {
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzw.zza(obj, this.zzc[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set != null) {
            return set;
        }
        zzaw zzaw = new zzaw(this);
        this.zzi = zzaw;
        return zzaw;
    }

    public final V get(@NullableDecl Object obj) {
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.get(obj);
        }
        int zzr = zzr(obj);
        if (zzr == -1) {
            return null;
        }
        return this.zzc[zzr];
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set != null) {
            return set;
        }
        zzay zzay = new zzay(this);
        this.zzh = zzay;
        return zzay;
    }

    @NullableDecl
    public final V put(@NullableDecl K k, @NullableDecl V v) {
        int min;
        K k2 = k;
        V v2 = v;
        if (zzb()) {
            zzaa.zza(zzb(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzbc.zza(max2);
            zzo(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.put(k2, v2);
        }
        int[] iArr = this.zza;
        Object[] objArr = this.zzb;
        V[] vArr = this.zzc;
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb2 = zzbd.zzb(k);
        int zzp = zzp();
        int i4 = zzb2 & zzp;
        int zzb3 = zzbc.zzb(this.zze, i4);
        if (zzb3 != 0) {
            int i5 = ~zzp;
            int i6 = zzb2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb3 - 1;
                int i9 = iArr[i8];
                int i11 = i9 & i5;
                if (i11 != i6 || !zzw.zza(k2, objArr[i8])) {
                    int i12 = i9 & zzp;
                    i7++;
                    if (i12 != 0) {
                        zzb3 = i12;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzp() + 1, 1.0f);
                        for (int zzf2 = zzf(); zzf2 >= 0; zzf2 = zzg(zzf2)) {
                            linkedHashMap.put(this.zzb[zzf2], this.zzc[zzf2]);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzd();
                        return linkedHashMap.put(k2, v2);
                    } else if (i3 > zzp) {
                        zzp = zzq(zzp, zzbc.zzd(zzp), zzb2, i2);
                    } else {
                        iArr[i8] = (i3 & zzp) | i11;
                    }
                } else {
                    V v3 = vArr[i8];
                    vArr[i8] = v2;
                    return v3;
                }
            }
        } else if (i3 > zzp) {
            zzp = zzq(zzp, zzbc.zzd(zzp), zzb2, i2);
        } else {
            zzbc.zzc(this.zze, i4, i3);
        }
        int length = this.zza.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(this.zza, min);
            this.zzb = Arrays.copyOf(this.zzb, min);
            this.zzc = Arrays.copyOf(this.zzc, min);
        }
        this.zza[i2] = (~zzp) & zzb2;
        this.zzb[i2] = k2;
        this.zzc[i2] = v2;
        this.zzg = i3;
        zzd();
        return null;
    }

    @NullableDecl
    public final V remove(@NullableDecl Object obj) {
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.remove(obj);
        }
        V zzs = zzs(obj);
        if (zzs == zzd) {
            return null;
        }
        return zzs;
    }

    public final int size() {
        Map zzc2 = zzc();
        if (zzc2 != null) {
            return zzc2.size();
        }
        return this.zzg;
    }

    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzba zzba = new zzba(this);
        this.zzj = zzba;
        return zzba;
    }

    public final void zza(int i) {
        this.zzf = zzci.zza(12, 1, 1073741823);
    }

    public final boolean zzb() {
        return this.zze == null;
    }

    @NullableDecl
    public final Map<K, V> zzc() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzd() {
        this.zzf += 32;
    }

    public final void zze(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.zzb;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.zzc;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.zza;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int zzb2 = zzbd.zzb(obj) & i2;
            int zzb3 = zzbc.zzb(this.zze, zzb2);
            int i3 = size + 1;
            if (zzb3 != i3) {
                while (true) {
                    int i4 = zzb3 - 1;
                    int[] iArr2 = this.zza;
                    int i5 = iArr2[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        zzb3 = i6;
                    } else {
                        iArr2[i4] = ((i + 1) & i2) | ((~i2) & i5);
                        return;
                    }
                }
            } else {
                zzbc.zzc(this.zze, zzb2, i + 1);
            }
        } else {
            this.zzb[i] = null;
            this.zzc[i] = null;
            this.zza[i] = 0;
        }
    }

    public final int zzf() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzg(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    public zzbb(int i) {
        zza(12);
    }
}
