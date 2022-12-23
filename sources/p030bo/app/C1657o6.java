package p030bo.app;

import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.o6 */
public final class C1657o6 {

    /* renamed from: a */
    public static final String f5910a = AppboyLogger.getBrazeLogTag(C1657o6.class);

    /* renamed from: a */
    public static IInAppMessage m4566a(JSONObject jSONObject, C1707v1 v1Var) {
        if (jSONObject == null) {
            try {
                AppboyLogger.m5448d(f5910a, "Templated message Json was null. Not de-serializing templated message.");
                return null;
            } catch (JSONException e) {
                String str = f5910a;
                AppboyLogger.m5460w(str, "Encountered JSONException processing templated message: " + jSONObject, e);
                return null;
            } catch (Exception e2) {
                String str2 = f5910a;
                AppboyLogger.m5460w(str2, "Encountered general exception processing templated message: " + jSONObject, e2);
                return null;
            }
        } else {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                return C1665p4.m4608a(jSONObject.getJSONObject("data"), v1Var);
            }
            String str3 = f5910a;
            AppboyLogger.m5459w(str3, "Received templated message Json with unknown type: " + string + ". Not parsing.");
            return null;
        }
    }

    /* renamed from: b */
    public static C1710v4 m4569b(JSONObject jSONObject, C1707v1 v1Var) {
        try {
            String string = jSONObject.getString("type");
            if (string.equals("inapp")) {
                return new C1719w4(jSONObject, v1Var);
            }
            if (string.equals("templated_iam")) {
                return new C1727x4(jSONObject, v1Var);
            }
            String str = f5910a;
            AppboyLogger.m5453i(str, "Received unknown trigger type: " + string);
            return null;
        } catch (JSONException e) {
            String str2 = f5910a;
            AppboyLogger.m5460w(str2, "Encountered JSONException processing triggered action Json: " + jSONObject, e);
        } catch (Exception e2) {
            String str3 = f5910a;
            AppboyLogger.m5460w(str3, "Failed to deserialize triggered action Json: " + jSONObject, e2);
        }
    }

    /* renamed from: a */
    public static List<C1710v4> m4568a(JSONArray jSONArray, C1707v1 v1Var) {
        if (jSONArray == null) {
            try {
                AppboyLogger.m5448d(f5910a, "Triggered actions Json array was null. Not de-serializing triggered actions.");
                return null;
            } catch (JSONException e) {
                String str = f5910a;
                AppboyLogger.m5460w(str, "Encountered JSONException processing triggered actions Json array: " + jSONArray, e);
                return null;
            } catch (Exception e2) {
                String str2 = f5910a;
                AppboyLogger.m5460w(str2, "Failed to deserialize triggered actions Json array: " + jSONArray, e2);
                return null;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                C1710v4 b = m4569b(jSONArray.getJSONObject(i), v1Var);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static List<C1559d5> m4567a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String string = optJSONObject.getString("type");
                string.getClass();
                char c = 65535;
                switch (string.hashCode()) {
                    case -1679221933:
                        if (string.equals("purchase_property")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3417674:
                        if (string.equals("open")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3556498:
                        if (string.equals("test")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 447503464:
                        if (string.equals("custom_event_property")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 717572172:
                        if (string.equals("custom_event")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1512893214:
                        if (string.equals("iam_click")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1743324417:
                        if (string.equals(ProductAction.ACTION_PURCHASE)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1926863907:
                        if (string.equals("push_click")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        arrayList.add(new C1605i5(optJSONObject));
                        break;
                    case 1:
                        arrayList.add(new C1579f5());
                        break;
                    case 2:
                        arrayList.add(new C1622k5());
                        break;
                    case 3:
                        arrayList.add(new C1538b5(optJSONObject));
                        break;
                    case 4:
                        arrayList.add(new C1527a5(optJSONObject));
                        break;
                    case 5:
                        arrayList.add(new C1569e5(optJSONObject));
                        break;
                    case 6:
                        arrayList.add(new C1597h5(optJSONObject));
                        break;
                    case 7:
                        arrayList.add(new C1613j5(optJSONObject));
                        break;
                    default:
                        String str = f5910a;
                        AppboyLogger.m5459w(str, "Received triggered condition Json with unknown type: " + string + ". Not parsing.");
                        break;
                }
            } else {
                AppboyLogger.m5459w(f5910a, "Received null or blank trigger condition Json. Not parsing.");
            }
        }
        return arrayList;
    }
}
