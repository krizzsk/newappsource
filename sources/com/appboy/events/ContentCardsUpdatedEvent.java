package com.appboy.events;

import androidx.annotation.Keep;
import com.appboy.models.cards.Card;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Keep
public class ContentCardsUpdatedEvent {
    public final List<Card> mContentCards;
    public final boolean mIsFromOfflineStorage;
    public final long mTimestampSeconds;
    public final String mUserId;

    public ContentCardsUpdatedEvent(List<Card> list, String str, long j, boolean z) {
        this.mUserId = str;
        this.mContentCards = list;
        this.mTimestampSeconds = j;
        this.mIsFromOfflineStorage = z;
    }

    public List<Card> getAllCards() {
        return new ArrayList(this.mContentCards);
    }

    public int getCardCount() {
        return this.mContentCards.size();
    }

    public long getLastUpdatedInSecondsFromEpoch() {
        return this.mTimestampSeconds;
    }

    public int getUnviewedCardCount() {
        int i = 0;
        for (Card viewed : this.mContentCards) {
            if (!viewed.getViewed()) {
                i++;
            }
        }
        return i;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isEmpty() {
        return this.mContentCards.isEmpty();
    }

    public boolean isFromOfflineStorage() {
        return this.mIsFromOfflineStorage;
    }

    public boolean isTimestampOlderThan(long j) {
        return TimeUnit.SECONDS.toMillis(this.mTimestampSeconds + j) < System.currentTimeMillis();
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ContentCardsUpdatedEvent{mUserId='");
        C25541a.m63890u(k, this.mUserId, '\'', ", mTimestampSeconds=");
        k.append(this.mTimestampSeconds);
        k.append(", mIsFromOfflineStorage=");
        k.append(this.mIsFromOfflineStorage);
        k.append(", card count=");
        k.append(getCardCount());
        k.append('}');
        return k.toString();
    }
}
