package p923xs;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.ArrayList;
import zendesk.support.SimpleArticle;

/* renamed from: xs.e */
public final class C20569e extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C4051q f52032g = new C4051q(this, 10);

    /* renamed from: h */
    public final ArrayList<SimpleArticle> f52033h = new ArrayList<>(0);

    /* renamed from: i */
    public final C20570a f52034i;

    /* renamed from: xs.e$a */
    public interface C20570a {
        /* renamed from: n1 */
        void mo52781n1(SimpleArticle simpleArticle);
    }

    public C20569e(C20570a aVar) {
        C21100e.m49373x(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f52034i = aVar;
    }

    public final int getItemCount() {
        return this.f52033h.size();
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        TextView textView = (TextView) ((C12797f) a0Var).itemView;
        textView.setOnClickListener(this.f52032g);
        textView.setText(this.f52033h.get(i).getTitle());
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12797f fVar = new C12797f(C13715c.m34239e(viewGroup, R.layout.help_center_search_list_item, viewGroup, false));
        fVar.itemView.setTag(fVar);
        return fVar;
    }
}
