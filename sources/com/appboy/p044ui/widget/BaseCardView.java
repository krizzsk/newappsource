package com.appboy.p044ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.enums.Channel;
import com.appboy.models.cards.Card;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.p044ui.R$drawable;
import com.appboy.p044ui.R$string;
import com.appboy.p044ui.actions.ActionFactory;
import com.appboy.p044ui.actions.IAction;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.p044ui.feed.AppboyImageSwitcher;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.appboy.ui.widget.BaseCardView */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    private static final String TAG = AppboyLogger.getBrazeLogTag(BaseCardView.class);
    private static Boolean sUnreadCardVisualIndicatorEnabled;
    public T mCard;
    private final String mClassLogTag;
    public BrazeConfigurationProvider mConfigurationProvider;
    public final Context mContext;
    public AppboyImageSwitcher mImageSwitcher;

    public BaseCardView(Context context) {
        super(context);
        this.mContext = context.getApplicationContext();
        if (this.mConfigurationProvider == null) {
            this.mConfigurationProvider = new BrazeConfigurationProvider(context);
        }
        if (sUnreadCardVisualIndicatorEnabled == null) {
            sUnreadCardVisualIndicatorEnabled = Boolean.valueOf(this.mConfigurationProvider.getIsNewsfeedVisualIndicatorOn());
        }
        this.mClassLogTag = AppboyLogger.getBrazeLogTag(getClass());
    }

    public static UriAction getUriActionForCard(Card card) {
        Bundle bundle = new Bundle();
        for (String next : card.getExtras().keySet()) {
            bundle.putString(next, card.getExtras().get(next));
        }
        return ActionFactory.createUriActionFromUrlString(card.getUrl(), bundle, card.getOpenUriInWebView(), Channel.NEWS_FEED);
    }

    public String getClassLogTag() {
        return this.mClassLogTag;
    }

    public void handleCardClick(Context context, Card card, IAction iAction, String str) {
        String str2 = TAG;
        AppboyLogger.m5457v(str2, "Handling card click for card: " + card);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, iAction)) {
            StringBuilder k = C13555b.m33972k("Card click was handled by custom listener on card: ");
            k.append(card.getId());
            AppboyLogger.m5448d(str2, k.toString());
            card.logClick();
        } else if (iAction != null) {
            card.logClick();
            AppboyLogger.m5457v(str2, "Card action is non-null. Attempting to perform action on card: " + card.getId());
            if (iAction instanceof UriAction) {
                AppboyNavigator.getAppboyNavigator().gotoUri(context, (UriAction) iAction);
                return;
            }
            StringBuilder k2 = C13555b.m33972k("Executing non uri action for click on card: ");
            k2.append(card.getId());
            AppboyLogger.m5448d(str2, k2.toString());
            iAction.execute(context);
        } else {
            StringBuilder k3 = C13555b.m33972k("Card action is null. Not performing any click action on card: ");
            k3.append(card.getId());
            AppboyLogger.m5457v(str2, k3.toString());
        }
    }

    public abstract boolean isClickHandled(Context context, Card card, IAction iAction);

    public boolean isUnreadIndicatorEnabled() {
        return sUnreadCardVisualIndicatorEnabled.booleanValue();
    }

    public void setCardViewedIndicator(AppboyImageSwitcher appboyImageSwitcher, Card card) {
        if (card == null) {
            AppboyLogger.m5448d(getClassLogTag(), "The card is null. Not setting read/unread indicator.");
        } else if (appboyImageSwitcher != null) {
            int i = R$string.com_appboy_image_is_read_tag_key;
            String str = (String) appboyImageSwitcher.getTag(i);
            if (str == null) {
                str = "";
            }
            if (card.isIndicatorHighlighted()) {
                if (!str.equals("icon_read")) {
                    if (appboyImageSwitcher.getReadIcon() != null) {
                        appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getReadIcon());
                    } else {
                        appboyImageSwitcher.setImageResource(R$drawable.icon_read);
                    }
                    appboyImageSwitcher.setTag(i, "icon_read");
                }
            } else if (!str.equals("icon_unread")) {
                if (appboyImageSwitcher.getUnReadIcon() != null) {
                    appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getUnReadIcon());
                } else {
                    appboyImageSwitcher.setImageResource(R$drawable.icon_unread);
                }
                appboyImageSwitcher.setTag(i, "icon_unread");
            }
        }
    }

    public void setImageViewToUrl(final ImageView imageView, String str, final float f, Card card) {
        if (str == null) {
            AppboyLogger.m5459w(TAG, "The image url to render is null. Not setting the card image.");
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            AppboyLogger.m5459w(TAG, "The image aspect ratio is 0. Not setting the card image.");
        } else {
            int i = R$string.com_appboy_image_resize_tag_key;
            if (!str.equals(imageView.getTag(i))) {
                if (f != 1.0f) {
                    ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) {
                            public void onGlobalLayout() {
                                int width = imageView.getWidth();
                                imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (((float) width) / f)));
                                imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        });
                    }
                }
                imageView.setImageResource(17170445);
                Braze.getInstance(getContext()).getImageLoader().renderUrlIntoCardView(getContext(), card, str, imageView, BrazeViewBounds.BASE_CARD_VIEW);
                imageView.setTag(i, str);
            }
        }
    }

    public void setOptionalTextView(TextView textView, String str) {
        if (!StringUtils.isNullOrBlank(str)) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(8);
    }
}
