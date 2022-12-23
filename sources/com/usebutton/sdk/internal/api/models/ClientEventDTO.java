package com.usebutton.sdk.internal.api.models;

import com.usebutton.sdk.internal.util.ButtonUtil;
import java.util.Date;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class ClientEventDTO {
    private String mEventName;
    private JSONObject mEventProperties;
    private int mSequenceNumber;
    private String mTime;
    private String mUuid;

    public ClientEventDTO(String str, JSONObject jSONObject, int i, UUID uuid, String str2) {
        this.mEventName = str;
        this.mEventProperties = jSONObject;
        this.mSequenceNumber = i;
        this.mUuid = uuid.toString();
        this.mTime = str2;
    }

    public String getName() {
        return this.mEventName;
    }

    public JSONObject getProperties() {
        return this.mEventProperties;
    }

    public int getSequenceNumber() {
        return this.mSequenceNumber;
    }

    public String getTime() {
        return this.mTime;
    }

    public String getUuid() {
        return this.mUuid;
    }

    public void setSequenceNumber(int i) {
        this.mSequenceNumber = i;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.mEventName);
            jSONObject.put("value", this.mEventProperties);
            jSONObject.put("seqn", this.mSequenceNumber);
            jSONObject.put("uuid", this.mUuid);
            jSONObject.put("time", this.mTime);
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String toString() {
        return toJsonObject().toString();
    }

    public ClientEventDTO(String str, JSONObject jSONObject, UUID uuid) {
        this.mEventName = str;
        this.mEventProperties = jSONObject;
        this.mUuid = uuid.toString();
        this.mTime = ButtonUtil.isoFormat(new Date());
    }
}
