package p028ba;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;
import h60.C17355s1;
import j80.C12773b;
import j80.C12778f;
import java.math.BigDecimal;
import java.util.List;
import m80.C12865a;
import m80.C12869e;
import m80.C12873i;
import p041ca.C1835u;
import p063da.C4407a;
import p066e0.C4452q0;
import p237r9.C6269b;
import p275u9.C6751s;
import p956ze.C20837a;
import p956ze.C20839b;
import p977zz.C20949l;
import w50.C20277a;
import w50.C20283g;
import z80.C13338a;
import z80.C13341b;

/* renamed from: ba.d */
public final /* synthetic */ class C1510d implements C4407a.C4408a, C1835u.C1836a, C20837a.C20838a, SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ int f5427b;

    /* renamed from: c */
    public final /* synthetic */ Object f5428c;

    /* renamed from: d */
    public final /* synthetic */ Object f5429d;

    public /* synthetic */ C1510d(int i, Object obj, Object obj2) {
        this.f5427b = i;
        this.f5429d = obj;
        this.f5428c = obj2;
    }

    /* renamed from: C */
    public final Object mo309C() {
        return ((C1515i) this.f5429d).f5444c.mo6652a2((C6751s) this.f5428c);
    }

    public final Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f5429d;
        C6269b bVar = C1835u.f6351g;
        uVar.getClass();
        Long r = C1835u.m5158r((SQLiteDatabase) obj, (C6751s) this.f5428c);
        if (r == null) {
            return Boolean.FALSE;
        }
        return (Boolean) C1835u.m5160w(uVar.mo6660q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{r.toString()}), new C4452q0(3));
    }

    /* renamed from: d */
    public final void mo5856d(C20839b bVar) {
        ((C20837a.C20838a) this.f5429d).mo5856d(bVar);
        ((C20837a.C20838a) this.f5428c).mo5856d(bVar);
    }

    public final boolean invoke(Object obj) {
        C7959a aVar = (C7959a) this.f5428c;
        PurchaseSplitActivity purchaseSplitActivity = (PurchaseSplitActivity) obj;
        int i = C13341b.f33130n;
        String tag = ((C13341b) this.f5429d).getTag();
        purchaseSplitActivity.getClass();
        if (tag != null) {
            char c = 65535;
            switch (tag.hashCode()) {
                case -1947571054:
                    if (tag.equals("primary_cc_fragment")) {
                        c = 0;
                        break;
                    }
                    break;
                case 712154309:
                    if (tag.equals("secondary_edit_cc_tag")) {
                        c = 1;
                        break;
                    }
                    break;
                case 957273171:
                    if (tag.equals("primary_edit_cc_tag")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2102277380:
                    if (tag.equals("secondary_cc_fragment")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    purchaseSplitActivity.f23285Y = aVar;
                    purchaseSplitActivity.mo24048y2("secondary_cc_fragment", C12873i.payment_split_method_2_title, C12873i.payment_split_extra_card_subtitle, false);
                    break;
                case 1:
                    purchaseSplitActivity.f23286Z = aVar;
                    purchaseSplitActivity.getSupportFragmentManager().mo3936Q();
                    break;
                case 2:
                    purchaseSplitActivity.f23285Y = aVar;
                    purchaseSplitActivity.getSupportFragmentManager().mo3936Q();
                    break;
                case 3:
                    purchaseSplitActivity.f23286Z = aVar;
                    FragmentManager supportFragmentManager = purchaseSplitActivity.getSupportFragmentManager();
                    if (supportFragmentManager.mo3926D() > 0) {
                        supportFragmentManager.mo3937R(supportFragmentManager.mo3925C(0).getId(), false);
                    }
                    CurrencyAmount currencyAmount = purchaseSplitActivity.f23284X;
                    Bundle bundle = new Bundle();
                    C21100e.m49373x(currencyAmount, "totalPrice");
                    bundle.putParcelable("totalPrice", currencyAmount);
                    C13338a aVar2 = new C13338a();
                    aVar2.setArguments(bundle);
                    C0909a aVar3 = new C0909a(supportFragmentManager);
                    aVar3.mo4112g(C12865a.slide_fragment_enter, C12865a.slide_fragment_exit, C12865a.slide_fragment_pop_enter, C12865a.slide_fragment_pop_exit);
                    aVar3.mo4111f(C12869e.split_content, aVar2, "split_amount");
                    aVar3.mo4040d();
                    break;
            }
        }
        return true;
    }

    public final Task then(Object obj) {
        switch (this.f5427b) {
            case 3:
                C13752e eVar = (C13752e) obj;
                BigDecimal bigDecimal = C20283g.f51427r;
                return Tasks.call(MoovitExecutors.f37327IO, new C17355s1((C20277a) this.f5429d, eVar, (List) this.f5428c));
            default:
                C12778f fVar = (C12778f) this.f5429d;
                ServerId serverId = (ServerId) this.f5428c;
                C12773b bVar = (C12773b) obj;
                int i = C12778f.f31585g;
                fVar.getClass();
                if (bVar == null) {
                    return Tasks.forException(new ApplicationBugException("metroServiceAlerts must not be null"));
                }
                return Tasks.call(MoovitExecutors.COMPUTATION, new C12778f.C12783e(serverId, bVar));
        }
    }
}
