package com.moovit.micromobility;

import a00.C13382a;
import a40.C0078a;
import aa0.C7540l;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14737e;
import com.moovit.commons.utils.SafeCallable;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.ride.C4193a;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import l30.C5566a0;
import l30.C5568b0;
import l30.C5570c0;
import l30.C5572d0;
import l30.C5573e;
import l30.C5577i;
import l30.C5585p;
import l30.C5587q;
import l30.C5589r;
import l30.C5596y;
import l30.C5597z;
import m30.C5679b;
import p130j2.C5367a;
import p484ff.C16978i0;
import p484ff.C16984m;
import p543hq.C17474b;
import p783rw.C19372d;
import p824tp.C19728f;
import p858uz.C20061g;
import p910xf.C20481j;
import p977zz.C20954n0;
import p977zz.C20975x0;

public class MicroMobilityRideActivity extends MoovitMicroMobilityActivity {

    /* renamed from: n0 */
    public static final /* synthetic */ int f14823n0 = 0;

    /* renamed from: U */
    public final C4126a f14824U = new C4126a();

    /* renamed from: X */
    public final C4127b f14825X = new C4127b();

    /* renamed from: Y */
    public final C4128c f14826Y = new C4128c();

    /* renamed from: Z */
    public final AtomicReference<SafeCallable<Boolean>> f14827Z = new AtomicReference<>();

    /* renamed from: l0 */
    public C5585p f14828l0;

    /* renamed from: m0 */
    public MenuItem f14829m0;

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$a */
    public class C4126a extends BroadcastReceiver {
        public C4126a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (!MicroMobilityRideActivity.this.isFinishing()) {
                MicroMobilityRideActivity microMobilityRideActivity = MicroMobilityRideActivity.this;
                int i = MicroMobilityRideActivity.f14823n0;
                microMobilityRideActivity.mo19431z2();
            }
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$b */
    public class C4127b extends C7540l {
        public C4127b() {
            super(1000);
        }

        /* renamed from: a */
        public final void mo19433a() {
            SafeCallable safeCallable = MicroMobilityRideActivity.this.f14827Z.get();
            if (safeCallable != null && ((Boolean) safeCallable.call()).booleanValue()) {
                mo23802c();
            }
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$c */
    public class C4128c extends C5587q {
        public C4128c() {
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$d */
    public static /* synthetic */ class C4129d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14833a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.micromobility.ride.MicroMobilityRide$Status[] r0 = com.moovit.micromobility.ride.MicroMobilityRide.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14833a = r0
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.RESERVED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PENDING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f14833a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.micromobility.ride.MicroMobilityRide$Status r1 = com.moovit.micromobility.ride.MicroMobilityRide.Status.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.micromobility.MicroMobilityRideActivity.C4129d.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$e */
    public static class C4130e implements SafeCallable<Boolean> {

        /* renamed from: b */
        public final ListItemView f14834b;

        /* renamed from: c */
        public final MicroMobilityRide f14835c;

        public C4130e(ListItemView listItemView, MicroMobilityRide microMobilityRide) {
            this.f14834b = listItemView;
            C21100e.m49373x(microMobilityRide, "ride");
            this.f14835c = microMobilityRide;
        }

        public final /* synthetic */ Object call() {
            return C20954n0.m49068a(this);
        }

        public final /* synthetic */ Object onError(Throwable th) {
            return C20954n0.m49069b(this, th);
        }

        public final Object safeCall() throws Throwable {
            this.f14834b.setSubtitle((CharSequence) DateUtils.formatElapsedTime(TimeUnit.SECONDS.convert(Math.max(0, System.currentTimeMillis() - this.f14835c.f14992j.f200e), TimeUnit.MILLISECONDS)));
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.moovit.micromobility.MicroMobilityRideActivity$f */
    public static class C4131f implements SafeCallable<Boolean> {

        /* renamed from: b */
        public final MicroMobilityRideActivity f14836b;

        /* renamed from: c */
        public final ListItemView f14837c;

        /* renamed from: d */
        public final MicroMobilityRide f14838d;

        public C4131f(MicroMobilityRideActivity microMobilityRideActivity, ListItemView listItemView, MicroMobilityRide microMobilityRide) {
            this.f14836b = microMobilityRideActivity;
            this.f14837c = listItemView;
            C21100e.m49373x(microMobilityRide, "ride");
            this.f14838d = microMobilityRide;
        }

        public final /* synthetic */ Object call() {
            return C20954n0.m49068a(this);
        }

        public final /* synthetic */ Object onError(Throwable th) {
            return C20954n0.m49069b(this, th);
        }

        public final Object safeCall() throws Throwable {
            int i;
            boolean z;
            long currentTimeMillis = this.f14838d.f14992j.f203h - System.currentTimeMillis();
            ListItemView listItemView = this.f14837c;
            long j = 0;
            int i2 = (currentTimeMillis > 0 ? 1 : (currentTimeMillis == 0 ? 0 : -1));
            if (i2 > 0) {
                j = TimeUnit.SECONDS.convert(currentTimeMillis, TimeUnit.MILLISECONDS);
            }
            listItemView.setSubtitle((CharSequence) DateUtils.formatElapsedTime(j));
            ListItemView listItemView2 = this.f14837c;
            if (currentTimeMillis <= TimeUnit.MINUTES.toMillis(2)) {
                i = C5596y.ic_alert_ring_16_problem;
            } else {
                i = 0;
            }
            listItemView2.setIconTopEndDecorationDrawable(i);
            ListItemView listItemView3 = this.f14837c;
            listItemView3.setContentDescription(C13382a.m33667c(listItemView3.getTitle(), this.f14837c.getContext().getString(C5570c0.voiceover_remaining, new Object[]{this.f14837c.getSubtitle()})));
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                MicroMobilityRideActivity microMobilityRideActivity = this.f14836b;
                int i3 = MicroMobilityRideActivity.f14823n0;
                ServerId serverId = (ServerId) microMobilityRideActivity.getIntent().getParcelableExtra("rideId");
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_expiration_dialog_impression");
                aVar.mo49943k(AnalyticsAttributeKey.ID, serverId);
                microMobilityRideActivity.mo44545v2(aVar.mo49933a());
                AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) microMobilityRideActivity).mo47682k("expiration_alert_dialog");
                k.mo47676e(C5596y.img_timeout_clock, false);
                AlertDialogFragment.C15856a j2 = k.mo47683l(C5570c0.micro_mobility_reservation_expired_title).mo47678g(C5570c0.micro_mobility_reservation_expired_message).mo47681j(C5570c0.got_it);
                j2.f41328b.putParcelable("rideId", serverId);
                microMobilityRideActivity.mo44530n2(j2.mo47673b());
            }
            return Boolean.valueOf(!z);
        }
    }

    /* renamed from: y2 */
    public static Intent m11106y2(Context context, ServerId serverId) {
        Intent intent = new Intent(context, MicroMobilityRideActivity.class);
        intent.putExtra("rideId", serverId);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo19417A2(SafeCallable<Boolean> safeCallable) {
        this.f14827Z.set(safeCallable);
        if (safeCallable != null) {
            this.f14825X.mo23804e();
        } else {
            this.f14825X.mo23803d();
        }
    }

    /* renamed from: B2 */
    public final void mo19418B2(MicroMobilityRide microMobilityRide) {
        ServerId serverId = microMobilityRide.f14986d;
        if (!C20975x0.m49118e(microMobilityRide, this.f14826Y.f18312f)) {
            C4128c cVar = this.f14826Y;
            cVar.mo23803d();
            cVar.f18311e = this;
            cVar.f18312f = microMobilityRide;
            cVar.f18313g = null;
            cVar.mo23804e();
        }
    }

    /* renamed from: C2 */
    public final void mo19419C2(MicroMobilityRide microMobilityRide) {
        ServerId serverId = microMobilityRide.f14986d;
        List<MicroMobilityAction> list = microMobilityRide.f14992j.f209n;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C5679b bVar = (C5679b) supportFragmentManager.mo3923A("micro_mobility_actions");
        if (bVar == null || !serverId.equals(bVar.f18461n) || !C20975x0.m49118e(list, bVar.f18462o)) {
            C0909a aVar = new C0909a(supportFragmentManager);
            int i = C5597z.fragment_container;
            ServerId serverId2 = microMobilityRide.f14986d;
            int i2 = C5679b.f18460q;
            Bundle bundle = new Bundle();
            bundle.putParcelable("rideId", serverId2);
            bundle.putParcelableArrayList("actions", C13717b.m34264k(list));
            C5679b bVar2 = new C5679b();
            bVar2.setArguments(bundle);
            aVar.mo4111f(i, bVar2, "micro_mobility_actions");
            aVar.mo4043i();
        }
    }

    /* renamed from: D2 */
    public final void mo19420D2(C0078a aVar) {
        ListItemView listItemView = (ListItemView) findViewById(C5597z.provider_details);
        View findViewById = findViewById(C5597z.divider_middle);
        if (aVar != null) {
            listItemView.setIcon(aVar.f196a);
            listItemView.setTitle((CharSequence) aVar.f204i);
            listItemView.setSubtitle((CharSequence) aVar.f205j);
            UiUtils.m40238F(0, listItemView, findViewById);
            return;
        }
        UiUtils.m40238F(8, listItemView, findViewById);
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(C5568b0.cancel_menu, menu);
        MenuItem findItem = menu.findItem(C5597z.cancel);
        this.f14829m0 = findItem;
        C4128c cVar = this.f14826Y;
        MicroMobilityRide microMobilityRide = cVar.f18312f;
        if (microMobilityRide == null) {
            findItem.setVisible(false);
            return true;
        }
        C4193a aVar = cVar.f18313g;
        if (aVar == null) {
            aVar = microMobilityRide.f14991i;
        }
        findItem.setVisible(aVar.f15006a);
        return true;
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C4126a aVar = this.f14824U;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(this).mo21148d(aVar);
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        ServerId serverId = (ServerId) bundle.getParcelable("rideId");
        if ("expiration_alert_dialog".equals(str)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "dismiss_expiration_dialog_clicked");
            aVar.mo49943k(AnalyticsAttributeKey.RIDE_ID, serverId);
            mo44545v2(aVar.mo49933a());
            finish();
        } else if ("cancel_ride_confirmation_dialog_fragment".equals(str)) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "dismiss_cancel_ride_dialog_clicked");
            aVar2.mo49943k(AnalyticsAttributeKey.RIDE_ID, serverId);
            mo44545v2(aVar2.mo49933a());
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C5566a0.micro_mobility_ride_activity);
        setSupportActionBar((Toolbar) findViewById(C5597z.tool_bar));
        this.f14828l0 = new C5585p(this, (C19728f) mo44537r1("METRO_CONTEXT"), (MapFragment) mo44529n1(C5597z.map_fragment));
        C4126a aVar = this.f14824U;
        C5577i iVar = C5577i.f18275d;
        C5367a.m13473a(this).mo21146b(aVar, new IntentFilter("com.moovit.micromobility.action.updated"));
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo19431z2();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        mo19417A2((SafeCallable<Boolean>) null);
        C4128c cVar = this.f14826Y;
        cVar.f18311e = null;
        cVar.f18312f = null;
        cVar.f18313g = null;
        cVar.mo23803d();
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C5597z.cancel) {
            return super.onOptionsItemSelected(menuItem);
        }
        mo44547w2("cancel_clicked");
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("rideId");
        if (serverId != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_cancel_ride_dialog_impression");
            aVar.mo49937e(AnalyticsAttributeKey.ID, serverId);
            mo44545v2(aVar.mo49933a());
            AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) this).mo47682k("cancel_ride_confirmation_dialog_fragment");
            int i = C5572d0.ThemeOverlay_Moovit_AlertDialog_Critical;
            if (i == 0) {
                k.f41328b.remove("themeOverlay");
            } else {
                k.f41328b.putInt("themeOverlay", i);
            }
            k.mo47676e(C5596y.img_empty_warning, false);
            AlertDialogFragment.C15856a i2 = k.mo47678g(C5570c0.micro_mobility_cancel_popup_title).mo47681j(C5570c0.micro_mobility_cancel_popup_yes_btn).mo47680i(C5570c0.micro_mobility_cancel_popup_no_btn);
            i2.f41328b.putParcelable("rideId", serverId);
            i2.mo47673b().show(getSupportFragmentManager(), "cancel_ride_confirmation_dialog_fragment");
            return true;
        }
        throw new IllegalStateException("createStartingIntent wasn't called.");
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        ServerId serverId = (ServerId) bundle.getParcelable("rideId");
        if ("cancel_ride_confirmation_dialog_fragment".equals(str)) {
            if (i == -1) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "confirm_clicked");
                aVar.mo49943k(AnalyticsAttributeKey.RIDE_ID, serverId);
                mo44545v2(aVar.mo49933a());
                if (serverId != null) {
                    mo44543u2((CharSequence) null);
                    C5577i a = C5577i.m13786a();
                    ExecutorService executorService = MoovitExecutors.COMPUTATION;
                    Tasks.call(executorService, new C5573e(a, 0)).onSuccessTask(executorService, new C19372d(1, a, serverId)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C5589r(this, 0)).addOnCompleteListener((Executor) executorService, new C16978i0(this, 4));
                }
            }
            return true;
        } else if ("expiration_alert_dialog".equals(str)) {
            if (i == -1) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "got_it");
                aVar2.mo49943k(AnalyticsAttributeKey.RIDE_ID, serverId);
                mo44545v2(aVar2.mo49933a());
            }
            return true;
        } else {
            super.mo19430t0(str, i, bundle);
            return true;
        }
    }

    /* renamed from: z2 */
    public final void mo19431z2() {
        mo44543u2((CharSequence) null);
        ServerId serverId = (ServerId) getIntent().getParcelableExtra("rideId");
        if (serverId != null) {
            C5577i.m13786a().mo21403d(serverId).addOnSuccessListener((Activity) this, new C16984m(this, 10)).addOnFailureListener((Activity) this, (OnFailureListener) new C20481j(this, 4)).addOnCompleteListener((Activity) this, new C14737e(this, 3));
            return;
        }
        throw new IllegalStateException("createStartingIntent wasn't called.");
    }
}
