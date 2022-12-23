package o00;

import aa0.C7527d;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.C1119a0;
import c00.C13717b;
import java.util.ArrayList;

/* renamed from: o00.e */
public abstract class C18668e<VH extends RecyclerView.C1119a0, T extends RecyclerView.Adapter<VH>, F> extends RecyclerView.Adapter<VH> {

    /* renamed from: g */
    public final T f47543g;

    /* renamed from: h */
    public F f47544h;

    /* renamed from: i */
    public final ArrayList f47545i;

    public C18668e(RecyclerView.Adapter adapter, C7527d dVar) {
        this.f47543g = adapter;
        this.f47544h = dVar;
        this.f47545i = new ArrayList(adapter.getItemCount());
        mo51049j();
        adapter.registerAdapterDataObserver(new C18667d(this));
    }

    public int getItemCount() {
        return this.f47545i.size();
    }

    public final long getItemId(int i) {
        return this.f47543g.getItemId(((Integer) this.f47545i.get(i)).intValue());
    }

    public int getItemViewType(int i) {
        return this.f47543g.getItemViewType(((Integer) this.f47545i.get(i)).intValue());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* renamed from: j */
    public final void mo51049j() {
        this.f47545i.clear();
        T t = this.f47543g;
        F f = this.f47544h;
        ArrayList arrayList = this.f47545i;
        int itemCount = t.getItemCount();
        if (f == null) {
            arrayList.addAll(new C13717b.C13718a(0, itemCount));
        } else {
            for (int i = 0; i < itemCount; i++) {
                if (mo45935k(t, i, f)) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public abstract boolean mo45935k(T t, int i, F f);

    public void onBindViewHolder(VH vh, int i) {
        this.f47543g.onBindViewHolder(vh, ((Integer) this.f47545i.get(i)).intValue());
    }

    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f47543g.onCreateViewHolder(viewGroup, i);
    }

    public final void setHasStableIds(boolean z) {
        this.f47543g.setHasStableIds(z);
    }
}
