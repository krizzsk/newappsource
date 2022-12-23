package com.usebutton.sdk.purchasepath;

import java.util.List;

public interface CardList {
    void addCard(Card card);

    Card getCard(Object obj);

    List<Card> getCards();

    void insertCard(Card card, int i);

    void removeAllCards();

    void removeCard(Object obj);

    void replaceCard(Card card, Object obj);

    void setCards(List<Card> list);
}
