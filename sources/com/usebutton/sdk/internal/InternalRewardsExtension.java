package com.usebutton.sdk.internal;

import android.os.Handler;
import com.usebutton.sdk.internal.models.BrowserCardMap;
import com.usebutton.sdk.internal.models.BrowserCardType;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.InternalRewardCard;
import com.usebutton.sdk.purchasepath.BrowserInterface;
import com.usebutton.sdk.purchasepath.BrowserPage;
import com.usebutton.sdk.purchasepath.CardList;
import com.usebutton.sdk.purchasepath.ProductPage;
import com.usebutton.sdk.purchasepath.PurchasePage;
import com.usebutton.sdk.purchasepath.PurchasePathExtension;
import com.usebutton.sdk.purchasepath.TextCard;

class InternalRewardsExtension implements PurchasePathExtension {
    private final BrowserCardMap browserCardMap;
    private final ButtonRepository buttonRepository;
    private final Configuration.Parameters configParameters;
    private boolean displayInstantRewardsCard = false;
    private final Handler handler;

    /* renamed from: com.usebutton.sdk.internal.InternalRewardsExtension$2 */
    public static /* synthetic */ class C122742 {

        /* renamed from: $SwitchMap$com$usebutton$sdk$purchasepath$Commission$CommissionType */
        public static final /* synthetic */ int[] f30923x9932d8f8;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.usebutton.sdk.purchasepath.Commission$CommissionType[] r0 = com.usebutton.sdk.purchasepath.Commission.CommissionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30923x9932d8f8 = r0
                com.usebutton.sdk.purchasepath.Commission$CommissionType r1 = com.usebutton.sdk.purchasepath.Commission.CommissionType.COMMISSIONABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30923x9932d8f8     // Catch:{ NoSuchFieldError -> 0x001d }
                com.usebutton.sdk.purchasepath.Commission$CommissionType r1 = com.usebutton.sdk.purchasepath.Commission.CommissionType.NON_COMMISSIONABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.InternalRewardsExtension.C122742.<clinit>():void");
        }
    }

    public InternalRewardsExtension(Configuration.Parameters parameters, ButtonRepository buttonRepository2, Handler handler2, BrowserCardMap browserCardMap2) {
        this.configParameters = parameters;
        this.buttonRepository = buttonRepository2;
        this.handler = handler2;
        this.browserCardMap = browserCardMap2;
    }

    private TextCard createInternalRewardCard(InternalRewardCard internalRewardCard, BrowserCardType browserCardType) {
        String copy = internalRewardCard.getTitle().getCopy();
        String copy2 = internalRewardCard.getBody().getCopy();
        int color = internalRewardCard.getTitle().getColor();
        int color2 = internalRewardCard.getBody().getColor();
        TextCard build = new TextCard.Builder(new InternalCallToAction(internalRewardCard.getCtaIcon(), internalRewardCard.getCtaText().getCopy(), internalRewardCard.getCtaText().getColor()), copy, copy2).setTitleColor(color).setBodyColor(color2).setBackgroundColor(internalRewardCard.getBackgroundColor()).build();
        build.setKey(browserCardType);
        return build;
    }

    private void displayInternalRewardCard(final BrowserInterface browserInterface, BrowserCardType browserCardType) {
        CardList cardList = browserInterface.getCardList();
        int internalRewardCardDisplayCount = this.buttonRepository.getInternalRewardCardDisplayCount(browserCardType);
        InternalRewardCard internalRewardsCard = getInternalRewardsCard(browserCardType);
        if (cardList != null && internalRewardsCard != null && cardList.getCard(browserCardType) == null) {
            cardList.addCard(createInternalRewardCard(internalRewardsCard, browserCardType));
            if (internalRewardsCard.getShowCount() == 0) {
                browserInterface.showTopCard();
            }
            if (browserCardType == BrowserCardType.INSTANT_REWARDS) {
                this.displayInstantRewardsCard = true;
            }
            if (internalRewardCardDisplayCount < internalRewardsCard.getShowCount()) {
                this.buttonRepository.setInternalRewardCardDisplayCount(browserCardType, internalRewardCardDisplayCount + 1);
                browserInterface.showTopCard();
                long showDuration = internalRewardsCard.getShowDuration();
                if (showDuration > 0) {
                    this.handler.postDelayed(new Runnable() {
                        public void run() {
                            browserInterface.hideTopCard();
                        }
                    }, showDuration);
                }
            }
        }
    }

    private InternalRewardCard getInternalRewardsCard(BrowserCardType browserCardType) {
        BrowserCardMap browserCardMap2 = this.browserCardMap;
        if (browserCardMap2 != null) {
            return (InternalRewardCard) browserCardMap2.getMap().get(browserCardType);
        }
        return null;
    }

    private boolean isInstantRewardsCardEnabled() {
        return this.configParameters.isInstantRewardsCardEnabled();
    }

    private boolean isPredictableRewardsCardEnabled() {
        return this.configParameters.isPredictableRewardsCardEnabled();
    }

    public void onClosed() {
    }

    public void onInitialized(BrowserInterface browserInterface) {
    }

    public void onPageNavigate(BrowserInterface browserInterface, BrowserPage browserPage) {
    }

    public void onProductNavigate(BrowserInterface browserInterface, ProductPage productPage) {
        if (isPredictableRewardsCardEnabled()) {
            int i = C122742.f30923x9932d8f8[productPage.getCommission().getCommissionType().ordinal()];
            if (i == 1) {
                displayInternalRewardCard(browserInterface, BrowserCardType.PREDICTABLE_REWARDS_AVAILABLE);
            } else if (i == 2) {
                displayInternalRewardCard(browserInterface, BrowserCardType.PREDICTABLE_REWARDS_UNAVAILABLE);
            }
        }
    }

    public void onPurchaseNavigate(BrowserInterface browserInterface, PurchasePage purchasePage) {
        if (isInstantRewardsCardEnabled()) {
            displayInternalRewardCard(browserInterface, BrowserCardType.INSTANT_REWARDS);
        }
    }

    public void onStartNavigate(BrowserInterface browserInterface) {
        this.handler.removeCallbacksAndMessages((Object) null);
        CardList cardList = browserInterface.getCardList();
        if (cardList != null) {
            cardList.removeCard(BrowserCardType.PREDICTABLE_REWARDS_AVAILABLE);
            cardList.removeCard(BrowserCardType.PREDICTABLE_REWARDS_UNAVAILABLE);
            if (this.displayInstantRewardsCard) {
                this.displayInstantRewardsCard = false;
            } else {
                cardList.removeCard(BrowserCardType.INSTANT_REWARDS);
            }
        }
    }
}
