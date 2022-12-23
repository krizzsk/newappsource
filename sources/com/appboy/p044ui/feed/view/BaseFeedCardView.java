package com.appboy.p044ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.feed.AppboyFeedManager;
import com.appboy.p044ui.feed.AppboyImageSwitcher;
import com.appboy.p044ui.widget.BaseCardView;
import com.appboy.support.AppboyLogger;
import java.util.Observable;
import java.util.Observer;
import p246s5.C6474a;

/* renamed from: com.appboy.ui.feed.view.BaseFeedCardView */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> implements Observer {
    static {
        AppboyLogger.getBrazeLogTag(BaseCardView.class);
    }

    public BaseFeedCardView(Context context) {
        super(context);
        AppboyImageSwitcher appboyImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        AppboyImageSwitcher appboyImageSwitcher2 = (AppboyImageSwitcher) findViewById(R$id.com_appboy_newsfeed_item_read_indicator_image_switcher);
        this.mImageSwitcher = appboyImageSwitcher2;
        if (appboyImageSwitcher2 != null) {
            appboyImageSwitcher2.setFactory(new C6474a(this));
        }
        if (!isUnreadIndicatorEnabled() && (appboyImageSwitcher = this.mImageSwitcher) != null) {
            appboyImageSwitcher.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.mContext.getApplicationContext());
    }

    public Card getCard() {
        return this.mCard;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(R$id.com_appboy_stubbed_feed_image_view);
    }

    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        return AppboyFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }

    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.mCard = t;
        onSetCard(t);
        t.addObserver(this);
        setCardViewedIndicator(this.mImageSwitcher, getCard());
    }

    public void update(Observable observable, Object obj) {
        setCardViewedIndicator(this.mImageSwitcher, getCard());
    }
}
