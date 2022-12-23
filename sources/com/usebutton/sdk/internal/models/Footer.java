package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.FooterDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.models.Link;

public class Footer extends TextElement {
    public static final Parcelable.Creator<Footer> CREATOR = new Parcelable.Creator<Footer>() {
        public Footer createFromParcel(Parcel parcel) {
            return new Footer(parcel);
        }

        public Footer[] newArray(int i) {
            return new Footer[i];
        }
    };
    private final Asset mAsset;

    public Footer(int i, Link link, Asset asset, Text text) {
        super(i, link, text);
        this.mAsset = asset;
    }

    public static Footer fromDTO(FooterDTO footerDTO) {
        if (footerDTO == null) {
            return null;
        }
        return new Footer(ButtonUtil.safeColorValue(footerDTO.mBackgroundColor), Link.fromDTO(footerDTO.mAction), Asset.fromDTO(footerDTO.mIcon), Text.fromDTO(footerDTO.mLabel));
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
        Asset asset = this.mAsset;
        Asset asset2 = ((Footer) obj).mAsset;
        if (asset != null) {
            return asset.equals(asset2);
        }
        if (asset2 == null) {
            return true;
        }
        return false;
    }

    public Asset getIcon() {
        return this.mAsset;
    }

    public Uri getIconUri() {
        Asset asset = this.mAsset;
        if (asset != null) {
            return asset.getUrl();
        }
        return null;
    }

    public int hashCode() {
        Asset asset = this.mAsset;
        if (asset != null) {
            return asset.hashCode();
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mAsset, i);
    }

    public Footer(Parcel parcel) {
        super(parcel);
        this.mAsset = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
    }
}
