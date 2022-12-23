package p074e8;

import android.hardware.SensorManager;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import p262t8.C6606a;

/* renamed from: e8.b */
public final class C4599b {

    /* renamed from: a */
    public static final C4599b f15801a = new C4599b();

    /* renamed from: b */
    public static final C4612g f15802b = new C4612g();

    /* renamed from: c */
    public static SensorManager f15803c;

    /* renamed from: d */
    public static C4608f f15804d;

    /* renamed from: e */
    public static String f15805e;

    /* renamed from: f */
    public static final AtomicBoolean f15806f = new AtomicBoolean(true);

    /* renamed from: g */
    public static final AtomicBoolean f15807g = new AtomicBoolean(false);

    /* renamed from: h */
    public static volatile boolean f15808h;

    /* renamed from: a */
    public static final String m11911a() {
        Class<C4599b> cls = C4599b.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            if (f15805e == null) {
                f15805e = UUID.randomUUID().toString();
            }
            String str = f15805e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }
}
