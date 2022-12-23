package p030bo.app;

import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ControlCard;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.braze.storage.ICardStorageProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.g2 */
public final class C1584g2 {

    /* renamed from: a */
    public static final String f5712a = AppboyLogger.getBrazeLogTag(C1584g2.class);

    /* renamed from: bo.app.g2$a */
    public static /* synthetic */ class C1585a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5713a;

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
                com.appboy.enums.CardType[] r0 = com.appboy.enums.CardType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5713a = r0
                com.appboy.enums.CardType r1 = com.appboy.enums.CardType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5713a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appboy.enums.CardType r1 = com.appboy.enums.CardType.CAPTIONED_IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5713a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appboy.enums.CardType r1 = com.appboy.enums.CardType.SHORT_NEWS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5713a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.appboy.enums.CardType r1 = com.appboy.enums.CardType.TEXT_ANNOUNCEMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5713a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.appboy.enums.CardType r1 = com.appboy.enums.CardType.CONTROL     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1584g2.C1585a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static List<Card> m4225a(JSONArray jSONArray, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Card a = m4223a(jSONArray.optString(i), provider, v1Var, iCardStorageProvider, mVar);
                if (a != null) {
                    arrayList.add(a);
                }
            } catch (Exception e) {
                String str = f5712a;
                StringBuilder r = C25541a.m63887r("Unable to create Card JSON in array. Ignoring. Was on element index: ", i, " of json array: ");
                r.append(jSONArray.toString());
                AppboyLogger.m5452e(str, r.toString(), e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Card m4224a(JSONObject jSONObject, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        CardType cardTypeFromJson = provider.getCardTypeFromJson(jSONObject);
        int i = C1585a.f5713a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            return new BannerImageCard(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        }
        if (i == 2) {
            return new CaptionedImageCard(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        }
        if (i == 3) {
            return new ShortNewsCard(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        }
        if (i == 4) {
            return new TextAnnouncementCard(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        }
        if (i == 5) {
            return new ControlCard(jSONObject, provider, v1Var, iCardStorageProvider, mVar);
        }
        StringBuilder k = C13555b.m33972k("Failed to construct java object from JSON [");
        k.append(JsonUtils.getPrettyPrintedString(jSONObject));
        k.append("] with cardType: ");
        k.append(cardTypeFromJson);
        throw new JSONException(k.toString());
    }

    /* renamed from: a */
    public static Card m4223a(String str, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        return m4224a(new JSONObject(str), provider, v1Var, iCardStorageProvider, mVar);
    }
}
