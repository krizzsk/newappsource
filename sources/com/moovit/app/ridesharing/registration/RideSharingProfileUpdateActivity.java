package com.moovit.app.ridesharing.registration;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import c70.C13751d;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.utils.UiUtils;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import i00.C17522a;
import java.util.HashSet;
import java.util.Set;
import p259t5.C6593c;
import p527gy.C17259d;
import p527gy.C17261e;
import p758qv.C19194a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;
import p977zz.C20975x0;
import z90.C13350h;
import z90.C13351i;

public class RideSharingProfileUpdateActivity extends MoovitAppActivity {

    /* renamed from: r0 */
    public static final /* synthetic */ int f39364r0 = 0;

    /* renamed from: U */
    public final C15256a f39365U = new C15256a();

    /* renamed from: X */
    public final C15257b f39366X = new C15257b();

    /* renamed from: Y */
    public final C19194a f39367Y = new C19194a(this);

    /* renamed from: Z */
    public EditText f39368Z;

    /* renamed from: l0 */
    public TextView f39369l0;

    /* renamed from: m0 */
    public EditText f39370m0;

    /* renamed from: n0 */
    public TextView f39371n0;

    /* renamed from: o0 */
    public EditText f39372o0;

    /* renamed from: p0 */
    public TextView f39373p0;

    /* renamed from: q0 */
    public Button f39374q0;

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity$a */
    public class C15256a extends C20438i<C13350h, C13351i> {
        public C15256a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C13350h hVar = (C13350h) cVar;
            RideSharingProfileUpdateActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C13350h hVar = (C13350h) cVar;
            C13351i iVar = (C13351i) gVar;
            RideSharingProfileUpdateActivity rideSharingProfileUpdateActivity = RideSharingProfileUpdateActivity.this;
            int i = RideSharingProfileUpdateActivity.f39364r0;
            ((C17261e) rideSharingProfileUpdateActivity.getSystemService("user_profile_manager_service")).mo49806i();
            rideSharingProfileUpdateActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C13350h hVar = (C13350h) cVar;
            RideSharingProfileUpdateActivity rideSharingProfileUpdateActivity = RideSharingProfileUpdateActivity.this;
            rideSharingProfileUpdateActivity.mo44530n2(C13751d.m34341b(rideSharingProfileUpdateActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingProfileUpdateActivity$b */
    public class C15257b extends C17522a {
        public C15257b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            RideSharingProfileUpdateActivity rideSharingProfileUpdateActivity = RideSharingProfileUpdateActivity.this;
            boolean z = false;
            UiUtils.m40238F(4, rideSharingProfileUpdateActivity.f39369l0, rideSharingProfileUpdateActivity.f39371n0, rideSharingProfileUpdateActivity.f39373p0);
            if (!C20964s0.m49090h(rideSharingProfileUpdateActivity.f39368Z.getText()) && !C20964s0.m49090h(rideSharingProfileUpdateActivity.f39370m0.getText()) && !C20964s0.m49090h(rideSharingProfileUpdateActivity.f39372o0.getText())) {
                z = true;
            }
            rideSharingProfileUpdateActivity.f39374q0.setEnabled(z);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.ride_sharing_profile_update_activity);
        this.f39368Z = (EditText) findViewById(R.id.first_name_input);
        this.f39369l0 = (TextView) findViewById(R.id.first_name_input_error);
        this.f39370m0 = (EditText) findViewById(R.id.last_name_input);
        this.f39371n0 = (TextView) findViewById(R.id.last_name_input_error);
        this.f39372o0 = (EditText) findViewById(R.id.email_input);
        this.f39373p0 = (TextView) findViewById(R.id.email_input_error);
        this.f39372o0.setOnEditorActionListener(this.f39367Y);
        this.f39368Z.addTextChangedListener(this.f39366X);
        this.f39370m0.addTextChangedListener(this.f39366X);
        this.f39372o0.addTextChangedListener(this.f39366X);
        Button button = (Button) findViewById(R.id.save_button);
        this.f39374q0 = button;
        button.setOnClickListener(new C6593c(this, 26));
        C17259d e = ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46575f().mo49805e();
        String str = e.f44602a;
        if (str != null) {
            this.f39368Z.setText(str);
            this.f39368Z.setSelection(str.length());
        }
        String str2 = e.f44603b;
        if (str2 != null) {
            this.f39370m0.setText(str2);
            this.f39370m0.setSelection(str2.length());
        }
        String str3 = e.f44606e;
        if (str3 != null) {
            this.f39372o0.setText(str3);
            this.f39372o0.setSelection(str3.length());
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45775y2() {
        boolean z;
        boolean z2 = false;
        if (!C20964s0.m49094l(this.f39368Z.getText())) {
            this.f39369l0.setVisibility(0);
            z = false;
        } else {
            z = true;
        }
        if (!C20964s0.m49094l(this.f39370m0.getText())) {
            this.f39371n0.setVisibility(0);
            z = false;
        }
        if (!C20964s0.m49093k(this.f39372o0.getText())) {
            this.f39373p0.setVisibility(0);
            z = false;
        }
        if (z) {
            C17259d e = ((UserAccountManager) mo44537r1("USER_ACCOUNT")).mo46575f().mo49805e();
            String C = C20964s0.m49082C(this.f39368Z.getText());
            String C2 = C20964s0.m49082C(this.f39370m0.getText());
            String C3 = C20964s0.m49082C(this.f39372o0.getText());
            if (!C20975x0.m49118e(C, e.f44602a) || !C20975x0.m49118e(C2, e.f44603b) || !C20975x0.m49118e(C3, e.f44606e)) {
                z2 = true;
            }
            if (!z2) {
                finish();
                return;
            }
            mo44540t2(R.string.ride_sharing_registration_sending_personal_info);
            C13350h hVar = new C13350h(mo44548x1(), C20964s0.m49082C(this.f39368Z.getText()), C20964s0.m49082C(this.f39370m0.getText()), C20964s0.m49082C(this.f39372o0.getText()));
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            mo44527k2("update_user_info", hVar, requestOptions, this.f39365U);
        }
    }
}
