package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.InternalInstallCardDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class InternalInstallCard extends BrowserCard implements Parcelable {
    public static final Parcelable.Creator<InternalInstallCard> CREATOR = new Parcelable.Creator<InternalInstallCard>() {
        public InternalInstallCard createFromParcel(Parcel parcel) {
            return new InternalInstallCard(parcel);
        }

        public InternalInstallCard[] newArray(int i) {
            return new InternalInstallCard[i];
        }
    };
    private final Uri appIcon;
    private final long autoShowDelayInMs;
    private final Text body;
    private final Uri ctaIcon;
    private final Text ctaText;
    private final Text primaryAction;
    private final int primaryColor;
    private final Text secondaryAction;
    private final Text title;

    public InternalInstallCard(int i, Text text, Text text2, Uri uri, Text text3, Text text4, Text text5, Uri uri2, long j) {
        this.primaryColor = i;
        this.title = text;
        this.body = text2;
        this.ctaIcon = uri;
        this.ctaText = text3;
        this.primaryAction = text4;
        this.secondaryAction = text5;
        this.appIcon = uri2;
        this.autoShowDelayInMs = j;
    }

    public static InternalInstallCard fromDTO(InternalInstallCardDTO internalInstallCardDTO) {
        return new InternalInstallCard(ButtonUtil.safeColorValue(internalInstallCardDTO.primaryColor), Text.fromDTO(internalInstallCardDTO.title), Text.fromDTO(internalInstallCardDTO.body), Uri.parse(internalInstallCardDTO.ctaIcon), Text.fromDTO(internalInstallCardDTO.ctaText), Text.fromDTO(internalInstallCardDTO.primaryAction), Text.fromDTO(internalInstallCardDTO.secondaryAction), Uri.parse(internalInstallCardDTO.appIconUrl), internalInstallCardDTO.autoShowDelayInMs);
    }

    public int describeContents() {
        return 0;
    }

    public Uri getAppIcon() {
        return this.appIcon;
    }

    public long getAutoShowDelayInMs() {
        return this.autoShowDelayInMs;
    }

    public Text getBody() {
        return this.body;
    }

    public Uri getCtaIcon() {
        return this.ctaIcon;
    }

    public Text getCtaText() {
        return this.ctaText;
    }

    public Text getPrimaryAction() {
        return this.primaryAction;
    }

    public int getPrimaryColor() {
        return this.primaryColor;
    }

    public Text getSecondaryAction() {
        return this.secondaryAction;
    }

    public Text getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.primaryColor);
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.body, i);
        parcel.writeParcelable(this.ctaIcon, i);
        parcel.writeParcelable(this.ctaText, i);
        parcel.writeParcelable(this.primaryAction, i);
        parcel.writeParcelable(this.secondaryAction, i);
        parcel.writeParcelable(this.appIcon, i);
        parcel.writeLong(this.autoShowDelayInMs);
    }

    public InternalInstallCard(Parcel parcel) {
        this.primaryColor = parcel.readInt();
        this.title = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.body = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.ctaIcon = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ctaText = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.primaryAction = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.secondaryAction = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.appIcon = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.autoShowDelayInMs = parcel.readLong();
    }
}
