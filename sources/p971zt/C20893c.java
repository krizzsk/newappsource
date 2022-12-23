package p971zt;

import ce0.C21100e;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;

/* renamed from: zt.c */
public final class C20893c {

    /* renamed from: a */
    public final TransitStop f52639a;

    /* renamed from: b */
    public final TransitLine f52640b;

    /* renamed from: c */
    public final Schedule f52641c;

    /* renamed from: d */
    public final Time f52642d;

    /* renamed from: e */
    public final int f52643e;

    /* renamed from: f */
    public final int f52644f;

    /* renamed from: g */
    public final LineServiceAlertDigest f52645g;

    public C20893c(TransitStop transitStop, TransitLine transitLine, Schedule schedule, Time time, int i, int i2, LineServiceAlertDigest lineServiceAlertDigest) {
        C21100e.m49373x(transitStop, "stop");
        this.f52639a = transitStop;
        C21100e.m49373x(transitLine, "line");
        this.f52640b = transitLine;
        this.f52641c = schedule;
        this.f52642d = time;
        this.f52643e = i;
        this.f52644f = i2;
        this.f52645g = lineServiceAlertDigest;
    }
}
