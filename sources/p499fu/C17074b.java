package p499fu;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import java.util.List;
import java.util.WeakHashMap;
import n00.C18491a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p259t5.C6592b;
import p523gu.C17231c;

/* renamed from: fu.b */
public final class C17074b extends C18491a<View> {

    /* renamed from: b */
    public final C17073a f44259b;

    /* renamed from: c */
    public final List<RecyclerView.C1133l> f44260c;

    /* renamed from: d */
    public final RecyclerView.C1143r f44261d;

    /* renamed from: e */
    public final C17075a f44262e;

    /* renamed from: fu.b$a */
    public interface C17075a extends C17231c.C17232a {
    }

    public C17074b(C17073a aVar, RecyclerView.C1143r rVar, List list, C15101a aVar2) {
        this.f44259b = aVar;
        C21100e.m49373x(list, "itemDecorations");
        this.f44260c = list;
        C21100e.m49373x(rVar, "pool");
        this.f44261d = rVar;
        this.f44262e = aVar2;
    }

    /* renamed from: a */
    public final void mo23842a(int i, View view) {
        if (!this.f44259b.f44258z.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) view;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setRecycledViewPool(this.f44261d);
            for (RecyclerView.C1133l g : this.f44260c) {
                recyclerView.mo4593g(g, -1);
            }
            recyclerView.mo4593g(this.f44259b.f44546p, -1);
            recyclerView.setAdapter(this.f44259b);
            recyclerView.mo4589e0(this.f44259b.f44552v);
        }
    }

    /* renamed from: b */
    public final View mo45295b(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView;
        if (!this.f44259b.f44258z.isEmpty()) {
            RecyclerView recyclerView2 = new RecyclerView(viewGroup.getContext(), (AttributeSet) null);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15103t(recyclerView2, false);
            recyclerView = recyclerView2;
        } else {
            AlertMessageView alertMessageView = (AlertMessageView) C13715c.m34239e(viewGroup, R.layout.line_detail_empty_view, viewGroup, false);
            alertMessageView.setPositiveButtonClickListener(new C6592b(this, 16));
            recyclerView = alertMessageView;
        }
        recyclerView.setTag("item#" + i);
        return recyclerView;
    }

    public final int getCount() {
        return 1;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f44259b.notifyDataSetChanged();
    }
}
