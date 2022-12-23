package com.appboy.models.outgoing;

import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class AttributionData implements IPutIntoJson<JSONObject> {
    public static final String ADGROUP_KEY = "adgroup";
    public static final String CAMPAIGN_KEY = "campaign";
    public static final String CREATIVE_KEY = "ad";
    public static final String NETWORK_KEY = "source";
    public static final String TAG = AppboyLogger.getBrazeLogTag(AttributionData.class);
    public final String mAdGroup;
    public final String mCampaign;
    public final String mCreative;
    public final String mNetwork;

    public AttributionData(String str, String str2, String str3, String str4) {
        this.mNetwork = str;
        this.mCampaign = str2;
        this.mAdGroup = str3;
        this.mCreative = str4;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isNullOrBlank(this.mNetwork)) {
                jSONObject.put("source", this.mNetwork);
            }
            if (!StringUtils.isNullOrBlank(this.mCampaign)) {
                jSONObject.put(CAMPAIGN_KEY, this.mCampaign);
            }
            if (!StringUtils.isNullOrBlank(this.mAdGroup)) {
                jSONObject.put(ADGROUP_KEY, this.mAdGroup);
            }
            if (!StringUtils.isNullOrBlank(this.mCreative)) {
                jSONObject.put(CREATIVE_KEY, this.mCreative);
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught exception creating AttributionData Json.", e);
        }
        return jSONObject;
    }
}
