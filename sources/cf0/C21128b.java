package cf0;

import java.util.AbstractList;
import nf0.C24499c;

/* renamed from: cf0.b */
public abstract class C21128b<E> extends AbstractList<E> implements C24499c {
    /* renamed from: e */
    public abstract int mo53352e();

    /* renamed from: i */
    public abstract E mo53353i(int i);

    public final /* bridge */ E remove(int i) {
        return mo53353i(i);
    }

    public final /* bridge */ int size() {
        return mo53352e();
    }
}
