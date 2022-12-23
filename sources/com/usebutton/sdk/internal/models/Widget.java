package com.usebutton.sdk.internal.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.WidgetDTO;
import com.usebutton.sdk.internal.widget.WidgetRenderable;
import org.json.JSONException;
import org.json.JSONObject;

public class Widget implements WidgetRenderable, Parcelable {
    public static final Parcelable.Creator<Widget> CREATOR = new Parcelable.Creator<Widget>() {
        public Widget createFromParcel(Parcel parcel) {
            return new Widget(parcel);
        }

        public Widget[] newArray(int i) {
            return new Widget[i];
        }
    };
    public static final String VIEW_TYPE_CARD = "card";
    public static final String VIEW_TYPE_FULLSCREEN = "fullscreen";
    private final float cardHeight;
    private final Uri ctaIcon;
    private final Text ctaText;
    private final String markup;
    private final String markupUrl;
    private final long renderTimeout;
    private JSONObject rules;
    private int showCount = 0;
    private final String viewType;

    private Widget(String str, String str2, String str3, long j, Uri uri, Text text, float f, JSONObject jSONObject) {
        this.viewType = str;
        this.markup = str2;
        this.markupUrl = str3;
        this.renderTimeout = j;
        this.ctaIcon = uri;
        this.ctaText = text;
        this.cardHeight = f;
        this.rules = jSONObject;
    }

    public static Widget fromDTO(WidgetDTO widgetDTO) {
        if (widgetDTO == null) {
            return null;
        }
        return new Widget(widgetDTO.viewType, widgetDTO.markup, widgetDTO.markupUrl, widgetDTO.renderTimeout, Uri.parse(widgetDTO.ctaIcon), Text.fromDTO(widgetDTO.ctaText), widgetDTO.cardHeight, widgetDTO.rules);
    }

    public int describeContents() {
        return 0;
    }

    public float getCardHeight() {
        return this.cardHeight;
    }

    public Uri getCtaIcon() {
        return this.ctaIcon;
    }

    public Text getCtaText() {
        return this.ctaText;
    }

    public JSONObject getEventProperties() {
        return null;
    }

    public String getMarkup() {
        return this.markup;
    }

    public String getMarkupUrl() {
        return this.markupUrl;
    }

    public long getRenderTimeoutInMs() {
        return this.renderTimeout;
    }

    public JSONObject getRules() {
        return this.rules;
    }

    public int getShowCount() {
        return this.showCount;
    }

    public String getViewType() {
        return this.viewType;
    }

    public void incrementShowCount() {
        this.showCount++;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.viewType);
        parcel.writeString(this.markup);
        parcel.writeString(this.markupUrl);
        parcel.writeLong(this.renderTimeout);
        parcel.writeParcelable(this.ctaIcon, i);
        parcel.writeParcelable(this.ctaText, i);
        parcel.writeFloat(this.cardHeight);
        parcel.writeString(this.rules.toString());
    }

    public Widget(Parcel parcel) {
        this.viewType = parcel.readString();
        this.markup = parcel.readString();
        this.markupUrl = parcel.readString();
        this.renderTimeout = parcel.readLong();
        this.ctaIcon = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.ctaText = (Text) parcel.readParcelable(Text.class.getClassLoader());
        this.cardHeight = parcel.readFloat();
        try {
            this.rules = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
    }
}
