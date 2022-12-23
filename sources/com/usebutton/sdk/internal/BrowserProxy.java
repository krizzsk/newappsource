package com.usebutton.sdk.internal;

import android.view.View;
import android.widget.RelativeLayout;
import com.usebutton.sdk.internal.BrowserText;
import com.usebutton.sdk.internal.purchasepath.PageOwner;
import com.usebutton.sdk.purchasepath.BrowserChromeClient;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.CardList;
import java.lang.ref.WeakReference;

public class BrowserProxy implements BrowserInterface {
    /* access modifiers changed from: private */
    public WeakReference<WebViewActivity> activityWeakReference;
    private BrowserInterface.Footer footer;
    private BrowserInterface.Header header;
    private PageOwner pageOwner = PageOwner.PRIVATE;

    public class BrowserFooter implements BrowserInterface.Footer {
        public BrowserFooter() {
        }

        public int getBackgroundColor() {
            if (BrowserProxy.this.check()) {
                return ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).getFooterBackgroundColor();
            }
            return -1;
        }

        public int getTintColor() {
            if (BrowserProxy.this.check()) {
                return ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).getFooterTintColor();
            }
            return -1;
        }

        public void setBackgroundColor(int i) {
            if (BrowserProxy.this.check()) {
                ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setFooterBackgroundColor(i);
            }
        }

        public void setTintColor(int i) {
            if (BrowserProxy.this.check()) {
                ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setFooterTintColor(i);
            }
        }
    }

    public class BrowserHeader implements BrowserInterface.Header {
        /* access modifiers changed from: private */
        public BrowserText subtitle = new BrowserText(new BrowserText.TextChangeListener() {
            public void onColorChange(int i) {
                if (BrowserProxy.this.check()) {
                    ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderSubtitle(BrowserHeader.this.subtitle);
                }
            }

            public void onTextChange(String str) {
                if (BrowserProxy.this.check()) {
                    ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderSubtitle(BrowserHeader.this.subtitle);
                }
            }
        });
        /* access modifiers changed from: private */
        public BrowserText title = new BrowserText(new BrowserText.TextChangeListener() {
            public void onColorChange(int i) {
                if (BrowserProxy.this.check()) {
                    ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderTitle(BrowserHeader.this.title);
                }
            }

            public void onTextChange(String str) {
                if (BrowserProxy.this.check()) {
                    ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderTitle(BrowserHeader.this.title);
                }
            }
        });

        public BrowserHeader() {
        }

        public int getBackgroundColor() {
            if (BrowserProxy.this.check()) {
                return ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).getHeaderBackgroundColor();
            }
            return -1;
        }

        public BrowserText getSubtitle() {
            return this.subtitle;
        }

        public int getTintColor() {
            if (BrowserProxy.this.check()) {
                return ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).getHeaderTintColor();
            }
            return -1;
        }

        public BrowserText getTitle() {
            return this.title;
        }

        public void setBackgroundColor(int i) {
            if (BrowserProxy.this.check()) {
                ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderBackgroundColor(i);
            }
        }

        public void setCustomActionView(View view) {
            if (BrowserProxy.this.check()) {
                ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setCustomActionView(view);
            }
        }

        public void setTintColor(int i) {
            if (BrowserProxy.this.check()) {
                ((WebViewActivity) BrowserProxy.this.activityWeakReference.get()).setHeaderTintColor(i);
            }
        }
    }

    public BrowserProxy(WeakReference<WebViewActivity> weakReference) {
        this.activityWeakReference = weakReference;
        this.header = new BrowserHeader();
        this.footer = new BrowserFooter();
    }

    /* access modifiers changed from: private */
    public boolean check() {
        return this.activityWeakReference.get() != null;
    }

    public boolean canShowCards() {
        return this.pageOwner == PageOwner.PUBLIC;
    }

    public void destroy() {
        this.activityWeakReference.clear();
    }

    public CardList getCardList() {
        if (check()) {
            return this.activityWeakReference.get().getCardList();
        }
        return null;
    }

    public BrowserInterface.Footer getFooter() {
        if (check()) {
            return this.footer;
        }
        return null;
    }

    public BrowserInterface.Header getHeader() {
        if (check()) {
            return this.header;
        }
        return null;
    }

    public PageOwner getPageOwner() {
        return this.pageOwner;
    }

    public CardList getPersistentCardList() {
        if (check()) {
            return this.activityWeakReference.get().getPersistentCardList();
        }
        return null;
    }

    public CardList getPrivateCardList() {
        if (check()) {
            return this.activityWeakReference.get().getPrivateCardList();
        }
        return null;
    }

    public RelativeLayout getViewContainer() {
        if (check()) {
            return this.activityWeakReference.get().getViewContainer();
        }
        return null;
    }

    public void hideTopCard() {
        hideTopCard(false);
    }

    public void reloadCards() {
        if (check()) {
            this.activityWeakReference.get().reloadCards();
        }
    }

    public void setBrowserChromeClient(BrowserChromeClient browserChromeClient) {
        if (check()) {
            this.activityWeakReference.get().setBrowserChromeClient(browserChromeClient);
        }
    }

    public void setPageOwner(PageOwner pageOwner2) {
        if (this.pageOwner != pageOwner2) {
            this.pageOwner = pageOwner2;
            reloadCards();
        }
    }

    public void showTopCard() {
        showTopCard(false);
    }

    public void hideTopCard(boolean z) {
        if ((z || canShowCards()) && check()) {
            this.activityWeakReference.get().hideTopCard();
        }
    }

    public void showTopCard(boolean z) {
        if ((z || canShowCards()) && check()) {
            this.activityWeakReference.get().showTopCard();
        }
    }
}
