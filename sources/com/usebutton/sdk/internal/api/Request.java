package com.usebutton.sdk.internal.api;

import android.net.Uri;
import com.amazonaws.http.HttpHeader;
import com.usebutton.sdk.internal.functional.Pair;
import com.usebutton.sdk.internal.util.JsonBuilder;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class Request {
    private static final String KEY_BODY = "body";
    private static final String KEY_HEADERS = "headers";
    private static final String KEY_HEADERS_KEY = "header-key";
    private static final String KEY_HEADERS_VALUE = "header-value";
    private static final String KEY_ID = "id";
    private static final String KEY_METHOD = "method";
    private static final String KEY_URL = "url";
    private List<Pair<String, String>> mHeaders = new ArrayList();
    private String mRequestId;
    private Uri mUrl;

    public static class Get extends Request {
        public Get(String str) {
            super(str);
        }

        private String stripTrailingZeros(String str) {
            int i;
            int length = str.length() - 1;
            int length2 = str.length() - 1;
            while (true) {
                int i2 = length2;
                i = length;
                length = i2;
                if (length > 0 && str.charAt(length - 1) != '.' && str.charAt(length) == '0') {
                    length2 = length - 1;
                }
            }
            return str.substring(0, i);
        }

        public String body() {
            return null;
        }

        public String method() {
            return "GET";
        }

        public Get withParameter(String str, String str2) {
            appendQueryParameter(str, str2);
            return this;
        }

        public Get withParameterIfNotNull(String str, String str2) {
            return str2 == null ? this : withParameter(str, str2);
        }

        public Get(Uri uri) {
            super(uri);
        }

        public Get withParameter(String str, int i) {
            return withParameter(str, String.format(Locale.US, "%d", new Object[]{Integer.valueOf(i)}));
        }

        public Get withParameter(String str, float f) {
            return withParameter(str, stripTrailingZeros(String.format(Locale.US, "%f", new Object[]{Float.valueOf(f)})));
        }

        public Get withParameter(String str, boolean z) {
            return withParameter(str, Boolean.toString(z));
        }

        public Get withParameter(String str, double d) {
            return withParameter(str, stripTrailingZeros(String.format(Locale.US, "%f", new Object[]{Double.valueOf(d)})));
        }

        public Get withParameter(String str, JSONObject jSONObject) {
            return withParameter(str, jSONObject.toString());
        }
    }

    public static class Put extends Post {
        public Put(String str) {
            super(str);
        }

        public String method() {
            return "PUT";
        }
    }

    public Request(String str) {
        this.mUrl = Uri.parse(str);
    }

    /* access modifiers changed from: private */
    public void appendQueryParameter(String str, String str2) {
        this.mUrl = this.mUrl.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static Request read(String str) throws IOException {
        Request request;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(KEY_METHOD);
            if ("POST".equals(string)) {
                request = new Post(jSONObject.getString("url"));
            } else if (!"GET".equals(string)) {
                return null;
            } else {
                request = new Get(jSONObject.getString("url"));
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(KEY_HEADERS);
            int i = 0;
            while (optJSONArray != null && i < optJSONArray.length()) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                request.addHeader(jSONObject2.getString(KEY_HEADERS_KEY), jSONObject2.getString(KEY_HEADERS_VALUE));
                i++;
            }
            if ((request instanceof Post) && jSONObject.has("body")) {
                ((Post) request).withBody(jSONObject.optString("body"));
            }
            request.setRequestId(jSONObject.optString("id"));
            return request;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public void addHeader(String str, String str2) {
        this.mHeaders.add(new Pair(str, str2));
    }

    public abstract String body();

    public String getRequestId() {
        return this.mRequestId;
    }

    public Iterable<? extends Pair<String, String>> headers() {
        return this.mHeaders;
    }

    public abstract String method();

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Request{mUrl=");
        k.append(this.mUrl);
        k.append(", mHeaders=");
        k.append(this.mHeaders);
        k.append(", method=");
        k.append(method());
        k.append(", body=");
        k.append(body());
        k.append('}');
        return k.toString();
    }

    public Uri url() {
        return this.mUrl;
    }

    public void write(StringWriter stringWriter) throws IOException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_METHOD, method());
            jSONObject.put("url", url());
            jSONObject.put("id", getRequestId());
            JSONArray jSONArray = null;
            for (Pair next : this.mHeaders) {
                if (jSONArray == null) {
                    jSONArray = new JSONArray();
                    jSONObject.put(KEY_HEADERS, jSONArray);
                }
                jSONArray.put(JsonBuilder.toJson(KEY_HEADERS_KEY, next.first(), KEY_HEADERS_VALUE, next.second()));
            }
            jSONObject.putOpt("body", body());
            stringWriter.append(jSONObject.toString());
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    public static class Post extends Request {
        private String mBody;

        public Post(String str) {
            super(str);
        }

        public String body() {
            return this.mBody;
        }

        public String method() {
            return "POST";
        }

        public Post withBody(JSONObject jSONObject) {
            addHeader(HttpHeader.CONTENT_TYPE, "application/json");
            this.mBody = jSONObject.toString();
            return this;
        }

        public Post withBody(String str) {
            this.mBody = str;
            return this;
        }
    }

    public Request(Uri uri) {
        this.mUrl = uri;
    }
}
