package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.InternalRewardCardDTO;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class InternalRewardCard extends BrowserCard implements Parcelable {
    public static final Parcelable.Creator<InternalRewardCard> CREATOR = new Parcelable.Creator<InternalRewardCard>() {
        public InternalRewardCard createFromParcel(Parcel parcel) {
            return new InternalRewardCard(parcel);
        }

        public InternalRewardCard[] newArray(int i) {
            return new InternalRewardCard[i];
        }
    };
    private final int backgroundColor;
    private final Text body;
    private final Uri ctaIcon;
    private final Text ctaText;
    private final int showCount;
    private final long showDurationInMs;
    private final Text title;

    public InternalRewardCard(int i, int i2, long j, Uri uri, Text text, Text text2, Text text3) {
        this.backgroundColor = i;
        this.showCount = i2;
        this.showDurationInMs = j;
        this.ctaIcon = uri;
        this.ctaText = text;
        this.title = text2;
        this.body = text3;
    }

    public static InternalRewardCard fromDTO(InternalRewardCardDTO internalRewardCardDTO) {
        return new InternalRewardCard(ButtonUtil.safeColorValue(internalRewardCardDTO.backgroundColor), internalRewardCardDTO.showCount, internalRewardCardDTO.showDurationInMs, Uri.parse(internalRewardCardDTO.ctaIcon), Text.fromDTO(internalRewardCardDTO.ctaText), Text.fromDTO(internalRewardCardDTO.title), Text.fromDTO(internalRewardCardDTO.body));
    }

    public int describeContents() {
        return 0;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
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

    public int getShowCount() {
        return this.showCount;
    }

    public long getShowDuration() {
        return this.showDurationInMs;
    }

    public Text getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.backgroundColor);
        parcel.writeInt(this.showCount);
        parcel.writeLong(this.showDurationInMs);
        parcel.writeParcelable(this.ctaIcon, i);
        parcel.writeParcelable(this.ctaText, i);
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.body, i);
    }

    public InternalRewardCard(Parcel parcel) {
        this.backgroundColor = parcel.readInt();
        this.showCount = parcel.readInt();
        this.showDurationInMs = parcel.readLong();
        this.ctaIcon = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ctaText = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.title = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.body = (Text) parcel.readParcelable(Text.class.getClassLoader());
    }
}
