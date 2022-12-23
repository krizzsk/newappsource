package p187nb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p126ib.C5332a;
import p126ib.C5336d;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: nb.d */
public final class C5890d implements C5336d {

    /* renamed from: b */
    public final List<List<C5332a>> f18943b;

    /* renamed from: c */
    public final List<Long> f18944c;

    public C5890d(ArrayList arrayList, ArrayList arrayList2) {
        this.f18943b = arrayList;
        this.f18944c = arrayList2;
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        int i;
        List<Long> list = this.f18944c;
        Long valueOf = Long.valueOf(j);
        int i2 = C6774a0.f20959a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i = binarySearch;
                }
                binarySearch++;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i = binarySearch;
        }
        if (i < this.f18944c.size()) {
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        int i;
        List<Long> list = this.f18944c;
        Long valueOf = Long.valueOf(j);
        int i2 = C6774a0.f20959a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || list.get(binarySearch).compareTo(valueOf) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (list.get(binarySearch).compareTo(valueOf) != 0);
            i = binarySearch + 1;
        }
        if (i == -1) {
            return Collections.emptyList();
        }
        return this.f18943b.get(i);
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        if (i >= this.f18944c.size()) {
            z2 = false;
        }
        C17875h.m44301k(z2);
        return this.f18944c.get(i).longValue();
    }

    /* renamed from: f */
    public final int mo21124f() {
        return this.f18944c.size();
    }
}
