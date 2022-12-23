package p429cw;

import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf0.C24362h;

/* renamed from: cw.g */
public final class C16517g {

    /* renamed from: a */
    public final TransitStop f43128a;

    /* renamed from: b */
    public final Map<ServerId, Map<LongServerId, List<Time>>> f43129b;

    /* renamed from: c */
    public final Map<String, Time> f43130c;

    public C16517g(TransitStop transitStop, LinkedHashMap linkedHashMap, Map map) {
        this.f43128a = transitStop;
        this.f43129b = linkedHashMap;
        this.f43130c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16517g)) {
            return false;
        }
        C16517g gVar = (C16517g) obj;
        return C24362h.m61206a(this.f43128a, gVar.f43128a) && C24362h.m61206a(this.f43129b, gVar.f43129b) && C24362h.m61206a(this.f43130c, gVar.f43130c);
    }

    public final int hashCode() {
        int hashCode = this.f43129b.hashCode();
        return this.f43130c.hashCode() + ((hashCode + (this.f43128a.f23730b.f15142b * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TripsResult(stop=");
        k.append(this.f43128a);
        k.append(", state=");
        k.append(this.f43129b);
        k.append(", vehicleArrivals=");
        k.append(this.f43130c);
        k.append(')');
        return k.toString();
    }
}
