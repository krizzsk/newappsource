package b60;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.view.FormatTextView;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.view.p340cc.C7963e;
import i00.C17522a;
import p480ez.C16910b;
import p543hq.C17474b;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25755j;
import w40.C25760c;

/* renamed from: b60.b */
public class C13571b extends C15676b<MoovitActivity> {

    /* renamed from: k */
    public static final /* synthetic */ int f33523k = 0;

    /* renamed from: h */
    public CreditCardPaymentMethod f33524h;

    /* renamed from: i */
    public EditText f33525i;

    /* renamed from: j */
    public Button f33526j;

    /* renamed from: b60.b$a */
    public class C13572a extends C17522a {
        public C13572a() {
        }

        public final void afterTextChanged(Editable editable) {
            C13571b.this.f33526j.setEnabled(C7963e.m18150a(editable));
        }
    }

    /* renamed from: b60.b$b */
    public interface C13573b {
        /* renamed from: E0 */
        void mo24144E0(CreditCardPaymentMethod creditCardPaymentMethod, String str);
    }

    public C13571b() {
        super(MoovitActivity.class);
        setStyle(0, C25755j.ThemeOverlay_Moovit_Dialog_Bottom);
    }

    /* renamed from: S1 */
    public void mo40452S1(CreditCardPaymentMethod creditCardPaymentMethod, String str) {
        mo46753L1(C13573b.class, new C25760c(2, creditCardPaymentMethod, str));
    }

    /* renamed from: T1 */
    public final void mo40453T1() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "cvv_submitted");
        mo22564R1(aVar.mo49933a());
        mo40452S1(this.f33524h, C20964s0.m49082C(this.f33525i.getText()));
        dismissAllowingStateLoss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreditCardPaymentMethod creditCardPaymentMethod = (CreditCardPaymentMethod) mo46752K1().getParcelable("paymentMethod");
        this.f33524h = creditCardPaymentMethod;
        if (creditCardPaymentMethod == null) {
            throw new ApplicationBugException("Did you use PurchaseCVVDialogFragment.newInstance(...)?");
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_cvv_validation, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "cvv_dialog_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((FormatTextView) view.findViewById(C25750e.text)).setArguments(this.f33524h.f63943e.f24083c);
        EditText editText = (EditText) view.findViewById(C25750e.cvv_edit_text);
        this.f33525i = editText;
        editText.addTextChangedListener(new C13572a());
        this.f33525i.setOnEditorActionListener(new C13570a(this));
        Button button = (Button) view.findViewById(C25750e.confirm_button);
        this.f33526j = button;
        button.setOnClickListener(new C16910b(this, 8));
    }
}
