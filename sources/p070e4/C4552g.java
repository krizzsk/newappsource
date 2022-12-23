package p070e4;

import androidx.lifecycle.C1042u;
import p001a0.C0016g;
import p023b4.C1471b;
import p043ch.qos.logback.core.spi.FilterReply;
import p271u4.C6693d;
import p283v4.C6862g;

/* renamed from: e4.g */
public abstract class C4552g<E> extends C6693d implements C4546a<E> {

    /* renamed from: e */
    public boolean f15688e = false;

    /* renamed from: f */
    public ThreadLocal<Boolean> f15689f = new ThreadLocal<>();

    /* renamed from: g */
    public String f15690g;

    /* renamed from: h */
    public C1042u f15691h = new C1042u(2);

    /* renamed from: i */
    public int f15692i = 0;

    /* renamed from: j */
    public int f15693j = 0;

    /* renamed from: d */
    public final void mo20052d(C1471b bVar) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.f15689f.get())) {
            try {
                this.f15689f.set(bool);
                if (!this.f15688e) {
                    int i = this.f15692i;
                    this.f15692i = i + 1;
                    if (i < 3) {
                        mo22866j(new C6862g("Attempted to append to non started appender [" + this.f15690g + "].", this));
                    }
                } else if (this.f15691h.mo4331f(bVar) != FilterReply.DENY) {
                    mo20065m(bVar);
                    this.f15689f.set(Boolean.FALSE);
                    return;
                }
                this.f15689f.set(Boolean.FALSE);
            } catch (Exception e) {
                int i2 = this.f15693j;
                this.f15693j = i2 + 1;
                if (i2 < 3) {
                    mo21727f("Appender [" + this.f15690g + "] failed to append.", e);
                }
            } catch (Throwable th) {
                this.f15689f.set(Boolean.FALSE);
                throw th;
            }
        }
    }

    public final String getName() {
        return this.f15690g;
    }

    /* renamed from: h */
    public final void mo20054h(String str) {
        this.f15690g = str;
    }

    public final boolean isStarted() {
        return this.f15688e;
    }

    /* renamed from: m */
    public abstract void mo20065m(C1471b bVar);

    public void start() {
        this.f15688e = true;
    }

    public void stop() {
        this.f15688e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        return C0016g.m31o(sb, this.f15690g, "]");
    }
}
