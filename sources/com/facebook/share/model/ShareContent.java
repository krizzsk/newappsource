package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C2498a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/share/model/ShareContent;", "M", "Lcom/facebook/share/model/ShareContent$a;", "B", "Lcom/facebook/share/model/ShareModel;", "a", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class ShareContent<M extends ShareContent<M, B>, B extends C2498a<M, B>> implements ShareModel {

    /* renamed from: b */
    public final Uri f8919b;

    /* renamed from: c */
    public final List<String> f8920c;

    /* renamed from: d */
    public final String f8921d;

    /* renamed from: e */
    public final String f8922e;

    /* renamed from: f */
    public final String f8923f;

    /* renamed from: g */
    public final ShareHashtag f8924g;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C2498a<M extends ShareContent<M, B>, B extends C2498a<M, B>> {

        /* renamed from: a */
        public Uri f8925a;

        /* renamed from: b */
        public List<String> f8926b;

        /* renamed from: c */
        public String f8927c;

        /* renamed from: d */
        public String f8928d;

        /* renamed from: e */
        public String f8929e;

        /* renamed from: f */
        public ShareHashtag f8930f;
    }

    public ShareContent(C2498a<M, B> aVar) {
        this.f8919b = aVar.f8925a;
        this.f8920c = aVar.f8926b;
        this.f8921d = aVar.f8927c;
        this.f8922e = aVar.f8928d;
        this.f8923f = aVar.f8929e;
        this.f8924g = aVar.f8930f;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f8919b, 0);
        parcel.writeStringList(this.f8920c);
        parcel.writeString(this.f8921d);
        parcel.writeString(this.f8922e);
        parcel.writeString(this.f8923f);
        parcel.writeParcelable(this.f8924g, 0);
    }

    public ShareContent(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8919b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f8920c = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.f8921d = parcel.readString();
        this.f8922e = parcel.readString();
        this.f8923f = parcel.readString();
        ShareHashtag.C2499a aVar = new ShareHashtag.C2499a();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            aVar.f8932a = shareHashtag.f8931b;
        }
        this.f8924g = new ShareHashtag(aVar);
    }
}
