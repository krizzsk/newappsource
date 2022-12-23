package com.moovit.app.useraccount.profile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import c70.C13756i;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.profile.C15634a;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import ga0.C12704f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p130j2.C5367a;
import p479ey.C16905o;
import p527gy.C17259d;
import p527gy.C17261e;
import p543hq.C17474b;
import p597jy.C17980b;

public class EditProfileActivity extends MoovitAppActivity implements C15634a.C15635a, C12704f.C12706b {

    /* renamed from: m0 */
    public static final /* synthetic */ int f40629m0 = 0;

    /* renamed from: U */
    public final C15630a f40630U = new C15630a();

    /* renamed from: X */
    public C12704f f40631X;

    /* renamed from: Y */
    public C15634a f40632Y;

    /* renamed from: Z */
    public UserAccountManager f40633Z;

    /* renamed from: l0 */
    public C17261e f40634l0;

    /* renamed from: com.moovit.app.useraccount.profile.EditProfileActivity$a */
    public class C15630a extends BroadcastReceiver {
        public C15630a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("com.moovit.useraccount.user_disconnect_success")) {
                EditProfileActivity editProfileActivity = EditProfileActivity.this;
                int i = EditProfileActivity.f40629m0;
                editProfileActivity.mo46639y2();
            }
            if (action.equals("com.moovit.useraccount.user_disconnect_failure")) {
                EditProfileActivity editProfileActivity2 = EditProfileActivity.this;
                int i2 = EditProfileActivity.f40629m0;
                editProfileActivity2.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LOGOUT);
                aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, false);
                editProfileActivity2.mo44545v2(aVar.mo49933a());
                EditProfileActivity editProfileActivity3 = EditProfileActivity.this;
                C12704f fVar = editProfileActivity3.f40631X;
                if (!(fVar == null || fVar.getActivity() == null)) {
                    editProfileActivity3.f40631X.dismissAllowingStateLoss();
                    editProfileActivity3.f40631X = null;
                }
                EditProfileActivity editProfileActivity4 = EditProfileActivity.this;
                Toast.makeText(editProfileActivity4, editProfileActivity4.getString(R.string.response_read_error_message), 1).show();
            }
        }
    }

    /* renamed from: K */
    public final void mo39497K() {
        setResult(-1);
        finish();
        this.f40631X = null;
    }

    /* renamed from: Z */
    public final void mo46637Z() {
        C15634a aVar = this.f40632Y;
        if (aVar != null) {
            aVar.dismissAllowingStateLoss();
            this.f40632Y = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.edit_profile_layout);
        this.f40633Z = (UserAccountManager) getSystemService("user_account_manager_service");
        this.f40634l0 = (C17261e) getSystemService("user_profile_manager_service");
        C17259d e = this.f40634l0.mo49805e();
        ((ListItemView) findViewById(R.id.user_full_name)).setSubtitle((CharSequence) getString(R.string.user_profile_full_name, new Object[]{e.f44602a, e.f44603b}));
        ((ListItemView) findViewById(R.id.user_email)).setSubtitle((CharSequence) this.f40634l0.mo49805e().f44606e);
        findViewById(R.id.disconnect_btn).setOnClickListener(new C17980b(this));
        this.f40631X = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
    }

    /* renamed from: f0 */
    public final void mo46638f0() {
        C15634a aVar = this.f40632Y;
        if (aVar != null) {
            aVar.dismissAllowingStateLoss();
            this.f40632Y = null;
        }
        if (this.f40631X == null) {
            C12704f S1 = C12704f.m32465S1(R.string.user_account_disconnected, false);
            this.f40631X = S1;
            S1.show(getSupportFragmentManager(), C12704f.f31376m);
        }
        UserAccountManager userAccountManager = this.f40633Z;
        userAccountManager.getClass();
        userAccountManager.f40568c.put(UserAccountManager.Procedure.DISCONNECT.ordinal(), true);
        C13756i a = C13756i.m34349a(userAccountManager.f40566a);
        C16905o oVar = new C16905o(a.mo40679b());
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        a.mo40684g("userLogoutRequest", oVar, c, userAccountManager.f40571f);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        if (!this.f40633Z.f40568c.get(UserAccountManager.Procedure.DISCONNECT.ordinal())) {
            if (!this.f40633Z.mo46576g()) {
                mo46639y2();
            } else {
                C12704f fVar = this.f40631X;
                if (!(fVar == null || fVar.getActivity() == null)) {
                    this.f40631X.dismissAllowingStateLoss();
                    this.f40631X = null;
                }
            }
        }
        UserAccountManager.m39860h(this, this.f40630U, Arrays.asList(new String[]{"com.moovit.useraccount.user_disconnect_success", "com.moovit.useraccount.user_disconnect_failure"}));
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        C5367a.m13473a(this).mo21148d(this.f40630U);
        super.mo19427i2();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, true);
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo46639y2() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LOGOUT);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
        mo44545v2(aVar.mo49933a());
        C12704f fVar = this.f40631X;
        if (fVar == null || fVar.getDialog() == null) {
            setResult(-1);
            finish();
            return;
        }
        this.f40631X.mo39495T1();
    }
}
