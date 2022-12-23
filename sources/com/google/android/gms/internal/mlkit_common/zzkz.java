package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

final class zzkz extends zzlm {
    private zzid zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private ModelType zze;
    private zzij zzf;
    private int zzg;
    private byte zzh;

    public final zzlm zza(zzij zzij) {
        if (zzij != null) {
            this.zzf = zzij;
            return this;
        }
        throw new NullPointerException("Null downloadStatus");
    }

    public final zzlm zzb(zzid zzid) {
        if (zzid != null) {
            this.zza = zzid;
            return this;
        }
        throw new NullPointerException("Null errorCode");
    }

    public final zzlm zzc(int i) {
        this.zzg = i;
        this.zzh = (byte) (this.zzh | 4);
        return this;
    }

    public final zzlm zzd(ModelType modelType) {
        if (modelType != null) {
            this.zze = modelType;
            return this;
        }
        throw new NullPointerException("Null modelType");
    }

    public final zzlm zze(boolean z) {
        this.zzd = z;
        this.zzh = (byte) (this.zzh | 2);
        return this;
    }

    public final zzlm zzf(boolean z) {
        this.zzc = z;
        this.zzh = (byte) (this.zzh | 1);
        return this;
    }

    public final zzlm zzg(String str) {
        this.zzb = "NA";
        return this;
    }

    public final zzln zzh() {
        zzid zzid;
        String str;
        ModelType modelType;
        zzij zzij;
        if (this.zzh == 7 && (zzid = this.zza) != null && (str = this.zzb) != null && (modelType = this.zze) != null && (zzij = this.zzf) != null) {
            return new zzlb(zzid, str, this.zzc, this.zzd, modelType, zzij, this.zzg, (zzla) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" errorCode");
        }
        if (this.zzb == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if ((this.zzh & 1) == 0) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if ((this.zzh & 2) == 0) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.zze == null) {
            sb.append(" modelType");
        }
        if (this.zzf == null) {
            sb.append(" downloadStatus");
        }
        if ((this.zzh & 4) == 0) {
            sb.append(" failureStatusCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
