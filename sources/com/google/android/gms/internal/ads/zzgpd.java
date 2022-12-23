package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class zzgpd extends zzgpb {
    private int zza;

    public zzgpd(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzakn.zzc(byteBuffer.get());
        zzakn.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
