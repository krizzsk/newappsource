package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

public final class zzes implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        IBinder iBinder = null;
        DiagnosisKeysDataMapping diagnosisKeysDataMapping = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                diagnosisKeysDataMapping = (DiagnosisKeysDataMapping) SafeParcelReader.createParcelable(parcel, readHeader, DiagnosisKeysDataMapping.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzer(iBinder, diagnosisKeysDataMapping);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzer[i];
    }
}
