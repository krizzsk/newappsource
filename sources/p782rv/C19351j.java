package p782rv;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import c70.C13751d;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.commons.utils.UiUtils;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import i00.C17522a;
import p297w5.C6994a;
import p304x.C7041e;
import p527gy.C17261e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;
import p977zz.C20964s0;
import z90.C13350h;
import z90.C13351i;

/* renamed from: rv.j */
public class C19351j extends C19332a {

    /* renamed from: u */
    public static final /* synthetic */ int f49235u = 0;

    /* renamed from: n */
    public final C19352a f49236n = new C19352a();

    /* renamed from: o */
    public final C19353b f49237o = new C19353b();

    /* renamed from: p */
    public EditText f49238p;

    /* renamed from: q */
    public EditText f49239q;

    /* renamed from: r */
    public EditText f49240r;

    /* renamed from: s */
    public Button f49241s;

    /* renamed from: t */
    public final C19350i f49242t = new C19350i(this, 0);

    /* renamed from: rv.j$a */
    public class C19352a extends C20438i<C13350h, C13351i> {
        public C19352a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13350h hVar = (C13350h) cVar;
            C19351j.this.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13350h hVar = (C13350h) cVar;
            C13351i iVar = (C13351i) gVar;
            ((C17261e) ((RideSharingRegistrationActivity) C19351j.this.f40822c).getSystemService("user_profile_manager_service")).mo49806i();
            C19351j.this.mo51745p2(false);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13350h hVar = (C13350h) cVar;
            C19351j jVar = C19351j.this;
            jVar.mo46795h2(C13751d.m34341b(jVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: rv.j$b */
    public class C19353b extends C17522a {
        public C19353b() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C19351j jVar = C19351j.this;
            if (C20964s0.m49090h(jVar.f49240r.getText()) || C20964s0.m49090h(jVar.f49238p.getText()) || C20964s0.m49090h(jVar.f49239q.getText())) {
                z = false;
            } else {
                z = true;
            }
            jVar.f49241s.setEnabled(z);
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_PERSONAL_DETAILS;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_personal_details_fragment, viewGroup, false);
        EditText editText = (EditText) inflate.findViewById(R.id.email_input);
        this.f49240r = editText;
        editText.addTextChangedListener(this.f49237o);
        EditText editText2 = (EditText) inflate.findViewById(R.id.first_name);
        this.f49238p = editText2;
        editText2.addTextChangedListener(this.f49237o);
        EditText editText3 = (EditText) inflate.findViewById(R.id.last_name);
        this.f49239q = editText3;
        editText3.addTextChangedListener(this.f49237o);
        this.f49239q.setOnEditorActionListener(this.f49242t);
        TextView textView = (TextView) inflate.findViewById(R.id.support);
        String string = getString(R.string.ride_sharing_registration_personal_details_contact_support_phone_number);
        if (C20964s0.m49092j(string)) {
            textView.setVisibility(8);
        } else {
            Intent f = C20927a0.m49011f(string);
            if (f.resolveActivity(textView.getContext().getPackageManager()) == null) {
                textView.setVisibility(8);
            } else {
                String string2 = getString(R.string.ride_sharing_registration_personal_details_contact_support);
                textView.setText(getString(R.string.ride_sharing_registration_personal_details_support, string2));
                textView.setVisibility(0);
                C20964s0.m49105w(textView, string2, false, new C7041e(14, this, f));
            }
        }
        Button button = (Button) inflate.findViewById(R.id.save_button);
        this.f49241s = button;
        button.setOnClickListener(new C6994a(this, 21));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo51761s2(view);
    }

    /* renamed from: q2 */
    public final void mo51746q2() {
        View view = getView();
        if (view != null) {
            mo51761s2(view);
        }
    }

    /* renamed from: r2 */
    public final void mo51760r2() {
        boolean z;
        boolean z2 = false;
        if (!C20964s0.m49093k(this.f49240r.getText())) {
            this.f49240r.setError(getString(R.string.invalid_email_error));
            z = false;
        } else {
            z = true;
        }
        if (!C20964s0.m49094l(this.f49238p.getText())) {
            this.f49238p.setError(getString(R.string.invalid_name_error));
            z = false;
        }
        if (!C20964s0.m49094l(this.f49239q.getText())) {
            this.f49239q.setError(getString(R.string.invalid_name_error));
        } else {
            z2 = z;
        }
        if (z2) {
            RideSharingRegistrationInfo m2 = mo51742m2();
            m2.f39395k = C20964s0.m49082C(this.f49238p.getText());
            m2.f39396l = C20964s0.m49082C(this.f49239q.getText());
            m2.f39397m = C20964s0.m49082C(this.f49240r.getText());
            this.f40822c.mo44540t2(R.string.ride_sharing_registration_sending_personal_info);
            C13350h hVar = new C13350h(mo46783R1(), m2.f39395k, m2.f39396l, m2.f39397m);
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("set_user_info", hVar, L1, this.f49236n);
        }
    }

    /* renamed from: s2 */
    public final void mo51761s2(View view) {
        int i;
        RideSharingRegistrationInfo m2 = mo51742m2();
        String str = m2.f39397m;
        if (str != null) {
            this.f49240r.setText(str);
            this.f49240r.setSelection(m2.f39397m.length());
        }
        if (C20964s0.m49093k(m2.f39397m)) {
            i = 8;
        } else {
            i = 0;
        }
        UiUtils.m40238F(i, view.findViewById(R.id.email_input_title), view.findViewById(R.id.required_email), this.f49240r);
    }
}
