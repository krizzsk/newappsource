package p265tb;

import com.google.android.gms.location.places.Place;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p100gb.C4987o;
import p112ha.C5196m0;
import p112ha.C5199n0;
import p112ha.C5205s;
import p265tb.C6647c;

/* renamed from: tb.b */
public final /* synthetic */ class C6646b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C6647c.C6648a.C6649a.C6650a f20647b;

    /* renamed from: c */
    public final /* synthetic */ int f20648c;

    /* renamed from: d */
    public final /* synthetic */ long f20649d;

    /* renamed from: e */
    public final /* synthetic */ long f20650e;

    public /* synthetic */ C6646b(C6647c.C6648a.C6649a.C6650a aVar, int i, long j, long j2) {
        this.f20647b = aVar;
        this.f20648c = i;
        this.f20649d = j;
        this.f20650e = j2;
    }

    public final void run() {
        C4987o.C4988a aVar;
        T t;
        T next;
        C6647c.C6648a.C6649a.C6650a aVar2 = this.f20647b;
        int i = this.f20648c;
        long j = this.f20649d;
        long j2 = this.f20650e;
        C5196m0 m0Var = (C5196m0) aVar2.f20653b;
        C5196m0.C5197a aVar3 = m0Var.f17273d;
        if (aVar3.f17279b.isEmpty()) {
            aVar = null;
        } else {
            ImmutableList<C4987o.C4988a> immutableList = aVar3.f17279b;
            if (!(immutableList instanceof List)) {
                Iterator<T> it = immutableList.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                t = next;
            } else if (!immutableList.isEmpty()) {
                t = immutableList.get(immutableList.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
            aVar = (C4987o.C4988a) t;
        }
        C5199n0.C5200a k0 = m0Var.mo20915k0(aVar);
        m0Var.mo20918n0(k0, Place.TYPE_FLOOR, new C5205s(k0, i, j, j2, 0));
    }
}
