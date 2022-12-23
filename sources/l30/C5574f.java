package l30;

import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import n30.C5847a;
import t30.C6559a;

/* renamed from: l30.f */
public final /* synthetic */ class C5574f implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ ServerId f18267b;

    /* renamed from: c */
    public final /* synthetic */ String f18268c;

    /* renamed from: d */
    public final /* synthetic */ C5847a f18269d;

    /* renamed from: e */
    public final /* synthetic */ LatLonE6 f18270e;

    public /* synthetic */ C5574f(ServerId serverId, String str, C5847a aVar, LatLonE6 latLonE6) {
        this.f18267b = serverId;
        this.f18268c = str;
        this.f18269d = aVar;
        this.f18270e = latLonE6;
    }

    public final Task then(Object obj) {
        ServerId serverId = this.f18267b;
        String str = this.f18268c;
        return Tasks.call(MoovitExecutors.f37327IO, new C6559a(this.f18270e, this.f18269d, serverId, (C13752e) obj, str));
    }
}
