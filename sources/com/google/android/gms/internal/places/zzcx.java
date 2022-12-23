package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;

final class zzcx implements zzci {
    private final int flags;
    private final String info;
    private final Object[] zzkt;
    private final zzck zzkw;

    public zzcx(zzck zzck, String str, Object[] objArr) {
        this.zzkw = zzck;
        this.info = str;
        this.zzkt = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.flags = c | (charAt2 << i);
                return;
            }
        }
    }

    public final int zzcj() {
        return (this.flags & 1) == 1 ? zzbc.zze.zzit : zzbc.zze.zziu;
    }

    public final boolean zzck() {
        return (this.flags & 2) == 2;
    }

    public final zzck zzcl() {
        return this.zzkw;
    }

    public final String zzcr() {
        return this.info;
    }

    public final Object[] zzcs() {
        return this.zzkt;
    }
}
