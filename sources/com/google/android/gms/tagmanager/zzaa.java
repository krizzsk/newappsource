package com.google.android.gms.tagmanager;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tagmanager.ContainerHolder;

@VisibleForTesting
final class zzaa implements ContainerHolder {
    private final Looper zza;
    private Container zzb;
    private Container zzc;
    private final Status zzd;
    private zzz zze;
    private zzy zzf;
    private boolean zzg;
    private TagManager zzh;

    public zzaa(Status status) {
        this.zzd = status;
        this.zza = null;
    }

    public zzaa(TagManager tagManager, Looper looper, Container container, zzy zzy) {
        this.zzh = tagManager;
        this.zza = looper == null ? Looper.getMainLooper() : looper;
        this.zzb = container;
        this.zzf = zzy;
        this.zzd = Status.RESULT_SUCCESS;
        tagManager.zza(this);
    }

    private final void zzf() {
        zzz zzz = this.zze;
        if (zzz != null) {
            zzz.sendMessage(zzz.obtainMessage(1, this.zzc.zzc()));
        }
    }

    public final synchronized Container getContainer() {
        if (this.zzg) {
            zzdh.zza("ContainerHolder is released.");
            return null;
        }
        Container container = this.zzc;
        if (container != null) {
            this.zzb = container;
            this.zzc = null;
        }
        return this.zzb;
    }

    public final Status getStatus() {
        return this.zzd;
    }

    public final synchronized void refresh() {
        if (this.zzg) {
            zzdh.zza("Refreshing a released ContainerHolder.");
        } else {
            this.zzf.zzb();
        }
    }

    public final synchronized void release() {
        if (this.zzg) {
            zzdh.zza("Releasing a released ContainerHolder.");
            return;
        }
        this.zzg = true;
        this.zzh.zzc(this);
        this.zzb.zze();
        this.zzb = null;
        this.zzc = null;
        this.zzf = null;
        this.zze = null;
    }

    public final synchronized void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener containerAvailableListener) {
        if (this.zzg) {
            zzdh.zza("ContainerHolder is released.");
        } else if (containerAvailableListener == null) {
            this.zze = null;
        } else {
            this.zze = new zzz(this, containerAvailableListener, this.zza);
            if (this.zzc != null) {
                zzf();
            }
        }
    }

    public final String zza() {
        if (!this.zzg) {
            return this.zzb.getContainerId();
        }
        zzdh.zza("getContainerId called on a released ContainerHolder.");
        return "";
    }

    public final String zzb() {
        if (!this.zzg) {
            return this.zzf.zza();
        }
        zzdh.zza("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }

    public final synchronized void zzc(Container container) {
        if (!this.zzg) {
            this.zzc = container;
            zzf();
        }
    }

    public final synchronized void zzd(String str) {
        if (!this.zzg) {
            this.zzb.zzd(str);
        }
    }

    public final void zze(String str) {
        if (this.zzg) {
            zzdh.zza("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.zzf.zzc(str);
        }
    }
}
