package com.usebutton.sdk.context;

import com.usebutton.sdk.internal.models.BaseEntity;
import org.json.JSONObject;

public class MusicArtist extends BaseEntity {
    public MusicArtist(String str) {
        setValue("name", str);
    }

    public String getType() {
        return "artist";
    }

    public void setGenre(String str) {
        setValue("genre", str);
    }

    public MusicArtist(JSONObject jSONObject) {
        super(jSONObject);
    }
}
