package p805su;

import android.os.Parcelable;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.gateway.PaymentGatewayToken;
import java.util.List;
import l30.C5577i;
import p824tp.C19728f;
import p829tu.C19785p;
import q00.C19047a;
import t30.C6571k;

/* renamed from: su.n */
public final /* synthetic */ class C19558n implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f49711b;

    /* renamed from: c */
    public final /* synthetic */ Object f49712c;

    /* renamed from: d */
    public final /* synthetic */ Object f49713d;

    /* renamed from: e */
    public final /* synthetic */ Object f49714e;

    /* renamed from: f */
    public final /* synthetic */ Parcelable f49715f;

    public /* synthetic */ C19558n(Object obj, Object obj2, Object obj3, Parcelable parcelable, int i) {
        this.f49711b = i;
        this.f49712c = obj;
        this.f49713d = obj2;
        this.f49714e = obj3;
        this.f49715f = parcelable;
    }

    public final Task then(Object obj) {
        switch (this.f49711b) {
            case 0:
                int i = C19560p.f49719q;
                return Tasks.call(MoovitExecutors.f37327IO, new C19785p((C13752e) this.f49712c, (C19728f) this.f49713d, (C19047a) this.f49714e, (MotQrCodeScanResult) this.f49715f, (List) obj));
            default:
                PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) this.f49713d;
                LatLonE6 latLonE6 = (LatLonE6) this.f49715f;
                C13752e eVar = (C13752e) obj;
                C5577i iVar = C5577i.f18275d;
                return Tasks.call(MoovitExecutors.f37327IO, new C6571k(latLonE6, paymentGatewayToken, eVar, (String) this.f49712c, (String) this.f49714e));
        }
    }
}
