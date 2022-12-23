package com.appboy.p044ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.contentcards.view.ContentCardViewHolder;
import java.util.List;

/* renamed from: com.appboy.ui.contentcards.handlers.IContentCardsViewBindingHandler */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(Context context, List<Card> list, int i);

    void onBindViewHolder(Context context, List<Card> list, ContentCardViewHolder contentCardViewHolder, int i);

    ContentCardViewHolder onCreateViewHolder(Context context, List<Card> list, ViewGroup viewGroup, int i);
}
