package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

public final class zzep extends zzek {
    private zzew zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzep() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(zzeg.zzG(this.zzb), this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzew zzew) throws IOException {
        zzi(zzew);
        this.zza = zzew;
        Uri uri = zzew.zza;
        String scheme = uri.getScheme();
        zzcw.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzaf = zzeg.zzaf(uri.getSchemeSpecificPart(), AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        if (zzaf.length == 2) {
            String str = zzaf[1];
            if (zzaf[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzbp.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.zzb = zzeg.zzZ(URLDecoder.decode(str, zzfog.zza.name()));
            }
            long j = zzew.zzf;
            int length = this.zzb.length;
            if (j <= ((long) length)) {
                int i = (int) j;
                this.zzc = i;
                int i2 = length - i;
                this.zzd = i2;
                long j2 = zzew.zzg;
                if (j2 != -1) {
                    this.zzd = (int) Math.min((long) i2, j2);
                }
                zzj(zzew);
                long j3 = zzew.zzg;
                if (j3 != -1) {
                    return j3;
                }
                return (long) this.zzd;
            }
            this.zzb = null;
            throw new zzes(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzbp.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), (Throwable) null);
    }

    public final Uri zzc() {
        zzew zzew = this.zza;
        if (zzew != null) {
            return zzew.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
