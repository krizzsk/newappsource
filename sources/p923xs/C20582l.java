package p923xs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import java.util.WeakHashMap;
import o00.C18665b;
import o00.C18671h;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p297w5.C6996c;
import p543hq.C17474b;
import p923xs.C20579j;
import p946ys.C20764e;
import p977zz.C20930c;
import p977zz.C20961r;

/* renamed from: xs.l */
public class C20582l extends C15682c<HelpCenterActivity> implements C20579j.C20580a {

    /* renamed from: q */
    public static int f52064q = C6333d0.C6338e.m15060a();

    /* renamed from: n */
    public final C20583a f52065n = new C20583a(R.layout.loader_failed_general_view);

    /* renamed from: o */
    public C20764e f52066o;

    /* renamed from: p */
    public RecyclerView f52067p;

    /* renamed from: xs.l$a */
    public class C20583a extends C18671h {
        public C20583a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C6996c(this, 11));
            return onCreateViewHolder;
        }
    }

    static {
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
    }

    public C20582l() {
        super(HelpCenterActivity.class);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C20764e eVar = (C20764e) new C1026n0(requireActivity()).mo4313a(C20764e.class);
        this.f52066o = eVar;
        C20961r value = eVar.f52394c.getValue();
        if (value == null || !value.f52711a) {
            eVar.mo52903d();
        }
        eVar.f52394c.observe(getViewLifecycleOwner(), new C20581k(this, 0));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        MenuItem add = menu.add(0, f52064q, 0, R.string.help_center_search_hint);
        add.setIcon(R.drawable.ic_search_24_control_normal);
        add.setShowAsAction(2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.help_center_sections_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        this.f52067p = recyclerView;
        recyclerView.setAdapter(new C12793c());
        RecyclerView recyclerView2 = this.f52067p;
        recyclerView2.mo4593g(new C18665b(recyclerView2.getContext(), R.drawable.divider_horizontal_full), -1);
        return inflate;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != f52064q) {
            return super.onOptionsItemSelected(menuItem);
        }
        ((HelpCenterActivity) this.f40822c).mo45062y2((Long) null, (String) null);
        return true;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_select_section_impression");
        aVar.mo49938f(AnalyticsAttributeKey.LOCALE, C20930c.m49020b(requireContext()));
        mo46797j2(aVar.mo49933a());
        ((HelpCenterActivity) this.f40822c).setTitle(R.string.help_center_screen_header);
    }
}
