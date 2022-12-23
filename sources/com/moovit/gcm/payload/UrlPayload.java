package com.moovit.gcm.payload;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20927a0;
import p977zz.C20975x0;

public class UrlPayload extends GcmPayload {
    public static final Parcelable.Creator<UrlPayload> CREATOR = new C15975a();

    /* renamed from: f */
    public static final C15976b f41598f = new C15976b();

    /* renamed from: g */
    public static final C15977c f41599g = new C15977c(UrlPayload.class);

    /* renamed from: c */
    public final String f41600c;

    /* renamed from: d */
    public final String f41601d;

    /* renamed from: e */
    public final boolean f41602e;

    /* renamed from: com.moovit.gcm.payload.UrlPayload$a */
    public class C15975a implements Parcelable.Creator<UrlPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (UrlPayload) C19612n.m46981v(parcel, UrlPayload.f41599g);
        }

        public final Object[] newArray(int i) {
            return new UrlPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.UrlPayload$b */
    public class C15976b extends C19621u<UrlPayload> {
        public C15976b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            UrlPayload urlPayload = (UrlPayload) obj;
            qVar.mo51954p(urlPayload.f41546b);
            qVar.mo51954p(urlPayload.f41600c);
            qVar.mo51955t(urlPayload.f41601d);
            qVar.mo51934b(urlPayload.f41602e);
        }
    }

    /* renamed from: com.moovit.gcm.payload.UrlPayload$c */
    public class C15977c extends C19620t<UrlPayload> {
        public C15977c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new UrlPayload(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51919b());
        }
    }

    public UrlPayload(String str, String str2, String str3, boolean z) {
        super(str);
        C21100e.m49373x(str2, "url");
        this.f41600c = str2;
        this.f41601d = str3;
        this.f41602e = z;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        return aVar.mo48017h(this);
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "url";
    }

    /* renamed from: d */
    public final Intent mo48105d(Context context) {
        Intent i = C20927a0.m49014i(Uri.parse(this.f41600c));
        i.addCategory("android.intent.category.DEFAULT");
        i.setPackage(context.getPackageName());
        ComponentName resolveActivity = i.resolveActivity(context.getPackageManager());
        if (resolveActivity == null || !C20975x0.m49118e(context.getPackageName(), resolveActivity.getPackageName())) {
            return null;
        }
        i.setComponent(resolveActivity);
        return i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41598f);
    }
}
