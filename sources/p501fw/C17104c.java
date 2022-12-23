package p501fw;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import b00.C13556a;
import ce0.C21100e;
import com.android.billingclient.api.C1941b;
import com.android.billingclient.api.C1947e;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.model.TodRide;
import java.util.HashSet;
import java.util.List;
import p269u2.C6677a;
import p502fx.C17122g;
import p526gx.C17248a;
import p526gx.C17250c;
import p526gx.C17253f;
import p526gx.C17254g;
import p927xw.C20637f;
import p977zz.C20961r;

/* renamed from: fw.c */
public final /* synthetic */ class C17104c implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f44270b;

    /* renamed from: c */
    public final /* synthetic */ Object f44271c;

    /* renamed from: d */
    public final /* synthetic */ Object f44272d;

    /* renamed from: e */
    public final /* synthetic */ Object f44273e;

    /* renamed from: f */
    public final /* synthetic */ Object f44274f;

    public /* synthetic */ C17104c(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f44270b = i;
        this.f44271c = obj;
        this.f44272d = obj2;
        this.f44273e = obj3;
        this.f44274f = obj4;
    }

    public final void onSuccess(Object obj) {
        C17248a aVar = null;
        boolean z = false;
        switch (this.f44270b) {
            case 0:
                MoovitSubscriptionsManager moovitSubscriptionsManager = (MoovitSubscriptionsManager) this.f44271c;
                List list = (List) obj;
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                moovitSubscriptionsManager.getClass();
                if (((C1941b) ((Task) this.f44272d).getResult()).mo9558a((Activity) this.f44274f, (C1947e) ((Task) this.f44273e).getResult()).f6770a != 0) {
                    moovitSubscriptionsManager.f39764f.postValue(new C20961r(new MoovitSubscriptionsManager.C15359b(false, (MoovitSubscriptionsManager.C15361d) null)));
                    return;
                }
                return;
            default:
                C17250c cVar = (C17250c) this.f44271c;
                Context context = (Context) this.f44272d;
                C6677a aVar2 = (C6677a) this.f44273e;
                C17122g gVar = (C17122g) this.f44274f;
                C17253f fVar = (C17253f) obj;
                if (cVar.f44580a == aVar2) {
                    Location location = gVar.f44316d;
                    int i = -1;
                    if (!((C17254g) aVar2.f20759c).f44595a && fVar.f44591b != -1 && location.hasAccuracy() && location.getAccuracy() <= 20.0f) {
                        z = true;
                    }
                    if (z) {
                        C21100e.m49369v(1);
                        C13556a aVar3 = cVar.f44581b;
                        if (aVar3 != null) {
                            aVar3.cancel(true);
                            cVar.f44581b = null;
                        }
                        cVar.f44580a = null;
                        cVar.mo49801b(context, gVar);
                        return;
                    }
                    TodRideActivity todRideActivity = TodRideActivity.this;
                    C20637f fVar2 = todRideActivity.f40002m0;
                    TodRide todRide = todRideActivity.f40004o0;
                    fVar2.getClass();
                    fVar2.mo52817b(todRide.f40275m, todRide.f40267e, todRide.f40266d, fVar);
                    int i2 = fVar.f44591b;
                    if (i2 != fVar.f44592c) {
                        if (i2 != -1) {
                            aVar = fVar.f44590a.f44589d.get(i2);
                        }
                        C17248a aVar4 = fVar.f44590a.f44589d.get(fVar.f44592c);
                        if (aVar != null) {
                            i = aVar.f44576b;
                        }
                        if (i != aVar4.f44576b) {
                            todRideActivity.f40002m0.mo52816a(fVar.f44594e);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
