package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;

public class MetaInfo implements Parcelable {
    public static final Parcelable.Creator<MetaInfo> CREATOR = new Parcelable.Creator<MetaInfo>() {
        public MetaInfo createFromParcel(Parcel parcel) {
            return new MetaInfo(parcel);
        }

        public MetaInfo[] newArray(int i) {
            return new MetaInfo[i];
        }
    };
    public static final String TAP_SIGNAL_REQUIRE_ACK = "require-ack";
    public static final String TAP_SIGNAL_SEND = "send";
    private final String mAppName;
    private final Browser mBrowser;
    private final String mCampaignId;
    private final Asset mIcon;
    private final String mId;
    private final boolean mIsUnsupportedUrl;
    private final int mMaxAgeSeconds;
    private final String mRequestTime;
    private final String mSourceToken;
    private final String mStoreId;
    private final String mTapSignal;
    private final String mTarget;

    public MetaInfo(int i, String str, String str2, String str3, String str4, Browser browser, String str5, String str6, Asset asset, String str7, String str8, boolean z) {
        this.mMaxAgeSeconds = i;
        this.mId = str;
        this.mStoreId = str2;
        this.mSourceToken = str3;
        this.mCampaignId = str4;
        this.mAppName = str5;
        this.mTarget = str6;
        this.mBrowser = browser;
        this.mIcon = asset;
        this.mRequestTime = str7;
        this.mTapSignal = str8;
        this.mIsUnsupportedUrl = z;
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
        MetaInfo metaInfo = (MetaInfo) obj;
        if (this.mMaxAgeSeconds != metaInfo.mMaxAgeSeconds || this.mIsUnsupportedUrl != metaInfo.mIsUnsupportedUrl) {
            return false;
        }
        String str = this.mId;
        if (str == null ? metaInfo.mId != null : !str.equals(metaInfo.mId)) {
            return false;
        }
        String str2 = this.mStoreId;
        if (str2 == null ? metaInfo.mStoreId != null : !str2.equals(metaInfo.mStoreId)) {
            return false;
        }
        String str3 = this.mSourceToken;
        if (str3 == null ? metaInfo.mSourceToken != null : !str3.equals(metaInfo.mSourceToken)) {
            return false;
        }
        String str4 = this.mCampaignId;
        if (str4 == null ? metaInfo.mCampaignId != null : !str4.equals(metaInfo.mCampaignId)) {
            return false;
        }
        String str5 = this.mAppName;
        if (str5 == null ? metaInfo.mAppName != null : !str5.equals(metaInfo.mAppName)) {
            return false;
        }
        String str6 = this.mTarget;
        if (str6 == null ? metaInfo.mTarget != null : !str6.equals(metaInfo.mTarget)) {
            return false;
        }
        Browser browser = this.mBrowser;
        if (browser == null ? metaInfo.mBrowser != null : !browser.equals(metaInfo.mBrowser)) {
            return false;
        }
        Asset asset = this.mIcon;
        if (asset == null ? metaInfo.mIcon != null : !asset.equals(metaInfo.mIcon)) {
            return false;
        }
        String str7 = this.mRequestTime;
        if (str7 == null ? metaInfo.mRequestTime != null : !str7.equals(metaInfo.mRequestTime)) {
            return false;
        }
        String str8 = this.mTapSignal;
        String str9 = metaInfo.mTapSignal;
        if (str8 != null) {
            return str8.equals(str9);
        }
        if (str9 == null) {
            return true;
        }
        return false;
    }

    public String getAppName() {
        return this.mAppName;
    }

    public Browser getBrowser() {
        return this.mBrowser;
    }

    public String getCampaignId() {
        return this.mCampaignId;
    }

    public Asset getIcon() {
        return this.mIcon;
    }

    public String getId() {
        return this.mId;
    }

    public int getMaxAgeSeconds() {
        return this.mMaxAgeSeconds;
    }

    public String getRequestTime() {
        return this.mRequestTime;
    }

    public String getSourceToken() {
        return this.mSourceToken;
    }

    public String getStoreId() {
        return this.mStoreId;
    }

    public String getTapSignal() {
        return this.mTapSignal;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11 = this.mMaxAgeSeconds * 31;
        String str = this.mId;
        int i12 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i13 = (i11 + i) * 31;
        String str2 = this.mStoreId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (i13 + i2) * 31;
        String str3 = this.mSourceToken;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        String str4 = this.mCampaignId;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = (i15 + i4) * 31;
        String str5 = this.mAppName;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        String str6 = this.mTarget;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i18 = (i17 + i6) * 31;
        Browser browser = this.mBrowser;
        if (browser != null) {
            i7 = browser.hashCode();
        } else {
            i7 = 0;
        }
        int i19 = (i18 + i7) * 31;
        Asset asset = this.mIcon;
        if (asset != null) {
            i8 = asset.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i19 + i8) * 31;
        String str7 = this.mRequestTime;
        if (str7 != null) {
            i9 = str7.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        String str8 = this.mTapSignal;
        if (str8 != null) {
            i12 = str8.hashCode();
        }
        return ((i22 + i12) * 31) + (this.mIsUnsupportedUrl ? 1 : 0);
    }

    public boolean isTargetBrowser() {
        Browser browser = this.mBrowser;
        return browser != null && browser.isTargetBrowser();
    }

    public boolean isTargetWebview() {
        Browser browser = this.mBrowser;
        return browser != null && browser.isTargetWebView();
    }

    public boolean isTargetWebviewOnly() {
        Browser browser = this.mBrowser;
        return browser != null && browser.isTargetWebViewOnly();
    }

    public boolean isUnsupportedUrl() {
        return this.mIsUnsupportedUrl;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("MetaInfo{mMaxAgeSeconds=");
        k.append(this.mMaxAgeSeconds);
        k.append(", mId='");
        C25541a.m63890u(k, this.mId, '\'', ", mStoreId='");
        C25541a.m63890u(k, this.mStoreId, '\'', ", mSourceToken='");
        C25541a.m63890u(k, this.mSourceToken, '\'', ", mCampaignId='");
        C25541a.m63890u(k, this.mCampaignId, '\'', ", mAppName='");
        C25541a.m63890u(k, this.mAppName, '\'', ", mTarget='");
        C25541a.m63890u(k, this.mTarget, '\'', ", mBrowser=");
        k.append(this.mBrowser);
        k.append(", mIcon=");
        k.append(this.mIcon);
        k.append(", mRequestTime='");
        C25541a.m63890u(k, this.mRequestTime, '\'', ", mTapSignal='");
        C25541a.m63890u(k, this.mTapSignal, '\'', ", mIsUnsupportedUrl=");
        return C13715c.m34247m(k, this.mIsUnsupportedUrl, '}');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMaxAgeSeconds);
        parcel.writeString(this.mId);
        parcel.writeString(this.mStoreId);
        parcel.writeString(this.mSourceToken);
        parcel.writeString(this.mCampaignId);
        parcel.writeString(this.mAppName);
        parcel.writeString(this.mTarget);
        parcel.writeParcelable(this.mBrowser, i);
        parcel.writeParcelable(this.mIcon, i);
        parcel.writeString(this.mRequestTime);
        parcel.writeString(this.mTapSignal);
        parcel.writeByte(this.mIsUnsupportedUrl ? (byte) 1 : 0);
    }

    public MetaInfo(Parcel parcel) {
        this.mMaxAgeSeconds = parcel.readInt();
        this.mId = parcel.readString();
        this.mStoreId = parcel.readString();
        this.mSourceToken = parcel.readString();
        this.mCampaignId = parcel.readString();
        this.mAppName = parcel.readString();
        this.mTarget = parcel.readString();
        this.mBrowser = (Browser) parcel.readParcelable(Browser.class.getClassLoader());
        this.mIcon = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
        this.mRequestTime = parcel.readString();
        this.mTapSignal = parcel.readString();
        this.mIsUnsupportedUrl = parcel.readByte() != 0;
    }
}
