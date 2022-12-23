package x40;

import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.payment.account.actions.AccountActionSelectionStepFragment;
import mf0.C24362h;

/* renamed from: x40.b */
public final /* synthetic */ class C25768b implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ AccountActionSelectionStepFragment.OptionsAdapter f64282a;

    public /* synthetic */ C25768b(AccountActionSelectionStepFragment.OptionsAdapter optionsAdapter) {
        this.f64282a = optionsAdapter;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        AccountActionSelectionStepFragment.OptionsAdapter optionsAdapter = this.f64282a;
        C24362h.m61211f(optionsAdapter, "this$0");
        C24362h.m61211f(abstractListItemView, "v");
        Object tag = abstractListItemView.getTag();
        C24362h.m61209d(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        if (z) {
            AccountActionSelectionStepFragment.OptionsAdapter.m64041l(optionsAdapter, intValue);
        }
    }
}
