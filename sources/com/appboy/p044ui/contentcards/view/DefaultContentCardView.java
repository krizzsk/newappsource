package com.appboy.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.view.DefaultContentCardView */
public class DefaultContentCardView extends BaseContentCardView<Card> {
    public DefaultContentCardView(Context context) {
        super(context);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        return new ContentCardViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_default_content_card, viewGroup, false), false);
    }
}
