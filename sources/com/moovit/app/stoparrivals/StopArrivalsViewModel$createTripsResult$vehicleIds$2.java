package com.moovit.app.stoparrivals;

import com.moovit.util.time.Time;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"<anonymous>", "", "it", "Lcom/moovit/util/time/Time;", "invoke", "(Lcom/moovit/util/time/Time;)Ljava/lang/Boolean;"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StopArrivalsViewModel$createTripsResult$vehicleIds$2 extends Lambda implements C24236l<Time, Boolean> {

    /* renamed from: f */
    public static final StopArrivalsViewModel$createTripsResult$vehicleIds$2 f39622f = new StopArrivalsViewModel$createTripsResult$vehicleIds$2();

    public StopArrivalsViewModel$createTripsResult$vehicleIds$2() {
        super(1);
    }

    public final Object invoke(Object obj) {
        boolean z;
        Time time = (Time) obj;
        C24362h.m61211f(time, "it");
        if (time.f23912m != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
