package com.moovit.commons.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;
import p977zz.C20927a0;
import p977zz.C20975x0;

public class AppDeepLink implements Parcelable {
    public static final Parcelable.Creator<AppDeepLink> CREATOR = new C15754a();

    /* renamed from: d */
    public static final C15755b f40996d = new C15755b(AppDeepLink.class);

    /* renamed from: b */
    public final String f40997b;

    /* renamed from: c */
    public final Uri f40998c;

    /* renamed from: com.moovit.commons.utils.AppDeepLink$a */
    public class C15754a implements Parcelable.Creator<AppDeepLink> {
        public final Object createFromParcel(Parcel parcel) {
            return (AppDeepLink) C19612n.m46981v(parcel, AppDeepLink.f40996d);
        }

        public final Object[] newArray(int i) {
            return new AppDeepLink[i];
        }
    }

    /* renamed from: com.moovit.commons.utils.AppDeepLink$b */
    public class C15755b extends C19619s<AppDeepLink> {
        public C15755b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new AppDeepLink(pVar.mo51947p(), (Uri) pVar.mo51962q(C19794a.f50326d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            AppDeepLink appDeepLink = (AppDeepLink) obj;
            qVar.mo51954p(appDeepLink.f40997b);
            qVar.mo51967q(appDeepLink.f40998c, C19794a.f50326d);
        }
    }

    public AppDeepLink(String str, Uri uri) {
        C21100e.m49373x(str, "applicationId");
        this.f40997b = str;
        this.f40998c = uri;
    }

    /* renamed from: b */
    public final boolean mo46945b(Context context) {
        return C20975x0.m49121h(context, this.f40997b);
    }

    /* renamed from: c */
    public final void mo46946c(Context context) {
        Uri uri = this.f40998c;
        if (uri != null) {
            Intent i = C20927a0.m49014i(uri);
            i.setPackage(this.f40997b);
            if (C20927a0.m49017l(context, i) || C20927a0.m49017l(context, C20927a0.m49014i(this.f40998c))) {
                return;
            }
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(this.f40997b);
        if (launchIntentForPackage == null || !C20927a0.m49017l(context, launchIntentForPackage)) {
            C20927a0.m49018m(context, this.f40997b);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AppDeepLink)) {
            return false;
        }
        AppDeepLink appDeepLink = (AppDeepLink) obj;
        if (!this.f40997b.equals(appDeepLink.f40997b) || !C20975x0.m49118e(this.f40998c, appDeepLink.f40998c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40997b), C17884p.m44335F(this.f40998c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40996d);
    }
}
