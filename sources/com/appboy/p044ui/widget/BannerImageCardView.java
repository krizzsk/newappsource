package com.appboy.p044ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.feed.view.BaseFeedCardView;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p310x5.C7156a;

/* renamed from: com.appboy.ui.widget.BannerImageCardView */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = AppboyLogger.getBrazeLogTag(BannerImageCardView.class);
    private float mAspectRatio;
    private IAction mCardAction;
    private final ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, (BannerImageCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.mContext, bannerImageCard, this.mCardAction, TAG);
    }

    public int getLayoutResource() {
        return R$layout.com_appboy_banner_image_card;
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_appboy_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != BitmapDescriptorFactory.HUE_RED) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, this.mCard);
        this.mCardAction = BaseCardView.getUriActionForCard(bannerImageCard);
        setOnClickListener(new C7156a(0, this, bannerImageCard));
    }
}
