package p304x;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import androidx.emoji2.text.C0852l;
import androidx.room.C1257b;
import com.appboy.Appboy;
import com.google.android.exoplayer2.p052ui.PlayerControlView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.tod.shuttle.model.TodZone;
import com.moovit.navigation.NavigationService;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import gc0.C12724b;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kc0.C12844i;
import lc0.C12860c;
import mf0.C24362h;
import p066e0.C4452q0;
import p074e8.C4600c;
import p085f8.C4712b;
import p135j8.C5398d;
import p184n8.C5871c;
import p184n8.C5873e;
import p184n8.C5876g;
import p241s0.C6302b;
import p262t8.C6606a;
import p543hq.C17474b;
import p644lx.C18283a;
import p684nq.C18584e;
import p801sq.C19520i;
import q60.C19088b;
import v40.C25754i;
import z80.C13341b;

/* renamed from: x.r1 */
public final /* synthetic */ class C7099r1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22073b;

    /* renamed from: c */
    public final /* synthetic */ Object f22074c;

    public /* synthetic */ C7099r1(Object obj, int i) {
        this.f22073b = i;
        this.f22074c = obj;
    }

    public final void run() {
        boolean z;
        switch (this.f22073b) {
            case 0:
                C7102s1.m16642o((C7102s1) this.f22074c);
                return;
            case 1:
                ((C0852l.C0854b) this.f22074c).mo3637c();
                return;
            case 2:
                ((C1257b) this.f22074c).getClass();
                Collections.emptyList();
                throw null;
            case 3:
                ((Appboy) this.f22074c).m5415f();
                return;
            case 4:
                ((View) this.f22074c).requestFocus();
                return;
            case 5:
                C4600c cVar = (C4600c) this.f22074c;
                C4600c.C4601a aVar = C4600c.f15809f;
                Class<C4600c> cls = C4600c.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C24362h.m61211f(cVar, "this$0");
                        cVar.mo20121b();
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                C5873e eVar = (C5873e) this.f22074c;
                HashMap hashMap = C5873e.f18873e;
                if (!C6606a.m15601b(C5873e.class)) {
                    try {
                        C24362h.m61211f(eVar, "this$0");
                        try {
                            int i = C5398d.f17731a;
                            View b = C5398d.m13501b(eVar.f18874b.get());
                            Activity activity = eVar.f18874b.get();
                            if (b == null) {
                                return;
                            }
                            if (activity != null) {
                                Iterator it = C5871c.m14318a(b).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (!C4712b.m12009b(view)) {
                                        String d = C5871c.m14320d(view);
                                        if (d.length() > 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z && d.length() <= 300) {
                                            HashSet hashSet = C5876g.f18881f;
                                            String localClassName = activity.getLocalClassName();
                                            C24362h.m61210e(localClassName, "activity.localClassName");
                                            C5876g.C5877a.m14331b(view, b, localClassName);
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        C6606a.m15600a(C5873e.class, th2);
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                ((PlayerControlView) this.f22074c).mo16386c();
                return;
            case 8:
                C18584e eVar2 = (C18584e) this.f22074c;
                int i2 = C18584e.f47313w;
                eVar2.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_register_clicked");
                eVar2.mo46797j2(aVar2.mo49933a());
                eVar2.startActivity(PaymentRegistrationActivity.m41717A2(eVar2.requireActivity(), PaymentRegistrationType.PURCHASE, "IsraelMot"));
                return;
            case 9:
                int i3 = C19520i.f49609w;
                ((C19520i) this.f22074c).mo51887B2();
                return;
            case 10:
                ((LineDetailActivity) this.f22074c).f38744x0.setState(6);
                return;
            case 11:
                C18283a aVar3 = (C18283a) this.f22074c;
                int i4 = C18283a.f46614q;
                if (aVar3.f40824e) {
                    C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar4.mo49939g(AnalyticsAttributeKey.TYPE, aVar3.mo50676o2());
                    C6302b bVar = new C6302b();
                    TodZone todZone = aVar3.mo50675n2().f40399b;
                    if (todZone != null) {
                        bVar.put(AnalyticsAttributeKey.ZONE_ID, todZone.f40447b.mo19751c());
                    }
                    aVar3.mo50674m2(bVar);
                    aVar4.f44998b.putAll(bVar);
                    aVar3.mo46797j2(aVar4.mo49933a());
                    return;
                }
                return;
            case 12:
                NavigationService.m11307s((NavigationService) this.f22074c);
                return;
            case 13:
                C19088b bVar2 = (C19088b) this.f22074c;
                int i5 = C19088b.f48519z;
                Toast.makeText(bVar2.getContext(), C25754i.payment_registration_payment_method_success_message, 1).show();
                bVar2.mo46786U1(C19088b.C19091c.class, new C4452q0(15));
                return;
            case 14:
                C13341b bVar3 = (C13341b) this.f22074c;
                int i6 = C13341b.f33130n;
                if (bVar3.f40824e) {
                    boolean z2 = bVar3.requireArguments().getBoolean("isPrimary");
                    C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "split_payment_add_credit_card");
                    aVar5.mo49941i(AnalyticsAttributeKey.IS_PRIMARY_CREDIT_CARD, z2);
                    bVar3.mo46797j2(aVar5.mo49933a());
                    return;
                }
                return;
            case 15:
                C12724b bVar4 = (C12724b) this.f22074c;
                C24362h.m61211f(bVar4, "this$0");
                C12860c cVar2 = bVar4.f31441r;
                if (cVar2 != null) {
                    cVar2.setFocusable(false);
                    return;
                }
                return;
            default:
                C12844i.m32630n((C12844i) this.f22074c);
                return;
        }
    }
}
