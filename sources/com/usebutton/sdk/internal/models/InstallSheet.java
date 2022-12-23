package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.InstallSheetDTO;

public class InstallSheet implements Parcelable {
    public static final Parcelable.Creator<InstallSheet> CREATOR = new Parcelable.Creator<InstallSheet>() {
        public InstallSheet createFromParcel(Parcel parcel) {
            return new InstallSheet(parcel);
        }

        public InstallSheet[] newArray(int i) {
            return new InstallSheet[i];
        }
    };
    private final Text appActionText;
    private final Text appSubtitleText;
    private final Text appTitleText;
    private final Text titleText;
    private final Text webActionText;

    public InstallSheet(Text text, Text text2, Text text3, Text text4, Text text5) {
        this.titleText = text;
        this.appTitleText = text2;
        this.appSubtitleText = text3;
        this.appActionText = text4;
        this.webActionText = text5;
    }

    public static InstallSheet fromDTO(InstallSheetDTO installSheetDTO) {
        if (installSheetDTO == null) {
            return null;
        }
        return new InstallSheet(Text.fromDTO(installSheetDTO.titleText), Text.fromDTO(installSheetDTO.appTitleText), Text.fromDTO(installSheetDTO.appSubtitleText), Text.fromDTO(installSheetDTO.appActionText), Text.fromDTO(installSheetDTO.webActionText));
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
        InstallSheet installSheet = (InstallSheet) obj;
        Text text = this.titleText;
        if (text == null ? installSheet.titleText != null : !text.equals(installSheet.titleText)) {
            return false;
        }
        Text text2 = this.appTitleText;
        if (text2 == null ? installSheet.appTitleText != null : !text2.equals(installSheet.appTitleText)) {
            return false;
        }
        Text text3 = this.appSubtitleText;
        if (text3 == null ? installSheet.appSubtitleText != null : !text3.equals(installSheet.appSubtitleText)) {
            return false;
        }
        Text text4 = this.appActionText;
        if (text4 == null ? installSheet.appActionText != null : !text4.equals(installSheet.appActionText)) {
            return false;
        }
        Text text5 = this.webActionText;
        Text text6 = installSheet.webActionText;
        if (text5 != null) {
            return text5.equals(text6);
        }
        if (text6 == null) {
            return true;
        }
        return false;
    }

    public Text getAppActionText() {
        return this.appActionText;
    }

    public Text getAppSubtitleText() {
        return this.appSubtitleText;
    }

    public Text getAppTitleText() {
        return this.appTitleText;
    }

    public Text getTitleText() {
        return this.titleText;
    }

    public Text getWebActionText() {
        return this.webActionText;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Text text = this.titleText;
        int i5 = 0;
        if (text != null) {
            i = text.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Text text2 = this.appTitleText;
        if (text2 != null) {
            i2 = text2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Text text3 = this.appSubtitleText;
        if (text3 != null) {
            i3 = text3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        Text text4 = this.appActionText;
        if (text4 != null) {
            i4 = text4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Text text5 = this.webActionText;
        if (text5 != null) {
            i5 = text5.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("InstallSheet{titleText=");
        k.append(this.titleText);
        k.append(", appTitleText=");
        k.append(this.appTitleText);
        k.append(", appSubtitleText=");
        k.append(this.appSubtitleText);
        k.append(", appActionText=");
        k.append(this.appActionText);
        k.append(", webActionText=");
        k.append(this.webActionText);
        k.append('}');
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.titleText);
        parcel.writeValue(this.appTitleText);
        parcel.writeValue(this.appSubtitleText);
        parcel.writeValue(this.appActionText);
        parcel.writeValue(this.webActionText);
    }

    public InstallSheet(Parcel parcel) {
        this.titleText = (Text) parcel.readValue(Text.class.getClassLoader());
        this.appTitleText = (Text) parcel.readValue(Text.class.getClassLoader());
        this.appSubtitleText = (Text) parcel.readValue(Text.class.getClassLoader());
        this.appActionText = (Text) parcel.readValue(Text.class.getClassLoader());
        this.webActionText = (Text) parcel.readValue(Text.class.getClassLoader());
    }
}
