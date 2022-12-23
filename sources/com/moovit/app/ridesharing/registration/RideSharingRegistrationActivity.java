package com.moovit.app.ridesharing.registration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.appboy.Constants;
import com.appboy.support.StringUtils;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.R;
import f00.C16919g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p130j2.C5367a;
import p435de.C16596f;
import p527gy.C17259d;
import p527gy.C17261e;
import p543hq.C17474b;
import p737pv.C19031u;
import p737pv.C19032v;
import p782rv.C19332a;
import p782rv.C19333b;
import p782rv.C19337d;
import p782rv.C19342g;
import p782rv.C19351j;
import p782rv.C19356m;
import p782rv.C19363n;
import p782rv.C19366q;
import p785ry.C19385e;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20964s0;

public class RideSharingRegistrationActivity extends MoovitAppActivity {

    /* renamed from: m0 */
    public static final C16919g.C16928i f39377m0 = new C16919g.C16928i("user_referrer", (String) null);

    /* renamed from: U */
    public final C15258a f39378U = new C15258a();

    /* renamed from: X */
    public final C15259b f39379X = new C15259b();

    /* renamed from: Y */
    public RideSharingRegistrationInfo f39380Y = new RideSharingRegistrationInfo();

    /* renamed from: Z */
    public final ArrayList f39381Z = new ArrayList();

    /* renamed from: l0 */
    public C17474b.C17475a f39382l0 = null;

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity$a */
    public class C15258a extends BroadcastReceiver {
        public C15258a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                RideSharingRegistrationActivity.this.mo45777B2();
            }
        }
    }

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity$b */
    public class C15259b extends C20438i<C19031u, C19032v> {
        public C15259b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19031u uVar = (C19031u) cVar;
            RideSharingRegistrationActivity rideSharingRegistrationActivity = RideSharingRegistrationActivity.this;
            rideSharingRegistrationActivity.f39380Y.f39387c = ((C19032v) gVar).f48401m;
            rideSharingRegistrationActivity.mo45781y2();
            rideSharingRegistrationActivity.mo45776A2();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19031u uVar = (C19031u) cVar;
            RideSharingRegistrationActivity rideSharingRegistrationActivity = RideSharingRegistrationActivity.this;
            C16919g.C16928i iVar = RideSharingRegistrationActivity.f39377m0;
            rideSharingRegistrationActivity.getClass();
            AlertDialogFragment.C15856a l = new AlertDialogFragment.C15856a((Context) rideSharingRegistrationActivity).mo47683l(R.string.ride_sharing_registration_general_error);
            l.mo47674c(true);
            rideSharingRegistrationActivity.mo44530n2(l.mo47682k("MissingStepsErrorAlertTag").mo47681j(R.string.retry_connect).mo47680i(R.string.cancel).mo47673b());
            return true;
        }
    }

    /* renamed from: com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity$c */
    public static /* synthetic */ class C15260c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.app.ridesharing.registration.RideSharingRegistrationType[] r0 = com.moovit.app.ridesharing.registration.RideSharingRegistrationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39385a = r0
                com.moovit.app.ridesharing.registration.RideSharingRegistrationType r1 = com.moovit.app.ridesharing.registration.RideSharingRegistrationType.CONNECT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39385a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.ridesharing.registration.RideSharingRegistrationType r1 = com.moovit.app.ridesharing.registration.RideSharingRegistrationType.PURCHASE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity.C15260c.<clinit>():void");
        }
    }

    /* renamed from: z2 */
    public static Intent m39024z2(Context context, RideSharingRegistrationType rideSharingRegistrationType, RideSharingRegistrationSteps rideSharingRegistrationSteps, String str) {
        Intent intent = new Intent(context, RideSharingRegistrationActivity.class);
        intent.putExtra("registration_type", rideSharingRegistrationType);
        intent.putExtra("required_steps", rideSharingRegistrationSteps);
        intent.putExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45776A2() {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.f39381Z
            boolean r0 = r0.isEmpty()
            r1 = 2131362998(0x7f0a04b6, float:1.8345792E38)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            androidx.fragment.app.Fragment r0 = r6.mo44529n1(r1)
            rv.a r0 = (p782rv.C19332a) r0
            if (r0 != 0) goto L_0x0021
            java.util.ArrayList r0 = r6.f39381Z
            r5 = 0
            java.lang.Object r0 = r0.get(r5)
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x003f
        L_0x0021:
            java.util.ArrayList r5 = r6.f39381Z
            java.lang.Class r0 = r0.getClass()
            int r0 = r5.indexOf(r0)
            java.util.ArrayList r5 = r6.f39381Z
            int r5 = r5.size()
            int r5 = r5 + r4
            if (r0 != r5) goto L_0x0036
        L_0x0034:
            r0 = r3
            goto L_0x003f
        L_0x0036:
            java.util.ArrayList r5 = r6.f39381Z
            int r0 = r0 + r2
            java.lang.Object r0 = r5.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x003f:
            if (r0 != 0) goto L_0x005e
            com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo r0 = r6.f39380Y
            com.moovit.app.ridesharing.registration.RideSharingRegistrationType r1 = r0.f39386b
            com.moovit.app.ridesharing.registration.RideSharingRegistrationType r3 = com.moovit.app.ridesharing.registration.RideSharingRegistrationType.CONNECT
            if (r1 != r3) goto L_0x0054
            com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo r0 = r0.f39394j
            if (r0 == 0) goto L_0x0054
            android.content.Intent r0 = com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenActivity.m39967y2(r6, r0)
            r6.startActivity(r0)
        L_0x0054:
            r6.mo45780E2(r2)
            r6.setResult(r4)
            r6.finish()
            return
        L_0x005e:
            java.lang.String r0 = r0.getName()
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.instantiate(r6, r0)
            rv.a r0 = (p782rv.C19332a) r0
            androidx.fragment.app.FragmentManager r4 = r6.getSupportFragmentManager()
            r4.getClass()
            androidx.fragment.app.a r5 = new androidx.fragment.app.a
            r5.<init>(r4)
            r5.mo4111f(r1, r0, r3)
            r5.mo4046l()
            boolean r1 = r6.f37311x
            if (r1 == 0) goto L_0x0081
            r6.mo45780E2(r2)
        L_0x0081:
            hq.b$a r1 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r0 = r0.mo51743n2()
            r1.<init>(r0)
            r6.f39382l0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity.mo45776A2():void");
    }

    /* renamed from: B2 */
    public final void mo45777B2() {
        C17259d e = ((C17261e) getSystemService("user_profile_manager_service")).mo49805e();
        RideSharingRegistrationInfo rideSharingRegistrationInfo = this.f39380Y;
        rideSharingRegistrationInfo.f39397m = e.f44606e;
        rideSharingRegistrationInfo.f39395k = e.f44602a;
        rideSharingRegistrationInfo.f39396l = e.f44603b;
        C19332a aVar = (C19332a) mo44529n1(R.id.fragment_container);
        if (aVar != null) {
            aVar.mo51746q2();
        }
    }

    /* renamed from: C2 */
    public final void mo45778C2() {
        RideSharingRegistrationType rideSharingRegistrationType;
        Intent intent = getIntent();
        if (intent != null) {
            if (!"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
                this.f39380Y.f39386b = (RideSharingRegistrationType) intent.getParcelableExtra("registration_type");
                this.f39380Y.f39387c = (RideSharingRegistrationSteps) intent.getParcelableExtra("required_steps");
                this.f39380Y.f39388d = intent.getStringExtra(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
                return;
            }
            Uri data = intent.getData();
            C16596f.m42113a().mo49363b(data.toString());
            RideSharingRegistrationInfo rideSharingRegistrationInfo = this.f39380Y;
            String queryParameter = data.getQueryParameter("type");
            if (C20964s0.m49090h(queryParameter)) {
                rideSharingRegistrationType = RideSharingRegistrationType.CONNECT;
            } else {
                char c = 65535;
                int hashCode = queryParameter.hashCode();
                if (hashCode != 99) {
                    if (hashCode != 112) {
                        if (hashCode != 3670) {
                            if (hashCode == 3682 && queryParameter.equals("su")) {
                                c = 2;
                            }
                        } else if (queryParameter.equals("si")) {
                            c = 1;
                        }
                    } else if (queryParameter.equals(Constants.APPBOY_PUSH_PRIORITY_KEY)) {
                        c = 0;
                    }
                } else if (queryParameter.equals(com.appsflyer.share.Constants.URL_CAMPAIGN)) {
                    c = 3;
                }
                if (c != 0) {
                    rideSharingRegistrationType = RideSharingRegistrationType.CONNECT;
                } else {
                    rideSharingRegistrationType = RideSharingRegistrationType.PURCHASE;
                }
            }
            rideSharingRegistrationInfo.f39386b = rideSharingRegistrationType;
            RideSharingRegistrationInfo rideSharingRegistrationInfo2 = this.f39380Y;
            rideSharingRegistrationInfo2.f39387c = null;
            rideSharingRegistrationInfo2.f39388d = data.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        }
    }

    /* renamed from: D2 */
    public final void mo45779D2() {
        C19332a aVar = (C19332a) mo44529n1(R.id.fragment_container);
        if (aVar != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0909a aVar2 = new C0909a(supportFragmentManager);
            aVar2.mo4050p(aVar);
            aVar2.mo4043i();
        }
        C19031u uVar = new C19031u(mo44548x1());
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        mo44527k2("refresh_steps", uVar, requestOptions, this.f39379X);
    }

    /* renamed from: E1 */
    public final void mo44504E1(Bundle bundle, String str) {
        if ("MissingStepsErrorAlertTag".equals(str)) {
            finish();
        } else {
            super.mo44504E1(bundle, str);
        }
    }

    /* renamed from: E2 */
    public final void mo45780E2(boolean z) {
        C17474b.C17475a aVar = this.f39382l0;
        if (aVar != null) {
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            mo44545v2(this.f39382l0.mo49933a());
            this.f39382l0 = null;
        }
    }

    /* renamed from: c2 */
    public final void mo24880c2() {
        super.mo24880c2();
        if (isFinishing()) {
            Context applicationContext = getApplicationContext();
            EventsProvider eventsProvider = EventsProvider.f39286k;
            C5367a.m13473a(applicationContext).mo21147c(new Intent("com.moovit.events_provider.action.login"));
            C19385e.f49315c.f49316a.set((Object) null);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        RideSharingRegistrationInfo rideSharingRegistrationInfo;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.ride_sharing_registration_activity);
        Intent intent = getIntent();
        if (!(intent == null || intent.getData() == null)) {
            String queryParameter = intent.getData().getQueryParameter("ur");
            if (!C20964s0.m49090h(queryParameter)) {
                f39377m0.mo49545d(getSharedPreferences("ride_sharing_registration", 0), queryParameter);
            }
        }
        mo45778C2();
        if (!(bundle == null || (rideSharingRegistrationInfo = (RideSharingRegistrationInfo) bundle.getParcelable("info")) == null)) {
            this.f39380Y = rideSharingRegistrationInfo;
        }
        mo45777B2();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo800v(this.f39380Y.f39386b.titleResId);
        }
        if (this.f39380Y.f39387c != null) {
            mo45781y2();
            if (mo44529n1(R.id.fragment_container) == null) {
                mo45776A2();
                return;
            }
            return;
        }
        mo45779D2();
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("info", this.f39380Y);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        C17261e.m43266g(this, this.f39378U);
        C19332a aVar = (C19332a) mo44529n1(R.id.fragment_container);
        if (aVar != null) {
            if (this.f37311x) {
                mo45780E2(true);
            }
            this.f39382l0 = new C17474b.C17475a(aVar.mo51743n2());
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        mo45780E2(false);
        C17261e.m43267h(this, this.f39378U);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        mo45778C2();
        C17474b.C17475a m1 = super.mo19762m1();
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        int i = C15260c.f39385a[this.f39380Y.f39386b.ordinal()];
        if (i == 1) {
            str = "connect";
        } else if (i != 2) {
            str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        } else {
            str = ProductAction.ACTION_PURCHASE;
        }
        m1.mo49939g(analyticsAttributeKey, str);
        m1.mo49945m(AnalyticsAttributeKey.ORIGIN, this.f39380Y.f39388d);
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("RIDE_SHARING_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("MissingStepsErrorAlertTag".equals(str)) {
            if (i == -1) {
                mo45779D2();
            } else {
                finish();
            }
            return true;
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }

    /* renamed from: y2 */
    public final void mo45781y2() {
        RideSharingRegistrationSteps rideSharingRegistrationSteps = this.f39380Y.f39387c;
        if (rideSharingRegistrationSteps == null) {
            rideSharingRegistrationSteps = new RideSharingRegistrationSteps(false, false, false, false);
        }
        this.f39381Z.clear();
        int i = C15260c.f39385a[this.f39380Y.f39386b.ordinal()];
        if (i == 1) {
            if (rideSharingRegistrationSteps.f42977b) {
                this.f39381Z.add(C19342g.class);
                this.f39381Z.add(C19356m.class);
            }
            if (rideSharingRegistrationSteps.f42979d) {
                this.f39381Z.add(C19337d.class);
                this.f39381Z.add(C19366q.class);
            }
            if (this.f39380Y.f39394j == null) {
                this.f39381Z.add(C19363n.class);
                if (rideSharingRegistrationSteps.f42978c) {
                    this.f39381Z.add(C19351j.class);
                }
                if (rideSharingRegistrationSteps.f42980e) {
                    this.f39381Z.add(C19333b.class);
                }
            }
        } else if (i == 2) {
            if (rideSharingRegistrationSteps.f42977b) {
                this.f39381Z.add(C19342g.class);
                this.f39381Z.add(C19356m.class);
            }
            if (rideSharingRegistrationSteps.f42978c || rideSharingRegistrationSteps.f42979d) {
                this.f39381Z.add(C19351j.class);
            }
            if (rideSharingRegistrationSteps.f42980e) {
                this.f39381Z.add(C19333b.class);
            }
        }
    }
}
