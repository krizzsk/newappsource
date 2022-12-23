package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;

@ShowFirstParty
@SafeParcelable.Class(creator = "ContextDataCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new zzax();
    @SafeParcelable.Field(getter = "getContextProtoAsBytes", mo65739id = 2, type = "byte[]")
    private zzdu zza = null;
    private byte[] zzb;

    @SafeParcelable.Constructor
    public zzaw(@SafeParcelable.Param(mo65742id = 2) byte[] bArr) {
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr);
    }

    private final void zzb() {
        byte[] bArr;
        if (this.zza == null && (bArr = this.zzb) != null) {
            try {
                this.zza = zzdu.zzb(bArr, zzlp.zzb());
                this.zzb = null;
            } catch (zzmp e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzaw = (zzaw) obj;
        zzb();
        zzaw.zzb();
        if (!zza().equals(zzaw.zza()) || ((zzdu) Preconditions.checkNotNull(this.zza)).zzc().zza() != ((zzdu) Preconditions.checkNotNull(zzaw.zza)).zzc().zza()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzb();
        return Objects.hashCode(zza(), Integer.valueOf(((zzdu) Preconditions.checkNotNull(this.zza)).zzc().zza()));
    }

    public final String toString() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        byte[] bArr = this.zzb;
        if (bArr == null) {
            bArr = ((zzdu) Preconditions.checkNotNull(this.zza)).zzt();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        zzb();
        return ((zzdu) Preconditions.checkNotNull(this.zza)).zzd();
    }
}
