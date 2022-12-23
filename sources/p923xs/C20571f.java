package p923xs;

import android.content.Context;
import android.content.UriMatcher;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1043v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.helpcenter.HelpCenterActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import ja0.C12793c;
import o00.C18665b;
import o00.C18671h;
import p039c7.C1800c;
import p122i7.C5297a;
import p543hq.C17474b;
import p923xs.C20569e;
import p946ys.C20764e;
import z70.C13337m;
import zendesk.support.SimpleArticle;

/* renamed from: xs.f */
public class C20571f extends C15682c<HelpCenterActivity> implements C20569e.C20570a, SearchView.C0366m {

    /* renamed from: w */
    public static final /* synthetic */ int f52035w = 0;

    /* renamed from: n */
    public final C20572a f52036n = new C20572a(R.layout.help_center_empty_state);

    /* renamed from: o */
    public final C20569e f52037o = new C20569e(this);

    /* renamed from: p */
    public final C13337m f52038p = new C13337m();

    /* renamed from: q */
    public C20764e f52039q;

    /* renamed from: r */
    public long f52040r = -1;

    /* renamed from: s */
    public String f52041s;

    /* renamed from: t */
    public String f52042t = "";

    /* renamed from: u */
    public SearchView f52043u;

    /* renamed from: v */
    public RecyclerView f52044v;

    /* renamed from: xs.f$a */
    public class C20572a extends C18671h {
        public C20572a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((ListItemView) onCreateViewHolder.itemView.findViewById(R.id.footer)).setOnClickListener(new C1800c(this, 4));
            return onCreateViewHolder;
        }
    }

    public C20571f() {
        super(HelpCenterActivity.class);
    }

    /* renamed from: A */
    public final void mo1843A(String str) {
        this.f52038p.mo40229d(str);
        if (str == null) {
            str = "";
        }
        this.f52042t = str;
        this.f52039q.mo52900a(Long.valueOf(this.f52040r), str);
    }

    /* renamed from: J */
    public final boolean mo1844J(String str) {
        return false;
    }

    /* renamed from: n1 */
    public final void mo52781n1(SimpleArticle simpleArticle) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_article_clicked");
        aVar.mo49938f(AnalyticsAttributeKey.ID, simpleArticle.getId());
        mo46797j2(aVar.mo49933a());
        HelpCenterActivity helpCenterActivity = (HelpCenterActivity) this.f40822c;
        long longValue = simpleArticle.getId().longValue();
        String str = this.f52041s;
        helpCenterActivity.getClass();
        UriMatcher uriMatcher = C20568d.f52024u;
        Bundle bundle = new Bundle();
        bundle.putLong("articleId", longValue);
        bundle.putString("ownerSectionName", str);
        C20568d dVar = new C20568d();
        dVar.setArguments(bundle);
        helpCenterActivity.mo45063z2(dVar, true);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52040r = mo46782Q1().getLong("sectionId", -1);
        this.f52041s = mo46782Q1().getString("sectionName");
        String str = "";
        if (bundle != null) {
            str = bundle.getString("searchQuery", str);
        }
        this.f52042t = str;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.help_center_search_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("searchQuery", this.f52042t);
    }

    public final void onStart() {
        Long l;
        super.onStart();
        this.f52038p.f33115i = true;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "help_center_search_impression");
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ID;
        long j = this.f52040r;
        if (j == -1) {
            l = null;
        } else {
            l = Long.valueOf(j);
        }
        aVar.mo49944l(analyticsAttributeKey, l);
        mo46797j2(aVar.mo49933a());
        this.f52043u.setVisibility(0);
        this.f52043u.requestFocus();
    }

    public final void onStop() {
        super.onStop();
        mo46797j2(this.f52038p.mo40228c());
        this.f52043u.clearFocus();
        this.f52043u.setVisibility(8);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C20764e eVar = (C20764e) new C1026n0(requireActivity()).mo4313a(C20764e.class);
        this.f52039q = eVar;
        eVar.getClass();
        C1043v<C20764e.C20765a> vVar = new C1043v<>();
        eVar.f52399h = vVar;
        vVar.observe(getViewLifecycleOwner(), new C5297a(this, 1));
        this.f52038p.mo40231f(this.f52042t);
        this.f52039q.mo52900a(Long.valueOf(this.f52040r), this.f52042t);
        KeyEvent.Callback callback = null;
        View view2 = view;
        while (true) {
            ViewParent parent = view2.getParent();
            if (parent == null || !(parent instanceof View)) {
                break;
            }
            view2 = (View) parent;
            KeyEvent.Callback findViewById = view2.findViewById(R.id.search_view);
            if (findViewById != null) {
                callback = findViewById;
                break;
            }
        }
        SearchView searchView = (SearchView) callback;
        this.f52043u = searchView;
        if (searchView != null) {
            searchView.mo1788r(this.f52042t, false);
            this.f52043u.setOnQueryTextListener(this);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
            this.f52044v = recyclerView;
            Context context = recyclerView.getContext();
            this.f52044v.setLayoutManager(new LinearLayoutManager(context));
            this.f52044v.mo4593g(new C18665b(context, R.drawable.divider_horizontal_full), -1);
            this.f52044v.mo4615h(this.f52038p);
            this.f52044v.setAdapter(new C12793c());
            return;
        }
        throw new ApplicationBugException("Unable to find the search view!");
    }
}
