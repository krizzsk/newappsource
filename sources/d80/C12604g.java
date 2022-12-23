package d80;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.commons.request.BadResponseException;
import com.moovit.search.SearchAction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k40.C5478b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p906wz.C20431c;
import z70.C13321a;
import z70.C13329g;
import z70.C13335l;

/* renamed from: d80.g */
public final class C12604g extends C5478b<C12603f, C12604g> {

    /* renamed from: f */
    public List<C13321a> f31151f = null;

    /* renamed from: d */
    public final void mo21363d(C20431c cVar, JSONObject jSONObject) throws JSONException, IOException, BadResponseException {
        String str;
        JSONArray jSONArray;
        int i;
        JSONArray jSONArray2;
        String str2;
        String str3;
        int i2;
        JSONArray jSONArray3;
        JSONObject jSONObject2 = jSONObject;
        C12603f fVar = (C12603f) cVar;
        String optString = jSONObject2.optString(ServerParameters.STATUS, "unknown");
        optString.getClass();
        if (optString.equals("ZERO_RESULTS")) {
            this.f31151f = Collections.emptyList();
        } else if (optString.equals(Payload.RESPONSE_OK)) {
            JSONArray jSONArray4 = jSONObject2.getJSONArray("predictions");
            int length = jSONArray4.length();
            ArrayList arrayList = new ArrayList(length);
            int i3 = 0;
            while (i3 < length) {
                JSONObject jSONObject3 = jSONArray4.getJSONObject(i3);
                String string = jSONObject3.getString("place_id");
                StringBuilder sb = new StringBuilder();
                JSONArray jSONArray5 = jSONObject3.getJSONArray("types");
                for (int i4 = 0; i4 < jSONArray5.length(); i4++) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append(jSONArray5.getString(i4));
                }
                String sb2 = sb.toString();
                JSONObject optJSONObject = jSONObject3.optJSONObject("structured_formatting");
                if (optJSONObject != null) {
                    str = optJSONObject.getString("main_text");
                    jSONArray = optJSONObject.optJSONArray("main_text_matched_substrings");
                } else {
                    str = jSONObject3.getString(TwitterUser.DESCRIPTION_KEY);
                    jSONArray = jSONObject3.optJSONArray("matched_substrings");
                }
                int i5 = -1;
                if (jSONArray == null) {
                    jSONArray2 = jSONArray4;
                    i = length;
                    str2 = str;
                } else {
                    SpannableString spannableString = new SpannableString(str);
                    int length2 = jSONArray.length();
                    int i6 = 0;
                    while (i6 < length2) {
                        JSONObject optJSONObject2 = jSONArray.optJSONObject(i6);
                        if (optJSONObject2 == null) {
                            jSONArray3 = jSONArray4;
                        } else {
                            jSONArray3 = jSONArray4;
                            int optInt = optJSONObject2.optInt("offset", i5);
                            if (optInt != i5) {
                                i2 = length;
                                int optInt2 = optJSONObject2.optInt("length", i5);
                                if (optInt2 != i5) {
                                    spannableString.setSpan(CharacterStyle.wrap(C13329g.f33089a), optInt, optInt2 + optInt, 33);
                                }
                                i6++;
                                jSONArray4 = jSONArray3;
                                length = i2;
                                i5 = -1;
                            }
                        }
                        i2 = length;
                        i6++;
                        jSONArray4 = jSONArray3;
                        length = i2;
                        i5 = -1;
                    }
                    jSONArray2 = jSONArray4;
                    i = length;
                    str2 = spannableString;
                }
                JSONObject optJSONObject3 = jSONObject3.optJSONObject("structured_formatting");
                if (optJSONObject3 == null) {
                    str3 = null;
                } else {
                    str3 = optJSONObject3.optString("secondary_text", (String) null);
                }
                arrayList.add(new C13321a("google_place_autocomplete", string, sb2, C13335l.m33607c(jSONObject3.optJSONArray("types")), str2, str3, SearchAction.COPY, jSONObject3.optInt("distance_meters", -1)));
                i3++;
                jSONArray4 = jSONArray2;
                length = i;
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            this.f31151f = arrayList;
        } else {
            throw new IOException(optString);
        }
    }
}
