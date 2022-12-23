package com.google.android.gms.nearby.exposurenotification;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

@SafeParcelable.Class(creator = "PackageConfigurationCreator")
public final class PackageConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PackageConfiguration> CREATOR = new zzn();
    @SafeParcelable.Field(getter = "getValues", mo65739id = 1)
    public Bundle zza;

    public static final class PackageConfigurationBuilder {
        private Bundle zza;

        public PackageConfiguration build() {
            return new PackageConfiguration(this.zza);
        }

        public PackageConfigurationBuilder setValues(Bundle bundle) {
            this.zza = new Bundle(bundle);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PackageConfiguration(@SafeParcelable.Param(mo65742id = 1) Bundle bundle) {
        this.zza = bundle;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PackageConfiguration) {
            return Objects.equal(this.zza, ((PackageConfiguration) obj).getValues());
        }
        return false;
    }

    public Bundle getValues() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public String toString() {
        return String.format(Locale.US, "PackageConfiguration<values: %s>", new Object[]{this.zza});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, getValues(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
