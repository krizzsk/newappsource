package q50;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCard3DSException;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import com.moovit.payment.clearance.model.CreditCardFields;
import com.moovit.view.p340cc.C7959a;
import com.moovit.view.p340cc.CreditCardFormView;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import l50.C18171b;
import p242s1.C6333d0;
import p501fw.C17102a;
import p824tp.C19728f;
import q50.C19080b;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: q50.c */
public abstract class C19082c extends C19080b<C7959a, CreditCardToken> implements C18171b.C18172a {

    /* renamed from: t */
    public static final /* synthetic */ int f48505t = 0;

    /* renamed from: p */
    public CreditCardFormView f48506p;

    /* renamed from: q */
    public Button f48507q;

    /* renamed from: r */
    public ColorStateList f48508r;

    /* renamed from: s */
    public ProgressBar f48509s;

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: V */
    public void mo50589V(CreditCardToken creditCardToken, String str) {
        if (str == null) {
            mo51512m2(new ApplicationBugException("Payment token can't be null while payment!"));
        } else {
            mo51513n2(new C19080b.C19081a(str, creditCardToken));
        }
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        int i;
        this.f48506p = (CreditCardFormView) view.findViewById(C25750e.card_form);
        CreditCardFields creditCardFields = this.f48502n.f42587e.f42775d;
        if (creditCardFields != null) {
            i = creditCardFields.mo48870b();
        } else {
            i = 0;
        }
        this.f48506p.setRequiredFields(i);
        this.f48506p.setCountryCode(C19728f.m47195a(requireContext()).f50165a.f16142q);
        Button button = (Button) view.findViewById(C25750e.button);
        this.f48507q = button;
        button.setOnClickListener(new C17102a(this, 19));
        this.f48508r = this.f48507q.getTextColors();
        TextView textView = (TextView) view.findViewById(C25750e.title);
        textView.setText(C25754i.payment_my_account_add_title);
        C6333d0.m15030r(textView, true);
        ((TextView) view.findViewById(C25750e.subtitle)).setText(C25754i.payment_my_account_add_subtitle);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C25750e.progress_bar);
        this.f48509s = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(this.f48507q.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: m2 */
    public final void mo51512m2(Exception exc) {
        this.f48507q.setClickable(true);
        this.f48507q.setTextColor(this.f48508r);
        this.f48509s.setVisibility(4);
        if (exc instanceof CreditCard3DSException) {
            ((CreditCard3DSException) exc).mo48844a().show(getChildFragmentManager(), "3ds_verification_dialog");
        } else {
            super.mo51512m2(exc);
        }
    }

    /* renamed from: o2 */
    public final void mo51514o2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, C19080b.C19081a<CreditCardToken> aVar) {
        this.f48507q.setClickable(true);
        this.f48507q.setTextColor(this.f48508r);
        this.f48509s.setVisibility(4);
        super.mo51514o2(clearanceProviderPaymentInstructions, aVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_credit_card_form_fragment, viewGroup, false);
    }

    /* renamed from: q2 */
    public final Task mo50776q2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, Object obj) {
        ClearanceProviderInstructions clearanceProviderInstructions = clearanceProviderPaymentInstructions.f42587e.f42774c;
        Map<String, String> map = clearanceProviderInstructions.f42606d;
        return mo50784r2(requireContext(), clearanceProviderInstructions.f42604b, (C7959a) obj, map);
    }

    /* renamed from: r2 */
    public abstract Task<C19080b.C19081a<CreditCardToken>> mo50784r2(Context context, String str, C7959a aVar, Map<String, String> map);
}
