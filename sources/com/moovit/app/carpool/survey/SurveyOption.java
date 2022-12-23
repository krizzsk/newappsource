package com.moovit.app.carpool.survey;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyOption implements Parcelable {
    public static final Parcelable.Creator<SurveyOption> CREATOR = new C14844a();

    /* renamed from: d */
    public static C14845b f37913d = new C14845b(SurveyOption.class);

    /* renamed from: b */
    public final String f37914b;

    /* renamed from: c */
    public final String f37915c;

    /* renamed from: com.moovit.app.carpool.survey.SurveyOption$a */
    public class C14844a implements Parcelable.Creator<SurveyOption> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyOption) C19612n.m46981v(parcel, SurveyOption.f37913d);
        }

        public final Object[] newArray(int i) {
            return new SurveyOption[i];
        }
    }

    /* renamed from: com.moovit.app.carpool.survey.SurveyOption$b */
    public class C14845b extends C19619s<SurveyOption> {
        public C14845b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SurveyOption(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyOption surveyOption = (SurveyOption) obj;
            qVar.mo51954p(surveyOption.f37915c);
            qVar.mo51954p(surveyOption.f37914b);
        }
    }

    public SurveyOption(String str, String str2) {
        this.f37915c = str;
        this.f37914b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f37914b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37913d);
    }
}
