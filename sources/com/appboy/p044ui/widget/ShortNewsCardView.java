package com.appboy.p044ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.feed.view.BaseFeedCardView;
import com.appboy.support.AppboyLogger;
import p310x5.C7158c;

/* renamed from: com.appboy.ui.widget.ShortNewsCardView */
public class ShortNewsCardView extends BaseFeedCardView<ShortNewsCard> {
    private static final String TAG = AppboyLogger.getBrazeLogTag(ShortNewsCardView.class);
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, (ShortNewsCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(ShortNewsCard shortNewsCard, View view) {
        handleCardClick(this.mContext, shortNewsCard, this.mCardAction, TAG);
    }

    public int getLayoutResource() {
        return R$layout.com_appboy_short_news_card;
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortNewsCard) {
        super(context);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_short_news_card_description);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_short_news_card_title);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_short_news_card_domain);
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_short_news_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (shortNewsCard != null) {
            setCard(shortNewsCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(ShortNewsCard shortNewsCard) {
        this.mDescription.setText(shortNewsCard.getDescription());
        setOptionalTextView(this.mTitle, shortNewsCard.getTitle());
        setOptionalTextView(this.mDomain, shortNewsCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(shortNewsCard);
        setOnClickListener(new C7158c(0, this, shortNewsCard));
        setImageViewToUrl(this.mImage, shortNewsCard.getImageUrl(), 1.0f, this.mCard);
    }
}
