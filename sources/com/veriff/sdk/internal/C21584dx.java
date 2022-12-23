package com.veriff.sdk.internal;

import android.content.Context;
import bf0.C21050d;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21512ci;
import com.veriff.sdk.internal.C22746yp;
import java.io.File;
import javax.net.ssl.X509TrustManager;
import kf0.C23775c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24457h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J4\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0018\u001a\u00020\u00142\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007J$\u0010\u001a\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/di/SdkModule;", "", "Lmobi/lab/veriff/data/SessionArguments;", "sessionArguments", "Lmobi/lab/veriff/util/resourcesHelper/Branding;", "branding", "Lmobi/lab/veriff/util/LanguageUtil;", "util", "Lmobi/lab/veriff/util/LanguageCountryLocale;", "language", "Lcom/veriff/sdk/views/autocapture/ReflectiveDetectorProvider;", "provider", "Lcom/veriff/sdk/views/autocapture/DetectorProvider;", "provideDetectorProvider", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lhi0/v;", "rootOkClient", "Lhi0/c;", "cache", "Lcom/squareup/picasso/Picasso;", "providePicasso", "providePicassoCache", "arguments", "provideSdkOkHttpClient", "Lcom/veriff/sdk/Strings;", "strings", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.dx */
public final class C21584dx {

    /* renamed from: a */
    public static final C21584dx f54319a = new C21584dx();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "message", "Lbf0/d;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.dx$a */
    public static final class C21585a extends Lambda implements C24236l<String, C21050d> {

        /* renamed from: a */
        public final /* synthetic */ C24465j f54320a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21585a(C24465j jVar) {
            super(1);
            this.f54320a = jVar;
        }

        /* renamed from: a */
        public final void mo54602a(String str) {
            this.f54320a.mo60705d(str);
        }

        public /* synthetic */ Object invoke(Object obj) {
            mo54602a((String) obj);
            return C21050d.f52856a;
        }
    }

    private C21584dx() {
    }

    /* renamed from: a */
    public final C22199oh mo54597a(C22206ol olVar) {
        C24362h.m61211f(olVar, "provider");
        return olVar;
    }

    /* renamed from: a */
    public final C22746yp mo54600a(C22746yp ypVar, C24426d dVar, Context context) {
        C24362h.m61211f(ypVar, "rootOkClient");
        C24362h.m61211f(dVar, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24465j a = C24465j.m61538a("VeriffAPI");
        C24362h.m61210e(a, "Log.getInstance(\"VeriffAPI\")");
        C22746yp.C22748a a2 = ypVar.mo57340B().mo57376a((C22740ym) new C22669wt()).mo57376a((C22740ym) new C22677xa()).mo57376a((C22740ym) new C22680xd(context)).mo57376a((C22740ym) new C22679xc(new C21585a(a))).mo57376a((C22740ym) new C22670wu(dVar.mo60598c()));
        try {
            C22674wy wyVar = new C22674wy();
            X509TrustManager a3 = wyVar.mo57041a();
            if (a3 != null) {
                a2.mo57377a(wyVar, a3);
            }
        } catch (Exception e) {
            e.printStackTrace();
            a.mo60705d("adding tls socket factory failed");
        }
        C22746yp a4 = a2.mo57378a();
        C24362h.m61210e(a4, "builder.build()");
        return a4;
    }

    /* renamed from: b */
    public final C24454g mo54601b(C24457h hVar) {
        C24362h.m61211f(hVar, "util");
        return hVar.mo60696b();
    }

    /* renamed from: a */
    public final C22704xu mo54599a(Context context) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        File cacheDir = context.getCacheDir();
        C24362h.m61210e(cacheDir, "context.cacheDir");
        return new C22704xu(C23775c.m58352S0(cacheDir, "veriff-cache"), 1048576);
    }

    /* renamed from: a */
    public final C21512ci mo54595a(Context context, C24426d dVar, C21910kf kfVar, C22746yp ypVar, C22704xu xuVar) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(dVar, "sessionArguments");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(ypVar, "rootOkClient");
        C24362h.m61211f(xuVar, "cache");
        C21512ci a = new C21512ci.C21514a(context).mo54497a((C21496by) new C21511ch(ypVar.mo57340B().mo57375a(xuVar).mo57378a())).mo54498a((C21529cn) new C22033mo(kfVar, dVar.mo60603f())).mo54499a();
        C24362h.m61210e(a, "Picasso.Builder(context)…on))\n            .build()");
        return a;
    }

    /* renamed from: a */
    public final C22696xo mo54598a(C24426d dVar) {
        C24362h.m61211f(dVar, "sessionArguments");
        return dVar.mo60604g();
    }

    /* renamed from: a */
    public final C21616ex mo54596a(C24457h hVar) {
        C24362h.m61211f(hVar, "util");
        return hVar.mo60691a();
    }
}
