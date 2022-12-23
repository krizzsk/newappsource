package com.appboy.p044ui.feed.listeners;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.actions.IAction;

/* renamed from: com.appboy.ui.feed.listeners.IFeedClickActionListener */
public interface IFeedClickActionListener {
    boolean onFeedCardClicked(Context context, Card card, IAction iAction);
}
