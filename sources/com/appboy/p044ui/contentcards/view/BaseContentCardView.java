package com.appboy.p044ui.contentcards.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.p044ui.contentcards.AppboyContentCardsManager;
import com.appboy.p044ui.widget.BaseCardView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p233r5.C6253a;

/* renamed from: com.appboy.ui.contentcards.view.BaseContentCardView */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    public BaseContentCardView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$bindViewHolder$0(Card card, UriAction uriAction, View view) {
        handleCardClick(this.mContext, card, uriAction, getClassLogTag());
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, T t) {
        boolean z;
        contentCardViewHolder.setPinnedIconVisible(t.getIsPinned());
        boolean z2 = true;
        if (!this.mConfigurationProvider.isContentCardsUnreadVisualIndicatorEnabled() || t.isIndicatorHighlighted()) {
            z = false;
        } else {
            z = true;
        }
        contentCardViewHolder.setUnreadBarVisible(z);
        UriAction uriActionForCard = BaseCardView.getUriActionForCard(t);
        contentCardViewHolder.itemView.setOnClickListener(new C6253a(0, this, t, uriActionForCard));
        if (uriActionForCard == null) {
            z2 = false;
        }
        contentCardViewHolder.setActionHintVisible(z2);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        return AppboyContentCardsManager.getInstance().getContentCardsActionListener().onContentCardClicked(context, card, iAction);
    }

    @TargetApi(21)
    public void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public void setOptionalCardImage(ImageView imageView, float f, String str, float f2, Card card) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = f2;
        }
        if (imageView != null) {
            setImageViewToUrl(imageView, str, f, card);
        }
    }

    public void setViewBackground(View view) {
        view.setBackground(getResources().getDrawable(R$drawable.com_appboy_content_card_background));
    }
}
