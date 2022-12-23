package k80;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.serviceAlerts.MVGetServiceAlertsByLinesRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p066e0.C4454r0;
import p824tp.C19746x;
import q00.C19047a;
import q00.C19053d;

/* renamed from: k80.k */
public final class C12817k extends C13778r<C12817k, C12818l, MVGetServiceAlertsByLinesRequest> {

    /* renamed from: w */
    public final List<ServerId> f31680w;

    public C12817k(C13752e eVar, ArrayList arrayList) {
        super(eVar, C19746x.api_path_service_alerts_by_line_groups, C12818l.class);
        this.f31680w = arrayList;
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C4454r0(22));
        RO mVGetServiceAlertsByLinesRequest = new MVGetServiceAlertsByLinesRequest();
        mVGetServiceAlertsByLinesRequest.lineGroupIds = c;
        this.f33922v = mVGetServiceAlertsByLinesRequest;
    }

    /* renamed from: E */
    public final List<C12818l> mo21059E() throws IOException, ServerException {
        boolean z;
        C19047a a = C19047a.m46164a(this.f51759b.getApplicationContext());
        if (a == null || ((Integer) a.mo51505b(C19053d.f48485x)).intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList((C12818l) mo40056C());
    }
}
