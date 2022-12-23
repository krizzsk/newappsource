package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzg implements Parcelable.Creator<zzf> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzn[] zznArr = null;
        zzd[] zzdArr = null;
        int i = 0;
        int i2 = 0;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        float f9 = BitmapDescriptorFactory.HUE_RED;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = -1.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 3:
                    f = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 4:
                    f2 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 5:
                    f3 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 6:
                    f4 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 7:
                    f5 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 8:
                    f6 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 9:
                    zznArr = (zzn[]) SafeParcelReader.createTypedArray(parcel2, readHeader, zzn.CREATOR);
                    break;
                case 10:
                    f8 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 11:
                    f9 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 12:
                    f11 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 13:
                    zzdArr = (zzd[]) SafeParcelReader.createTypedArray(parcel2, readHeader, zzd.CREATOR);
                    break;
                case 14:
                    f7 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 15:
                    f12 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzf(i, i2, f, f2, f3, f4, f5, f6, f7, zznArr, f8, f9, f11, zzdArr, f12);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzf[i];
    }
}
