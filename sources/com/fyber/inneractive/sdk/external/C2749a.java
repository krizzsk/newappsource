package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;

/* renamed from: com.fyber.inneractive.sdk.external.a */
public class C2749a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f9530a;

    /* renamed from: b */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f9531b;

    public C2749a(SharedPreferences sharedPreferences, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f9530a = sharedPreferences;
        this.f9531b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.f9530a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (stringBuffer.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", stringBuffer).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f9531b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
