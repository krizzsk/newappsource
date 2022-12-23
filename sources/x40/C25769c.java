package x40;

import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.moovit.payment.account.actions.AccountActionSelectionStepFragment;
import mf0.C24362h;

/* renamed from: x40.c */
public final /* synthetic */ class C25769c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AccountActionSelectionStepFragment.OptionsAdapter f64283b;

    public /* synthetic */ C25769c(AccountActionSelectionStepFragment.OptionsAdapter optionsAdapter) {
        this.f64283b = optionsAdapter;
    }

    public final void onClick(View view) {
        AccountActionSelectionStepFragment.OptionsAdapter optionsAdapter = this.f64283b;
        C24362h.m61211f(optionsAdapter, "this$0");
        C24362h.m61211f(view, "v");
        Object tag = view.getTag();
        C24362h.m61209d(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        ((MaterialCardView) view).setChecked(true);
        AccountActionSelectionStepFragment.OptionsAdapter.m64041l(optionsAdapter, intValue);
    }
}
