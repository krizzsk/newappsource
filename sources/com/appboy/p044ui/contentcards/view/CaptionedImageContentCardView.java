package com.appboy.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.support.StringUtils;

/* renamed from: com.appboy.ui.contentcards.view.CaptionedImageContentCardView */
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    /* renamed from: com.appboy.ui.contentcards.view.CaptionedImageContentCardView$ViewHolder */
    public class ViewHolder extends ContentCardViewHolder {
        private final ImageView mCardImage;
        private final TextView mDescription;
        private final TextView mTitle;

        public ViewHolder(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            this.mCardImage = (ImageView) view.findViewById(R$id.com_appboy_content_cards_captioned_image_card_image);
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_captioned_image_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_captioned_image_description);
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

    public CaptionedImageContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_captioned_image_content_card, viewGroup, false);
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, CaptionedImageCard captionedImageCard) {
        super.bindViewHolder(contentCardViewHolder, captionedImageCard);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        setOptionalTextView(viewHolder.getTitle(), captionedImageCard.getTitle());
        setOptionalTextView(viewHolder.getDescription(), captionedImageCard.getDescription());
        viewHolder.setActionHintText(StringUtils.isNullOrBlank(captionedImageCard.getDomain()) ? captionedImageCard.getUrl() : captionedImageCard.getDomain());
        setOptionalCardImage(viewHolder.getImageView(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), 1.3333334f, captionedImageCard);
        View view = contentCardViewHolder.itemView;
        view.setContentDescription(captionedImageCard.getTitle() + " . " + captionedImageCard.getDescription());
    }
}
