package com.moovit.payment.registration;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c70.C13753f;
import com.appboy.Constants;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.request.RequestOptions;
import h60.C17341o0;
import h60.C17344p0;
import java.util.ArrayList;
import java.util.List;
import p090g1.C4732a;
import p906wz.C20436g;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;

public class PaymentRegistrationActivity extends MoovitPaymentActivity {

    /* renamed from: U */
    public PaymentRegistrationType f42739U;

    /* renamed from: X */
    public PaymentRegistrationInstructions f42740X;

    /* renamed from: Y */
    public Intent f42741Y;

    /* renamed from: Z */
    public PaymentRegistrationInfo f42742Z = new PaymentRegistrationInfo();

    /* renamed from: l0 */
    public final ArrayList f42743l0 = new ArrayList();

    /* renamed from: A2 */
    public static Intent m41717A2(Context context, PaymentRegistrationType paymentRegistrationType, String str) {
        Intent intent = new Intent(context, PaymentRegistrationActivity.class);
        intent.putExtra("type", paymentRegistrationType);
        intent.putExtra("paymentContext", str);
        intent.putExtra("feedbackIntent", (Parcelable) null);
        return intent;
    }

    /* renamed from: B2 */
    public static String m41718B2(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getQueryParameter("pc");
        }
        return intent.getStringExtra("paymentContext");
    }

    /* renamed from: z2 */
    public static Intent m41719z2(Context context, PaymentRegistrationType paymentRegistrationType, PaymentRegistrationInstructions paymentRegistrationInstructions) {
        Intent intent = new Intent(context, PaymentRegistrationActivity.class);
        intent.putExtra("type", paymentRegistrationType);
        intent.putExtra("instructions", paymentRegistrationInstructions);
        intent.putExtra("feedbackIntent", (Parcelable) null);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
    /* renamed from: C2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49012C2() {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f42743l0
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x000c
            goto L_0x0032
        L_0x000c:
            int r0 = v40.C25750e.fragment_container
            androidx.fragment.app.Fragment r0 = r9.mo44529n1(r0)
            k60.a r0 = (k60.C17999a) r0
            if (r0 != 0) goto L_0x001f
            java.util.ArrayList r0 = r9.f42743l0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x003e
        L_0x001f:
            java.util.ArrayList r4 = r9.f42743l0
            java.lang.Class r0 = r0.getClass()
            int r0 = r4.indexOf(r0)
            java.util.ArrayList r4 = r9.f42743l0
            int r4 = r4.size()
            int r4 = r4 + r2
            if (r0 != r4) goto L_0x0034
        L_0x0032:
            r0 = r3
            goto L_0x003e
        L_0x0034:
            java.util.ArrayList r4 = r9.f42743l0
            int r0 = r0 + 1
            java.lang.Object r0 = r4.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x003e:
            if (r0 != 0) goto L_0x0076
            z20.a$a r0 = new z20.a$a
            java.lang.String r1 = "registration_completed_se"
            r0.<init>(r1)
            com.moovit.payment.registration.PaymentRegistrationInstructions r1 = r9.f42740X
            java.lang.String r1 = r1.f42758b
            java.lang.String r3 = "payment_context"
            r0.mo52934b(r1, r3)
            r0.mo52935c()
            hq.b r0 = new hq.b
            com.moovit.analytics.AnalyticsEventKey r1 = com.moovit.analytics.AnalyticsEventKey.STEPS_COMPLETED
            r0.<init>(r1)
            r9.mo44545v2(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r1 = m41718B2(r1)
            java.lang.String r3 = "paymentContext"
            r0.putExtra(r3, r1)
            r9.setResult(r2, r0)
            r9.finish()
            return
        L_0x0076:
            androidx.fragment.app.FragmentManager r2 = r9.getSupportFragmentManager()
            androidx.fragment.app.s r2 = r2.mo3929G()
            r0.getClassLoader()
            java.lang.String r0 = r0.getName()
            androidx.fragment.app.Fragment r0 = r2.mo3992a(r0)
            k60.a r0 = (k60.C17999a) r0
            androidx.fragment.app.FragmentManager r2 = r9.getSupportFragmentManager()
            androidx.fragment.app.FragmentManager r4 = r9.getSupportFragmentManager()
            androidx.fragment.app.a r4 = p001a0.C0017h.m54K(r4, r4)
            int r5 = v40.C25747b.slide_fragment_enter
            int r6 = v40.C25747b.slide_fragment_exit
            int r7 = v40.C25747b.slide_fragment_pop_enter
            int r8 = v40.C25747b.slide_fragment_pop_exit
            r4.mo4112g(r5, r6, r7, r8)
            int r5 = v40.C25750e.fragment_container
            r4.mo4111f(r5, r0, r3)
            androidx.fragment.app.Fragment r0 = r9.mo44529n1(r5)
            k60.a r0 = (k60.C17999a) r0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.mo50502s2()
            if (r0 == 0) goto L_0x00b9
            r4.mo4110c(r3)
            goto L_0x00ca
        L_0x00b9:
            int r0 = r2.mo3926D()
            if (r0 <= 0) goto L_0x00ca
            androidx.fragment.app.FragmentManager$j r0 = r2.mo3925C(r1)
            int r0 = r0.getId()
            r2.mo3937R(r0, r1)
        L_0x00ca:
            r4.mo4043i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.registration.PaymentRegistrationActivity.mo49012C2():void");
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        for (Fragment next : getSupportFragmentManager().mo3930H()) {
            if (next.isVisible()) {
                FragmentManager childFragmentManager = next.getChildFragmentManager();
                if (childFragmentManager.mo3926D() > 0) {
                    childFragmentManager.mo3936Q();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R1 */
    public final void mo44511R1(Bundle bundle) {
        super.mo44511R1(bundle);
        if (bundle != null) {
            this.f42740X = (PaymentRegistrationInstructions) bundle.getParcelable("instructions");
            PaymentRegistrationInfo paymentRegistrationInfo = (PaymentRegistrationInfo) bundle.getParcelable("info");
            if (paymentRegistrationInfo != null) {
                this.f42742Z = paymentRegistrationInfo;
            }
        }
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        PaymentRegistrationInstructions paymentRegistrationInstructions = ((C17344p0) C13717b.m34256c(list)).f44729m;
        if (paymentRegistrationInstructions == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo44550y1());
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                finish();
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        this.f42740X = paymentRegistrationInstructions;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            WebInstruction.m41737f(this, data);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        PaymentRegistrationType paymentRegistrationType;
        super.mo19425e2(bundle);
        if (!isFinishing()) {
            setContentView(C25751f.payment_registration_activity);
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("prt");
                    if (C20964s0.m49090h(queryParameter)) {
                        paymentRegistrationType = PaymentRegistrationType.REGISTRATION;
                    } else {
                        char c = 65535;
                        int hashCode = queryParameter.hashCode();
                        if (hashCode != 112) {
                            if (hashCode == 114 && queryParameter.equals("r")) {
                                c = 1;
                            }
                        } else if (queryParameter.equals(Constants.APPBOY_PUSH_PRIORITY_KEY)) {
                            c = 0;
                        }
                        if (c != 0) {
                            paymentRegistrationType = PaymentRegistrationType.REGISTRATION;
                        } else {
                            paymentRegistrationType = PaymentRegistrationType.PURCHASE;
                        }
                    }
                } else {
                    paymentRegistrationType = (PaymentRegistrationType) intent.getParcelableExtra("type");
                    if (paymentRegistrationType == null) {
                        paymentRegistrationType = PaymentRegistrationType.REGISTRATION;
                    }
                }
                this.f42739U = paymentRegistrationType;
                if (this.f42740X == null) {
                    this.f42740X = (PaymentRegistrationInstructions) intent.getParcelableExtra("instructions");
                }
                Intent intent2 = (Intent) intent.getParcelableExtra("feedbackIntent");
                if (!(intent2 == null || intent2.resolveActivity(getPackageManager()) == null)) {
                    this.f42741Y = intent2;
                }
            }
            if (this.f42740X == null) {
                finish();
                return;
            }
            mo49013y2();
            if (mo44529n1(C25750e.fragment_container) == null) {
                mo49012C2();
            }
        }
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        String B2 = m41718B2(getIntent());
        if (B2 == null) {
            return null;
        }
        C17341o0 o0Var = new C17341o0(mo44548x1(), B2);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C17341o0.class, sb, "#");
        sb.append(o0Var.f44726w);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return new C13753f<>(sb2, o0Var, requestOptions);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("instructions", this.f42740X);
        bundle.putParcelable("info", this.f42742Z);
    }

    /* renamed from: y2 */
    public final void mo49013y2() {
        this.f42743l0.clear();
        for (PaymentRegistrationStep next : this.f42740X.f42759c) {
            if (this.f42739U.supportedSteps.contains(next)) {
                this.f42743l0.addAll(next.fragmentClasses);
            }
        }
    }
}
