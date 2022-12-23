package z60;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.C15682c;
import ja0.C12790a;
import ja0.C12797f;
import java.util.List;
import y60.C20705a;
import y60.C20709e;

/* renamed from: z60.a */
public final class C20810a extends C12790a<C20705a> {

    /* renamed from: h */
    public final C20709e f52528h = C20709e.m48682a();

    public C20810a(C15682c<?> cVar, List<C20705a> list) {
        super(list);
    }

    public final int getItemViewType(int i) {
        ((C20705a) mo39636j(i)).getClass();
        return 0;
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C20709e eVar = this.f52528h;
        int itemViewType = ((C12797f) a0Var).getItemViewType();
        eVar.getClass();
        C21100e.m49369v(1);
        eVar.f52297d.get(itemViewType).getClass();
        ((C20705a) mo39636j(i)).getClass();
        throw null;
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20709e eVar = this.f52528h;
        eVar.getClass();
        C21100e.m49369v(1);
        eVar.f52297d.get(i).getClass();
        throw null;
    }
}
