package com.moovit.app.wondo.tickets.offers;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.MoovitExecutors;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenView;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.design.view.AlertMessageView;
import com.tranzmate.R;
import ja0.C12793c;
import o00.C18671h;
import o00.C18681n;
import p054d0.C4319x0;
import p244s3.C6447v;
import p783rw.C19370b;
import p785ry.C19385e;

public class WondoOffersActivity extends MoovitAppActivity implements WondoFullScreenView.C15651a {

    /* renamed from: Z */
    public static final /* synthetic */ int f40757Z = 0;

    /* renamed from: U */
    public final C18671h f40758U = new C18671h(R.layout.wondo_offers_empty_state);

    /* renamed from: X */
    public final C15667a f40759X = new C15667a(R.layout.general_error_view);

    /* renamed from: Y */
    public RecyclerView f40760Y;

    /* renamed from: com.moovit.app.wondo.tickets.offers.WondoOffersActivity$a */
    public class C15667a extends C18671h {
        public C15667a(int... iArr) {
            super(iArr);
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.C1119a0 onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            ((AlertMessageView) onCreateViewHolder.itemView).setNegativeButtonClickListener(new C19370b(this, 6));
            return onCreateViewHolder;
        }
    }

    /* renamed from: y2 */
    public static Intent m39988y2(Context context, String str) {
        Intent intent = new Intent(context, WondoOffersActivity.class);
        intent.putExtra("extra_application_id", str);
        return intent;
    }

    /* renamed from: A0 */
    public final void mo46677A0(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
    }

    /* renamed from: e */
    public final void mo46679e(WondoFullScreenDisplayInfo wondoFullScreenDisplayInfo) {
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_offers_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f40760Y = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f40760Y;
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(2, R.drawable.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(this, sparseIntArray, true), -1);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo46736z2();
    }

    /* renamed from: z2 */
    public final void mo46736z2() {
        this.f40760Y.mo4627l0(new C12793c());
        C19385e.f49315c.mo51792b().onSuccessTask(MoovitExecutors.COMPUTATION, new C4319x0(6, this, getIntent().getStringExtra("extra_application_id"))).addOnCompleteListener((Activity) this, new C6447v(this, 4));
    }
}
