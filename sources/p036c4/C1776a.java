package p036c4;

import p043ch.qos.logback.core.spi.FilterReply;
import p271u4.C6693d;
import p271u4.C6695f;

/* renamed from: c4.a */
public abstract class C1776a extends C6693d implements C6695f {

    /* renamed from: e */
    public boolean f6245e = false;

    public final boolean isStarted() {
        return this.f6245e;
    }

    /* renamed from: m */
    public abstract FilterReply mo6595m();

    public final void start() {
        this.f6245e = true;
    }

    public final void stop() {
        this.f6245e = false;
    }
}
