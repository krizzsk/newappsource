package com.usebutton.sdk.context;

import android.net.Uri;
import com.usebutton.sdk.internal.models.BaseEntity;
import org.json.JSONObject;

public class Item extends BaseEntity {
    public Item(String str) {
        setSku(str);
    }

    public String getType() {
        return "item";
    }

    public Item setName(String str) {
        setValue("name", str);
        return this;
    }

    public Item setSku(String str) {
        setValue("sku", str);
        return this;
    }

    public Item setUrl(Uri uri) {
        setValue("url", uri.toString());
        return this;
    }

    public Item(Uri uri) {
        setUrl(uri);
    }

    public Item(JSONObject jSONObject) {
        super(jSONObject);
    }
}
