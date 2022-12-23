package com.moovit.app.actions.livelocation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1033p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import ff0.C23349c;
import ja0.C12791b;
import ja0.C12797f;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import o00.C18665b;
import p102h0.C5021e;
import p543hq.C17474b;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/app/actions/livelocation/LiveLocationTransitStopChooserFragment;", "Lcom/moovit/b;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class LiveLocationTransitStopChooserFragment extends C15676b<MoovitActivity> {

    /* renamed from: j */
    public static final /* synthetic */ int f37422j = 0;

    /* renamed from: h */
    public final C5021e f37423h = new C5021e(this, 8);

    /* renamed from: i */
    public final C21049c f37424i = C23812a.m58432b(new LiveLocationTransitStopChooserFragment$stopIds$2(this));

    /* renamed from: com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$a */
    public static final class C14717a extends C12791b<TransitStop> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14717a(List list, C5021e eVar) {
            super(list, R.layout.stop_chooser_item_view, eVar);
            C24362h.m61211f(list, "stops");
            C24362h.m61211f(eVar, "itemClickListener");
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            TransitStop transitStop = (TransitStop) obj;
            C24362h.m61211f(fVar, "holder");
            C24362h.m61211f(transitStop, "stop");
            View view = fVar.itemView;
            C24362h.m61210e(view, "holder.getItemView()");
            ListItemView listItemView = (ListItemView) view;
            listItemView.setIcon(transitStop.f23734f);
            listItemView.setTitle((CharSequence) transitStop.f23731c);
            listItemView.setSubtitle((CharSequence) transitStop.f23733e);
        }
    }

    public LiveLocationTransitStopChooserFragment() {
        super(MoovitActivity.class);
        setStyle(0, 2131952793);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlin.coroutines.intrinsics.CoroutineSingletons} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.coroutines.intrinsics.CoroutineSingletons} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlin.coroutines.intrinsics.CoroutineSingletons} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.coroutines.intrinsics.CoroutineSingletons} */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        if (r10 == r1) goto L_0x00ad;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f A[LOOP:0: B:20:0x0099->B:22:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: S1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.Serializable m37059S1(com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment r8, java.util.List r9, ff0.C23349c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$fetchTransitStops$1
            if (r0 == 0) goto L_0x0016
            r0 = r10
            com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$fetchTransitStops$1 r0 = (com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$fetchTransitStops$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$fetchTransitStops$1 r0 = new com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment$fetchTransitStops$1
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.L$0
            java.util.List r8 = (java.util.List) r8
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0084
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            java.lang.Object r8 = r0.L$0
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            p584jl.C17885a.m44475z0(r10)
            goto L_0x0076
        L_0x0042:
            p584jl.C17885a.m44475z0(r10)
            A r8 = r8.f40792c
            c70.e r8 = r8.mo44548x1()
            java.lang.Class<com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment> r10 = com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment.class
            java.lang.String r10 = r10.getSimpleName()
            android.content.Context r2 = r8.f33852a
            tp.f r2 = p824tp.C19728f.m47195a(r2)
            g30.h r2 = r2.f50165a
            java.lang.String r5 = "metroInfo"
            i30.e r5 = p379.C16759e.m42348d(r2, r5)
            com.moovit.metroentities.MetroEntityType r6 = com.moovit.metroentities.MetroEntityType.TRANSIT_STOP
            com.moovit.commons.utils.collections.CollectionHashMap$HashSetHashMap<com.moovit.metroentities.MetroEntityType, com.moovit.network.model.ServerId> r7 = r5.f17412b
            r7.mo47002b(r6, r9)
            i30.c r6 = new i30.c
            r6.<init>(r8, r10, r2, r5)
            r0.L$0 = r9
            r0.label = r4
            kotlinx.coroutines.flow.CallbackFlowBuilder r10 = com.moovit.commons.request.C15752a.m40210b(r6)
            if (r10 != r1) goto L_0x0076
            goto L_0x00ad
        L_0x0076:
            zh0.c r10 = (zh0.C25522c) r10
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r10 = p845um.C19958a.m47445u(r10, r0)
            if (r10 != r1) goto L_0x0083
            goto L_0x00ad
        L_0x0083:
            r8 = r9
        L_0x0084:
            java.util.List r10 = (java.util.List) r10
            i30.d r9 = i30.C5265a.m13289Q(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r10 = 10
            int r10 = cf0.C21136j.m49436X(r8, r10)
            r1.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x0099:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00ad
            java.lang.Object r10 = r8.next()
            com.moovit.network.model.ServerId r10 = (com.moovit.network.model.ServerId) r10
            com.moovit.transit.TransitStop r10 = r9.mo21064c(r10)
            r1.add(r10)
            goto L_0x0099
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment.m37059S1(com.moovit.app.actions.livelocation.LiveLocationTransitStopChooserFragment, java.util.List, ff0.c):java.io.Serializable");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.live_location_transit_stop_chooser_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stop_selection_dialog");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.recycler_view);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.mo4593g(new C18665b(view.getContext(), R.drawable.divider_horizontal), -1);
        C1033p viewLifecycleOwner = getViewLifecycleOwner();
        C24362h.m61210e(viewLifecycleOwner, "viewLifecycleOwner");
        C17885a.m44426W(viewLifecycleOwner).mo4310c(new LiveLocationTransitStopChooserFragment$onViewCreated$1(this, recyclerView, (C23349c<? super LiveLocationTransitStopChooserFragment$onViewCreated$1>) null));
    }
}
