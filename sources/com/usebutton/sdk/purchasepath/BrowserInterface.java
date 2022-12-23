package com.usebutton.sdk.purchasepath;

import android.view.View;
import android.widget.RelativeLayout;
import com.usebutton.sdk.internal.BrowserText;

public interface BrowserInterface {
    public static final int INVALID_COLOR = -1;

    public interface Footer {
        int getBackgroundColor();

        int getTintColor();

        void setBackgroundColor(int i);

        void setTintColor(int i);
    }

    public interface Header {
        int getBackgroundColor();

        BrowserText getSubtitle();

        int getTintColor();

        BrowserText getTitle();

        void setBackgroundColor(int i);

        void setCustomActionView(View view);

        void setTintColor(int i);
    }

    boolean canShowCards();

    CardList getCardList();

    Footer getFooter();

    Header getHeader();

    RelativeLayout getViewContainer();

    void hideTopCard();

    void reloadCards();

    void setBrowserChromeClient(BrowserChromeClient browserChromeClient);

    void showTopCard();
}
