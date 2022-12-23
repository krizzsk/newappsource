package p828tt;

import android.content.Context;
import c00.C13723g;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import java.io.IOException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import p372at.C13514a;
import p646lz.C18299a;
import p929xy.C20663f;
import v90.C13187a;

/* renamed from: tt.g */
public final class C19766g extends C20663f<C19764e> {

    /* renamed from: c */
    public static final EnumSet<TripPlannerTransportType> f50252c;

    /* renamed from: d */
    public static final EnumSet<TripPlannerTransportType> f50253d;

    static {
        EnumSet<TripPlannerTransportType> of = EnumSet.of(TripPlannerTransportType.TRAM, new TripPlannerTransportType[]{TripPlannerTransportType.SUBWAY, TripPlannerTransportType.TRAIN, TripPlannerTransportType.BUS, TripPlannerTransportType.FERRY, TripPlannerTransportType.CABLE, TripPlannerTransportType.GONDOLA, TripPlannerTransportType.FUNICULAR});
        f50252c = of;
        f50253d = EnumSet.complementOf(of);
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("TRIP_PLANNER_CONFIGURATION");
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        C13187a aVar2 = (C13187a) aVar.mo50690c("TRIP_PLANNER_CONFIGURATION");
        if (aVar2 == null) {
            return null;
        }
        List<TripPlannerTransportTypeInfo> list = aVar2.f32742c;
        return new C19764e(C13723g.m34282c(list, new C13514a(2)), C13723g.m34282c(list, new C19765f(0)));
    }
}
