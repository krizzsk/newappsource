package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.ImageDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.ParcelableUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asset implements Parcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new Parcelable.Creator<Asset>() {
        public Asset createFromParcel(Parcel parcel) {
            return new Asset(parcel);
        }

        public Asset[] newArray(int i) {
            return new Asset[i];
        }
    };
    private byte[] mData;
    private final String mFillMode;
    private final double mScale;
    private final Uri mUrl;

    public Asset(byte[] bArr, double d) {
        this.mData = bArr;
        this.mScale = d;
        this.mFillMode = null;
        this.mUrl = null;
    }

    public static Asset fromDTO(ImageDTO imageDTO) {
        if (imageDTO == null) {
            return null;
        }
        return new Asset(imageDTO.mUrl, imageDTO.mScale, imageDTO.mFillMode);
    }

    public static List<Asset> fromDTOs(List<ImageDTO> list) {
        ArrayList arrayList = new ArrayList();
        for (ImageDTO fromDTO : list) {
            arrayList.add(fromDTO(fromDTO));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Asset asset = (Asset) obj;
        if (Double.compare(asset.mScale, this.mScale) != 0) {
            return false;
        }
        String str = this.mFillMode;
        if (str == null ? asset.mFillMode != null : !str.equals(asset.mFillMode)) {
            return false;
        }
        if (!Arrays.equals(this.mData, asset.mData)) {
            return false;
        }
        Uri uri = this.mUrl;
        Uri uri2 = asset.mUrl;
        if (uri != null) {
            return uri.equals(uri2);
        }
        if (uri2 == null) {
            return true;
        }
        return false;
    }

    public byte[] getData() {
        return this.mData;
    }

    public String getFillMode() {
        return this.mFillMode;
    }

    public double getScale() {
        return this.mScale;
    }

    public Uri getUrl() {
        return this.mUrl;
    }

    public int hashCode() {
        int i;
        long doubleToLongBits = Double.doubleToLongBits(this.mScale);
        int i2 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        String str = this.mFillMode;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = (Arrays.hashCode(this.mData) + ((i2 + i) * 31)) * 31;
        Uri uri = this.mUrl;
        if (uri != null) {
            i3 = uri.hashCode();
        }
        return hashCode + i3;
    }

    public boolean isEmpty() {
        byte[] bArr = this.mData;
        return bArr == null || bArr.length == 0;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Asset{mData=");
        k.append(ButtonUtil.imageSizeString(this.mData));
        k.append(", mScale=");
        k.append(this.mScale);
        k.append(", mFillMode=");
        k.append(this.mFillMode);
        k.append(", mUrl=");
        k.append(this.mUrl);
        k.append('}');
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mScale);
        parcel.writeString(this.mFillMode);
        ParcelableUtils.writeByteArray(parcel, this.mData);
        parcel.writeParcelable(this.mUrl, i);
    }

    public Asset(Parcel parcel) {
        this.mScale = parcel.readDouble();
        this.mFillMode = parcel.readString();
        this.mData = ParcelableUtils.getNextByteArray(parcel);
        this.mUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public Asset(Uri uri, double d, String str) {
        this.mUrl = uri;
        this.mScale = d;
        this.mFillMode = str;
    }
}
