package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0016g;
import p358af.C13437d;

@SafeParcelable.Class(creator = "ScanInstanceCreator")
public final class ScanInstance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScanInstance> CREATOR = new zzo();
    @SafeParcelable.Field(getter = "getTypicalAttenuationDb", mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(getter = "getMinAttenuationDb", mo65739id = 2)
    public int zzb;
    @SafeParcelable.Field(getter = "getSecondsSinceLastScan", mo65739id = 3)
    public int zzc;

    public static class Builder {
        private int zza = 0;
        private int zzb = 0;
        private int zzc = 0;

        public ScanInstance build() {
            return new ScanInstance(this.zza, this.zzb, this.zzc);
        }

        public Builder setMinAttenuationDb(int i) {
            this.zzb = i;
            return this;
        }

        public Builder setSecondsSinceLastScan(int i) {
            this.zzc = i;
            return this;
        }

        public Builder setTypicalAttenuationDb(int i) {
            this.zza = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ScanInstance(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ScanInstance.class == obj.getClass()) {
            ScanInstance scanInstance = (ScanInstance) obj;
            return this.zza == scanInstance.zza && this.zzb == scanInstance.zzb && this.zzc == scanInstance.zzc;
        }
    }

    public int getMinAttenuationDb() {
        return this.zzb;
    }

    public int getSecondsSinceLastScan() {
        return this.zzc;
    }

    public int getTypicalAttenuationDb() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        return C13437d.m33707l(C0016g.m35s("ScanInstance{typicalAttenuationDb=", i, ", minAttenuationDb=", i2, ", secondsSinceLastScan="), this.zzc, "}");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getTypicalAttenuationDb());
        SafeParcelWriter.writeInt(parcel, 2, getMinAttenuationDb());
        SafeParcelWriter.writeInt(parcel, 3, getSecondsSinceLastScan());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
