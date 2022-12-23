package com.moovit.map.collections.category;

import ce0.C21100e;
import p824tp.C19746x;

public enum CategoryMapItemSource {
    COMMERCIAL(C19746x.api_path_map_items_commercials, "0"),
    BICYCLE_STATION(C19746x.api_path_map_items_bicycle_stations, "0"),
    BICYCLE_REPAIR(C19746x.api_path_map_items_bicycle_repair, "0"),
    DOCKLESS_BICYCLE(C19746x.api_path_map_items_dockless_bicycles, "0"),
    DOCKLESS_KICK_SCOOTER(C19746x.api_path_map_items_dockless_kick_scooters, "0"),
    DOCKLESS_ELECTRIC_SCOOTER(C19746x.api_path_map_items_dockless_electric_scooters, "0"),
    DOCKLESS_ELECTRIC_MOPED(C19746x.api_path_map_items_dockless_electric_mopeds, "0"),
    DOCKLESS_CAR(C19746x.api_path_map_items_dockless_cars, "0"),
    CAR_SHARING(C19746x.api_path_map_items_car_sharing, "0"),
    PARKING_LOTS(C19746x.api_path_map_items_parking_lots, "0"),
    DIRECT_AD(C19746x.api_path_map_items_direct_ads, "0");
    
    private final String protocolVersion;
    private final int urlResId;

    private CategoryMapItemSource(int i, String str) {
        this.urlResId = i;
        C21100e.m49373x(str, "protocolVersion");
        this.protocolVersion = str;
    }

    public final String getId() {
        StringBuilder k = C13555b.m33972k("category_map_item_");
        k.append(name());
        return k.toString();
    }

    public final String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int getUrlResId() {
        return this.urlResId;
    }
}
