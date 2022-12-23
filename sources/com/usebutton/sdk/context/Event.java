package com.usebutton.sdk.context;

import android.net.Uri;
import com.appboy.models.outgoing.FacebookUser;
import com.usebutton.sdk.internal.models.BaseEntity;
import com.usebutton.sdk.internal.util.ButtonUtil;
import java.util.Date;
import org.json.JSONObject;

public class Event extends BaseEntity {
    public Event(String str) {
        setValue("name", str);
    }

    public String getType() {
        return "event";
    }

    public Event setEnd(Date date) {
        setValue("date_end", ButtonUtil.isoFormat(date));
        return this;
    }

    public Event setLocation(Location location) {
        setValue(FacebookUser.LOCATION_OUTER_OBJECT_KEY, (BaseEntity) location);
        return this;
    }

    public Event setStart(Date date) {
        setValue("date_start", ButtonUtil.isoFormat(date));
        return this;
    }

    public Event setUrl(Uri uri) {
        setValue("url", uri.toString());
        return this;
    }

    public Event(JSONObject jSONObject) {
        super(jSONObject);
    }
}
