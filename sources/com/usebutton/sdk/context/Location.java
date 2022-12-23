package com.usebutton.sdk.context;

import com.appboy.models.outgoing.FacebookUser;
import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.models.BaseEntity;
import org.json.JSONObject;

public class Location extends BaseEntity {
    public static final String KEY_LATITUDE = "latitude";
    public static final String KEY_LONGITUDE = "longitude";

    public Location(double d, double d2) {
        this((String) null, d, d2);
    }

    public String getType() {
        return FacebookUser.LOCATION_OUTER_OBJECT_KEY;
    }

    public Location setAddress(String str) {
        setValue("address_line", str);
        return this;
    }

    public Location setCity(String str) {
        setValue("city", str);
        return this;
    }

    public Location setCountry(String str) {
        setValue(ServerParameters.COUNTRY, str);
        return this;
    }

    public Location setLocation(double d, double d2) {
        setValue("latitude", d);
        setValue("longitude", d2);
        return this;
    }

    public Location setName(String str) {
        setValue("name", str);
        return this;
    }

    public Location setState(String str) {
        setValue("state", str);
        return this;
    }

    public Location setZip(String str) {
        setValue("zip", str);
        return this;
    }

    public Location(String str, double d, double d2) {
        if (str != null) {
            setName(str);
        }
        setLocation(d, d2);
    }

    public Location(String str, String str2, String str3, String str4) {
        setAddress(str);
        setCity(str2);
        setState(str3);
        setCountry(str4);
    }

    public Location(String str) {
        setName(str);
    }

    public Location(android.location.Location location) {
        this(location.getLatitude(), location.getLongitude());
    }

    public Location(JSONObject jSONObject) {
        super(jSONObject);
    }
}
