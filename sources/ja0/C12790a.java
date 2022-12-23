package ja0;

import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ja0.a */
public abstract class C12790a<T> extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final ArrayList f31613g;

    public C12790a(List<T> list) {
        C21100e.m49373x(list, "data");
        this.f31613g = new ArrayList(list);
    }

    public final int getItemCount() {
        return this.f31613g.size();
    }

    /* renamed from: j */
    public final T mo39636j(int i) {
        return this.f31613g.get(i);
    }

    /* renamed from: k */
    public final void mo39637k(List<T> list) {
        this.f31613g.clear();
        this.f31613g.addAll(list);
        notifyDataSetChanged();
    }
}
