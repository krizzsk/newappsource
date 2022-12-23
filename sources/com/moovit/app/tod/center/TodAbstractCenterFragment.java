package com.moovit.app.tod.center;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1021l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import ja0.C12793c;
import k00.C17988b;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import o00.C18665b;
import o00.C18671h;
import p073e7.C4583a;
import p543hq.C17474b;
import p609km.C18097c;
import z00.C20795a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/app/tod/center/TodAbstractCenterFragment;", "Lcom/moovit/c;", "Lcom/moovit/app/tod/center/TodRidesCenterActivity;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public abstract class TodAbstractCenterFragment extends C15682c<TodRidesCenterActivity> {

    /* renamed from: n */
    public final C15482a f40194n = new C15482a(this, new int[]{R.layout.general_error_view});

    /* renamed from: o */
    public final C1021l0 f40195o = C18097c.m44768b(this, C24365j.m61219a(C15489a.class), new C15483x3f930846(this), new C15484x3f930847(this), new C15485x3f930848(this));

    /* renamed from: p */
    public RecyclerView f40196p;

    /* renamed from: com.moovit.app.tod.center.TodAbstractCenterFragment$a */
    public static final class C15482a extends C18671h {

        /* renamed from: h */
        public final /* synthetic */ TodAbstractCenterFragment f40197h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15482a(TodAbstractCenterFragment todAbstractCenterFragment, int[] iArr) {
            super(iArr);
            this.f40197h = todAbstractCenterFragment;
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            C24362h.m61211f(viewGroup, "parent");
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            View view = onCreateViewHolder.itemView;
            C24362h.m61209d(view, "null cannot be cast to non-null type com.moovit.design.view.AlertMessageView");
            ((AlertMessageView) view).setNegativeButtonClickListener(new C4583a(this.f40197h, 28));
            return onCreateViewHolder;
        }
    }

    public TodAbstractCenterFragment() {
        super(TodRidesCenterActivity.class);
    }

    /* renamed from: m2 */
    public final void mo46280m2() {
        CharSequence charSequence;
        RecyclerView o2 = mo46282o2();
        Context context = mo46282o2().getContext();
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        Drawable b = C17988b.m44611b(R.drawable.img_schedule_empty, context);
        int n2 = mo46281n2();
        if (n2 == 0) {
            charSequence = null;
        } else {
            charSequence = context.getText(n2);
        }
        o2.mo4627l0(new C20795a(b, (CharSequence) null, charSequence));
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_rides_center_empty_impression");
        mo46797j2(aVar.mo49933a());
    }

    /* renamed from: n2 */
    public abstract int mo46281n2();

    /* renamed from: o2 */
    public final RecyclerView mo46282o2() {
        RecyclerView recyclerView = this.f40196p;
        if (recyclerView != null) {
            return recyclerView;
        }
        C24362h.m61217l("recyclerView");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.tod_center_fragment, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C24362h.m61210e(requireContext, "requireContext()");
        View l2 = mo46799l2(R.id.recycler_view);
        C24362h.m61210e(l2, "viewById(R.id.recycler_view)");
        this.f40196p = (RecyclerView) l2;
        mo46282o2().setLayoutManager(new LinearLayoutManager(requireContext));
        mo46282o2().mo4593g(new C18665b(requireContext, R.drawable.divider_horizontal_full), -1);
        mo46282o2().setAdapter(new C12793c());
    }
}
