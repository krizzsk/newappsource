package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.PostInstallNotificationConfigDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class PostInstallNotificationConfig implements Parcelable {
    public static final Parcelable.Creator<PostInstallNotificationConfig> CREATOR = new Parcelable.Creator<PostInstallNotificationConfig>() {
        public PostInstallNotificationConfig createFromParcel(Parcel parcel) {
            return new PostInstallNotificationConfig(parcel);
        }

        public PostInstallNotificationConfig[] newArray(int i) {
            return new PostInstallNotificationConfig[i];
        }
    };
    private final Uri backgroundImage;
    private final Text cta;
    private final int ctaBackgroundColor;
    private final Uri icon;
    private final int timeoutWindowInSeconds;
    private final Text title;

    public PostInstallNotificationConfig(Uri uri, Uri uri2, int i, int i2, Text text, Text text2) {
        this.icon = uri;
        this.backgroundImage = uri2;
        this.timeoutWindowInSeconds = i;
        this.ctaBackgroundColor = i2;
        this.title = text;
        this.cta = text2;
    }

    public static PostInstallNotificationConfig fromDTO(PostInstallNotificationConfigDTO postInstallNotificationConfigDTO) {
        if (postInstallNotificationConfigDTO == null) {
            return null;
        }
        return new PostInstallNotificationConfig(postInstallNotificationConfigDTO.icon, postInstallNotificationConfigDTO.backgroundImage, postInstallNotificationConfigDTO.timeoutWindowInSeconds, ButtonUtil.safeColorValue(postInstallNotificationConfigDTO.ctaBackgroundColor), Text.fromDTO(postInstallNotificationConfigDTO.title), Text.fromDTO(postInstallNotificationConfigDTO.cta));
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
        PostInstallNotificationConfig postInstallNotificationConfig = (PostInstallNotificationConfig) obj;
        if (this.timeoutWindowInSeconds != postInstallNotificationConfig.timeoutWindowInSeconds || this.ctaBackgroundColor != postInstallNotificationConfig.ctaBackgroundColor) {
            return false;
        }
        Uri uri = this.icon;
        if (uri == null ? postInstallNotificationConfig.icon != null : !uri.equals(postInstallNotificationConfig.icon)) {
            return false;
        }
        Uri uri2 = this.backgroundImage;
        if (uri2 == null ? postInstallNotificationConfig.backgroundImage != null : !uri2.equals(postInstallNotificationConfig.backgroundImage)) {
            return false;
        }
        Text text = this.title;
        if (text == null ? postInstallNotificationConfig.title != null : !text.equals(postInstallNotificationConfig.title)) {
            return false;
        }
        Text text2 = this.cta;
        Text text3 = postInstallNotificationConfig.cta;
        if (text2 != null) {
            return text2.equals(text3);
        }
        if (text3 == null) {
            return true;
        }
        return false;
    }

    public Uri getBackgroundImage() {
        return this.backgroundImage;
    }

    public Text getCta() {
        return this.cta;
    }

    public int getCtaBackgroundColor() {
        return this.ctaBackgroundColor;
    }

    public Uri getIcon() {
        return this.icon;
    }

    public int getTimeoutWindowInSeconds() {
        return this.timeoutWindowInSeconds;
    }

    public Text getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Uri uri = this.icon;
        int i4 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Uri uri2 = this.backgroundImage;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((((i5 + i2) * 31) + this.timeoutWindowInSeconds) * 31) + this.ctaBackgroundColor) * 31;
        Text text = this.title;
        if (text != null) {
            i3 = text.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Text text2 = this.cta;
        if (text2 != null) {
            i4 = text2.hashCode();
        }
        return i7 + i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.icon, i);
        parcel.writeParcelable(this.backgroundImage, i);
        parcel.writeInt(this.timeoutWindowInSeconds);
        parcel.writeInt(this.ctaBackgroundColor);
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.cta, i);
    }

    public PostInstallNotificationConfig(Parcel parcel) {
        this.icon = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.backgroundImage = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.timeoutWindowInSeconds = parcel.readInt();
        this.ctaBackgroundColor = parcel.readInt();
        this.title = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.cta = (Text) parcel.readParcelable(Text.class.getClassLoader());
    }
}
