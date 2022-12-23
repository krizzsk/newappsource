package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.outgoing.FacebookUser;
import com.facebook.AccessToken;
import com.facebook.internal.C2397f0;
import com.facebook.internal.C2400g0;
import com.usebutton.sdk.internal.WebViewActivity;
import java.util.Date;
import kotlin.Metadata;
import mf0.C24362h;
import org.json.JSONObject;
import p009a8.C0127w;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "b", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class Profile implements Parcelable {
    public static final Parcelable.Creator<Profile> CREATOR = new C2286a();

    /* renamed from: b */
    public final String f8445b;

    /* renamed from: c */
    public final String f8446c;

    /* renamed from: d */
    public final String f8447d;

    /* renamed from: e */
    public final String f8448e;

    /* renamed from: f */
    public final String f8449f;

    /* renamed from: g */
    public final Uri f8450g;

    /* renamed from: h */
    public final Uri f8451h;

    /* renamed from: com.facebook.Profile$a */
    public static final class C2286a implements Parcelable.Creator<Profile> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "source");
            return new Profile(parcel);
        }

        public final Object[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* renamed from: com.facebook.Profile$b */
    public static final class C2287b {

        /* renamed from: com.facebook.Profile$b$a */
        public static final class C2288a implements C2397f0.C2398a {
            /* renamed from: a */
            public final void mo11931a(JSONObject jSONObject) {
                String str;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject == null) {
                    str = null;
                } else {
                    str = jSONObject.optString("id");
                }
                if (str == null) {
                    Parcelable.Creator<Profile> creator = Profile.CREATOR;
                    return;
                }
                String optString = jSONObject.optString(WebViewActivity.EXTRA_LINK);
                String optString2 = jSONObject.optString("profile_picture", (String) null);
                String optString3 = jSONObject.optString(FacebookUser.FIRST_NAME_KEY);
                String optString4 = jSONObject.optString("middle_name");
                String optString5 = jSONObject.optString(FacebookUser.LAST_NAME_KEY);
                String optString6 = jSONObject.optString("name");
                if (optString != null) {
                    uri = Uri.parse(optString);
                } else {
                    uri = null;
                }
                if (optString2 != null) {
                    uri2 = Uri.parse(optString2);
                }
                C0127w.f369d.mo282a().mo281a(new Profile(str, optString3, optString4, optString5, optString6, uri, uri2), true);
            }

            /* renamed from: b */
            public final void mo11932b(FacebookException facebookException) {
                Parcelable.Creator<Profile> creator = Profile.CREATOR;
                C24362h.m61216k(facebookException, "Got unexpected exception: ");
            }
        }

        /* renamed from: a */
        public static void m6157a() {
            Date date = AccessToken.f8348m;
            AccessToken b = AccessToken.C2266c.m6110b();
            if (b != null) {
                if (!AccessToken.C2266c.m6111c()) {
                    C0127w.f369d.mo282a().mo281a((Profile) null, true);
                    return;
                }
                C2397f0 f0Var = C2397f0.f8630a;
                C2397f0.m6322p(new C2288a(), b.f8355f);
            }
        }
    }

    static {
        Class<Profile> cls = Profile.class;
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C2400g0.m6341f(str, "id");
        this.f8445b = str;
        this.f8446c = str2;
        this.f8447d = str3;
        this.f8448e = str4;
        this.f8449f = str5;
        this.f8450g = uri;
        this.f8451h = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f8445b;
        if (((str5 != null || ((Profile) obj).f8445b != null) && !C24362h.m61206a(str5, ((Profile) obj).f8445b)) || ((((str = this.f8446c) != null || ((Profile) obj).f8446c != null) && !C24362h.m61206a(str, ((Profile) obj).f8446c)) || ((((str2 = this.f8447d) != null || ((Profile) obj).f8447d != null) && !C24362h.m61206a(str2, ((Profile) obj).f8447d)) || ((((str3 = this.f8448e) != null || ((Profile) obj).f8448e != null) && !C24362h.m61206a(str3, ((Profile) obj).f8448e)) || ((((str4 = this.f8449f) != null || ((Profile) obj).f8449f != null) && !C24362h.m61206a(str4, ((Profile) obj).f8449f)) || ((((uri = this.f8450g) != null || ((Profile) obj).f8450g != null) && !C24362h.m61206a(uri, ((Profile) obj).f8450g)) || (((uri2 = this.f8451h) != null || ((Profile) obj).f8451h != null) && !C24362h.m61206a(uri2, ((Profile) obj).f8451h)))))))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.f8445b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = 527 + i;
        String str2 = this.f8446c;
        if (str2 != null) {
            i2 = (i2 * 31) + str2.hashCode();
        }
        String str3 = this.f8447d;
        if (str3 != null) {
            i2 = (i2 * 31) + str3.hashCode();
        }
        String str4 = this.f8448e;
        if (str4 != null) {
            i2 = (i2 * 31) + str4.hashCode();
        }
        String str5 = this.f8449f;
        if (str5 != null) {
            i2 = (i2 * 31) + str5.hashCode();
        }
        Uri uri = this.f8450g;
        if (uri != null) {
            i2 = (i2 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f8451h;
        if (uri2 != null) {
            return (i2 * 31) + uri2.hashCode();
        }
        return i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8445b);
        parcel.writeString(this.f8446c);
        parcel.writeString(this.f8447d);
        parcel.writeString(this.f8448e);
        parcel.writeString(this.f8449f);
        Uri uri = this.f8450g;
        String str2 = null;
        if (uri == null) {
            str = null;
        } else {
            str = uri.toString();
        }
        parcel.writeString(str);
        Uri uri2 = this.f8451h;
        if (uri2 != null) {
            str2 = uri2.toString();
        }
        parcel.writeString(str2);
    }

    public Profile(JSONObject jSONObject) {
        Uri uri;
        Uri uri2 = null;
        this.f8445b = jSONObject.optString("id", (String) null);
        this.f8446c = jSONObject.optString(FacebookUser.FIRST_NAME_KEY, (String) null);
        this.f8447d = jSONObject.optString("middle_name", (String) null);
        this.f8448e = jSONObject.optString(FacebookUser.LAST_NAME_KEY, (String) null);
        this.f8449f = jSONObject.optString("name", (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        if (optString == null) {
            uri = null;
        } else {
            uri = Uri.parse(optString);
        }
        this.f8450g = uri;
        String optString2 = jSONObject.optString("picture_uri", (String) null);
        this.f8451h = optString2 != null ? Uri.parse(optString2) : uri2;
    }

    public Profile(Parcel parcel) {
        Uri uri;
        this.f8445b = parcel.readString();
        this.f8446c = parcel.readString();
        this.f8447d = parcel.readString();
        this.f8448e = parcel.readString();
        this.f8449f = parcel.readString();
        String readString = parcel.readString();
        Uri uri2 = null;
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f8450g = uri;
        String readString2 = parcel.readString();
        this.f8451h = readString2 != null ? Uri.parse(readString2) : uri2;
    }
}
