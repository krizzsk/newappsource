package p923xs;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1043v;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import java.util.WeakHashMap;
import o00.C18671h;
import o00.C18681n;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p259t5.C6592b;
import p543hq.C17474b;
import p923xs.C20573g;
import p946ys.C20764e;
import p977zz.C20961r;

/* renamed from: xs.i */
public class C20577i extends C15682c<HelpCenterActivity> implements C20573g.C20575b {

    /* renamed from: t */
    public static final int f52051t = C6333d0.C6338e.m15060a();

    /* renamed from: n */
    public final C20578a f52052n = new C20578a(R.layout.loader_failed_general_view);

    /* renamed from: o */
    public final C20573g f52053o = new C20573g(this);

    /* renamed from: p */
    public C20764e f52054p;

    /* renamed from: q */
    public long f52055q;

    /* renamed from: r */
    public String f52056r;

    /* renamed from: s */
    public RecyclerView f52057s;

    /* renamed from: xs.i$a */
    public class C20578a extends C18671h {
        public C20578a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C6592b(this, 10));
            return onCreateViewHolder;
        }
    }

    static {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
    }

    public C20577i() {
        super(HelpCenterActivity.class);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C20764e eVar = (C20764e) new C1026n0(requireActivity()).mo4313a(C20764e.class);
        this.f52054p = eVar;
        long j = this.f52055q;
        C1043v vVar = (C1043v) eVar.f52395d.getOrDefault(Long.valueOf(j), null);
        if (vVar == null) {
            vVar = new C1043v();
            eVar.f52395d.put(Long.valueOf(j), vVar);
        }
        C20961r rVar = (C20961r) vVar.getValue();
        if (rVar == null || !rVar.f52711a) {
            eVar.mo52902c(j);
        }
        vVar.observe(getViewLifecycleOwner(), new C20576h(this, 0));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f52055q = mo46782Q1().getLong("ownerSectionId");
        this.f52056r = mo46782Q1().getString("ownerSectionName");
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        MenuItem add = menu.add(0, f52051t, 0, R.string.help_center_search_hint);
        add.setIcon(R.drawable.ic_search_24_control_normal);
        add.setShowAsAction(2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.help_center_articles_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
        this.f52057s = recyclerView;
        Context requireContext = requireContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(20, R.drawable.divider_horizontal_full);
        recyclerView.mo4593g(new C18681n(requireContext, sparseIntArray, false), -1);
        this.f52057s.setAdapter(new C12793c());
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != f52051t) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((HelpCenterActivity) this.f40822c).mo45062y2(Long.valueOf(this.f52055q), this.f52056r);
        return true;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_select_article_impression");
        aVar.mo49936d(AnalyticsAttributeKey.ID, this.f52055q);
        mo46797j2(aVar.mo49933a());
        ((HelpCenterActivity) this.f40822c).setTitle(this.f52056r);
    }
}
