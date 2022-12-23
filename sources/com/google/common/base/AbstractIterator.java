package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p624ld.C18193f;
import p624ld.C18195h;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

public abstract class AbstractIterator<T> implements Iterator<T>, p988j$.util.Iterator {

    /* renamed from: b */
    public State f36153b = State.NOT_READY;

    /* renamed from: c */
    public String f36154c;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C14347a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36155a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.base.AbstractIterator$State[] r0 = com.google.common.base.AbstractIterator.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36155a = r0
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36155a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.base.AbstractIterator$State r1 = com.google.common.base.AbstractIterator.State.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.AbstractIterator.C14347a.<clinit>():void");
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        boolean z;
        String str;
        int i;
        State state = this.f36153b;
        State state2 = State.FAILED;
        if (state != state2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = C14347a.f36155a[state.ordinal()];
            if (i2 == 1) {
                return false;
            }
            if (i2 == 2) {
                return true;
            }
            this.f36153b = state2;
            C18195h.C18196a aVar = (C18195h.C18196a) this;
            int i3 = aVar.f46445g;
            while (true) {
                int i4 = aVar.f46445g;
                if (i4 == -1) {
                    aVar.f36153b = State.DONE;
                    str = null;
                    break;
                }
                C18193f fVar = (C18193f) aVar;
                int b = fVar.f46437i.f46438a.mo50601b(i4, fVar.f46442d);
                if (b == -1) {
                    b = aVar.f46442d.length();
                    aVar.f46445g = -1;
                } else {
                    aVar.f46445g = b + 1;
                }
                int i5 = aVar.f46445g;
                if (i5 == i3) {
                    int i6 = i5 + 1;
                    aVar.f46445g = i6;
                    if (i6 > aVar.f46442d.length()) {
                        aVar.f46445g = -1;
                    }
                } else {
                    while (i3 < b && aVar.f46443e.mo50602c(aVar.f46442d.charAt(i3))) {
                        i3++;
                    }
                    while (i > i3) {
                        int i7 = i - 1;
                        if (!aVar.f46443e.mo50602c(aVar.f46442d.charAt(i7))) {
                            break;
                        }
                        b = i7;
                    }
                    if (!aVar.f46444f || i3 != i) {
                        int i8 = aVar.f46446h;
                    } else {
                        i3 = aVar.f46445g;
                    }
                }
            }
            int i82 = aVar.f46446h;
            if (i82 == 1) {
                i = aVar.f46442d.length();
                aVar.f46445g = -1;
                while (i > i3) {
                    int i9 = i - 1;
                    if (!aVar.f46443e.mo50602c(aVar.f46442d.charAt(i9))) {
                        break;
                    }
                    i = i9;
                }
            } else {
                aVar.f46446h = i82 - 1;
            }
            str = aVar.f46442d.subSequence(i3, i).toString();
            this.f36154c = str;
            if (this.f36153b == State.DONE) {
                return false;
            }
            this.f36153b = State.READY;
            return true;
        }
        throw new IllegalStateException();
    }

    public final T next() {
        if (hasNext()) {
            this.f36153b = State.NOT_READY;
            T t = this.f36154c;
            this.f36154c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
