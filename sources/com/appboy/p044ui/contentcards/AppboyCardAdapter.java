package com.appboy.p044ui.contentcards;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1164b;
import androidx.recyclerview.widget.C1208m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.appboy.p044ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.appboy.p044ui.contentcards.view.ContentCardViewHolder;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p207p5.C6091a;
import p207p5.C6092b;

/* renamed from: com.appboy.ui.contentcards.AppboyCardAdapter */
public class AppboyCardAdapter extends RecyclerView.Adapter<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyCardAdapter.class);
    private final List<Card> mCardData;
    private final IContentCardsViewBindingHandler mContentCardsViewBindingHandler;
    private final Context mContext;
    private final Handler mHandler;
    private Set<String> mImpressedCardIds = new HashSet();
    private final LinearLayoutManager mLayoutManager;

    /* renamed from: com.appboy.ui.contentcards.AppboyCardAdapter$CardListDiffCallback */
    public static class CardListDiffCallback extends C1208m.C1210b {
        private final List<Card> mNewCards;
        private final List<Card> mOldCards;

        public CardListDiffCallback(List<Card> list, List<Card> list2) {
            this.mOldCards = list;
            this.mNewCards = list2;
        }

        private boolean doItemsShareIds(int i, int i2) {
            return this.mOldCards.get(i).getId().equals(this.mNewCards.get(i2).getId());
        }

        public boolean areContentsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        public boolean areItemsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        public int getNewListSize() {
            return this.mNewCards.size();
        }

        public int getOldListSize() {
            return this.mOldCards.size();
        }
    }

    public AppboyCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.mContext = context;
        this.mCardData = list;
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mLayoutManager = linearLayoutManager;
        this.mContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        setHasStableIds(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$markOnScreenCardsAsRead$1(int i, int i2) {
        notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewDetachedFromWindow$0(int i) {
        notifyItemChanged(i);
    }

    public Card getCardAtIndex(int i) {
        if (i >= 0 && i < this.mCardData.size()) {
            return this.mCardData.get(i);
        }
        String str = TAG;
        StringBuilder r = C25541a.m63887r("Cannot return card at index: ", i, " in cards list of size: ");
        r.append(this.mCardData.size());
        AppboyLogger.m5448d(str, r.toString());
        return null;
    }

    public List<String> getImpressedCardIds() {
        return new ArrayList(this.mImpressedCardIds);
    }

    public int getItemCount() {
        return this.mCardData.size();
    }

    public long getItemId(int i) {
        Card cardAtIndex = getCardAtIndex(i);
        if (cardAtIndex != null) {
            return (long) cardAtIndex.getId().hashCode();
        }
        return 0;
    }

    public int getItemViewType(int i) {
        return this.mContentCardsViewBindingHandler.getItemViewType(this.mContext, this.mCardData, i);
    }

    public boolean isAdapterPositionOnScreen(int i) {
        int min = Math.min(this.mLayoutManager.findFirstVisibleItemPosition(), this.mLayoutManager.findFirstCompletelyVisibleItemPosition());
        int max = Math.max(this.mLayoutManager.findLastVisibleItemPosition(), this.mLayoutManager.findLastCompletelyVisibleItemPosition());
        if (min > i || max < i) {
            return false;
        }
        return true;
    }

    public boolean isControlCardAtPosition(int i) {
        Card cardAtIndex = getCardAtIndex(i);
        if (cardAtIndex == null || !cardAtIndex.isControl()) {
            return false;
        }
        return true;
    }

    public boolean isItemDismissable(int i) {
        if (this.mCardData.isEmpty()) {
            return false;
        }
        return this.mCardData.get(i).getIsDismissibleByUser();
    }

    public void logImpression(Card card) {
        if (card != null) {
            if (!this.mImpressedCardIds.contains(card.getId())) {
                card.logImpression();
                this.mImpressedCardIds.add(card.getId());
                String str = TAG;
                StringBuilder k = C13555b.m33972k("Logged impression for card ");
                k.append(card.getId());
                AppboyLogger.m5457v(str, k.toString());
            } else {
                String str2 = TAG;
                StringBuilder k2 = C13555b.m33972k("Already counted impression for card ");
                k2.append(card.getId());
                AppboyLogger.m5457v(str2, k2.toString());
            }
            if (!card.getViewed()) {
                card.setViewed(true);
            }
        }
    }

    public void markOnScreenCardsAsRead() {
        if (this.mCardData.isEmpty()) {
            AppboyLogger.m5448d(TAG, "Card list is empty. Not marking on-screen cards as read.");
            return;
        }
        int findFirstVisibleItemPosition = this.mLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.mLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + findFirstVisibleItemPosition + " . Last visible: " + findLastVisibleItemPosition);
            return;
        }
        for (int i = findFirstVisibleItemPosition; i <= findLastVisibleItemPosition; i++) {
            Card cardAtIndex = getCardAtIndex(i);
            if (cardAtIndex != null) {
                cardAtIndex.setIndicatorHighlighted(true);
            }
        }
        this.mHandler.post(new C6091a(this, findLastVisibleItemPosition, findFirstVisibleItemPosition));
    }

    public void onItemDismiss(int i) {
        Card remove = this.mCardData.remove(i);
        remove.setIsDismissed(true);
        notifyItemRemoved(i);
        AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardDismissed(this.mContext, remove);
    }

    public synchronized void replaceCards(List<Card> list) {
        C1208m.C1212d a = C1208m.m3293a(new CardListDiffCallback(this.mCardData, list), true);
        this.mCardData.clear();
        this.mCardData.addAll(list);
        a.mo5103b(new C1164b(this));
    }

    public void setImpressedCardIds(List<String> list) {
        this.mImpressedCardIds = new HashSet(list);
    }

    public void onBindViewHolder(ContentCardViewHolder contentCardViewHolder, int i) {
        this.mContentCardsViewBindingHandler.onBindViewHolder(this.mContext, this.mCardData, contentCardViewHolder, i);
    }

    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.mContentCardsViewBindingHandler.onCreateViewHolder(this.mContext, this.mCardData, viewGroup, i);
    }

    public void onViewAttachedToWindow(ContentCardViewHolder contentCardViewHolder) {
        super.onViewAttachedToWindow(contentCardViewHolder);
        if (!this.mCardData.isEmpty()) {
            int adapterPosition = contentCardViewHolder.getAdapterPosition();
            if (adapterPosition == -1 || !isAdapterPositionOnScreen(adapterPosition)) {
                String str = TAG;
                AppboyLogger.m5457v(str, "The card at position " + adapterPosition + " isn't on screen or does not have a valid adapter position. Not logging impression.");
                return;
            }
            logImpression(getCardAtIndex(adapterPosition));
        }
    }

    public void onViewDetachedFromWindow(ContentCardViewHolder contentCardViewHolder) {
        super.onViewDetachedFromWindow(contentCardViewHolder);
        if (!this.mCardData.isEmpty()) {
            int adapterPosition = contentCardViewHolder.getAdapterPosition();
            if (adapterPosition == -1 || !isAdapterPositionOnScreen(adapterPosition)) {
                String str = TAG;
                AppboyLogger.m5457v(str, "The card at position " + adapterPosition + " isn't on screen or does not have a valid adapter position. Not marking as read.");
                return;
            }
            Card cardAtIndex = getCardAtIndex(adapterPosition);
            if (cardAtIndex != null) {
                cardAtIndex.setIndicatorHighlighted(true);
                this.mHandler.post(new C6092b(this, adapterPosition));
            }
        }
    }
}
