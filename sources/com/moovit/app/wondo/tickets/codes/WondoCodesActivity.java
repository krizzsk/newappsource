package com.moovit.app.wondo.tickets.codes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import o00.C18665b;
import o00.C18671h;
import p250s9.C6489b;
import p453dw.C16740o;
import p543hq.C17474b;
import p739px.C19037a;
import p783rw.C19370b;
import p785ry.C19385e;
import p809sy.C19574a;

public class WondoCodesActivity extends MoovitAppActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f40679Z = 0;

    /* renamed from: U */
    public final C15646a f40680U = new C15646a(R.layout.wondo_codes_empty_state);

    /* renamed from: X */
    public final C15647b f40681X = new C15647b(R.layout.general_error_view);

    /* renamed from: Y */
    public RecyclerView f40682Y;

    /* renamed from: com.moovit.app.wondo.tickets.codes.WondoCodesActivity$a */
    public class C15646a extends C18671h {
        public C15646a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.itemView.findViewById(R.id.purchase_button).setOnClickListener(new C19037a(this, 1));
            return onCreateViewHolder;
        }
    }

    /* renamed from: com.moovit.app.wondo.tickets.codes.WondoCodesActivity$b */
    public class C15647b extends C18671h {
        public C15647b(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C16740o(this, 6));
            return onCreateViewHolder;
        }
    }

    /* renamed from: A2 */
    public final void mo46673A2(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        UiUtils.m40238F(i, findViewById(R.id.shadow), findViewById(R.id.purchase_button));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_codes_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f40682Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f40682Y.mo4593g(new C18665b(this, R.drawable.divider_horizontal_full), -1);
        findViewById(R.id.purchase_button).setOnClickListener(new C19370b(this, 5));
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo46674y2();
    }

    /* renamed from: y2 */
    public final void mo46674y2() {
        mo46673A2(false);
        this.f40682Y.mo4627l0(new C12793c());
        Task<TContinuationResult> onSuccessTask = C19385e.f49315c.mo51792b().onSuccessTask(MoovitExecutors.COMPUTATION, new C6489b(13));
        onSuccessTask.addOnCompleteListener((Activity) this, (OnCompleteListener<TContinuationResult>) new C19574a(0, this, onSuccessTask));
    }

    /* renamed from: z2 */
    public final void mo46675z2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo44545v2(aVar.mo49933a());
        Intent y2 = WondoOffersActivity.m39988y2(this, (String) null);
        y2.addFlags(603979776);
        startActivity(y2);
        finish();
    }
}
