package com.usebutton.sdk.action;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.context.Event;
import com.usebutton.sdk.context.Item;
import com.usebutton.sdk.context.Journey;
import com.usebutton.sdk.context.Location;
import com.usebutton.sdk.context.MusicArtist;
import com.usebutton.sdk.internal.api.AppActionRequest;
import com.usebutton.sdk.internal.models.BaseEntity;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;
import com.usebutton.sdk.internal.util.C12356Do;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ActionQuery extends BaseEntity implements Parcelable {
    private static final Set<String> BLACKLISTED_KEYS = new HashSet(Arrays.asList(new String[]{AppActionRequest.KEY_USER_LOCAL_TIME, "user_location"}));
    public static final Parcelable.Creator<ActionQuery> CREATOR = new Parcelable.Creator<ActionQuery>() {
        public ActionQuery createFromParcel(Parcel parcel) {
            try {
                return new ActionQuery(parcel);
            } catch (JSONException e) {
                ButtonLog.warn(ActionQuery.TAG, "Failed to create ActionQuery from parcel: " + parcel, e);
                return new ActionQuery();
            }
        }

        public ActionQuery[] newArray(int i) {
            return new ActionQuery[i];
        }
    };
    private static final String TAG = "ActionQuery";
    private String mKey;

    public ActionQuery() {
        this(new JSONObject());
    }

    private static void collect(List<String> list, List<String> list2, JSONObject jSONObject) {
        String next;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext() && (next = keys.next()) != null) {
            Object opt = jSONObject.opt(next);
            if (!shouldIgnoreKey(next)) {
                list.add(next);
                if (opt != null) {
                    if (opt instanceof JSONObject) {
                        collect(list, list2, (JSONObject) opt);
                    } else if (opt instanceof JSONArray) {
                        collect(list, list2, (JSONArray) opt);
                    } else {
                        list2.add(opt.toString());
                    }
                }
            }
        }
    }

    public static ActionQuery deepCopy(ActionQuery actionQuery) {
        if (actionQuery == null) {
            return null;
        }
        try {
            return new ActionQuery(new JSONObject(actionQuery.getData().toString()));
        } catch (JSONException e) {
            ButtonLog.warnFormat(TAG, "Couldn't copy context: %s\n%s", e, actionQuery.getData());
            return null;
        }
    }

    private static String orderedJson(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        collect((List<String>) arrayList, (List<String>) arrayList2, jSONObject);
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(',');
        }
        sb.append(10);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append(',');
        }
        return sb.toString();
    }

    private static boolean shouldIgnoreKey(String str) {
        return BLACKLISTED_KEYS.contains(str);
    }

    public static ActionQuery withArtist(MusicArtist musicArtist) {
        return new ActionQuery().setArtist(musicArtist);
    }

    public static ActionQuery withDate(Date date) {
        return new ActionQuery().setDate(date);
    }

    public static ActionQuery withDateRange(Date date, Date date2) {
        return new ActionQuery().setDateRange(date, date2);
    }

    public static ActionQuery withEvent(Event event) {
        return new ActionQuery().setEvent(event);
    }

    public static ActionQuery withJourney(Journey journey) {
        return new ActionQuery().setJourney(journey);
    }

    public static ActionQuery withSubjectLocation(Location location) {
        return new ActionQuery().setSubjectLocation(location);
    }

    public static ActionQuery withUserLocation(Location location) {
        return new ActionQuery().setUserLocation(location);
    }

    public ActionQuery addItem(Item item) {
        accumulateArray("items", item);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public String getType() {
        return AppActionRequest.KEY_CONTEXT;
    }

    public synchronized String key() {
        if (this.mKey == null) {
            this.mKey = ButtonUtil.md5(orderedJson(getData()));
        }
        return this.mKey;
    }

    public ActionQuery setArtist(MusicArtist musicArtist) {
        setValue("artist", (BaseEntity) musicArtist);
        return this;
    }

    public ActionQuery setDate(Date date) {
        setValue("applicable_date", ButtonUtil.isoFormat(date));
        return this;
    }

    public ActionQuery setDateRange(final Date date, final Date date2) {
        C12356Do.ifNotNull(date, new Runnable() {
            public void run() {
                ActionQuery.this.setValue("applicable_date_range_start", ButtonUtil.isoFormat(date));
            }
        });
        C12356Do.ifNotNull(date2, new Runnable() {
            public void run() {
                ActionQuery.this.setValue("applicable_date_range_end", ButtonUtil.isoFormat(date2));
            }
        });
        return this;
    }

    public ActionQuery setEvent(Event event) {
        setValue("event", (BaseEntity) event);
        return this;
    }

    public ActionQuery setJourney(Journey journey) {
        setValue("journey", (BaseEntity) journey);
        return this;
    }

    public ActionQuery setSubjectLocation(Location location) {
        setValue("subject_location", (BaseEntity) location);
        return this;
    }

    public ActionQuery setURL(Uri uri) {
        setValue("url", uri.toString());
        return this;
    }

    public ActionQuery setUserLocation(Location location) {
        setValue("user_location", (BaseEntity) location);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getData().toString());
    }

    public ActionQuery(Parcel parcel) throws JSONException {
        this(new JSONObject(parcel.readString()));
    }

    public ActionQuery(JSONObject jSONObject) {
        super(jSONObject);
    }

    private static void collect(List<String> list, List<String> list2, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            Object opt = jSONArray.opt(i);
            if (opt != null) {
                if (opt instanceof JSONArray) {
                    collect(list, list2, (JSONArray) opt);
                } else if (opt instanceof JSONObject) {
                    collect(list, list2, (JSONObject) opt);
                } else {
                    list2.add(opt.toString());
                }
            }
        }
    }
}
