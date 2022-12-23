package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.braze.storage.ICardStorageProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a0.C0017h;

/* renamed from: bo.app.z3 */
public class C1744z3 implements ICardStorageProvider<FeedUpdatedEvent> {

    /* renamed from: f */
    public static final String f6127f = AppboyLogger.getBrazeLogTag(C1744z3.class);

    /* renamed from: a */
    public final SharedPreferences f6128a;

    /* renamed from: b */
    public final Set<String> f6129b;

    /* renamed from: c */
    public final Set<String> f6130c;

    /* renamed from: d */
    public final C1632m f6131d = new C1624l();

    /* renamed from: e */
    public final C1707v1 f6132e;

    /* renamed from: bo.app.z3$a */
    public enum C1745a {
        READ_CARDS("read_cards_set", "read_cards_flat"),
        VIEWED_CARDS("viewed_cards_set", "viewed_cards_flat");
        

        /* renamed from: a */
        public final String f6136a;

        /* renamed from: b */
        public final String f6137b;

        /* access modifiers changed from: public */
        C1745a(String str, String str2) {
            this.f6136a = str;
            this.f6137b = str2;
        }

        /* renamed from: a */
        public String mo6505a() {
            return this.f6137b;
        }

        /* renamed from: b */
        public String mo6506b() {
            return this.f6136a;
        }
    }

    public C1744z3(Context context, String str, C1707v1 v1Var) {
        String str2;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str2);
        this.f6132e = v1Var;
        this.f6128a = context.getSharedPreferences("com.appboy.storage.feedstorageprovider" + cacheFileSuffix, 0);
        this.f6129b = mo6501a(C1745a.VIEWED_CARDS);
        this.f6130c = mo6501a(C1745a.READ_CARDS);
        mo6502a(str);
    }

    /* renamed from: b */
    public static Set<String> m4979b(String str) {
        HashSet hashSet = new HashSet();
        if (str != null) {
            Collections.addAll(hashSet, str.split(";"));
        }
        return hashSet;
    }

    /* renamed from: a */
    public FeedUpdatedEvent mo6499a(JSONArray jSONArray, String str) {
        String str2 = str == null ? "" : str;
        String string = this.f6128a.getString(ServerParameters.AF_USER_ID, "");
        if (string.equals(str2)) {
            String str3 = f6127f;
            AppboyLogger.m5453i(str3, "Updating offline feed for user with id: " + str);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            mo6504a(jSONArray, nowInSeconds);
            this.f6129b.retainAll(m4978a(jSONArray));
            mo6503a(this.f6129b, C1745a.VIEWED_CARDS);
            this.f6130c.retainAll(m4978a(jSONArray));
            mo6503a(this.f6130c, C1745a.READ_CARDS);
            return mo6500a(jSONArray, str, false, nowInSeconds);
        }
        AppboyLogger.m5453i(f6127f, C0017h.m56M("The received cards are for user ", str, " and the current user is ", string, " , the cards will be discarded and no changes will be made."));
        return null;
    }

    public void markCardAsClicked(String str) {
    }

    public void markCardAsDismissed(String str) {
    }

    public void markCardAsViewed(String str) {
        if (!this.f6129b.contains(str)) {
            this.f6129b.add(str);
            mo6503a(this.f6129b, C1745a.VIEWED_CARDS);
        }
    }

    public void markCardAsVisuallyRead(String str) {
        if (!this.f6130c.contains(str)) {
            this.f6130c.add(str);
            mo6503a(this.f6130c, C1745a.READ_CARDS);
        }
    }

    /* renamed from: a */
    public FeedUpdatedEvent getCachedCardsAsEvent() {
        return mo6500a(new JSONArray(this.f6128a.getString("cards", "[]")), this.f6128a.getString(ServerParameters.AF_USER_ID, ""), true, this.f6128a.getLong("cards_timestamp", -1));
    }

    /* renamed from: a */
    public final FeedUpdatedEvent mo6500a(JSONArray jSONArray, String str, boolean z, long j) {
        List list;
        if (jSONArray == null || jSONArray.length() == 0) {
            list = new ArrayList();
        } else {
            list = C1584g2.m4225a(jSONArray, new CardKey.Provider(false), this.f6132e, (ICardStorageProvider<?>) this, this.f6131d);
        }
        List<Card> list2 = list;
        for (Card card : list2) {
            if (this.f6129b.contains(card.getId())) {
                card.setViewed(true);
                card.setIndicatorHighlighted(true);
            }
            if (this.f6130c.contains(card.getId())) {
                card.setIndicatorHighlighted(true);
            }
        }
        return new FeedUpdatedEvent(list2, str, z, j);
    }

    /* renamed from: a */
    public final Set<String> mo6501a(C1745a aVar) {
        String a = aVar.mo6505a();
        if (this.f6128a.contains(a)) {
            Set<String> b = m4979b(this.f6128a.getString(a, (String) null));
            SharedPreferences.Editor edit = this.f6128a.edit();
            edit.remove(a);
            edit.apply();
            mo6503a(b, aVar);
            return b;
        }
        return new ConcurrentSkipListSet(this.f6128a.getStringSet(aVar.mo6506b(), new HashSet()));
    }

    /* renamed from: a */
    public final void mo6504a(JSONArray jSONArray, long j) {
        SharedPreferences.Editor edit = this.f6128a.edit();
        if (jSONArray == null || jSONArray.length() == 0) {
            edit.remove("cards");
        } else {
            edit.putString("cards", jSONArray.toString());
        }
        edit.putLong("cards_timestamp", j);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo6502a(String str) {
        SharedPreferences.Editor edit = this.f6128a.edit();
        edit.putString(ServerParameters.AF_USER_ID, str);
        edit.apply();
    }

    /* renamed from: a */
    public void mo6503a(Set<String> set, C1745a aVar) {
        String b = aVar.mo6506b();
        SharedPreferences.Editor edit = this.f6128a.edit();
        if (set == null || set.isEmpty()) {
            edit.remove(b);
        } else {
            edit.putStringSet(b, set);
        }
        edit.apply();
    }

    /* renamed from: a */
    public static Set<String> m4978a(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                CardKey cardKey = CardKey.ID;
                if (jSONObject.has(cardKey.getFeedKey())) {
                    hashSet.add(jSONObject.getString(cardKey.getFeedKey()));
                }
            }
        }
        return hashSet;
    }
}
