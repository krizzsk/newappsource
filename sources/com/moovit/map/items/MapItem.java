package com.moovit.map.items;

import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ImageSet;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import p762qz.C19206b;
import p824tp.C19746x;

public final class MapItem implements C5384a, C19206b {

    /* renamed from: b */
    public final Type f42549b;

    /* renamed from: c */
    public final ServerId f42550c;

    /* renamed from: d */
    public final LatLonE6 f42551d;

    /* renamed from: e */
    public final ImageSet f42552e;

    public enum Type {
        STOP(C19746x.api_path_stop_items_request_path);
        
        private final int serviceNameResourceId;

        private Type(int i) {
            this.serviceNameResourceId = i;
        }

        public int getServiceNameResourceId() {
            return this.serviceNameResourceId;
        }
    }

    public MapItem(Type type, ServerId serverId, LatLonE6 latLonE6, ImageSet imageSet) {
        C21100e.m49373x(type, "type");
        this.f42549b = type;
        this.f42550c = serverId;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f42551d = latLonE6;
        C21100e.m49373x(imageSet, "iconSet");
        this.f42552e = imageSet;
    }

    public final LatLonE6 getLocation() {
        return this.f42551d;
    }

    public final ServerId getServerId() {
        return this.f42550c;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("MapItem[Type=");
        k.append(this.f42549b);
        k.append(", Id=");
        k.append(this.f42550c);
        k.append(" Location=");
        k.append(this.f42551d);
        k.append("]");
        return k.toString();
    }
}
