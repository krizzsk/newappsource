package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

public class zzaw {
    public final Uri zza;
    public final String zzb = null;
    public final zzaq zzc = null;
    public final zzag zzd = null;
    public final List zze;
    public final String zzf;
    public final zzfrh zzg;
    @Deprecated
    public final List zzh;
    public final Object zzi;

    public /* synthetic */ zzaw(Uri uri, String str, zzaq zzaq, zzag zzag, List list, String str2, zzfrh zzfrh, Object obj, zzav zzav) {
        this.zza = uri;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfrh;
        zzfre zzi2 = zzfrh.zzi();
        if (zzfrh.size() <= 0) {
            this.zzh = zzi2.zzg();
            this.zzi = null;
            return;
        }
        zzaz zzaz = (zzaz) zzfrh.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzaw = (zzaw) obj;
        if (!this.zza.equals(zzaw.zza) || !zzeg.zzS((Object) null, (Object) null) || !zzeg.zzS((Object) null, (Object) null) || !zzeg.zzS((Object) null, (Object) null) || !this.zze.equals(zzaw.zze) || !zzeg.zzS((Object) null, (Object) null) || !this.zzg.equals(zzaw.zzg) || !zzeg.zzS((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zze.hashCode();
        return (this.zzg.hashCode() + ((hashCode + (this.zza.hashCode() * 923521)) * 961)) * 31;
    }
}
