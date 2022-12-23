package com.moovit.app.useraccount.providers.moovit;

import aa0.C7546q;
import android.animation.LayoutTransition;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import c70.C13756i;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.useraccount.manager.accesstoken.AccessTokenManager;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import ga0.C12704f;
import i00.C17522a;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p130j2.C5367a;
import p479ey.C16893e;
import p479ey.C16898i;
import p479ey.C16899j;
import p479ey.C16900k;
import p543hq.C17474b;
import p668my.C18477a;
import p668my.C18478b;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p975zx.C20919a;
import p977zz.C20964s0;

public class MoovitConnectProviderActivity extends MoovitAppActivity {

    /* renamed from: x0 */
    public static final /* synthetic */ int f40653x0 = 0;

    /* renamed from: U */
    public final C15639a f40654U = new C15639a();

    /* renamed from: X */
    public final C15640b f40655X = new C15640b();

    /* renamed from: Y */
    public final C15641c f40656Y = new C15641c();

    /* renamed from: Z */
    public final C15642d f40657Z = new C15642d();

    /* renamed from: l0 */
    public final C15643e f40658l0 = new C15643e();

    /* renamed from: m0 */
    public final C15644f f40659m0 = new C15644f();

    /* renamed from: n0 */
    public C12704f f40660n0;

    /* renamed from: o0 */
    public AccessTokenManager f40661o0;

    /* renamed from: p0 */
    public Mode f40662p0;

    /* renamed from: q0 */
    public TextInputLayout f40663q0;

    /* renamed from: r0 */
    public TextInputLayout f40664r0;

    /* renamed from: s0 */
    public TextInputLayout f40665s0;

    /* renamed from: t0 */
    public TextView f40666t0;

    /* renamed from: u0 */
    public Button f40667u0;

    /* renamed from: v0 */
    public TextView f40668v0;

    /* renamed from: w0 */
    public SparseArray<TextInputLayout> f40669w0 = new SparseArray<>(3);

    public enum Mode implements Parcelable {
        SIGN_UP(R.string.user_account_signup, "email_signup_clicked", R.string.user_account_existing, "open_login_clicked", Collections.singleton(r9)),
        LOGIN(R.string.user_account_login, "email_login_clicked", R.string.user_account_password_forgot, "forgot_pass_clicked", new HashSet(Arrays.asList(new Integer[]{r4, r9}))),
        RESET(R.string.user_account_reset_title, "reset_pass_clicked", 0, (String) null, new HashSet(Arrays.asList(new Integer[]{r4, r11, r12})));
        
        public static final C19577c<Mode> CODER = null;
        public static final Parcelable.Creator<Mode> CREATOR = null;
        private static final Set<Integer> supportedViews = null;
        private String forwarderAnalyticsType;
        private int forwarderTextId;
        private Set<Integer> hiddenViewsIds;
        private String submitAnalyticsType;
        private int submitTextId;

        /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$Mode$a */
        public class C15638a implements Parcelable.Creator<Mode> {
            public final Object createFromParcel(Parcel parcel) {
                return (Mode) C19612n.m46981v(parcel, Mode.CODER);
            }

            public final Object[] newArray(int i) {
                return new Mode[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Integer valueOf;
            Mode mode;
            Integer valueOf2;
            Mode mode2;
            Integer valueOf3;
            Integer valueOf4;
            Mode mode3;
            supportedViews = new HashSet(Arrays.asList(new Integer[]{valueOf4, valueOf, valueOf2, Integer.valueOf(R.id.email_container), valueOf3}));
            CODER = new C19577c<>(Mode.class, mode, mode2, mode3);
            CREATOR = new C15638a();
        }

        private Mode(int i, String str, int i2, String str2, Set<Integer> set) {
            this.forwarderTextId = i2;
            this.forwarderAnalyticsType = str2;
            this.submitTextId = i;
            this.submitAnalyticsType = str;
            this.hiddenViewsIds = set;
        }

        public int describeContents() {
            return 0;
        }

        public String getForwarderAnalyticsType() {
            return this.forwarderAnalyticsType;
        }

        public int getForwarderTextId() {
            return this.forwarderTextId;
        }

        public Set<Integer> getHiddenViewsIds() {
            return this.hiddenViewsIds;
        }

        public String getSubmitAnalyticsType() {
            return this.submitAnalyticsType;
        }

        public int getSubmitTextId() {
            return this.submitTextId;
        }

        public final Set<Integer> getVisibleViewsIds() {
            Set<Integer> set;
            Set<Integer> set2 = supportedViews;
            Set<Integer> set3 = this.hiddenViewsIds;
            if (set2.size() > set3.size()) {
                set = set2;
            } else {
                set = set3;
            }
            if (set.equals(set2)) {
                set2 = set3;
            }
            HashSet hashSet = new HashSet(set);
            hashSet.removeAll(set2);
            return hashSet;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$a */
    public class C15639a implements View.OnFocusChangeListener {
        public C15639a() {
        }

        public final void onFocusChange(View view, boolean z) {
            TextInputLayout textInputLayout = MoovitConnectProviderActivity.this.f40669w0.get(view.getId());
            if (textInputLayout != null) {
                String str = "";
                if (z) {
                    C7546q.m17288b(textInputLayout, str);
                    return;
                }
                int id = textInputLayout.getId();
                if (id == R.id.name_container) {
                    TextInputLayout textInputLayout2 = MoovitConnectProviderActivity.this.f40663q0;
                    boolean z2 = true;
                    if (textInputLayout2.getVisibility() != 8 && !(!C20964s0.m49090h(C7546q.m17287a(textInputLayout2).trim()))) {
                        z2 = false;
                    }
                    if (!z2) {
                        str = textInputLayout2.getContext().getString(R.string.invalid_name_error);
                    }
                    C7546q.m17288b(textInputLayout2, str);
                } else if (id == R.id.email_container) {
                    MoovitConnectProviderActivity.this.mo46654D2();
                } else if (id == R.id.password_container) {
                    MoovitConnectProviderActivity.this.mo46655E2();
                }
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$b */
    public class C15640b extends C17522a {
        public C15640b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r8) {
            /*
                r7 = this;
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r8 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r8 = r8.f40663q0
                int r0 = r8.getVisibility()
                r1 = 8
                r2 = 0
                r3 = 1
                if (r0 == r1) goto L_0x0020
                java.lang.String r8 = aa0.C7546q.m17287a(r8)
                java.lang.String r8 = r8.trim()
                boolean r8 = p977zz.C20964s0.m49090h(r8)
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x001e
                goto L_0x0020
            L_0x001e:
                r8 = 0
                goto L_0x0021
            L_0x0020:
                r8 = 1
            L_0x0021:
                java.lang.String r0 = ""
                if (r8 == 0) goto L_0x002c
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r4 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r4 = r4.f40663q0
                r4.setError(r0)
            L_0x002c:
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r4 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r4 = r4.f40664r0
                int r5 = r4.getVisibility()
                if (r5 == r1) goto L_0x0043
                java.lang.String r4 = aa0.C7546q.m17287a(r4)
                boolean r4 = p977zz.C20964s0.m49093k(r4)
                if (r4 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r4 = 0
                goto L_0x0044
            L_0x0043:
                r4 = 1
            L_0x0044:
                if (r4 == 0) goto L_0x004d
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r5 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r5 = r5.f40664r0
                r5.setError(r0)
            L_0x004d:
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r5 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r5 = r5.f40665s0
                int r6 = r5.getVisibility()
                if (r6 == r1) goto L_0x0070
                java.lang.String r1 = aa0.C7546q.m17287a(r5)
                boolean r5 = p977zz.C20964s0.m49090h(r1)
                if (r5 != 0) goto L_0x006a
                int r1 = r1.length()
                r5 = 6
                if (r1 < r5) goto L_0x006a
                r1 = 1
                goto L_0x006b
            L_0x006a:
                r1 = 0
            L_0x006b:
                if (r1 == 0) goto L_0x006e
                goto L_0x0070
            L_0x006e:
                r1 = 0
                goto L_0x0071
            L_0x0070:
                r1 = 1
            L_0x0071:
                if (r1 == 0) goto L_0x007a
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r5 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                com.google.android.material.textfield.TextInputLayout r5 = r5.f40665s0
                r5.setError(r0)
            L_0x007a:
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity r0 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.this
                android.widget.Button r0 = r0.f40667u0
                if (r8 == 0) goto L_0x0085
                if (r4 == 0) goto L_0x0085
                if (r1 == 0) goto L_0x0085
                r2 = 1
            L_0x0085:
                r0.setEnabled(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.C15640b.afterTextChanged(android.text.Editable):void");
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$c */
    public class C15641c implements TextView.OnEditorActionListener {
        public C15641c() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (MoovitConnectProviderActivity.this.f40665s0.getVisibility() != 8) {
                MoovitConnectProviderActivity.this.f40665s0.requestFocus();
                return false;
            } else if (!MoovitConnectProviderActivity.this.mo46654D2()) {
                return true;
            } else {
                MoovitConnectProviderActivity.m39937y2(MoovitConnectProviderActivity.this);
                return false;
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$d */
    public class C15642d implements TextView.OnEditorActionListener {
        public C15642d() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            MoovitConnectProviderActivity moovitConnectProviderActivity = MoovitConnectProviderActivity.this;
            int i2 = MoovitConnectProviderActivity.f40653x0;
            if (!moovitConnectProviderActivity.mo46655E2()) {
                return true;
            }
            MoovitConnectProviderActivity.m39937y2(MoovitConnectProviderActivity.this);
            return false;
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$e */
    public class C15643e extends BroadcastReceiver {
        public C15643e() {
        }

        public final void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("com.moovit.useraccount.manager.accesstoken.get_access_token_success")) {
                MoovitConnectProviderActivity moovitConnectProviderActivity = MoovitConnectProviderActivity.this;
                String stringExtra = intent.getStringExtra("additional_data");
                int i = MoovitConnectProviderActivity.f40653x0;
                moovitConnectProviderActivity.mo46651A2(stringExtra, false);
            }
            if (action.equals("com.moovit.useraccount.manager.accesstoken.create_access_token_success")) {
                MoovitConnectProviderActivity moovitConnectProviderActivity2 = MoovitConnectProviderActivity.this;
                String stringExtra2 = intent.getStringExtra("additional_data");
                int i2 = MoovitConnectProviderActivity.f40653x0;
                moovitConnectProviderActivity2.mo46651A2(stringExtra2, true);
            }
            if (action.equals("com.moovit.useraccount.manager.accesstoken.get_access_token_failure") || action.equals("com.moovit.useraccount.manager.accesstoken.create_access_token_failure")) {
                MoovitConnectProviderActivity moovitConnectProviderActivity3 = MoovitConnectProviderActivity.this;
                String stringExtra3 = intent.getStringExtra("additional_data");
                int i3 = MoovitConnectProviderActivity.f40653x0;
                moovitConnectProviderActivity3.mo46656z2();
                UiUtils.m40252k(moovitConnectProviderActivity3.f40664r0);
                if (C20964s0.m49090h(stringExtra3)) {
                    Toast.makeText(moovitConnectProviderActivity3, moovitConnectProviderActivity3.getString(R.string.response_read_error_message), 1).show();
                } else {
                    moovitConnectProviderActivity3.f40666t0.setText(stringExtra3);
                }
                moovitConnectProviderActivity3.f40667u0.setEnabled(false);
            }
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$f */
    public class C15644f extends C20438i<C16898i, C16899j> {
        /* renamed from: k */
        public final /* bridge */ /* synthetic */ void mo21408k(C20431c cVar, C20436g gVar) {
            C16898i iVar = (C16898i) cVar;
            C16899j jVar = (C16899j) gVar;
        }

        /* renamed from: w */
        public final /* bridge */ /* synthetic */ boolean mo21415w(C20431c cVar, Exception exc) {
            C16898i iVar = (C16898i) cVar;
            return true;
        }
    }

    /* renamed from: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$g */
    public static /* synthetic */ class C15645g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40675a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$Mode[] r0 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40675a = r0
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$Mode r1 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.Mode.LOGIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40675a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$Mode r1 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.Mode.SIGN_UP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40675a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity$Mode r1 = com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.Mode.RESET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.C15645g.<clinit>():void");
        }
    }

    /* renamed from: y2 */
    public static void m39937y2(MoovitConnectProviderActivity moovitConnectProviderActivity) {
        boolean z;
        boolean z2;
        String str;
        if (!moovitConnectProviderActivity.f40662p0.equals(Mode.SIGN_UP)) {
            z = true;
        } else {
            TextInputLayout textInputLayout = moovitConnectProviderActivity.f40663q0;
            if (textInputLayout.getVisibility() == 8 || (!C20964s0.m49090h(C7546q.m17287a(textInputLayout).trim()))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str = "";
            } else {
                str = textInputLayout.getContext().getString(R.string.invalid_name_error);
            }
            C7546q.m17288b(textInputLayout, str);
            if (!z2 || !moovitConnectProviderActivity.mo46654D2() || !moovitConnectProviderActivity.mo46655E2()) {
                z = false;
            } else {
                z = true;
            }
            moovitConnectProviderActivity.f40667u0.setEnabled(z);
        }
        if (z) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, moovitConnectProviderActivity.f40662p0.getSubmitAnalyticsType());
            moovitConnectProviderActivity.mo44545v2(aVar.mo49933a());
            int i = C15645g.f40675a[moovitConnectProviderActivity.f40662p0.ordinal()];
            if (i == 1) {
                if (moovitConnectProviderActivity.f40660n0 == null) {
                    C12704f S1 = C12704f.m32465S1(0, false);
                    moovitConnectProviderActivity.f40660n0 = S1;
                    S1.show(moovitConnectProviderActivity.getSupportFragmentManager(), C12704f.f31376m);
                }
                AccessTokenManager accessTokenManager = moovitConnectProviderActivity.f40661o0;
                String a = C7546q.m17287a(moovitConnectProviderActivity.f40664r0);
                String a2 = C7546q.m17287a(moovitConnectProviderActivity.f40665s0);
                accessTokenManager.getClass();
                accessTokenManager.f40582c.put(AccessTokenManager.Procedure.GET_ACCESS_TOKEN.ordinal(), true);
                C13756i a3 = C13756i.m34349a(accessTokenManager.f40580a);
                C16900k kVar = new C16900k(a3.mo40679b(), a, a2);
                RequestOptions c = a3.mo40680c();
                c.f42909f = true;
                a3.mo40684g("userGetAccessTokenRequest", kVar, c, accessTokenManager.f40583d);
            } else if (i == 2) {
                if (moovitConnectProviderActivity.f40660n0 == null) {
                    C12704f S12 = C12704f.m32465S1(0, false);
                    moovitConnectProviderActivity.f40660n0 = S12;
                    S12.show(moovitConnectProviderActivity.getSupportFragmentManager(), C12704f.f31376m);
                }
                AccessTokenManager accessTokenManager2 = moovitConnectProviderActivity.f40661o0;
                String a4 = C7546q.m17287a(moovitConnectProviderActivity.f40663q0);
                String a5 = C7546q.m17287a(moovitConnectProviderActivity.f40664r0);
                String a6 = C7546q.m17287a(moovitConnectProviderActivity.f40665s0);
                accessTokenManager2.getClass();
                accessTokenManager2.f40582c.put(AccessTokenManager.Procedure.CREATE_ACCESS_TOKEN.ordinal(), true);
                C13756i a7 = C13756i.m34349a(accessTokenManager2.f40580a);
                C16893e eVar = new C16893e(a7.mo40679b(), a4, a5, a6);
                RequestOptions c2 = a7.mo40680c();
                c2.f42909f = true;
                a7.mo40684g("userCreateAccessTokenRequest", eVar, c2, accessTokenManager2.f40584e);
            } else if (i == 3) {
                C16898i iVar = new C16898i(moovitConnectProviderActivity.mo44548x1(), C7546q.m17287a(moovitConnectProviderActivity.f40664r0));
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                moovitConnectProviderActivity.mo44527k2("resetPasswordRequest", iVar, requestOptions, moovitConnectProviderActivity.f40659m0);
                moovitConnectProviderActivity.mo44530n2(new AlertDialogFragment.C15856a((Context) moovitConnectProviderActivity).mo47683l(R.string.user_account_reset_confirm_title).mo47678g(R.string.user_account_reset_confirm_description).mo47681j(R.string.ok).mo47682k("reset_password_confirmation_tag").mo47673b());
            }
        }
    }

    /* renamed from: A2 */
    public final void mo46651A2(String str, boolean z) {
        mo46656z2();
        Intent intent = new Intent();
        intent.putExtra("extra_access_token", str);
        intent.putExtra("is_new_access_token", z);
        setResult(-1, intent);
        finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: B2 */
    public final void mo46652B2() {
        boolean z;
        String str;
        long j;
        LayoutTransition layoutTransition = ((ViewGroup) findViewById(R.id.container)).getLayoutTransition();
        boolean z2 = true;
        if (layoutTransition != null) {
            if (this.f40662p0.equals(Mode.RESET)) {
                j = 300;
            } else {
                j = 100;
            }
            layoutTransition.setStartDelay(2, j);
            layoutTransition.setStartDelay(1, 100);
        }
        for (Integer intValue : this.f40662p0.getHiddenViewsIds()) {
            findViewById(intValue.intValue()).setVisibility(8);
        }
        for (Integer intValue2 : this.f40662p0.getVisibleViewsIds()) {
            findViewById(intValue2.intValue()).setVisibility(0);
        }
        int forwarderTextId = this.f40662p0.getForwarderTextId();
        if (forwarderTextId != 0) {
            this.f40668v0.setText(getString(forwarderTextId));
        }
        ActionBar supportActionBar = getSupportActionBar();
        String string = getString(this.f40662p0.getSubmitTextId());
        if (supportActionBar != null) {
            supportActionBar.mo801w(string);
        }
        int submitTextId = this.f40662p0.getSubmitTextId();
        if (submitTextId != 0) {
            this.f40667u0.setText(getString(submitTextId));
            TextInputLayout textInputLayout = this.f40663q0;
            if (textInputLayout.getVisibility() == 8 || (!C20964s0.m49090h(C7546q.m17287a(textInputLayout).trim()))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = "";
            } else {
                str = textInputLayout.getContext().getString(R.string.invalid_name_error);
            }
            C7546q.m17288b(textInputLayout, str);
            if (!z || !mo46654D2() || !mo46655E2()) {
                z2 = false;
            }
            this.f40667u0.setEnabled(z2);
        }
        C7546q.m17288b(this.f40663q0, "");
        C7546q.m17288b(this.f40664r0, "");
        C7546q.m17288b(this.f40665s0, "");
        this.f40666t0.setText("");
    }

    /* renamed from: C2 */
    public final void mo46653C2(Mode mode) {
        if (!this.f40662p0.equals(mode)) {
            this.f40662p0 = mode;
            mo46652B2();
        }
    }

    /* renamed from: D2 */
    public final boolean mo46654D2() {
        boolean z;
        String str;
        TextInputLayout textInputLayout = this.f40664r0;
        if (textInputLayout.getVisibility() == 8 || C20964s0.m49093k(C7546q.m17287a(textInputLayout))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = textInputLayout.getContext().getString(R.string.invalid_email_error);
        }
        C7546q.m17288b(textInputLayout, str);
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r1 != false) goto L_0x0022;
     */
    /* renamed from: E2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46655E2() {
        /*
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.f40665s0
            int r1 = r0.getVisibility()
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0022
            java.lang.String r1 = aa0.C7546q.m17287a(r0)
            boolean r2 = p977zz.C20964s0.m49090h(r1)
            if (r2 != 0) goto L_0x001f
            int r1 = r1.length()
            r2 = 6
            if (r1 < r2) goto L_0x001f
            r1 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r3 = 1
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            java.lang.String r1 = ""
            goto L_0x0033
        L_0x0028:
            android.content.Context r1 = r0.getContext()
            r2 = 2131889537(0x7f120d81, float:1.941374E38)
            java.lang.String r1 = r1.getString(r2)
        L_0x0033:
            aa0.C7546q.m17288b(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity.mo46655E2():boolean");
    }

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        Mode mode = this.f40662p0;
        Mode mode2 = Mode.LOGIN;
        if (mode.equals(mode2)) {
            mo46653C2(Mode.SIGN_UP);
            return true;
        } else if (!this.f40662p0.equals(Mode.RESET)) {
            return this instanceof AdjustAdsPreferencesActivity;
        } else {
            mo46653C2(mode2);
            return true;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.moovit_connect_activity);
        this.f40661o0 = (AccessTokenManager) getSystemService("access_token_manager_service");
        this.f40662p0 = (Mode) getIntent().getParcelableExtra("extra_action");
        if (bundle != null) {
            this.f40662p0 = (Mode) bundle.getParcelable("currentMode");
        }
        this.f40660n0 = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.name_container);
        this.f40663q0 = textInputLayout;
        textInputLayout.getEditText().setOnFocusChangeListener(this.f40654U);
        this.f40663q0.getEditText().addTextChangedListener(this.f40655X);
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(R.id.email_container);
        this.f40664r0 = textInputLayout2;
        textInputLayout2.getEditText().setOnFocusChangeListener(this.f40654U);
        this.f40664r0.getEditText().setOnEditorActionListener(this.f40656Y);
        this.f40664r0.getEditText().addTextChangedListener(this.f40655X);
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(R.id.password_container);
        this.f40665s0 = textInputLayout3;
        textInputLayout3.getEditText().setOnFocusChangeListener(this.f40654U);
        this.f40665s0.getEditText().setOnEditorActionListener(this.f40657Z);
        this.f40665s0.getEditText().addTextChangedListener(this.f40655X);
        Button button = (Button) findViewById(R.id.submit_button);
        this.f40667u0 = button;
        button.setOnClickListener(new C18478b(this));
        this.f40666t0 = (TextView) findViewById(R.id.submit_error);
        TextView textView = (TextView) findViewById(R.id.forwarder);
        this.f40668v0 = textView;
        textView.setOnClickListener(new C18477a(this));
        this.f40669w0.put(R.id.name, this.f40663q0);
        this.f40669w0.put(R.id.email, this.f40664r0);
        this.f40669w0.put(R.id.password, this.f40665s0);
        mo46652B2();
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("currentMode", this.f40662p0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        boolean z;
        super.mo19426h2();
        AccessTokenManager accessTokenManager = this.f40661o0;
        EnumSet<E> allOf = EnumSet.allOf(AccessTokenManager.Procedure.class);
        accessTokenManager.getClass();
        Iterator<E> it = allOf.iterator();
        while (true) {
            if (it.hasNext()) {
                if (accessTokenManager.f40582c.get(((AccessTokenManager.Procedure) it.next()).ordinal())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            if (!C20964s0.m49090h(C20919a.f52665b.mo19759a(this.f40661o0.f40581b.f52668a))) {
                mo46651A2(C20919a.f52665b.mo19759a(this.f40661o0.f40581b.f52668a), C20919a.f52666c.mo19759a(this.f40661o0.f40581b.f52668a).booleanValue());
            } else {
                mo46656z2();
            }
        }
        C15643e eVar = this.f40658l0;
        List<String> asList = Arrays.asList(new String[]{"com.moovit.useraccount.manager.accesstoken.create_access_token_success", "com.moovit.useraccount.manager.accesstoken.create_access_token_failure", "com.moovit.useraccount.manager.accesstoken.get_access_token_success", "com.moovit.useraccount.manager.accesstoken.get_access_token_failure"});
        C5367a a = C5367a.m13473a(this);
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : asList) {
            intentFilter.addAction(addAction);
        }
        a.mo21146b(eVar, intentFilter);
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C5367a.m13473a(this).mo21148d(this.f40658l0);
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("reset_password_confirmation_tag".equals(str)) {
            if (i == -1) {
                mo46653C2(Mode.LOGIN);
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: z2 */
    public final void mo46656z2() {
        C12704f fVar = this.f40660n0;
        if (fVar != null && fVar.getActivity() != null) {
            this.f40660n0.dismissAllowingStateLoss();
            this.f40660n0 = null;
        }
    }
}
