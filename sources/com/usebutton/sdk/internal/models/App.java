package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.AppDTO;

public class App implements Parcelable {
    public static final Parcelable.Creator<App> CREATOR = new Parcelable.Creator<App>() {
        public App createFromParcel(Parcel parcel) {
            return new App(parcel);
        }

        public App[] newArray(int i) {
            return new App[i];
        }
    };
    private final PostInstallNotificationConfig postInstallNotificationConfig;

    public App(PostInstallNotificationConfig postInstallNotificationConfig2) {
        this.postInstallNotificationConfig = postInstallNotificationConfig2;
    }

    public static App fromDTO(AppDTO appDTO) {
        if (appDTO == null) {
            return null;
        }
        return new App(PostInstallNotificationConfig.fromDTO(appDTO.postInstallNotificationConfigDTO));
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
        PostInstallNotificationConfig postInstallNotificationConfig2 = this.postInstallNotificationConfig;
        PostInstallNotificationConfig postInstallNotificationConfig3 = ((App) obj).postInstallNotificationConfig;
        if (postInstallNotificationConfig2 != null) {
            return postInstallNotificationConfig2.equals(postInstallNotificationConfig3);
        }
        if (postInstallNotificationConfig3 == null) {
            return true;
        }
        return false;
    }

    public PostInstallNotificationConfig getPostInstallNotificationConfig() {
        return this.postInstallNotificationConfig;
    }

    public int hashCode() {
        PostInstallNotificationConfig postInstallNotificationConfig2 = this.postInstallNotificationConfig;
        if (postInstallNotificationConfig2 != null) {
            return postInstallNotificationConfig2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("App{\n\tPost Install Config=");
        k.append(this.postInstallNotificationConfig);
        k.append("}");
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.postInstallNotificationConfig, i);
    }

    public App(Parcel parcel) {
        this.postInstallNotificationConfig = (PostInstallNotificationConfig) parcel.readParcelable(PostInstallNotificationConfig.class.getClassLoader());
    }
}
