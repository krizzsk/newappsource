package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzng;
import com.google.android.gms.internal.nearby.zznh;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import p001a0.C0017h;
import p241s0.C6304d;

@SafeParcelable.Class(creator = "UpdateCreator")
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new zzci();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final Message zzc;
    @SafeParcelable.Field(mo65739id = 4)
    public final zze zzd;
    @SafeParcelable.Field(mo65739id = 5)
    public final zza zze;
    @SafeParcelable.Field(mo65739id = 6)
    public final zznh zzf;
    @SafeParcelable.Field(mo65739id = 7)
    public final byte[] zzg;

    @SafeParcelable.Constructor
    public Update(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) Message message, @SafeParcelable.Param(mo65742id = 4) zze zze2, @SafeParcelable.Param(mo65742id = 5) zza zza2, @SafeParcelable.Param(mo65742id = 6) zznh zznh, @SafeParcelable.Param(mo65742id = 7) byte[] bArr) {
        this.zza = i;
        boolean zzb2 = zzb(i2, 2);
        bArr = true == zzb2 ? null : bArr;
        zznh = true == zzb2 ? null : zznh;
        zza2 = true == zzb2 ? null : zza2;
        zze2 = true == zzb2 ? null : zze2;
        this.zzb = true == zzb2 ? 2 : i2;
        this.zzc = message;
        this.zzd = zze2;
        this.zze = zza2;
        this.zzf = zznh;
        this.zzg = bArr;
    }

    public static boolean zzb(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        if (this.zzb != update.zzb || !Objects.equal(this.zzc, update.zzc) || !Objects.equal(this.zzd, update.zzd) || !Objects.equal(this.zze, update.zze) || !Objects.equal(this.zzf, update.zzf) || !Arrays.equals(this.zzg, update.zzg)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
    }

    public final String toString() {
        C6304d dVar = new C6304d();
        if (zzb(this.zzb, 1)) {
            dVar.add("FOUND");
        }
        if (zzb(this.zzb, 2)) {
            dVar.add("LOST");
        }
        if (zzb(this.zzb, 4)) {
            dVar.add("DISTANCE");
        }
        if (zzb(this.zzb, 8)) {
            dVar.add("BLE_SIGNAL");
        }
        if (zzb(this.zzb, 16)) {
            dVar.add("DEVICE");
        }
        if (zzb(this.zzb, 32)) {
            dVar.add("BLE_RECORD");
        }
        String dVar2 = dVar.toString();
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        String valueOf3 = String.valueOf(this.zze);
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(zzng.zza(this.zzg));
        StringBuilder h = C16759e.m42352h("Update{types=", dVar2, ", message=", valueOf, ", distance=");
        C0017h.m61R(h, valueOf2, ", bleSignal=", valueOf3, ", device=");
        return C13715c.m34246l(h, valueOf4, ", bleRecord=", valueOf5, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final boolean zza(int i) {
        return zzb(this.zzb, i);
    }
}
