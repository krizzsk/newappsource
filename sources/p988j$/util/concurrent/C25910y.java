package p988j$.util.concurrent;

/* renamed from: j$.util.concurrent.y */
final class C25910y extends ThreadLocal {
    C25910y() {
    }

    /* access modifiers changed from: protected */
    public final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
