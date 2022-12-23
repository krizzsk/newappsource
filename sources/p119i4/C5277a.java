package p119i4;

import p043ch.qos.logback.core.spi.FilterReply;
import p271u4.C6693d;
import p271u4.C6695f;

/* renamed from: i4.a */
public abstract class C5277a<E> extends C6693d implements C6695f {

    /* renamed from: e */
    public boolean f17427e = false;

    public final boolean isStarted() {
        return this.f17427e;
    }

    /* renamed from: m */
    public abstract FilterReply mo21079m();

    public final void start() {
        this.f17427e = true;
    }

    public final void stop() {
        this.f17427e = false;
    }
}
