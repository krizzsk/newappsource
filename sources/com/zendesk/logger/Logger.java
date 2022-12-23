package com.zendesk.logger;

import java.util.ArrayList;
import java.util.Locale;
import p988j$.util.DesugarTimeZone;

public final class Logger {

    /* renamed from: a */
    public static C23262c f59014a;

    public enum Priority {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);
        
        /* access modifiers changed from: private */
        public final int priority;

        private Priority(int i) {
            this.priority = i;
        }
    }

    /* renamed from: com.zendesk.logger.Logger$a */
    public static class C23260a implements C23262c {
    }

    /* renamed from: com.zendesk.logger.Logger$b */
    public static class C23261b implements C23262c {
    }

    /* renamed from: com.zendesk.logger.Logger$c */
    public interface C23262c {
    }

    static {
        DesugarTimeZone.getTimeZone("UTC");
        new ArrayList();
        try {
            Class.forName("android.os.Build");
            f59014a = new C23260a();
        } catch (ClassNotFoundException unused) {
            if (f59014a == null) {
                f59014a = new C23261b();
            }
        } catch (Throwable th) {
            if (f59014a == null) {
                f59014a = new C23261b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m57302a(String str, Object... objArr) {
        Priority priority = Priority.VERBOSE;
        m57305d(str, objArr);
    }

    /* renamed from: b */
    public static void m57303b(String str, Object... objArr) {
        Priority priority = Priority.VERBOSE;
        m57305d(str, objArr);
    }

    /* renamed from: c */
    public static void m57304c(String str, Object... objArr) {
        Priority priority = Priority.VERBOSE;
        m57305d(str, objArr);
    }

    /* renamed from: d */
    public static void m57305d(String str, Object... objArr) {
        if (objArr.length > 0) {
            String.format(Locale.US, str, objArr);
        }
    }

    /* renamed from: e */
    public static void m57306e(String str, Object... objArr) {
        Priority priority = Priority.VERBOSE;
        m57305d(str, objArr);
    }

    /* renamed from: f */
    public static void m57307f(String str, Object... objArr) {
        Priority priority = Priority.VERBOSE;
        m57305d(str, objArr);
    }
}
