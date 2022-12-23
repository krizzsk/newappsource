package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.appsflyer.internal.referrer.Payload;

public final class zzws extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzwq zzd;
    private boolean zze;

    public /* synthetic */ zzws(zzwq zzwq, SurfaceTexture surfaceTexture, boolean z, zzwr zzwr) {
        super(surfaceTexture);
        this.zzd = zzwq;
        this.zza = z;
    }

    public static zzws zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        zzwq zzwq = new zzwq();
        if (z) {
            i = zzb;
        }
        return zzwq.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzws.class) {
            if (!zzc) {
                int i2 = zzeg.zza;
                int i3 = 2;
                if (i2 >= 24) {
                    if (i2 < 26) {
                        if (!Payload.SOURCE_SAMSUNG.equals(zzeg.zzc)) {
                            if ("XT1650".equals(zzeg.zzd)) {
                            }
                        }
                    }
                    if (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                            if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                i3 = 1;
                            }
                            zzb = i3;
                            zzc = true;
                        }
                    }
                }
                i3 = 0;
                zzb = i3;
                zzc = true;
            }
            i = zzb;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
