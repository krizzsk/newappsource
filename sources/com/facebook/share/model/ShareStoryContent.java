package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/ShareStoryContent;", "Lcom/facebook/share/model/ShareContent;", "", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C2510a();

    /* renamed from: h */
    public final ShareMedia<?, ?> f8953h;

    /* renamed from: i */
    public final SharePhoto f8954i;

    /* renamed from: j */
    public final List<String> f8955j;

    /* renamed from: k */
    public final String f8956k;

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    public static final class C2510a implements Parcelable.Creator<ShareStoryContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        List<String> list;
        C24362h.m61211f(parcel, "parcel");
        this.f8953h = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f8954i = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            list = null;
        } else {
            list = C23825c.m58499K0(arrayList);
        }
        this.f8955j = list;
        this.f8956k = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List<T> list;
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f8953h, 0);
        parcel.writeParcelable(this.f8954i, 0);
        List<String> list2 = this.f8955j;
        if (list2 == null) {
            list = null;
        } else {
            list = C23825c.m58499K0(list2);
        }
        parcel.writeStringList(list);
        parcel.writeString(this.f8956k);
    }
}
