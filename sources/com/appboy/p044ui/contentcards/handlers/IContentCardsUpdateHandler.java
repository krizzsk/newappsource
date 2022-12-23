package com.appboy.p044ui.contentcards.handlers;

import android.os.Parcelable;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.models.cards.Card;
import java.util.List;

/* renamed from: com.appboy.ui.contentcards.handlers.IContentCardsUpdateHandler */
public interface IContentCardsUpdateHandler extends Parcelable {
    List<Card> handleCardUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent);
}
