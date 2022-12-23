package w20;

import android.location.Location;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;
import com.tranzmate.moovit.protocol.tripplanner.MVStopIdLoaction;
import com.tranzmate.moovit.protocol.tripplanner.MVWalkPolylineRequest;
import p824tp.C19746x;

/* renamed from: w20.b */
public final class C20275b extends C13778r<C20275b, C20276c, MVWalkPolylineRequest> {

    /* renamed from: w */
    public final String f51409w;

    public C20275b(C13752e eVar, Location location, ServerId serverId) {
        super(eVar, C19746x.api_path_walking_polyline_request_path, C20276c.class);
        this.f51409w = C20275b.class.getSimpleName() + "_" + location.getLatitude() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + location.getLongitude() + "_" + serverId;
        MVGpsLocation t = C13749c.m34334t(location);
        int i = serverId.f15142b;
        MVStopIdLoaction mVStopIdLoaction = new MVStopIdLoaction();
        mVStopIdLoaction.setField_ = MVStopIdLoaction._Fields.STOP_ID;
        mVStopIdLoaction.value_ = Integer.valueOf(i);
        this.f33922v = new MVWalkPolylineRequest(t, mVStopIdLoaction);
    }

    public C20275b(C13752e eVar, Location location, Location location2) {
        super(eVar, C19746x.api_path_walking_polyline_request_path, C20276c.class);
        this.f51409w = C20275b.class.getSimpleName() + "_" + location.getLatitude() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + location.getLongitude() + "_" + location2.getLatitude() + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + location2.getLongitude();
        MVGpsLocation t = C13749c.m34334t(location);
        MVGpsLocation t2 = C13749c.m34334t(location2);
        MVStopIdLoaction mVStopIdLoaction = new MVStopIdLoaction();
        t2.getClass();
        mVStopIdLoaction.setField_ = MVStopIdLoaction._Fields.LOCATION;
        mVStopIdLoaction.value_ = t2;
        this.f33922v = new MVWalkPolylineRequest(t, mVStopIdLoaction);
    }
}
