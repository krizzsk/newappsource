package com.usebutton.sdk.internal.purchasepath;

import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.Card;
import com.usebutton.sdk.purchasepath.CardList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CardListImpl implements CardList {
    private final BrowserInterface browser;
    private ArrayList<Card> cardList = new ArrayList<>();
    private final Listener listener;

    public interface Listener {
        void onCardsChanged();
    }

    public CardListImpl(BrowserInterface browserInterface, Listener listener2) {
        this.browser = browserInterface;
        this.listener = listener2;
    }

    private void refreshCards(List<Card> list, List<Card> list2) {
        for (Card browser2 : list) {
            browser2.setBrowser((BrowserInterface) null);
        }
        for (Card browser3 : list2) {
            browser3.setBrowser(this.browser);
        }
    }

    public void addCard(Card card) {
        insertCard(card, this.cardList.size());
    }

    public Card getCard(Object obj) {
        Iterator<Card> it = this.cardList.iterator();
        while (it.hasNext()) {
            Card next = it.next();
            if (obj.equals(next.getKey())) {
                return next;
            }
        }
        return null;
    }

    public List<Card> getCards() {
        return this.cardList;
    }

    public void insertCard(Card card, int i) {
        ArrayList arrayList = new ArrayList(this.cardList);
        arrayList.add(i, card);
        setCards(arrayList);
    }

    public void removeAllCards() {
        setCards(Collections.emptyList());
    }

    public void removeCard(Object obj) {
        Card card = getCard(obj);
        if (card != null) {
            ArrayList arrayList = new ArrayList(this.cardList);
            arrayList.remove(card);
            setCards(arrayList);
        }
    }

    public void replaceCard(Card card, Object obj) {
        Card card2 = getCard(obj);
        if (card2 != null) {
            ArrayList arrayList = new ArrayList(this.cardList);
            int indexOf = this.cardList.indexOf(card2);
            arrayList.remove(card2);
            arrayList.add(indexOf, card);
            setCards(arrayList);
        }
    }

    public void setCards(List<Card> list) {
        refreshCards(this.cardList, list);
        this.cardList.clear();
        this.cardList.addAll(list);
        this.listener.onCardsChanged();
    }
}
