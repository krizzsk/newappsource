package com.google.android.gms.tagmanager;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zza implements zzc {
    public final /* synthetic */ zzd zza;

    public zza(zzd zzd) {
        this.zza = zzd;
    }

    public final AdvertisingIdClient.Info zza() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.zza.zzi);
        } catch (IllegalStateException e) {
            zzdh.zzd("IllegalStateException getting Advertising Id Info", e);
            return null;
        } catch (GooglePlayServicesRepairableException e2) {
            zzdh.zzd("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
            return null;
        } catch (IOException e3) {
            zzdh.zzd("IOException getting Ad Id Info", e3);
            return null;
        } catch (GooglePlayServicesNotAvailableException e4) {
            this.zza.zze();
            zzdh.zzd("GooglePlayServicesNotAvailableException getting Advertising Id Info", e4);
            return null;
        } catch (Exception e5) {
            zzdh.zzd("Unknown exception. Could not get the Advertising Id Info.", e5);
            return null;
        }
    }
}
