package com.appboy.p044ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.support.StringUtils;

/* renamed from: com.appboy.ui.contentcards.view.TextAnnouncementContentCardView */
public class TextAnnouncementContentCardView extends BaseContentCardView<TextAnnouncementCard> {

    /* renamed from: com.appboy.ui.contentcards.view.TextAnnouncementContentCardView$ViewHolder */
    public class ViewHolder extends ContentCardViewHolder {
        private final TextView mDescription;
        private final TextView mTitle;

        public ViewHolder(TextAnnouncementContentCardView textAnnouncementContentCardView, View view) {
            super(view, textAnnouncementContentCardView.isUnreadIndicatorEnabled());
            this.mTitle = (TextView) view.findViewById(R$id.com_appboy_content_cards_text_announcement_card_title);
            this.mDescription = (TextView) view.findViewById(R$id.com_appboy_content_cards_text_announcement_card_description);
        }

        public TextView getDescription() {
            return this.mDescription;
        }

        public TextView getTitle() {
            return this.mTitle;
        }
    }

    public TextAnnouncementContentCardView(Context context) {
        super(context);
    }

    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_appboy_text_announcement_content_card, viewGroup, false);
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, TextAnnouncementCard textAnnouncementCard) {
        super.bindViewHolder(contentCardViewHolder, textAnnouncementCard);
        ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
        setOptionalTextView(viewHolder.getTitle(), textAnnouncementCard.getTitle());
        setOptionalTextView(viewHolder.getDescription(), textAnnouncementCard.getDescription());
        viewHolder.setActionHintText(StringUtils.isNullOrBlank(textAnnouncementCard.getDomain()) ? textAnnouncementCard.getUrl() : textAnnouncementCard.getDomain());
        View view = contentCardViewHolder.itemView;
        view.setContentDescription(textAnnouncementCard.getTitle() + " . " + textAnnouncementCard.getDescription());
    }
}
