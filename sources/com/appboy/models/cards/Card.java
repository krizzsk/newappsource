package com.appboy.models.cards;

import androidx.annotation.Keep;
import com.appboy.enums.CardCategory;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.braze.storage.ICardStorageProvider;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import org.json.JSONArray;
import org.json.JSONObject;
import p030bo.app.C1632m;
import p030bo.app.C1707v1;

@Keep
public class Card extends Observable implements IPutIntoJson<JSONObject> {
    public static final long DEFAULT_EXPIRES_AT_VALUE = -1;
    public static final String TAG = AppboyLogger.getBrazeLogTag(Card.class);
    public final C1707v1 mBrazeManager;
    public final C1632m mCardAnalyticsProvider;
    public final ICardStorageProvider<?> mCardStorageProvider;
    public final EnumSet<CardCategory> mCategories;
    public final long mCreated;
    public final long mExpiresAt;
    public final Map<String, String> mExtras;
    public final String mId;
    public boolean mIsClicked;
    public final boolean mIsContentCard;
    public boolean mIsDismissed;
    public boolean mIsDismissibleByUser;
    public boolean mIsPinned;
    public boolean mIsRead;
    public boolean mIsRemoved;
    public boolean mIsTest;
    public final JSONObject mObject;
    public boolean mOpenUriInWebview;
    public final long mUpdated;
    public boolean mViewed;

    public Card(JSONObject jSONObject, CardKey.Provider provider) {
        this(jSONObject, provider, (C1707v1) null, (ICardStorageProvider<?>) null, (C1632m) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        if (this.mUpdated != card.mUpdated) {
            return false;
        }
        return this.mId.equals(card.mId);
    }

    public CardType getCardType() {
        return CardType.DEFAULT;
    }

    public EnumSet<CardCategory> getCategories() {
        return this.mCategories;
    }

    public long getCreated() {
        return this.mCreated;
    }

    public long getExpiresAt() {
        return this.mExpiresAt;
    }

    public Map<String, String> getExtras() {
        return this.mExtras;
    }

    public String getId() {
        return this.mId;
    }

    public boolean getIsDismissibleByUser() {
        return this.mIsDismissibleByUser;
    }

    public boolean getIsPinned() {
        return this.mIsPinned;
    }

    public boolean getOpenUriInWebView() {
        return this.mOpenUriInWebview;
    }

    public long getUpdated() {
        return this.mUpdated;
    }

    public String getUrl() {
        return null;
    }

    public boolean getViewed() {
        return this.mViewed;
    }

    public int hashCode() {
        long j = this.mUpdated;
        return (this.mId.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isClicked() {
        return this.mIsClicked;
    }

    public boolean isContentCard() {
        return this.mIsContentCard;
    }

    public boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    public boolean isDismissed() {
        return this.mIsDismissed;
    }

    @Deprecated
    public boolean isEqualToCard(Card card) {
        return equals(card);
    }

    public boolean isExpired() {
        return getExpiresAt() != -1 && getExpiresAt() <= DateTimeUtils.nowInSeconds();
    }

    public boolean isInCategorySet(EnumSet<CardCategory> enumSet) {
        Iterator<CardCategory> it = enumSet.iterator();
        while (it.hasNext()) {
            if (this.mCategories.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean isIndicatorHighlighted() {
        return this.mIsRead;
    }

    @Deprecated
    public boolean isRead() {
        return isIndicatorHighlighted();
    }

    public boolean isRemoved() {
        return this.mIsRemoved;
    }

    public boolean isTest() {
        return this.mIsTest;
    }

    public boolean isValidCard() {
        if (!StringUtils.isNullOrBlank(this.mId)) {
            return true;
        }
        AppboyLogger.m5459w(TAG, "Card ID cannot be null");
        return false;
    }

    public boolean logClick() {
        try {
            this.mIsClicked = true;
            if (this.mBrazeManager == null || this.mCardAnalyticsProvider == null || this.mCardStorageProvider == null || !isValidCard()) {
                String str = TAG;
                AppboyLogger.m5459w(str, "Failed to log card clicked for id: " + this.mId);
                return false;
            }
            this.mBrazeManager.mo6243b(this.mCardAnalyticsProvider.mo6164a(this.mId));
            this.mCardStorageProvider.markCardAsClicked(this.mId);
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Logged click for card with id: " + this.mId);
            return true;
        } catch (Exception e) {
            String str3 = TAG;
            StringBuilder k = C13555b.m33972k("Failed to log card as clicked for id: ");
            k.append(this.mId);
            AppboyLogger.m5460w(str3, k.toString(), e);
            return false;
        }
    }

    public boolean logImpression() {
        try {
            if (this.mBrazeManager == null || this.mCardAnalyticsProvider == null || this.mCardStorageProvider == null || !isValidCard()) {
                return false;
            }
            if (!isControl()) {
                String str = TAG;
                AppboyLogger.m5457v(str, "Logging impression event for card with id: " + this.mId);
                this.mBrazeManager.mo6243b(this.mCardAnalyticsProvider.mo6166c(this.mId));
            } else {
                String str2 = TAG;
                AppboyLogger.m5457v(str2, "Logging control impression event for card with id: " + this.mId);
                this.mBrazeManager.mo6243b(this.mCardAnalyticsProvider.mo6165b(this.mId));
            }
            this.mCardStorageProvider.markCardAsViewed(this.mId);
            return true;
        } catch (Exception e) {
            String str3 = TAG;
            StringBuilder k = C13555b.m33972k("Failed to log card impression for card id: ");
            k.append(this.mId);
            AppboyLogger.m5460w(str3, k.toString(), e);
            return false;
        }
    }

    public void setIndicatorHighlighted(boolean z) {
        ICardStorageProvider<?> iCardStorageProvider;
        this.mIsRead = z;
        setChanged();
        notifyObservers();
        if (z && (iCardStorageProvider = this.mCardStorageProvider) != null) {
            try {
                iCardStorageProvider.markCardAsVisuallyRead(this.mId);
            } catch (Exception e) {
                AppboyLogger.m5449d(TAG, "Failed to mark card indicator as highlighted.", (Throwable) e);
            }
        }
    }

    public void setIsDismissed(boolean z) {
        if (!this.mIsDismissed || !z) {
            this.mIsDismissed = z;
            ICardStorageProvider<?> iCardStorageProvider = this.mCardStorageProvider;
            if (iCardStorageProvider != null) {
                iCardStorageProvider.markCardAsDismissed(this.mId);
            }
            if (z) {
                try {
                    if (this.mBrazeManager != null && this.mCardAnalyticsProvider != null && isValidCard()) {
                        this.mBrazeManager.mo6243b(this.mCardAnalyticsProvider.mo6167d(this.mId));
                    }
                } catch (Exception e) {
                    AppboyLogger.m5460w(TAG, "Failed to log card dismissed.", e);
                }
            }
        } else {
            AppboyLogger.m5459w(TAG, "Cannot dismiss a card more than once. Doing nothing.");
        }
    }

    public void setIsDismissibleByUser(boolean z) {
        this.mIsDismissibleByUser = z;
    }

    public void setIsPinned(boolean z) {
        this.mIsPinned = z;
    }

    @Deprecated
    public void setIsRead(boolean z) {
        setIndicatorHighlighted(z);
    }

    public void setIsTest(boolean z) {
        this.mIsTest = z;
    }

    public void setViewed(boolean z) {
        this.mViewed = z;
        ICardStorageProvider<?> iCardStorageProvider = this.mCardStorageProvider;
        if (iCardStorageProvider != null) {
            iCardStorageProvider.markCardAsViewed(this.mId);
        }
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Card{\nmExtras=");
        k.append(this.mExtras);
        k.append("\nmId='");
        k.append(this.mId);
        k.append("'\nmCreated=");
        k.append(this.mCreated);
        k.append("\nmUpdated=");
        k.append(this.mUpdated);
        k.append("\nmExpiresAt=");
        k.append(this.mExpiresAt);
        k.append("\nmCategories=");
        k.append(this.mCategories);
        k.append("\nmIsContentCard=");
        k.append(this.mIsContentCard);
        k.append("\nmViewed=");
        k.append(this.mViewed);
        k.append("\nmIsRead=");
        k.append(this.mIsRead);
        k.append("\nmIsDismissed=");
        k.append(this.mIsDismissed);
        k.append("\nmIsRemoved=");
        k.append(this.mIsRemoved);
        k.append("\nmIsPinned=");
        k.append(this.mIsPinned);
        k.append("\nmIsClicked=");
        k.append(this.mIsClicked);
        k.append("\nmOpenUriInWebview=");
        k.append(this.mOpenUriInWebview);
        k.append("\nmIsDismissibleByUser=");
        k.append(this.mIsDismissibleByUser);
        k.append("\nmIsTest=");
        k.append(this.mIsTest);
        k.append("\njson=");
        k.append(JsonUtils.getPrettyPrintedString(this.mObject));
        k.append("\n}\n");
        return k.toString();
    }

    public Card(JSONObject jSONObject, CardKey.Provider provider, C1707v1 v1Var, ICardStorageProvider<?> iCardStorageProvider, C1632m mVar) {
        this.mObject = jSONObject;
        this.mBrazeManager = v1Var;
        this.mCardStorageProvider = iCardStorageProvider;
        this.mCardAnalyticsProvider = mVar;
        this.mIsContentCard = provider.isContentCardProvider();
        this.mExtras = JsonUtils.convertJSONObjectToMap(jSONObject.optJSONObject(provider.getKey(CardKey.EXTRAS)));
        this.mId = jSONObject.getString(provider.getKey(CardKey.ID));
        this.mViewed = jSONObject.optBoolean(provider.getKey(CardKey.VIEWED));
        this.mIsDismissed = jSONObject.optBoolean(provider.getKey(CardKey.DISMISSED), false);
        this.mIsPinned = jSONObject.optBoolean(provider.getKey(CardKey.PINNED), false);
        this.mCreated = jSONObject.getLong(provider.getKey(CardKey.CREATED));
        this.mExpiresAt = jSONObject.optLong(provider.getKey(CardKey.EXPIRES_AT), -1);
        this.mOpenUriInWebview = jSONObject.optBoolean(provider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.mIsRemoved = jSONObject.optBoolean(provider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jSONObject.optJSONArray(provider.getKey(CardKey.CATEGORIES));
        if (optJSONArray == null || optJSONArray.length() == 0) {
            this.mCategories = EnumSet.of(CardCategory.NO_CATEGORY);
        } else {
            this.mCategories = EnumSet.noneOf(CardCategory.class);
            for (int i = 0; i < optJSONArray.length(); i++) {
                CardCategory cardCategory = CardCategory.get(optJSONArray.getString(i));
                if (cardCategory != null) {
                    this.mCategories.add(cardCategory);
                }
            }
        }
        this.mUpdated = jSONObject.optLong(provider.getKey(CardKey.UPDATED), this.mCreated);
        this.mIsDismissibleByUser = jSONObject.optBoolean(provider.getKey(CardKey.DISMISSIBLE), false);
        this.mIsRead = jSONObject.optBoolean(provider.getKey(CardKey.READ), this.mViewed);
        this.mIsClicked = jSONObject.optBoolean(provider.getKey(CardKey.CLICKED), false);
        this.mIsTest = jSONObject.optBoolean(provider.getKey(CardKey.IS_TEST), false);
    }

    public JSONObject forJsonPut() {
        return this.mObject;
    }
}
