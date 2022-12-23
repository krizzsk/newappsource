package com.appboy.p044ui.widget;

import android.content.Context;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.feed.view.BaseFeedCardView;
import com.appboy.support.AppboyLogger;

/* renamed from: com.appboy.ui.widget.DefaultCardView */
public class DefaultCardView extends BaseFeedCardView<Card> {
    private static final String TAG = AppboyLogger.getBrazeLogTag(DefaultCardView.class);

    public DefaultCardView(Context context) {
        this(context, (Card) null);
    }

    public int getLayoutResource() {
        return R$layout.com_appboy_default_card;
    }

    public void onSetCard(Card card) {
        String str = TAG;
        StringBuilder k = C13555b.m33972k("onSetCard called for blank view with: ");
        k.append(card.toString());
        AppboyLogger.m5459w(str, k.toString());
    }

    public DefaultCardView(Context context, Card card) {
        super(context);
        if (card != null) {
            setCard(card);
        }
    }
}
