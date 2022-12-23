package com.usebutton.sdk.internal.api.burly;

import com.appboy.support.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Burly {
    public static final String KEY_AND = "and";
    public static final String KEY_CONSTANT = "constant";
    public static final String KEY_EQ = "eq";
    public static final String KEY_EVENT = "event";
    public static final String KEY_GT = "gt";
    public static final String KEY_LT = "lt";
    public static final String KEY_NOT = "not";
    public static final String KEY_OR = "or";
    public static final String KEY_SHOW_COUNT = "show_count";
    public static final String KEY_URL = "url";
    public static final String KEY_URL_PATTERN = "url_pattern";
    private final Set<String> blacklist = new HashSet(Arrays.asList(new String[]{StringUtils.NULL_USER_ID_SUBSTITUTE_STRING, "false", "", "0"}));

    private boolean evalAnd(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (hashMap.size() == 0) {
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_AND);
        boolean z = true;
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            for (int i = 0; i < optJSONArray.length() && z; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return false;
                }
                z = evaluate(optJSONObject, hashMap);
            }
        }
        return z;
    }

    private boolean evalBlacklist(String str) {
        return !this.blacklist.contains(str);
    }

    private boolean evalConstant(JSONObject jSONObject) {
        if (jSONObject.optJSONObject(KEY_CONSTANT) == null) {
            return evalBlacklist(jSONObject.optString(KEY_CONSTANT));
        }
        return true;
    }

    private boolean evalEvent(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (hashMap.size() == 0 || !hashMap.containsKey("event")) {
            return false;
        }
        return jSONObject.optString("event").equals(hashMap.get("event"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r6.equals(KEY_LT) == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean evalExpression(java.lang.String r6, org.json.JSONObject r7, java.util.HashMap<java.lang.String, java.lang.Object> r8) {
        /*
            r5 = this;
            int r0 = r8.size()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONArray r7 = r7.optJSONArray(r6)
            r0 = 1
            if (r7 == 0) goto L_0x008f
            int r2 = r7.length()
            r3 = 2
            if (r2 >= r3) goto L_0x0018
            goto L_0x008f
        L_0x0018:
            java.lang.String r2 = r7.optString(r1)
            boolean r4 = r8.containsKey(r2)
            if (r4 != 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.Object r7 = r7.opt(r0)
            java.lang.Object r8 = r8.get(r2)
            r6.getClass()
            r2 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case 3244: goto L_0x004c;
                case 3309: goto L_0x0041;
                case 3464: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r3 = -1
            goto L_0x0056
        L_0x0038:
            java.lang.String r4 = "lt"
            boolean r6 = r6.equals(r4)
            if (r6 != 0) goto L_0x0056
            goto L_0x0036
        L_0x0041:
            java.lang.String r3 = "gt"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x004a
            goto L_0x0036
        L_0x004a:
            r3 = 1
            goto L_0x0056
        L_0x004c:
            java.lang.String r3 = "eq"
            boolean r6 = r6.equals(r3)
            if (r6 != 0) goto L_0x0055
            goto L_0x0036
        L_0x0055:
            r3 = 0
        L_0x0056:
            switch(r3) {
                case 0: goto L_0x008a;
                case 1: goto L_0x0072;
                case 2: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            return r1
        L_0x005a:
            boolean r6 = r8 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0071
            boolean r6 = r7 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0071
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r6 = r8.intValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 >= r7) goto L_0x0071
            r1 = 1
        L_0x0071:
            return r1
        L_0x0072:
            boolean r6 = r8 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0089
            boolean r6 = r7 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x0089
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r6 = r8.intValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 <= r7) goto L_0x0089
            r1 = 1
        L_0x0089:
            return r1
        L_0x008a:
            boolean r6 = java.util.Objects.equals(r8, r7)
            return r6
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.burly.Burly.evalExpression(java.lang.String, org.json.JSONObject, java.util.HashMap):boolean");
    }

    private boolean evalNot(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        JSONObject optJSONObject = jSONObject.optJSONObject(KEY_NOT);
        if (optJSONObject == null) {
            return !evalBlacklist(jSONObject.optString(KEY_NOT));
        }
        return !evaluate(optJSONObject, hashMap);
    }

    private boolean evalOr(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (hashMap.size() == 0) {
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray(KEY_OR);
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return true;
        }
        boolean z = false;
        for (int i = 0; i < optJSONArray.length() && !z; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                return false;
            }
            z = evaluate(optJSONObject, hashMap);
        }
        return z;
    }

    private boolean evalShowCount(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (hashMap.size() == 0 || !hashMap.containsKey(KEY_SHOW_COUNT)) {
            return false;
        }
        Object obj = hashMap.get(KEY_SHOW_COUNT);
        Object opt = jSONObject.opt(KEY_SHOW_COUNT);
        if (!(obj instanceof Integer) || !(opt instanceof Integer) || ((Integer) obj).intValue() >= ((Integer) opt).intValue()) {
            return false;
        }
        return true;
    }

    private boolean evalUrlPattern(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (hashMap.size() != 0 && hashMap.containsKey("url")) {
            String str = (String) hashMap.get("url");
            String optString = jSONObject.optString(KEY_URL_PATTERN);
            if (!(str == null || optString == null)) {
                return Pattern.compile(optString).matcher(str).find();
            }
        }
        return false;
    }

    public boolean evaluate(JSONObject jSONObject, HashMap<String, Object> hashMap) {
        if (!jSONObject.keys().hasNext()) {
            return false;
        }
        String next = jSONObject.keys().next();
        next.getClass();
        char c = 65535;
        switch (next.hashCode()) {
            case -1082033984:
                if (next.equals(KEY_URL_PATTERN)) {
                    c = 0;
                    break;
                }
                break;
            case -567811164:
                if (next.equals(KEY_CONSTANT)) {
                    c = 1;
                    break;
                }
                break;
            case 3244:
                if (next.equals(KEY_EQ)) {
                    c = 2;
                    break;
                }
                break;
            case 3309:
                if (next.equals(KEY_GT)) {
                    c = 3;
                    break;
                }
                break;
            case 3464:
                if (next.equals(KEY_LT)) {
                    c = 4;
                    break;
                }
                break;
            case 3555:
                if (next.equals(KEY_OR)) {
                    c = 5;
                    break;
                }
                break;
            case 96727:
                if (next.equals(KEY_AND)) {
                    c = 6;
                    break;
                }
                break;
            case 109267:
                if (next.equals(KEY_NOT)) {
                    c = 7;
                    break;
                }
                break;
            case 96891546:
                if (next.equals("event")) {
                    c = 8;
                    break;
                }
                break;
            case 1110875469:
                if (next.equals(KEY_SHOW_COUNT)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return evalUrlPattern(jSONObject, hashMap);
            case 1:
                return evalConstant(jSONObject);
            case 2:
                return evalExpression(KEY_EQ, jSONObject, hashMap);
            case 3:
                return evalExpression(KEY_GT, jSONObject, hashMap);
            case 4:
                return evalExpression(KEY_LT, jSONObject, hashMap);
            case 5:
                return evalOr(jSONObject, hashMap);
            case 6:
                return evalAnd(jSONObject, hashMap);
            case 7:
                return evalNot(jSONObject, hashMap);
            case 8:
                return evalEvent(jSONObject, hashMap);
            case 9:
                return evalShowCount(jSONObject, hashMap);
            default:
                return false;
        }
    }
}
