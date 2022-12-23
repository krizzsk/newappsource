package m60;

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
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.CreditCard3DSException;
import com.moovit.payment.clearance.CreditCardRequest;
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
import p597jy.C17979a;
import p824tp.C19728f;
import v40.C25750e;
import v40.C25751f;

/* renamed from: m60.b */
public abstract class C18342b extends C18341a<C7959a, CreditCardToken> implements C18171b.C18172a {

    /* renamed from: t */
    public static final /* synthetic */ int f46769t = 0;

    /* renamed from: p */
    public CreditCardFormView f46770p;

    /* renamed from: q */
    public Button f46771q;

    /* renamed from: r */
    public ColorStateList f46772r;

    /* renamed from: s */
    public ProgressBar f46773s;

    /* renamed from: m60.b$a */
    public static /* synthetic */ class C18343a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46774a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.payment.clearance.CreditCardRequest$Action[] r0 = com.moovit.payment.clearance.CreditCardRequest.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46774a = r0
                com.moovit.payment.clearance.CreditCardRequest$Action r1 = com.moovit.payment.clearance.CreditCardRequest.Action.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46774a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.clearance.CreditCardRequest$Action r1 = com.moovit.payment.clearance.CreditCardRequest.Action.CHANGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m60.C18342b.C18343a.<clinit>():void");
        }
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("METRO_CONTEXT");
    }

    /* renamed from: V */
    public final void mo50589V(CreditCardToken creditCardToken, String str) {
        mo50797q2(creditCardToken);
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        int i;
        CreditCardRequest creditCardRequest = this.f46768n;
        this.f46770p = (CreditCardFormView) view.findViewById(C25750e.card_form);
        CreditCardFields creditCardFields = this.f46768n.f42590b.f42775d;
        if (creditCardFields != null) {
            i = creditCardFields.mo48870b();
        } else {
            i = 0;
        }
        this.f46770p.setRequiredFields(i);
        this.f46770p.setCountryCode(C19728f.m47195a(requireContext()).f50165a.f16142q);
        Button button = (Button) view.findViewById(C25750e.button);
        this.f46771q = button;
        button.setOnClickListener(new C17979a(this, 10));
        this.f46772r = this.f46771q.getTextColors();
        TextView textView = (TextView) view.findViewById(C25750e.title);
        textView.setText(creditCardRequest.f42591c);
        C6333d0.m15030r(textView, true);
        ((TextView) view.findViewById(C25750e.subtitle)).setText(creditCardRequest.f42592d);
        ProgressBar progressBar = (ProgressBar) view.findViewById(C25750e.progress_bar);
        this.f46773s = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(this.f46771q.getCurrentTextColor(), PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: n2 */
    public final void mo50794n2(CreditCardRequest creditCardRequest, PaymentMethod paymentMethod) {
        this.f46771q.setClickable(true);
        this.f46771q.setTextColor(this.f46772r);
        this.f46773s.setVisibility(4);
        super.mo50794n2(creditCardRequest, paymentMethod);
    }

    /* renamed from: o2 */
    public final void mo50795o2(Exception exc) {
        this.f46771q.setClickable(true);
        this.f46771q.setTextColor(this.f46772r);
        this.f46773s.setVisibility(4);
        if (exc instanceof CreditCard3DSException) {
            ((CreditCard3DSException) exc).mo48844a().show(getChildFragmentManager(), "3ds_verification_dialog");
        } else {
            super.mo50795o2(exc);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_credit_card_form_fragment, viewGroup, false);
    }

    /* renamed from: r2 */
    public final Task mo50590r2(CreditCardRequest creditCardRequest, Object obj) {
        C7959a aVar = (C7959a) obj;
        ClearanceProviderInstructions clearanceProviderInstructions = creditCardRequest.f42590b.f42774c;
        Map<String, String> map = clearanceProviderInstructions.f42606d;
        CreditCardRequest.Action action = creditCardRequest.f42594f;
        int i = C18343a.f46774a[action.ordinal()];
        if (i == 1) {
            return mo50791t2(requireContext(), clearanceProviderInstructions.f42604b, aVar, map);
        }
        if (i == 2) {
            return mo50798s2(requireContext(), aVar, map);
        }
        return Tasks.forException(new ApplicationBugException("Unsupported action: " + action));
    }

    /* renamed from: s2 */
    public Task mo50798s2(Context context, C7959a aVar, Map map) {
        throw new UnsupportedOperationException(getClass().getSimpleName() + ", does not support change action!");
    }

    /* renamed from: t2 */
    public abstract Task<CreditCardToken> mo50791t2(Context context, String str, C7959a aVar, Map<String, String> map);
}
