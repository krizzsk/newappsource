package com.moovit.micromobility.purchase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.C16202a;
import com.moovit.micromobility.purchase.error.MicroMobilityError;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseGenericIntent;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseIntent;
import com.moovit.micromobility.purchase.step.MicroMobilityPurchaseStep;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.request.UserRequestError;
import h60.C17327j1;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import l30.C5566a0;
import l30.C5577i;
import l30.C5594w;
import l30.C5597z;
import p054d0.C4267a0;
import p244s3.C6443r;
import p372at.C13515b;
import p431cy.C16525b;
import p471eq.C16851b;
import p471eq.C16855d;
import p495fq.C17060e;
import p555ie.C17589h;
import p687nt.C18588a;
import p805su.C19543e;
import p858uz.C20061g;
import u30.C6689c;

public class MicroMobilityPurchaseActivity extends AbstractPaymentGatewayActivity implements MicroMobilityPurchaseStep.C4161a {

    /* renamed from: Y */
    public static final /* synthetic */ int f14911Y = 0;

    /* renamed from: X */
    public C6689c f14912X;

    /* renamed from: A2 */
    public final void mo19506A2(Exception exc) {
        int i = C13751d.f33851b;
        if (exc instanceof UserRequestError) {
            mo44530n2(MicroMobilityError.createErrorDialog(this, (UserRequestError) exc));
        } else {
            mo44530n2(C13751d.m34341b(this, (String) null, exc));
        }
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if (mo44529n1(C5597z.fragment_container) == null) {
            finish();
        } else {
            MicroMobilityError.onErrorDialogDismissed(this, str);
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo19509z2(intent);
    }

    /* renamed from: d1 */
    public final C16855d mo19507d1() {
        int i = C5597z.view_pager;
        C16525b c = new C17060e(this).mo49508c();
        c.mo49314a(TimeUnit.SECONDS.toMillis(30));
        return new C16855d(this, i, Collections.singletonList((C16851b) c.f43144b));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C5566a0.micro_mobility_purchase_activity);
        this.f14912X = (C6689c) new C1026n0(this).mo4313a(C6689c.class);
        if (mo44529n1(C5597z.fragment_container) == null) {
            mo19509z2(getIntent());
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if (MicroMobilityError.onErrorDialogButtonClicked(this, str, i)) {
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final void mo19508y2(Fragment fragment) {
        mo44506I1();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        int i = C5597z.fragment_container;
        if (mo44529n1(i) != null) {
            aVar.mo4112g(C5594w.slide_fragment_enter, C5594w.slide_fragment_exit, C5594w.slide_fragment_pop_enter, C5594w.slide_fragment_pop_exit);
            aVar.mo4111f(i, fragment, (String) null);
            aVar.mo4110c((String) null);
        } else {
            aVar.mo4111f(i, fragment, (String) null);
        }
        aVar.mo4040d();
    }

    /* renamed from: z2 */
    public final void mo19509z2(Intent intent) {
        mo44543u2((CharSequence) null);
        MicroMobilityPurchaseIntent microMobilityPurchaseIntent = (MicroMobilityPurchaseIntent) intent.getParcelableExtra("purchaseIntent");
        if (microMobilityPurchaseIntent == null) {
            microMobilityPurchaseIntent = new MicroMobilityPurchaseGenericIntent(LatLonE6.m40177j(mo44542u1()));
        }
        C6689c cVar = this.f14912X;
        cVar.getClass();
        C5577i a = C5577i.m13786a();
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        Tasks.call(executorService, new C17589h(a, 3)).onSuccessTask(executorService, new C17327j1(microMobilityPurchaseIntent, 19)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C6443r(1)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C4267a0(cVar, 12)).addOnSuccessListener((Activity) this, new C13515b(this, 6)).addOnFailureListener((Activity) this, (OnFailureListener) new C19543e(this, 3)).addOnCompleteListener((Activity) this, new C18588a(this, 3));
    }
}
