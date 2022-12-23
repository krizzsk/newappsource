package com.moovit.ticketing.purchase.extrainfo.split;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;
import m80.C12865a;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import z80.C13341b;

public class PurchaseSplitActivity extends MoovitActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f23282l0 = 0;

    /* renamed from: U */
    public PurchaseSplitInstructions f23283U;

    /* renamed from: X */
    public CurrencyAmount f23284X;

    /* renamed from: Y */
    public C7959a f23285Y;

    /* renamed from: Z */
    public C7959a f23286Z;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C12870f.purchase_split_activity);
        Intent intent = getIntent();
        this.f23283U = (PurchaseSplitInstructions) intent.getParcelableExtra("instructions");
        this.f23284X = (CurrencyAmount) intent.getParcelableExtra("totalPrice");
        mo24048y2("primary_cc_fragment", C12873i.payment_split_method_1_title, C12873i.payment_split_extra_card_subtitle, true);
    }

    /* renamed from: y2 */
    public final void mo24048y2(String str, int i, int i2, boolean z) {
        PurchaseSplitInstructions purchaseSplitInstructions = this.f23283U;
        String string = getString(i);
        String string2 = getString(i2);
        int i3 = C13341b.f33130n;
        Bundle bundle = new Bundle();
        C21100e.m49373x(purchaseSplitInstructions, "instructions");
        bundle.putParcelable("instructions", purchaseSplitInstructions);
        C21100e.m49373x(string, "title");
        bundle.putString("title", string);
        C21100e.m49373x(string2, "subtitle");
        bundle.putString("subtitle", string2);
        bundle.putBoolean("isPrimary", z);
        C13341b bVar = new C13341b();
        bVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        aVar.mo4112g(C12865a.slide_fragment_enter, C12865a.slide_fragment_exit, C12865a.slide_fragment_pop_enter, C12865a.slide_fragment_pop_exit);
        int i4 = C12869e.split_content;
        aVar.mo4111f(i4, bVar, str);
        if (supportFragmentManager.mo3983z(i4) != null) {
            aVar.mo4110c(str);
        }
        aVar.mo4040d();
    }
}
