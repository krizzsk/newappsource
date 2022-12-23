package com.appboy.enums;

import androidx.annotation.Keep;
import com.appboy.Constants;
import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@Keep
public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED("created", "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS(InAppMessageBase.EXTRAS, "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", (int) null),
    UPDATED("updated", (int) null),
    DISMISSED((String) null, "d"),
    REMOVED((String) null, "r"),
    PINNED((String) null, Constants.APPBOY_PUSH_PRIORITY_KEY),
    DISMISSIBLE((String) null, "db"),
    IS_TEST((String) null, Constants.APPBOY_PUSH_TITLE_KEY),
    READ((String) null, "read"),
    CLICKED((String) null, "cl"),
    BANNER_IMAGE_IMAGE("image", "i"),
    BANNER_IMAGE_URL("url", "u"),
    BANNER_IMAGE_DOMAIN("domain", (int) null),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE("image", "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION(TwitterUser.DESCRIPTION_KEY, "ds"),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION(TwitterUser.DESCRIPTION_KEY, "ds"),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE("image", "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION(TwitterUser.DESCRIPTION_KEY, "ds"),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");
    
    public static final String BANNER_IMAGE_KEY = "banner_image";
    public static final String CAPTIONED_IMAGE_KEY = "captioned_image";
    public static final String CONTROL_KEY = "control";
    public static final String SHORT_NEWS_KEY = "short_news";
    public static final String TAG = null;
    public static final String TEXT_ANNOUNCEMENT_KEY = "text_announcement";
    public static final Map<String, CardType> sCardTypeMap = null;
    public String mContentCardsKey;
    public String mFeedKey;

    @Keep
    public static class Provider {
        public static final Provider CONTENT_CARDS = null;
        public static final Provider NEWS_FEED = null;
        public final boolean mIsContentCards;

        static {
            CONTENT_CARDS = new Provider(true);
            NEWS_FEED = new Provider(false);
        }

        public Provider(boolean z) {
            this.mIsContentCards = z;
        }

        public CardType getCardTypeFromJson(JSONObject jSONObject) {
            String optString = jSONObject.optString(getKey(CardKey.TYPE), (String) null);
            if (!StringUtils.isNullOrEmpty(optString) && this.mIsContentCards && optString.equals(CardKey.SHORT_NEWS_KEY) && StringUtils.isNullOrEmpty(JsonUtils.getOptionalString(jSONObject, getKey(CardKey.SHORT_NEWS_IMAGE)))) {
                AppboyLogger.m5457v(CardKey.TAG, "Short News card doesn't contain image url, parsing type as Text Announcement");
                optString = CardKey.TEXT_ANNOUNCEMENT_KEY;
            }
            if (CardKey.sCardTypeMap.containsKey(optString)) {
                return (CardType) CardKey.sCardTypeMap.get(optString);
            }
            return CardType.DEFAULT;
        }

        public String getKey(CardKey cardKey) {
            return this.mIsContentCards ? cardKey.getContentCardsKey() : cardKey.getFeedKey();
        }

        public String getServerKeyFromCardType(CardType cardType) {
            for (Map.Entry entry : CardKey.sCardTypeMap.entrySet()) {
                if (cardType == entry.getValue()) {
                    return (String) entry.getKey();
                }
            }
            return null;
        }

        public boolean isContentCardProvider() {
            return this.mIsContentCards;
        }
    }

    /* access modifiers changed from: public */
    static {
        TAG = AppboyLogger.getBrazeLogTag(CardKey.class);
        HashMap hashMap = new HashMap();
        sCardTypeMap = hashMap;
        hashMap.put(BANNER_IMAGE_KEY, CardType.BANNER);
        hashMap.put(CAPTIONED_IMAGE_KEY, CardType.CAPTIONED_IMAGE);
        hashMap.put(TEXT_ANNOUNCEMENT_KEY, CardType.TEXT_ANNOUNCEMENT);
        hashMap.put(SHORT_NEWS_KEY, CardType.SHORT_NEWS);
        hashMap.put(CONTROL_KEY, CardType.CONTROL);
    }

    /* access modifiers changed from: public */
    CardKey(String str, String str2) {
        this.mFeedKey = str;
        this.mContentCardsKey = str2;
    }

    public String getContentCardsKey() {
        return this.mContentCardsKey;
    }

    public String getFeedKey() {
        return this.mFeedKey;
    }
}
