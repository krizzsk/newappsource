package com.appboy.models.push;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.appboy.Constants;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.JsonUtils;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.ArrayList;
import java.util.List;

@Keep
public class BrazeNotificationPayload {
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeNotificationPayload.class);
    public Integer mAccentColor;
    public List<ActionButton> mActionButtons;
    public Bundle mAppboyExtras;
    public String mBigImageUrl;
    public String mBigSummaryText;
    public String mBigTitleText;
    public BrazeConfigurationProvider mConfigurationProvider;
    public String mContentCardSyncData;
    public String mContentCardSyncUserId;
    public String mContentText;
    public Context mContext;
    public Integer mCustomNotificationId;
    public boolean mIsInlineImagePush;
    public boolean mIsPushStory;
    public String mLargeIcon;
    public Integer mNotificationBadgeNumber;
    public String mNotificationCategory;
    public String mNotificationChannelId;
    public final Bundle mNotificationExtras;
    public Long mNotificationReceivedTimestampMillis;
    public String mNotificationSound;
    public Integer mNotificationVisibility;
    public String mPublicNotificationExtras;
    public Integer mPushDuration;
    public int mPushStoryPageIndex;
    public List<PushStoryPage> mPushStoryPages;
    public String mSummaryText;
    public String mTitleText;

    @Keep
    public static class ActionButton {
        public String mActionId;
        public int mActionIndex;
        public String mText;
        public String mType;
        public String mUri;
        public String mUseWebview;

        public ActionButton(Bundle bundle, int i) {
            this.mActionIndex = i;
            this.mType = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE);
            this.mActionId = BrazeNotificationPayload.getActionFieldAtIndex(this.mActionIndex, bundle, Constants.APPBOY_PUSH_ACTION_ID_KEY_TEMPLATE);
            this.mUri = BrazeNotificationPayload.getActionFieldAtIndex(this.mActionIndex, bundle, Constants.APPBOY_PUSH_ACTION_URI_KEY_TEMPLATE);
            this.mUseWebview = BrazeNotificationPayload.getActionFieldAtIndex(this.mActionIndex, bundle, Constants.APPBOY_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE);
            this.mText = BrazeNotificationPayload.getActionFieldAtIndex(this.mActionIndex, bundle, Constants.APPBOY_PUSH_ACTION_TEXT_KEY_TEMPLATE);
        }

        public String getActionId() {
            return this.mActionId;
        }

        public int getActionIndex() {
            return this.mActionIndex;
        }

        public String getText() {
            return this.mText;
        }

        public String getType() {
            return this.mType;
        }

        public String getUri() {
            return this.mUri;
        }

        public String getUseWebview() {
            return this.mUseWebview;
        }

        public void setActionId(String str) {
            this.mActionId = str;
        }

        public void setActionIndex(int i) {
            this.mActionIndex = i;
        }

        public void setText(String str) {
            this.mText = str;
        }

        public void setType(String str) {
            this.mType = str;
        }

        public void setUri(String str) {
            this.mUri = str;
        }

        public void setUseWebview(String str) {
            this.mUseWebview = str;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("mActionIndex = ");
            k.append(this.mActionIndex);
            k.append("\n, mType = ");
            k.append(this.mType);
            k.append("\n, mId = ");
            k.append(this.mActionId);
            k.append("\n, mUri = ");
            k.append(this.mUri);
            k.append("\n, mUseWebview = ");
            k.append(this.mUseWebview);
            k.append("\n, mText = ");
            k.append(this.mText);
            return k.toString();
        }
    }

    @Keep
    public static class PushStoryPage {
        public int mActionIndex;
        public String mBitmapUrl;
        public final String mCampaignId;
        public String mDeeplink;
        public String mStoryPageId;
        public String mSubtitle;
        public int mSubtitleGravity;
        public String mTitle;
        public int mTitleGravity;
        public String mUseWebview;

        public PushStoryPage(Bundle bundle, int i) {
            this.mActionIndex = i;
            this.mCampaignId = BrazeNotificationPayload.parseString(bundle, Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY);
            this.mTitle = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_TITLE_KEY_TEMPLATE);
            this.mTitleGravity = BrazeNotificationPayload.getPushStoryGravityAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.mSubtitle = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_KEY_TEMPLATE);
            this.mSubtitleGravity = BrazeNotificationPayload.getPushStoryGravityAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE);
            this.mBitmapUrl = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            this.mStoryPageId = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_ID_KEY_TEMPLATE, "");
            this.mDeeplink = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE);
            this.mUseWebview = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE);
        }

        public int getActionIndex() {
            return this.mActionIndex;
        }

        public String getBitmapUrl() {
            return this.mBitmapUrl;
        }

        public String getCampaignId() {
            return this.mCampaignId;
        }

        public String getDeeplink() {
            return this.mDeeplink;
        }

        public String getStoryPageId() {
            return this.mStoryPageId;
        }

        public String getSubtitle() {
            return this.mSubtitle;
        }

        public int getSubtitleGravity() {
            return this.mSubtitleGravity;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public int getTitleGravity() {
            return this.mTitleGravity;
        }

        public String getUseWebview() {
            return this.mUseWebview;
        }

        public void setActionIndex(int i) {
            this.mActionIndex = i;
        }

        public void setBitmapUrl(String str) {
            this.mBitmapUrl = str;
        }

        public void setDeeplink(String str) {
            this.mDeeplink = str;
        }

        public void setStoryPageId(String str) {
            this.mStoryPageId = str;
        }

        public void setSubtitle(String str) {
            this.mSubtitle = str;
        }

        public void setSubtitleGravity(int i) {
            this.mSubtitleGravity = i;
        }

        public void setTitle(String str) {
            this.mTitle = str;
        }

        public void setTitleGravity(int i) {
            this.mTitleGravity = i;
        }

        public void setUseWebview(String str) {
            this.mUseWebview = str;
        }

        public String toString() {
            StringBuilder k = C13555b.m33972k("\n\nmActionIndex = ");
            k.append(this.mActionIndex);
            k.append("\n, mCampaignId = ");
            k.append(this.mCampaignId);
            k.append("\n, mTitle = ");
            k.append(this.mTitle);
            k.append("\n, mTitleGravity=");
            k.append(this.mTitleGravity);
            k.append("\n, mSubtitle = ");
            k.append(this.mSubtitle);
            k.append("\n, mSubtitleGravity=");
            k.append(this.mSubtitleGravity);
            k.append("\n, mBitmapUrl = ");
            k.append(this.mBitmapUrl);
            k.append("\n, mStoryPageId = ");
            k.append(this.mStoryPageId);
            k.append("\n, mDeeplink = ");
            k.append(this.mDeeplink);
            k.append("\n, mUseWebview = ");
            k.append(this.mUseWebview);
            return k.toString();
        }
    }

    @Deprecated
    public BrazeNotificationPayload(AppboyConfigurationProvider appboyConfigurationProvider, Bundle bundle) {
        this(bundle);
        this.mConfigurationProvider = (BrazeConfigurationProvider) appboyConfigurationProvider;
    }

    public static String getActionFieldAtIndex(int i, Bundle bundle, String str) {
        return getActionFieldAtIndex(i, bundle, str, "");
    }

    public static Bundle getAttachedAppboyExtras(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        if (bundle.containsKey(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED) && !bundle.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED)) {
            Bundle bundle2 = bundle.getBundle(Constants.APPBOY_PUSH_EXTRAS_KEY);
            if (bundle2 == null) {
                return new Bundle();
            }
            return bundle2;
        } else if (Constants.IS_AMAZON.booleanValue()) {
            return new Bundle(bundle);
        } else {
            Object obj = bundle.get(Constants.APPBOY_PUSH_EXTRAS_KEY);
            if (obj instanceof String) {
                return JsonUtils.parseJsonObjectIntoBundle((String) obj);
            }
            if (obj instanceof Bundle) {
                return (Bundle) obj;
            }
            return new Bundle();
        }
    }

    public static int getPushStoryGravityAtIndex(int i, Bundle bundle, String str) {
        String string = bundle.getString(str.replace("*", String.valueOf(i)));
        if (StringUtils.isNullOrBlank(string)) {
            return 17;
        }
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 100571) {
                if (hashCode == 109757538 && string.equals("start")) {
                    c = 0;
                }
            } else if (string.equals("end")) {
                c = 1;
            }
        } else if (string.equals("center")) {
            c = 2;
        }
        if (c == 0) {
            return 8388611;
        }
        if (c != 1) {
            return 17;
        }
        return 8388613;
    }

    private void parseActionButtons() {
        this.mActionButtons.clear();
        for (int i = 0; !StringUtils.isNullOrBlank(getActionFieldAtIndex(i, this.mNotificationExtras, Constants.APPBOY_PUSH_ACTION_TYPE_KEY_TEMPLATE)); i++) {
            this.mActionButtons.add(new ActionButton(this.mNotificationExtras, i));
        }
    }

    private void parseBigImageStyle() {
        String parseNonBlankString = parseNonBlankString(this.mNotificationExtras, Constants.APPBOY_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY);
        this.mBigImageUrl = parseNonBlankString;
        if (StringUtils.isNullOrBlank(parseNonBlankString)) {
            this.mBigImageUrl = parseNonBlankString(this.mAppboyExtras, Constants.APPBOY_PUSH_BIG_IMAGE_URL_KEY);
        }
    }

    private void parseBigTextStyle() {
        this.mBigSummaryText = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_BIG_SUMMARY_TEXT_KEY);
        this.mBigTitleText = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_BIG_TITLE_TEXT_KEY);
    }

    private void parseContentCardData() {
        this.mContentCardSyncData = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_DATA_KEY);
        this.mContentCardSyncUserId = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY);
    }

    public static Long parseLong(Bundle bundle, String str) {
        try {
            if (bundle.containsKey(str)) {
                return Long.valueOf(bundle.getLong(str));
            }
            return null;
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse long with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    public static String parseNonBlankString(Bundle bundle, String str) {
        try {
            String parseString = parseString(bundle, str);
            if (!StringUtils.isNullOrBlank(parseString)) {
                return parseString;
            }
            return null;
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse non blank string with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    private void parseNotificationMetadata() {
        this.mPushDuration = parseStringAsInteger(this.mNotificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_DURATION_KEY);
        this.mIsPushStory = this.mNotificationExtras.containsKey(Constants.APPBOY_PUSH_STORY_KEY);
        this.mNotificationCategory = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_CATEGORY_KEY);
        this.mNotificationVisibility = parseStringAsInteger(this.mNotificationExtras, Constants.APPBOY_PUSH_VISIBILITY_KEY);
        this.mNotificationBadgeNumber = parseStringAsInteger(this.mNotificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_BADGE_COUNT_KEY);
        this.mPublicNotificationExtras = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_PUBLIC_NOTIFICATION_KEY);
        this.mCustomNotificationId = parseStringAsInteger(this.mNotificationExtras, "n");
        this.mNotificationReceivedTimestampMillis = parseLong(this.mNotificationExtras, Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS);
        this.mIsInlineImagePush = this.mNotificationExtras.containsKey(Constants.APPBOY_PUSH_INLINE_IMAGE_STYLE_KEY);
    }

    public static int parseObjectAsInteger(Bundle bundle, String str, int i) {
        Object obj;
        try {
            if (bundle.containsKey(str) && (obj = bundle.get(str)) != null) {
                return Integer.parseInt(String.valueOf(obj));
            }
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse string as int with key " + str + " and bundle: " + bundle);
        }
        return i;
    }

    private void parsePayloadFieldsFromBundle() {
        parseNotificationMetadata();
        parseContentCardData();
        parseVisibleContent();
        parseBigTextStyle();
        parseBigImageStyle();
        parseActionButtons();
        parsePushStoryData();
    }

    private void parsePushStoryData() {
        this.mPushStoryPageIndex = parseObjectAsInteger(this.mNotificationExtras, Constants.APPBOY_STORY_INDEX_KEY, 0);
        for (int i = 0; !StringUtils.isNullOrBlank(getActionFieldAtIndex(i, this.mNotificationExtras, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE)); i++) {
            this.mPushStoryPages.add(new PushStoryPage(this.mNotificationExtras, i));
        }
    }

    public static String parseString(Bundle bundle, String str) {
        try {
            if (bundle.containsKey(str)) {
                return bundle.getString(str);
            }
            return null;
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse string with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    public static Integer parseStringAsColorInt(Bundle bundle, String str) {
        String string;
        try {
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            return Integer.valueOf((int) Long.parseLong(string));
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse string as color int with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    public static Integer parseStringAsInteger(Bundle bundle, String str) {
        String string;
        try {
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(string));
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse string as int with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    public static Long parseStringAsLong(Bundle bundle, String str) {
        String string;
        try {
            if (!bundle.containsKey(str) || (string = bundle.getString(str)) == null) {
                return null;
            }
            return Long.valueOf(Long.parseLong(string));
        } catch (Exception unused) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Failed to parse string as long with key " + str + " and bundle: " + bundle);
            return null;
        }
    }

    private void parseVisibleContent() {
        this.mNotificationChannelId = parseNonBlankString(this.mNotificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY);
        this.mTitleText = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_TITLE_KEY);
        this.mContentText = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_CONTENT_KEY);
        this.mLargeIcon = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_LARGE_ICON_KEY);
        this.mNotificationSound = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_KEY);
        this.mSummaryText = parseString(this.mNotificationExtras, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY);
        this.mAccentColor = parseStringAsColorInt(this.mNotificationExtras, Constants.APPBOY_PUSH_ACCENT_KEY);
    }

    public Integer getAccentColor() {
        return this.mAccentColor;
    }

    public List<ActionButton> getActionButtons() {
        return this.mActionButtons;
    }

    @Deprecated
    public AppboyConfigurationProvider getAppboyConfigurationProvider() {
        return this.mConfigurationProvider;
    }

    public Bundle getAppboyExtras() {
        return this.mAppboyExtras;
    }

    public String getBigImageUrl() {
        return this.mBigImageUrl;
    }

    public String getBigSummaryText() {
        return this.mBigSummaryText;
    }

    public String getBigTitleText() {
        return this.mBigTitleText;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.mConfigurationProvider;
    }

    public String getContentCardSyncData() {
        return this.mContentCardSyncData;
    }

    public String getContentCardSyncUserId() {
        return this.mContentCardSyncUserId;
    }

    public String getContentText() {
        return this.mContentText;
    }

    public Context getContext() {
        return this.mContext;
    }

    public Integer getCustomNotificationId() {
        return this.mCustomNotificationId;
    }

    public String getLargeIcon() {
        return this.mLargeIcon;
    }

    public Integer getNotificationBadgeNumber() {
        return this.mNotificationBadgeNumber;
    }

    public String getNotificationCategory() {
        return this.mNotificationCategory;
    }

    public String getNotificationChannelId() {
        return this.mNotificationChannelId;
    }

    public Bundle getNotificationExtras() {
        return this.mNotificationExtras;
    }

    public Long getNotificationReceivedTimestampMillis() {
        return this.mNotificationReceivedTimestampMillis;
    }

    public String getNotificationSound() {
        return this.mNotificationSound;
    }

    public Integer getNotificationVisibility() {
        return this.mNotificationVisibility;
    }

    public String getPublicNotificationExtras() {
        return this.mPublicNotificationExtras;
    }

    public Integer getPushDuration() {
        return this.mPushDuration;
    }

    public int getPushStoryPageIndex() {
        return this.mPushStoryPageIndex;
    }

    public List<PushStoryPage> getPushStoryPages() {
        return this.mPushStoryPages;
    }

    public String getSummaryText() {
        return this.mSummaryText;
    }

    public String getTitleText() {
        return this.mTitleText;
    }

    public boolean isInlineImagePush() {
        return this.mIsInlineImagePush;
    }

    public boolean isPushStory() {
        return this.mIsPushStory;
    }

    public void setAccentColor(Integer num) {
        this.mAccentColor = num;
    }

    public void setActionButtons(List<ActionButton> list) {
        if (list != null) {
            this.mActionButtons = list;
        }
    }

    @Deprecated
    public void setAppboyConfigurationProvider(AppboyConfigurationProvider appboyConfigurationProvider) {
        this.mConfigurationProvider = (BrazeConfigurationProvider) appboyConfigurationProvider;
    }

    public void setAppboyExtras(Bundle bundle) {
        this.mAppboyExtras = bundle;
    }

    public void setBigImageUrl(String str) {
        this.mBigImageUrl = str;
    }

    public void setBigSummaryText(String str) {
        this.mBigSummaryText = str;
    }

    public void setBigTitleText(String str) {
        this.mBigTitleText = str;
    }

    public void setConfigurationProvider(BrazeConfigurationProvider brazeConfigurationProvider) {
        this.mConfigurationProvider = brazeConfigurationProvider;
    }

    public void setContentCardSyncData(String str) {
        this.mContentCardSyncData = str;
    }

    public void setContentCardSyncUserId(String str) {
        this.mContentCardSyncUserId = str;
    }

    public void setContentText(String str) {
        this.mContentText = str;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setCustomNotificationId(Integer num) {
        this.mCustomNotificationId = num;
    }

    public void setIsInlineImagePush(boolean z) {
        this.mIsInlineImagePush = z;
    }

    public void setLargeIcon(String str) {
        this.mLargeIcon = str;
    }

    public void setNotificationBadgeNumber(Integer num) {
        this.mNotificationBadgeNumber = num;
    }

    public void setNotificationCategory(String str) {
        this.mNotificationCategory = str;
    }

    public void setNotificationChannelId(String str) {
        this.mNotificationChannelId = str;
    }

    public void setNotificationReceivedTimestampMillis(Long l) {
        this.mNotificationReceivedTimestampMillis = l;
    }

    public void setNotificationSound(String str) {
        this.mNotificationSound = str;
    }

    public void setNotificationVisibility(Integer num) {
        this.mNotificationVisibility = num;
    }

    public void setPublicNotificationExtras(String str) {
        this.mPublicNotificationExtras = str;
    }

    public void setPushDuration(Integer num) {
        this.mPushDuration = num;
    }

    public void setPushStory(boolean z) {
        this.mIsPushStory = z;
    }

    public void setPushStoryPageIndex(int i) {
        this.mPushStoryPageIndex = i;
    }

    public void setPushStoryPages(List<PushStoryPage> list) {
        if (list != null) {
            this.mPushStoryPages = list;
        }
    }

    public void setSummaryText(String str) {
        this.mSummaryText = str;
    }

    public void setTitleText(String str) {
        this.mTitleText = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("\nNotificationExtras=");
        k.append(this.mNotificationExtras);
        k.append("\n, AppboyExtras=");
        k.append(this.mAppboyExtras);
        k.append("\n, PushDuration=");
        k.append(this.mPushDuration);
        k.append("\n, IsPushStory=");
        k.append(this.mIsPushStory);
        k.append("\n, PublicNotificationExtras='");
        C25541a.m63890u(k, this.mPublicNotificationExtras, '\'', "\n, NotificationChannelId='");
        C25541a.m63890u(k, this.mNotificationChannelId, '\'', "\n, NotificationCategory='");
        C25541a.m63890u(k, this.mNotificationCategory, '\'', "\n, NotificationVisibility=");
        k.append(this.mNotificationVisibility);
        k.append("\n, NotificationBadgeNumber=");
        k.append(this.mNotificationBadgeNumber);
        k.append("\n, CustomNotificationId=");
        k.append(this.mCustomNotificationId);
        k.append("\n, NotificationReceivedTimestampMillis=");
        k.append(this.mNotificationReceivedTimestampMillis);
        k.append("\n, ContentCardSyncData='");
        C25541a.m63890u(k, this.mContentCardSyncData, '\'', "\n, ContentCardSyncUserId='");
        C25541a.m63890u(k, this.mContentCardSyncUserId, '\'', "\n, Title='");
        C25541a.m63890u(k, this.mTitleText, '\'', "\n, ContentText='");
        C25541a.m63890u(k, this.mContentText, '\'', "\n, LargeIcon='");
        C25541a.m63890u(k, this.mLargeIcon, '\'', "\n, NotificationSound='");
        C25541a.m63890u(k, this.mNotificationSound, '\'', "\n, SummaryText='");
        C25541a.m63890u(k, this.mSummaryText, '\'', "\n, AccentColor=");
        k.append(this.mAccentColor);
        k.append("\n, BigSummaryText='");
        C25541a.m63890u(k, this.mBigSummaryText, '\'', "\n, BigTitleText='");
        C25541a.m63890u(k, this.mBigTitleText, '\'', "\n, BigImageUrl='");
        C25541a.m63890u(k, this.mBigImageUrl, '\'', "\n, PushStoryPages=");
        k.append(this.mPushStoryPages);
        return k.toString();
    }

    public static String getActionFieldAtIndex(int i, Bundle bundle, String str, String str2) {
        String string = bundle.getString(str.replace("*", String.valueOf(i)));
        return string == null ? str2 : string;
    }

    public BrazeNotificationPayload(BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle) {
        this(bundle);
        this.mConfigurationProvider = brazeConfigurationProvider;
    }

    public BrazeNotificationPayload(Context context, Bundle bundle) {
        this(bundle);
        this.mContext = context;
    }

    @Deprecated
    public BrazeNotificationPayload(Context context, AppboyConfigurationProvider appboyConfigurationProvider, Bundle bundle) {
        this(bundle);
        this.mContext = context;
        this.mConfigurationProvider = (BrazeConfigurationProvider) appboyConfigurationProvider;
    }

    public BrazeNotificationPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle) {
        this(bundle);
        this.mContext = context;
        this.mConfigurationProvider = brazeConfigurationProvider;
    }

    @Deprecated
    public BrazeNotificationPayload(Context context, AppboyConfigurationProvider appboyConfigurationProvider, Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2);
        this.mContext = context;
        this.mConfigurationProvider = (BrazeConfigurationProvider) appboyConfigurationProvider;
    }

    public BrazeNotificationPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        this(bundle, bundle2);
        this.mContext = context;
        this.mConfigurationProvider = brazeConfigurationProvider;
    }

    public BrazeNotificationPayload(Bundle bundle) {
        this(bundle, getAttachedAppboyExtras(bundle));
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2) {
        this.mIsPushStory = false;
        this.mIsInlineImagePush = false;
        this.mActionButtons = new ArrayList();
        this.mPushStoryPages = new ArrayList();
        this.mNotificationExtras = bundle == null ? new Bundle() : bundle;
        this.mAppboyExtras = bundle2 == null ? new Bundle() : bundle2;
        parsePayloadFieldsFromBundle();
    }
}
