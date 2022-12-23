package p988j$.util;

import com.appboy.support.AppboyImageUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.Z */
class C25877Z implements Spliterator {

    /* renamed from: a */
    private final Collection f64514a;

    /* renamed from: b */
    private Iterator f64515b;

    /* renamed from: c */
    private final int f64516c;

    /* renamed from: d */
    private long f64517d;

    /* renamed from: e */
    private int f64518e;

    public C25877Z(Collection collection, int i) {
        this.f64514a = collection;
        this.f64515b = null;
        this.f64516c = (i & 4096) == 0 ? i | 64 | Spliterator.SUBSIZED : i;
    }

    public C25877Z(Iterator it) {
        this.f64514a = null;
        this.f64515b = it;
        this.f64517d = Long.MAX_VALUE;
        this.f64516c = 0;
    }

    public C25877Z(Iterator it, long j, int i) {
        this.f64514a = null;
        this.f64515b = it;
        this.f64517d = j;
        this.f64516c = (i & 4096) == 0 ? i | 64 | Spliterator.SUBSIZED : i;
    }

    public final int characteristics() {
        return this.f64516c;
    }

    public final long estimateSize() {
        if (this.f64515b != null) {
            return this.f64517d;
        }
        this.f64515b = this.f64514a.iterator();
        long size = (long) this.f64514a.size();
        this.f64517d = size;
        return size;
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f64515b;
        if (it == null) {
            it = this.f64514a.iterator();
            this.f64515b = it;
            this.f64517d = (long) this.f64514a.size();
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    public Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f64515b == null) {
            this.f64515b = this.f64514a.iterator();
            this.f64517d = (long) this.f64514a.size();
        }
        if (!this.f64515b.hasNext()) {
            return false;
        }
        consumer.accept(this.f64515b.next());
        return true;
    }

    public final Spliterator trySplit() {
        long j;
        java.util.Iterator it = this.f64515b;
        if (it == null) {
            it = this.f64514a.iterator();
            this.f64515b = it;
            j = (long) this.f64514a.size();
            this.f64517d = j;
        } else {
            j = this.f64517d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f64518e + 1024;
        if (((long) i) > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = AppboyImageUtils.MAX_IMAGE_CACHE_SIZE_BYTES;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i || !it.hasNext()) {
                this.f64518e = i2;
                long j2 = this.f64517d;
            }
            objArr[i2] = it.next();
            i2++;
            break;
        } while (!it.hasNext());
        this.f64518e = i2;
        long j22 = this.f64517d;
        if (j22 != Long.MAX_VALUE) {
            this.f64517d = j22 - ((long) i2);
        }
        return new C25870S(objArr, 0, i2, this.f64516c);
    }
}
