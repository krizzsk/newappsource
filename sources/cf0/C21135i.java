package cf0;

import java.util.Iterator;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: cf0.i */
public abstract class C21135i implements Iterator<Character>, C24497a, p988j$.util.Iterator {
    /* renamed from: b */
    public abstract char mo53374b();

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo53374b());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
