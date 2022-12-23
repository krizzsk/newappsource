package com.veriff.sdk.internal;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appboy.models.InAppMessageBase;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21887jt;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b\u001a$\u0010\t\u001a\u00020\n*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0012"}, mo59060d2 = {"deviceName", "", "Landroid/content/Context;", "getDeviceName", "(Landroid/content/Context;)Ljava/lang/String;", "toExceptions", "", "Lcom/veriff/sdk/internal/data/SentryReport$Exception;", "", "toSentryReport", "Lcom/veriff/sdk/internal/data/SentryReport;", "context", "message", "severity", "Lcom/veriff/sdk/internal/data/SentryReport$Severity;", "toStackFrame", "Lcom/veriff/sdk/internal/data/SentryReport$StackFrame;", "Ljava/lang/StackTraceElement;", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ju */
public final class C21893ju {
    /* renamed from: a */
    public static final C21887jt m53420a(Throwable th, Context context, String str, C21887jt.C21891d dVar) {
        C24362h.m61211f(th, "$this$toSentryReport");
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, InAppMessageBase.MESSAGE);
        C24362h.m61211f(dVar, "severity");
        C21887jt.C21888a aVar = new C21887jt.C21888a(m53421a(context), Build.BRAND, Build.MODEL);
        String str2 = Build.VERSION.RELEASE;
        return new C21887jt(str, dVar, aVar, new C21887jt.C21890c("Android", str2, str2), m53422a(th));
    }

    /* renamed from: a */
    public static final List<C21887jt.C21889b> m53422a(Throwable th) {
        C24362h.m61211f(th, "$this$toExceptions");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Throwable th2 = th;
        while (th2 != null && !linkedHashSet.contains(th2)) {
            String name = th2.getClass().getName();
            String message = th2.getMessage();
            StackTraceElement[] stackTrace = th2.getStackTrace();
            C24362h.m61210e(stackTrace, "throwable.stackTrace");
            ArrayList arrayList2 = new ArrayList(stackTrace.length);
            for (StackTraceElement stackTraceElement : stackTrace) {
                C24362h.m61210e(stackTraceElement, "it");
                arrayList2.add(m53419a(stackTraceElement));
            }
            arrayList.add(new C21887jt.C21889b(name, message, C23825c.m58489A0(arrayList2)));
            linkedHashSet.add(th2);
            th2 = th.getCause();
        }
        return C23825c.m58489A0(arrayList);
    }

    /* renamed from: a */
    private static final C21887jt.C21892e m53419a(StackTraceElement stackTraceElement) {
        String methodName = stackTraceElement.getMethodName();
        C24362h.m61210e(methodName, "methodName");
        String className = stackTraceElement.getClassName();
        C24362h.m61210e(className, "className");
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        if (lineNumber < 1) {
            lineNumber = 1;
        }
        return new C21887jt.C21892e(methodName, className, fileName, lineNumber);
    }

    /* renamed from: a */
    private static final String m53421a(Context context) {
        return Settings.Global.getString(context.getContentResolver(), "device_name");
    }
}
