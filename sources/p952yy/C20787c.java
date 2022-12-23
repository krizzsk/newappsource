package p952yy;

import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitPatternShape;
import com.moovit.util.time.StopRealTimeInformation;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import p583jk.C17884p;
import p977zz.C20975x0;

/* renamed from: yy.c */
public final class C20787c {

    /* renamed from: a */
    public final ServerId f52456a;

    /* renamed from: b */
    public final ServerId f52457b;

    /* renamed from: c */
    public final Schedule f52458c;

    /* renamed from: d */
    public final StopRealTimeInformation f52459d;

    /* renamed from: e */
    public final Map<ServerId, TransitPatternShape> f52460e;

    /* renamed from: yy.c$a */
    public static class C20788a implements Comparator<C20787c> {

        /* renamed from: b */
        public final Comparator<Schedule> f52461b;

        public C20788a(Schedule.C7799d dVar) {
            this.f52461b = dVar;
        }

        public final int compare(Object obj, Object obj2) {
            return this.f52461b.compare(((C20787c) obj).f52458c, ((C20787c) obj2).f52458c);
        }
    }

    public C20787c(ServerId serverId, ServerId serverId2, Schedule schedule, StopRealTimeInformation stopRealTimeInformation, Map<ServerId, TransitPatternShape> map) {
        Map<ServerId, TransitPatternShape> map2;
        C21100e.m49373x(serverId, "lineId");
        this.f52456a = serverId;
        C21100e.m49373x(serverId2, "stopId");
        this.f52457b = serverId2;
        C21100e.m49373x(schedule, "schedule");
        this.f52458c = schedule;
        this.f52459d = stopRealTimeInformation;
        if (map != null) {
            map2 = Collections.unmodifiableMap(map);
        } else {
            map2 = Collections.emptyMap();
        }
        this.f52460e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20787c)) {
            return false;
        }
        C20787c cVar = (C20787c) obj;
        if (!this.f52456a.equals(cVar.f52456a) || !this.f52457b.equals(cVar.f52457b) || !this.f52458c.equals(cVar.f52458c) || !C20975x0.m49118e(this.f52459d, cVar.f52459d) || !this.f52460e.equals(cVar.f52460e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52456a), C17884p.m44335F(this.f52457b), C17884p.m44335F(this.f52458c), C17884p.m44335F(this.f52459d), C17884p.m44335F(this.f52460e));
    }
}
