package com.moovit.app.gallery;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.app.stopdetail.StopImage;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19746x;

public class GalleryImageInfo implements Parcelable {
    public static final Parcelable.Creator<GalleryImageInfo> CREATOR = new C14874a();

    /* renamed from: i */
    public static C14875b f38013i = new C14875b(GalleryImageInfo.class);

    /* renamed from: b */
    public final String f38014b;

    /* renamed from: c */
    public final String f38015c;

    /* renamed from: d */
    public final String f38016d;

    /* renamed from: e */
    public final String f38017e;

    /* renamed from: f */
    public final int f38018f;

    /* renamed from: g */
    public final int f38019g;

    /* renamed from: h */
    public final long f38020h;

    /* renamed from: com.moovit.app.gallery.GalleryImageInfo$a */
    public class C14874a implements Parcelable.Creator<GalleryImageInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (GalleryImageInfo) C19612n.m46981v(parcel, GalleryImageInfo.f38013i);
        }

        public final Object[] newArray(int i) {
            return new GalleryImageInfo[i];
        }
    }

    /* renamed from: com.moovit.app.gallery.GalleryImageInfo$b */
    public class C14875b extends C19619s<GalleryImageInfo> {
        public C14875b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new GalleryImageInfo(pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            GalleryImageInfo galleryImageInfo = (GalleryImageInfo) obj;
            qVar.mo51955t(galleryImageInfo.f38014b);
            qVar.mo51955t(galleryImageInfo.f38015c);
            qVar.mo51955t(galleryImageInfo.f38016d);
            qVar.mo51955t(galleryImageInfo.f38017e);
            qVar.mo51939l(galleryImageInfo.f38018f);
            qVar.mo51939l(galleryImageInfo.f38019g);
            qVar.mo51940m(galleryImageInfo.f38020h);
        }
    }

    public GalleryImageInfo(String str, String str2, String str3, String str4, int i, int i2, long j) {
        this.f38014b = str;
        this.f38015c = str2;
        this.f38016d = str3;
        this.f38017e = str4;
        this.f38018f = i;
        this.f38019g = i2;
        this.f38020h = j;
    }

    /* renamed from: b */
    public static GalleryImageInfo m37503b(Context context, StopImage stopImage, TransitStop transitStop) {
        String str = stopImage.f39697c;
        String str2 = transitStop.f23731c;
        int i = C7843b.f23777a;
        String str3 = transitStop.f23733e;
        StringBuilder sb = new StringBuilder();
        if (str3 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(context.getString(C19746x.android_stop_id, new Object[]{str3}));
        }
        String sb2 = sb.toString();
        return new GalleryImageInfo(str, str2, sb2, context.getResources().getString(R.string.community_attribution_taken_by, new Object[]{stopImage.f39701g}), stopImage.f39698d, stopImage.f39699e, stopImage.f39700f);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38013i);
    }
}
