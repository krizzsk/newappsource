package com.moovit.search;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C1026n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.AlertMessageView;
import com.moovit.genies.Genie;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.search.C7606b;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import ja0.C12793c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k00.C17988b;
import m10.C18316a;
import m30.C5678a;
import o00.C18671h;
import o00.C18681n;
import p241s0.C6307g;
import p430cx.C16522d;
import p543hq.C17474b;
import p597jy.C17979a;
import p805su.C19552i;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p858uz.C20061g;
import p977zz.C20936e0;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import q00.C19053d;
import x00.C20440a;
import z00.C20795a;
import z70.C13321a;
import z70.C13322b;
import z70.C13327e;
import z70.C13329g;
import z70.C13334k;
import z70.C13337m;

public final class SearchLocationActivity extends MoovitActivity {

    /* renamed from: s0 */
    public static final /* synthetic */ int f23120s0 = 0;

    /* renamed from: U */
    public final C7598a f23121U = new C7598a();

    /* renamed from: X */
    public final C7599b f23122X = new C7599b(C19742t.search_location_empty_view);

    /* renamed from: Y */
    public C20795a f23123Y;

    /* renamed from: Z */
    public final C13322b f23124Z = new C13322b(this);

    /* renamed from: l0 */
    public SearchLocationCallback f23125l0;

    /* renamed from: m0 */
    public final C13337m f23126m0 = new C13337m();

    /* renamed from: n0 */
    public SearchView f23127n0;

    /* renamed from: o0 */
    public RecyclerView f23128o0;

    /* renamed from: p0 */
    public C7606b f23129p0;

    /* renamed from: q0 */
    public int f23130q0 = 0;

    /* renamed from: r0 */
    public C13334k f23131r0 = null;

    /* renamed from: com.moovit.search.SearchLocationActivity$a */
    public class C7598a implements SearchView.C0366m {
        public C7598a() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            int i;
            SearchLocationActivity searchLocationActivity = SearchLocationActivity.this;
            searchLocationActivity.f23126m0.mo40229d(str);
            C7606b bVar = searchLocationActivity.f23129p0;
            if (C20964s0.m49092j(str)) {
                i = 0;
            } else {
                i = searchLocationActivity.f23130q0;
            }
            bVar.mo23910h(i, str);
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            RecyclerView recyclerView = SearchLocationActivity.this.f23128o0;
            StyleSpan styleSpan = C13329g.f33089a;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C20944i0 i0Var = null;
            if (adapter instanceof C13322b) {
                C13322b bVar = (C13322b) adapter;
                List q = bVar.mo51054q();
                int size = q.size();
                int i = 0;
                loop0:
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C13327e eVar = (C13327e) q.get(i);
                    if ("special_actions".equals(eVar.f33086d)) {
                        int size2 = eVar.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C13321a aVar = (C13321a) eVar.get(i2);
                            if ("deep_search".equals(aVar.f33070b)) {
                                i0Var = new C20944i0(aVar, Integer.valueOf(bVar.mo51051l(i, i2)));
                                break loop0;
                            }
                        }
                        continue;
                    }
                    i++;
                }
            }
            if (i0Var != null) {
                SearchLocationActivity.this.mo23892C2((C13321a) i0Var.f52692a, SearchAction.DEFAULT, ((Integer) i0Var.f52693b).intValue());
            }
            return false;
        }
    }

    /* renamed from: com.moovit.search.SearchLocationActivity$b */
    public class C7599b extends C18671h {
        public C7599b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            AlertMessageView alertMessageView = (AlertMessageView) onCreateViewHolder.itemView.findViewById(C19740r.empty_view);
            alertMessageView.setPositiveButtonClickListener(new C17979a(this, 12));
            int I0 = SearchLocationActivity.this.mo23895z2().mo23880I0();
            if (I0 != 0) {
                alertMessageView.setSubtitle(I0);
            }
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.search.SearchLocationActivity$c */
    public class C7600c extends LocationSettingsFixer.C16200b {

        /* renamed from: d */
        public final /* synthetic */ C13321a f23134d;

        /* renamed from: e */
        public final /* synthetic */ SearchAction f23135e;

        /* renamed from: f */
        public final /* synthetic */ int f23136f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7600c(SearchLocationActivity searchLocationActivity, C13321a aVar, SearchAction searchAction, int i) {
            super(searchLocationActivity);
            this.f23134d = aVar;
            this.f23135e = searchAction;
            this.f23136f = i;
        }

        /* renamed from: b */
        public final void mo23896b(Location location) {
            SearchLocationActivity.this.mo23892C2(this.f23134d, this.f23135e, this.f23136f);
        }
    }

    /* renamed from: y2 */
    public static Intent m17347y2(Context context, AppSearchLocationCallback appSearchLocationCallback, String str, String str2) {
        Intent intent = new Intent(context, SearchLocationActivity.class);
        intent.putExtra("search_callback", appSearchLocationCallback);
        if (str != null) {
            intent.putExtra("source", str);
        }
        if (str2 != null) {
            intent.putExtra("search_query", str2);
        }
        return intent;
    }

    /* renamed from: A2 */
    public final void mo23890A2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo44545v2(aVar.mo49933a());
        startActivityForResult(MapLocationPickerActivity.m41309A2(this, mo23895z2().mo23884h0()), 1781);
    }

    /* renamed from: B2 */
    public final void mo23891B2(String str, LocationDescriptor locationDescriptor, SearchAction searchAction) {
        C7606b bVar;
        mo23895z2().mo23885h1(this, str, locationDescriptor, searchAction);
        if (isFinishing() && (bVar = this.f23129p0) != null) {
            bVar.f23165j.removeObservers(this);
        }
        boolean z = false;
        if (locationDescriptor.mo24310d() != null && !"special_actions".equals(str) && (searchAction == SearchAction.DEFAULT || searchAction == SearchAction.SHOW_DETAILS)) {
            z = true;
        }
        if (z) {
            C12638d dVar = (C12638d) mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
            dVar.mo51499b();
            dVar.f48438c.mo40645c(locationDescriptor);
        }
    }

    /* renamed from: C2 */
    public final void mo23892C2(C13321a aVar, SearchAction searchAction, int i) {
        Task task;
        if (!"special_actions".equals(aVar.f33069a) || !"current_location".equals(aVar.f33070b) || mo44542u1() != null) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "location_search_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.QUERY_STRING, C20964s0.m49082C(this.f23127n0.getQuery()));
            aVar2.mo49935c(AnalyticsAttributeKey.NUMBER_OF_RESULTS, this.f23124Z.f47552g);
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, aVar.f33069a);
            aVar2.mo49939g(AnalyticsAttributeKey.ACTION, searchAction.name());
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_ID, aVar.f33070b);
            aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, aVar.f33071c);
            AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.SELECTED_CAPTION;
            StyleSpan styleSpan = C13329g.f33089a;
            ArrayList arrayList = new ArrayList(2);
            CharSequence charSequence = aVar.f33073e;
            if (charSequence != null) {
                arrayList.add(charSequence);
            }
            if (aVar.f33074f != null) {
                arrayList.ensureCapacity(aVar.f33074f.size() + arrayList.size());
                for (C20440a next : aVar.f33074f) {
                    if (next.mo52636a()) {
                        arrayList.add(next.f51782b);
                    }
                }
            }
            aVar2.mo49939g(analyticsAttributeKey, C20964s0.m49100r(", ", arrayList));
            aVar2.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i);
            aVar2.mo49935c(AnalyticsAttributeKey.DISTANCE, aVar.f33076h);
            mo44545v2(aVar2.mo49933a());
            if (SearchAction.COPY.equals(searchAction)) {
                this.f23127n0.mo1788r(C20964s0.m49082C(aVar.f33073e), false);
            } else if ("special_actions".equals(aVar.f33069a) && "deep_search".equals(aVar.f33070b)) {
                this.f23128o0.mo4627l0(new C12793c());
                this.f23129p0.mo23909g(0, "deep_search");
            } else if (!"special_actions".equals(aVar.f33069a) || !"chose_on_map".equals(aVar.f33070b)) {
                C7604a aVar3 = (C7604a) this.f23129p0.f23164i.getOrDefault(aVar.f33069a, null);
                if (aVar3 == null) {
                    StringBuilder k = C13555b.m33972k("Unknown provider: ");
                    k.append(aVar.f33069a);
                    task = Tasks.forException(new ApplicationBugException(k.toString()));
                } else {
                    task = aVar3.mo23837d(C7606b.f23157q, aVar);
                }
                task.addOnSuccessListener((Activity) this, new C19552i(1, this, aVar, searchAction)).addOnFailureListener((Activity) this, (OnFailureListener) new C5678a(1, this, aVar));
            } else {
                mo23890A2("choose_map_clicked");
            }
        } else {
            LocationSettingsFixer.C16198a aVar4 = new LocationSettingsFixer.C16198a((MoovitActivity) this);
            aVar4.mo48529b(C19746x.location_rational_search_location_title, C19746x.location_rational_search_location_message);
            aVar4.f42260g = true;
            aVar4.mo48528a(new C7600c(this, aVar, searchAction, i));
        }
    }

    /* renamed from: D2 */
    public final void mo23893D2(C7606b.C7608b bVar) {
        if (bVar.f23181f == null) {
            this.f23126m0.mo40230e(bVar.f23177b, this.f23124Z.f47552g, bVar.f23179d, bVar.f23180e);
            return;
        }
        C13337m mVar = this.f23126m0;
        String str = bVar.f23177b;
        Map<AnalyticsAttributeKey, String> map = bVar.f23179d;
        if (C20975x0.m49118e(mVar.f33107a, str)) {
            mVar.f33108b = -2;
            mVar.f33109c = map;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        CharSequence charSequence;
        String str;
        super.mo19425e2(bundle);
        setContentView(C19742t.search_location_activity);
        setSupportActionBar((Toolbar) findViewById(C19740r.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(false);
            supportActionBar.mo791m(true);
            supportActionBar.mo792n();
        }
        Drawable b = C17988b.m44611b(C19739q.img_empty_error, this);
        int i = C19746x.response_read_error_message;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = getText(i);
        }
        this.f23123Y = new C20795a(b, (CharSequence) null, charSequence);
        RecyclerView recyclerView = (RecyclerView) findViewById(C19740r.recycler_view);
        this.f23128o0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f23128o0.setItemAnimator((RecyclerView.C1128j) null);
        this.f23128o0.setAdapter(new C12793c());
        this.f23128o0.mo4615h(this.f23126m0);
        RecyclerView recyclerView2 = this.f23128o0;
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(1, C19739q.divider_horizontal);
        sparseIntArray.put(2, C19739q.divider_horizontal_full);
        recyclerView2.mo4593g(new C18681n(this, sparseIntArray, true), -1);
        SearchView searchView = (SearchView) findViewById(C19740r.search_view);
        this.f23127n0 = searchView;
        searchView.requestFocus();
        C12638d dVar = (C12638d) mo44537r1("RECENT_SEARCH_LOCATIONS_STORE");
        dVar.mo51499b();
        if (C13717b.m34258e(dVar.f48438c.mo40647e())) {
            C18316a.f46708c.mo50767a(Genie.SEARCH_LOCATIONS, this.f23127n0, this);
        }
        int g0 = mo23895z2().mo23883g0();
        if (g0 != 0) {
            this.f23127n0.setQueryHint(getText(g0));
        }
        this.f23130q0 = C20936e0.m49036b(0, 500, ((Integer) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C19053d.f48454F)).intValue());
        this.f23129p0 = (C7606b) new C1026n0(this).mo4313a(C7606b.class);
        if (bundle == null) {
            str = getIntent().getStringExtra("search_query");
        } else {
            str = null;
        }
        if (!C20964s0.m49092j(str)) {
            this.f23127n0.mo1788r(str, false);
            this.f23126m0.mo40231f(str);
            this.f23129p0.mo23910h(0, str);
        }
        mo23895z2().mo23886l0(this, this.f23129p0);
        if (bundle != null) {
            this.f23126m0.mo40231f(bundle.getCharSequence("searchViewQuery"));
            C7606b bVar = this.f23129p0;
            bVar.getClass();
            String string = bundle.getString("searchQuery");
            if (string == null) {
                string = "";
            }
            bVar.f23168m = string;
            Iterator it = ((C6307g.C6312e) bVar.f23164i.values()).iterator();
            while (true) {
                C6307g.C6308a aVar = (C6307g.C6308a) it;
                if (!aVar.hasNext()) {
                    break;
                }
                C7604a aVar2 = (C7604a) aVar.next();
                Bundle bundle2 = bundle.getBundle(aVar2.f23153b);
                if (bundle2 != null) {
                    aVar2.mo23838g(bundle2);
                }
            }
        }
        this.f23127n0.setOnQueryTextListener(this.f23121U);
        this.f23129p0.f23165j.observe(this, new C16522d(this, 3));
        this.f23129p0.mo23905c((String) null);
        EditText editText = (EditText) this.f23127n0.findViewById(C19740r.search_src_text);
        C13382a.m33674j(editText, editText.getHint(), getString(C19746x.voiceover_options_available));
        C13382a.m33668d(editText, false);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putCharSequence("searchViewQuery", this.f23127n0.getQuery());
        C7606b bVar = this.f23129p0;
        bundle.putString("searchQuery", bVar.f23168m);
        Iterator it = ((C6307g.C6312e) bVar.f23164i.values()).iterator();
        while (true) {
            C6307g.C6308a aVar = (C6307g.C6308a) it;
            if (aVar.hasNext()) {
                C7604a aVar2 = (C7604a) aVar.next();
                Bundle h = aVar2.mo23839h();
                if (h != null) {
                    bundle.putBundle(aVar2.f23153b, h);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f23126m0.f33115i = true;
        C7606b.C7608b bVar = (C7606b.C7608b) this.f23128o0.getTag();
        if (bVar != null) {
            this.f23126m0.mo40231f(this.f23127n0.getQuery());
            mo23893D2(bVar);
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        ((C12638d) mo44537r1("RECENT_SEARCH_LOCATIONS_STORE")).mo51498a();
        mo44545v2(this.f23126m0.mo40228c());
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49945m(AnalyticsAttributeKey.SOURCE, getIntent().getStringExtra("source"));
        return m1;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        LocationDescriptor locationDescriptor;
        LocationDescriptor locationDescriptor2;
        if (i == 1781) {
            if (i2 == -1 && (locationDescriptor2 = (LocationDescriptor) intent.getParcelableExtra("descriptor")) != null) {
                mo23891B2("choose_on_map", locationDescriptor2, SearchAction.DEFAULT);
            }
        } else if (i != 1782) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && (locationDescriptor = (LocationDescriptor) intent.getParcelableExtra("selected_location_extra")) != null) {
            mo23891B2("choose_place_on_map", locationDescriptor, SearchAction.DEFAULT);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("RECENT_SEARCH_LOCATIONS_STORE");
        mo23895z2().mo23881N(hashSet);
        return s1;
    }

    /* renamed from: z2 */
    public final SearchLocationCallback mo23895z2() {
        if (this.f23125l0 == null) {
            this.f23125l0 = (SearchLocationCallback) getIntent().getParcelableExtra("search_callback");
        }
        if (this.f23125l0 == null) {
            this.f23125l0 = new DefaultSearchLocationCallback();
        }
        return this.f23125l0;
    }
}
