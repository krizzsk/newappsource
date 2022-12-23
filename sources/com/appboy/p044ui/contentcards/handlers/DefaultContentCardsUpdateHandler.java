package com.appboy.p044ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.models.cards.Card;
import java.util.Collections;
import java.util.List;
import p220q5.C6179a;

/* renamed from: com.appboy.ui.contentcards.handlers.DefaultContentCardsUpdateHandler */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() {
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel parcel) {
            return new DefaultContentCardsUpdateHandler();
        }

        public DefaultContentCardsUpdateHandler[] newArray(int i) {
            return new DefaultContentCardsUpdateHandler[i];
        }
    };

    /* access modifiers changed from: private */
    public static /* synthetic */ int lambda$handleCardUpdate$0(Card card, Card card2) {
        if (card.getIsPinned() && !card2.getIsPinned()) {
            return -1;
        }
        if (!card.getIsPinned() && card2.getIsPinned()) {
            return 1;
        }
        if (card.getUpdated() > card2.getUpdated()) {
            return -1;
        }
        if (card.getUpdated() < card2.getUpdated()) {
            return 1;
        }
        return 0;
    }

    public int describeContents() {
        return 0;
    }

    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        List<Card> allCards = contentCardsUpdatedEvent.getAllCards();
        Collections.sort(allCards, new C6179a(0));
        return allCards;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
