package p877vu;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.navigation.checkin.Checkin;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.EmissionLevel;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItineraryMetadata;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationPath;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.ServerIdMap;
import com.moovit.util.time.Time;
import f00.C16919g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p977zz.C20927a0;

/* renamed from: vu.c */
public final class C20233c {

    /* renamed from: a */
    public static C16919g.C16920a f51336a = new C16919g.C16920a("notification_toggle", true);

    /* renamed from: a */
    public static Itinerary m47800a(Navigable navigable, NavigationProgressEvent navigationProgressEvent) {
        int i;
        boolean z;
        Navigable navigable2 = navigable;
        NavigationProgressEvent navigationProgressEvent2 = navigationProgressEvent;
        C21100e.m49371w(navigable);
        if (navigable2 instanceof Checkin) {
            Checkin checkin = (Checkin) navigable2;
            if (navigationProgressEvent2 != null) {
                i = navigationProgressEvent2.f15113d;
            } else {
                List<NavigationPath> list = checkin.f39137n.f15055c;
                int i2 = 0;
                while (true) {
                    if (list.get(i2).f15067g.contains(checkin.f39137n.f15056d)) {
                        break;
                    }
                    i2++;
                }
                i = i2;
            }
            Time time = new Time(checkin.f39133j);
            Time time2 = new Time(checkin.mo19642k0(navigationProgressEvent2));
            String str = checkin.f39131h;
            ServerIdMap<TransitStop> serverIdMap = checkin.f39136m;
            NavigationPath navigationPath = checkin.f39137n.f15055c.get(i);
            List<ServerId> list2 = navigationPath.f15065e;
            List<ServerId> subList = list2.subList(0, Math.min(list2.lastIndexOf(checkin.f39137n.f15056d) + 1, list2.size()));
            ArrayList arrayList = new ArrayList(subList.size());
            for (ServerId serverId : subList) {
                arrayList.add(DbEntityRef.newTransitStopRef((TransitStop) serverIdMap.get(serverId)));
            }
            TransitLineLeg transitLineLeg = new TransitLineLeg(time, time2, DbEntityRef.newTransitLineRef(checkin.f39132i), arrayList, navigationPath.f15063c, (CurrencyAmount) null, (LongServerId) null);
            if ((transitLineLeg.mo48460c().get().f23745q.f23627b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            return new Itinerary(str, new ItineraryMetadata((String) null, (ServerId) null, 0, (String) null, (CurrencyAmount) null, false, false, false, z, (EmissionLevel) null, (String) null), Collections.singletonList(transitLineLeg));
        }
        Itinerary itinerary = ((ItineraryNavigable) navigable2).f39149j;
        return new Itinerary(itinerary.f41894b, itinerary.f41895c, new ArrayList(itinerary.mo48295u0()));
    }

    /* renamed from: b */
    public static boolean m47801b(Context context) {
        return f51336a.mo19759a(context.getSharedPreferences("ride_preferences", 0)).booleanValue();
    }

    /* renamed from: c */
    public static void m47802c(MoovitAppActivity moovitAppActivity, LatLonE6 latLonE6) {
        if (!C20927a0.m49017l(moovitAppActivity, new Intent("android.intent.action.VIEW", Uri.parse("waze://").buildUpon().appendQueryParameter("ll", latLonE6.mo46922k() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + latLonE6.mo46926o()).appendQueryParameter("navigate", "yes").build()))) {
            StringBuilder k = C13555b.m33972k("google.navigation:q=");
            k.append(latLonE6.mo46925n());
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(latLonE6.mo46927q());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(k.toString()));
            intent.setPackage("com.google.android.apps.maps");
            C20927a0.m49017l(moovitAppActivity, intent);
        }
    }
}
