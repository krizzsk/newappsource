package p009a8;

import com.appsflyer.ServerParameters;
import com.facebook.GraphRequest;
import com.facebook.internal.C2397f0;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a8.b */
public final /* synthetic */ class C0093b implements GraphRequest.C2280b {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f272a;

    /* renamed from: b */
    public final /* synthetic */ Set f273b;

    /* renamed from: c */
    public final /* synthetic */ Set f274c;

    /* renamed from: d */
    public final /* synthetic */ Set f275d;

    public /* synthetic */ C0093b(AtomicBoolean atomicBoolean, HashSet hashSet, HashSet hashSet2, HashSet hashSet3) {
        this.f272a = atomicBoolean;
        this.f273b = hashSet;
        this.f274c = hashSet2;
        this.f275d = hashSet3;
    }

    /* renamed from: b */
    public final void mo200b(C0124u uVar) {
        JSONArray optJSONArray;
        AtomicBoolean atomicBoolean = this.f272a;
        Set set = this.f273b;
        Set set2 = this.f274c;
        Set set3 = this.f275d;
        C24362h.m61211f(atomicBoolean, "$permissionsCallSucceeded");
        C24362h.m61211f(set, "$permissions");
        C24362h.m61211f(set2, "$declinedPermissions");
        C24362h.m61211f(set3, "$expiredPermissions");
        JSONObject jSONObject = uVar.f367d;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null) {
            atomicBoolean.set(true);
            int i = 0;
            int length = optJSONArray.length();
            if (length > 0) {
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("permission");
                        String optString2 = optJSONObject.optString(ServerParameters.STATUS);
                        if (!C2397f0.m6292A(optString) && !C2397f0.m6292A(optString2)) {
                            C24362h.m61210e(optString2, ServerParameters.STATUS);
                            Locale locale = Locale.US;
                            C24362h.m61210e(locale, "US");
                            String lowerCase = optString2.toLowerCase(locale);
                            C24362h.m61210e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                            int hashCode = lowerCase.hashCode();
                            if (hashCode != -1309235419) {
                                if (hashCode != 280295099) {
                                    if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                        set2.add(optString);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    set.add(optString);
                                }
                            } else if (lowerCase.equals("expired")) {
                                set3.add(optString);
                            }
                            C24362h.m61216k(lowerCase, "Unexpected status: ");
                        }
                    }
                    if (i2 < length) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
