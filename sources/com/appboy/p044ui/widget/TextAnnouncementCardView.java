package com.appboy.p044ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.appboy.models.cards.TextAnnouncementCard;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.feed.view.BaseFeedCardView;
import com.appboy.support.AppboyLogger;
import p310x5.C7159d;

/* renamed from: com.appboy.ui.widget.TextAnnouncementCardView */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = AppboyLogger.getBrazeLogTag(TextAnnouncementCardView.class);
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, (TextAnnouncementCard) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSetCard$0(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.mContext, textAnnouncementCard, this.mCardAction, TAG);
    }

    public int getLayoutResource() {
        return R$layout.com_appboy_text_announcement_card;
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(R$id.com_appboy_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R$id.com_appboy_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R$id.com_appboy_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_appboy_card_background));
    }

    public void onSetCard(TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = BaseCardView.getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new C7159d(0, this, textAnnouncementCard));
    }
}
