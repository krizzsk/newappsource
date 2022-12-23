package com.appboy;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import com.appboy.events.BrazeNetworkFailureEvent;
import com.appboy.events.BrazeSdkAuthenticationErrorEvent;
import com.appboy.events.ContentCardsUpdatedEvent;
import com.appboy.events.FeedUpdatedEvent;
import com.appboy.events.IEventSubscriber;
import com.appboy.events.IValueCallback;
import com.appboy.events.InAppMessageEvent;
import com.appboy.events.SessionStateChangedEvent;
import com.appboy.models.IInAppMessage;
import com.appboy.models.cards.Card;
import com.appboy.models.outgoing.AppboyProperties;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.outgoing.BrazeProperties;
import java.math.BigDecimal;
import java.util.List;
import org.json.JSONObject;

@Keep
public interface IAppboy {
    void changeUser(String str);

    void changeUser(String str, String str2);

    void closeSession(Activity activity);

    Card deserializeContentCard(String str);

    Card deserializeContentCard(JSONObject jSONObject);

    IInAppMessage deserializeInAppMessageString(String str);

    @Deprecated
    IAppboyImageLoader getAppboyImageLoader();

    String getAppboyPushMessageRegistrationId();

    List<Card> getCachedContentCards();

    int getContentCardCount();

    int getContentCardUnviewedCount();

    long getContentCardsLastUpdatedInSecondsFromEpoch();

    <T extends AppboyUser> T getCurrentUser();

    <T extends AppboyUser> void getCurrentUser(IValueCallback<T> iValueCallback);

    String getDeviceId();

    IBrazeImageLoader getImageLoader();

    @Deprecated
    String getInstallTrackingId();

    String getRegisteredPushToken();

    void logContentCardsDisplayed();

    void logCustomEvent(String str);

    void logCustomEvent(String str, AppboyProperties appboyProperties);

    void logCustomEvent(String str, BrazeProperties brazeProperties);

    @Deprecated
    void logFeedCardClick(String str);

    @Deprecated
    void logFeedCardImpression(String str);

    void logFeedDisplayed();

    void logPurchase(String str, String str2, BigDecimal bigDecimal);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i, AppboyProperties appboyProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, int i, BrazeProperties brazeProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, AppboyProperties appboyProperties);

    void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties);

    void logPushNotificationActionClicked(String str, String str2, String str3);

    void logPushNotificationOpened(Intent intent);

    void logPushNotificationOpened(String str);

    void logPushStoryPageClicked(String str, String str2);

    void openSession(Activity activity);

    void registerAppboyPushMessages(String str);

    void registerPushToken(String str);

    <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls);

    void requestContentCardsRefresh(boolean z);

    void requestFeedRefresh();

    void requestFeedRefreshFromCache();

    void requestGeofences(double d, double d2);

    void requestImmediateDataFlush();

    void requestLocationInitialization();

    @Deprecated
    void setAppboyImageLoader(IAppboyImageLoader iAppboyImageLoader);

    void setGoogleAdvertisingId(String str, boolean z);

    void setImageLoader(IBrazeImageLoader iBrazeImageLoader);

    void setSdkAuthenticationSignature(String str);

    void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber);

    void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber);

    void subscribeToNetworkFailures(IEventSubscriber<BrazeNetworkFailureEvent> iEventSubscriber);

    void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber);

    void subscribeToSdkAuthenticationFailures(IEventSubscriber<BrazeSdkAuthenticationErrorEvent> iEventSubscriber);

    void subscribeToSessionUpdates(IEventSubscriber<SessionStateChangedEvent> iEventSubscriber);
}
