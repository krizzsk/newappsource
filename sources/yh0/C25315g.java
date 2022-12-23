package yh0;

import bi0.C21079q;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p389bl.C13637c;
import wh0.C25154a0;

/* renamed from: yh0.g */
public final class C25315g<E> extends C25324p implements C25322n<E> {

    /* renamed from: e */
    public final Throwable f63625e;

    public C25315g(Throwable th) {
        this.f63625e = th;
    }

    /* renamed from: a */
    public final C21079q mo60334a(Object obj) {
        return C13637c.f33642i;
    }

    /* renamed from: b */
    public final Object mo61907b() {
        return this;
    }

    /* renamed from: e */
    public final void mo60335e(E e) {
    }

    /* renamed from: q */
    public final void mo60354q() {
    }

    /* renamed from: r */
    public final Object mo60355r() {
        return this;
    }

    /* renamed from: s */
    public final void mo60356s(C25315g<?> gVar) {
    }

    /* renamed from: t */
    public final C21079q mo60357t() {
        return C13637c.f33642i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Closed@");
        k.append(C25154a0.m63137b(this));
        k.append('[');
        k.append(this.f63625e);
        k.append(']');
        return k.toString();
    }

    /* renamed from: v */
    public final Throwable mo61908v() {
        Throwable th = this.f63625e;
        return th == null ? new ClosedReceiveChannelException() : th;
    }
}
