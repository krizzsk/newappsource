package p030bo.app;

import android.content.Context;
import com.appboy.models.IInAppMessage;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.w4 */
public class C1719w4 extends C1746z4 {

    /* renamed from: k */
    public static final String f6065k = AppboyLogger.getBrazeLogTag(C1719w4.class);

    /* renamed from: h */
    public final IInAppMessage f6066h;

    /* renamed from: i */
    public final JSONObject f6067i;

    /* renamed from: j */
    public final C1707v1 f6068j;

    /* renamed from: bo.app.w4$a */
    public static /* synthetic */ class C1720a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6069a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.appboy.enums.inappmessage.MessageType[] r0 = com.appboy.enums.inappmessage.MessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6069a = r0
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML_FULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6069a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.FULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6069a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.MODAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6069a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.SLIDEUP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6069a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.inappmessage.MessageType r1 = com.appboy.enums.inappmessage.MessageType.HTML     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1719w4.C1720a.<clinit>():void");
        }
    }

    public C1719w4(JSONObject jSONObject, C1707v1 v1Var) {
        super(jSONObject);
        String str = f6065k;
        StringBuilder k = C13555b.m33972k("Attempting to parse in-app message triggered action with JSON: ");
        k.append(JsonUtils.getPrettyPrintedString(jSONObject));
        AppboyLogger.m5457v(str, k.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f6068j = v1Var;
        this.f6067i = jSONObject2;
        IInAppMessage a = C1665p4.m4608a(jSONObject2, v1Var);
        this.f6066h = a;
        if (a == null) {
            AppboyLogger.m5459w(str, "Failed to parse in-app message triggered action.");
            StringBuilder k2 = C13555b.m33972k("Failed to parse in-app message triggered action with JSON: ");
            k2.append(JsonUtils.getPrettyPrintedString(jSONObject));
            throw new IllegalArgumentException(k2.toString());
        }
    }

    /* renamed from: a */
    public void mo6412a(Context context, C1600i0 i0Var, C1721w5 w5Var, long j) {
        try {
            String str = f6065k;
            AppboyLogger.m5448d(str, "Attempting to publish in-app message after delay of " + mo6417f().mo6337g() + " seconds.");
            IInAppMessage a = C1665p4.m4608a(this.f6067i, this.f6068j);
            if (a != null) {
                a.setLocalPrefetchedAssetPaths(this.f6138g);
                a.setExpirationTimestamp(j);
                i0Var.mo6134a(new C1633m0(this, a, this.f6068j.mo6228a()), C1633m0.class);
                return;
            }
            AppboyLogger.m5459w(str, "Cannot perform triggered action for " + w5Var + " due to deserialized in-app message being null");
        } catch (Exception e) {
            AppboyLogger.m5460w(f6065k, "Caught exception while performing triggered action.", e);
        }
    }

    /* renamed from: b */
    public List<C1639m6> mo6415b() {
        ArrayList arrayList = new ArrayList();
        List<String> remoteAssetPathsForPrefetch = this.f6066h.getRemoteAssetPathsForPrefetch();
        if (remoteAssetPathsForPrefetch.isEmpty()) {
            AppboyLogger.m5448d(f6065k, "In-app message has no remote assets for prefetch. Returning empty list.");
            return arrayList;
        }
        int i = C1720a.f6069a[this.f6066h.getMessageType().ordinal()];
        if (i == 1) {
            arrayList.add(new C1639m6(C1704u5.ZIP, remoteAssetPathsForPrefetch.get(0)));
        } else if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new C1639m6(C1704u5.IMAGE, remoteAssetPathsForPrefetch.get(0)));
        } else if (i != 5) {
            String str = f6065k;
            StringBuilder k = C13555b.m33972k("Failed to return remote paths to assets for type: ");
            k.append(this.f6066h.getMessageType());
            AppboyLogger.m5459w(str, k.toString());
        } else {
            for (String m6Var : remoteAssetPathsForPrefetch) {
                arrayList.add(new C1639m6(C1704u5.FILE, m6Var));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.forJsonPut();
            e.put("data", this.f6066h.forJsonPut());
            e.put("type", "inapp");
            return e;
        } catch (JSONException unused) {
            return null;
        }
    }
}
