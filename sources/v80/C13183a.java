package v80;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.C1026n0;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.error.TicketingErrorAction;
import java.util.Set;
import p484ff.C16984m;
import p543hq.C17474b;
import p80.C12991b;
import p910xf.C20481j;

/* renamed from: v80.a */
public abstract class C13183a<Step extends PurchaseStep, Result extends PurchaseStepResult> extends C15682c<PurchaseTicketActivity> {

    /* renamed from: n */
    public C13186d f32727n;

    /* renamed from: o */
    public Step f32728o;

    public C13183a() {
        super(PurchaseTicketActivity.class);
    }

    /* renamed from: K1 */
    public Set<String> mo23781K1() {
        return C16530d.m42016i(2, "METRO_CONTEXT", "TICKETING_CONFIGURATION");
    }

    /* renamed from: V0 */
    public void mo19423V0(Bundle bundle, String str) {
        TicketingErrorAction.onErrorDialogDismissed(this.f40822c, str);
    }

    /* renamed from: m2 */
    public C17474b.C17475a mo39427m2(Step step) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "filter_screen_impression");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, step.f23247c);
        return aVar;
    }

    /* renamed from: n2 */
    public final void mo40058n2(Result result) {
        if (mo46785T1("TICKETING_CONFIGURATION")) {
            mo46796i2();
            this.f32727n.mo40059a((C12991b) mo46776J1("TICKETING_CONFIGURATION"), result).addOnSuccessListener((Activity) requireActivity(), new C16984m(this, 13)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20481j(this, 7));
        }
    }

    /* renamed from: o2 */
    public void mo23789o2(String str) {
        ((PurchaseTicketActivity) this.f40822c).setTitle(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = mo46782Q1().getString("stepId");
        if (string != null) {
            C13186d dVar = (C13186d) new C1026n0(requireActivity()).mo4313a(C13186d.class);
            this.f32727n = dVar;
            Step step = (PurchaseStep) dVar.f32739b.mo4292b(string);
            this.f32728o = step;
            if (step == null) {
                throw new IllegalStateException("Missing step data.");
            }
            return;
        }
        throw new IllegalStateException("Did you called newInstance(...)?");
    }

    public void onStart() {
        super.onStart();
        mo23789o2(this.f32728o.f23248d);
        mo46797j2(mo39427m2(this.f32728o).mo49933a());
    }

    /* renamed from: t0 */
    public boolean mo19430t0(String str, int i, Bundle bundle) {
        if (TicketingErrorAction.onErrorDialogButtonClicked(this.f40822c, str, i)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
