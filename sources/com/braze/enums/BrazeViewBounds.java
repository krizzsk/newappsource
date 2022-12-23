package com.braze.enums;

import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;

@Keep
public enum BrazeViewBounds {
    NOTIFICATION_EXPANDED_IMAGE(478, 256),
    NOTIFICATION_INLINE_PUSH_IMAGE(384, 256),
    NOTIFICATION_LARGE_ICON(64, 64),
    NOTIFICATION_ONE_IMAGE_STORY(256, RecyclerView.C1119a0.FLAG_IGNORE),
    BASE_CARD_VIEW(512, 512),
    IN_APP_MESSAGE_MODAL(580, 580),
    IN_APP_MESSAGE_SLIDEUP(100, 100),
    NO_BOUNDS(0, 0);
    
    public final int mHeight;
    public final int mWidth;

    /* access modifiers changed from: public */
    BrazeViewBounds(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int getHeightDp() {
        return this.mHeight;
    }

    public int getWidthDp() {
        return this.mWidth;
    }
}
