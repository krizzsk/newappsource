package o10;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.AlertMessageView;
import com.moovit.transit.TransitType;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12793c;
import java.util.Collections;
import java.util.Set;
import o00.C18671h;
import o00.C18681n;
import o10.C18692g;
import p001a0.C0016g;
import p104h2.C5037a;
import p117i2.C5260b;
import p501fw.C17102a;
import p824tp.C19728f;
import p824tp.C19731i;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19743u;
import p824tp.C19746x;
import p977zz.C20964s0;
import z00.C20795a;
import z70.C13337m;

/* renamed from: o10.c */
public class C18684c extends C15682c<MoovitActivity> implements C5037a.C5038a<C18692g.C18693a> {

    /* renamed from: u */
    public static final /* synthetic */ int f47563u = 0;

    /* renamed from: n */
    public final C18685a f47564n = new C18685a();

    /* renamed from: o */
    public final C18686b f47565o = new C18686b(C19742t.general_error_view);

    /* renamed from: p */
    public final C13337m f47566p = new C13337m();

    /* renamed from: q */
    public C20795a f47567q;

    /* renamed from: r */
    public RecyclerView f47568r;

    /* renamed from: s */
    public TransitType f47569s;

    /* renamed from: t */
    public String f47570t = "";

    /* renamed from: o10.c$a */
    public class C18685a extends C18690f {
        public C18685a() {
        }
    }

    /* renamed from: o10.c$b */
    public class C18686b extends C18671h {
        public C18686b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            AlertMessageView alertMessageView = (AlertMessageView) onCreateViewHolder.itemView;
            alertMessageView.setImage(C19739q.img_empty_no_network);
            alertMessageView.setNegativeButtonClickListener(new C17102a(this, 12));
            return onCreateViewHolder;
        }
    }

    /* renamed from: o10.c$c */
    public class C18687c implements SearchView.C0366m {
        public C18687c() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            C18684c cVar = C18684c.this;
            int i = C18684c.f47563u;
            cVar.mo51057m2(str);
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            return false;
        }
    }

    public C18684c() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("SEARCH_STOP_FTS");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        if (this.f40824e) {
            mo51057m2(this.f47570t);
        }
    }

    /* renamed from: X1 */
    public final void mo46787X1(Object obj, String str) {
        if ("SEARCH_STOP_FTS".equals(str)) {
            this.f47568r.mo4627l0(this.f47565o);
        }
    }

    /* renamed from: m2 */
    public final void mo51057m2(String str) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f47570t = str2;
        this.f47566p.mo40229d(str);
        if (mo46785T1("SEARCH_STOP_FTS")) {
            C5037a.m12866a(this).mo20760b(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setHasOptionsMenu(mo46782Q1().getBoolean("isSearchEnabled", true));
        Context requireContext = requireContext();
        C21100e.m49373x(requireContext, AppActionRequest.KEY_CONTEXT);
        int i = C19746x.search_stop_empty_state;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = requireContext.getText(i);
        }
        this.f47567q = new C20795a((Drawable) null, (CharSequence) null, charSequence);
        if (bundle == null) {
            bundle = mo46782Q1();
        }
        this.f47569s = (TransitType) bundle.getParcelable("transitType");
        this.f47570t = bundle.getString("searchQuery", "");
    }

    public final C5260b<C18692g.C18693a> onCreateLoader(int i, Bundle bundle) {
        Context requireContext = requireContext();
        return new C18692g(requireContext, C19731i.m47197a(requireContext).mo52086d(C19728f.m47195a(requireContext)), this.f47570t, this.f47569s);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        String str;
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C19743u.fragment_search_stop, menu);
        SearchView searchView = (SearchView) menu.findItem(C19740r.action_search).getActionView();
        searchView.requestFocus();
        Context context = searchView.getContext();
        TransitType transitType = this.f47569s;
        if (transitType == null) {
            str = context.getString(C19746x.stop_search_hint);
        } else {
            str = context.getString(C19746x.stop_search_by_transit_hint, new Object[]{context.getString(transitType.f23758c)});
        }
        searchView.setQueryHint(str);
        searchView.setOnQueryTextListener(new C18687c());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C19742t.search_stop_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C19740r.recycler_view);
        this.f47568r = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.f47568r.setAdapter(new C12793c());
        RecyclerView recyclerView2 = this.f47568r;
        Context context = recyclerView2.getContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.append(2, C19739q.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        this.f47568r.mo4615h(this.f47566p);
        return inflate;
    }

    /* JADX INFO: finally extract failed */
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            TypedArray n = UiUtils.m40255n(context, attributeSet, new int[]{C19735m.isSearchEnabled});
            try {
                boolean z = n.getBoolean(0, true);
                n.recycle();
                bundle2.putBoolean("isSearchEnabled", z);
                setArguments(bundle2);
            } catch (Throwable th) {
                n.recycle();
                throw th;
            }
        }
    }

    public final void onLoadFinished(C5260b bVar, Object obj) {
        boolean z;
        C18692g.C18693a aVar = (C18692g.C18693a) obj;
        this.f47564n.mo51061o(requireContext(), aVar);
        this.f47566p.mo40230e(aVar.f47592a, this.f47564n.getItemCount(), Collections.singletonMap(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(this.f47569s)), (Set<String>) null);
        if (C20964s0.m49090h(aVar.f47592a) || this.f47564n.getItemCount() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            RecyclerView.Adapter adapter = this.f47568r.getAdapter();
            C20795a aVar2 = this.f47567q;
            if (adapter != aVar2) {
                this.f47568r.mo4627l0(aVar2);
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter2 = this.f47568r.getAdapter();
        C18685a aVar3 = this.f47564n;
        if (adapter2 != aVar3) {
            this.f47568r.mo4627l0(aVar3);
        }
    }

    public final void onLoaderReset(C5260b<C18692g.C18693a> bVar) {
        this.f47564n.mo51061o(requireContext(), (C18692g.C18693a) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("transitType", this.f47569s);
        bundle.putString("searchQuery", this.f47570t);
    }

    public final void onStart() {
        super.onStart();
        mo51057m2(this.f47570t);
    }

    public final void onStop() {
        super.onStop();
        if (mo46782Q1().getBoolean("isSearchEnabled", true)) {
            mo46797j2(this.f47566p.mo40228c());
        }
    }
}
