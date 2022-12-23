package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzo();
    @SafeParcelable.Field(mo65739id = 2)
    public String zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public TimeInterval zzc;
    @SafeParcelable.Field(mo65739id = 5)
    @Deprecated
    public UriData zzd;
    @SafeParcelable.Field(mo65739id = 6)
    @Deprecated
    public UriData zze;

    public final class Builder {
        public /* synthetic */ Builder(zzn zzn) {
        }

        public WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @Deprecated
        public Builder setActionUri(UriData uriData) {
            WalletObjectMessage.this.zzd = uriData;
            return this;
        }

        public Builder setBody(String str) {
            WalletObjectMessage.this.zzb = str;
            return this;
        }

        public Builder setDisplayInterval(TimeInterval timeInterval) {
            WalletObjectMessage.this.zzc = timeInterval;
            return this;
        }

        public Builder setHeader(String str) {
            WalletObjectMessage.this.zza = str;
            return this;
        }

        @Deprecated
        public Builder setImageUri(UriData uriData) {
            WalletObjectMessage.this.zze = uriData;
            return this;
        }
    }

    public WalletObjectMessage() {
    }

    public static Builder newBuilder() {
        return new Builder((zzn) null);
    }

    @Deprecated
    public UriData getActionUri() {
        return this.zzd;
    }

    public String getBody() {
        return this.zzb;
    }

    public TimeInterval getDisplayInterval() {
        return this.zzc;
    }

    public String getHeader() {
        return this.zza;
    }

    @Deprecated
    public UriData getImageUri() {
        return this.zze;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) TimeInterval timeInterval, @SafeParcelable.Param(mo65742id = 5) UriData uriData, @SafeParcelable.Param(mo65742id = 6) UriData uriData2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = timeInterval;
        this.zzd = uriData;
        this.zze = uriData2;
    }
}
