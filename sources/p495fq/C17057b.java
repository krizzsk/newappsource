package p495fq;

import a00.C13382a;
import android.app.Activity;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.lineschedule.LineScheduleActivity;
import com.moovit.design.view.list.ListItemLayout;
import com.moovit.design.view.list.ListItemView;
import com.moovit.inputfields.C16069a;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.payment.account.actions.AccountActionInputStepFragment;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.ticketing.purchase.filter.C7688a;
import com.moovit.ticketing.purchase.filter.PurchaseFilter;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import k00.C17988b;
import mf0.C24362h;
import p484ff.C16984m;
import p543hq.C17474b;
import p547hu.C17492a;
import p547hu.C17493b;
import p547hu.C17494c;
import p547hu.C17497f;
import p824tp.C19728f;
import p872vp.C20195b;
import p977zz.C20927a0;
import p977zz.C20935e;
import p977zz.C20961r;
import z00.C20795a;

/* renamed from: fq.b */
public final /* synthetic */ class C17057b implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f44219b;

    /* renamed from: c */
    public final /* synthetic */ Object f44220c;

    public /* synthetic */ C17057b(Object obj, int i) {
        this.f44219b = i;
        this.f44220c = obj;
    }

    public final void invoke(Object obj) {
        boolean z;
        RecyclerView.Adapter adapter;
        int i = 0;
        switch (this.f44219b) {
            case 0:
                C17059d dVar = (C17059d) this.f44220c;
                Void voidR = (Void) obj;
                C16202a.get(dVar.f43848b).requestLocationSettings().addOnSuccessListener((Activity) dVar.f43848b, new C16984m(dVar, 2));
                return;
            case 1:
                LineScheduleActivity lineScheduleActivity = (LineScheduleActivity) this.f44220c;
                C17497f fVar = (C17497f) obj;
                int i2 = LineScheduleActivity.f38859w0;
                if (!lineScheduleActivity.isDestroyed() && !lineScheduleActivity.isFinishing() && lineScheduleActivity.f38862Y.equals(fVar.f45049a.f23694b)) {
                    lineScheduleActivity.f38874v0 = fVar;
                    TransitLine transitLine = fVar.f45050b.get(0);
                    ListItemView listItemView = (ListItemView) lineScheduleActivity.findViewById(R.id.line_template);
                    HashSet hashSet = C19728f.f50164e;
                    C16181a.m41233b(((C19728f) lineScheduleActivity.getSystemService("metro_context")).mo52082b(LinePresentationType.LINE_SCHEDULE), listItemView, transitLine);
                    C13382a.m33674j(listItemView, lineScheduleActivity.getString(R.string.voice_over_lineview_header, new Object[]{C20195b.m47768l(transitLine), listItemView.getSubtitle()}));
                    if (fVar.f45052d == null) {
                        lineScheduleActivity.f38868p0.setVisibility(8);
                    } else {
                        ((ListItemView) lineScheduleActivity.f38868p0.findViewById(R.id.departure_stop)).setSubtitle((CharSequence) fVar.f45051c.f23731c);
                        ((ListItemView) lineScheduleActivity.f38868p0.findViewById(R.id.arrival_stop)).setSubtitle((CharSequence) fVar.f45052d.f23731c);
                        lineScheduleActivity.f38868p0.setVisibility(0);
                    }
                    if (fVar.f45053e.isEmpty()) {
                        lineScheduleActivity.f38867o0.mo4627l0(new C20795a(C17988b.m44611b(R.drawable.img_empty_state_line_view, lineScheduleActivity), (CharSequence) null, lineScheduleActivity.getText(R.string.no_available_transit)));
                        lineScheduleActivity.mo45478B2("empty");
                    } else {
                        Time time = new Time(System.currentTimeMillis());
                        int i3 = -1;
                        if (!fVar.f45055g.isEmpty()) {
                            adapter = new C17492a(fVar.f45055g);
                            lineScheduleActivity.mo45478B2("frequencies");
                        } else {
                            C17494c cVar = new C17494c(time, fVar.f45053e);
                            List<C17493b> list = fVar.f45053e;
                            long g = time.mo24631g();
                            int size = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    if (list.get(i4).f45033e.mo24631g() >= g) {
                                        i3 = i4;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                            lineScheduleActivity.mo45478B2("triptimes");
                            adapter = cVar;
                        }
                        lineScheduleActivity.f38867o0.mo4627l0(adapter);
                        lineScheduleActivity.f38867o0.mo4589e0(Math.max(0, i3));
                    }
                    lineScheduleActivity.mo45479C2(fVar.f45052d);
                    if (lineScheduleActivity.getIntent().getParcelableExtra("destStopId") != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || fVar.f45054f.isEmpty()) {
                        lineScheduleActivity.f38870r0.setVisibility(8);
                        return;
                    }
                    HashSet hashSet2 = new HashSet();
                    for (C17493b bVar : fVar.f45053e) {
                        hashSet2.add(bVar.f45032d);
                    }
                    ListItemLayout listItemLayout = lineScheduleActivity.f38870r0;
                    if (hashSet2.size() <= 1) {
                        i = 8;
                    }
                    listItemLayout.setVisibility(i);
                    return;
                }
                return;
            case 2:
                MapFragment mapFragment = (MapFragment) this.f44220c;
                C20961r rVar = (C20961r) obj;
                mapFragment.mo48641l3(mapFragment.mo48619P2(mapFragment.f42356O), false);
                return;
            case 3:
                AccountActionInputStepFragment accountActionInputStepFragment = (AccountActionInputStepFragment) this.f44220c;
                C16069a aVar = (C16069a) obj;
                int i5 = AccountActionInputStepFragment.f63851q;
                C24362h.m61211f(accountActionInputStepFragment, "this$0");
                accountActionInputStepFragment.mo83339r2();
                return;
            case 4:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f44220c;
                String str = (String) obj;
                int i6 = MotPaymentAccountActivity.f64002X;
                motPaymentAccountActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_external_account_support_clicked");
                aVar2.mo49939g(AnalyticsAttributeKey.URI, str);
                motPaymentAccountActivity.mo44545v2(aVar2.mo49933a());
                C20927a0.m49017l(motPaymentAccountActivity, C20927a0.m49014i(Uri.parse(str)));
                return;
            default:
                C7688a.m17558p2((C7688a) this.f44220c, (PurchaseFilter) obj);
                return;
        }
    }
}
