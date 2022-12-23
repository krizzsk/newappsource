package ja0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import p824tp.C19740r;
import p824tp.C19742t;

/* renamed from: ja0.c */
public final class C12793c extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: ja0.c$a */
    public class C12794a extends RecyclerView.C1119a0 {
        public C12794a(View view) {
            super(view);
        }
    }

    public final int getItemCount() {
        return 1;
    }

    public final int getItemViewType(int i) {
        return C19742t.content_progress_list_item;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12794a(LayoutInflater.from(viewGroup.getContext()).inflate(C19742t.content_progress_list_item, viewGroup, false));
    }

    public final void onViewAttachedToWindow(RecyclerView.C1119a0 a0Var) {
        super.onViewAttachedToWindow(a0Var);
        ((ContentLoadingProgressBar) a0Var.itemView.findViewById(C19740r.progress_bar)).mo3436b();
    }
}
