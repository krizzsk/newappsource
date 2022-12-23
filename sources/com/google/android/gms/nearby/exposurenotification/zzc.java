package com.google.android.gms.nearby.exposurenotification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.nearby.exposurenotification.DailySummary;
import java.util.ArrayList;

public final class zzc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList<DailySummary.ExposureSummaryData> arrayList = null;
        DailySummary.ExposureSummaryData exposureSummaryData = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, DailySummary.ExposureSummaryData.CREATOR);
            } else if (fieldId == 3) {
                exposureSummaryData = (DailySummary.ExposureSummaryData) SafeParcelReader.createParcelable(parcel, readHeader, DailySummary.ExposureSummaryData.CREATOR);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new DailySummary(i, arrayList, exposureSummaryData, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DailySummary[i];
    }
}
