package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.appboy.Constants;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
final class zzflb implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting
    public final zzflz zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfks zzf;
    private final long zzg = System.currentTimeMillis();
    private final int zzh;

    public zzflb(Context context, int i, int i2, String str, String str2, String str3, zzfks zzfks) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfks;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzflz zzflz = new zzflz(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzflz;
        this.zzd = new LinkedBlockingQueue();
        zzflz.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzfml zza() {
        return new zzfml((byte[]) null, 1);
    }

    private final void zze(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    public final void onConnected(Bundle bundle) {
        zzfme zzd2 = zzd();
        if (zzd2 != null) {
            try {
                zzfml zzf2 = zzd2.zzf(new zzfmj(1, this.zzh, this.zzb, this.zzc));
                zze(5011, this.zzg, (Exception) null);
                this.zzd.put(zzf2);
            } catch (Throwable th) {
                zzc();
                this.zze.quit();
                throw th;
            }
            zzc();
            this.zze.quit();
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zze(4012, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final void onConnectionSuspended(int i) {
        try {
            zze(4011, this.zzg, (Exception) null);
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzfml zzb(int i) {
        zzfml zzfml;
        try {
            zzfml = (zzfml) this.zzd.poll(Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zze(AdError.INTERSTITIAL_AD_TIMEOUT, this.zzg, e);
            zzfml = null;
        }
        zze(AuthApiStatusCodes.AUTH_TOKEN_ERROR, this.zzg, (Exception) null);
        if (zzfml != null) {
            if (zzfml.zzc == 7) {
                zzfks.zzg(3);
            } else {
                zzfks.zzg(2);
            }
        }
        if (zzfml == null) {
            return zza();
        }
        return zzfml;
    }

    public final void zzc() {
        zzflz zzflz = this.zza;
        if (zzflz == null) {
            return;
        }
        if (zzflz.isConnected() || this.zza.isConnecting()) {
            this.zza.disconnect();
        }
    }

    public final zzfme zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
