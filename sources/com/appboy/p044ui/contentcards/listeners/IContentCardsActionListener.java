package com.appboy.p044ui.contentcards.listeners;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.actions.IAction;

/* renamed from: com.appboy.ui.contentcards.listeners.IContentCardsActionListener */
public interface IContentCardsActionListener {
    boolean onContentCardClicked(Context context, Card card, IAction iAction);

    void onContentCardDismissed(Context context, Card card);
}
