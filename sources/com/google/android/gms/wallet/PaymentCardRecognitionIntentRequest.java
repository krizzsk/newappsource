package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentRequestCreator")
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new zzy();
    @SafeParcelable.Field(mo65739id = 1)
    public int zza;

    public final class Builder {
        public /* synthetic */ Builder(zzx zzx) {
        }

        public PaymentCardRecognitionIntentRequest build() {
            Preconditions.checkArgument(PaymentCardRecognitionIntentRequest.this.zza != 0, "The paymentCardRecognitionType is required when creating a PaymentCardRecognitionIntentRequest.");
            return PaymentCardRecognitionIntentRequest.this;
        }
    }

    public PaymentCardRecognitionIntentRequest() {
    }

    public static Builder builder() {
        return new Builder((zzx) null);
    }

    public static PaymentCardRecognitionIntentRequest getDefaultInstance() {
        Builder builder = new Builder((zzx) null);
        PaymentCardRecognitionIntentRequest.this.zza = 1;
        return builder.build();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionIntentRequest(@SafeParcelable.Param(mo65742id = 1) int i) {
        this.zza = i;
    }
}
