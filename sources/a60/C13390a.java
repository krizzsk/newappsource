package a60;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.lifecycle.C1026n0;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import c70.C13751d;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.Color;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.request.UserRequestError;
import i00.C17522a;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p028ba.C1512f;
import p028ba.C1513g;
import p145k5.C5488g;
import p453dw.C16729e;
import p669mz.C18490f;
import p782rv.C19341f;
import p808sx.C19568d;
import p977zz.C20961r;
import p977zz.C20963s;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w50.C20277a;
import w50.C20283g;

/* renamed from: a60.a */
public class C13390a extends C15676b<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f33229p = 0;

    /* renamed from: h */
    public final C13391a f33230h = new C13391a();

    /* renamed from: i */
    public final C19341f f33231i = new C19341f(this, 1);

    /* renamed from: j */
    public C20283g f33232j;

    /* renamed from: k */
    public TextInputLayout f33233k;

    /* renamed from: l */
    public EditText f33234l;

    /* renamed from: m */
    public Button f33235m;

    /* renamed from: n */
    public ColorStateList f33236n;

    /* renamed from: o */
    public ProgressBar f33237o;

    /* renamed from: a60.a$a */
    public class C13391a extends C17522a {
        public C13391a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C13390a aVar = C13390a.this;
            int i4 = C13390a.f33229p;
            aVar.mo40267T1((Exception) null);
            aVar.f33235m.setEnabled(!C20964s0.m49092j(aVar.f33234l.getText()));
        }
    }

    /* renamed from: a60.a$b */
    public class C13392b implements C1044w<C20961r<?>> {

        /* renamed from: a */
        public final /* synthetic */ LiveData f33239a;

        public C13392b(C18490f fVar) {
            this.f33239a = fVar;
        }

        public final void onChanged(Object obj) {
            C20961r rVar = (C20961r) obj;
            this.f33239a.removeObserver(this);
            C13390a aVar = C13390a.this;
            aVar.f33235m.setClickable(true);
            aVar.f33235m.setTextColor(aVar.f33236n);
            aVar.f33237o.setVisibility(4);
            if (rVar.f52711a) {
                C13390a.this.dismissAllowingStateLoss();
            } else {
                C13390a.this.mo40267T1(rVar.f52713c);
            }
        }
    }

    public C13390a() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public final void mo40266S1() {
        String C = C20964s0.m49082C(this.f33234l.getText());
        if (!C20964s0.m49092j(C)) {
            this.f33235m.setClickable(false);
            this.f33235m.setTextColor(Color.f41004h.f41007b);
            this.f33237o.setVisibility(0);
            C20283g gVar = this.f33232j;
            C13393b bVar = new C13393b(C);
            gVar.getClass();
            C18490f fVar = new C18490f();
            PaymentGatewayInfo value = gVar.f51438l.getValue();
            if (value == null) {
                fVar.setValue(new C20961r((Exception) new IllegalStateException("payment info doesn't exist")));
            } else {
                UUID a = gVar.mo52451a();
                PaymentOptions d = gVar.mo52453d();
                C20277a aVar = new C20277a(value.f42673b, gVar.f51436j.getValue(), gVar.f51435i.getValue(), gVar.f51434h.getValue(), value.f42676e);
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                Tasks.call(executorService, new C5488g(gVar, 8)).onSuccessTask(executorService, new C1512f(7, aVar, bVar)).onSuccessTask(executorService, new C1513g(d, 13)).addOnCompleteListener(MoovitExecutors.MAIN_THREAD, new C16729e(1, gVar, a)).addOnCompleteListener((Executor) executorService, new C20963s(fVar));
            }
            fVar.observe(this, new C13392b(fVar));
        }
    }

    /* renamed from: T1 */
    public final void mo40267T1(Exception exc) {
        String str = null;
        if (exc == null) {
            this.f33233k.setError((CharSequence) null);
            return;
        }
        int i = C13751d.f33851b;
        if (exc instanceof UserRequestError) {
            str = ((UserRequestError) exc).mo49161c();
        }
        if (str != null) {
            this.f33233k.setError(str);
        } else {
            this.f33233k.setError(getString(C25754i.general_error_title));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33232j = (C20283g) new C1026n0(requireActivity()).mo4313a(C20283g.class);
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
        View inflate = layoutInflater.inflate(C25751f.add_voucher_dialog_fragment, viewGroup, false);
        this.f33233k = (TextInputLayout) inflate.findViewById(C25750e.voucher_code_input_layout);
        EditText editText = (EditText) inflate.findViewById(C25750e.voucher_code_edit_text);
        this.f33234l = editText;
        editText.addTextChangedListener(this.f33230h);
        this.f33234l.setOnEditorActionListener(this.f33231i);
        Button button = (Button) inflate.findViewById(C25750e.action_button);
        this.f33235m = button;
        button.setOnClickListener(new C19568d(this, 6));
        this.f33235m.setEnabled(false);
        this.f33236n = this.f33235m.getTextColors();
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(C25750e.progress_bar);
        this.f33237o = progressBar;
        progressBar.setIndeterminateTintList(this.f33236n);
        return inflate;
    }
}
