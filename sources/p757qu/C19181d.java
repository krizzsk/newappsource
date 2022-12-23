package p757qu;

import android.location.Location;
import android.net.Uri;
import android.widget.Button;
import com.moovit.app.mot.purchase.MotStationActivationAbstractActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.map.items.MapItem;
import com.moovit.payment.clearance.tokenization.TokenizeStatus;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import java.util.Set;
import m50.C18330f;
import p713ov.C18837f;
import p736pu.C18996e;
import p977zz.C20935e;
import p977zz.C20961r;

/* renamed from: qu.d */
public final /* synthetic */ class C19181d implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f48768b;

    /* renamed from: c */
    public final /* synthetic */ Object f48769c;

    public /* synthetic */ C19181d(Object obj, int i) {
        this.f48768b = i;
        this.f48769c = obj;
    }

    public final void invoke(Object obj) {
        boolean z = true;
        switch (this.f48768b) {
            case 0:
                MotStationActivationAbstractActivity motStationActivationAbstractActivity = (MotStationActivationAbstractActivity) this.f48769c;
                C20961r rVar = (C20961r) obj;
                int i = MotStationActivationAbstractActivity.f39032Y;
                motStationActivationAbstractActivity.getClass();
                T t = rVar.f52712b;
                if (t == null || ((Location) t).isFromMockProvider()) {
                    motStationActivationAbstractActivity.mo45592C2(motStationActivationAbstractActivity.getString(R.string.payment_mot_train_no_location_error_title), motStationActivationAbstractActivity.getString(R.string.payment_mot_train_no_location_error_subtitle), "mot_station_location_no_gps");
                    return;
                }
                C18996e y2 = motStationActivationAbstractActivity.mo45593y2(LatLonE6.m40177j((Location) rVar.f52712b));
                RequestOptions requestOptions = new RequestOptions();
                requestOptions.f42909f = true;
                motStationActivationAbstractActivity.f39034X = motStationActivationAbstractActivity.mo44527k2("get_nearest_stop", y2, requestOptions, motStationActivationAbstractActivity.f39033U);
                return;
            case 1:
                Button button = ((C18837f) this.f48769c).f47963r;
                if (((C18837f.C18839b) obj).f47966h == -1) {
                    z = false;
                }
                button.setEnabled(z);
                return;
            case 2:
                ((MapFragment) this.f48769c).f42368n.mo48808p().mo51062a(MapItem.class, (Set) obj);
                return;
            default:
                C18330f fVar = (C18330f) this.f48769c;
                TokenizeStatus tokenizeStatus = (TokenizeStatus) obj;
                int i2 = C18330f.f46743w;
                if (fVar.isAdded() && tokenizeStatus == TokenizeStatus.SUCCESS) {
                    fVar.mo51515p2(Uri.parse(fVar.f48511p.f42777b));
                    return;
                }
                return;
        }
    }
}
