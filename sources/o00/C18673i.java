package o00;

import androidx.recyclerview.widget.C1208m;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;
import p977zz.C20975x0;

/* renamed from: o00.i */
public final class C18673i<T> extends C1208m.C1210b {

    /* renamed from: a */
    public final List<T> f47549a;

    /* renamed from: b */
    public final List<T> f47550b;

    public C18673i(ArrayList arrayList, List list) {
        C21100e.m49373x(arrayList, "oldData");
        this.f47549a = arrayList;
        C21100e.m49373x(list, "newData");
        this.f47550b = list;
    }

    public final boolean areContentsTheSame(int i, int i2) {
        return false;
    }

    public final boolean areItemsTheSame(int i, int i2) {
        return C20975x0.m49118e(this.f47549a.get(i), this.f47550b.get(i2));
    }

    public final int getNewListSize() {
        return this.f47550b.size();
    }

    public final int getOldListSize() {
        return this.f47549a.size();
    }
}
