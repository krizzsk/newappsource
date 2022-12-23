package p977zz;

import android.os.ConditionVariable;

/* renamed from: zz.q0 */
public class C20960q0<T> implements C20935e<T> {

    /* renamed from: b */
    public final ConditionVariable f52709b = new ConditionVariable(false);

    /* renamed from: c */
    public T f52710c;

    /* renamed from: a */
    public final C20944i0<Boolean, T> mo53033a(long j) {
        if (this.f52709b.block(j)) {
            return new C20944i0<>(Boolean.TRUE, this.f52710c);
        }
        return new C20944i0<>(Boolean.FALSE, null);
    }

    public final void invoke(T t) {
        this.f52710c = t;
        this.f52709b.open();
    }
}
