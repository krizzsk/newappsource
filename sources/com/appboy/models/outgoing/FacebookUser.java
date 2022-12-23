package com.appboy.models.outgoing;

import androidx.annotation.Keep;
import com.appboy.enums.Gender;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class FacebookUser implements IPutIntoJson<JSONObject> {
    public static final String BIO_KEY = "bio";
    public static final String BIRTHDAY_KEY = "birthday";
    public static final String EMAIL_KEY = "email";
    public static final String FIRST_NAME_KEY = "first_name";
    public static final String FRIENDS_COUNT_KEY = "num_friends";
    public static final String GENDER_KEY = "gender";
    public static final String ID_KEY = "id";
    public static final String LAST_NAME_KEY = "last_name";
    public static final String LIKES_KEY = "likes";
    public static final String LIKE_INNER_KEY = "name";
    public static final String LOCATION_INNER_KEY = "name";
    public static final String LOCATION_OUTER_OBJECT_KEY = "location";
    public static final String TAG = AppboyLogger.getBrazeLogTag(FacebookUser.class);
    public final String mBio;
    public final String mBirthday;
    public final String mCityName;
    public final String mEmail;
    public final String mFacebookId;
    public final String mFirstName;
    public final Gender mGender;
    public final String mLastName;
    public final Collection<String> mLikes;
    public final Integer mNumberOfFriends;

    public FacebookUser(String str, String str2, String str3, String str4, String str5, String str6, Gender gender, Integer num, Collection<String> collection, String str7) {
        this.mFacebookId = str;
        this.mFirstName = str2;
        this.mLastName = str3;
        this.mEmail = str4;
        this.mBio = str5;
        this.mCityName = str6;
        this.mGender = gender;
        this.mNumberOfFriends = num;
        this.mLikes = collection;
        this.mBirthday = str7;
    }

    private JSONArray getLikesArray() {
        JSONArray jSONArray = new JSONArray();
        for (String put : this.mLikes) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", put);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!StringUtils.isNullOrBlank(this.mFacebookId)) {
                jSONObject.put("id", this.mFacebookId);
            }
            if (!StringUtils.isNullOrBlank(this.mFirstName)) {
                jSONObject.put(FIRST_NAME_KEY, this.mFirstName);
            }
            if (!StringUtils.isNullOrBlank(this.mLastName)) {
                jSONObject.put(LAST_NAME_KEY, this.mLastName);
            }
            if (!StringUtils.isNullOrBlank(this.mEmail)) {
                jSONObject.put("email", this.mEmail);
            }
            if (!StringUtils.isNullOrBlank(this.mBio)) {
                jSONObject.put(BIO_KEY, this.mBio);
            }
            if (!StringUtils.isNullOrBlank(this.mBirthday)) {
                jSONObject.put(BIRTHDAY_KEY, this.mBirthday);
            }
            if (!StringUtils.isNullOrBlank(this.mCityName)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", this.mCityName);
                jSONObject.put(LOCATION_OUTER_OBJECT_KEY, jSONObject2);
            }
            Gender gender = this.mGender;
            if (gender != null) {
                jSONObject.put("gender", gender.forJsonPut());
            }
            jSONObject.put(FRIENDS_COUNT_KEY, this.mNumberOfFriends);
            Collection<String> collection = this.mLikes;
            if (collection != null && !collection.isEmpty()) {
                jSONObject.put(LIKES_KEY, getLikesArray());
            }
        } catch (JSONException e) {
            AppboyLogger.m5452e(TAG, "Caught exception creating facebook user Json.", e);
        }
        return jSONObject;
    }
}
