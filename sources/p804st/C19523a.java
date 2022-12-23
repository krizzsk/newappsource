package p804st;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import c70.C13751d;
import ci0.C21211f;
import com.moovit.C15682c;
import com.moovit.app.intro.login.FirstTimeLoginActivity;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.tranzmate.R;
import i00.C17522a;
import java.io.IOException;
import p039c7.C1800c;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20964s0;

/* renamed from: st.a */
public class C19523a extends C15682c<FirstTimeLoginActivity> {

    /* renamed from: t */
    public static final /* synthetic */ int f49621t = 0;

    /* renamed from: n */
    public final C19524a f49622n = new C19524a();

    /* renamed from: o */
    public final C19525b f49623o = new C19525b();

    /* renamed from: p */
    public EditText f49624p;

    /* renamed from: q */
    public EditText f49625q;

    /* renamed from: r */
    public ProgressBar f49626r;

    /* renamed from: s */
    public Button f49627s;

    /* renamed from: st.a$a */
    public class C19524a extends C21211f {
        public C19524a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19537h hVar = (C19537h) cVar;
            C19523a aVar = C19523a.this;
            aVar.f49626r.setVisibility(4);
            aVar.f49627s.setVisibility(0);
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C19537h hVar = (C19537h) cVar;
            C19523a aVar = C19523a.this;
            aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, serverException));
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C19537h hVar = (C19537h) cVar;
            C19523a aVar = C19523a.this;
            aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, iOException));
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C19537h hVar = (C19537h) cVar;
            C19523a aVar = C19523a.this;
            aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, iOException));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19537h hVar = (C19537h) cVar;
            C19538i iVar = (C19538i) gVar;
            FirstTimeLoginActivity firstTimeLoginActivity = (FirstTimeLoginActivity) C19523a.this.f40822c;
            if (firstTimeLoginActivity != null) {
                AlertDialogFragment.C15856a j = new AlertDialogFragment.C15856a((Context) firstTimeLoginActivity).mo47682k("complete_email_verification_dialog_fragment_tag").mo47683l(R.string.login_onboarding_phone_personal_details_success_title).mo47678g(R.string.login_onboarding_phone_personal_details_success).mo47681j(R.string.ok);
                j.mo47674c(true);
                firstTimeLoginActivity.mo44530n2(j.mo47673b());
            }
        }
    }

    /* renamed from: st.a$b */
    public class C19525b extends C17522a {
        public C19525b() {
        }

        public final void afterTextChanged(Editable editable) {
            C19523a aVar = C19523a.this;
            aVar.f49624p.setError((CharSequence) null);
            aVar.f49625q.setError((CharSequence) null);
            aVar.f49627s.setEnabled(aVar.mo51888m2(false));
        }
    }

    public C19523a() {
        super(FirstTimeLoginActivity.class);
    }

    /* renamed from: m2 */
    public final boolean mo51888m2(boolean z) {
        EditText editText = this.f49624p;
        if (editText == null || this.f49625q == null) {
            return false;
        }
        boolean z2 = true;
        if (!C20964s0.m49093k(editText.getText())) {
            if (z) {
                this.f49624p.setError(getString(R.string.invalid_email_error));
            }
            z2 = false;
        }
        if (!C20964s0.m49092j(this.f49625q.getText())) {
            return z2;
        }
        if (!z) {
            return false;
        }
        this.f49624p.setError(getString(R.string.invalid_name_error));
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.first_time_login_personal_details, viewGroup, false);
        EditText editText = (EditText) inflate.findViewById(R.id.email);
        this.f49624p = editText;
        editText.addTextChangedListener(this.f49623o);
        EditText editText2 = (EditText) inflate.findViewById(R.id.external_id);
        this.f49625q = editText2;
        editText2.addTextChangedListener(this.f49623o);
        this.f49626r = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        Button button = (Button) inflate.findViewById(R.id.continue_button);
        this.f49627s = button;
        button.setOnClickListener(new C1800c(this, 9));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        UiUtils.m40239G(this.f49624p);
    }
}
