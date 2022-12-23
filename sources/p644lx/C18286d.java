package p644lx;

import android.content.Context;
import androidx.recyclerview.widget.C1240t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lx.d */
public final class C18286d extends LinearLayoutManager {

    /* renamed from: lx.d$a */
    public class C18287a extends C1240t {
        public C18287a(Context context) {
            super(context);
        }

        /* renamed from: g */
        public final int mo5165g() {
            return -1;
        }
    }

    public C18286d(Context context) {
        super(context);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C1152x xVar, int i) {
        C18287a aVar = new C18287a(recyclerView.getContext());
        aVar.f4336a = i;
        startSmoothScroll(aVar);
    }
}
