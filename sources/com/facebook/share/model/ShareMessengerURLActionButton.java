package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/ShareMessengerURLActionButton;", "Lcom/facebook/share/model/ShareMessengerActionButton;", "WebviewHeightRatio", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new C2505a();

    /* renamed from: c */
    public final Uri f8938c;

    /* renamed from: d */
    public final Uri f8939d;

    /* renamed from: e */
    public final boolean f8940e;

    /* renamed from: f */
    public final WebviewHeightRatio f8941f;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/share/model/ShareMessengerURLActionButton$WebviewHeightRatio;", "", "(Ljava/lang/String;I)V", "WebviewHeightRatioFull", "WebviewHeightRatioTall", "WebviewHeightRatioCompact", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public static final class C2505a implements Parcelable.Creator<ShareMessengerURLActionButton> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        boolean z;
        C24362h.m61211f(parcel, "parcel");
        this.f8938c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8940e = z;
        this.f8939d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f8941f = (WebviewHeightRatio) parcel.readSerializable();
        parcel.readByte();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8938c, 0);
        parcel.writeByte(this.f8940e ? (byte) 1 : 0);
        parcel.writeParcelable(this.f8939d, 0);
        parcel.writeSerializable(this.f8941f);
        parcel.writeByte(this.f8940e ? (byte) 1 : 0);
    }
}
