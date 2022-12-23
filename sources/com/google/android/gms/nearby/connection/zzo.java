package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Strategy strategy = null;
        ParcelUuid parcelUuid = null;
        byte[] bArr = null;
        int[] iArr = null;
        long j = 0;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = false;
        int i = 0;
        int i2 = 0;
        boolean z9 = true;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel2, readHeader, Strategy.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 3:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 4:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 6:
                    parcelUuid = (ParcelUuid) SafeParcelReader.createParcelable(parcel2, readHeader, ParcelUuid.CREATOR);
                    break;
                case 8:
                    z5 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 9:
                    z6 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 10:
                    z7 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    z8 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 12:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 14:
                    bArr = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 15:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 16:
                    iArr = SafeParcelReader.createIntArray(parcel2, readHeader);
                    break;
                case 17:
                    z9 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new DiscoveryOptions(strategy, z, z2, z3, z4, parcelUuid, z5, z6, z7, z8, i, i2, bArr, j, iArr, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryOptions[i];
    }
}
