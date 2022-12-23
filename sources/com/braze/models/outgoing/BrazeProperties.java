package com.braze.models.outgoing;

import androidx.annotation.Keep;
import com.appboy.models.outgoing.AppboyProperties;
import org.json.JSONObject;

@Keep
public class BrazeProperties extends AppboyProperties {
    public BrazeProperties() {
    }

    public BrazeProperties(JSONObject jSONObject) {
        super(jSONObject);
    }
}
