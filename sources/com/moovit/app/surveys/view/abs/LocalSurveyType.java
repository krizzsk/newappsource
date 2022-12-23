package com.moovit.app.surveys.view.abs;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum LocalSurveyType implements Parcelable {
    STOP(new ServerId(1), R.string.user_in_app_feedback_times_url),
    LINE(new ServerId(1), R.string.user_in_app_feedback_times_url),
    SUGGESTED_ROUTES(new ServerId(1), R.string.user_in_app_feedback_trip_plan_url);
    
    public static final C19577c<LocalSurveyType> CODER = null;
    public static final Parcelable.Creator<LocalSurveyType> CREATOR = null;
    private final int feedbackUrlResId;
    private final ServerId nodeOrQuestionId;

    /* renamed from: com.moovit.app.surveys.view.abs.LocalSurveyType$a */
    public class C15410a implements Parcelable.Creator<LocalSurveyType> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocalSurveyType) C19612n.m46981v(parcel, LocalSurveyType.CODER);
        }

        public final Object[] newArray(int i) {
            return new LocalSurveyType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        LocalSurveyType localSurveyType;
        LocalSurveyType localSurveyType2;
        LocalSurveyType localSurveyType3;
        CREATOR = new C15410a();
        CODER = new C19577c<>(LocalSurveyType.class, localSurveyType, localSurveyType2, localSurveyType3);
    }

    private LocalSurveyType(ServerId serverId, int i) {
        C21100e.m49373x(serverId, "nodeOrQuestionId");
        this.nodeOrQuestionId = serverId;
        this.feedbackUrlResId = i;
    }

    public int describeContents() {
        return 0;
    }

    public int getFeedbackUrlResId() {
        return this.feedbackUrlResId;
    }

    public ServerId getNodeId() {
        return this.nodeOrQuestionId;
    }

    public ServerId getQuestionId() {
        return this.nodeOrQuestionId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
