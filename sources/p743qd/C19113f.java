package p743qd;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: qd.f */
public final class C19113f {

    /* renamed from: a */
    public final String f48581a;

    /* renamed from: b */
    public final String f48582b;

    /* renamed from: c */
    public final String f48583c;

    /* renamed from: d */
    public final String f48584d;

    /* renamed from: e */
    public final String f48585e;

    /* renamed from: f */
    public final String f48586f;

    /* renamed from: g */
    public final String f48587g;

    public C19113f(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f48582b = str;
        this.f48581a = str2;
        this.f48583c = str3;
        this.f48584d = str4;
        this.f48585e = str5;
        this.f48586f = str6;
        this.f48587g = str7;
    }

    /* renamed from: a */
    public static C19113f m46274a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C19113f(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19113f)) {
            return false;
        }
        C19113f fVar = (C19113f) obj;
        if (!Objects.equal(this.f48582b, fVar.f48582b) || !Objects.equal(this.f48581a, fVar.f48581a) || !Objects.equal(this.f48583c, fVar.f48583c) || !Objects.equal(this.f48584d, fVar.f48584d) || !Objects.equal(this.f48585e, fVar.f48585e) || !Objects.equal(this.f48586f, fVar.f48586f) || !Objects.equal(this.f48587g, fVar.f48587g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48582b, this.f48581a, this.f48583c, this.f48584d, this.f48585e, this.f48586f, this.f48587g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f48582b).add("apiKey", this.f48581a).add("databaseUrl", this.f48583c).add("gcmSenderId", this.f48585e).add("storageBucket", this.f48586f).add("projectId", this.f48587g).toString();
    }
}
