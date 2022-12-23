package p785ry;

import ce0.C21100e;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.app.wondo.tickets.model.WondoCode;
import com.moovit.app.wondo.tickets.model.WondoOffer;
import com.moovit.app.wondo.tickets.model.WondoRewards;
import com.moovit.network.model.ServerId;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p977zz.C20944i0;

/* renamed from: ry.a */
public final class C19381a {

    /* renamed from: a */
    public final ServerId f49303a;

    /* renamed from: b */
    public final List<WondoOffer> f49304b;

    /* renamed from: c */
    public final List<WondoCode> f49305c;

    /* renamed from: d */
    public final WondoRewards f49306d;

    /* renamed from: e */
    public final Map<String, WondoCampaign> f49307e;

    /* renamed from: f */
    public final C20944i0<String, String> f49308f;

    public C19381a(ServerId serverId, List<WondoOffer> list, List<WondoCode> list2, WondoRewards wondoRewards, Map<String, WondoCampaign> map, C20944i0<String, String> i0Var) {
        C21100e.m49373x(serverId, "metroId");
        this.f49303a = serverId;
        C21100e.m49373x(list, "offers");
        this.f49304b = Collections.unmodifiableList(list);
        C21100e.m49373x(list2, "codes");
        this.f49305c = Collections.unmodifiableList(list2);
        this.f49306d = wondoRewards;
        C21100e.m49373x(map, "campaignsByLabel");
        this.f49307e = map;
        this.f49308f = i0Var;
    }
}
