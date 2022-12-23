package com.appboy.p044ui.feed;

import com.appboy.p044ui.feed.listeners.AppboyDefaultFeedClickActionListener;
import com.appboy.p044ui.feed.listeners.IFeedClickActionListener;

/* renamed from: com.appboy.ui.feed.AppboyFeedManager */
public class AppboyFeedManager {
    private static volatile AppboyFeedManager sInstance;
    private final IFeedClickActionListener mDefaultFeedClickActionListener = new AppboyDefaultFeedClickActionListener();

    public static AppboyFeedManager getInstance() {
        if (sInstance == null) {
            synchronized (AppboyFeedManager.class) {
                if (sInstance == null) {
                    sInstance = new AppboyFeedManager();
                }
            }
        }
        return sInstance;
    }

    public IFeedClickActionListener getFeedCardClickActionListener() {
        return this.mDefaultFeedClickActionListener;
    }
}
