package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SafeParcelable.Class(creator = "ContextFenceStubCreator")
@SafeParcelable.Reserved({1})
public final class zzbj extends AwarenessFence {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();
    @SafeParcelable.Field(getter = "getContextFenceProtoAsBytes", mo65739id = 2, type = "byte[]")
    private zzeg zza;
    private byte[] zzb;

    public zzbj(zzeg zzeg) {
        this.zza = (zzeg) Preconditions.checkNotNull(zzeg);
        this.zzb = null;
        zzl();
    }

    public static zzbj zza(zzaz zzaz) {
        Preconditions.checkNotNull(zzaz);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.ACTIVITY_FENCE);
        zza2.zzc(zzaz.zzb());
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zzb(zzba zzba) {
        Preconditions.checkNotNull(zzba);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.AUDIO_STATE_FENCE);
        zza2.zzd(zzba.zzd());
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zzc(zzbe zzbe) {
        Preconditions.checkNotNull(zzbe);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.BEACON_FENCE);
        zza2.zze(zzbe.zzd());
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zzd(zzbx zzbx) {
        Preconditions.checkNotNull(zzbx);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.LOCATION_FENCE);
        zza2.zzg(zzbx.zzd());
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zze(zzbz zzbz) {
        Preconditions.checkNotNull(zzbz);
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.SUN_STATE_FENCE);
        zza2.zzh(zzbz.zzc());
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zzf(zzca zzca) {
        zzec zzec;
        Preconditions.checkNotNull(zzca);
        if (zzca.zzd().zzi()) {
            zzec = zzeg.zza();
            zzec.zzk(zzef.LOCAL_TIME_FENCE);
            zzec.zzf(zzca.zzd());
        } else {
            zzec = zzeg.zza();
            zzec.zzk(zzef.TIME_FENCE);
            zzec.zzi(zzca.zzd());
        }
        return new zzbj((zzeg) zzec.zzs());
    }

    public static zzbj zzg(Collection<zzbj> collection) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkArgument(!collection.isEmpty());
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.AND);
        zza2.zza(zzj(collection));
        return new zzbj((zzeg) zza2.zzs());
    }

    public static zzbj zzh(Collection<zzbj> collection) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkArgument(!collection.isEmpty());
        zzec zza2 = zzeg.zza();
        zza2.zzk(zzef.OR);
        zza2.zza(zzj(collection));
        return new zzbj((zzeg) zza2.zzs());
    }

    private static List<zzeg> zzj(Collection<zzbj> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (zzbj zzi : collection) {
            arrayList.add(zzi.zzi());
        }
        return arrayList;
    }

    private final void zzk() {
        if (this.zza == null) {
            try {
                this.zza = zzeg.zzc((byte[]) Preconditions.checkNotNull(this.zzb), zzlp.zzb());
                this.zzb = null;
            } catch (zzmp e) {
                zzj.zzb("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        zzl();
    }

    private final void zzl() {
        zzeg zzeg = this.zza;
        if (zzeg == null && this.zzb != null) {
            return;
        }
        if (zzeg != null && this.zzb == null) {
            return;
        }
        if (zzeg != null && this.zzb != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (zzeg == null && this.zzb == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final String toString() {
        zzk();
        return ((zzeg) Preconditions.checkNotNull(this.zza)).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] bArr = this.zzb;
        if (bArr == null) {
            bArr = ((zzeg) Preconditions.checkNotNull(this.zza)).zzt();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzeg zzi() {
        zzk();
        return (zzeg) Preconditions.checkNotNull(this.zza);
    }

    @SafeParcelable.Constructor
    public zzbj(@SafeParcelable.Param(mo65742id = 2) byte[] bArr) {
        this.zza = null;
        this.zzb = bArr;
        zzl();
    }
}
