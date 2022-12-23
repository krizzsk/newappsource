package com.facebook.appevents.codeless.internal;

import com.appboy.models.MessageButton;
import com.appboy.models.outgoing.TwitterUser;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONObject;

public final class PathComponent {

    /* renamed from: a */
    public final String f8513a;

    /* renamed from: b */
    public final int f8514b;

    /* renamed from: c */
    public final int f8515c;

    /* renamed from: d */
    public final String f8516d;

    /* renamed from: e */
    public final String f8517e;

    /* renamed from: f */
    public final String f8518f;

    /* renamed from: g */
    public final String f8519g;

    /* renamed from: h */
    public final int f8520h;

    @Metadata(mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo59060d2 = {"Lcom/facebook/appevents/codeless/internal/PathComponent$MatchBitmaskType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ID", "TEXT", "TAG", "DESCRIPTION", "HINT", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        private MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        C24362h.m61210e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f8513a = string;
        this.f8514b = jSONObject.optInt("index", -1);
        this.f8515c = jSONObject.optInt("id");
        String optString = jSONObject.optString(MessageButton.TEXT);
        C24362h.m61210e(optString, "component.optString(PATH_TEXT_KEY)");
        this.f8516d = optString;
        String optString2 = jSONObject.optString("tag");
        C24362h.m61210e(optString2, "component.optString(PATH_TAG_KEY)");
        this.f8517e = optString2;
        String optString3 = jSONObject.optString(TwitterUser.DESCRIPTION_KEY);
        C24362h.m61210e(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f8518f = optString3;
        String optString4 = jSONObject.optString("hint");
        C24362h.m61210e(optString4, "component.optString(PATH_HINT_KEY)");
        this.f8519g = optString4;
        this.f8520h = jSONObject.optInt("match_bitmask");
    }
}
