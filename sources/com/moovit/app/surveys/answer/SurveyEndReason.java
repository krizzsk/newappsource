package com.moovit.app.surveys.answer;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum SurveyEndReason implements Parcelable {
    FINISHED,
    CANCELLED,
    NOT_RELEVANT,
    NOTIFICATION_DISMISSED;
    
    public static final C19577c<SurveyEndReason> CODER = null;
    public static final Parcelable.Creator<SurveyEndReason> CREATOR = null;

    /* renamed from: com.moovit.app.surveys.answer.SurveyEndReason$a */
    public class C15378a implements Parcelable.Creator<SurveyEndReason> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyEndReason) C19612n.m46981v(parcel, SurveyEndReason.CODER);
        }

        public final Object[] newArray(int i) {
            return new SurveyEndReason[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        SurveyEndReason surveyEndReason;
        SurveyEndReason surveyEndReason2;
        SurveyEndReason surveyEndReason3;
        SurveyEndReason surveyEndReason4;
        CREATOR = new C15378a();
        CODER = new C19577c<>(SurveyEndReason.class, surveyEndReason, surveyEndReason2, surveyEndReason3, surveyEndReason4);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
