package com.moovit.app.actions.notifydriver;

import a00.C13382a;
import aa0.C7540l;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13717b;
import c20.C13744a;
import c70.C13751d;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.Time;
import com.moovit.view.TransitLineListItemView;
import com.tranzmate.R;
import g20.C17161i;
import ja0.C12791b;
import ja0.C12793c;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import k00.C17988b;
import o00.C18665b;
import p543hq.C17474b;
import p732pq.C18953m;
import p732pq.C18955o;
import p732pq.C18956p;
import p732pq.C18957q;
import p824tp.C19728f;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p952yy.C20786b;
import p952yy.C20789d;
import q00.C19047a;
import z00.C20795a;

public class NotifyDriverLineSelectionActivity extends MoovitAppActivity implements C12791b.C12792a<C14721d> {

    /* renamed from: r0 */
    public static final /* synthetic */ int f37425r0 = 0;

    /* renamed from: U */
    public final C14718a f37426U = new C14718a();

    /* renamed from: X */
    public Group f37427X;

    /* renamed from: Y */
    public C20795a f37428Y;

    /* renamed from: Z */
    public C13556a f37429Z = null;

    /* renamed from: l0 */
    public TransitStop f37430l0;

    /* renamed from: m0 */
    public ServerIdMap<TransitLine> f37431m0;

    /* renamed from: n0 */
    public RecyclerView f37432n0;

    /* renamed from: o0 */
    public String f37433o0;

    /* renamed from: p0 */
    public long f37434p0 = TimeUnit.DAYS.toMinutes(1);

    /* renamed from: q0 */
    public final C14719b f37435q0 = new C14719b();

    /* renamed from: com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity$a */
    public class C14718a extends C7540l {
        public C14718a() {
        }

        /* renamed from: a */
        public final void mo19433a() {
            NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity = NotifyDriverLineSelectionActivity.this;
            int i = NotifyDriverLineSelectionActivity.f37425r0;
            C13752e x1 = notifyDriverLineSelectionActivity.mo44548x1();
            if (notifyDriverLineSelectionActivity.f37297F.mo44593a()) {
                C13556a aVar = notifyDriverLineSelectionActivity.f37429Z;
                if (aVar != null) {
                    aVar.cancel(true);
                    notifyDriverLineSelectionActivity.f37429Z = null;
                }
                C19728f fVar = (C19728f) notifyDriverLineSelectionActivity.mo44537r1("METRO_CONTEXT");
                C19047a aVar2 = (C19047a) notifyDriverLineSelectionActivity.mo44537r1("CONFIGURATION");
                C21100e.m49373x(x1, "requestContext");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                C20786b bVar = new C20786b();
                ServerId serverId = notifyDriverLineSelectionActivity.f37430l0.f23730b;
                for (V v : notifyDriverLineSelectionActivity.f37431m0.values()) {
                    arrayList.add(v.f23687c);
                    arrayList2.add(serverId);
                }
                if (arrayList.isEmpty()) {
                    notifyDriverLineSelectionActivity.f37432n0.mo4627l0(notifyDriverLineSelectionActivity.f37428Y);
                    notifyDriverLineSelectionActivity.f37427X.setVisibility(8);
                    return;
                }
                C20789d dVar = new C20789d(x1, fVar, aVar2, arrayList, arrayList2, bVar);
                String str = dVar.f52463B;
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                notifyDriverLineSelectionActivity.f37429Z = notifyDriverLineSelectionActivity.mo44527k2(str, dVar, requestOptions, new C18955o(notifyDriverLineSelectionActivity));
            }
        }
    }

    /* renamed from: com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity$b */
    public class C14719b extends C20438i<C18956p, C18957q> {
        public C14719b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C18956p pVar = (C18956p) cVar;
            NotifyDriverLineSelectionActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C18956p pVar = (C18956p) cVar;
            C18957q qVar = (C18957q) gVar;
            NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity = NotifyDriverLineSelectionActivity.this;
            int i = NotifyDriverLineSelectionActivity.f37425r0;
            notifyDriverLineSelectionActivity.getClass();
            C18956p pVar2 = (C18956p) qVar.f51773b;
            ServerId serverId = pVar2.f48267y;
            ServerId serverId2 = pVar2.f48266x;
            SharedPreferences.Editor edit = notifyDriverLineSelectionActivity.getSharedPreferences("notify_driver", 0).edit();
            edit.putLong(serverId + "_" + serverId2, System.currentTimeMillis());
            edit.apply();
            PaymentRegistrationInstructions paymentRegistrationInstructions = qVar.f48269m;
            if (paymentRegistrationInstructions != null) {
                notifyDriverLineSelectionActivity.startActivity(PaymentRegistrationActivity.m41719z2(notifyDriverLineSelectionActivity, PaymentRegistrationType.REGISTRATION, paymentRegistrationInstructions));
                return;
            }
            notifyDriverLineSelectionActivity.mo44545v2(new C17474b(AnalyticsEventKey.NOTIFY_DRIVER_SUCCESS));
            Toast.makeText(notifyDriverLineSelectionActivity, notifyDriverLineSelectionActivity.getString(R.string.accessibility_notify_driver_success), 0).show();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C18956p pVar = (C18956p) cVar;
            NotifyDriverLineSelectionActivity.this.mo44545v2(new C17474b(AnalyticsEventKey.NOTIFY_DRIVER_FAILED));
            NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity = NotifyDriverLineSelectionActivity.this;
            notifyDriverLineSelectionActivity.mo44530n2(C13751d.m34341b(notifyDriverLineSelectionActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity$c */
    public static class C14720c extends C12791b<C14721d> {

        /* renamed from: k */
        public final C17161i<C16181a.C16184c, TransitLine> f37438k;

        public C14720c(C19728f fVar, NotifyDriverLineSelectionActivity notifyDriverLineSelectionActivity) {
            super(Collections.emptyList(), R.layout.notify_driver_line_selection_list_item, notifyDriverLineSelectionActivity);
            this.f37438k = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
        }

        /* renamed from: l */
        public final void mo23840l(C12797f fVar, Object obj) {
            C14721d dVar = (C14721d) obj;
            TransitLineListItemView transitLineListItemView = (TransitLineListItemView) fVar.itemView;
            transitLineListItemView.mo24765v(this.f37438k, dVar.f37439a);
            transitLineListItemView.getScheduleView().setSchedule(dVar.f37440b);
            C13382a.m33674j(transitLineListItemView, transitLineListItemView.getContentDescription());
        }
    }

    /* renamed from: com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity$d */
    public static class C14721d {

        /* renamed from: a */
        public final TransitLine f37439a;

        /* renamed from: b */
        public final Schedule f37440b;

        public C14721d(TransitLine transitLine, Schedule schedule) {
            this.f37439a = transitLine;
            this.f37440b = schedule;
        }
    }

    /* renamed from: com.moovit.app.actions.notifydriver.NotifyDriverLineSelectionActivity$e */
    public static class C14722e implements Callable<Boolean> {

        /* renamed from: e */
        public static final long f37441e = TimeUnit.MINUTES.toMillis(15);

        /* renamed from: b */
        public final SharedPreferences f37442b;

        /* renamed from: c */
        public final ServerId f37443c;

        /* renamed from: d */
        public final ServerId f37444d;

        public C14722e(SharedPreferences sharedPreferences, ServerId serverId, ServerId serverId2) {
            C21100e.m49373x(sharedPreferences, "prefs");
            this.f37442b = sharedPreferences;
            C21100e.m49373x(serverId, "stopId");
            this.f37443c = serverId;
            C21100e.m49373x(serverId2, "lineId");
            this.f37444d = serverId2;
        }

        public final Object call() throws Exception {
            String str = this.f37443c + "_" + this.f37444d;
            Map<String, ?> all = this.f37442b.getAll();
            if (C13717b.m34259f(all)) {
                return Boolean.FALSE;
            }
            SharedPreferences.Editor edit = this.f37442b.edit();
            for (String next : all.keySet()) {
                long j = this.f37442b.getLong(next, -1);
                if (j != -1 && System.currentTimeMillis() - j > f37441e) {
                    edit.remove(next);
                }
            }
            edit.apply();
            if (this.f37442b.getLong(str, -1) != -1) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.notify_driver_line_selection_activity);
        Intent intent = getIntent();
        this.f37430l0 = (TransitStop) intent.getParcelableExtra("stop");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("lines");
        if (this.f37430l0 == null || parcelableArrayListExtra == null) {
            throw new ApplicationBugException("Did you use NotifyDriverLineSelectionActivity.createStartingIntent(...)?");
        }
        this.f37431m0 = ServerIdMap.m17949a(parcelableArrayListExtra);
        C19047a aVar = (C19047a) mo44537r1("CONFIGURATION");
        this.f37434p0 = (long) ((Integer) aVar.mo51505b(C20199a.f51273e1)).intValue();
        this.f37433o0 = (String) aVar.mo51505b(C20199a.f51267b1);
        ((Toolbar) findViewById(R.id.tool_bar)).setNavigationOnClickListener(new C4051q(this, 2));
        TextView textView = (TextView) findViewById(R.id.subtitle);
        textView.setText(this.f37430l0.f23731c);
        C13744a.m34299a(textView, UiUtils.Edge.LEFT, this.f37430l0.f23734f);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f37432n0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f37432n0.mo4593g(new C18665b(this, R.drawable.divider_horizontal), -1);
        this.f37432n0.setAdapter(new C12793c());
        this.f37427X = (Group) findViewById(R.id.content);
        this.f37428Y = new C20795a(C17988b.m44611b(R.drawable.img_cancel_warning, this), getText(R.string.accessibility_notify_driver_empty_lines), (CharSequence) null);
    }

    /* renamed from: f */
    public final void mo20740f(List list, Object obj, int i) {
        LongServerId longServerId;
        C14721d dVar = (C14721d) obj;
        Time m = dVar.f37440b.mo24326m();
        if (m != null && (longServerId = m.f23904e) != null) {
            ServerId serverId = dVar.f37439a.f23687c;
            ServerId serverId2 = this.f37430l0.f23730b;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "notify_driver_line_selected");
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_ID, i);
            aVar.mo49937e(AnalyticsAttributeKey.LINE_ID, serverId);
            aVar.mo49937e(AnalyticsAttributeKey.STOP_ID, serverId2);
            aVar.mo49938f(AnalyticsAttributeKey.TRIP_ID, longServerId);
            mo44545v2(aVar.mo49933a());
            mo44543u2((CharSequence) null);
            Tasks.call(MoovitExecutors.COMPUTATION, new C14722e(getSharedPreferences("notify_driver", 0), serverId2, serverId)).addOnCompleteListener((Activity) this, new C18953m(this, serverId, serverId2, longServerId));
        }
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        this.f37426U.mo23804e();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        this.f37426U.mo23803d();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("METRO_CONTEXT");
        hashSet.add("CONFIGURATION");
        return s1;
    }
}
