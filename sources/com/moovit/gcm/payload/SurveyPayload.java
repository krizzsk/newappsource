package com.moovit.gcm.payload;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class SurveyPayload extends GcmPayload {
    public static final Parcelable.Creator<SurveyPayload> CREATOR = new C15960a();

    /* renamed from: g */
    public static final C15961b f41580g = new C15961b();

    /* renamed from: h */
    public static final C15962c f41581h = new C15962c(SurveyPayload.class);

    /* renamed from: c */
    public final String f41582c;

    /* renamed from: d */
    public final String f41583d;

    /* renamed from: e */
    public final boolean f41584e;

    /* renamed from: f */
    public final int f41585f;

    /* renamed from: com.moovit.gcm.payload.SurveyPayload$a */
    public class C15960a implements Parcelable.Creator<SurveyPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyPayload) C19612n.m46981v(parcel, SurveyPayload.f41581h);
        }

        public final Object[] newArray(int i) {
            return new SurveyPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.SurveyPayload$b */
    public class C15961b extends C19621u<SurveyPayload> {
        public C15961b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            SurveyPayload surveyPayload = (SurveyPayload) obj;
            qVar.mo51954p(surveyPayload.f41546b);
            qVar.mo51954p(surveyPayload.f41582c);
            qVar.mo51955t(surveyPayload.f41583d);
            qVar.mo51934b(surveyPayload.f41584e);
            qVar.mo51939l(surveyPayload.f41585f);
        }
    }

    /* renamed from: com.moovit.gcm.payload.SurveyPayload$c */
    public class C15962c extends C19620t<SurveyPayload> {
        public C15962c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new SurveyPayload(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), pVar.mo51919b(), pVar.mo51924l());
        }
    }

    public SurveyPayload(String str, String str2, String str3, boolean z, int i) {
        super(str);
        C21100e.m49373x(str2, "url");
        this.f41582c = str2;
        this.f41583d = str3;
        this.f41584e = z;
        this.f41585f = i;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48019j(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "survey";
    }

    /* renamed from: d */
    public final Uri mo48084d(String str) {
        return Uri.parse(this.f41582c).buildUpon().appendQueryParameter("survey_id", String.valueOf(this.f41585f)).appendQueryParameter("user_key", str).build();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41580g);
    }
}
