package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzim;
import com.google.android.gms.internal.measurement.zzin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p358af.C13437d;

public abstract class zzin<MessageType extends zzin<MessageType, BuilderType>, BuilderType extends zzim<MessageType, BuilderType>> implements zzll {
    public int zzb = 0;

    public static void zzbt(Iterable iterable, List list) {
        zzkm.zze(iterable);
        if (iterable instanceof zzkt) {
            List zzh = ((zzkt) iterable).zzh();
            zzkt zzkt = (zzkt) list;
            int size = list.size();
            for (Object next : zzh) {
                if (next == null) {
                    int size2 = zzkt.size();
                    StringBuilder k = C13555b.m33972k("Element at index ");
                    k.append(size2 - size);
                    k.append(" is null.");
                    String sb = k.toString();
                    int size3 = zzkt.size();
                    while (true) {
                        size3--;
                        if (size3 >= size) {
                            zzkt.remove(size3);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else if (next instanceof zzjd) {
                    zzkt.zzi((zzjd) next);
                } else {
                    zzkt.add((String) next);
                }
            }
        } else if (!(iterable instanceof zzls)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    int size5 = list.size();
                    StringBuilder k2 = C13555b.m33972k("Element at index ");
                    k2.append(size5 - size4);
                    k2.append(" is null.");
                    String sb2 = k2.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 >= size4) {
                            list.remove(size6);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else {
                    list.add(next2);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    public int zzbr() {
        throw null;
    }

    public final zzjd zzbs() {
        try {
            int zzbw = zzbw();
            zzjd zzjd = zzjd.zzb;
            byte[] bArr = new byte[zzbw];
            zzjl zzC = zzjl.zzC(bArr);
            zzbK(zzC);
            zzC.zzD();
            return new zzja(bArr);
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public void zzbu(int i) {
        throw null;
    }

    public final byte[] zzbv() {
        try {
            byte[] bArr = new byte[zzbw()];
            zzjl zzC = zzjl.zzC(bArr);
            zzbK(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(C13437d.m33706k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
