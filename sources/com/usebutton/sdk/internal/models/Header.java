package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.HeaderDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.models.Link;

public class Header extends TextElement {
    public static final Parcelable.Creator<Header> CREATOR = new Parcelable.Creator<Header>() {
        public Header createFromParcel(Parcel parcel) {
            return new Header(parcel);
        }

        public Header[] newArray(int i) {
            return new Header[i];
        }
    };
    private final Text mSubtitle;

    public Header(int i, Text text, Text text2) {
        super(i, (Link) null, text);
        this.mSubtitle = text2;
    }

    public static Header fromDTO(HeaderDTO headerDTO) {
        if (headerDTO == null) {
            return null;
        }
        return new Header(ButtonUtil.safeColorValue(headerDTO.mBackgroundColor), Text.fromDTO(headerDTO.mTitle), Text.fromDTO(headerDTO.mSubtitle));
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
        Text text = this.mSubtitle;
        Text text2 = ((Header) obj).mSubtitle;
        if (text != null) {
            return text.equals(text2);
        }
        if (text2 == null) {
            return true;
        }
        return false;
    }

    public Text getSubtitle() {
        return this.mSubtitle;
    }

    public int hashCode() {
        Text text = this.mSubtitle;
        if (text != null) {
            return text.hashCode();
        }
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mSubtitle, i);
    }

    public Header(Parcel parcel) {
        super(parcel);
        this.mSubtitle = (Text) parcel.readParcelable(Text.class.getClassLoader());
    }
}
