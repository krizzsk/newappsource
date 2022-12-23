package p242s1;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: s1.l0 */
public final class C6374l0 implements Iterator<View>, C24497a, p988j$.util.Iterator {

    /* renamed from: b */
    public int f20029b;

    /* renamed from: c */
    public final /* synthetic */ ViewGroup f20030c;

    public C6374l0(ViewGroup viewGroup) {
        this.f20030c = viewGroup;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f20029b < this.f20030c.getChildCount();
    }

    public final Object next() {
        ViewGroup viewGroup = this.f20030c;
        int i = this.f20029b;
        this.f20029b = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void remove() {
        ViewGroup viewGroup = this.f20030c;
        int i = this.f20029b - 1;
        this.f20029b = i;
        viewGroup.removeViewAt(i);
    }
}
