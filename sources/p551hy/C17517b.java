package p551hy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.play.core.assetpacks.C14264f1;
import com.google.android.play.core.assetpacks.C14272h1;
import com.google.android.play.core.assetpacks.C14276i1;
import com.moovit.app.tod.model.TodPassengerPinCodeActionInfo;
import com.moovit.commons.utils.LinkedText;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.transit.TransitLine;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.commands.GetBrowserSessionContextCommand;
import d40.C4351g;
import e20.C16783l;
import h40.C5052c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mf0.C24361g;
import p175n.C5768c;
import p559ii.C17601a;
import p583jk.C17884p;
import p584jl.C17885a;
import p977zz.C20941h;

/* renamed from: hy.b */
public final class C17517b implements C14272h1, C5052c {

    /* renamed from: e */
    public static volatile C17517b f45093e;

    /* renamed from: b */
    public final /* synthetic */ int f45094b;

    /* renamed from: c */
    public Object f45095c;

    /* renamed from: d */
    public Object f45096d;

    public /* synthetic */ C17517b(int i, Object obj, Object obj2) {
        this.f45094b = i;
        this.f45095c = obj;
        this.f45096d = obj2;
    }

    /* renamed from: a */
    public final long[] mo20784a() {
        return new long[]{0, 200, 50, 200, 50, 200};
    }

    /* renamed from: b */
    public final Integer mo20773b() {
        return null;
    }

    /* renamed from: c */
    public final void mo20774c() {
    }

    /* renamed from: d */
    public final Integer mo20775d() {
        return Integer.valueOf(C20941h.m49043f(R.attr.colorGood, (Context) this.f45095c));
    }

    /* renamed from: e */
    public final int mo20776e() {
        return 0;
    }

    /* renamed from: f */
    public final CharSequence mo20777f() {
        return null;
    }

    public final int getIcon() {
        return R.drawable.img_notification_center_bell;
    }

    public final CharSequence getTitle() {
        return ((Context) this.f45095c).getResources().getString(R.string.tripplan_itinerary_approaching_notification_title);
    }

    /* renamed from: i */
    public final CharSequence mo20780i() {
        return ((Context) this.f45095c).getString(R.string.tripplan_itinerary_approaching_notification, new Object[]{C16783l.m42479k((Context) this.f45095c, (TransitLine) this.f45096d)});
    }

    /* renamed from: k */
    public final Uri mo20785k() {
        return C17884p.m44351V(((Context) this.f45095c).getResources(), R.raw.notification_gettingclose);
    }

    public final String toString() {
        switch (this.f45094b) {
            case 6:
                StringBuilder k = C13555b.m33972k("TodPassengerActionRequiredInfoData{qrCode=");
                k.append((C17601a) this.f45095c);
                k.append(", pinCode=");
                k.append((TodPassengerPinCodeActionInfo) this.f45096d);
                k.append("}");
                return k.toString();
            default:
                return super.toString();
        }
    }

    public final Object zza() {
        C14276i1 i1Var = (C14276i1) this.f45095c;
        Bundle bundle = (Bundle) this.f45096d;
        i1Var.getClass();
        int i = bundle.getInt(GetBrowserSessionContextCommand.KEY_SESSION_ID);
        if (i == 0) {
            return Boolean.TRUE;
        }
        HashMap hashMap = i1Var.f35909e;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        C14264f1 f1Var = (C14264f1) i1Var.f35909e.get(valueOf);
        if (f1Var.f35864c.f35837d == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!C17885a.m44419P0(f1Var.f35864c.f35837d, bundle.getInt(C24361g.m61192v0(ServerParameters.STATUS, C14276i1.m35524d(bundle)))));
    }

    public C17517b() {
        this.f45094b = 3;
        this.f45095c = new HashMap();
        this.f45096d = new HashMap();
    }

    public C17517b(PaymentAccountContextStatus paymentAccountContextStatus, LinkedText linkedText) {
        this.f45094b = 9;
        C21100e.m49373x(paymentAccountContextStatus, "paymentAccountContextStatus");
        this.f45095c = paymentAccountContextStatus;
        this.f45096d = linkedText;
    }

    public C17517b(String str, Map map) {
        this.f45094b = 8;
        C21100e.m49373x(str, "accountUrl");
        this.f45095c = str;
        C21100e.m49373x(map, "additionalHeaders");
        this.f45096d = Collections.unmodifiableMap(map);
    }

    public C17517b(Context context, int i) {
        this.f45094b = i;
        if (i != 5) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f45095c = context.getApplicationContext();
            return;
        }
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f45095c = new C5768c(context, (int) R.style.MoovitTheme);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17517b(C4351g gVar, TransitLine transitLine) {
        this((Context) gVar, 5);
        this.f45094b = 5;
        this.f45096d = transitLine;
    }
}
