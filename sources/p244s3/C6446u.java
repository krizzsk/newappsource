package p244s3;

import com.google.android.exoplayer2.p052ui.C4047p;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import e90.C12618b;
import java.util.Comparator;
import p030bo.app.C1647n6;
import p030bo.app.C1710v4;
import p427cu.C16497a;
import p634ln.C18247a;
import p752qn.C19150h;

/* renamed from: s3.u */
public final /* synthetic */ class C6446u implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ int f20145b;

    public /* synthetic */ C6446u(int i) {
        this.f20145b = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f20145b) {
            case 0:
                return C1647n6.m4529a((C1710v4) obj, (C1710v4) obj2);
            case 1:
                C4047p.C4049b bVar = (C4047p.C4049b) obj;
                C4047p.C4049b bVar2 = (C4047p.C4049b) obj2;
                int compare = Integer.compare(bVar2.f14495b, bVar.f14495b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = bVar.f14496c.compareTo(bVar2.f14496c);
                if (compareTo != 0) {
                    return compareTo;
                }
                return bVar.f14497d.compareTo(bVar2.f14497d);
            case 2:
                return ((C18247a) obj).f46553b.compareTo(((C18247a) obj2).f46553b);
            case 3:
                C19150h hVar = (C19150h) obj;
                C19150h hVar2 = (C19150h) obj2;
                int i = (hVar.f48722o.f48674e.getTime() > hVar2.f48722o.f48674e.getTime() ? 1 : (hVar.f48722o.f48674e.getTime() == hVar2.f48722o.f48674e.getTime() ? 0 : -1));
                if (i == 0) {
                    return hVar.f48713f.compareTo(hVar2.f48713f);
                }
                if (i > 0) {
                    return -1;
                }
                return 1;
            case 4:
                int i2 = C16497a.f43085j;
                return Float.compare(((C16497a.C16498a) obj).f43094a, ((C16497a.C16498a) obj2).f43094a);
            default:
                int i3 = C12618b.f31181w;
                return ((PurchaseStation) obj).f23420c.compareToIgnoreCase(((PurchaseStation) obj2).f23420c);
        }
    }
}
