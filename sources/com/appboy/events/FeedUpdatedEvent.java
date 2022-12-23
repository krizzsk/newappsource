package com.appboy.events;

import androidx.annotation.Keep;
import com.appboy.enums.CardCategory;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import p358af.C13437d;

@Keep
public final class FeedUpdatedEvent {
    public static final String TAG = AppboyLogger.getBrazeLogTag(FeedUpdatedEvent.class);
    public final List<Card> mFeedCards;
    public final boolean mFromOfflineStorage;
    public final long mTimestamp;
    public final String mUserId;

    public FeedUpdatedEvent(List<Card> list, String str, boolean z, long j) {
        this.mUserId = str;
        this.mFromOfflineStorage = z;
        list.getClass();
        this.mFeedCards = list;
        this.mTimestamp = j;
    }

    public int getCardCount() {
        return getCardCount(CardCategory.getAllCategories());
    }

    public List<Card> getFeedCards() {
        return getFeedCards(CardCategory.getAllCategories());
    }

    public int getUnreadCardCount() {
        return getUnreadCardCount(CardCategory.getAllCategories());
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isFromOfflineStorage() {
        return this.mFromOfflineStorage;
    }

    public long lastUpdatedInSecondsFromEpoch() {
        return this.mTimestamp;
    }

    public String toString() {
        StringBuilder n = C13437d.m33708n("FeedUpdatedEvent{", "mFeedCards=");
        n.append(this.mFeedCards);
        n.append(", mUserId='");
        C25541a.m63890u(n, this.mUserId, '\'', ", mFromOfflineStorage=");
        n.append(this.mFromOfflineStorage);
        n.append(", mTimestamp=");
        n.append(this.mTimestamp);
        n.append('}');
        return n.toString();
    }

    public int getCardCount(CardCategory cardCategory) {
        return getCardCount((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public List<Card> getFeedCards(CardCategory cardCategory) {
        return getFeedCards((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public int getUnreadCardCount(CardCategory cardCategory) {
        return getUnreadCardCount((EnumSet<CardCategory>) EnumSet.of(cardCategory));
    }

    public int getCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            AppboyLogger.m5453i(TAG, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.mFeedCards.size();
        } else if (!enumSet.isEmpty()) {
            return getFeedCards(enumSet).size();
        } else {
            AppboyLogger.m5459w(TAG, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
    }

    public List<Card> getFeedCards(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            try {
                AppboyLogger.m5453i(TAG, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = CardCategory.getAllCategories();
            } catch (Exception e) {
                String str = TAG;
                AppboyLogger.m5460w(str, "Unable to get cards with categories[" + enumSet + "]. Ignoring.", e);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            AppboyLogger.m5459w(TAG, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Card next : this.mFeedCards) {
            if (next.isInCategorySet(enumSet) && !next.isExpired()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public int getUnreadCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            AppboyLogger.m5459w(TAG, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return getUnreadCardCount(CardCategory.getAllCategories());
        }
        int i = 0;
        if (enumSet.isEmpty()) {
            AppboyLogger.m5459w(TAG, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (Card next : this.mFeedCards) {
            if (next.isInCategorySet(enumSet) && !next.getViewed() && !next.isExpired()) {
                i++;
            }
        }
        return i;
    }
}
