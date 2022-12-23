package com.usebutton.sdk.internal.purchasepath;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.BrowserProxy;
import com.usebutton.sdk.internal.purchasepath.CardListImpl;
import com.usebutton.sdk.purchasepath.Card;
import com.usebutton.sdk.purchasepath.CardHelper;
import com.usebutton.sdk.purchasepath.CardList;
import java.util.ArrayList;
import java.util.List;

public class CardListAdapter extends RecyclerView.Adapter<RecyclerView.C1119a0> implements CardListImpl.Listener {
    private List<Card> cards = new ArrayList();
    private Listener listener;
    private CardList persistentCardList;
    private CardList privateCardList;
    private final BrowserProxy proxy;
    private CardList publicCardList;

    public interface Listener {
        void onCardListEmpty();

        void onTopCardChanged(Card card);
    }

    public CardListAdapter(BrowserProxy browserProxy) {
        this.proxy = browserProxy;
        this.publicCardList = new CardListImpl(browserProxy, this);
        this.privateCardList = new CardListImpl(browserProxy, this);
        this.persistentCardList = new CardListImpl(browserProxy, this);
    }

    private void reconstructCardList() {
        this.cards.clear();
        this.cards.addAll(this.publicCardList.getCards());
        this.cards.addAll(this.persistentCardList.getCards());
        if (this.proxy.getPageOwner() == PageOwner.PRIVATE) {
            this.cards.addAll(0, this.privateCardList.getCards());
        }
        if (this.listener != null) {
            if (!this.cards.isEmpty()) {
                this.listener.onTopCardChanged(this.cards.get(0));
                return;
            }
            this.listener.onCardListEmpty();
        }
    }

    public int getItemCount() {
        return this.cards.size();
    }

    public long getItemId(int i) {
        return (long) CardHelper.uniqueIdForCard(this.cards.get(i));
    }

    public CardList getPersistentCardList() {
        return this.persistentCardList;
    }

    public CardList getPrivateCardList() {
        return this.privateCardList;
    }

    public CardList getPublicCardList() {
        return this.publicCardList;
    }

    public List<Card> getUiCards() {
        return this.cards;
    }

    public void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
        Card card = this.cards.get(i);
        ViewGroup viewGroup = (ViewGroup) a0Var.itemView;
        View createView = card.createView(viewGroup);
        viewGroup.removeAllViews();
        viewGroup.addView(createView);
        card.bindView(createView);
    }

    public void onCardsChanged() {
        reloadCards();
    }

    public RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerView.C1119a0((CardView) LayoutInflater.from(viewGroup.getContext()).inflate(C12238R.layout.btn_view_card, viewGroup, false)) {
            public String toString() {
                return super.toString();
            }
        };
    }

    public void reloadCards() {
        reconstructCardList();
        notifyDataSetChanged();
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
