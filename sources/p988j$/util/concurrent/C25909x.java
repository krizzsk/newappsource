package p988j$.util.concurrent;

import java.security.PrivilegedAction;

/* renamed from: j$.util.concurrent.x */
final class C25909x implements PrivilegedAction {
    C25909x() {
    }

    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
