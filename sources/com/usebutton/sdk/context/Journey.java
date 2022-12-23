package com.usebutton.sdk.context;

import android.net.Uri;
import com.usebutton.sdk.internal.models.BaseEntity;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public class Journey extends BaseEntity {

    public enum Type {
        FLIGHT,
        TRAIN,
        BUS,
        CAR,
        WALKING,
        SUBWAY,
        BOAT,
        SPACESHIP
    }

    public Journey() {
    }

    public String getType() {
        return "journey";
    }

    public Journey setDestination(Location location) {
        setValue("destination_location", (BaseEntity) location);
        return this;
    }

    public Journey setEnd(Date date) {
        setValue("date_end", ButtonUtil.isoFormat(date));
        return this;
    }

    public Journey setName(String str) {
        setValue("name", str);
        return this;
    }

    public Journey setSku(String str) {
        setValue("sku", str);
        return this;
    }

    public Journey setStart(Location location) {
        setValue("start_location", (BaseEntity) location);
        return this;
    }

    public Journey setType(Type type) {
        setValue("transport_type", type.toString().toLowerCase(Locale.US));
        return this;
    }

    public Journey setUrl(Uri uri) {
        setValue("url", uri.toString());
        return this;
    }

    public Journey(JSONObject jSONObject) {
        super(jSONObject);
    }

    public Journey setStart(Date date) {
        setValue("date_start", ButtonUtil.isoFormat(date));
        return this;
    }
}
