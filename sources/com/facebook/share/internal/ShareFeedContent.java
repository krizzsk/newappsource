package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/internal/ShareFeedContent;", "Lcom/facebook/share/model/ShareContent;", "", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C2490a();

    /* renamed from: h */
    public final String f8893h;

    /* renamed from: i */
    public final String f8894i;

    /* renamed from: j */
    public final String f8895j;

    /* renamed from: k */
    public final String f8896k;

    /* renamed from: l */
    public final String f8897l;

    /* renamed from: m */
    public final String f8898m;

    /* renamed from: n */
    public final String f8899n;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    public static final class C2490a implements Parcelable.Creator<ShareFeedContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ShareFeedContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        C24362h.m61211f(parcel, "parcel");
        this.f8893h = parcel.readString();
        this.f8894i = parcel.readString();
        this.f8895j = parcel.readString();
        this.f8896k = parcel.readString();
        this.f8897l = parcel.readString();
        this.f8898m = parcel.readString();
        this.f8899n = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f8893h);
        parcel.writeString(this.f8894i);
        parcel.writeString(this.f8895j);
        parcel.writeString(this.f8896k);
        parcel.writeString(this.f8897l);
        parcel.writeString(this.f8898m);
        parcel.writeString(this.f8899n);
    }
}
