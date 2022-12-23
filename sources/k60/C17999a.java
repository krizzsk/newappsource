package k60;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.Color;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import i60.C17559a;
import p304x.C7097r;
import p543hq.C17474b;
import v40.C25750e;
import v40.C25751f;
import w40.C25761d;
import z20.C20806a;

/* renamed from: k60.a */
public abstract class C17999a extends C15682c<PaymentRegistrationActivity> {

    /* renamed from: q */
    public static final /* synthetic */ int f46086q = 0;

    /* renamed from: n */
    public Button f46087n;

    /* renamed from: o */
    public ColorStateList f46088o;

    /* renamed from: p */
    public ProgressBar f46089p;

    public C17999a() {
        super(PaymentRegistrationActivity.class);
    }

    /* renamed from: W1 */
    public void mo23788W1(View view) {
        mo50505v2();
    }

    /* renamed from: m2 */
    public C17474b.C17475a mo50497m2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49058q2());
        return aVar;
    }

    /* renamed from: n2 */
    public C17474b.C17475a mo50498n2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.STEP_COMPLETED);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, mo49058q2());
        return aVar;
    }

    /* renamed from: o2 */
    public final PaymentRegistrationInfo mo50499o2() {
        return ((PaymentRegistrationActivity) this.f40822c).f42742Z;
    }

    public final boolean onBackPressed() {
        ProgressBar progressBar = this.f46089p;
        return progressBar != null && progressBar.getVisibility() == 0;
    }

    public void onStart() {
        super.onStart();
        mo50505v2();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (mo50506w2()) {
            Button button = (Button) view.findViewById(C25750e.button);
            this.f46087n = button;
            if (button != null) {
                this.f46088o = button.getTextColors();
                ViewParent parent = this.f46087n.getParent();
                if (parent instanceof ConstraintLayout) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                    LayoutInflater.from(view.getContext()).inflate(C25751f.payment_registration_step_progress_bar, constraintLayout, true);
                    ProgressBar progressBar = (ProgressBar) constraintLayout.findViewById(C25750e.progress_bar);
                    this.f46089p = progressBar;
                    progressBar.setIndeterminateTintList(this.f46088o);
                    return;
                }
                throw new IllegalStateException("Button parent must be ConstraintLayout!");
            }
            throw new IllegalStateException("Unable to find button with id R.id.button");
        }
    }

    /* renamed from: p2 */
    public final PaymentRegistrationInstructions mo50500p2() {
        return ((PaymentRegistrationActivity) this.f40822c).f42740X;
    }

    /* renamed from: q2 */
    public abstract String mo49058q2();

    /* renamed from: r2 */
    public final void mo50501r2() {
        if (mo50506w2()) {
            this.f46087n.setClickable(true);
            this.f46087n.setTextColor(this.f46088o);
            this.f46089p.setVisibility(4);
        }
    }

    /* renamed from: s2 */
    public boolean mo50502s2() {
        return !(this instanceof C18005d);
    }

    /* renamed from: t2 */
    public void mo50503t2() {
        mo50504u2((C17559a) null);
    }

    /* renamed from: u2 */
    public final void mo50504u2(C17559a aVar) {
        mo50501r2();
        mo46797j2(mo50498n2().mo49933a());
        PaymentRegistrationActivity paymentRegistrationActivity = (PaymentRegistrationActivity) this.f40822c;
        if (aVar != null) {
            PaymentRegistrationInfo paymentRegistrationInfo = paymentRegistrationActivity.f42742Z;
            paymentRegistrationInfo.f42745c = aVar.f45165a;
            paymentRegistrationInfo.f42746d = null;
            paymentRegistrationInfo.f42744b = aVar.f45166b;
            paymentRegistrationInfo.f42747e = aVar.f45167c;
            C25761d.m64299a().mo83594j(paymentRegistrationInfo.f42745c, paymentRegistrationInfo.f42744b);
            if (!aVar.f45167c) {
                new C20806a.C20807a("account_created_se").mo52935c();
            }
            PaymentRegistrationInstructions paymentRegistrationInstructions = aVar.f45168d;
            if (paymentRegistrationInstructions != null) {
                paymentRegistrationActivity.f42740X = paymentRegistrationInstructions;
                paymentRegistrationActivity.mo49013y2();
            }
        }
        paymentRegistrationActivity.mo49012C2();
    }

    /* renamed from: v2 */
    public final void mo50505v2() {
        if (this.f40824e && mo46775H1()) {
            MoovitExecutors.MAIN_THREAD.execute(new C7097r(21, this, mo50497m2().mo49933a()));
        }
    }

    /* renamed from: w2 */
    public boolean mo50506w2() {
        return !(this instanceof C18005d);
    }

    /* renamed from: x2 */
    public final void mo50507x2() {
        if (mo50506w2()) {
            this.f46087n.setClickable(false);
            this.f46087n.setTextColor(Color.f41004h.f41007b);
            this.f46089p.setVisibility(0);
        }
    }
}
