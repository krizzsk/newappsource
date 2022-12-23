package com.moovit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0932h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b00.C13556a;
import c00.C13717b;
import c00.C13735p;
import c00.C13739s;
import c70.C13752e;
import c70.C13753f;
import c70.C13756i;
import c70.C13771l;
import c70.C13774o;
import com.appboy.models.InAppMessageBase;
import com.appsflyer.ServerParameters;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.common.GoogleApiAvailability;
import com.moovit.C14688a;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.car.operators.C15684a;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.AlertMessageView;
import com.moovit.design.view.ProgressView;
import com.moovit.env.EnvironmentProvider;
import com.moovit.location.C16202a;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.NavigationState;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;
import com.moovit.offline.GraphBuildException;
import com.moovit.offline.GraphBuildFailureActivity;
import com.moovit.request.MetroIdMismatchException;
import com.moovit.request.MetroRevisionMismatchException;
import com.moovit.request.RequestOptions;
import com.moovit.request.ServerBusyException;
import com.moovit.request.UserRequestError;
import com.moovit.tracing.TraceEvent;
import d40.C4360j;
import ea0.C12623b;
import g30.C4779k;
import g30.C4789q;
import ga0.C12702e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import p00.C18863a;
import p001a0.C0016g;
import p001a0.C0017h;
import p073e7.C4585c;
import p203p1.C6026b;
import p203p1.C6028c;
import p241s0.C6302b;
import p259t5.C6592b;
import p269u2.C6677a;
import p304x.C7071l0;
import p358af.C13437d;
import p435de.C16596f;
import p471eq.C16851b;
import p471eq.C16855d;
import p543hq.C17474b;
import p543hq.C17476c;
import p646lz.C18299a;
import p669mz.C18481b;
import p824tp.C19722a0;
import p824tp.C19723b;
import p824tp.C19725d;
import p824tp.C19728f;
import p824tp.C19729g;
import p824tp.C19730h;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p977zz.C20927a0;
import p977zz.C20934d0;
import p977zz.C20944i0;
import p977zz.C20977y0;
import t90.C13120a;
import t90.C13121b;

public abstract class MoovitActivity extends AppCompatActivity implements AlertDialogFragment.C15857b {

    /* renamed from: T */
    public static final String f37291T = C13771l.class.getName();

    /* renamed from: A */
    public boolean f37292A = false;

    /* renamed from: B */
    public C13756i f37293B;

    /* renamed from: C */
    public final C18481b f37294C = new C18481b();

    /* renamed from: D */
    public C20061g f37295D;

    /* renamed from: E */
    public final ArrayList f37296E = new ArrayList();

    /* renamed from: F */
    public C14688a f37297F;

    /* renamed from: G */
    public final C14680a f37298G = new C14680a();

    /* renamed from: H */
    public boolean f37299H = false;

    /* renamed from: I */
    public C13120a f37300I;

    /* renamed from: J */
    public C19725d f37301J;

    /* renamed from: K */
    public boolean f37302K = false;

    /* renamed from: L */
    public boolean f37303L = false;

    /* renamed from: M */
    public Bundle f37304M;

    /* renamed from: N */
    public Intent f37305N;

    /* renamed from: O */
    public AnalyticsFlowKey f37306O = null;

    /* renamed from: P */
    public final C13739s<C19723b> f37307P = new C13739s<>(new ConcurrentLinkedQueue());

    /* renamed from: Q */
    public C16855d f37308Q;

    /* renamed from: R */
    public long f37309R = -1;

    /* renamed from: S */
    public final C14681b f37310S = new C14681b(this);

    /* renamed from: x */
    public boolean f37311x = false;

    /* renamed from: y */
    public boolean f37312y = false;

    /* renamed from: z */
    public boolean f37313z = false;

    /* renamed from: com.moovit.MoovitActivity$a */
    public class C14680a implements C14688a.C14690b {
        public C14680a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            MoovitActivity moovitActivity = MoovitActivity.this;
            String str = MoovitActivity.f37291T;
            moovitActivity.mo44509L1("onAllAppDataPartsLoaded()");
            moovitActivity.mo44551z1().mo40025c(TraceEvent.MOOVIT_ACTIVITY_READY);
            moovitActivity.mo44545v2(new C17474b(AnalyticsEventKey.ON_ALL_DATA_PARTS_LOADED));
            moovitActivity.mo44520d2();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            MoovitActivity.this.mo19442O1(obj, str);
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
            MoovitActivity.this.mo19768N1(obj, str);
        }
    }

    /* renamed from: com.moovit.MoovitActivity$b */
    public class C14681b extends C4360j {
        public C14681b(Context context) {
            super(context);
        }

        /* renamed from: b */
        public final void mo19877b(NavigationService navigationService) {
            MoovitActivity moovitActivity = MoovitActivity.this;
            moovitActivity.getClass();
            for (NavigationState navigationState : navigationService.mo19690y()) {
                NavigationService.m11305D(moovitActivity, navigationState.f15079b.mo19639e0());
            }
        }

        /* renamed from: c */
        public final void mo19878c() {
            MoovitActivity.this.getClass();
        }

        /* renamed from: h */
        public final void mo19883h(Navigable navigable, NavigationStartEvent navigationStartEvent) {
            MoovitActivity.this.mo44517Z1();
        }

        /* renamed from: i */
        public final void mo19884i(Navigable navigable, NavigationStopEvent navigationStopEvent) {
            MoovitActivity.this.mo44518a2(this, navigable);
        }
    }

    /* renamed from: com.moovit.MoovitActivity$c */
    public class C14682c extends C13774o {
        public C14682c(Collection collection) {
            super(collection);
        }

        /* renamed from: a */
        public final void mo40704a(CollectionHashMap.ArrayListHashMap arrayListHashMap, C6302b bVar) {
            MoovitActivity.this.mo44513V1(arrayListHashMap, bVar);
        }
    }

    /* renamed from: com.moovit.MoovitActivity$d */
    public interface C14683d {
        /* renamed from: a */
        void mo44552a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* renamed from: m2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36860m2() {
        /*
            r4 = this;
            java.lang.String r0 = "setReady() -  isStarted="
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            boolean r1 = r4.f37313z
            r0.append(r1)
            java.lang.String r1 = ", isResumed="
            r0.append(r1)
            boolean r1 = r4.f37311x
            r0.append(r1)
            java.lang.String r1 = ", isPostResume="
            r0.append(r1)
            boolean r1 = r4.f37312y
            r0.append(r1)
            java.lang.String r1 = ", isDestroyed="
            r0.append(r1)
            boolean r1 = r4.f37292A
            r0.append(r1)
            java.lang.String r1 = ", lifecycleState="
            r0.append(r1)
            androidx.lifecycle.Lifecycle r1 = r4.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r1.mo4225b()
            r2 = 1
            if (r1 == 0) goto L_0x005f
            int[] r3 = p977zz.C20930c.C20931a.f52677a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L_0x005c
            r3 = 2
            if (r1 == r3) goto L_0x0059
            r3 = 3
            if (r1 == r3) goto L_0x0056
            r3 = 4
            if (r1 == r3) goto L_0x0053
            r3 = 5
            if (r1 == r3) goto L_0x0050
            goto L_0x005f
        L_0x0050:
            java.lang.String r1 = "RESUMED"
            goto L_0x0061
        L_0x0053:
            java.lang.String r1 = "STARTED"
            goto L_0x0061
        L_0x0056:
            java.lang.String r1 = "CREATED"
            goto L_0x0061
        L_0x0059:
            java.lang.String r1 = "INITIALIZED"
            goto L_0x0061
        L_0x005c:
            java.lang.String r1 = "DESTROYED"
            goto L_0x0061
        L_0x005f:
            java.lang.String r1 = "UNKNOWN"
        L_0x0061:
            r0.append(r1)
            java.lang.String r1 = ", newIntent="
            r0.append(r1)
            android.content.Intent r1 = r4.f37305N
            r3 = 0
            if (r1 == 0) goto L_0x0070
            r1 = 1
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            r0.append(r1)
            java.lang.String r1 = ", stateSaved="
            r0.append(r1)
            boolean r1 = r4.f37302K
            r0.append(r1)
            java.lang.String r1 = ", savedInstanceState="
            r0.append(r1)
            android.os.Bundle r1 = r4.f37304M
            if (r1 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.mo44509L1(r0)
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L_0x00a7
            de.f r0 = p435de.C16596f.m42113a()
            com.moovit.MoovitLifecycleException r1 = new com.moovit.MoovitLifecycleException
            r1.<init>()
            r0.mo49364c(r1)
            return
        L_0x00a7:
            boolean r0 = r4.f37302K
            if (r0 == 0) goto L_0x00ae
            r4.f37303L = r2
            return
        L_0x00ae:
            r4.f37299H = r2
            r4.f37303L = r3
            android.os.Bundle r0 = r4.f37304M
            r4.mo19425e2(r0)
            r4.supportInvalidateOptionsMenu()
            boolean r0 = r4.f37313z
            r1 = 0
            if (r0 == 0) goto L_0x00cb
            r4.mo19426h2()
            android.os.Bundle r0 = r4.f37304M
            if (r0 == 0) goto L_0x00c9
            super.onRestoreInstanceState(r0)
        L_0x00c9:
            r4.f37304M = r1
        L_0x00cb:
            android.content.Intent r0 = r4.f37305N
            if (r0 == 0) goto L_0x00d4
            r4.mo19424b2(r0)
            r4.f37305N = r1
        L_0x00d4:
            boolean r0 = r4.f37311x
            if (r0 == 0) goto L_0x00db
            r4.mo24881f2()
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.MoovitActivity.m36860m2():void");
    }

    /* renamed from: B1 */
    public void mo44503B1(MetroIdMismatchException metroIdMismatchException) {
        mo44544v1();
    }

    /* renamed from: E1 */
    public void mo44504E1(Bundle bundle, String str) {
        if ("LOCATION_PERMISSIONS_RATIONAL_FRAGMENT".equals(str)) {
            C16202a.get(this).onRequestPrePermissionResult(this, -2);
        }
    }

    /* renamed from: H1 */
    public final void mo44505H1(MetroRevisionMismatchException metroRevisionMismatchException) {
        C4789q.m12121c("mismatch", metroRevisionMismatchException.mo49154b(), metroRevisionMismatchException.mo49153a());
        if (this.f37313z) {
            mo44538s2(metroRevisionMismatchException);
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.METRO_UPDATE_DIALOG_SHOWN);
            aVar.mo49937e(AnalyticsAttributeKey.METRO_ID, metroRevisionMismatchException.mo49154b());
            aVar.mo49936d(AnalyticsAttributeKey.METRO_REVISION, metroRevisionMismatchException.mo49153a());
            mo44545v2(aVar.mo49933a());
        }
    }

    /* renamed from: I1 */
    public final void mo44506I1() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment A = supportFragmentManager.mo3923A("WAIT_DIALOG_FRAGMENT");
        if (A != null) {
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4050p(A);
            aVar.mo4043i();
        }
    }

    /* renamed from: J1 */
    public boolean mo44507J1() {
        return this.f37297F.f37345b.contains("METRO_CONTEXT");
    }

    /* renamed from: K1 */
    public final void mo44508K1() {
        Intent w1 = mo44546w1();
        Intent intent = new Intent(this, GooglePlayServicesUnavailableActivity.class);
        intent.putExtra("intent_to_launch_on_success", w1);
        startActivity(intent);
        finish();
    }

    /* renamed from: L1 */
    public final void mo44509L1(String str) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(mo44544v1() + ":" + str);
    }

    /* renamed from: M1 */
    public void mo44510M1() {
        SparseArray<String> sparseArray = EnvironmentProvider.f41473b;
    }

    /* renamed from: N1 */
    public void mo19768N1(Object obj, String str) {
        C13756i iVar;
        if ("USER_CONTEXT".equals(str) && (iVar = this.f37293B) != null) {
            iVar.mo40685h(new C13752e(this, (C19722a0) MoovitApplication.f37317k.mo44557i("USER_CONTEXT"), this.f37306O));
        }
    }

    /* renamed from: O1 */
    public void mo19442O1(Object obj, String str) {
        mo44544v1();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ON_DATA_PART_LOADING_FAILURE);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        aVar.mo49939g(AnalyticsAttributeKey.REASON, String.valueOf(obj));
        mo44545v2(aVar.mo49933a());
        if (isFinishing() || (obj instanceof C18299a.C18302c)) {
            return;
        }
        if ("GOOGLE_PLAY_SERVICES".equals(str) && (obj instanceof Integer)) {
            int intValue = ((Integer) obj).intValue();
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            if (!instance.isUserResolvableError(intValue) || !this.f37311x) {
                mo44508K1();
            } else {
                instance.showErrorDialogFragment(this, intValue, 101, new C19729g(this));
            }
        } else if (obj instanceof GraphBuildException) {
            int a = ((GraphBuildException) obj).mo19761a();
            Intent w1 = mo44546w1();
            Intent intent = new Intent(this, GraphBuildFailureActivity.class);
            intent.putExtra("errorCode", a);
            intent.putExtra("relaunchIntent", w1);
            startActivity(intent);
            finish();
        } else {
            if (obj instanceof Throwable) {
                C16596f.m42113a().mo49364c((Throwable) obj);
            } else {
                mo44509L1(String.valueOf(obj));
                C16596f.m42113a().mo49364c(new IOException(C13437d.m33706k("DataPart: ", str, " AppDataLoadingFailure")));
            }
            if (obj instanceof IOException) {
                if (!C20977y0.m49122a(this)) {
                    C20977y0.m49124c(this);
                }
                setContentView(C19742t.no_network_error_layout);
                AlertMessageView alertMessageView = (AlertMessageView) findViewById(C19740r.alert_message);
                alertMessageView.setPositiveButtonClickListener(new C4585c(this, 1));
                alertMessageView.setNegativeButtonClickListener(new C4051q(this, 1));
            } else if (obj instanceof ServerException) {
                ServerException serverException = (ServerException) obj;
                if (serverException instanceof UserRequestError) {
                    UserRequestError userRequestError = (UserRequestError) serverException;
                    mo44536q2(userRequestError.mo49162d(), userRequestError.mo49161c());
                } else if (serverException instanceof ServerBusyException) {
                    mo44536q2((String) null, getResources().getString(C19746x.server_busy_error_message));
                } else if (serverException instanceof MetroRevisionMismatchException) {
                    mo44505H1((MetroRevisionMismatchException) serverException);
                }
            } else if (obj instanceof Error) {
                mo44536q2((String) null, "");
            } else {
                mo44536q2((String) null, (String) null);
            }
        }
    }

    /* renamed from: P1 */
    public boolean mo24039P1() {
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: Q1 */
    public boolean mo19421Q1(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    /* renamed from: R1 */
    public void mo44511R1(Bundle bundle) {
        if (bundle != null) {
            this.f37309R = bundle.getLong("METRO_REVISION_WHEN_CREATED", -1);
        }
    }

    @Deprecated
    /* renamed from: S1 */
    public void mo19483S1(int i, String str) {
    }

    /* renamed from: T1 */
    public void mo19422T1() {
        mo44509L1("onDestroyReady()");
        C19725d dVar = this.f37301J;
        if (dVar != null) {
            dVar.mo52073b();
        }
        this.f37310S.mo19886k();
    }

    /* renamed from: U1 */
    public void mo44512U1(List<C20436g<?, ?>> list) {
    }

    /* renamed from: V0 */
    public void mo19423V0(Bundle bundle, String str) {
    }

    /* renamed from: V1 */
    public void mo44513V1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        if (map.isEmpty()) {
            mo44515X1(arrayListHashMap);
            m36860m2();
            return;
        }
        mo44514W1(arrayListHashMap, map);
    }

    /* renamed from: W1 */
    public void mo44514W1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        mo44544v1();
        for (Map.Entry entry : map.entrySet()) {
            Throwable th = (Throwable) entry.getValue();
            entry.getKey();
        }
        if (!C20977y0.m49122a(this)) {
            C20977y0.m49124c(this);
        }
        setContentView(C19742t.activity_loading_failed);
        ((AlertMessageView) findViewById(C19740r.error_view)).setPositiveButtonClickListener(new C6592b(this, 3));
    }

    /* renamed from: X1 */
    public void mo44515X1(CollectionHashMap.ArrayListHashMap arrayListHashMap) {
        if (arrayListHashMap.size() == 1) {
            mo44512U1((List) C13717b.m34256c(arrayListHashMap.values()));
        }
    }

    /* renamed from: Y1 */
    public void mo44516Y1(Location location) {
    }

    /* renamed from: Z1 */
    public void mo44517Z1() {
    }

    /* renamed from: a2 */
    public void mo44518a2(C4360j jVar, Navigable navigable) {
    }

    /* renamed from: b1 */
    public final boolean mo44519b1() {
        C19728f a;
        if (!mo44507J1() || (a = C19728f.m47195a(getApplicationContext())) == null) {
            return false;
        }
        long j = a.f50165a.f16127b;
        long j2 = this.f37309R;
        if (j2 < 0) {
            this.f37309R = j;
            return false;
        } else if (j2 == j) {
            return false;
        } else {
            mo44544v1();
            mo44509L1("Metro revision changed on a sensitive activity " + toString());
            MoovitApplication.f37317k.mo44574v(this, mo44550y1());
            return true;
        }
    }

    /* renamed from: b2 */
    public void mo19424b2(Intent intent) {
    }

    /* renamed from: c2 */
    public void mo24880c2() {
        mo44509L1("onPauseReady()");
    }

    /* renamed from: d1 */
    public C16855d mo19507d1() {
        return null;
    }

    /* renamed from: d2 */
    public final void mo44520d2() {
        mo44509L1("onPrepare()");
        if (!mo44519b1()) {
            Collection<C13753f<?>> i1 = mo44524i1();
            if (i1 == null || i1.isEmpty()) {
                mo44513V1(new CollectionHashMap.ArrayListHashMap(), Collections.emptyMap());
                return;
            }
            for (C13753f<?> fVar : i1) {
                fVar.f33857c.f42907d = true;
            }
            new C14682c(i1).mo40705b(this);
        }
    }

    /* renamed from: e1 */
    public C17474b.C17475a mo44521e1() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_ACTIVITY);
        aVar.mo49941i(AnalyticsAttributeKey.GPS_STATUS, C20934d0.m49033d(this, "gps", ServerParameters.NETWORK));
        aVar.mo49941i(AnalyticsAttributeKey.IS_DARK_MODE, UiUtils.m40253l(this));
        return aVar;
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        boolean z;
        StringBuilder k = C13555b.m33972k("onReady() savedInstanceState=");
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        k.append(z);
        mo44509L1(k.toString());
        mo44545v2(new C17474b(AnalyticsEventKey.ON_READY));
        Iterator<C19723b> it = this.f37307P.iterator();
        while (true) {
            C13735p.C13736a aVar = (C13735p.C13736a) it;
            if (!aVar.hasNext()) {
                break;
            }
            T t = aVar.f33808c;
            aVar.f33808c = null;
            ((C19723b) t).mo46756Y0();
        }
        C20061g j1 = mo19428j1();
        C20061g gVar = this.f37295D;
        this.f37295D = j1;
        if (gVar != null) {
            C19730h hVar = new C19730h(this);
            C18481b bVar = this.f37294C;
            if (bVar.f47084a != null) {
                if (bVar.f47085b) {
                    gVar.mo50904b(hVar);
                }
                bVar.f47084a.mo47007p(gVar, hVar);
            }
        }
        if (j1 != null) {
            C19730h hVar2 = new C19730h(this);
            C18481b bVar2 = this.f37294C;
            if (bVar2.f47084a == null) {
                bVar2.f47084a = new CollectionHashMap.HashSetHashMap<>();
            }
            bVar2.f47084a.mo47001a(j1, hVar2);
            if (bVar2.f47085b) {
                j1.mo50903a(hVar2);
            }
        }
        Iterator it2 = this.f37296E.iterator();
        while (it2.hasNext()) {
            ((C14683d) it2.next()).mo44552a();
        }
        this.f37308Q = mo19507d1();
        this.f37310S.mo19885j();
    }

    /* renamed from: f1 */
    public C13753f<?> mo44522f1() {
        return null;
    }

    /* renamed from: f2 */
    public void mo24881f2() {
        mo44509L1("onResumeReady()");
        mo44519b1();
    }

    /* renamed from: g2 */
    public void mo23894g2(Bundle bundle) {
    }

    public Object getSystemService(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1817785029:
                if (str.equals("user_context")) {
                    c = 0;
                    break;
                }
                break;
            case -598704137:
                if (str.equals("car_operator_provider_service")) {
                    c = 1;
                    break;
                }
                break;
            case -493109629:
                if (str.equals("twitter_service_alerts_feeds")) {
                    c = 2;
                    break;
                }
                break;
            case -433561463:
                if (str.equals("metro_context")) {
                    c = 3;
                    break;
                }
                break;
            case -168568736:
                if (str.equals("ab_testing_manager")) {
                    c = 4;
                    break;
                }
                break;
            case 635108337:
                if (str.equals("gtfs_configuration")) {
                    c = 5;
                    break;
                }
                break;
            case 1422895613:
                if (str.equals("request_manager")) {
                    c = 6;
                    break;
                }
                break;
            case 1505637250:
                if (str.equals("user_configuration")) {
                    c = 7;
                    break;
                }
                break;
            case 2093653651:
                if (str.equals("destruction_notifier")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo44537r1("USER_CONTEXT");
            case 1:
                return C15684a.m40087a();
            case 2:
                return mo44537r1("TWITTER_SERVICE_ALERTS_FEEDS");
            case 3:
                return mo44537r1("METRO_CONTEXT");
            case 4:
                return mo44537r1("AB_TESTING_MANAGER");
            case 5:
                return mo44537r1("GTFS_CONFIGURATION");
            case 6:
                return this.f37293B;
            case 7:
                return mo44537r1("CONFIGURATION");
            case 8:
                if (this.f37301J == null) {
                    this.f37301J = new C19725d(this);
                }
                return this.f37301J;
            default:
                return super.getSystemService(str);
        }
    }

    /* renamed from: h2 */
    public void mo19426h2() {
        mo44509L1("onStartReady()");
        this.f37294C.mo50905a();
        C16855d dVar = this.f37308Q;
        if (dVar != null) {
            dVar.f43856d.clear();
            for (C16851b bVar : dVar.f43855c) {
                if (bVar.mo49514i()) {
                    dVar.f43856d.add(bVar);
                }
                bVar.mo49516k();
            }
            dVar.mo49525c();
        }
    }

    /* renamed from: i1 */
    public Collection<C13753f<?>> mo44524i1() {
        C13753f<?> f1 = mo44522f1();
        if (f1 != null) {
            return Collections.singleton(f1);
        }
        return Collections.emptySet();
    }

    /* renamed from: i2 */
    public void mo19427i2() {
        mo44509L1("onStopReady()");
        this.f37294C.mo50906b();
        C16855d dVar = this.f37308Q;
        if (dVar != null) {
            for (C16851b l : dVar.f43855c) {
                l.mo49517l();
            }
        }
    }

    public final boolean isDestroyed() {
        return this.f37292A;
    }

    /* renamed from: j1 */
    public C20061g mo19428j1() {
        return null;
    }

    /* renamed from: j2 */
    public final void mo44526j2() {
        boolean z;
        AnalyticsFlowKey analyticsFlowKey = this.f37306O;
        if (analyticsFlowKey != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6677a aVar = C19731i.m47197a(this).f50173c;
            aVar.mo22849g(this, analyticsFlowKey);
            aVar.mo22850h(analyticsFlowKey, mo19762m1().mo49933a());
            mo44544v1();
        }
    }

    /* renamed from: k2 */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> C13556a mo44527k2(String str, RQ rq, RequestOptions requestOptions, C20437h<RQ, RS> hVar) {
        return this.f37293B.mo40684g(str, rq, requestOptions, hVar);
    }

    /* renamed from: l2 */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> C13556a mo44528l2(String str, RQ rq, C20437h<RQ, RS> hVar) {
        return this.f37293B.mo40684g(str, rq, (RequestOptions) null, hVar);
    }

    /* renamed from: m1 */
    public C17474b.C17475a mo19762m1() {
        String str;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_ACTIVITY);
        aVar.mo49941i(AnalyticsAttributeKey.GPS_STATUS, C20934d0.m49033d(this, "gps", ServerParameters.NETWORK));
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.URI;
        Uri data = getIntent().getData();
        String str2 = null;
        if (data != null) {
            str = data.toString();
        } else {
            str = null;
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        AnalyticsAttributeKey analyticsAttributeKey2 = AnalyticsAttributeKey.CUSTOMER_ID;
        Uri data2 = getIntent().getData();
        if (data2 != null) {
            try {
                str2 = data2.getQueryParameter("partner_id");
            } catch (Throwable th) {
                C16596f.m42113a().mo49364c(new ApplicationBugException("Unable to extract partner id.", th));
            }
        }
        aVar.mo49939g(analyticsAttributeKey2, str2);
        aVar.mo49941i(AnalyticsAttributeKey.IS_DARK_MODE, UiUtils.m40253l(this));
        return aVar;
    }

    /* renamed from: n1 */
    public final <T extends Fragment> T mo44529n1(int i) {
        return getSupportFragmentManager().mo3983z(i);
    }

    /* renamed from: n2 */
    public final void mo44530n2(AlertDialogFragment alertDialogFragment) {
        mo44531o2(alertDialogFragment, "ALERT_DIALOG_FRAGMENT");
    }

    /* renamed from: o2 */
    public final void mo44531o2(AlertDialogFragment alertDialogFragment, String str) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        AlertDialogFragment alertDialogFragment2 = (AlertDialogFragment) getSupportFragmentManager().mo3923A("ALERT_DIALOG_FRAGMENT");
        if (alertDialogFragment2 != null) {
            K.mo4050p(alertDialogFragment2);
        }
        K.mo4110c((String) null);
        alertDialogFragment.show((C0932h0) K, str);
        supportFragmentManager.mo3981x();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105) {
            C16202a.get(this).onPermissionSettingsResult(this);
        } else if (i == 100) {
            C16202a.get(this).onLocationSettingsResolutionResult(this, i2, intent);
        } else if (i != 101) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            Intent w1 = mo44546w1();
            moovitApplication.f37321e.mo50689b("GOOGLE_PLAY_SERVICES");
            moovitApplication.mo44574v(this, w1);
        } else {
            mo44508K1();
        }
    }

    public final void onBackPressed() {
        if (this.f37299H) {
            Iterator<C19723b> it = this.f37307P.iterator();
            boolean z = false;
            while (true) {
                C13735p.C13736a aVar = (C13735p.C13736a) it;
                if (!aVar.hasNext()) {
                    break;
                }
                T t = aVar.f33808c;
                aVar.f33808c = null;
                C19723b bVar = (C19723b) t;
                if (bVar.mo46758y().isVisible()) {
                    z |= bVar.onBackPressed();
                }
            }
            if (z || mo24039P1()) {
                return;
            }
        }
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        C6026b bVar;
        if (C19731i.m47197a(this).f50171a.f50150a.isInstance(this)) {
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new C6028c(this);
            } else {
                bVar = new C6026b(this);
            }
            bVar.mo22022a();
            bVar.mo22023b(new C7071l0(this, 5));
        }
        this.f37297F = new C14688a(mo19438s1(), this.f37298G);
        if (bundle != null) {
            z = false;
        } else {
            mo44510M1();
            z = isFinishing();
        }
        if (z) {
            super.onCreate(bundle);
            return;
        }
        ((C13120a) mo44551z1()).mo40028g(TraceEvent.MOOVIT_ACTIVITY_READY, new C20944i0("activity", getClass().getSimpleName()));
        this.f37306O = ((C17476c) C19731i.m47197a(this).f50173c.f20758b).mo49947a(getClass());
        mo44526j2();
        mo44511R1(bundle);
        boolean e = this.f37297F.mo44597e();
        super.onCreate(bundle);
        String str = f37291T;
        C13771l lVar = (C13771l) mo44534p1(str);
        if (lVar == null) {
            RequestOptions requestOptions = new RequestOptions();
            C13771l lVar2 = new C13771l();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("defaultRequestOptions", requestOptions);
            lVar2.setArguments(bundle2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4041e(0, lVar2, str, 1);
            aVar.mo4040d();
            supportFragmentManager.mo3981x();
            lVar = lVar2;
        }
        this.f37293B = lVar.f33908b;
        this.f37304M = bundle;
        if (e) {
            mo44520d2();
        }
        if (this.f37299H) {
            this.f37304M = null;
            return;
        }
        mo44544v1();
        if (bundle == null) {
            mo19769r2();
            this.f37304M = null;
        } else {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("stale_fragment_ids");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("stale_fragment_tags");
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            do {
            } while (supportFragmentManager2.mo3939T());
            do {
                C0909a aVar2 = new C0909a(supportFragmentManager2);
                if (integerArrayList != null) {
                    Iterator<Integer> it = integerArrayList.iterator();
                    z2 = false;
                    while (it.hasNext()) {
                        Fragment z3 = supportFragmentManager2.mo3983z(it.next().intValue());
                        if (z3 != null) {
                            aVar2.mo4050p(z3);
                            mo44544v1();
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (stringArrayList != null) {
                    Iterator<String> it2 = stringArrayList.iterator();
                    while (it2.hasNext()) {
                        Fragment A = supportFragmentManager2.mo3923A(it2.next());
                        if (A != null) {
                            aVar2.mo4050p(A);
                            mo44544v1();
                            z2 = true;
                        }
                    }
                }
                aVar2.mo4040d();
                supportFragmentManager2.mo3981x();
            } while (z2);
        }
        mo19769r2();
        this.f37304M = null;
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f37299H) {
            return mo19421Q1(menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f37297F.mo44596d();
        if (this.f37299H) {
            mo19422T1();
        }
        C18863a.f48036a.mo51340a();
        this.f37292A = true;
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f37299H) {
            mo19424b2(intent);
        } else {
            this.f37305N = intent;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || getSupportParentActivityIntent() != null) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void onPause() {
        super.onPause();
        if (this.f37299H) {
            mo24880c2();
        }
        this.f37312y = false;
        this.f37311x = false;
    }

    public final void onPostResume() {
        super.onPostResume();
        this.f37312y = true;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 104) {
            C16202a.get(this).onRequestPermissionResult(this, strArr, iArr);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (this.f37299H) {
            super.onRestoreInstanceState(bundle);
        }
    }

    public final void onResume() {
        super.onResume();
        this.f37302K = false;
        if (this.f37303L) {
            m36860m2();
        }
        this.f37311x = true;
        if (this.f37299H) {
            mo24881f2();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f37302K = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<C19723b> it = this.f37307P.iterator();
        while (true) {
            C13735p.C13736a aVar = (C13735p.C13736a) it;
            if (!aVar.hasNext()) {
                break;
            }
            T t = aVar.f33808c;
            aVar.f33808c = null;
            C19723b bVar = (C19723b) t;
            if (!bVar.mo46757v1()) {
                int id = bVar.mo46758y().getId();
                String tag = bVar.mo46758y().getTag();
                if (id != 0) {
                    if (!arrayList.contains(Integer.valueOf(id))) {
                        arrayList.add(Integer.valueOf(id));
                    }
                } else if (tag != null && !arrayList2.contains(tag)) {
                    arrayList2.add(tag);
                }
            }
        }
        bundle.putIntegerArrayList("stale_fragment_ids", arrayList);
        bundle.putStringArrayList("stale_fragment_tags", arrayList2);
        if (mo44507J1()) {
            bundle.putLong("METRO_REVISION_WHEN_CREATED", this.f37309R);
        }
        if (this.f37299H) {
            mo23894g2(bundle);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r4 = this;
            super.onStart()
            com.moovit.analytics.AnalyticsFlowKey r0 = r4.f37306O
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0029
            tp.i r0 = p824tp.C19731i.m47197a(r4)
            u2.a r0 = r0.f50173c
            com.moovit.analytics.AnalyticsFlowKey r3 = r4.f37306O
            java.lang.Object r0 = r0.f20759c
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r3)
            hq.f r0 = (p543hq.C17479f) r0
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 != 0) goto L_0x002f
            r4.mo44526j2()
        L_0x002f:
            r4.f37302K = r2
            boolean r0 = r4.f37303L
            if (r0 == 0) goto L_0x0038
            r4.m36860m2()
        L_0x0038:
            r4.f37313z = r1
            boolean r0 = r4.f37299H
            if (r0 == 0) goto L_0x0041
            r4.mo19426h2()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.MoovitActivity.onStart():void");
    }

    public final void onStop() {
        super.onStop();
        if (this.f37299H) {
            mo19427i2();
        }
        boolean z = false;
        this.f37313z = false;
        AnalyticsFlowKey analyticsFlowKey = this.f37306O;
        if (analyticsFlowKey != null) {
            z = true;
        }
        if (z) {
            C6677a aVar = C19731i.m47197a(this).f50173c;
            aVar.mo22850h(analyticsFlowKey, mo44521e1().mo49933a());
            aVar.mo22847b(this, analyticsFlowKey, true);
            mo44544v1();
        }
    }

    /* renamed from: p1 */
    public final <T extends Fragment> T mo44534p1(String str) {
        return getSupportFragmentManager().mo3923A(str);
    }

    /* renamed from: p2 */
    public final void mo44535p2(CharSequence charSequence, CharSequence charSequence2) {
        AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) this).mo47684m(charSequence).mo47679h(charSequence2).mo47681j(C19746x.std_positive_button).mo47682k((String) null);
        k.mo47674c(true);
        mo44530n2(k.mo47673b());
    }

    /* renamed from: q2 */
    public final void mo44536q2(String str, String str2) {
        if (!C20977y0.m49122a(this)) {
            C20977y0.m49124c(this);
        }
        setContentView(C19742t.general_error_view);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(C19740r.failure_view);
        if (str != null) {
            alertMessageView.setTitle((CharSequence) str);
        }
        if (str2 != null) {
            alertMessageView.setSubtitle((CharSequence) str2);
        }
        alertMessageView.setNegativeButtonClickListener(new C4052r(this, 1));
    }

    /* renamed from: r1 */
    public final <T> T mo44537r1(String str) {
        return this.f37297F.mo44594b(str);
    }

    @SuppressLint({"InflateParams"})
    /* renamed from: r2 */
    public void mo19769r2() {
        if (!C20977y0.m49122a(this)) {
            C20977y0.m49124c(this);
        }
        setContentView(C19742t.loading_activity);
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        HashSet hashSet = new HashSet();
        hashSet.add("UPGRADER");
        if (C16202a.get(this).requiresGooglePlayServices()) {
            hashSet.add("GOOGLE_PLAY_SERVICES");
        }
        C0016g.m11A(hashSet, "USER_CONTEXT", "USER_LOCALE_UPDATER", "METRO_CONTEXT", "CONFIGURATION");
        hashSet.add("GTFS_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: s2 */
    public void mo44538s2(MetroRevisionMismatchException metroRevisionMismatchException) {
        boolean z;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i = C4779k.f16146h;
        if (supportFragmentManager.mo3923A("metro_updated_dialog_tag") != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            new C4779k().show(supportFragmentManager, "metro_updated_dialog_tag");
            supportFragmentManager.mo3981x();
        }
    }

    /* renamed from: t0 */
    public boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("UNEXPECTED_INTERLOCUTOR_FRAGMENT".equals(str)) {
            if (i == -1) {
                Intent i2 = C20927a0.m49014i(Uri.parse(getResources().getString(C19746x.unexpected_interlocutor_return_url)));
                i2.addFlags(268435456);
                startActivity(i2);
            }
            return true;
        }
        if ("LOCATION_PERMISSIONS_RATIONAL_FRAGMENT".equals(str)) {
            C16202a.get(this).onRequestPrePermissionResult(this, i);
        }
        return true;
    }

    @Deprecated
    /* renamed from: t1 */
    public final C12702e mo44539t1(String str) {
        return (C12702e) getSupportFragmentManager().mo3923A(str);
    }

    /* renamed from: t2 */
    public final void mo44540t2(int i) {
        mo44543u2(getText(i));
    }

    public final String toString() {
        return mo44544v1() + " State: isReady=" + this.f37299H + ", isResumed=" + this.f37311x + ", isStarted=" + this.f37313z + ", isDestroyed=" + this.f37292A;
    }

    /* renamed from: u1 */
    public final Location mo44542u1() {
        return this.f37295D.mo50014i();
    }

    /* renamed from: u2 */
    public final void mo44543u2(CharSequence charSequence) {
        C12623b bVar = (C12623b) mo44534p1("WAIT_DIALOG_FRAGMENT");
        if (bVar != null) {
            bVar.f31210h = charSequence;
            View view = bVar.getView();
            if (view != null) {
                ((ProgressView) view.findViewById(C19740r.loading_view)).setText(charSequence);
                return;
            }
            return;
        }
        int i = C12623b.f31209i;
        Bundle bundle = new Bundle();
        bundle.putCharSequence(InAppMessageBase.MESSAGE, charSequence);
        C12623b bVar2 = new C12623b();
        bVar2.setArguments(bundle);
        bVar2.show(getSupportFragmentManager(), "WAIT_DIALOG_FRAGMENT");
    }

    /* renamed from: v1 */
    public final String mo44544v1() {
        return getClass().getSimpleName() + "[" + System.identityHashCode(this) + "]";
    }

    /* renamed from: v2 */
    public final void mo44545v2(C17474b bVar) {
        boolean z;
        if (this.f37306O != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C19731i.m47197a(this).f50173c.mo22850h(this.f37306O, bVar);
        }
    }

    /* renamed from: w1 */
    public Intent mo44546w1() {
        Intent intent = new Intent(getIntent());
        intent.setFlags(0);
        return intent;
    }

    /* renamed from: w2 */
    public final void mo44547w2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: x1 */
    public final C13752e mo44548x1() {
        return this.f37293B.mo40679b();
    }

    /* renamed from: x2 */
    public final TextView mo44549x2(int i) {
        return (TextView) findViewById(i);
    }

    /* renamed from: y1 */
    public Intent mo44550y1() {
        return new Intent(this, C19731i.m47197a(this).f50171a.f50150a);
    }

    /* renamed from: z1 */
    public final C13121b mo44551z1() {
        if (this.f37300I == null) {
            this.f37300I = new C13120a();
        }
        return this.f37300I;
    }
}
