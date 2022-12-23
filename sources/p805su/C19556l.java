package p805su;

import a00.C13382a;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o00.C18676l;
import p543hq.C17474b;
import p805su.C19560p;
import p824tp.C19728f;

/* renamed from: su.l */
public final /* synthetic */ class C19556l implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C19560p f49704b;

    /* renamed from: c */
    public final /* synthetic */ Task f49705c;

    /* renamed from: d */
    public final /* synthetic */ Task f49706d;

    /* renamed from: e */
    public final /* synthetic */ RecyclerView f49707e;

    public /* synthetic */ C19556l(C19560p pVar, Task task, Task task2, RecyclerView recyclerView) {
        this.f49704b = pVar;
        this.f49705c = task;
        this.f49706d = task2;
        this.f49707e = recyclerView;
    }

    public final void onSuccess(Object obj) {
        MotQrCodeTrip motQrCodeTrip;
        List list;
        int i;
        int i2;
        ServerId serverId;
        C19560p pVar = this.f49704b;
        Task task = this.f49705c;
        Task task2 = this.f49706d;
        RecyclerView recyclerView = this.f49707e;
        List list2 = (List) obj;
        int i3 = C19560p.f49719q;
        pVar.getClass();
        if (task.isSuccessful() || task2.isSuccessful()) {
            if (task.isSuccessful()) {
                motQrCodeTrip = (MotQrCodeTrip) task.getResult();
            } else {
                motQrCodeTrip = null;
            }
            if (task2.isSuccessful()) {
                list = (List) task2.getResult();
            } else {
                list = null;
            }
            ServerId serverId2 = pVar.f49722p;
            if (motQrCodeTrip != null || !C13717b.m34258e(list)) {
                if (motQrCodeTrip != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = 0;
                }
                int i4 = i2 + i;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_trip_selection_impression");
                aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
                aVar.mo49935c(AnalyticsAttributeKey.COUNT, i4);
                aVar.mo49943k(AnalyticsAttributeKey.LINE_GROUP_ID, serverId2);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.PREDICTED_LINE_ID;
                if (motQrCodeTrip != null) {
                    serverId = motQrCodeTrip.f39073c.f23687c;
                } else {
                    serverId = null;
                }
                aVar.mo49943k(analyticsAttributeKey, serverId);
                pVar.mo46797j2(aVar.mo49933a());
                pVar.mo51908p2(i4, serverId2);
                C19560p.C19561a aVar2 = new C19560p.C19561a((C19728f) pVar.mo46776J1("METRO_CONTEXT"));
                if (serverId2 == null) {
                    ArrayList arrayList = new ArrayList(2);
                    if (motQrCodeTrip != null) {
                        arrayList.add(new C18676l.C18678b(recyclerView.getResources().getString(R.string.payment_mot_activation_this_line), Collections.singletonList(motQrCodeTrip)));
                    }
                    if (!C13717b.m34258e(list)) {
                        arrayList.add(new C18676l.C18678b(recyclerView.getResources().getString(R.string.payment_mot_activation_trip_hint), list));
                    }
                    aVar2.mo51055y(arrayList);
                } else {
                    aVar2.mo51055y(Collections.singletonList(new C18676l.C18678b((CharSequence) null, list)));
                }
                C19560p.m46932r2(recyclerView, aVar2);
                C13382a.m33665a(recyclerView, recyclerView.getResources().getString(R.string.payment_mot_activation_trip_message));
                return;
            }
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "mot_trip_selection_impression");
            aVar3.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            aVar3.mo49935c(AnalyticsAttributeKey.COUNT, 0);
            pVar.mo46797j2(aVar3.mo49933a());
            pVar.mo51908p2(0, serverId2);
            C19560p.m46932r2(recyclerView, pVar.f49720n);
            return;
        }
        task2.getException();
        pVar.mo51909q2(recyclerView);
    }
}
