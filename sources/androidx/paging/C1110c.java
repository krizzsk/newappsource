package androidx.paging;

import androidx.paging.C1103a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1119a0;
import bf0.C21050d;
import lf0.C24240p;

/* renamed from: androidx.paging.c */
public abstract class C1110c<T, VH extends RecyclerView.C1119a0> extends RecyclerView.Adapter<VH> {

    /* renamed from: g */
    public final C1103a<T> f4182g;

    /* renamed from: h */
    public final C24240p<PagedList<T>, PagedList<T>, C21050d> f4183h;

    public C1110c() {
        PagedListAdapter$listener$1 pagedListAdapter$listener$1 = new PagedListAdapter$listener$1(this);
        this.f4183h = pagedListAdapter$listener$1;
        C1103a<T> aVar = new C1103a<>(this);
        this.f4182g = aVar;
        aVar.f4164d.add(new C1103a.C1104a(pagedListAdapter$listener$1));
    }

    public final int getItemCount() {
        C1103a<T> aVar = this.f4182g;
        PagedList<T> pagedList = aVar.f4166f;
        if (pagedList == null) {
            pagedList = aVar.f4165e;
        }
        if (pagedList == null) {
            return 0;
        }
        return pagedList.size();
    }

    /* renamed from: j */
    public final T mo4436j(int i) {
        C1103a<T> aVar = this.f4182g;
        PagedList<T> pagedList = aVar.f4166f;
        PagedList<T> pagedList2 = aVar.f4165e;
        if (pagedList != null) {
            return pagedList.get(i);
        }
        if (pagedList2 != null) {
            pagedList2.mo4412u(i);
            return pagedList2.get(i);
        }
        throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
    }
}
