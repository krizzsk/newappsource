package com.moovit.app.linedetail.p416ui;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.C0199g;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12797f;
import ja0.C12798g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import o00.C18670g;
import o00.C18675k;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p435de.C16596f;
import p451du.C16722s;
import p451du.C16723t;
import p455dy.C16753e;
import p784rx.C19377c;
import p824tp.C19728f;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.linedetail.ui.SelectFavoriteLineStopsActivity */
public class SelectFavoriteLineStopsActivity extends MoovitAppActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f38796p0 = 0;

    /* renamed from: U */
    public TransitLine f38797U;

    /* renamed from: X */
    public ArrayList f38798X;

    /* renamed from: Y */
    public ServerId f38799Y;

    /* renamed from: Z */
    public int f38800Z;

    /* renamed from: l0 */
    public boolean f38801l0;

    /* renamed from: m0 */
    public RecyclerView f38802m0;

    /* renamed from: n0 */
    public View f38803n0;

    /* renamed from: o0 */
    public C16753e f38804o0;

    /* renamed from: com.moovit.app.linedetail.ui.SelectFavoriteLineStopsActivity$a */
    public class C15100a extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final LayoutInflater f38805g;

        /* renamed from: h */
        public final List<TransitStop> f38806h;

        /* renamed from: i */
        public final C16753e f38807i;

        /* renamed from: j */
        public int f38808j;

        public C15100a(Context context, ArrayList arrayList, C16753e eVar, int i) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f38805g = LayoutInflater.from(context);
            C21100e.m49373x(arrayList, "lineStops");
            this.f38806h = arrayList;
            this.f38807i = eVar;
            this.f38808j = i;
        }

        public final int getItemCount() {
            return this.f38806h.size();
        }

        public final int getItemViewType(int i) {
            return this.f38807i.mo49442q(this.f38806h.get(i).f23730b) ? 1 : 0;
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            int i2;
            int i3;
            int i4;
            C12797f fVar = (C12797f) a0Var;
            ListItemView listItemView = (ListItemView) fVar.mo39639f(R.id.item);
            TransitStop transitStop = this.f38806h.get(i);
            int itemViewType = fVar.getItemViewType();
            listItemView.setTitle((CharSequence) transitStop.f23731c);
            boolean z = true;
            if (itemViewType == 1) {
                i2 = R.attr.textAppearanceBodyStrong;
            } else {
                i2 = R.attr.textAppearanceBody;
            }
            listItemView.setTitleThemeTextAppearance(i2);
            if (itemViewType == 1) {
                i3 = R.attr.colorOnSurface;
            } else {
                i3 = R.attr.colorOnSurfaceEmphasisHigh;
            }
            listItemView.setTitleThemeTextColor(i3);
            listItemView.setContentDescription(C13382a.m33667c(SelectFavoriteLineStopsActivity.this.getString(R.string.voice_over_lineview_station_name, new Object[]{listItemView.getTitle()}), listItemView.getSubtitle()));
            View accessoryView = listItemView.getAccessoryView();
            if (accessoryView != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(accessoryView, 1);
            }
            if (C20975x0.m49118e(transitStop.f23730b, SelectFavoriteLineStopsActivity.this.f38799Y)) {
                listItemView.setSubtitle((int) R.string.line_nearby_station);
            } else {
                listItemView.setSubtitle(0);
            }
            ImageView imageView = (ImageView) listItemView.getAccessoryView();
            if (itemViewType == 1) {
                i4 = R.drawable.ic_star_16_favorite;
            } else {
                i4 = R.drawable.ic_star_stroke_16_on_surface;
            }
            imageView.setImageResource(i4);
            listItemView.setOnClickListener(new C16723t(0, this, fVar));
            if (this.f38808j != i) {
                z = false;
            }
            listItemView.setActivated(z);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(this.f38805g.inflate(R.layout.select_favorite_line_stop_view, viewGroup, false));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        this.f38797U = (TransitLine) intent.getParcelableExtra("extra_transit_line");
        this.f38798X = intent.getParcelableArrayListExtra("extra_transit_stops");
        this.f38799Y = (ServerId) intent.getParcelableExtra("extra_nearest_stop");
        this.f38801l0 = intent.getBooleanExtra("extra_show_line_added_to_favorites_indication", false);
        this.f38800Z = intent.getIntExtra("extra_selected_stop_position", 0);
        this.f38804o0 = ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46573d();
        setContentView((int) R.layout.select_favorite_line_stops_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.stops_list);
        this.f38802m0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        C18670g e = C18670g.m45652e(UiUtils.m40249h(getResources(), 12.0f));
        C18675k kVar = new C18675k(this, R.drawable.shadow_scroll);
        C12798g e2 = C12798g.m32602e(0, this, this.f38797U.mo24369b());
        this.f38802m0.mo4593g(e, -1);
        this.f38802m0.mo4593g(kVar, -1);
        this.f38802m0.mo4593g(e2, -1);
        this.f38802m0.setItemAnimator((RecyclerView.C1128j) null);
        this.f38803n0 = findViewById(R.id.empty_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().mo791m(true);
        getSupportActionBar().mo792n();
        HashSet hashSet = C19728f.f50164e;
        C16181a.m41233b(((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.STOP_DETAIL), (ListItemView) toolbar.findViewById(R.id.line_header), this.f38797U);
        findViewById(R.id.done).setOnClickListener(new C16722s(this));
        if (this.f38804o0 != null) {
            boolean isEmpty = this.f38798X.isEmpty();
            View view = this.f38803n0;
            int i2 = 8;
            if (isEmpty) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            RecyclerView recyclerView2 = this.f38802m0;
            if (!isEmpty) {
                i2 = 0;
            }
            recyclerView2.setVisibility(i2);
            if (!isEmpty) {
                C15100a aVar = new C15100a(this, this.f38798X, this.f38804o0, this.f38800Z);
                this.f38802m0.setAdapter(aVar);
                aVar.notifyDataSetChanged();
                int i3 = this.f38800Z;
                if (i3 < 0 || i3 >= aVar.getItemCount()) {
                    C16596f a = C16596f.m42113a();
                    StringBuilder k = C13555b.m33972k("Received an invalid selected stop position, position: ");
                    k.append(this.f38800Z);
                    k.append(" item count: ");
                    k.append(aVar.getItemCount());
                    a.mo49364c(new ApplicationBugException(k.toString()));
                    aVar.getItemCount();
                    this.f38800Z = 0;
                }
                this.f38802m0.mo4589e0(this.f38800Z);
            }
        }
        if (this.f38801l0 && !this.f38798X.isEmpty()) {
            C19377c.m46656a(this, TrackingEvent.SELECT_FAVORITE_LINE_STOPS_LINE_ADDED_POP_UP_DISPLAYED, new C0199g(this, 14));
        }
        if (this.f38801l0) {
            Snackbar.m35159l(findViewById(16908290), R.string.line_added_favorite, -1).mo42259p();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }
}
