package p732pq;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverRequest;
import com.tranzmate.moovit.protocol.driverconnection.MVOperation;

/* renamed from: pq.p */
public final class C18956p extends C13778r<C18956p, C18957q, MVNotifyDriverRequest> {

    /* renamed from: w */
    public final String f48265w;

    /* renamed from: x */
    public final ServerId f48266x;

    /* renamed from: y */
    public final ServerId f48267y;

    /* renamed from: z */
    public final LongServerId f48268z;

    public C18956p(String str, C13752e eVar, ServerId serverId, ServerId serverId2, LongServerId longServerId) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_notify_driver, C18957q.class);
        C21100e.m49373x(str, "paymentContext");
        this.f48265w = str;
        C21100e.m49373x(serverId, "lineId");
        this.f48266x = serverId;
        C21100e.m49373x(serverId2, "stopId");
        this.f48267y = serverId2;
        C21100e.m49373x(longServerId, "tripId");
        this.f48268z = longServerId;
        int i = serverId.f15142b;
        int i2 = serverId2.f15142b;
        long j = longServerId.f15137b;
        MVOperation mVOperation = MVOperation.BOARDING;
        RO mVNotifyDriverRequest = new MVNotifyDriverRequest();
        mVNotifyDriverRequest.paymentContext = str;
        mVNotifyDriverRequest.lineId = i;
        mVNotifyDriverRequest.mo27149k();
        mVNotifyDriverRequest.stopId = i2;
        mVNotifyDriverRequest.mo27150l();
        mVNotifyDriverRequest.tripId = j;
        mVNotifyDriverRequest.mo27151m();
        mVNotifyDriverRequest.operation = mVOperation;
        this.f33922v = mVNotifyDriverRequest;
    }
}
