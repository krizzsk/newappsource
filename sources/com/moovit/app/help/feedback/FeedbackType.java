package com.moovit.app.help.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.tranzmate.R;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum FeedbackType implements Parcelable {
    ARRIVAL_TIME("real_time_arrivals_feedback", R.string.feedback_form_wrong_info_arriaval, R.string.feedback_form_wrong_info_arrival_sub),
    SCHEDULE("static_schedules_feedback", R.string.feedback_form_wrong_info_schedule, R.string.feedback_form_wrong_info_schedule_sub),
    STOP_PLATFORM_ENTRANCE_LOCATION("stops_feedback", R.string.feedback_form_wrong_info_location, R.string.feedback_form_wrong_info_location_sub),
    ROUTE("lines_feedback", R.string.feedback_form_wrong_info_route, R.string.feedback_form_wrong_info_route_sub),
    IRRELEVANT_NOTIFICATION("notifications_feedback", R.string.feedback_form_wrong_info_notification, R.string.feedback_form_wrong_info_notification_sub),
    INACCURATE_FARES("fares_feedback", R.string.feedback_form_wrong_info_fares, R.string.feedback_form_wrong_info_fares_sub),
    ISSUE_WITH_BIKE_OR_SCOOTER_PROVIDER("dockless_/_sharing_mobility_feedback", R.string.feedback_form_wrong_info_mircro, R.string.feedback_form_wrong_info_mircro_sub),
    IRRELEVANT_SERVICE_ALERT("service_alerts_feedback", R.string.feedback_form_wrong_info_alert, R.string.feedback_form_wrong_info_alert_sub),
    MY_BUSINESS_NAME_OR_LOCATION("personal_data_/_gdpr_feedback", R.string.feedback_form_wrong_info_business, R.string.feedback_form_wrong_info_business_sub),
    MOOVIT_MAP("map_coverage_/_issue_feedback", R.string.feedback_form_wrong_info_map, R.string.feedback_form_wrong_info_map_sub),
    TRIP_PLAN("suggested_routes/trips_feedback", R.string.feedback_form_improvements_tp, 0),
    LOCATION_NAMES("search_issues_feedback", R.string.feedback_form_improvements_poi, R.string.feedback_form_improvements_poi_sub),
    ACCESSIBILITY_FEATURES("accessibility_feedback", R.string.feedback_form_improvements_accessibility, 0),
    NOTIFICATIONS("notifications_feedback", R.string.feedback_form_improvements_notifications, R.string.feedback_form_improvements_notifications_sub),
    USER_EXPERIENCE("product_ui/ux_feedback", R.string.feedback_form_improvements_ux, 0),
    EDIT_OR_DELETE_MOOVIT_ACCOUNT("personal_data_/_gdpr_feedback", R.string.feedback_form_personal_account, 0),
    ADD_OR_DELETE_BUSINESS_NAME_OR_LOCATION("personal_data_/_gdpr_feedback", R.string.feedback_form_personal_business, 0),
    REPORT_SECURITY_ISSUE("report_a_security_issue", R.string.feedback_form_security_issue, 0),
    OTHER_COMMENTS_QUESTIONS_REQUESTS("general_feedback", R.string.feedback_form_personal_other, 0),
    ADD_ACCESSIBILITY_FEATURES("accessibility_feedback", R.string.feedback_form_feature_accessibility, 0),
    IMPROVE_NOTIFICATION_EXPERIENCE("notifications_feedback", R.string.feedback_form_feature_notification, 0),
    IMPROVE_GENERAL_USER_EXPERIENCE("product_ui/ux_feedback", R.string.feedback_form_feature_ux, 0),
    OTHER_FEATURE("general_feedback", R.string.feedback_form_feature_other, 0),
    CARPOOL_RIDER("carpool_rider", R.string.feedback_form_carpool_rider, R.string.feedback_form_carpool_sub),
    CARPOOL_DRIVER("carpool_driver", R.string.feedback_form_carpool_driver, R.string.feedback_form_carpool_sub),
    REGISTRATION_PROBLEMS("registering_feedback", R.string.feedback_form_tickets_registration, 0),
    CREDIT_CARD_PROBLEMS("credit_card_feedback", R.string.feedback_form_tickets_credit, 0),
    PURCHASING_OR_VALIDATING_PROBLEMS("purchasing_validating_feedback", R.string.feedback_form_tickets_purchasing, 0),
    MOT_CHARGE_PROBLEM("mot_charge_problem_feedback", R.string.feedback_form_mot_charge_problem, R.string.feedback_form_mot_charge_problem_sub),
    MOT_CALCULATION_PROBLEM("mot_calculation_problem_feedback", R.string.feedback_form_mot_calculation_problem, R.string.feedback_form_mot_calculation_problem_sub),
    MOT_PROVIDER_RIDE_PROBLEM("mot_provider_ride_problem_feedback", R.string.feedback_form_mot_provider_ride_problem, R.string.feedback_form_mot_provider_ride_problem_sub),
    MOT_USER_RIDE_PROBLEM("mot_user_ride_problem_feedback", R.string.feedback_form_mot_user_ride_problem, R.string.feedback_form_mot_user_ride_problem_sub),
    MOT_ACTIVATION_PROBLEM("mot_activation_problem_feedback", R.string.feedback_form_mot_activation_problem, R.string.feedback_form_mot_activation_problem_sub),
    MOT_OTHER_PROBLEM("mot_other_problem_feedback", R.string.feedback_form_mot_other_problem, R.string.feedback_form_mot_other_problem_sub),
    MOT_INCORRECT_TRAIN_FARE("incorrect_train_fare", R.string.feedback_form_mot_train_max_dispute, R.string.feedback_form_mot_train_max_dispute_sub),
    MOT_DISCONNECT("mot_disconnect", R.string.feedback_form_mot_disconnect_title, R.string.feedback_form_mot_disconnect_subtitle),
    OTHER("general_feedback", R.string.feedback_form_other_title, R.string.feedback_form_other_sub);
    
    public static final C19577c<FeedbackType> CODER = null;
    public static final Parcelable.Creator<FeedbackType> CREATOR = null;
    private int descriptionHelperResId;
    private final String feedbackTypeTag;
    private int nameResId;

    /* renamed from: com.moovit.app.help.feedback.FeedbackType$a */
    public class C14907a implements Parcelable.Creator<FeedbackType> {
        public final Object createFromParcel(Parcel parcel) {
            return (FeedbackType) C19612n.m46981v(parcel, FeedbackType.CODER);
        }

        public final Object[] newArray(int i) {
            return new FeedbackType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        FeedbackType feedbackType;
        FeedbackType feedbackType2;
        FeedbackType feedbackType3;
        FeedbackType feedbackType4;
        FeedbackType feedbackType5;
        FeedbackType feedbackType6;
        FeedbackType feedbackType7;
        FeedbackType feedbackType8;
        FeedbackType feedbackType9;
        FeedbackType feedbackType10;
        FeedbackType feedbackType11;
        FeedbackType feedbackType12;
        FeedbackType feedbackType13;
        FeedbackType feedbackType14;
        FeedbackType feedbackType15;
        FeedbackType feedbackType16;
        FeedbackType feedbackType17;
        FeedbackType feedbackType18;
        FeedbackType feedbackType19;
        FeedbackType feedbackType20;
        FeedbackType feedbackType21;
        FeedbackType feedbackType22;
        FeedbackType feedbackType23;
        FeedbackType feedbackType24;
        FeedbackType feedbackType25;
        FeedbackType feedbackType26;
        FeedbackType feedbackType27;
        FeedbackType feedbackType28;
        FeedbackType feedbackType29;
        FeedbackType feedbackType30;
        FeedbackType feedbackType31;
        FeedbackType feedbackType32;
        FeedbackType feedbackType33;
        FeedbackType feedbackType34;
        FeedbackType feedbackType35;
        FeedbackType feedbackType36;
        FeedbackType feedbackType37;
        CREATOR = new C14907a();
        CODER = new C19577c<>(FeedbackType.class, feedbackType, feedbackType2, feedbackType3, feedbackType4, feedbackType5, feedbackType6, feedbackType7, feedbackType8, feedbackType9, feedbackType10, feedbackType11, feedbackType12, feedbackType13, feedbackType14, feedbackType15, feedbackType37, feedbackType36, feedbackType17, feedbackType18, feedbackType19, feedbackType20, feedbackType21, feedbackType22, feedbackType23, feedbackType24, feedbackType25, feedbackType26, feedbackType35, feedbackType27, feedbackType28, feedbackType29, feedbackType30, feedbackType31, feedbackType32, feedbackType33, feedbackType34, feedbackType16);
    }

    private FeedbackType(String str, int i, int i2) {
        C21100e.m49373x(str, "feedbackTypeTag");
        this.feedbackTypeTag = str;
        this.nameResId = i;
        this.descriptionHelperResId = i2;
    }

    public int describeContents() {
        return 0;
    }

    public int getDescriptionHelperResId() {
        return this.descriptionHelperResId;
    }

    public String getFeedbackTypeTag() {
        return this.feedbackTypeTag;
    }

    public int getNameResId() {
        return this.nameResId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
