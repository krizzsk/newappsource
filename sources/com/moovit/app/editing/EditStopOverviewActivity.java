package com.moovit.app.editing;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import b00.C13556a;
import c70.C13753f;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.editing.entity.EditPathwayEntityActivity;
import com.moovit.app.editing.entity.EditStopEntityActivity;
import com.moovit.app.editing.transit.EditorChangeState;
import com.moovit.app.editing.transit.EditorTransitStop;
import com.moovit.app.editing.transit.EditorTransitStopPathway;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.map.C16281i;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o20.C18699e;
import o20.C18711q;
import p068e2.C4525b;
import p371as.C13508a;
import p371as.C13509b;
import p371as.C13510c;
import p371as.C13511d;
import p371as.C13512e;
import p371as.C13513f;
import p425cs.C16478c;
import p425cs.C16479d;
import p431cy.C16525b;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17059d;
import p543hq.C17474b;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20944i0;

public class EditStopOverviewActivity extends MoovitAppActivity {

    /* renamed from: C0 */
    public static final /* synthetic */ int f37922C0 = 0;

    /* renamed from: A0 */
    public ObjectAnimator f37923A0;

    /* renamed from: B0 */
    public boolean f37924B0;

    /* renamed from: U */
    public Object f37925U = null;

    /* renamed from: X */
    public ArrayList f37926X = new ArrayList();

    /* renamed from: Y */
    public boolean f37927Y = false;

    /* renamed from: Z */
    public final C4525b f37928Z = new C4525b();

    /* renamed from: l0 */
    public final C14848b f37929l0 = new C14848b();

    /* renamed from: m0 */
    public final C14849c f37930m0 = new C14849c();

    /* renamed from: n0 */
    public final C14850d f37931n0 = new C14850d();

    /* renamed from: o0 */
    public final C14851e f37932o0 = new C14851e();

    /* renamed from: p0 */
    public final C14852f f37933p0 = new C14852f();

    /* renamed from: q0 */
    public final C14853g f37934q0 = new C14853g();

    /* renamed from: r0 */
    public ServerId f37935r0;

    /* renamed from: s0 */
    public EditorTransitStop f37936s0;

    /* renamed from: t0 */
    public EditorChangeState f37937t0;

    /* renamed from: u0 */
    public MapFragment f37938u0;

    /* renamed from: v0 */
    public C13556a f37939v0;

    /* renamed from: w0 */
    public TextView f37940w0;

    /* renamed from: x0 */
    public FloatingActionMenu f37941x0;

    /* renamed from: y0 */
    public View f37942y0;

    /* renamed from: z0 */
    public ObjectAnimator f37943z0;

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$a */
    public static /* synthetic */ class C14847a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37944a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.editing.transit.EditorChangeState[] r0 = com.moovit.app.editing.transit.EditorChangeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37944a = r0
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37944a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.LOADED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37944a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.PENDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37944a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.editing.transit.EditorChangeState r1 = com.moovit.app.editing.transit.EditorChangeState.APPROVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.editing.EditStopOverviewActivity.C14847a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$b */
    public class C14848b implements MapFragment.C16237r {
        public C14848b() {
        }

        /* renamed from: a */
        public final void mo21406a() {
            EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
            int i = EditStopOverviewActivity.f37922C0;
            editStopOverviewActivity.mo44934z2();
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$c */
    public class C14849c implements View.OnClickListener {
        public C14849c() {
        }

        public final void onClick(View view) {
            EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
            int i = EditStopOverviewActivity.f37922C0;
            editStopOverviewActivity.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "add_entrance_clicked");
            editStopOverviewActivity.mo44545v2(aVar.mo49933a());
            EditorTransitStop editorTransitStop = editStopOverviewActivity.f37936s0;
            editStopOverviewActivity.startActivityForResult(EditPathwayEntityActivity.m37473N2(editStopOverviewActivity, new EditorTransitStopPathway(editorTransitStop.f37997d, editorTransitStop.f37995b), true), 1001);
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$d */
    public class C14850d implements View.OnClickListener {
        public C14850d() {
        }

        public final void onClick(View view) {
            EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "edit_station_clicked");
            editStopOverviewActivity.mo44545v2(aVar.mo49933a());
            EditStopOverviewActivity editStopOverviewActivity2 = EditStopOverviewActivity.this;
            editStopOverviewActivity2.startActivityForResult(EditStopEntityActivity.m37483N2(editStopOverviewActivity2.getApplicationContext(), editStopOverviewActivity2.f37936s0, (EditorChangeState) null), 1002);
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$e */
    public class C14851e implements FloatingActionMenu.C3801c {
        public C14851e() {
        }

        /* renamed from: a */
        public final void mo44937a(boolean z) {
            if (z) {
                EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
                int i = EditStopOverviewActivity.f37922C0;
                editStopOverviewActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "open_fab_clicked");
                editStopOverviewActivity.mo44545v2(aVar.mo49933a());
                editStopOverviewActivity.f37923A0.start();
                editStopOverviewActivity.f37941x0.getMenuIconView().animate().alpha(0.3f).rotation(-50.0f).setDuration(100).setInterpolator(editStopOverviewActivity.f37928Z).setListener(new C13509b(editStopOverviewActivity));
                return;
            }
            EditStopOverviewActivity editStopOverviewActivity2 = EditStopOverviewActivity.this;
            editStopOverviewActivity2.f37943z0.start();
            editStopOverviewActivity2.f37941x0.getMenuIconView().animate().alpha(0.3f).rotation(-50.0f).setDuration(100).setInterpolator(editStopOverviewActivity2.f37928Z).setListener(new C13510c(editStopOverviewActivity2));
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$f */
    public class C14852f implements MapFragment.C16238s {
        public C14852f() {
        }

        /* renamed from: L0 */
        public final void mo23897L0(MapFragment mapFragment, Object obj) {
            if (obj instanceof EditorTransitStop) {
                EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
                EditorTransitStop editorTransitStop = (EditorTransitStop) obj;
                int i = EditStopOverviewActivity.f37922C0;
                editStopOverviewActivity.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stop_map_icon_clicked");
                editStopOverviewActivity.mo44545v2(aVar.mo49933a());
                editStopOverviewActivity.startActivityForResult(EditStopEntityActivity.m37483N2(editStopOverviewActivity.getApplicationContext(), editStopOverviewActivity.f37936s0, (EditorChangeState) null), 1002);
            }
            if (obj instanceof C20944i0) {
                EditStopOverviewActivity editStopOverviewActivity2 = EditStopOverviewActivity.this;
                int i2 = EditStopOverviewActivity.f37922C0;
                editStopOverviewActivity2.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "pathway_map_icon_clicked");
                editStopOverviewActivity2.mo44545v2(aVar2.mo49933a());
            }
        }
    }

    /* renamed from: com.moovit.app.editing.EditStopOverviewActivity$g */
    public class C14853g extends C20438i<C16478c, C16479d> {
        public C14853g() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16478c cVar2 = (C16478c) cVar;
            C16479d dVar = (C16479d) gVar;
            EditStopOverviewActivity editStopOverviewActivity = EditStopOverviewActivity.this;
            EditorTransitStop editorTransitStop = dVar.f43074m;
            EditorChangeState editorChangeState = dVar.f43075n;
            editStopOverviewActivity.f37936s0 = editorTransitStop;
            editStopOverviewActivity.f37937t0 = editorChangeState;
            editStopOverviewActivity.f37927Y = true;
            editStopOverviewActivity.mo44934z2();
            editStopOverviewActivity.mo44932A2();
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C16478c cVar2 = (C16478c) cVar;
            return false;
        }
    }

    /* renamed from: A2 */
    public final void mo44932A2() {
        int i = C14847a.f37944a[this.f37937t0.ordinal()];
        if (i == 1 || i == 2) {
            this.f37940w0.setVisibility(8);
        } else if (i == 3) {
            this.f37940w0.setText(R.string.edit_stop_overview_activity_pending_changes_message);
            this.f37940w0.setVisibility(0);
        } else if (i == 4) {
            this.f37940w0.setText(R.string.edit_stop_overview_activity_pending_load_message);
            this.f37940w0.setVisibility(0);
        }
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        C16479d dVar = (C16479d) list.get(0);
        EditorTransitStop editorTransitStop = dVar.f43074m;
        this.f37936s0 = editorTransitStop;
        this.f37937t0 = dVar.f43075n;
        this.f37927Y = true;
        if (editorTransitStop.f37998e.size() == 0) {
            startActivity(EditStopEntityActivity.m37483N2(this, this.f37936s0, this.f37937t0));
            finish();
            this.f37924B0 = true;
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        MapFragment mapFragment = this.f37938u0;
        if (mapFragment != null) {
            mapFragment.f42346G.remove(this.f37933p0);
        }
        C13556a aVar = this.f37939v0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37939v0 = null;
        }
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        C16525b c = new C17059d(this).mo49508c();
        c.mo49314a(TimeUnit.HOURS.toMillis(1));
        return new C16855d(this, R.id.coordinator_layout, Collections.singletonList((C16851b) c.f43144b));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        if (!this.f37924B0) {
            setContentView((int) R.layout.edit_stop_overview_activity);
            ServerId serverId = (ServerId) getIntent().getParcelableExtra("extra_transit_stop_server_id");
            this.f37935r0 = serverId;
            if (serverId != null) {
                MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(R.id.map_fragment);
                this.f37938u0 = mapFragment;
                C20061g gVar = this.f37295D;
                C20061g gVar2 = mapFragment.f40829j;
                mapFragment.f40829j = gVar;
                mapFragment.mo46791d2(gVar2, gVar);
                this.f37938u0.mo48640k3(MapFragment.MapFollowMode.NONE);
                C13508a aVar = new C13508a(this, this);
                MapFragment mapFragment2 = this.f37938u0;
                mapFragment2.f42341D0 = aVar;
                C16285j jVar = mapFragment2.f42368n;
                if (jVar != null) {
                    jVar.mo48813u(aVar);
                }
                this.f37938u0.mo48656t2(this.f37929l0);
                this.f37941x0 = (FloatingActionMenu) findViewById(R.id.fab_menu);
                ((FloatingActionButton) findViewById(R.id.fab_add_pathway)).setOnClickListener(this.f37930m0);
                ((FloatingActionButton) findViewById(R.id.fab_edit_station)).setOnClickListener(this.f37931n0);
                this.f37941x0.setOnMenuToggleListener(this.f37932o0);
                this.f37941x0.setIconAnimated(false);
                this.f37941x0.setClosedOnTouchOutside(true);
                View findViewById = findViewById(R.id.background_overlay);
                this.f37942y0 = findViewById;
                findViewById.setOnClickListener(new C13511d(this));
                this.f37942y0.setClickable(false);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f37942y0, View.ALPHA, new float[]{1.0f});
                this.f37923A0 = ofFloat;
                ofFloat.addListener(new C13512e(this));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f37942y0, View.ALPHA, new float[]{0.0f});
                this.f37943z0 = ofFloat2;
                ofFloat2.addListener(new C13513f(this));
                this.f37940w0 = (TextView) findViewById(R.id.status_alert);
                mo44932A2();
                return;
            }
            throw new IllegalStateException("Stop detail can not initiated without stop id");
        }
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        if (this.f37936s0 != null) {
            return null;
        }
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("extra_transit_stop_server_id");
        this.f37935r0 = serverId;
        if (serverId != null) {
            return new C13753f<>("getStop", new C16478c(this.f37935r0, mo44548x1()));
        }
        throw new IllegalStateException("Stop detail can not initiated without stop id");
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        MapFragment mapFragment = this.f37938u0;
        if (mapFragment != null) {
            mapFragment.mo48658u2(this.f37933p0);
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            if (i != 1002) {
                super.onActivityResult(i, i2, intent);
            } else if (this.f37299H) {
                this.f37941x0.mo15614a(false);
                if (i2 == -1) {
                    mo44933y2();
                }
            }
        } else if (this.f37299H) {
            this.f37941x0.mo15614a(false);
            if (i2 == -1) {
                mo44933y2();
            }
        }
    }

    /* renamed from: y2 */
    public final void mo44933y2() {
        this.f37938u0.mo48610F2();
        C13556a aVar = this.f37939v0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f37939v0 = null;
        }
        C16478c cVar = new C16478c(this.f37935r0, mo44548x1());
        RequestOptions c = this.f37293B.mo40680c();
        c.f42909f = true;
        this.f37939v0 = mo44527k2("transitStopRequest", cVar, c, this.f37934q0);
    }

    /* renamed from: z2 */
    public final void mo44934z2() {
        boolean z;
        MarkerZoomStyle j;
        if (this.f37938u0.mo48624U2()) {
            Object obj = this.f37925U;
            if (obj == null || this.f37927Y) {
                z = true;
            } else {
                z = false;
            }
            this.f37927Y = false;
            if (z) {
                if (obj != null) {
                    this.f37938u0.mo48636g3(obj);
                }
                if (!this.f37926X.isEmpty()) {
                    MapFragment mapFragment = this.f37938u0;
                    ArrayList arrayList = this.f37926X;
                    C18711q F = mapFragment.f42368n.mo48783F();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        mapFragment.mo48637h3(it.next(), F);
                    }
                }
                EditorTransitStop editorTransitStop = this.f37936s0;
                if (editorTransitStop != null) {
                    SparseArray<MarkerZoomStyle> c = MarkerZoomStyle.m41440c(editorTransitStop.f37999f);
                    MapFragment mapFragment2 = this.f37938u0;
                    EditorTransitStop editorTransitStop2 = this.f37936s0;
                    LatLonE6 latLonE6 = editorTransitStop2.f37997d;
                    mapFragment2.getClass();
                    this.f37925U = mapFragment2.mo48648p2(latLonE6, editorTransitStop2, C18699e.m45697a(c));
                    for (EditorTransitStopPathway next : this.f37936s0.f37998e) {
                        if ((next.mo24419c() || next.mo24420d()) && (j = C16281i.m41514j(next.f23749c, false)) != null) {
                            this.f37926X.add(this.f37938u0.mo48646o2(next.f23751e, new C20944i0(this.f37936s0, next), j));
                        }
                    }
                }
            }
            EditorTransitStop editorTransitStop3 = this.f37936s0;
            if (editorTransitStop3 != null) {
                this.f37938u0.mo48664z2(editorTransitStop3.f37997d, 19.5f);
            }
        }
    }
}
