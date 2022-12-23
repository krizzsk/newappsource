package com.appboy;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.appboy.models.IInAppMessage;
import com.appboy.models.cards.Card;
import com.braze.enums.BrazeViewBounds;

@Deprecated
@Keep
public interface IAppboyImageLoader {
    Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds);

    Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds);

    void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds);

    void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds);

    void setOffline(boolean z);
}
