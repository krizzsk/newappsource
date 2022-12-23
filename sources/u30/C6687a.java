package u30;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.C1026n0;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStepResult;
import h60.C17327j1;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l30.C5577i;
import p244s3.C6441p;
import p304x.C7070l;
import p543hq.C17474b;
import p862vf.C20121e;
import p944yq.C20750a;
import p947yt.C20767b;

/* renamed from: u30.a */
public abstract class C6687a<Step extends MicroMobilityPurchaseStep, Result extends MicroMobilityPurchaseStepResult> extends C15682c<MicroMobilityPurchaseActivity> {

    /* renamed from: n */
    public C6689c f20765n;

    /* renamed from: o */
    public Step f20766o;

    public C6687a() {
        super(MicroMobilityPurchaseActivity.class);
    }

    /* renamed from: m2 */
    public final void mo22864m2(Result result) {
        mo46796i2();
        C6689c cVar = this.f20765n;
        cVar.getClass();
        C5577i a = C5577i.m13786a();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C20121e(a, 2)).onSuccessTask(executorService, new C7070l(result, 15)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C6441p(1)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C17327j1(cVar, 21)).addOnSuccessListener((Activity) requireActivity(), new C20750a(this, 7)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20767b(this, 3));
    }

    /* renamed from: n2 */
    public void mo19545n2(String str) {
        ((MicroMobilityPurchaseActivity) this.f40822c).setTitle(str);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = mo46782Q1().getString("stepId");
        if (string != null) {
            C6689c cVar = (C6689c) new C1026n0(requireActivity()).mo4313a(C6689c.class);
            this.f20765n = cVar;
            Step step = (MicroMobilityPurchaseStep) cVar.f20768b.mo4292b(string);
            this.f20766o = step;
            if (step == null) {
                throw new IllegalStateException("Missing step data.");
            }
            return;
        }
        throw new IllegalStateException("Did you called newInstance(...)?");
    }

    public void onStart() {
        super.onStart();
        mo19545n2(this.f20766o.f14922d);
        Step step = this.f20766o;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_step_impression");
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, step.f14921c);
        mo46797j2(aVar.mo49933a());
    }
}
