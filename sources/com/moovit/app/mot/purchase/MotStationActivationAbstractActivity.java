package com.moovit.app.mot.purchase;

import a00.C13382a;
import android.widget.TextView;
import b00.C13556a;
import c70.C13751d;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.AlertMessageView;
import com.moovit.location.C16202a;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import p242s1.C6333d0;
import p297w5.C6996c;
import p543hq.C17474b;
import p736pu.C18996e;
import p757qu.C19181d;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

public abstract class MotStationActivationAbstractActivity<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f39032Y = 0;

    /* renamed from: U */
    public final C15158a f39033U = new C15158a();

    /* renamed from: X */
    public C13556a f39034X = null;

    /* renamed from: com.moovit.app.mot.purchase.MotStationActivationAbstractActivity$a */
    public class C15158a extends C20438i<RQ, RS> {
        public C15158a() {
        }

        /* renamed from: a */
        public final void mo313a(RQ rq, boolean z) {
            MotStationActivationAbstractActivity.this.f39034X = null;
        }

        /* renamed from: k */
        public final void mo21408k(RQ rq, RS rs) {
            MotStationActivationAbstractActivity.this.mo45594z2(rq, rs);
        }

        /* renamed from: w */
        public final boolean mo21415w(RQ rq, Exception exc) {
            if (exc instanceof UserRequestError) {
                UserRequestError userRequestError = (UserRequestError) exc;
                MotStationActivationAbstractActivity motStationActivationAbstractActivity = MotStationActivationAbstractActivity.this;
                String d = userRequestError.mo49162d();
                String c = userRequestError.mo49161c();
                int i = MotStationActivationAbstractActivity.f39032Y;
                motStationActivationAbstractActivity.mo45592C2(d, c, "mot_station_location_no_train_nearby");
                return true;
            }
            MotStationActivationAbstractActivity motStationActivationAbstractActivity2 = MotStationActivationAbstractActivity.this;
            motStationActivationAbstractActivity2.mo44530n2(C13751d.m34341b(motStationActivationAbstractActivity2, (String) null, exc));
            return true;
        }
    }

    /* renamed from: A2 */
    public final void mo45590A2(String str, MotNearestStationInfo motNearestStationInfo) {
        ServerId serverId;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_impression");
        aVar.mo49939g(AnalyticsAttributeKey.STATE, str);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.STOP_ID;
        if (motNearestStationInfo != null) {
            serverId = motNearestStationInfo.f39023b.f23730b;
        } else {
            serverId = null;
        }
        aVar.mo49943k(analyticsAttributeKey, serverId);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: B2 */
    public final void mo45591B2() {
        setContentView((int) R.layout.mot_station_activation_loading_activity);
        TextView x2 = mo44549x2(R.id.title);
        C6333d0.m15030r(x2, true);
        C13382a.m33665a(x2, x2.getText());
        C13556a aVar = this.f39034X;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39034X = null;
        }
        LocationSettingsFixer.C16198a aVar2 = new LocationSettingsFixer.C16198a((MoovitActivity) this);
        aVar2.f42260g = true;
        aVar2.mo48528a(new C19181d(this, 0));
    }

    /* renamed from: C2 */
    public final void mo45592C2(String str, String str2, String str3) {
        setContentView((int) R.layout.mot_station_error_activity);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.alert_message);
        alertMessageView.setTitle((CharSequence) str);
        alertMessageView.setSubtitle((CharSequence) str2);
        alertMessageView.setPositiveButton((int) R.string.action_try_again);
        alertMessageView.setPositiveButtonClickListener(new C6996c(this, 21));
        mo45590A2(str3, (MotNearestStationInfo) null);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo45591B2();
    }

    /* renamed from: i2 */
    public void mo19427i2() {
        super.mo19427i2();
        C13556a aVar = this.f39034X;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39034X = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: y2 */
    public abstract C18996e mo45593y2(LatLonE6 latLonE6);

    /* renamed from: z2 */
    public abstract void mo45594z2(RQ rq, RS rs);
}
