package c00;

import java.util.ListIterator;

/* renamed from: c00.o */
public abstract class C13734o<E> extends C13731l<E> {
    public C13734o(ListIterator<E> listIterator) {
        super(listIterator);
    }

    public final void add(E e) {
        super.add(e);
        mo40649e();
    }

    /* renamed from: e */
    public abstract void mo40649e();

    public final void remove() {
        super.remove();
        mo40649e();
    }

    public final void set(E e) {
        super.set(e);
        mo40649e();
    }
}
