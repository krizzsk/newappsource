package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/share/model/SharePhotoContent;", "Lcom/facebook/share/model/ShareContent;", "Lcom/facebook/share/model/SharePhotoContent$a;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class SharePhotoContent extends ShareContent<SharePhotoContent, C2508a> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C2509b();

    /* renamed from: h */
    public final List<SharePhoto> f8951h;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static final class C2508a extends ShareContent.C2498a<SharePhotoContent, C2508a> {

        /* renamed from: g */
        public final ArrayList f8952g = new ArrayList();

        /* renamed from: a */
        public final void mo12748a(List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SharePhoto sharePhoto = (SharePhoto) it.next();
                    if (sharePhoto != null) {
                        this.f8952g.add(new SharePhoto(new SharePhoto.C2506a().mo12745a(sharePhoto)));
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$b */
    public static final class C2509b implements Parcelable.Creator<SharePhotoContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    public SharePhotoContent(C2508a aVar) {
        super(aVar);
        this.f8951h = C23825c.m58499K0(aVar.f8952g);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        super.writeToParcel(parcel, i);
        List<SharePhoto> list = this.f8951h;
        C24362h.m61211f(list, "photos");
        Object[] array = list.toArray(new SharePhoto[0]);
        if (array != null) {
            parcel.writeParcelableArray((Parcelable[]) ((SharePhoto[]) array), i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        Iterable iterable;
        C24362h.m61211f(parcel, "parcel");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            iterable = EmptyList.f60173b;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable instanceof ShareMedia) {
                    arrayList.add(parcelable);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof SharePhoto) {
                arrayList2.add(next);
            }
        }
        this.f8951h = C23825c.m58499K0(arrayList2);
    }
}
