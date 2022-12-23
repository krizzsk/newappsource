package com.google.common.collect;

import java.util.NoSuchElementException;

public abstract class AbstractIterator<T> extends C14439w0<T> {

    /* renamed from: b */
    public State f36156b = State.NOT_READY;

    /* renamed from: c */
    public T f36157c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C14348a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36158a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.AbstractIterator$State[] r0 = com.google.common.collect.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36158a = r0
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36158a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.AbstractIterator$State r1 = com.google.common.collect.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractIterator.C14348a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public abstract T mo42962b();

    public final boolean hasNext() {
        boolean z;
        State state = this.f36156b;
        State state2 = State.FAILED;
        if (state != state2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C14348a.f36158a[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            this.f36156b = state2;
            this.f36157c = mo42962b();
            if (this.f36156b == State.DONE) {
                return false;
            }
            this.f36156b = State.READY;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f36156b = State.NOT_READY;
            T t = this.f36157c;
            this.f36157c = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}
