package p782rv;

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
import com.tranzmate.R;
import i00.C17522a;
import p297w5.C6996c;
import p527gy.C17261e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import z90.C13350h;
import z90.C13351i;

/* renamed from: rv.d */
public class C19337d extends C19332a {

    /* renamed from: s */
    public static final /* synthetic */ int f49201s = 0;

    /* renamed from: n */
    public final C19338a f49202n = new C19338a();

    /* renamed from: o */
    public final C19336c f49203o = new C19336c(this);

    /* renamed from: p */
    public final C19339b f49204p = new C19339b();

    /* renamed from: q */
    public EditText f49205q;

    /* renamed from: r */
    public TextView f49206r;

    /* renamed from: rv.d$a */
    public class C19338a extends C17522a {
        public C19338a() {
        }

        public final void afterTextChanged(Editable editable) {
            UiUtils.m40238F(4, C19337d.this.f49206r);
        }
    }

    /* renamed from: rv.d$b */
    public class C19339b extends C20438i<C13350h, C13351i> {
        public C19339b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13350h hVar = (C13350h) cVar;
            C19337d.this.mo46784S1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13350h hVar = (C13350h) cVar;
            C13351i iVar = (C13351i) gVar;
            ((C17261e) ((RideSharingRegistrationActivity) C19337d.this.f40822c).getSystemService("user_profile_manager_service")).mo49806i();
            C19337d.this.mo51745p2(false);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13350h hVar = (C13350h) cVar;
            C19337d dVar = C19337d.this;
            dVar.mo46795h2(C13751d.m34341b(dVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_EMAIL;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_email_fragment, viewGroup, false);
        EditText editText = (EditText) inflate.findViewById(R.id.email_input);
        this.f49205q = editText;
        editText.addTextChangedListener(this.f49202n);
        this.f49205q.setOnFocusChangeListener(this.f49203o);
        this.f49206r = (TextView) inflate.findViewById(R.id.email_input_error);
        ((Button) inflate.findViewById(R.id.continue_button)).setOnClickListener(new C6996c(this, 26));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RideSharingRegistrationInfo m2 = mo51742m2();
        String str = m2.f39397m;
        if (str != null) {
            this.f49205q.setText(str);
            this.f49205q.setSelection(m2.f39397m.length());
        }
    }
}
