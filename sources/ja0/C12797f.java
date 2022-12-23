package ja0;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ja0.f */
public class C12797f extends RecyclerView.C1119a0 {

    /* renamed from: d */
    public final SparseArray<View> f31631d = new SparseArray<>();

    public C12797f(View view) {
        super(view);
    }

    /* renamed from: e */
    public final Context mo39638e() {
        return this.itemView.getContext();
    }

    /* renamed from: f */
    public final <T extends View> T mo39639f(int i) {
        T t = (View) this.f31631d.get(i);
        if (t != null) {
            return t;
        }
        T findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            this.f31631d.put(i, findViewById);
        }
        return findViewById;
    }
}
