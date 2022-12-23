package com.appboy.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;

/* renamed from: com.appboy.ui.contentcards.view.BannerImageContentCardView */
public class BannerImageContentCardView extends BaseContentCardView<BannerImageCard> {

    /* renamed from: com.appboy.ui.contentcards.view.BannerImageContentCardView$ViewHolder */
    public class ViewHolder extends ContentCardViewHolder {
        private final ImageView mCardImage;

        public ViewHolder(BannerImageContentCardView bannerImageContentCardView, View view) {
            super(view, bannerImageContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = (ImageView) view.findViewById(R$id.com_appboy_content_cards_banner_image_card_image);
        }

        public ImageView getImageView() {
            return this.mCardImage;
        }
    }

    public BannerImageContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_banner_image_content_card, viewGroup, false);
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, BannerImageCard bannerImageCard) {
        super.bindViewHolder(contentCardViewHolder, bannerImageCard);
        setOptionalCardImage(((ViewHolder) contentCardViewHolder).getImageView(), bannerImageCard.getAspectRatio(), bannerImageCard.getImageUrl(), 6.0f, bannerImageCard);
    }
}
