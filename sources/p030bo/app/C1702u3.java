package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.enums.CardKey;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import com.braze.storage.ICardStorageProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bo.app.u3 */
public class C1702u3 implements ICardStorageProvider<ContentCardsUpdatedEvent> {

    /* renamed from: f */
    public static final String f6021f = AppboyLogger.getBrazeLogTag(C1702u3.class);

    /* renamed from: g */
    public static final Set<String> f6022g;

    /* renamed from: a */
    public final SharedPreferences f6023a;

    /* renamed from: b */
    public final SharedPreferences f6024b;

    /* renamed from: c */
    public final C1632m f6025c = new C1616k();

    /* renamed from: d */
    public final String f6026d;

    /* renamed from: e */
    public final C1707v1 f6027e;

    static {
        HashSet hashSet = new HashSet();
        f6022g = hashSet;
        hashSet.add(CardKey.VIEWED.getContentCardsKey());
        hashSet.add(CardKey.DISMISSED.getContentCardsKey());
    }

    public C1702u3(Context context, String str, String str2, C1707v1 v1Var) {
        this.f6026d = str;
        String cacheFileSuffix = StringUtils.getCacheFileSuffix(context, str, str2);
        this.f6024b = context.getSharedPreferences("com.appboy.storage.content_cards_storage_provider.metadata" + cacheFileSuffix, 0);
        this.f6023a = context.getSharedPreferences("com.appboy.storage.content_cards_storage_provider.cards" + cacheFileSuffix, 0);
        this.f6027e = v1Var;
    }

    /* renamed from: b */
    public static boolean m4775b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null) {
            return false;
        }
        String contentCardsKey = CardKey.CREATED.getContentCardsKey();
        if (!jSONObject.has(contentCardsKey) || !jSONObject2.has(contentCardsKey) || jSONObject.getLong(contentCardsKey) <= jSONObject2.getLong(contentCardsKey)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public ContentCardsUpdatedEvent mo6378a(C1725x2 x2Var, String str) {
        if (str == null) {
            AppboyLogger.m5448d(f6021f, "Input user id was null. Defaulting to the empty user id");
            str = "";
        }
        if (!this.f6026d.equals(str)) {
            String str2 = f6021f;
            StringBuilder l = C13555b.m33973l("The received cards are for user ", str, " and the current user is ");
            l.append(this.f6026d);
            l.append(" , the cards will be discarded and no changes will be made.");
            AppboyLogger.m5453i(str2, l.toString());
            return null;
        }
        String str3 = f6021f;
        AppboyLogger.m5453i(str3, "Updating offline Content Cards for user with id: " + str);
        mo6381a(x2Var);
        mo6401h();
        HashSet hashSet = new HashSet();
        JSONArray a = x2Var.mo6451a();
        if (!(a == null || a.length() == 0)) {
            Set<String> b = mo6387b();
            Set<String> c = mo6390c();
            for (int i = 0; i < a.length(); i++) {
                JSONObject jSONObject = a.getJSONObject(i);
                String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                JSONObject d = mo6394d(string);
                if (m4775b(d, jSONObject)) {
                    String str4 = f6021f;
                    AppboyLogger.m5453i(str4, "The server card received is older than the cached card. Discarding the server card.");
                    AppboyLogger.m5448d(str4, "Server card json: " + jSONObject.toString());
                    AppboyLogger.m5448d(str4, "Cached card json: " + jSONObject.toString());
                } else {
                    hashSet.add(string);
                    if (m4774a(jSONObject, CardKey.REMOVED)) {
                        String str5 = f6021f;
                        AppboyLogger.m5448d(str5, "Server card is marked as removed. Removing from card storage with id: " + string);
                        mo6396e(string);
                        mo6398f(string);
                        mo6385a(string, (JSONObject) null);
                    } else if (b.contains(string)) {
                        String str6 = f6021f;
                        AppboyLogger.m5448d(str6, "Server card was locally dismissed already. Not adding card to storage. Server card: " + jSONObject);
                    } else if (c.contains(string)) {
                        String str7 = f6021f;
                        AppboyLogger.m5448d(str7, "Server card has expired already. Not adding card to storage. Server card: " + jSONObject);
                    } else if (m4774a(jSONObject, CardKey.DISMISSED)) {
                        String str8 = f6021f;
                        AppboyLogger.m5448d(str8, "Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: " + string);
                        mo6383a(string);
                        mo6385a(string, (JSONObject) null);
                    } else {
                        mo6385a(string, m4773a(d, jSONObject));
                        if (m4774a(jSONObject, CardKey.IS_TEST)) {
                            mo6391c(string);
                        }
                    }
                }
            }
        }
        if (x2Var.mo6452b()) {
            mo6389b((Set<String>) hashSet);
            mo6392c((Set<String>) hashSet);
            hashSet.addAll(mo6399g());
            mo6386a((Set<String>) hashSet);
        }
        return mo6379a(false);
    }

    /* renamed from: c */
    public Set<String> mo6390c() {
        return new HashSet(this.f6024b.getStringSet("expired", new HashSet()));
    }

    /* renamed from: d */
    public long mo6393d() {
        return this.f6024b.getLong("last_card_updated_at", 0);
    }

    /* renamed from: e */
    public long mo6395e() {
        return this.f6024b.getLong("last_full_sync_at", 0);
    }

    /* renamed from: f */
    public final long mo6397f() {
        return this.f6024b.getLong("last_storage_update_timestamp", 0);
    }

    /* renamed from: g */
    public Set<String> mo6399g() {
        return new HashSet(this.f6024b.getStringSet("test", new HashSet()));
    }

    /* renamed from: h */
    public final void mo6401h() {
        SharedPreferences.Editor edit = this.f6024b.edit();
        edit.putLong("last_storage_update_timestamp", DateTimeUtils.nowInSeconds());
        edit.apply();
    }

    public void markCardAsClicked(String str) {
        mo6384a(str, CardKey.CLICKED, Boolean.TRUE);
    }

    public void markCardAsDismissed(String str) {
        mo6383a(str);
        mo6385a(str, (JSONObject) null);
    }

    public void markCardAsViewed(String str) {
        mo6384a(str, CardKey.VIEWED, Boolean.TRUE);
    }

    public void markCardAsVisuallyRead(String str) {
        mo6384a(str, CardKey.READ, Boolean.TRUE);
    }

    /* renamed from: c */
    public void mo6391c(String str) {
        String str2 = f6021f;
        AppboyLogger.m5457v(str2, "Adding card to test cache: " + str);
        Set<String> g = mo6399g();
        g.add(str);
        this.f6024b.edit().putStringSet("test", g).apply();
    }

    /* renamed from: d */
    public JSONObject mo6394d(String str) {
        String string = this.f6023a.getString(str, (String) null);
        if (string == null) {
            String str2 = f6021f;
            AppboyLogger.m5448d(str2, "Card not present in storage for id: " + str);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            String str3 = f6021f;
            AppboyLogger.m5452e(str3, "Failed to read card json from storage. Json: " + string, e);
            return null;
        }
    }

    /* renamed from: e */
    public void mo6396e(String str) {
        Set<String> b = mo6387b();
        b.remove(str);
        this.f6024b.edit().putStringSet("dismissed", b).apply();
    }

    /* renamed from: f */
    public void mo6398f(String str) {
        String str2 = f6021f;
        AppboyLogger.m5457v(str2, "Removing card from test cache: " + str);
        Set<String> g = mo6399g();
        g.remove(str);
        this.f6024b.edit().putStringSet("test", g).apply();
    }

    /* renamed from: b */
    public Set<String> mo6387b() {
        return new HashSet(this.f6024b.getStringSet("dismissed", new HashSet()));
    }

    /* renamed from: b */
    public void mo6389b(Set<String> set) {
        Set<String> b = mo6387b();
        b.retainAll(set);
        this.f6024b.edit().putStringSet("dismissed", b).apply();
    }

    /* renamed from: c */
    public void mo6392c(Set<String> set) {
        Set<String> c = mo6390c();
        c.retainAll(set);
        this.f6024b.edit().putStringSet("expired", c).apply();
    }

    /* renamed from: b */
    public void mo6388b(String str) {
        Set<String> c = mo6390c();
        c.add(str);
        this.f6024b.edit().putStringSet("expired", c).apply();
    }

    /* renamed from: a */
    public ContentCardsUpdatedEvent getCachedCardsAsEvent() {
        return mo6379a(true);
    }

    /* renamed from: a */
    public Card mo6380a(JSONObject jSONObject) {
        return C1584g2.m4224a(jSONObject, CardKey.Provider.CONTENT_CARDS, this.f6027e, (ICardStorageProvider<?>) this, this.f6025c);
    }

    /* renamed from: a */
    public ContentCardsUpdatedEvent mo6379a(boolean z) {
        CardKey.Provider provider = new CardKey.Provider(true);
        Map<String, ?> all = this.f6023a.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List<Card> a = C1584g2.m4225a(jSONArray, provider, this.f6027e, (ICardStorageProvider<?>) this, this.f6025c);
        Iterator<Card> it2 = a.iterator();
        while (it2.hasNext()) {
            Card next = it2.next();
            if (next.isExpired()) {
                mo6382a(next);
                it2.remove();
            }
        }
        return new ContentCardsUpdatedEvent(a, this.f6026d, mo6397f(), z);
    }

    /* renamed from: a */
    public void mo6382a(Card card) {
        String id = card.getId();
        String str = f6021f;
        AppboyLogger.m5448d(str, "Deleting expired card from storage with id: " + id);
        mo6385a(id, (JSONObject) null);
        mo6388b(id);
        mo6398f(id);
    }

    /* renamed from: a */
    public void mo6384a(String str, CardKey cardKey, Object obj) {
        JSONObject d = mo6394d(str);
        if (d == null) {
            String str2 = f6021f;
            AppboyLogger.m5448d(str2, "Can't update card field. Json cannot be parsed from disk or is not present. Id: " + str);
            return;
        }
        try {
            d.put(cardKey.getContentCardsKey(), obj);
            mo6385a(str, d);
        } catch (JSONException e) {
            String str3 = f6021f;
            AppboyLogger.m5452e(str3, "Failed to update card json field to " + obj + " with key: " + cardKey, e);
        }
    }

    /* renamed from: a */
    public void mo6381a(C1725x2 x2Var) {
        SharedPreferences.Editor edit = this.f6024b.edit();
        if (x2Var.mo6453c() != -1) {
            edit.putLong("last_card_updated_at", x2Var.mo6453c());
        }
        if (x2Var.mo6454d() != -1) {
            edit.putLong("last_full_sync_at", x2Var.mo6454d());
        }
        edit.apply();
    }

    /* renamed from: a */
    public static JSONObject m4773a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject3.put(next, jSONObject.get(next));
        }
        Iterator<String> keys2 = jSONObject2.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            if (f6022g.contains(next2)) {
                jSONObject3.put(next2, jSONObject.getBoolean(next2) || jSONObject2.getBoolean(next2));
            } else {
                jSONObject3.put(next2, jSONObject2.get(next2));
            }
        }
        return jSONObject3;
    }

    /* renamed from: a */
    public void mo6385a(String str, JSONObject jSONObject) {
        SharedPreferences.Editor edit = this.f6023a.edit();
        if (jSONObject != null) {
            edit.putString(str, jSONObject.toString());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo6383a(String str) {
        Set<String> b = mo6387b();
        b.add(str);
        this.f6024b.edit().putStringSet("dismissed", b).apply();
    }

    /* renamed from: a */
    public void mo6386a(Set<String> set) {
        Set<String> keySet = this.f6023a.getAll().keySet();
        SharedPreferences.Editor edit = this.f6023a.edit();
        for (String next : keySet) {
            if (!set.contains(next)) {
                String str = f6021f;
                AppboyLogger.m5448d(str, "Removing card from storage with id: " + next);
                edit.remove(next);
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public static boolean m4774a(JSONObject jSONObject, CardKey cardKey) {
        String contentCardsKey = cardKey.getContentCardsKey();
        if (jSONObject.has(contentCardsKey)) {
            return jSONObject.getBoolean(contentCardsKey);
        }
        return false;
    }
}
