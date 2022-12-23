package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class zzakr extends zzgpd {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0d;
    private float zzl = 1.0f;
    private zzgpn zzm = zzgpn.zza;
    private long zzn;

    public zzakr() {
        super("mvhd");
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MovieHeaderBox[creationTime=");
        k.append(this.zza);
        k.append(";modificationTime=");
        k.append(this.zzh);
        k.append(";timescale=");
        k.append(this.zzi);
        k.append(";duration=");
        k.append(this.zzj);
        k.append(";rate=");
        k.append(this.zzk);
        k.append(";volume=");
        k.append(this.zzl);
        k.append(";matrix=");
        k.append(this.zzm);
        k.append(";nextTrackId=");
        return C25541a.m63884o(k, this.zzn, "]");
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zzf(byteBuffer);
        } else {
            this.zza = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zze(byteBuffer);
        }
        this.zzk = zzakn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((float) ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280))))) / 256.0f;
        zzakn.zzd(byteBuffer);
        zzakn.zze(byteBuffer);
        zzakn.zze(byteBuffer);
        double zzb = zzakn.zzb(byteBuffer);
        double zzb2 = zzakn.zzb(byteBuffer);
        double zza2 = zzakn.zza(byteBuffer);
        this.zzm = new zzgpn(zzb, zzb2, zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer), zza2, zzakn.zza(byteBuffer), zzakn.zza(byteBuffer), zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzakn.zze(byteBuffer);
    }
}
