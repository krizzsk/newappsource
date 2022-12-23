package j80;

import ce0.C21100e;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.util.ServerIdMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: j80.b */
public final class C12773b {

    /* renamed from: a */
    public final ServerId f31565a;

    /* renamed from: b */
    public final long f31566b;

    /* renamed from: c */
    public final List<C12774c> f31567c;

    /* renamed from: d */
    public final List<ServerId> f31568d;

    /* renamed from: e */
    public final Map<ServerId, List<LineServiceAlertDigest>> f31569e;

    /* renamed from: f */
    public final Map<ServerId, List<C12774c>> f31570f;

    /* renamed from: g */
    public final Map<ServerId, List<LineServiceAlertDigest>> f31571g;

    /* renamed from: h */
    public final Map<ServerId, SearchLineItem> f31572h;

    public C12773b(ServerId serverId, long j, ArrayList arrayList, ArrayList arrayList2, ServerIdMap serverIdMap, ServerIdMap serverIdMap2, ServerIdMap serverIdMap3, HashMap hashMap) {
        C21100e.m49373x(serverId, "metroId");
        this.f31565a = serverId;
        this.f31566b = j;
        this.f31567c = Collections.unmodifiableList(arrayList);
        this.f31568d = Collections.unmodifiableList(arrayList2);
        this.f31569e = Collections.unmodifiableMap(serverIdMap);
        this.f31570f = Collections.unmodifiableMap(serverIdMap2);
        this.f31571g = Collections.unmodifiableMap(serverIdMap3);
        this.f31572h = Collections.unmodifiableMap(hashMap);
    }
}
