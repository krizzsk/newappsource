package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.models.Link;

public class TextElement implements Parcelable {
    public static final Parcelable.Creator<TextElement> CREATOR = new Parcelable.Creator<TextElement>() {
        public TextElement createFromParcel(Parcel parcel) {
            return new TextElement(parcel);
        }

        public TextElement[] newArray(int i) {
            return new TextElement[i];
        }
    };
    private final Link mAction;
    private final int mBackgroundColor;
    private final Text mText;

    public TextElement(int i, Link link, Text text) {
        this.mBackgroundColor = i;
        this.mAction = link;
        this.mText = text;
    }

    public int describeContents() {
        return 0;
    }

    public Link getAction() {
        return this.mAction;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public Text getText() {
        return this.mText;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mBackgroundColor);
        parcel.writeParcelable(this.mAction, i);
        parcel.writeParcelable(this.mText, i);
    }

    public TextElement(Parcel parcel) {
        this.mBackgroundColor = parcel.readInt();
        this.mAction = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.mText = (Text) parcel.readParcelable(Text.class.getClassLoader());
    }
}
