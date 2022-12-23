package p178n2;

import androidx.paging.DataSource;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p001a0.C0016g;
import p178n2.C5833n;
import wh0.C25189k;
import wh0.C25192l;

/* renamed from: n2.o */
public final class C5838o extends C5833n.C5834a<Object> {

    /* renamed from: a */
    public final /* synthetic */ C5833n<Object> f18816a;

    /* renamed from: b */
    public final /* synthetic */ C25189k<DataSource.C1084a<Object>> f18817b;

    /* renamed from: c */
    public final /* synthetic */ C5833n.C5835b f18818c;

    public C5838o(C5833n nVar, C25192l lVar, C5833n.C5835b bVar) {
        this.f18816a = nVar;
        this.f18817b = lVar;
        this.f18818c = bVar;
    }

    /* renamed from: a */
    public final void mo21713a(int i, int i2, List list) {
        Integer num;
        Integer num2;
        int i3;
        C24362h.m61211f(list, "data");
        if (this.f18816a.f4103a.f18784e) {
            this.f18817b.resumeWith(new DataSource.C1084a(EmptyList.f60173b, (Integer) null, (Integer) null, 0, 0));
            return;
        }
        int size = list.size() + i;
        C5833n.C5835b bVar = this.f18818c;
        if (i == 0) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        if (size == i2) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(size);
        }
        DataSource.C1084a aVar = new DataSource.C1084a(list, num, num2, i, (i2 - list.size()) - i);
        if (bVar.f18814b) {
            int i4 = bVar.f18813a;
            if (aVar.f4107d == Integer.MIN_VALUE || (i3 = aVar.f4108e) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            } else if (i3 > 0 && aVar.f4104a.size() % i4 != 0) {
                int i5 = aVar.f4107d;
                StringBuilder k = C13555b.m33972k("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize ");
                k.append(aVar.f4104a.size());
                k.append(", position ");
                C0016g.m41y(k, aVar.f4107d, ", totalCount ", aVar.f4104a.size() + i5 + aVar.f4108e, ", pageSize ");
                k.append(i4);
                throw new IllegalArgumentException(k.toString());
            } else if (aVar.f4107d % i4 != 0) {
                StringBuilder k2 = C13555b.m33972k("Initial load must be pageSize aligned.Position = ");
                k2.append(aVar.f4107d);
                k2.append(", pageSize = ");
                k2.append(i4);
                throw new IllegalArgumentException(k2.toString());
            }
        }
        this.f18817b.resumeWith(aVar);
    }
}
