package p946ys;

import android.graphics.Bitmap;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.C15177c;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import j20.C17707d;
import java.util.List;
import l90.C12852c;
import m80.C12869e;
import m90.C12890b;
import p001a0.C0017h;
import p543hq.C17474b;
import p594jv.C17942l;
import p638lr.C18267n;
import p691nx.C18642a;
import p805su.C19560p;
import p977zz.C20944i0;
import p977zz.C20961r;

/* renamed from: ys.d */
public final /* synthetic */ class C20763d implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f52392b;

    /* renamed from: c */
    public final /* synthetic */ Object f52393c;

    public /* synthetic */ C20763d(Object obj, int i) {
        this.f52392b = i;
        this.f52393c = obj;
    }

    public final void onSuccess(Object obj) {
        TransitStop transitStop;
        String str;
        LocationDescriptor locationDescriptor;
        switch (this.f52392b) {
            case 0:
                C20764e eVar = (C20764e) this.f52393c;
                C20761b bVar = (C20761b) obj;
                eVar.getClass();
                if (bVar != null) {
                    for (C20760a next : bVar.f52385d) {
                        if (!eVar.f52396e.containsKey(next.mo52895a())) {
                            eVar.f52396e.put(next.mo52895a(), new C1043v(new C20961r(next)));
                        }
                    }
                    for (C20760a next2 : bVar.f52386e) {
                        if (!eVar.f52396e.containsKey(next2.mo52895a())) {
                            eVar.f52396e.put(next2.mo52895a(), new C1043v(new C20961r(next2)));
                        }
                    }
                    return;
                }
                return;
            case 1:
                C19560p pVar = (C19560p) this.f52393c;
                int i = C19560p.f49719q;
                pVar.getClass();
                pVar.mo46797j2((C17474b) ((C20944i0) obj).f52693b);
                return;
            case 2:
                C15177c cVar = (C15177c) this.f52393c;
                List<MotActivation> list = (List) obj;
                int i2 = C15177c.f39095p;
                if (cVar.f40822c != null) {
                    if (C13717b.m34258e(list)) {
                        ((MoovitAppActivity) cVar.f40822c).finish();
                        return;
                    }
                    cVar.f39097o = list;
                    MotActivationStationInfo motActivationStationInfo = ((MotActivation) C13717b.m34256c(list)).f38997n;
                    if (motActivationStationInfo != null) {
                        transitStop = motActivationStationInfo.f39021b.get();
                    } else {
                        transitStop = null;
                    }
                    if (transitStop != null) {
                        str = transitStop.f23731c;
                    } else {
                        str = null;
                    }
                    cVar.f39096n.setStationName(str);
                    cVar.f39096n.setQrCodes(C13720d.m34273c(list, (C13722f) null, new C18267n(6)));
                    MotActivation motActivation = (MotActivation) C13717b.m34256c(list);
                    C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_qr_viewer_station_inspection_impression");
                    aVar.mo49943k(AnalyticsAttributeKey.ID, motActivation.f38985b);
                    aVar.mo49944l(AnalyticsAttributeKey.COUNT, Integer.valueOf(list.size()));
                    aVar.mo49943k(AnalyticsAttributeKey.AGENCY_ID, motActivation.mo45526d());
                    aVar.mo49945m(AnalyticsAttributeKey.AGENCY_NAME, motActivation.mo45529f());
                    cVar.mo46797j2(aVar.mo49933a());
                    return;
                }
                return;
            case 3:
                C17942l lVar = (C17942l) this.f52393c;
                C17707d dVar = (C17707d) obj;
                int i3 = C17942l.f46005p;
                lVar.getClass();
                if (dVar.f45452c == 2 && (locationDescriptor = dVar.f45454e) != null) {
                    lVar.f46007o = locationDescriptor.mo24313f();
                    return;
                }
                return;
            case 4:
                C18642a aVar2 = (C18642a) this.f52393c;
                int i4 = C18642a.f47505p;
                aVar2.getClass();
                if (PaymentAccount.m64175c((PaymentAccount) obj, "BusItalia", PaymentAccountContextStatus.CONNECTED)) {
                    aVar2.f47506n.setVisibility(0);
                    return;
                }
                return;
            case 5:
                ((C1040t) this.f52393c).setValue((List) obj);
                return;
            case 6:
                TicketValidationActivity ticketValidationActivity = (TicketValidationActivity) this.f52393c;
                int i5 = TicketValidationActivity.f23570X;
                ticketValidationActivity.mo44506I1();
                FragmentManager supportFragmentManager = ticketValidationActivity.getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                K.mo4111f(C12869e.ticket_receipt_content, (Fragment) ((C12890b) obj).mo24270a(ticketValidationActivity.f23571U), (String) null);
                K.mo4040d();
                return;
            default:
                C12852c cVar2 = (C12852c) this.f52393c;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    cVar2.f31784t.setImageBitmap(bitmap);
                    return;
                }
                int i6 = C12852c.f31778u;
                cVar2.getClass();
                return;
        }
    }
}
