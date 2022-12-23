package com.moovit.app.metro.selection;

import aa0.C7527d;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.moovit.app.MoovitAppActivity;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.metro.selection.Country;
import com.moovit.metro.selection.MetroArea;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m00.C18306a;
import m00.C18308c;
import m00.C18310d;
import p641lu.C18276a;
import p641lu.C18277b;
import p641lu.C18278c;
import p641lu.C18279d;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;

public abstract class MetroListActivity extends MoovitAppActivity {

    /* renamed from: o0 */
    public static final /* synthetic */ int f38959o0 = 0;

    /* renamed from: U */
    public MetroArea f38960U;

    /* renamed from: X */
    public Country f38961X;

    /* renamed from: Y */
    public List<Country> f38962Y;

    /* renamed from: Z */
    public ArrayList f38963Z;

    /* renamed from: l0 */
    public ListView f38964l0;

    /* renamed from: m0 */
    public AlertMessageView f38965m0;

    /* renamed from: n0 */
    public ExpandableListView f38966n0;

    /* renamed from: com.moovit.app.metro.selection.MetroListActivity$a */
    public class C15132a implements SearchView.C0366m {
        public C15132a() {
        }

        /* renamed from: A */
        public final void mo1843A(String str) {
            if (C20964s0.m49090h(str)) {
                MetroListActivity.this.f38966n0.setVisibility(0);
                MetroListActivity.this.f38964l0.setEmptyView((View) null);
                MetroListActivity.this.f38964l0.setVisibility(8);
                MetroListActivity.this.f38965m0.setVisibility(8);
                return;
            }
            MetroListActivity.this.f38966n0.setVisibility(8);
            MetroListActivity.this.f38964l0.setVisibility(0);
            MetroListActivity metroListActivity = MetroListActivity.this;
            metroListActivity.f38964l0.setEmptyView(metroListActivity.f38965m0);
            C15135d dVar = (C15135d) MetroListActivity.this.f38964l0.getAdapter();
            ((C7527d) dVar.f46694c).mo23793a(str);
            dVar.mo50724a();
        }

        /* renamed from: J */
        public final boolean mo1844J(String str) {
            return true;
        }
    }

    /* renamed from: com.moovit.app.metro.selection.MetroListActivity$b */
    public class C15133b extends C18306a<Country, MetroArea> {
        public C15133b(List<Country> list) {
            super(list);
        }

        /* renamed from: a */
        public final int mo45057a(Object obj) {
            return ((Country) obj).f14799e.size();
        }

        /* renamed from: b */
        public final Object mo45058b(int i, Object obj) {
            return ((Country) obj).f14799e.get(i);
        }

        /* renamed from: c */
        public final View mo45059c(Object obj, View view, ViewGroup viewGroup) {
            MetroArea metroArea = (MetroArea) obj;
            MetroListActivity metroListActivity = MetroListActivity.this;
            ListItemView listItemView = (ListItemView) view;
            boolean z = false;
            if (listItemView == null) {
                listItemView = (ListItemView) LayoutInflater.from(metroListActivity).inflate(R.layout.metro_list_metro_list_item, viewGroup, false);
            }
            MetroArea metroArea2 = MetroListActivity.this.f38960U;
            if (metroArea2 != null && metroArea.f14802b.equals(metroArea2.f14802b)) {
                z = true;
            }
            listItemView.setTitle((CharSequence) metroArea.f14803c);
            listItemView.setChecked(z);
            View accessoryView = listItemView.getAccessoryView();
            if (accessoryView instanceof Checkable) {
                ((Checkable) accessoryView).setChecked(z);
            }
            return listItemView;
        }

        /* renamed from: d */
        public final View mo45060d(Object obj, boolean z, View view, ViewGroup viewGroup) {
            int i;
            Typeface typeface;
            Country country = (Country) obj;
            Context context = viewGroup.getContext();
            boolean e = C20975x0.m49118e(MetroListActivity.this.f38961X, country);
            ListItemView listItemView = (ListItemView) view;
            if (listItemView == null) {
                listItemView = (ListItemView) LayoutInflater.from(context).inflate(R.layout.metro_list_country_list_item, viewGroup, false);
            }
            listItemView.setIcon(country.f14798d);
            listItemView.setTitle((CharSequence) country.f14797c);
            if (z) {
                i = R.drawable.ic_arrow_up_12_on_surface_emphasis_low;
            } else {
                i = R.drawable.ic_arrow_down_12_on_surface_emphasis_low;
            }
            listItemView.setAccessoryDrawable(i);
            TextView titleView = listItemView.getTitleView();
            if (e) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                typeface = Typeface.DEFAULT;
            }
            titleView.setTypeface(typeface);
            return listItemView;
        }
    }

    /* renamed from: com.moovit.app.metro.selection.MetroListActivity$c */
    public class C15134c extends C18310d<C20944i0<Country, MetroArea>, ListItemView, Void> {
        public C15134c(Context context, List<C20944i0<Country, MetroArea>> list) {
            super(context, R.layout.metro_list_metro_list_item, R.layout.metro_list_metro_list_item, list);
        }

        /* renamed from: d */
        public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
            boolean z;
            ListItemView listItemView = (ListItemView) view;
            C20944i0 i0Var = (C20944i0) obj;
            Country country = (Country) i0Var.f52692a;
            MetroArea metroArea = (MetroArea) i0Var.f52693b;
            MetroArea metroArea2 = MetroListActivity.this.f38960U;
            if (metroArea2 == null || !metroArea.f14802b.equals(metroArea2.f14802b)) {
                z = false;
            } else {
                z = true;
            }
            listItemView.setIcon(country.f14798d);
            listItemView.setTitle((CharSequence) metroArea.f14803c);
            listItemView.setSubtitle((CharSequence) country.f14797c);
            listItemView.setChecked(z);
            View accessoryView = listItemView.getAccessoryView();
            if (accessoryView instanceof Checkable) {
                ((Checkable) accessoryView).setChecked(z);
            }
        }
    }

    /* renamed from: com.moovit.app.metro.selection.MetroListActivity$d */
    public class C15135d extends C18308c<C20944i0<Country, MetroArea>, C7527d<C20944i0<Country, MetroArea>>> {
        public C15135d(C15134c cVar, C7527d dVar) {
            super(cVar, dVar);
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_metro_list, menu);
        ((SearchView) menu.findItem(R.id.action_search).getActionView()).setOnQueryTextListener(new C15132a());
        return true;
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.metro_list_activity);
        this.f38966n0 = (ExpandableListView) findViewById(R.id.countries_list);
        this.f38964l0 = (ListView) findViewById(R.id.search_list);
        this.f38962Y = (List) mo44537r1("SUPPORTED_METROS");
        this.f38963Z = new ArrayList();
        for (Country next : this.f38962Y) {
            for (MetroArea i0Var : next.f14799e) {
                this.f38963Z.add(new C20944i0(next, i0Var));
            }
        }
        this.f38966n0.setAdapter(new C15133b(this.f38962Y));
        this.f38966n0.setOnGroupExpandListener(new C18279d(this));
        this.f38966n0.setOnChildClickListener(new C18276a(this));
        this.f38964l0.setAdapter(new C15135d(new C15134c(this, this.f38963Z), new C7527d(new C18277b(0))));
        this.f38964l0.setOnItemClickListener(new C18278c(this, 0));
        this.f38965m0 = (AlertMessageView) findViewById(R.id.empty_view);
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("SUPPORTED_METROS");
        return s1;
    }

    /* renamed from: y2 */
    public abstract void mo45520y2(MetroArea metroArea);

    /* renamed from: z2 */
    public final void mo45522z2() {
        Country country = this.f38961X;
        if (country != null && this.f38960U != null) {
            int indexOf = this.f38962Y.indexOf(country);
            if (this.f38966n0.isGroupExpanded(indexOf)) {
                this.f38966n0.setItemChecked(this.f38966n0.getFlatListPosition(ExpandableListView.getPackedPositionForChild(indexOf, this.f38962Y.get(indexOf).f14799e.indexOf(this.f38960U))), true);
            }
            this.f38964l0.setItemChecked(this.f38963Z.indexOf(new C20944i0(this.f38961X, this.f38960U)), true);
        }
    }
}
