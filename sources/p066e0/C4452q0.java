package p066e0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.JsonReader;
import c00.C13723g;
import com.facebook.appevents.C2343m;
import com.facebook.appevents.C2348n;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.tod.TodRideRatingDialogFragment;
import com.moovit.design.view.PinCodeView;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n10.C18504a;
import p009a8.C0114n;
import p009a8.C0115o;
import p041ca.C1835u;
import p173ma.C5735h;
import p173ma.C5739k;
import p237r9.C6269b;
import p237r9.C6271d;
import p250s9.C6489b;
import p262t8.C6606a;
import p264ta.C6629e;
import p543hq.C17474b;
import p577je.C17746a0;
import p577je.C17782b0;
import p577je.C17809q;
import p601ke.C18028a;
import p664mu.C18443f;
import p672ne.C18539a;
import p684nq.C18583d;
import p837ue.C19895d;
import p977zz.C20949l;
import q60.C19088b;
import r60.C19234e;
import r60.C19242g;

/* renamed from: e0.q0 */
public final /* synthetic */ class C4452q0 implements FeatureManager.C2369a, C1835u.C1836a, C5739k, C18028a.C18029a, C6271d, C20949l, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f15510b;

    public /* synthetic */ C4452q0(int i) {
        this.f15510b = i;
    }

    /* renamed from: a */
    public final C5735h[] mo19988a() {
        return new C5735h[]{new C6629e()};
    }

    public final Object apply(Object obj) {
        switch (this.f15510b) {
            case 2:
                C6269b bVar = C1835u.f6351g;
                return (List) C1835u.m5160w(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C6489b(1));
            case 3:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            default:
                C17746a0 a0Var = (C17746a0) obj;
                C18539a.f47201b.getClass();
                C19895d dVar = C18028a.f46139a;
                dVar.getClass();
                StringWriter stringWriter = new StringWriter();
                try {
                    dVar.mo52175a(stringWriter, a0Var);
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
        }
    }

    /* renamed from: b */
    public final C5735h[] mo252b(Uri uri, Map map) {
        return mo19988a();
    }

    /* renamed from: f */
    public final Object mo245f(JsonReader jsonReader) {
        C19895d dVar = C18028a.f46139a;
        C17809q.C17810a aVar = new C17809q.C17810a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(C18028a.m44701a(jsonReader));
                    }
                    jsonReader.endArray();
                    aVar.f45734c = new C17782b0<>(arrayList);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        aVar.f45732a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null name");
                    }
                case 2:
                    aVar.f45733b = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVar.mo50373a();
    }

    /* renamed from: i */
    public final void mo246i(boolean z) {
        C0115o oVar = C0115o.f331a;
        if (z) {
            int i = C2348n.f8560a;
            Class<C2348n> cls = C2348n.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    FetchedAppSettingsManager.f8596e.add(new C2343m());
                    FetchedAppSettingsManager.m6262c();
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }
    }

    public final boolean invoke(Object obj) {
        switch (this.f15510b) {
            case 9:
                int i = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45412G0();
                return false;
            case 10:
                int i2 = C15101a.f38810T;
                ((C15101a.C15108g) obj).mo45414H();
                return false;
            case 12:
                String str = TodRideRatingDialogFragment.f40018q;
                ((TodRideRatingDialogFragment.C15454b) obj).mo46193i0();
                return false;
            case 13:
                int i3 = SearchLineFragment.f41623w;
                ((C18504a) obj).mo48146G();
                return true;
            case 14:
                PaymentGatewayFragment paymentGatewayFragment = (PaymentGatewayFragment) obj;
                int i4 = C16328a.f42681h;
                paymentGatewayFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "split_payment");
                paymentGatewayFragment.mo46797j2(aVar.mo49933a());
                paymentGatewayFragment.mo46786U1(PaymentGatewayFragment.C16322a.class, new C0114n(16));
                return false;
            case 15:
                int i5 = C19088b.f48519z;
                ((C19088b.C19091c) obj).mo51524p1();
                return true;
            default:
                C19234e eVar = (C19234e) obj;
                int i6 = C19242g.f48870h;
                PinCodeView pinCodeView = eVar.f48846D;
                if (pinCodeView != null) {
                    eVar.mo51654n2(pinCodeView.getPinCode(), true);
                }
                return true;
        }
    }

    public final Task then(Object obj) {
        Object obj2;
        switch (this.f15510b) {
            case 11:
                List list = (List) obj;
                C18443f fVar = C18443f.f47013e;
                if (list != null) {
                    obj2 = C13723g.m34282c(list, new C18583d(4));
                } else {
                    obj2 = Collections.emptyList();
                }
                return Tasks.forResult(obj2);
            default:
                return Tasks.forResult(((LocationDescriptor) obj).mo24313f());
        }
    }
}
