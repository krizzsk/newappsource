package p523gu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.AlertMessageView;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n00.C18491a;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p259t5.C6593c;
import p523gu.C17231c;

/* renamed from: gu.a */
public final class C17228a extends C18491a<View> {

    /* renamed from: b */
    public final TransitLine f44529b;

    /* renamed from: c */
    public final List<C17231c> f44530c;

    /* renamed from: d */
    public final Map<ServerId, Integer> f44531d;

    /* renamed from: e */
    public final List<RecyclerView.C1133l> f44532e;

    /* renamed from: f */
    public final RecyclerView.C1143r f44533f;

    /* renamed from: g */
    public final C17229a f44534g;

    /* renamed from: gu.a$a */
    public interface C17229a extends C17231c.C17232a {
    }

    public C17228a(Context context, TransitLine transitLine, List list, Map map, Map map2, List list2, RecyclerView.C1143r rVar, C15101a aVar, C15101a aVar2) {
        int i;
        RecyclerView.C1143r rVar2 = rVar;
        this.f44529b = transitLine;
        this.f44532e = list2;
        C21100e.m49373x(rVar2, "pool");
        this.f44533f = rVar2;
        this.f44534g = aVar2;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        C6302b bVar = new C6302b(size);
        Iterator it = list.iterator();
        char c = 0;
        int i2 = 0;
        while (it.hasNext()) {
            TransitPatternTrips transitPatternTrips = (TransitPatternTrips) it.next();
            TransitPattern transitPattern = transitPatternTrips.f23717b;
            int[] d = transitPattern.mo24386d((ServerId) map2.get(transitPatternTrips.f23717b.f23708b));
            DbEntityRef dbEntityRef = null;
            if (d.length != 0 && (i = d[c]) >= 0 && i < transitPattern.f23709c.size()) {
                dbEntityRef = transitPattern.f23709c.get(i);
            }
            Context context2 = context;
            TransitLine transitLine2 = transitLine;
            C17231c cVar = r1;
            C17231c cVar2 = new C17231c(context2, transitLine2, DbEntityRef.getEntities(transitPatternTrips.f23717b.f23709c), transitPatternTrips, (ServerId) map.get(transitPatternTrips.f23717b.f23708b), (TransitStop) dbEntityRef.get(), aVar, aVar2);
            arrayList.add(cVar);
            bVar.put(transitPatternTrips.f23717b.f23708b, Integer.valueOf(i2));
            TransitLine transitLine3 = transitLine;
            i2++;
            c = 0;
        }
        this.f44530c = Collections.unmodifiableList(arrayList);
        this.f44531d = Collections.unmodifiableMap(bVar);
    }

    /* renamed from: a */
    public final void mo23842a(int i, View view) {
        if (!this.f44530c.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) view;
            C17231c c = mo49793c(i);
            int max = Math.max(0, c.f44552v - 3);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setRecycledViewPool(this.f44533f);
            recyclerView.setAdapter(c);
            recyclerView.mo4589e0(max);
            for (RecyclerView.C1133l g : this.f44532e) {
                recyclerView.mo4593g(g, -1);
            }
            recyclerView.mo4593g(c.f44546p, -1);
        }
    }

    /* renamed from: b */
    public final View mo45295b(ViewGroup viewGroup, int i) {
        RecyclerView recyclerView;
        if (!this.f44530c.isEmpty()) {
            RecyclerView recyclerView2 = new RecyclerView(viewGroup.getContext(), (AttributeSet) null);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15103t(recyclerView2, false);
            recyclerView = recyclerView2;
        } else {
            AlertMessageView alertMessageView = (AlertMessageView) C13715c.m34239e(viewGroup, R.layout.line_detail_empty_view, viewGroup, false);
            alertMessageView.setPositiveButtonClickListener(new C6593c(this, 16));
            recyclerView = alertMessageView;
        }
        recyclerView.setTag("item#" + i);
        return recyclerView;
    }

    /* renamed from: c */
    public final C17231c mo49793c(int i) {
        if (i < 0 || i >= this.f44530c.size()) {
            return null;
        }
        return this.f44530c.get(i);
    }

    public final int getCount() {
        return Math.max(1, this.f44530c.size());
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        for (C17231c notifyDataSetChanged : this.f44530c) {
            notifyDataSetChanged.notifyDataSetChanged();
        }
    }
}
