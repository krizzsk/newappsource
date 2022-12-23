package com.facebook.appevents.codeless.internal;

import com.appsflyer.ServerParameters;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p085f8.C4711a;

public final class EventBinding {

    /* renamed from: a */
    public final String f8509a;

    /* renamed from: b */
    public final List<PathComponent> f8510b;

    /* renamed from: c */
    public final List<C4711a> f8511c;

    /* renamed from: d */
    public final String f8512d;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    /* renamed from: com.facebook.appevents.codeless.internal.EventBinding$a */
    public static final class C2331a {
        /* renamed from: a */
        public static EventBinding m6194a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            int length;
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C24362h.m61210e(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C24362h.m61210e(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C24362h.m61210e(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C24362h.m61210e(string3, "mapping.getString(\"event_type\")");
            String upperCase2 = string3.toUpperCase(locale);
            C24362h.m61210e(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i = 0;
            if (length2 > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    C24362h.m61210e(jSONObject2, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject2));
                    if (i3 >= length2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray(Configuration.KEY_PARAMETERS);
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                while (true) {
                    int i4 = i + 1;
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                    C24362h.m61210e(jSONObject3, "jsonParameter");
                    arrayList2.add(new C4711a(jSONObject3));
                    if (i4 >= length) {
                        break;
                    }
                    i = i4;
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            C24362h.m61210e(string, ServerParameters.EVENT_NAME);
            C24362h.m61210e(string4, "appVersion");
            C24362h.m61210e(optString2, "componentId");
            C24362h.m61210e(optString, "pathType");
            C24362h.m61210e(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        C24362h.m61211f(mappingMethod, "method");
        C24362h.m61211f(actionType, "type");
        this.f8509a = str;
        this.f8510b = arrayList;
        this.f8511c = arrayList2;
        this.f8512d = str5;
    }
}
