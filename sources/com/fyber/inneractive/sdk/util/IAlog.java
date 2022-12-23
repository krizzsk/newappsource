package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.C2815a;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IAlog {

    /* renamed from: a */
    public static int f12814a = 4;

    /* renamed from: b */
    public static final C2815a f12815b = new C2815a();

    /* renamed from: c */
    public static final List<FMPLogger> f12816c = new C3667a();

    /* renamed from: com.fyber.inneractive.sdk.util.IAlog$a */
    public class C3667a extends CopyOnWriteArrayList<FMPLogger> {
        public C3667a() {
            add(IAlog.f12815b);
        }
    }

    /* renamed from: a */
    public static String m9898a(Class<?> cls) {
        StringBuilder k = C13555b.m33972k("(");
        k.append(Thread.currentThread().getName());
        k.append("): ");
        k.append(cls.getSimpleName());
        k.append("[");
        k.append(Integer.toHexString(System.identityHashCode(cls)));
        k.append("] ");
        return k.toString();
    }

    /* renamed from: b */
    public static void m9903b(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, (Throwable) null, objArr);
        }
    }

    /* renamed from: c */
    public static void m9904c(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    /* renamed from: d */
    public static void m9905d(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    /* renamed from: e */
    public static void m9906e(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    /* renamed from: a */
    public static String m9899a(Object obj) {
        StringBuilder k = C13555b.m33972k("(");
        k.append(Thread.currentThread().getName());
        k.append("): ");
        k.append(obj.getClass().getSimpleName());
        k.append("[");
        k.append(Integer.toHexString(System.identityHashCode(obj)));
        k.append("] ");
        return k.toString();
    }

    /* renamed from: a */
    public static void m9902a(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    /* renamed from: a */
    public static void m9901a(String str, Throwable th, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    /* renamed from: a */
    public static void m9900a(int i, Exception exc, String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f12816c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(i, (Exception) null, str, objArr);
        }
    }
}
