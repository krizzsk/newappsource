package l40;

import android.content.Context;
import com.moovit.itinerary.model.ItinerarySection;
import com.moovit.itinerary.model.ItinerarySectionBranding;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.network.model.ServerId;
import com.moovit.tripplanner.TripPlannerSortType;
import java.util.Collections;
import p824tp.C19746x;

/* renamed from: l40.e */
public final class C5617e {
    /* renamed from: a */
    public static TripPlanConfig m13872a(Context context) {
        return new TripPlanConfig(Collections.singletonList(new ItinerarySection(new ServerId(-1), ItinerarySection.Type.UNSPECIFIED, (TripPlannerSortType) null, context.getString(C19746x.offline_section_name), Integer.MAX_VALUE, true, (ItinerarySectionBranding) null)), false);
    }
}
