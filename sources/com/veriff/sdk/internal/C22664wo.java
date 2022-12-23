package com.veriff.sdk.internal;

import android.content.Context;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21582dw;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.data.C24426d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/model/SingletonSessionCache;", "Lmobi/lab/veriff/model/SessionCache;", "sdkComponentFactory", "Lcom/veriff/di/SdkLaunchComponent$Factory;", "(Lcom/veriff/di/SdkLaunchComponent$Factory;)V", "cache", "", "Lmobi/lab/veriff/data/SessionArguments;", "Lcom/veriff/di/SdkLaunchComponent;", "getSdkComponent", "context", "Landroid/content/Context;", "arguments", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.wo */
public final class C22664wo implements C22663wn {

    /* renamed from: a */
    private final Map<C24426d, C21582dw> f57324a = new LinkedHashMap();

    /* renamed from: b */
    private final C21582dw.C21583a f57325b;

    public C22664wo(C21582dw.C21583a aVar) {
        C24362h.m61211f(aVar, "sdkComponentFactory");
        this.f57325b = aVar;
    }

    /* renamed from: a */
    public synchronized C21582dw mo57035a(Context context, C24426d dVar) {
        C21582dw dwVar;
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(dVar, WidgetMessageParser.KEY_ARGUMENTS);
        Map<C24426d, C21582dw> map = this.f57324a;
        dwVar = map.get(dVar);
        if (dwVar == null) {
            C21582dw.C21583a aVar = this.f57325b;
            Context applicationContext = context.getApplicationContext();
            C24362h.m61210e(applicationContext, "context.applicationContext");
            dwVar = aVar.mo54569a(applicationContext, dVar);
            map.put(dVar, dwVar);
        }
        return dwVar;
    }
}
