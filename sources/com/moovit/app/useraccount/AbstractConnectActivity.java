package com.moovit.app.useraccount;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import c70.C13756i;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.design.view.list.ListItemView;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import ga0.C12704f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import p130j2.C5367a;
import p377ay.C13547a;
import p377ay.C13550c;
import p435de.C16596f;
import p479ey.C16902m;
import p543hq.C17474b;
import p621ky.C18157a;
import p975zx.C20919a;
import p977zz.C20964s0;

public abstract class AbstractConnectActivity extends MoovitAppActivity implements C18157a.C18158a, C12704f.C12706b {

    /* renamed from: Z */
    public static final /* synthetic */ int f40543Z = 0;

    /* renamed from: U */
    public C12704f f40544U;

    /* renamed from: X */
    public UserAccountManager f40545X;

    /* renamed from: Y */
    public final C15586a f40546Y = new C15586a();

    /* renamed from: com.moovit.app.useraccount.AbstractConnectActivity$a */
    public class C15586a extends BroadcastReceiver {
        public C15586a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null) {
                ConnectProvider connectProvider = (ConnectProvider) intent.getParcelableExtra("connect_provider");
                if (action.equals("com.moovit.useraccount.user_connect_success")) {
                    AbstractConnectActivity abstractConnectActivity = AbstractConnectActivity.this;
                    int i = AbstractConnectActivity.f40543Z;
                    abstractConnectActivity.mo46544B2(connectProvider);
                }
                if (action.equals("com.moovit.useraccount.user_connect_failure")) {
                    AbstractConnectActivity abstractConnectActivity2 = AbstractConnectActivity.this;
                    int i2 = AbstractConnectActivity.f40543Z;
                    C12704f fVar = abstractConnectActivity2.f40544U;
                    if (!(fVar == null || fVar.getActivity() == null)) {
                        abstractConnectActivity2.f40544U.dismissAllowingStateLoss();
                        abstractConnectActivity2.f40544U = null;
                    }
                    abstractConnectActivity2.mo46545C2(false, connectProvider);
                    Toast.makeText(abstractConnectActivity2, abstractConnectActivity2.getString(R.string.response_read_error_message), 1).show();
                }
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.AbstractConnectActivity$b */
    public static /* synthetic */ class C15587b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40548a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.useraccount.providers.ConnectProvider[] r0 = com.moovit.app.useraccount.providers.ConnectProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40548a = r0
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.FACEBOOK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40548a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.GOOGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40548a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.MOOVIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.AbstractConnectActivity.C15587b.<clinit>():void");
        }
    }

    /* renamed from: y2 */
    public static String m39824y2(ConnectProvider connectProvider) {
        int i = C15587b.f40548a[connectProvider.ordinal()];
        if (i == 1) {
            return "fb_login_clicked";
        }
        if (i == 2) {
            return "google_login_clicked";
        }
        if (i == 3) {
            return "email_login_clicked";
        }
        throw new IllegalArgumentException("Have you forgot to map: " + connectProvider + " to its initiator?");
    }

    /* renamed from: A2 */
    public abstract void mo46543A2(ListItemView listItemView);

    /* renamed from: B2 */
    public final void mo46544B2(ConnectProvider connectProvider) {
        mo46545C2(true, connectProvider);
        C12704f fVar = this.f40544U;
        if (fVar == null || fVar.getDialog() == null) {
            setResult(-1);
            finish();
            return;
        }
        this.f40544U.mo39495T1();
    }

    /* renamed from: C2 */
    public final void mo46545C2(boolean z, ConnectProvider connectProvider) {
        String str;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LOGIN);
        aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        int i = C15587b.f40548a[connectProvider.ordinal()];
        if (i == 1 || i == 2) {
            str = m39824y2(connectProvider);
        } else if (i == 3) {
            if (C20919a.f52666c.mo19759a(((AccessTokenManager) getSystemService("access_token_manager_service")).f40581b.f52668a).booleanValue()) {
                str = "email_signup_clicked";
            } else {
                str = "email_login_clicked";
            }
        } else {
            throw new IllegalArgumentException("Have you forgot to map: " + connectProvider + " ?");
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: K */
    public final void mo39497K() {
        setResult(-1);
        finish();
        this.f40544U = null;
    }

    /* renamed from: U0 */
    public final void mo46546U0(ConnectProvider connectProvider, String str, String str2) {
        if (this.f40544U == null) {
            C12704f S1 = C12704f.m32465S1(R.string.user_account_connected, false);
            this.f40544U = S1;
            S1.show(getSupportFragmentManager(), C12704f.f31376m);
        }
        UserAccountManager userAccountManager = this.f40545X;
        userAccountManager.getClass();
        userAccountManager.f40568c.put(UserAccountManager.Procedure.CONNECT.ordinal(), true);
        C13756i a = C13756i.m34349a(userAccountManager.f40566a);
        C16902m mVar = new C16902m(a.mo40679b(), str, str2, connectProvider);
        RequestOptions c = a.mo40680c();
        c.f42909f = true;
        a.mo40684g("userLoginRequest", mVar, c, userAccountManager.f40570e);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.connect_and_sync_layout);
        this.f40545X = (UserAccountManager) mo44537r1("USER_ACCOUNT");
        mo46543A2((ListItemView) findViewById(R.id.title));
        mo46549z2((TextView) findViewById(R.id.message));
        this.f40544U = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
    }

    /* renamed from: g0 */
    public final void mo46547g0(ConnectProvider connectProvider, int i, String str) {
        Toast.makeText(this, getString(R.string.response_read_error_message), 1).show();
        mo46545C2(false, connectProvider);
        C16596f a = C16596f.m42113a();
        Object[] objArr = {connectProvider, Integer.valueOf(i), str};
        String str2 = C20964s0.f52718a;
        a.mo49364c(new ApplicationBugException(String.format((Locale) null, "Failed to connect to provider, provider: %s errId: %d errDesc: %s", objArr)));
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        C13547a aVar;
        boolean z;
        super.mo19426h2();
        if (!this.f40545X.f40568c.get(UserAccountManager.Procedure.CONNECT.ordinal())) {
            C13550c cVar = this.f40545X.f40567b;
            synchronized (cVar) {
                aVar = cVar.f33494b;
            }
            if (aVar.f33490a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo46544B2(aVar.f33491b);
            } else {
                C12704f fVar = this.f40544U;
                if (!(fVar == null || fVar.getActivity() == null)) {
                    this.f40544U.dismissAllowingStateLoss();
                    this.f40544U = null;
                }
            }
        }
        UserAccountManager.m39860h(this, this.f40546Y, Arrays.asList(new String[]{"com.moovit.useraccount.user_connect_success", "com.moovit.useraccount.user_connect_failure"}));
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C5367a.m13473a(this).mo21148d(this.f40546Y);
    }

    /* renamed from: n */
    public final void mo46548n(ConnectProvider connectProvider) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, m39824y2(connectProvider));
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: z2 */
    public abstract void mo46549z2(TextView textView);
}
