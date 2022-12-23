package p032c0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.MenuItem;
import androidx.appcompat.widget.C0475w0;
import c70.C13752e;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.ads.loaders.LoadAdException;
import com.moovit.app.intro.login.FirstTimeLoginActivity;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueAmount;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStep;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import f90.C12642d;
import f90.C12647g;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import m80.C12887v;
import n80.C12916c;
import o10.C18688d;
import o10.C18690f;
import p001a0.C0016g;
import p028ba.C1515i;
import p041ca.C1810b;
import p041ca.C1824j;
import p041ca.C1831q;
import p041ca.C1835u;
import p054d0.C4291k0;
import p063da.C4407a;
import p237r9.C6269b;
import p275u9.C6735h;
import p275u9.C6751s;
import p543hq.C17474b;
import p824tp.C19740r;
import p880vx.C20244b;
import p921xq.C20554a;
import p977zz.C20949l;
import q80.C13009a;

/* renamed from: c0.d */
public final /* synthetic */ class C1754d implements C4407a.C4408a, C1835u.C1836a, SuccessContinuation, C16202a.C16205c, C0475w0.C0476a, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f6153b;

    /* renamed from: c */
    public final /* synthetic */ Object f6154c;

    /* renamed from: d */
    public final /* synthetic */ Object f6155d;

    public /* synthetic */ C1754d(int i, Object obj, Object obj2) {
        this.f6153b = i;
        this.f6154c = obj;
        this.f6155d = obj2;
    }

    /* renamed from: C */
    public final Object mo309C() {
        C1515i iVar = (C1515i) this.f6154c;
        iVar.getClass();
        for (Map.Entry entry : ((Map) this.f6155d).entrySet()) {
            iVar.f5450i.mo6644j((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public final Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f6154c;
        C6751s sVar = (C6751s) this.f6155d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C6269b bVar = C1835u.f6351g;
        uVar.getClass();
        ArrayList arrayList = new ArrayList();
        Long r = C1835u.m5158r(sQLiteDatabase, sVar);
        if (r != null) {
            SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
            C1835u.m5160w(sQLiteDatabase2.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{r.toString()}, (String) null, (String) null, (String) null, String.valueOf(uVar.f6355e.mo6624c())), new C1831q(0, uVar, arrayList, sVar));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(((C1824j) arrayList.get(i)).mo6632b());
            if (i < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        C1835u.m5160w(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), (String[]) null, (String) null, (String) null, (String) null), new C4291k0(hashMap, 4));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C1824j jVar = (C1824j) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(jVar.mo6632b()))) {
                C6735h.C6736a i2 = jVar.mo6631a().mo22923i();
                for (C1835u.C1837b bVar2 : (Set) hashMap.get(Long.valueOf(jVar.mo6632b()))) {
                    i2.mo22924a(bVar2.f6357a, bVar2.f6358b);
                }
                listIterator.set(new C1810b(jVar.mo6632b(), jVar.mo6633c(), i2.mo22899b()));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final void mo5770h(int i, Object obj) {
        FirstTimeLoginActivity firstTimeLoginActivity = (FirstTimeLoginActivity) this.f6154c;
        MoovitActivity moovitActivity = (MoovitActivity) obj;
        int i2 = FirstTimeLoginActivity.f38456p0;
        firstTimeLoginActivity.getClass();
        ((C20244b) MoovitAppApplication.m37038x().f37321e.mo50693f("USER_CONTEXT")).f51351d = true;
        firstTimeLoginActivity.mo45255B2((String) this.f6155d);
    }

    public final boolean invoke(Object obj) {
        C12647g gVar = (C12647g) this.f6154c;
        PurchaseStoredValueAmount purchaseStoredValueAmount = (PurchaseStoredValueAmount) this.f6155d;
        C12642d dVar = (C12642d) obj;
        int i = C12647g.f31262m;
        gVar.getClass();
        PurchaseStoredValueSelectionStep purchaseStoredValueSelectionStep = (PurchaseStoredValueSelectionStep) dVar.f32728o;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
        aVar.mo49937e(AnalyticsAttributeKey.PROVIDER, purchaseStoredValueSelectionStep.f23445f);
        aVar.mo49939g(AnalyticsAttributeKey.ID, purchaseStoredValueSelectionStep.f23446g);
        aVar.mo49939g(AnalyticsAttributeKey.CURRENCY_CODE, purchaseStoredValueAmount.f23430b.f23844b);
        aVar.mo49936d(AnalyticsAttributeKey.BALANCE, C0016g.m19b(purchaseStoredValueAmount.f23430b));
        aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, purchaseStoredValueSelectionStep.f23247c);
        dVar.mo46797j2(aVar.mo49933a());
        if (((PurchaseTicketActivity) dVar.f40822c) != null) {
            dVar.mo40058n2(new PurchaseStoredValueSelectionStepResult(((PurchaseStoredValueSelectionStep) dVar.f32728o).f23246b, purchaseStoredValueAmount.f23430b));
        }
        gVar.dismissAllowingStateLoss();
        return false;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        C18690f fVar = (C18690f) this.f6154c;
        Context context = (Context) this.f6155d;
        fVar.getClass();
        if (menuItem.getItemId() != C19740r.action_delete) {
            return false;
        }
        C18688d f = C18688d.m45685f(context);
        f.mo51499b();
        f.f48438c.mo40648f(ServerId.m11393d(fVar.f47586r));
        f.mo51498a();
        return true;
    }

    public final Task then(Object obj) {
        switch (this.f6153b) {
            case 3:
                MobileAdsManager mobileAdsManager = (MobileAdsManager) this.f6154c;
                Void voidR = (Void) obj;
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                mobileAdsManager.getClass();
                String g = MobileAdsManager.m37072g((AdSource) this.f6155d);
                C20554a aVar = (C20554a) mobileAdsManager.f37467i.get(g);
                if (aVar != null) {
                    return Tasks.forResult(aVar);
                }
                return Tasks.forException(new LoadAdException(C25541a.m63881k("Unable to load ad: ", g)));
            default:
                C12887v vVar = (C12887v) this.f6154c;
                C13752e eVar = (C13752e) obj;
                ThreadPoolExecutor threadPoolExecutor = C12887v.f31893d;
                vVar.getClass();
                return Tasks.call(MoovitExecutors.f37327IO, new C13009a(eVar, C12887v.m32670f(vVar.f31895a), (C12916c) this.f6155d));
        }
    }
}
