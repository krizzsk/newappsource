package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;
import ja0.C12797f;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import p028ba.C1512f;
import p130j2.C5367a;

/* renamed from: com.moovit.app.ads.f */
public final class C14738f extends RecyclerView.Adapter<C12797f> {

    /* renamed from: g */
    public final C14739a f37512g = new C14739a();

    /* renamed from: h */
    public RecyclerView f37513h;

    /* renamed from: i */
    public final AdSource f37514i;

    /* renamed from: j */
    public final C14741h f37515j;

    /* renamed from: k */
    public AdView f37516k;

    /* renamed from: l */
    public int f37517l;

    /* renamed from: com.moovit.app.ads.f$a */
    public class C14739a extends BroadcastReceiver {
        public C14739a() {
        }

        public final void onReceive(Context context, Intent intent) {
            C14738f.this.mo44743j();
        }
    }

    public C14738f(AdSource adSource, C14741h hVar) {
        C21100e.m49373x(adSource, "adSource");
        this.f37514i = adSource;
        this.f37515j = hVar;
    }

    public final int getItemCount() {
        return 1;
    }

    /* renamed from: j */
    public final void mo44743j() {
        RecyclerView recyclerView = this.f37513h;
        if (recyclerView != null) {
            Task<String> c = MobileAdsManager.m37073h().mo44706c(this.f37514i);
            Executor executor = MoovitExecutors.MAIN_THREAD;
            c.continueWithTask(executor, new C1512f(2, this, recyclerView)).addOnCompleteListener(executor, new C14737e(this, 0));
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        this.f37517l = context.getResources().getDimensionPixelOffset(R.dimen.screen_edge);
        this.f37513h = recyclerView;
        MobileAdsManager.m37075o(context, this.f37512g);
        if (this.f37516k == null) {
            mo44743j();
        }
    }

    public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        FrameLayout frameLayout = (FrameLayout) ((C12797f) a0Var).itemView;
        frameLayout.removeAllViews();
        frameLayout.setPadding(0, 0, 0, 0);
        AdView adView = this.f37516k;
        if (adView != null) {
            ViewParent parent = adView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f37516k);
            }
            frameLayout.addView(this.f37516k, UiUtils.m40254m());
            if (this.f37516k.getResponseInfo() != null) {
                int i2 = this.f37517l;
                frameLayout.setPadding(i2, i2, i2, i2);
            }
        }
    }

    public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C12797f(C13715c.m34239e(viewGroup, R.layout.ads_inline_banner_container, viewGroup, false));
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        C14739a aVar = this.f37512g;
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        C5367a.m13473a(context).mo21148d(aVar);
        this.f37513h = null;
    }
}
