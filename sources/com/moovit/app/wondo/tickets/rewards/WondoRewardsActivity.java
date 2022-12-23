package com.moovit.app.wondo.tickets.rewards;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import o00.C18671h;
import o00.C18681n;
import p394br.C13660f;
import p501fw.C17102a;
import p543hq.C17474b;
import p644lx.C18284b;
import p664mu.C18461p;
import p785ry.C19385e;

public class WondoRewardsActivity extends MoovitAppActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f40774Z = 0;

    /* renamed from: U */
    public final C15672a f40775U = new C15672a(R.layout.wondo_rewards_empty_view);

    /* renamed from: X */
    public final C15673b f40776X = new C15673b(R.layout.general_error_view);

    /* renamed from: Y */
    public RecyclerView f40777Y;

    /* renamed from: com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity$a */
    public class C15672a extends C18671h {
        public C15672a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.itemView.findViewById(R.id.purchase_button).setOnClickListener(new C18284b(this, 3));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity$b */
    public class C15673b extends C18671h {
        public C15673b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C17102a(this, 11));
            return onCreateViewHolder;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_rewards_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f40777Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f40777Y;
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        sparseIntArray.put(1, R.drawable.divider_horizontal_full);
        sparseIntArray.put(2, R.drawable.divider_horizontal_full);
        recyclerView2.mo4593g(new C18681n(this, sparseIntArray, true), -1);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo46740z2();
    }

    /* renamed from: y2 */
    public final void mo46739y2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo44545v2(aVar.mo49933a());
        Intent y2 = WondoOffersActivity.m39988y2(this, (String) null);
        y2.addFlags(603979776);
        startActivity(y2);
        finish();
    }

    /* renamed from: z2 */
    public final void mo46740z2() {
        this.f40777Y.mo4627l0(new C12793c());
        C19385e.f49315c.mo51792b().onSuccessTask(MoovitExecutors.COMPUTATION, new C13660f(8)).addOnCompleteListener(new C18461p(this, 2));
    }
}
