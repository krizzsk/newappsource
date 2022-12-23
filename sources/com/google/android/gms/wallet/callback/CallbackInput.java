package com.google.android.gms.wallet.callback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "CallbackInputCreator")
public class CallbackInput extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CallbackInput> CREATOR = new zzh();
    @SafeParcelable.Field(mo65739id = 1)
    public int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public byte[] zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzg) {
        }

        public CallbackInput build() {
            return CallbackInput.this;
        }

        public Builder setCallbackType(int i) {
            CallbackInput.this.zza = i;
            return this;
        }

        public Builder setRequestBytes(byte[] bArr) {
            CallbackInput.this.zzb = bArr;
            return this;
        }
    }

    private CallbackInput() {
    }

    public static Builder newBuilder() {
        return new Builder((zzg) null);
    }

    public <T extends AbstractSafeParcelable> T deserializeRequest(Parcelable.Creator<T> creator) {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return (AbstractSafeParcelable) SafeParcelableSerializer.deserializeFromBytes(bArr, creator);
    }

    public int getCallbackType() {
        return this.zza;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CallbackInput(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }
}
