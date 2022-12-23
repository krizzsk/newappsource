package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.C2421n;
import com.facebook.internal.C2429s;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;
import p009a8.C0115o;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "Category", "b", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C2276a();

    /* renamed from: k */
    public static final C2277b f8415k = new C2277b();

    /* renamed from: b */
    public final int f8416b;

    /* renamed from: c */
    public final int f8417c;

    /* renamed from: d */
    public final int f8418d;

    /* renamed from: e */
    public final String f8419e;

    /* renamed from: f */
    public final String f8420f;

    /* renamed from: g */
    public final String f8421g;

    /* renamed from: h */
    public final Object f8422h;

    /* renamed from: i */
    public final String f8423i;

    /* renamed from: j */
    public FacebookException f8424j;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", "OTHER", "TRANSIENT", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$a */
    public static final class C2276a implements Parcelable.Creator<FacebookRequestError> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Object) null, (FacebookException) null, false);
        }

        public final Object[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public static final class C2277b {
    }

    public /* synthetic */ FacebookRequestError() {
        throw null;
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z) {
        boolean z2;
        Category category;
        C2421n nVar;
        C2421n nVar2;
        Set set;
        Set set2;
        Set set3;
        this.f8416b = i;
        this.f8417c = i2;
        this.f8418d = i3;
        this.f8419e = str;
        this.f8420f = str3;
        this.f8421g = str4;
        this.f8422h = obj;
        this.f8423i = str2;
        if (facebookException != null) {
            this.f8424j = facebookException;
            z2 = true;
        } else {
            this.f8424j = new FacebookServiceException(this, mo11894b());
            z2 = false;
        }
        if (z2) {
            category = Category.OTHER;
        } else {
            synchronized (f8415k) {
                FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f8592a;
                C2429s b = FetchedAppSettingsManager.m6261b(C0115o.m211b());
                if (b == null) {
                    nVar2 = C2421n.f8691d.mo12591a();
                } else {
                    nVar2 = b.f8713f;
                }
            }
            if (z) {
                nVar2.getClass();
                category = Category.TRANSIENT;
            } else {
                Map<Integer, Set<Integer>> map = nVar2.f8693a;
                if (map == null || !map.containsKey(Integer.valueOf(i2)) || ((set3 = nVar2.f8693a.get(Integer.valueOf(i2))) != null && !set3.contains(Integer.valueOf(i3)))) {
                    Map<Integer, Set<Integer>> map2 = nVar2.f8695c;
                    if (map2 == null || !map2.containsKey(Integer.valueOf(i2)) || ((set2 = nVar2.f8695c.get(Integer.valueOf(i2))) != null && !set2.contains(Integer.valueOf(i3)))) {
                        Map<Integer, Set<Integer>> map3 = nVar2.f8694b;
                        if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set = nVar2.f8694b.get(Integer.valueOf(i2))) != null && !set.contains(Integer.valueOf(i3)))) {
                            category = Category.OTHER;
                        } else {
                            category = Category.TRANSIENT;
                        }
                    } else {
                        category = Category.LOGIN_RECOVERABLE;
                    }
                } else {
                    category = Category.OTHER;
                }
            }
        }
        synchronized (f8415k) {
            FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f8592a;
            C2429s b2 = FetchedAppSettingsManager.m6261b(C0115o.m211b());
            if (b2 == null) {
                nVar = C2421n.f8691d.mo12591a();
            } else {
                nVar = b2.f8713f;
            }
        }
        nVar.getClass();
        if (category != null) {
            int i4 = C2421n.C2423b.f8696a[category.ordinal()];
        }
    }

    /* renamed from: b */
    public final String mo11894b() {
        String str = this.f8423i;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f8424j;
        if (facebookException == null) {
            return null;
        }
        return facebookException.getLocalizedMessage();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f8416b + ", errorCode: " + this.f8417c + ", subErrorCode: " + this.f8418d + ", errorType: " + this.f8419e + ", errorMessage: " + mo11894b() + "}";
        C24362h.m61210e(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f8416b);
        parcel.writeInt(this.f8417c);
        parcel.writeInt(this.f8418d);
        parcel.writeString(this.f8419e);
        parcel.writeString(mo11894b());
        parcel.writeString(this.f8420f);
        parcel.writeString(this.f8421g);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, (String) null, (String) null, (String) null, (String) null, (Object) null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException((Throwable) exc), false);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, (Object) null, (FacebookException) null, false);
    }
}
