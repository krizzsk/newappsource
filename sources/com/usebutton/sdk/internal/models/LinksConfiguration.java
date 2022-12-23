package com.usebutton.sdk.internal.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

class LinksConfiguration {
    public static final String KEY_GUARANTEED_ACTION = "guaranteed_action";
    public static final String KEY_HOSTNAME = "hostname";
    public static final String KEY_KEY = "key";
    public static final String KEY_MATCHES = "matches";
    public static final String KEY_PATHNAME_IDS = "pathname_ids";
    public static final String KEY_QUERY_IDS = "query_ids";
    public static final String KEY_QUERY_URL_KEYS = "query_url_keys";
    public static final String KEY_REGEX = "regex";
    public static final String KEY_SUBDOMAIN = "subdomain";
    public static final String KEY_SUPPORTED_AFFILIATES = "supported_affiliates";
    public static final String KEY_SUPPORTED_HOSTNAMES = "supported_hostnames";
    public static final String KEY_SUPPORTED_SUBDOMAINS = "supported_bttnio_subdomains";
    public static final String KEY_VALUE = "value";
    public static final String KEY_VALUES = "values";
    private final List<Affiliate> supportedAffiliates;
    private final List<String> supportedButtonSubdomains;
    private final List<String> supportedHostnames;

    public LinksConfiguration(JSONObject jSONObject) {
        this.supportedHostnames = parseSupportedHostnames(jSONObject);
        this.supportedButtonSubdomains = parseSupportedSubdomains(jSONObject);
        this.supportedAffiliates = parseSupportedAffiliates(jSONObject);
    }

    private List<Affiliate> parseSupportedAffiliates(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_SUPPORTED_AFFILIATES);
        if (optJSONArray == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new Affiliate(optJSONArray.optJSONObject(i)));
        }
        return arrayList;
    }

    private List<String> parseSupportedHostnames(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_SUPPORTED_HOSTNAMES);
        if (optJSONArray == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optJSONObject(i).optString(KEY_HOSTNAME));
        }
        return arrayList;
    }

    private List<String> parseSupportedSubdomains(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_SUPPORTED_SUBDOMAINS);
        if (optJSONArray == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.optJSONObject(i).optString(KEY_SUBDOMAIN));
        }
        return arrayList;
    }

    public List<Affiliate> getSupportedAffiliates() {
        return this.supportedAffiliates;
    }

    public List<String> getSupportedButtonSubdomains() {
        return this.supportedButtonSubdomains;
    }

    public List<String> getSupportedHostnames() {
        return this.supportedHostnames;
    }

    public static class PathnameId {
        private final boolean guaranteedAction;
        private final String[][] matches;
        private final Pattern regex;

        public PathnameId(JSONObject jSONObject) {
            this.regex = Pattern.compile(jSONObject.optString(LinksConfiguration.KEY_REGEX));
            this.matches = parseMatches(jSONObject);
            this.guaranteedAction = jSONObject.optBoolean(LinksConfiguration.KEY_GUARANTEED_ACTION, true);
        }

        private String[][] parseMatches(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray(LinksConfiguration.KEY_MATCHES);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return (String[][]) Array.newInstance(String.class, new int[]{0, 0});
            }
            String[][] strArr = new String[optJSONArray.length()][];
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONArray optJSONArray2 = optJSONArray.optJSONObject(i).optJSONArray(LinksConfiguration.KEY_VALUES);
                if (optJSONArray2 == null) {
                    strArr[i] = new String[0];
                } else {
                    strArr[i] = new String[optJSONArray2.length()];
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        strArr[i][i2] = optJSONArray2.optString(i2);
                    }
                }
            }
            return strArr;
        }

        public String[][] getMatches() {
            return this.matches;
        }

        public Pattern getRegex() {
            return this.regex;
        }

        public boolean isGuaranteedAction() {
            return this.guaranteedAction;
        }

        public PathnameId(Pattern pattern, String[][] strArr) {
            this.regex = pattern;
            this.matches = strArr;
            this.guaranteedAction = true;
        }
    }

    public static class QueryId {
        private final boolean guaranteedAction;
        private final String key;
        private final List<String> values;

        public QueryId(JSONObject jSONObject) {
            this.key = jSONObject.optString(LinksConfiguration.KEY_KEY);
            this.values = parseValues(jSONObject);
            this.guaranteedAction = jSONObject.optBoolean(LinksConfiguration.KEY_GUARANTEED_ACTION, true);
        }

        private List<String> parseValues(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray(LinksConfiguration.KEY_VALUES);
            if (optJSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optJSONObject(i).optString("value"));
            }
            return arrayList;
        }

        public String getKey() {
            return this.key;
        }

        public List<String> getValues() {
            return this.values;
        }

        public boolean isGuaranteedAction() {
            return this.guaranteedAction;
        }

        public QueryId(String str, List<String> list) {
            this.key = str;
            this.values = list;
            this.guaranteedAction = true;
        }
    }

    public static class Affiliate {
        private final String hostname;
        private final List<PathnameId> pathnameIds;
        private final List<QueryId> queryIds;
        private final List<String> queryUrlKeys;

        public Affiliate(JSONObject jSONObject) {
            this.hostname = jSONObject.optString(LinksConfiguration.KEY_HOSTNAME);
            this.queryUrlKeys = parseQueryUrlKeys(jSONObject);
            this.queryIds = parseQueryIds(jSONObject);
            this.pathnameIds = parsePathnameIds(jSONObject);
        }

        private List<PathnameId> parsePathnameIds(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray(LinksConfiguration.KEY_PATHNAME_IDS);
            if (optJSONArray == null) {
                return new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new PathnameId(optJSONArray.optJSONObject(i)));
            }
            return arrayList;
        }

        private List<QueryId> parseQueryIds(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray(LinksConfiguration.KEY_QUERY_IDS);
            if (optJSONArray == null) {
                return new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new QueryId(optJSONArray.optJSONObject(i)));
            }
            return arrayList;
        }

        private List<String> parseQueryUrlKeys(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray(LinksConfiguration.KEY_QUERY_URL_KEYS);
            if (optJSONArray == null) {
                return new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optJSONObject(i).optString(LinksConfiguration.KEY_KEY));
            }
            return arrayList;
        }

        public String getHostname() {
            return this.hostname;
        }

        public List<PathnameId> getPathnameIds() {
            return this.pathnameIds;
        }

        public List<QueryId> getQueryIds() {
            return this.queryIds;
        }

        public List<String> getQueryUrlKeys() {
            return this.queryUrlKeys;
        }

        public Affiliate(String str, List<String> list, List<QueryId> list2, List<PathnameId> list3) {
            this.hostname = str;
            this.queryUrlKeys = list;
            this.queryIds = list2;
            this.pathnameIds = list3;
        }
    }

    public LinksConfiguration(List<String> list, List<String> list2, List<Affiliate> list3) {
        this.supportedHostnames = list;
        this.supportedButtonSubdomains = list2;
        this.supportedAffiliates = list3;
    }
}
