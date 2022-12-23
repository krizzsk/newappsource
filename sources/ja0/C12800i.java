package ja0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.Arrays;
import java.util.List;

/* renamed from: ja0.i */
public final class C12800i extends RecyclerView.Adapter<RecyclerView.C1119a0> {

    /* renamed from: g */
    public final SparseArray<View> f31651g;

    /* renamed from: ja0.i$a */
    public class C12801a extends RecyclerView.C1119a0 {
        public C12801a(View view) {
            super(view);
        }
    }

    public C12800i(View... viewArr) {
        List<View> asList = Arrays.asList(viewArr);
        C21100e.m49373x(asList, AdUnitActivity.EXTRA_VIEWS);
        this.f31651g = new SparseArray<>(asList.size());
        for (View view : asList) {
            int identityHashCode = System.identityHashCode(view);
            if (identityHashCode < 1000000) {
                identityHashCode += 1000000;
            }
            this.f31651g.put(identityHashCode, view);
        }
        setHasStableIds(true);
    }

    public final int getItemCount() {
        return this.f31651g.size();
    }

    public final long getItemId(int i) {
        return (long) this.f31651g.keyAt(i);
    }

    public final int getItemViewType(int i) {
        return this.f31651g.keyAt(i);
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12801a(this.f31651g.get(i));
    }
}
