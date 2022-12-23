package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        byte[] bArr = null;
        int[] iArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        Strategy strategy = null;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z11 = true;
        boolean z12 = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 2:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 3:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 4:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 5:
                    z5 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 6:
                    z6 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 7:
                    z7 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 8:
                    z8 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 9:
                    bArr = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 10:
                    z9 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 11:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 12:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 13:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 14:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 15:
                    iArr = SafeParcelReader.createIntArray(parcel2, readHeader);
                    break;
                case 16:
                    iArr2 = SafeParcelReader.createIntArray(parcel2, readHeader);
                    break;
                case 17:
                    bArr2 = SafeParcelReader.createByteArray(parcel2, readHeader);
                    break;
                case 18:
                    strategy = (Strategy) SafeParcelReader.createParcelable(parcel2, readHeader, Strategy.CREATOR);
                    break;
                case 19:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new ConnectionOptions(z, z2, z3, z4, z5, z6, z7, z8, bArr, z9, z11, z12, i, i2, iArr, iArr2, bArr2, strategy, i3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionOptions[i];
    }
}
