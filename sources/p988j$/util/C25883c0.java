package p988j$.util;

import java.security.AccessController;

/* renamed from: j$.util.c0 */
abstract class C25883c0 {

    /* renamed from: a */
    static final boolean f64528a = ((Boolean) AccessController.doPrivileged(new C25881b0())).booleanValue();

    /* renamed from: a */
    static void m64722a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
