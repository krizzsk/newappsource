package com.appboy.models.outgoing;

import androidx.annotation.Keep;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class TwitterUser implements IPutIntoJson<JSONObject> {
    public static final String DESCRIPTION_KEY = "description";
    public static final String FOLLOWERS_COUNT_KEY = "followers_count";
    public static final String FOLLOWING_COUNT_KEY = "friends_count";
    public static final String HANDLE_KEY = "screen_name";
    public static final String ID_KEY = "id";
    public static final String NAME_KEY = "name";
    public static final String PROFILE_IMAGE_URL_KEY = "profile_image_url";
    public static final String STATUS_UPDATES_COUNT_KEY = "statuses_count";
    public static final String TAG = AppboyLogger.getBrazeLogTag(TwitterUser.class);
    public final String mDescription;
    public final Integer mFollowers;
    public final Integer mFollowing;
    public final String mName;
    public final String mProfileImageUrl;
    public final Integer mTweets;
    public final String mTwitterHandle;
    public final Integer mTwitterUserId;

    public TwitterUser(Integer num, String str, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4) {
        this.mTwitterUserId = num;
        this.mTwitterHandle = str;
        this.mName = str2;
        this.mDescription = str3;
        this.mFollowers = num2;
        this.mFollowing = num3;
        this.mTweets = num4;
        this.mProfileImageUrl = str4;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isNullOrBlank(this.mTwitterHandle)) {
                jSONObject.put(HANDLE_KEY, this.mTwitterHandle);
            }
            if (!StringUtils.isNullOrBlank(this.mName)) {
                jSONObject.put("name", this.mName);
            }
            if (!StringUtils.isNullOrBlank(this.mDescription)) {
                jSONObject.put(DESCRIPTION_KEY, this.mDescription);
            }
            if (!StringUtils.isNullOrBlank(this.mProfileImageUrl)) {
                jSONObject.put(PROFILE_IMAGE_URL_KEY, this.mProfileImageUrl);
            }
            jSONObject.put("id", this.mTwitterUserId);
            jSONObject.put(FOLLOWERS_COUNT_KEY, this.mFollowers);
            jSONObject.put(FOLLOWING_COUNT_KEY, this.mFollowing);
            jSONObject.put(STATUS_UPDATES_COUNT_KEY, this.mTweets);
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught exception creating twitter user Json.", e);
        }
        return jSONObject;
    }
}
