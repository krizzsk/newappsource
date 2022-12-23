package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzchv implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzchu zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzchv(Context context, zzchu zzchu) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzchu;
    }

    private final void zzf() {
        boolean z = false;
        if (!this.zzd || this.zze || this.zzf <= BitmapDescriptorFactory.HUE_RED) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.abandonAudioFocus(this) == 0) {
                        z = true;
                    }
                    this.zzc = z;
                }
                this.zzb.zzn();
            }
        } else if (!this.zzc) {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.zzc = z;
            }
            this.zzb.zzn();
        }
    }

    public final void onAudioFocusChange(int i) {
        this.zzc = i > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        return this.zzc ? this.zze ? BitmapDescriptorFactory.HUE_RED : this.zzf : BitmapDescriptorFactory.HUE_RED;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z) {
        this.zze = z;
        zzf();
    }

    public final void zze(float f) {
        this.zzf = f;
        zzf();
    }
}
