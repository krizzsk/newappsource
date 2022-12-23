package com.usebutton.sdk.internal.models;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.ActionPerformer;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import com.usebutton.sdk.internal.api.models.AppActionDTO;
import com.usebutton.sdk.internal.api.models.BrowserDTO;
import com.usebutton.sdk.internal.api.models.MetaDTO;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.models.Inventory;
import com.usebutton.sdk.models.Link;
import com.usebutton.sdk.models.ListBody;

public class AppAction implements Parcelable {
    public static final Parcelable.Creator<AppAction> CREATOR = new Parcelable.Creator<AppAction>() {
        public AppAction createFromParcel(Parcel parcel) {
            return new AppAction(parcel);
        }

        public AppAction[] newArray(int i) {
            return new AppAction[i];
        }
    };
    private static final String TAG = "AppAction";
    private final App mApp;
    private final Footer mFooter;
    private final Header mHeader;
    private Link mLink;
    private ListBody mListBody;
    private final MetaInfo mMeta;
    private final Preview mPreview;

    public static class Builder {
        private App mApp;
        private Asset mAppIcon;
        private String mAppName;
        private Browser mBrowser;
        private String mCampaignId;
        private Footer mFooter;
        private Header mHeader;
        private String mId;
        private boolean mIsUnsupportedUrl;
        private Link mLinks;
        private ListBody mListBody;
        private int mMaxAgeSeconds;
        private Preview mPreview;
        private String mRequestTime;
        private String mSourceToken;
        private String mStoreId;
        private String mTapSignal;
        private String mTarget;

        public AppAction build() {
            MetaInfo metaInfo = new MetaInfo(this.mMaxAgeSeconds, this.mId, this.mStoreId, this.mSourceToken, this.mCampaignId, this.mBrowser, this.mAppName, this.mTarget, this.mAppIcon, this.mRequestTime, this.mTapSignal, this.mIsUnsupportedUrl);
            if (this.mListBody != null) {
                return new AppAction(this.mApp, metaInfo, this.mPreview, this.mHeader, this.mListBody, this.mFooter);
            } else if (this.mLinks != null) {
                return new AppAction(this.mApp, metaInfo, this.mLinks);
            } else {
                return new AppAction(this.mApp, metaInfo, this.mPreview, this.mHeader, this.mFooter);
            }
        }

        public Builder withAffiliatedLink(Link link) {
            this.mLinks = link;
            return this;
        }

        public Builder withApp(App app) {
            this.mApp = app;
            return this;
        }

        public Builder withAppIcon(Asset asset) {
            this.mAppIcon = asset;
            return this;
        }

        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }

        public Builder withBrowser(Browser browser) {
            this.mBrowser = browser;
            return this;
        }

        public Builder withCampaignId(String str) {
            this.mCampaignId = str;
            return this;
        }

        public Builder withFooter(Footer footer) {
            this.mFooter = footer;
            return this;
        }

        public Builder withHeader(Header header) {
            this.mHeader = header;
            return this;
        }

        public Builder withId(String str) {
            this.mId = str;
            return this;
        }

        public Builder withListBody(ListBody listBody) {
            this.mListBody = listBody;
            return this;
        }

        public Builder withMaxAgeSeconds(int i) {
            this.mMaxAgeSeconds = i;
            return this;
        }

        public Builder withPreview(Preview preview) {
            this.mPreview = preview;
            return this;
        }

        public Builder withRequestTime(String str) {
            this.mRequestTime = str;
            return this;
        }

        public Builder withSourceToken(String str) {
            this.mSourceToken = str;
            return this;
        }

        public Builder withStoreId(String str) {
            this.mStoreId = str;
            return this;
        }

        public Builder withTapSignal(String str) {
            this.mTapSignal = str;
            return this;
        }

        public Builder withTarget(String str) {
            this.mTarget = str;
            return this;
        }

        public Builder withUnsupportedUrl(boolean z) {
            this.mIsUnsupportedUrl = z;
            return this;
        }
    }

    public interface Listener {
        void onFailure(Throwable th);

        void onSuccess();
    }

    public AppAction(App app, MetaInfo metaInfo, Preview preview, Header header, ListBody listBody, Footer footer) {
        this(app, metaInfo, preview, header, footer);
        this.mListBody = listBody;
    }

    private void doInvokeInventory(Context context, Inventory inventory, int i) {
        new ActionPerformer(this.mApp, this.mMeta, inventory.getAction(), i).withEvent(Events.CUSTOM_ITEM_TAPPED).execute(context);
    }

    public static AppAction fromDTO(AppActionDTO appActionDTO) {
        if (appActionDTO == null) {
            return null;
        }
        Builder withUnsupportedUrl = new Builder().withSourceToken(appActionDTO.mMeta.sourceToken).withCampaignId(appActionDTO.mMeta.campaignId).withRequestTime(appActionDTO.mMeta.requestTime).withId(appActionDTO.mMeta.f30925id).withStoreId(appActionDTO.mMeta.storeId).withMaxAgeSeconds(appActionDTO.mMeta.maxAgeSeconds).withAppName(appActionDTO.mMeta.appName).withTarget(appActionDTO.mMeta.target).withTapSignal(appActionDTO.mMeta.tapSignal).withPreview(Preview.fromDTO(appActionDTO.mPreview)).withHeader(Header.fromDTO(appActionDTO.mHeader)).withFooter(Footer.fromDTO(appActionDTO.mFooter)).withAffiliatedLink(Link.fromDTO(appActionDTO.mLinks)).withApp(App.fromDTO(appActionDTO.mApp)).withAppIcon(Asset.fromDTO(appActionDTO.mMeta.appIcon)).withUnsupportedUrl(false);
        BrowserDTO browserDTO = appActionDTO.mBrowser;
        if (browserDTO != null) {
            MetaDTO metaDTO = appActionDTO.mMeta;
            withUnsupportedUrl.withBrowser(Browser.fromDTO(browserDTO, metaDTO.target, metaDTO.appName));
        }
        if ("list".equals(appActionDTO.mType)) {
            withUnsupportedUrl.withListBody(ListBody.fromDTO(appActionDTO.mList));
        }
        return withUnsupportedUrl.build();
    }

    private void invokeActionInternal(Context context, int i, Listener listener) {
        if (this.mLink == null) {
            doInvokePreview(context, i);
            return;
        }
        trackTapEvent();
        new ActionPerformer(this.mApp, this.mMeta, this.mLink, i).execute(context, listener);
    }

    private void trackTapEvent() {
        ButtonPrivate.getButton().getEventTracker().trackEventWithProperties(Events.BUTTON_TAPPED, Events.PROPERTY_SOURCE_TOKEN, getMeta().getSourceToken(), "type", "custom");
    }

    public int describeContents() {
        return 0;
    }

    public void doInvokeFooter(Context context, int i) {
        new ActionPerformer(this.mApp, this.mMeta, this.mFooter.getAction(), i).withEvent(Events.CUSTOM_ITEM_TAPPED).execute(context);
    }

    public void doInvokePreview(Context context, int i) {
        if (this.mPreview == null) {
            ButtonLog.visible("Unable to invoke preview for action. Use invokeAction() instead.");
            ButtonLog.warnFormat(TAG, "Unable to invoke preview for action: %s ", this);
            return;
        }
        ButtonLog.visibleFormat("Button tapped (Action ID: %s)", this.mMeta.getId());
        trackTapEvent();
        if (this.mPreview.hasAction()) {
            new ActionPerformer(this.mApp, this.mMeta, this.mPreview.getDeepLinks(), i).execute(context);
        } else if (hasGroups()) {
            Intent intentForPromotion = GroupedInventoryCardActivity.intentForPromotion(context, this.mApp, this.mMeta, this.mHeader, this.mListBody, this.mFooter);
            intentForPromotion.putExtra("flags", i);
            context.startActivity(intentForPromotion);
        } else {
            ButtonLog.warnFormat(TAG, "Don't know how to invoke preview: %s", this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppAction appAction = (AppAction) obj;
        App app = this.mApp;
        if (app == null ? appAction.mApp != null : !app.equals(appAction.mApp)) {
            return false;
        }
        MetaInfo metaInfo = this.mMeta;
        if (metaInfo == null ? appAction.mMeta != null : !metaInfo.equals(appAction.mMeta)) {
            return false;
        }
        Preview preview = this.mPreview;
        if (preview == null ? appAction.mPreview != null : !preview.equals(appAction.mPreview)) {
            return false;
        }
        Header header = this.mHeader;
        if (header == null ? appAction.mHeader != null : !header.equals(appAction.mHeader)) {
            return false;
        }
        Footer footer = this.mFooter;
        if (footer == null ? appAction.mFooter != null : !footer.equals(appAction.mFooter)) {
            return false;
        }
        ListBody listBody = this.mListBody;
        if (listBody == null ? appAction.mListBody != null : !listBody.equals(appAction.mListBody)) {
            return false;
        }
        Link link = this.mLink;
        Link link2 = appAction.mLink;
        if (link != null) {
            return link.equals(link2);
        }
        if (link2 == null) {
            return true;
        }
        return false;
    }

    public App getApp() {
        return this.mApp;
    }

    public Footer getFooter() {
        return this.mFooter;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public Link getLink() {
        return this.mLink;
    }

    public ListBody getListBody() {
        return this.mListBody;
    }

    public MetaInfo getMeta() {
        return this.mMeta;
    }

    public Preview getPreview() {
        return this.mPreview;
    }

    public boolean hasGroups() {
        return this.mListBody != null;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        App app = this.mApp;
        int i7 = 0;
        if (app != null) {
            i = app.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        MetaInfo metaInfo = this.mMeta;
        if (metaInfo != null) {
            i2 = metaInfo.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        Preview preview = this.mPreview;
        if (preview != null) {
            i3 = preview.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i9 + i3) * 31;
        Header header = this.mHeader;
        if (header != null) {
            i4 = header.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        Footer footer = this.mFooter;
        if (footer != null) {
            i5 = footer.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        ListBody listBody = this.mListBody;
        if (listBody != null) {
            i6 = listBody.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        Link link = this.mLink;
        if (link != null) {
            i7 = link.hashCode();
        }
        return i14 + i7;
    }

    public void invokeAction(Context context) {
        invokeAction(context, (Listener) null);
    }

    public void invokeInventory(Context context, Inventory inventory) {
        if (inventory != null) {
            doInvokeInventory(context, inventory, 268435456);
            return;
        }
        throw new IllegalArgumentException("Null inventory, can't invoke");
    }

    public void setLink(Link link) {
        this.mLink = link;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AppAction{mApp=");
        k.append(this.mApp);
        k.append(", mMeta=");
        k.append(this.mMeta);
        k.append(", mPreview=");
        k.append(this.mPreview);
        k.append(", mHeader=");
        k.append(this.mHeader);
        k.append(", mFooter=");
        k.append(this.mFooter);
        k.append(", mListBody=");
        k.append(this.mListBody);
        k.append(", mLink=");
        k.append(this.mLink);
        k.append('}');
        return k.toString();
    }

    public void trackButtonViewed(Context context) {
        MetaInfo meta = getMeta();
        ButtonLog.visibleFormat("Custom button viewed (Action ID: %s)", meta.getId());
        ButtonPrivate.getButton().getEventTracker().trackEventWithProperties(Events.CUSTOM_BUTTON_VIEWED, Events.PROPERTY_SOURCE_TOKEN, meta.getSourceToken());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mApp, i);
        parcel.writeParcelable(this.mMeta, i);
        parcel.writeParcelable(this.mPreview, i);
        parcel.writeParcelable(this.mHeader, i);
        parcel.writeParcelable(this.mListBody, i);
        parcel.writeParcelable(this.mFooter, i);
        parcel.writeParcelable(this.mLink, i);
    }

    public void invokeAction(Context context, Listener listener) {
        invokeActionInternal(context, 268435456, listener);
    }

    public AppAction(App app, MetaInfo metaInfo, Preview preview, Header header, Footer footer) {
        this.mApp = app;
        this.mMeta = metaInfo;
        this.mPreview = preview;
        this.mHeader = header;
        this.mFooter = footer;
    }

    public AppAction(App app, MetaInfo metaInfo, Link link) {
        this.mApp = app;
        this.mMeta = metaInfo;
        this.mLink = link;
        this.mPreview = null;
        this.mHeader = null;
        this.mFooter = null;
    }

    public AppAction(Parcel parcel) {
        this.mApp = (App) parcel.readParcelable(App.class.getClassLoader());
        this.mMeta = (MetaInfo) parcel.readParcelable(MetaInfo.class.getClassLoader());
        this.mPreview = (Preview) parcel.readParcelable(Preview.class.getClassLoader());
        this.mHeader = (Header) parcel.readParcelable(Header.class.getClassLoader());
        this.mListBody = (ListBody) parcel.readParcelable(ListBody.class.getClassLoader());
        this.mFooter = (Footer) parcel.readParcelable(Footer.class.getClassLoader());
        this.mLink = (Link) parcel.readParcelable(Link.class.getClassLoader());
    }
}
