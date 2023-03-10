package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbix {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhq zze;
    private final zzbiz zzf;

    public zzbix(Context context, ScheduledExecutorService scheduledExecutorService, zzbiz zzbiz, zzfhq zzfhq, byte[] bArr) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbiz;
        this.zze = zzfhq;
    }

    public final zzfvj zza() {
        return (zzfur) zzfva.zzo(zzfur.zzv(zzfva.zzi((Object) null)), ((Long) zzbjn.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
