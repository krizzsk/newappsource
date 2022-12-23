package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class zzfrn {
    public static boolean zza(Iterable iterable, zzfot zzfot) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            zzfot.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (zzfot.zza(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        zzfot.getClass();
        return zzc((List) iterable, zzfot);
    }

    private static void zzb(List list, zzfot zzfot, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfot.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzc(List list, zzfot zzfot) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfot.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        zzb(list, zzfot, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        zzb(list, zzfot, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }
}
