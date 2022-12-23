package com.veriff.sdk.internal;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.acf;
import com.veriff.sdk.internal.aci;
import com.veriff.sdk.internal.acv;
import java.io.File;
import kf0.C23775c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J,\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/di/EnvironmentModule;", "", "Lhi0/v;", "sdkClient", "Lcom/squareup/moshi/o;", "moshi", "Lmobi/lab/veriff/data/SessionArguments;", "arguments", "Lmobi/lab/veriff/network/VeriffApi$ApiService;", "provideApi", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "Lcom/veriff/sdk/internal/io/Store;", "provideStore", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.df */
public final class C21562df {

    /* renamed from: a */
    public static final C21562df f54299a = new C21562df();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"", "it", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.df$a */
    public static final class C21563a extends Lambda implements C24236l<String, String> {

        /* renamed from: a */
        public final /* synthetic */ C24426d f54300a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21563a(C24426d dVar) {
            super(1);
            this.f54300a = dVar;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C24362h.m61211f(str, "it");
            return str + '-' + this.f54300a.mo60595a() + "-317009";
        }
    }

    private C21562df() {
    }

    /* renamed from: a */
    public final C21919kj mo54577a(Context context, C21910kf kfVar, C24426d dVar, CoroutineDispatcher coroutineDispatcher) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(dVar, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(coroutineDispatcher, "io");
        File filesDir = context.getFilesDir();
        C24362h.m61210e(filesDir, "context.filesDir");
        return new C21918ki(new C21913kh(coroutineDispatcher, kfVar, C23775c.m58352S0(filesDir, "veriff")), new C21563a(dVar));
    }

    /* renamed from: a */
    public final xb$a mo54578a(C22746yp ypVar, C21450bi biVar, C24426d dVar) {
        C24362h.m61211f(ypVar, "sdkClient");
        C24362h.m61211f(biVar, "moshi");
        C24362h.m61211f(dVar, WidgetMessageParser.KEY_ARGUMENTS);
        Object a = new acv.C21384a().mo54092a(dVar.mo60597b()).mo54091a(ypVar).mo54088a((aci.C21342a) ada.m50859a(biVar)).mo54087a((acf.C21336a) new C21923km(biVar)).mo54093a().mo54083a(xb$a.class);
        C24362h.m61210e(a, "Retrofit.Builder()\n     …i.ApiService::class.java)");
        return (xb$a) a;
    }
}
