package p549hw;

import com.android.billingclient.api.Purchase;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.app.subscription.model.PurchaseDetails;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: hw.f */
public final class C17508f {
    /* renamed from: a */
    public static PurchaseDetails m43616a(Purchase purchase) {
        purchase.getClass();
        ArrayList arrayList = new ArrayList();
        if (purchase.f6728c.has("productIds")) {
            JSONArray optJSONArray = purchase.f6728c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (purchase.f6728c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(purchase.f6728c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        String optString = purchase.f6728c.optString("orderId");
        JSONObject jSONObject = purchase.f6728c;
        return new PurchaseDetails(optString, arrayList, purchase.f6728c.optLong("purchaseTime"), jSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN, jSONObject.optString("purchaseToken")));
    }
}
