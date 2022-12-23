package kotlin.collections;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kf0.C23767b;
import mf0.C24362h;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: kotlin.collections.a */
public abstract class C23814a<T> implements Iterator<T>, C24497a, p988j$.util.Iterator {

    /* renamed from: b */
    public State f60176b = State.NotReady;

    /* renamed from: c */
    public T f60177c;

    /* renamed from: kotlin.collections.a$a */
    public /* synthetic */ class C23815a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60178a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kotlin.collections.State[] r0 = kotlin.collections.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.State r1 = kotlin.collections.State.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.collections.State r1 = kotlin.collections.State.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f60178a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C23814a.C23815a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final void mo59160b() {
        this.f60176b = State.Done;
    }

    /* renamed from: d */
    public final void mo59161d(File file) {
        this.f60177c = file;
        this.f60176b = State.Ready;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        boolean z;
        File file;
        File a;
        State state = this.f60176b;
        State state2 = State.Failed;
        if (state != state2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C23815a.f60178a[state.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                this.f60176b = state2;
                C23767b.C23769b bVar = (C23767b.C23769b) this;
                while (true) {
                    C23767b.C23774c peek = bVar.f60041d.peek();
                    if (peek == null) {
                        file = null;
                        break;
                    }
                    a = peek.mo59007a();
                    if (a == null) {
                        bVar.f60041d.pop();
                    } else if (C24362h.m61206a(a, peek.f60054a) || !a.isDirectory() || bVar.f60041d.size() >= C23767b.this.f60040c) {
                        file = a;
                    } else {
                        bVar.f60041d.push(bVar.mo59006e(a));
                    }
                }
                file = a;
                if (file != null) {
                    bVar.mo59161d(file);
                } else {
                    bVar.f60176b = State.Done;
                }
                if (this.f60176b == State.Ready) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final T next() {
        if (hasNext()) {
            this.f60176b = State.NotReady;
            return this.f60177c;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
