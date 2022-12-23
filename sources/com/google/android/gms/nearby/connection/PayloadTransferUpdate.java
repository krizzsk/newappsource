package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.Class(creator = "PayloadTransferUpdateCreator")
@SafeParcelable.Reserved({1000})
public final class PayloadTransferUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PayloadTransferUpdate> CREATOR = new zzq();
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getPayloadId", mo65739id = 1)
    public long zza;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getStatus", mo65739id = 2)
    public int zzb;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getTotalBytes", mo65739id = 3)
    public long zzc;
    /* access modifiers changed from: private */
    @SafeParcelable.Field(getter = "getBytesTransferred", mo65739id = 4)
    public long zzd;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {
        private final PayloadTransferUpdate zza;

        public Builder() {
            this.zza = new PayloadTransferUpdate((zzp) null);
        }

        public PayloadTransferUpdate build() {
            return this.zza;
        }

        public Builder setBytesTransferred(long j) {
            this.zza.zzd = j;
            return this;
        }

        public Builder setPayloadId(long j) {
            this.zza.zza = j;
            return this;
        }

        public Builder setStatus(int i) {
            this.zza.zzb = i;
            return this;
        }

        public Builder setTotalBytes(long j) {
            this.zza.zzc = j;
            return this;
        }

        public Builder(PayloadTransferUpdate payloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate2 = new PayloadTransferUpdate((zzp) null);
            this.zza = payloadTransferUpdate2;
            payloadTransferUpdate2.zza = payloadTransferUpdate.zza;
            payloadTransferUpdate2.zzb = payloadTransferUpdate.zzb;
            payloadTransferUpdate2.zzc = payloadTransferUpdate.zzc;
            payloadTransferUpdate2.zzd = payloadTransferUpdate.zzd;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
        public static final int CANCELED = 4;
        public static final int FAILURE = 2;
        public static final int IN_PROGRESS = 3;
        public static final int SUCCESS = 1;
    }

    private PayloadTransferUpdate() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PayloadTransferUpdate) {
            PayloadTransferUpdate payloadTransferUpdate = (PayloadTransferUpdate) obj;
            if (!Objects.equal(Long.valueOf(this.zza), Long.valueOf(payloadTransferUpdate.zza)) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(payloadTransferUpdate.zzb)) || !Objects.equal(Long.valueOf(this.zzc), Long.valueOf(payloadTransferUpdate.zzc)) || !Objects.equal(Long.valueOf(this.zzd), Long.valueOf(payloadTransferUpdate.zzd))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public long getBytesTransferred() {
        return this.zzd;
    }

    public long getPayloadId() {
        return this.zza;
    }

    public int getStatus() {
        return this.zzb;
    }

    public long getTotalBytes() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Long.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getPayloadId());
        SafeParcelWriter.writeInt(parcel, 2, getStatus());
        SafeParcelWriter.writeLong(parcel, 3, getTotalBytes());
        SafeParcelWriter.writeLong(parcel, 4, getBytesTransferred());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PayloadTransferUpdate(@SafeParcelable.Param(mo65742id = 1) long j, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) long j2, @SafeParcelable.Param(mo65742id = 4) long j3) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = j3;
    }

    public /* synthetic */ PayloadTransferUpdate(zzp zzp) {
    }
}
