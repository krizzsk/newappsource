package com.usebutton.sdk.internal.api;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class HttpResponse {
    private final JSONObject body;
    private final int code;
    private final Map<String, List<String>> headers;

    public HttpResponse(int i, Map<String, List<String>> map, JSONObject jSONObject) {
        this.code = i;
        this.headers = sanitizeHeaders(map);
        this.body = jSONObject;
    }

    private static Map<String, List<String>> sanitizeHeaders(Map<String, List<String>> map) {
        if (map == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String next : map.keySet()) {
            List list = map.get(next);
            if (list != null && !list.isEmpty()) {
                hashMap.put(next, list);
            }
        }
        return hashMap;
    }

    public JSONObject body() {
        return this.body;
    }

    public int code() {
        return this.code;
    }

    public String header(String str) {
        Map<String, List<String>> map = this.headers;
        if (map != null && map.containsKey(str)) {
            return (String) this.headers.get(str).get(0);
        }
        return null;
    }

    public Map<String, List<String>> headers() {
        return this.headers;
    }
}
