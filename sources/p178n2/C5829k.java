package p178n2;

import androidx.recyclerview.widget.C1208m;
import com.moovit.home.lines.search.C16004b;

/* renamed from: n2.k */
public final class C5829k extends C1208m.C1210b {

    /* renamed from: a */
    public final /* synthetic */ C5828j<Object> f18794a;

    /* renamed from: b */
    public final /* synthetic */ C5828j<Object> f18795b;

    /* renamed from: c */
    public final /* synthetic */ C1208m.C1213e<Object> f18796c;

    /* renamed from: d */
    public final /* synthetic */ int f18797d;

    /* renamed from: e */
    public final /* synthetic */ int f18798e;

    public C5829k(C5831m mVar, C5831m mVar2, C1208m.C1213e eVar, int i, int i2) {
        this.f18794a = mVar;
        this.f18795b = mVar2;
        this.f18796c = eVar;
        this.f18797d = i;
        this.f18798e = i2;
    }

    public final boolean areContentsTheSame(int i, int i2) {
        Object s = this.f18794a.mo21706s(i);
        Object s2 = this.f18795b.mo21706s(i2);
        if (s == s2) {
            return true;
        }
        ((C16004b.C16005a) this.f18796c).getClass();
        C16004b.C16006b bVar = (C16004b.C16006b) s;
        C16004b.C16006b bVar2 = (C16004b.C16006b) s2;
        return true;
    }

    public final boolean areItemsTheSame(int i, int i2) {
        Object s = this.f18794a.mo21706s(i);
        Object s2 = this.f18795b.mo21706s(i2);
        if (s == s2) {
            return true;
        }
        ((C16004b.C16005a) this.f18796c).getClass();
        return ((C16004b.C16006b) s).equals((C16004b.C16006b) s2);
    }

    public final Object getChangePayload(int i, int i2) {
        if (this.f18794a.mo21706s(i) == this.f18795b.mo21706s(i2)) {
            return Boolean.TRUE;
        }
        this.f18796c.getClass();
        return null;
    }

    public final int getNewListSize() {
        return this.f18798e;
    }

    public final int getOldListSize() {
        return this.f18797d;
    }
}
