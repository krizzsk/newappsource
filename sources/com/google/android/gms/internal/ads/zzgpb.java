package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class zzgpb implements zzako {
    private static final zzgpm zza = zzgpm.zzb(zzgpb.class);
    public final String zzb;
    public boolean zzc;
    public boolean zzd;
    public long zze;
    public long zzf = -1;
    public zzgpg zzg;
    private zzakp zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    public zzgpb(String str) {
        this.zzb = str;
        this.zzd = true;
        this.zzc = true;
    }

    private final synchronized void zzd() {
        String str;
        if (!this.zzd) {
            try {
                zzgpm zzgpm = zza;
                String str2 = this.zzb;
                if (str2.length() != 0) {
                    str = "mem mapping ".concat(str2);
                } else {
                    str = new String("mem mapping ");
                }
                zzgpm.zza(str);
                this.zzi = this.zzg.zzd(this.zze, this.zzf);
                this.zzd = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzgpg zzgpg, ByteBuffer byteBuffer, long j, zzakl zzakl) throws IOException {
        this.zze = zzgpg.zzb();
        byteBuffer.remaining();
        this.zzf = j;
        this.zzg = zzgpg;
        zzgpg.zze(zzgpg.zzb() + j);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    public final void zzc(zzakp zzakp) {
        this.zzh = zzakp;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzgpm zzgpm = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgpm.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}
