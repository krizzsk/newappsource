package com.appboy.p044ui.contentcards;

import com.appboy.p044ui.contentcards.listeners.AppboyContentCardsActionListener;
import com.appboy.p044ui.contentcards.listeners.IContentCardsActionListener;

/* renamed from: com.appboy.ui.contentcards.AppboyContentCardsManager */
public class AppboyContentCardsManager {
    private static volatile AppboyContentCardsManager sInstance;
    private final IContentCardsActionListener mDefaultContentCardsActionListener = new AppboyContentCardsActionListener();

    public static AppboyContentCardsManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyContentCardsManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyContentCardsManager();
                }
            }
        }
        return sInstance;
    }

    public IContentCardsActionListener getContentCardsActionListener() {
        return this.mDefaultContentCardsActionListener;
    }
}
