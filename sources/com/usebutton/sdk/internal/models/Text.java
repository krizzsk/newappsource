package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import com.usebutton.sdk.internal.api.models.TextDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class Text implements Parcelable {
    public static final Parcelable.Creator<Text> CREATOR = new Parcelable.Creator<Text>() {
        public Text createFromParcel(Parcel parcel) {
            return new Text(parcel);
        }

        public Text[] newArray(int i) {
            return new Text[i];
        }
    };
    private final int mColor;
    private final String mCopy;

    public Text(int i, String str) {
        this.mColor = i;
        this.mCopy = str;
    }

    public static Text fromDTO(TextDTO textDTO) {
        if (textDTO == null) {
            return null;
        }
        return new Text(ButtonUtil.safeColorValue(textDTO.mColor), textDTO.mText);
    }

    public static Text white(String str) {
        return new Text(-1, str);
    }

    public void applyTo(TextView textView) {
        if (textView != null) {
            textView.setText(getCopy());
            textView.setTextColor(getColor());
        }
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
        Text text = (Text) obj;
        if (this.mColor != text.mColor) {
            return false;
        }
        String str = this.mCopy;
        String str2 = text.mCopy;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int getColor() {
        return this.mColor;
    }

    public String getCopy() {
        return this.mCopy;
    }

    public int hashCode() {
        int i;
        int i2 = this.mColor * 31;
        String str = this.mCopy;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Text{mColor=");
        k.append(Integer.toHexString(this.mColor));
        k.append(", mCopy='");
        k.append(this.mCopy);
        k.append('\'');
        k.append('}');
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mColor);
        parcel.writeString(this.mCopy);
    }

    public static void applyTo(TextView textView, Text text) {
        if (text != null) {
            text.applyTo(textView);
        }
        textView.setVisibility(text != null ? 0 : 8);
    }

    public Text(Parcel parcel) {
        this.mColor = parcel.readInt();
        this.mCopy = parcel.readString();
    }
}
