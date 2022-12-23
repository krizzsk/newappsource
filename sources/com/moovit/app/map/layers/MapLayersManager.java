package com.moovit.app.map.layers;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.core.widget.C0798j;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.itinerary.C15052h;
import com.moovit.app.map.layers.MapLayersSettingsAdapter;
import com.moovit.map.MapFragment;
import com.moovit.map.MapOverlaysLayout;
import com.moovit.map.collections.category.CategoryMapItemSource;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.EnumSet;
import p001a0.C0017h;
import p20.C18878e;
import p269u2.C6677a;
import p543hq.C17474b;
import p593ju.C17926b;
import p593ju.C17927c;
import p593ju.C17928d;
import p593ju.C17929e;
import p824tp.C19731i;
import p874vr.C20199a;
import q00.C19047a;
import q00.C19053d;
import q20.C19076b;

public class MapLayersManager implements C1031o {

    /* renamed from: b */
    public final C15052h f38915b = new C15052h(this, 1);

    /* renamed from: c */
    public final C17926b f38916c = new C17926b(this, 0);

    /* renamed from: d */
    public final MapFragment f38917d;

    /* renamed from: e */
    public final C6677a f38918e;

    /* renamed from: f */
    public final C17929e f38919f;

    /* renamed from: g */
    public final SparseArray<C18878e<?, ?>> f38920g;

    /* renamed from: h */
    public final int f38921h;

    /* renamed from: i */
    public final int f38922i;

    /* renamed from: j */
    public int f38923j = 0;

    /* renamed from: k */
    public int f38924k = 0;

    /* renamed from: l */
    public ImageView f38925l = null;

    public MapLayersManager(MoovitAppActivity moovitAppActivity, C19047a aVar, MapFragment mapFragment) {
        C21100e.m49373x(mapFragment, "mapFragment");
        this.f38917d = mapFragment;
        this.f38918e = C19731i.m47197a(moovitAppActivity).f50173c;
        this.f38919f = new C17929e(moovitAppActivity);
        this.f38921h = ((Integer) aVar.mo51505b(C19053d.f48472k)).intValue();
        this.f38922i = ((Integer) aVar.mo51505b(C20199a.f51304v0)).intValue() & 4084;
        SparseArray<C18878e<?, ?>> sparseArray = new SparseArray<>();
        this.f38920g = sparseArray;
        sparseArray.put(8, new C19076b(CategoryMapItemSource.COMMERCIAL));
        sparseArray.put(16, new C19076b(CategoryMapItemSource.BICYCLE_STATION));
        sparseArray.put(2048, new C19076b(CategoryMapItemSource.BICYCLE_REPAIR));
        sparseArray.put(32, new C19076b(CategoryMapItemSource.DOCKLESS_BICYCLE));
        sparseArray.put(64, new C19076b(CategoryMapItemSource.DOCKLESS_KICK_SCOOTER));
        sparseArray.put(RecyclerView.C1119a0.FLAG_IGNORE, new C19076b(CategoryMapItemSource.DOCKLESS_ELECTRIC_SCOOTER));
        sparseArray.put(256, new C19076b(CategoryMapItemSource.DOCKLESS_ELECTRIC_MOPED));
        sparseArray.put(512, new C19076b(CategoryMapItemSource.DOCKLESS_CAR));
        sparseArray.put(1024, new C19076b(CategoryMapItemSource.CAR_SHARING));
        sparseArray.put(4096, new C19076b(CategoryMapItemSource.PARKING_LOTS));
    }

    /* renamed from: a */
    public static void m38565a(MapLayersManager mapLayersManager) {
        ImageView imageView = mapLayersManager.f38925l;
        if (imageView != null) {
            Context context = imageView.getContext();
            Context applicationContext = context.getApplicationContext();
            C6677a aVar = mapLayersManager.f38918e;
            AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.POPUP;
            aVar.mo22849g(applicationContext, analyticsFlowKey);
            C6677a aVar2 = mapLayersManager.f38918e;
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "map_layers_filter");
            aVar3.mo49942j(AnalyticsAttributeKey.AVAILABLE_MAP_SETTINGS, C0017h.m46C(mapLayersManager.f38923j & mapLayersManager.f38922i, false));
            aVar3.mo49942j(AnalyticsAttributeKey.SET_MAP_SETTINGS, C0017h.m46C(mapLayersManager.f38923j & mapLayersManager.f38922i & mapLayersManager.f38919f.mo50470a(), false));
            aVar2.mo22850h(analyticsFlowKey, aVar3.mo49933a());
            ArrayList<T> c = C13723g.m34282c(EnumSet.allOf(MapLayersSettingsAdapter.UiMapLayer.class), new C15122a(mapLayersManager.f38923j & mapLayersManager.f38922i));
            c.remove(MapLayersSettingsAdapter.UiMapLayer.STATIONS);
            PopupWindow popupWindow = null;
            if (!C13717b.m34258e(c)) {
                View inflate = View.inflate(context, R.layout.map_settings_popup, (ViewGroup) null);
                int min = Math.min(c.size(), 2);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler_view);
                recyclerView.setLayoutManager(new GridLayoutManager(context, min));
                recyclerView.setAdapter(new MapLayersSettingsAdapter(context, c));
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                inflate.measure(makeMeasureSpec, makeMeasureSpec);
                popupWindow = new PopupWindow(inflate.getContext());
                popupWindow.setContentView(inflate);
                popupWindow.setWidth(inflate.getMeasuredWidth());
                popupWindow.setHeight(inflate.getMeasuredHeight());
                popupWindow.setOutsideTouchable(true);
                C0798j.m2412a(popupWindow, false);
            }
            if (popupWindow != null) {
                popupWindow.showAsDropDown(imageView, 0, -imageView.getHeight());
                popupWindow.setOnDismissListener(new C17927c(mapLayersManager, applicationContext));
            }
        }
    }

    /* renamed from: c */
    public final void mo45502c() {
        boolean z;
        ImageView imageView = this.f38925l;
        if (imageView != null) {
            int i = 0;
            if ((this.f38923j & this.f38922i) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00eb A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45503d() {
        /*
            r10 = this;
            com.moovit.map.MapFragment r0 = r10.f38917d
            boolean r0 = r0.mo48624U2()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r10.f38923j
            int r1 = r10.f38921h
            r0 = r0 & r1
            ju.e r1 = r10.f38919f
            int r1 = r1.mo50470a()
            r0 = r0 & r1
            int r1 = r10.f38924k
            java.lang.Integer.toBinaryString(r1)
            java.lang.Integer.toBinaryString(r0)
            int r1 = r10.f38924k
            if (r1 != r0) goto L_0x0022
            return
        L_0x0022:
            r1 = r1 & 4
            r2 = r0 & 4
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0033
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            com.moovit.map.MapFragment r2 = r10.f38917d
            r2.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = r1 & r4
            if (r1 == 0) goto L_0x0046
            com.moovit.map.items.MapItem$Type r1 = com.moovit.map.items.MapItem.Type.STOP
            r5.add(r1)
        L_0x0046:
            java.util.HashSet r1 = r2.f42354M
            r1.clear()
            java.util.HashSet r1 = r2.f42354M
            r1.addAll(r5)
            r2.mo48633d3()
        L_0x0053:
            int r1 = r10.f38924k
            r2 = r1 & 8184(0x1ff8, float:1.1468E-41)
            r5 = r0 & 8184(0x1ff8, float:1.1468E-41)
            if (r2 == r5) goto L_0x005d
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x00ef
            android.util.SparseArray<p20.e<?, ?>> r2 = r10.f38920g
            int r2 = r2.size()
            r5 = 0
        L_0x0067:
            if (r5 >= r2) goto L_0x00ef
            android.util.SparseArray<p20.e<?, ?>> r6 = r10.f38920g
            int r6 = r6.keyAt(r5)
            android.util.SparseArray<p20.e<?, ?>> r7 = r10.f38920g
            java.lang.Object r7 = r7.valueAt(r5)
            p20.e r7 = (p20.C18878e) r7
            r8 = r1 & r6
            if (r8 != 0) goto L_0x007d
            r9 = 1
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            if (r9 == 0) goto L_0x008b
            r9 = r0 & r6
            if (r9 == 0) goto L_0x0086
            r9 = 1
            goto L_0x0087
        L_0x0086:
            r9 = 0
        L_0x0087:
            if (r9 == 0) goto L_0x008b
            r9 = 1
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            if (r9 == 0) goto L_0x0094
            com.moovit.map.MapFragment r6 = r10.f38917d
            r6.mo48644n2(r7)
            goto L_0x00eb
        L_0x0094:
            if (r8 == 0) goto L_0x0098
            r8 = 1
            goto L_0x0099
        L_0x0098:
            r8 = 0
        L_0x0099:
            if (r8 == 0) goto L_0x00a5
            r6 = r6 & r0
            if (r6 != 0) goto L_0x00a0
            r6 = 1
            goto L_0x00a1
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            if (r6 == 0) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00eb
            com.moovit.map.MapFragment r6 = r10.f38917d
            java.util.HashMap r8 = r6.f42375q0
            java.lang.String r7 = r7.mo51345b()
            java.lang.Object r7 = r8.remove(r7)
            com.moovit.map.MapFragment$f r7 = (com.moovit.map.MapFragment.C16224f) r7
            if (r7 != 0) goto L_0x00b9
            goto L_0x00eb
        L_0x00b9:
            boolean r8 = r6.f40824e
            if (r8 == 0) goto L_0x00cb
            com.moovit.map.MapFragment r8 = com.moovit.map.MapFragment.this
            android.os.Handler r8 = r8.f42377r0
            r8.removeCallbacks(r7)
            b00.a r8 = r7.f42402f
            if (r8 == 0) goto L_0x00cb
            r8.cancel(r4)
        L_0x00cb:
            boolean r8 = r6.mo48624U2()
            if (r8 == 0) goto L_0x00eb
            com.moovit.map.j r6 = r6.f42368n
            o20.q r8 = r7.f42401e
            r6.mo48779B(r8)
            b00.c r6 = r7.f42403g
            r6.cancel(r4)
            b00.c r6 = r7.f42404h
            r6.cancel(r4)
            long r8 = android.os.SystemClock.elapsedRealtime()
            r7.f42405i = r8
            r6 = 0
            r7.f42401e = r6
        L_0x00eb:
            int r5 = r5 + 1
            goto L_0x0067
        L_0x00ef:
            int r1 = r10.f38924k
            r1 = r1 & 3
            r2 = r0 & 3
            if (r1 == r2) goto L_0x00f9
            r1 = 1
            goto L_0x00fa
        L_0x00f9:
            r1 = 0
        L_0x00fa:
            if (r1 == 0) goto L_0x011e
            com.moovit.map.MapFragment r1 = r10.f38917d
            r2 = r0 & 1
            if (r2 == 0) goto L_0x0104
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            r1.f42374q = r2
            com.moovit.map.j r1 = r1.f42368n
            if (r1 == 0) goto L_0x010e
            r1.mo48798m(r2)
        L_0x010e:
            com.moovit.map.MapFragment r1 = r10.f38917d
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0115
            r3 = 1
        L_0x0115:
            r1.f42376r = r3
            com.moovit.map.j r1 = r1.f42368n
            if (r1 == 0) goto L_0x011e
            r1.mo48778A(r3)
        L_0x011e:
            r10.f38924k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.map.layers.MapLayersManager.mo45503d():void");
    }

    @C1045x(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.f38917d.mo48656t2(this.f38915b);
        C17929e eVar = this.f38919f;
        C17926b bVar = this.f38916c;
        if (!eVar.f45996c.containsKey(bVar)) {
            C17928d dVar = new C17928d(eVar, bVar);
            eVar.f45996c.put(bVar, dVar);
            eVar.f45994a.registerOnSharedPreferenceChangeListener(dVar);
        }
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        ImageView imageView;
        MapFragment mapFragment = this.f38917d;
        mapFragment.f42338C.remove(this.f38915b);
        MapOverlaysLayout mapOverlaysLayout = this.f38917d.f42386w;
        if (!(mapOverlaysLayout == null || (imageView = this.f38925l) == null)) {
            mapOverlaysLayout.removeView(imageView);
        }
        C17929e eVar = this.f38919f;
        SharedPreferences.OnSharedPreferenceChangeListener remove = eVar.f45996c.remove(this.f38916c);
        if (remove != null) {
            eVar.f45994a.unregisterOnSharedPreferenceChangeListener(remove);
        }
    }
}
