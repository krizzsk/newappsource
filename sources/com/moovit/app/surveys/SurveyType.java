package com.moovit.app.surveys;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum SurveyType implements Parcelable {
    LINE_GROUP,
    STOP,
    SUGGESTED_ROUTES,
    ITINERARY;
    
    public static final C19577c<SurveyType> CODER = null;
    public static final Parcelable.Creator<SurveyType> CREATOR = null;

    /* renamed from: com.moovit.app.surveys.SurveyType$a */
    public class C15377a implements Parcelable.Creator<SurveyType> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyType) C19612n.m46981v(parcel, SurveyType.CODER);
        }

        public final Object[] newArray(int i) {
            return new SurveyType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        SurveyType surveyType;
        SurveyType surveyType2;
        SurveyType surveyType3;
        SurveyType surveyType4;
        CREATOR = new C15377a();
        CODER = new C19577c<>(SurveyType.class, surveyType, surveyType2, surveyType3, surveyType4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
