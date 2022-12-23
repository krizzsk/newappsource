package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia.C2503a;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/facebook/share/model/ShareMedia;", "M", "Lcom/facebook/share/model/ShareMedia$a;", "B", "Lcom/facebook/share/model/ShareModel;", "a", "Type", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class ShareMedia<M extends ShareMedia<M, B>, B extends C2503a<M, B>> implements ShareModel {

    /* renamed from: b */
    public final Bundle f8934b;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/share/model/ShareMedia$Type;", "", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum Type {
        PHOTO,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C2503a<M extends ShareMedia<M, B>, B extends C2503a<M, B>> {

        /* renamed from: a */
        public Bundle f8935a = new Bundle();
    }

    public ShareMedia(C2503a<M, B> aVar) {
        C24362h.m61211f(aVar, "builder");
        this.f8934b = new Bundle(aVar.f8935a);
    }

    /* renamed from: b */
    public abstract Type mo12736b();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeBundle(this.f8934b);
    }

    public ShareMedia(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.f8934b = readBundle == null ? new Bundle() : readBundle;
    }
}
