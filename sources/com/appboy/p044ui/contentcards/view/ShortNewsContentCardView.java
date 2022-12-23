package com.appboy.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.support.StringUtils;

/* renamed from: com.appboy.ui.contentcards.view.ShortNewsContentCardView */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {

    /* renamed from: com.appboy.ui.contentcards.view.ShortNewsContentCardView$ViewHolder */
    public class ViewHolder extends ContentCardViewHolder {
        private final ImageView mCardImage;
        private final TextView mDescription;
        private final TextView mTitle;

        public ViewHolder(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = (ImageView) view.findViewById(R$id.com_appboy_content_cards_short_news_card_image);
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_short_news_card_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_short_news_card_description);
        }

        public TextView getDescription() {
            return this.mDescription;
        }

        public ImageView getImageView() {
            return this.mCardImage;
        }

        public TextView getTitle() {
            return this.mTitle;
        }
    }

    public ShortNewsContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_short_news_content_card, viewGroup, false);
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, ShortNewsCard shortNewsCard) {
        super.bindViewHolder(contentCardViewHolder, shortNewsCard);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        setOptionalTextView(viewHolder.getTitle(), shortNewsCard.getTitle());
        setOptionalTextView(viewHolder.getDescription(), shortNewsCard.getDescription());
        viewHolder.setActionHintText(StringUtils.isNullOrBlank(shortNewsCard.getDomain()) ? shortNewsCard.getUrl() : shortNewsCard.getDomain());
        setOptionalCardImage(viewHolder.getImageView(), 1.0f, shortNewsCard.getImageUrl(), 1.0f, shortNewsCard);
        safeSetClipToOutline(viewHolder.getImageView());
        View view = contentCardViewHolder.itemView;
        view.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
    }
}
