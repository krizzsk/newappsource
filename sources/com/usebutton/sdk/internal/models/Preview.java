package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.PreviewDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.models.Link;

public class Preview implements Parcelable {
    public static final Parcelable.Creator<Preview> CREATOR = new Parcelable.Creator<Preview>() {
        public Preview createFromParcel(Parcel parcel) {
            return new Preview(parcel);
        }

        public Preview[] newArray(int i) {
            return new Preview[i];
        }
    };
    private final Asset mAsset;
    private final int mBackgroundColor;
    private final Link mDeepLinks;
    private final Text mText;
    private final Text mTitle;

    public Preview(int i, Link link, Asset asset, Text text, Text text2) {
        this.mBackgroundColor = i;
        this.mDeepLinks = link;
        this.mAsset = asset;
        this.mText = text;
        this.mTitle = text2;
    }

    public static Preview fromDTO(PreviewDTO previewDTO) {
        if (previewDTO == null) {
            return null;
        }
        return new Preview(ButtonUtil.safeColorValue(previewDTO.mBackgroundColor), Link.fromDTO(previewDTO.mDeepLink), Asset.fromDTO(previewDTO.mIcon), Text.fromDTO(previewDTO.mLabel), Text.fromDTO(previewDTO.mTitle));
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
        Preview preview = (Preview) obj;
        if (this.mBackgroundColor != preview.mBackgroundColor) {
            return false;
        }
        Link link = this.mDeepLinks;
        if (link == null ? preview.mDeepLinks != null : !link.equals(preview.mDeepLinks)) {
            return false;
        }
        Asset asset = this.mAsset;
        if (asset == null ? preview.mAsset != null : !asset.equals(preview.mAsset)) {
            return false;
        }
        Text text = this.mText;
        if (text == null ? preview.mText != null : !text.equals(preview.mText)) {
            return false;
        }
        Text text2 = this.mTitle;
        Text text3 = preview.mTitle;
        if (text2 != null) {
            return text2.equals(text3);
        }
        if (text3 == null) {
            return true;
        }
        return false;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public Link getDeepLinks() {
        return this.mDeepLinks;
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

    public Text getText() {
        return this.mText;
    }

    public Text getTitle() {
        return this.mTitle;
    }

    public boolean hasAction() {
        return this.mDeepLinks != null;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.mBackgroundColor * 31;
        Link link = this.mDeepLinks;
        int i5 = 0;
        if (link != null) {
            i = link.hashCode();
        } else {
            i = 0;
        }
        int i6 = (i4 + i) * 31;
        Asset asset = this.mAsset;
        if (asset != null) {
            i2 = asset.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Text text = this.mText;
        if (text != null) {
            i3 = text.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Text text2 = this.mTitle;
        if (text2 != null) {
            i5 = text2.hashCode();
        }
        return i8 + i5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mBackgroundColor);
        parcel.writeParcelable(this.mDeepLinks, i);
        parcel.writeParcelable(this.mAsset, i);
        parcel.writeParcelable(this.mText, i);
        parcel.writeParcelable(this.mTitle, i);
    }

    public Preview(Parcel parcel) {
        this.mBackgroundColor = parcel.readInt();
        this.mDeepLinks = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.mAsset = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
        this.mText = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.mTitle = (Text) parcel.readParcelable(Text.class.getClassLoader());
    }
}
