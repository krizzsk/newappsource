package o00;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o00.h */
public class C18671h extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: g */
    public final int[] f47548g;

    /* renamed from: o00.h$a */
    public class C18672a extends RecyclerView.C1119a0 {
        public C18672a(View view) {
            super(view);
        }
    }

    public C18671h(int... iArr) {
        this.f47548g = iArr;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        return this.f47548g.length;
    }

    public final long getItemId(int i) {
        return (long) this.f47548g[i];
    }

    public final int getItemViewType(int i) {
        return this.f47548g[i];
    }

    public void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
    }

    public RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C18672a(C13715c.m34239e(viewGroup, i, viewGroup, false));
    }
}
