package p178n2;

import androidx.paging.DataSource;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p178n2.C5833n;
import wh0.C25189k;
import wh0.C25192l;

/* renamed from: n2.p */
public final class C5839p extends C5833n.C5836c<Object> {

    /* renamed from: a */
    public final /* synthetic */ C5833n.C5837d f18819a;

    /* renamed from: b */
    public final /* synthetic */ C5833n<Object> f18820b;

    /* renamed from: c */
    public final /* synthetic */ C25189k<DataSource.C1084a<Object>> f18821c;

    public C5839p(C5833n.C5837d dVar, C5833n nVar, C25192l lVar) {
        this.f18819a = dVar;
        this.f18820b = nVar;
        this.f18821c = lVar;
    }

    /* renamed from: a */
    public final void mo21714a(List<Object> list) {
        Integer num;
        C24362h.m61211f(list, "data");
        int i = this.f18819a.f18815a;
        if (i == 0) {
            num = null;
        } else {
            num = Integer.valueOf(i);
        }
        Integer num2 = num;
        if (this.f18820b.f4103a.f18784e) {
            this.f18821c.resumeWith(new DataSource.C1084a(EmptyList.f60173b, (Integer) null, (Integer) null, 0, 0));
            return;
        }
        this.f18821c.resumeWith(new DataSource.C1084a(list, num2, Integer.valueOf(list.size() + this.f18819a.f18815a), Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
