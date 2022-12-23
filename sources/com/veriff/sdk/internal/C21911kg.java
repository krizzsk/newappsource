package com.veriff.sdk.internal;

import com.appboy.Constants;
import java.lang.Thread;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C24179b;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/errors/VeriffExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/lang/Thread;", "t", "", "e", "Lbf0/d;", "uncaughtException", "", "isVeriffException", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "wrappedHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "<init>", "(Lcom/veriff/sdk/internal/errors/ErrorReporter;Ljava/lang/Thread$UncaughtExceptionHandler;)V", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kg */
public final class C21911kg implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C21912a f55391a = new C21912a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f55392d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile boolean f55393e = true;

    /* renamed from: b */
    private final C21910kf f55394b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f55395c;

    public C21911kg(C21910kf kfVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        C24362h.m61211f(kfVar, "errorReporter");
        this.f55394b = kfVar;
        this.f55395c = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        C24362h.m61211f(thread, Constants.APPBOY_PUSH_TITLE_KEY);
        C24362h.m61211f(th, "e");
        if (f55393e || m53475a(thread, th)) {
            this.f55394b.mo55689a(th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f55395c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private final boolean m53475a(Thread thread, Throwable th) {
        String name = thread.getName();
        C24362h.m61210e(name, "t.name");
        if (C24179b.m60559G(name, "veriff", false)) {
            return true;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        C24362h.m61210e(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C24362h.m61210e(stackTraceElement, "it");
            String className = stackTraceElement.getClassName();
            C24362h.m61210e(className, "it.className");
            if (C24179b.m60559G(className, "veriff", false)) {
                return true;
            }
        }
        return false;
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/errors/VeriffExceptionHandler$Companion;", "", "Lbf0/d;", "activateSDK", "deactivateSDK", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "install", "", "handlerInstalled", "Z", "isSDKActive", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kg$a */
    public static final class C21912a {
        private C21912a() {
        }

        public /* synthetic */ C21912a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo55695a(C21910kf kfVar) {
            C24362h.m61211f(kfVar, "errorReporter");
            if (!C21911kg.f55392d && C21911kg.f55393e) {
                Thread.setDefaultUncaughtExceptionHandler(new C21911kg(kfVar, Thread.getDefaultUncaughtExceptionHandler()));
                C21911kg.f55392d = true;
            }
        }

        /* renamed from: b */
        public final void mo55696b() {
            C21911kg.f55393e = false;
        }

        /* renamed from: a */
        public final void mo55694a() {
            C21911kg.f55393e = true;
        }
    }
}
