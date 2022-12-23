package ja0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p808sx.C19568d;

/* renamed from: ja0.b */
public abstract class C12791b<T> extends C12790a<T> {

    /* renamed from: h */
    public final C19568d f31614h = new C19568d(this, 14);

    /* renamed from: i */
    public final int f31615i;

    /* renamed from: j */
    public C12792a<T> f31616j;

    /* renamed from: ja0.b$a */
    public interface C12792a<T> {
        /* renamed from: f */
        void mo20740f(List<T> list, T t, int i);
    }

    public C12791b(List<T> list, int i, C12792a<T> aVar) {
        super(list);
        this.f31615i = i;
        this.f31616j = aVar;
    }

    /* renamed from: l */
    public abstract void mo23840l(C12797f fVar, Object obj);

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        C12797f fVar = (C12797f) a0Var;
        fVar.itemView.setOnClickListener(this.f31614h);
        mo23840l(fVar, mo39636j(i));
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C12797f fVar = new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(this.f31615i, viewGroup, false));
        fVar.itemView.setTag(fVar);
        return fVar;
    }
}
