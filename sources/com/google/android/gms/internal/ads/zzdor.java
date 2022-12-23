package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;

public final class zzdor {
    private final zzdto zza;
    private final zzdsd zzb;
    private final zzcum zzc;
    private final zzdno zzd;

    public zzdor(zzdto zzdto, zzdsd zzdsd, zzcum zzcum, zzdno zzdno) {
        this.zza = zzdto;
        this.zzb = zzdsd;
        this.zzc = zzcum;
        this.zzd = zzdno;
    }

    public final View zza() throws zzclt {
        zzcli zza2 = this.zza.zza(zzq.zzc(), (zzfbg) null, (zzfbj) null);
        ((View) zza2).setVisibility(8);
        zza2.zzaf("/sendMessageToSdk", new zzdol(this));
        zza2.zzaf("/adMuted", new zzdom(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdon(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdoo(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdop(this));
        return (View) zza2;
    }

    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcli zzcli, Map map) {
        this.zzd.zzf();
    }

    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap u = C0016g.m37u("messageType", "htmlLoaded");
        u.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", u);
    }

    public final /* synthetic */ void zze(zzcli zzcli, Map map) {
        zzcfi.zzi("Showing native ads overlay.");
        zzcli.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcli zzcli, Map map) {
        zzcfi.zzi("Hiding native ads overlay.");
        zzcli.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
