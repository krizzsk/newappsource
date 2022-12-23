package com.moovit.app.help.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.MoovitAppApplication;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p80.C12995d;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p874vr.C20199a;
import q00.C19047a;
import q00.C19053d;

public enum CategoryType implements Parcelable {
    MOT(R.string.feedback_form_mot_title, "feedback_cat_mot", Arrays.asList(new FeedbackType[]{FeedbackType.MOT_CHARGE_PROBLEM, FeedbackType.MOT_CALCULATION_PROBLEM, FeedbackType.MOT_PROVIDER_RIDE_PROBLEM, FeedbackType.MOT_USER_RIDE_PROBLEM, FeedbackType.MOT_ACTIVATION_PROBLEM, FeedbackType.MOT_OTHER_PROBLEM, FeedbackType.MOT_INCORRECT_TRAIN_FARE, FeedbackType.MOT_DISCONNECT})),
    WRONG_INFORMATION(R.string.feedback_form_wrong_info_title, "feedback_cat_data", Arrays.asList(new FeedbackType[]{FeedbackType.ARRIVAL_TIME, FeedbackType.SCHEDULE, FeedbackType.STOP_PLATFORM_ENTRANCE_LOCATION, FeedbackType.ROUTE, FeedbackType.IRRELEVANT_NOTIFICATION, FeedbackType.INACCURATE_FARES, FeedbackType.ISSUE_WITH_BIKE_OR_SCOOTER_PROVIDER, FeedbackType.IRRELEVANT_SERVICE_ALERT, FeedbackType.MY_BUSINESS_NAME_OR_LOCATION, FeedbackType.MOOVIT_MAP})),
    SUGGEST_IMPROVEMENTS(R.string.feedback_form_improvements_title, "feedback_cat_improvements", Arrays.asList(new FeedbackType[]{FeedbackType.TRIP_PLAN, FeedbackType.LOCATION_NAMES, FeedbackType.ACCESSIBILITY_FEATURES, FeedbackType.NOTIFICATIONS, FeedbackType.USER_EXPERIENCE})),
    PERSONAL_DATA_GDPR(R.string.feedback_form_personal_title, "feedback_cat_personal_data", Arrays.asList(new FeedbackType[]{FeedbackType.EDIT_OR_DELETE_MOOVIT_ACCOUNT, FeedbackType.ADD_OR_DELETE_BUSINESS_NAME_OR_LOCATION, FeedbackType.REPORT_SECURITY_ISSUE, FeedbackType.OTHER_COMMENTS_QUESTIONS_REQUESTS})),
    FEATURE_REQUEST(R.string.feedback_form_feature_title, "feedback_cat_feature_request", Arrays.asList(new FeedbackType[]{FeedbackType.ADD_ACCESSIBILITY_FEATURES, FeedbackType.IMPROVE_NOTIFICATION_EXPERIENCE, FeedbackType.IMPROVE_GENERAL_USER_EXPERIENCE, FeedbackType.OTHER_FEATURE})),
    MOOVIT_CARPOOL(R.string.feedback_form_carpool_title, "feedback_cat_carpool", Arrays.asList(new FeedbackType[]{FeedbackType.CARPOOL_RIDER, FeedbackType.CARPOOL_DRIVER})),
    TICKETS_AND_VALIDATIONS(R.string.feedback_form_tickets_title, "", Arrays.asList(new FeedbackType[]{FeedbackType.REGISTRATION_PROBLEMS, FeedbackType.CREDIT_CARD_PROBLEMS, FeedbackType.PURCHASING_OR_VALIDATING_PROBLEMS})),
    OTHER(R.string.feedback_form_other_title, "feedback_cat_other", Collections.singletonList(FeedbackType.OTHER));
    
    public static final C19577c<CategoryType> CODER = null;
    public static final Parcelable.Creator<CategoryType> CREATOR = null;
    private final String categoryTypeTag;
    private final List<FeedbackType> feedbackTypes;
    private int nameResId;

    /* renamed from: com.moovit.app.help.feedback.CategoryType$a */
    public class C14905a implements Parcelable.Creator<CategoryType> {
        public final Object createFromParcel(Parcel parcel) {
            return (CategoryType) C19612n.m46981v(parcel, CategoryType.CODER);
        }

        public final Object[] newArray(int i) {
            return new CategoryType[i];
        }
    }

    /* renamed from: com.moovit.app.help.feedback.CategoryType$b */
    public static /* synthetic */ class C14906b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38101a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.help.feedback.CategoryType[] r0 = com.moovit.app.help.feedback.CategoryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38101a = r0
                com.moovit.app.help.feedback.CategoryType r1 = com.moovit.app.help.feedback.CategoryType.MOOVIT_CARPOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38101a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.help.feedback.CategoryType r1 = com.moovit.app.help.feedback.CategoryType.TICKETS_AND_VALIDATIONS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38101a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.help.feedback.CategoryType r1 = com.moovit.app.help.feedback.CategoryType.MOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.help.feedback.CategoryType.C14906b.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    static {
        CategoryType categoryType;
        CategoryType categoryType2;
        CategoryType categoryType3;
        CategoryType categoryType4;
        CategoryType categoryType5;
        CategoryType categoryType6;
        CategoryType categoryType7;
        CategoryType categoryType8;
        CREATOR = new C14905a();
        CODER = new C19577c<>(CategoryType.class, categoryType2, categoryType3, categoryType4, categoryType5, categoryType6, categoryType7, categoryType8, categoryType);
    }

    private CategoryType(int i, String str, List<FeedbackType> list) {
        this.nameResId = i;
        C21100e.m49373x(str, "categoryTypeTag");
        this.categoryTypeTag = str;
        C21100e.m49373x(list, "feedbackTypes");
        this.feedbackTypes = Collections.unmodifiableList(list);
    }

    public int describeContents() {
        return 0;
    }

    public String getCategoryTypeTag() {
        return this.categoryTypeTag;
    }

    public List<FeedbackType> getFeedbackTypes() {
        return this.feedbackTypes;
    }

    public int getNameResId() {
        return this.nameResId;
    }

    public boolean isSupported() {
        C19047a aVar = (C19047a) MoovitAppApplication.m37038x().f37321e.mo50690c("CONFIGURATION");
        int i = C14906b.f38101a[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                if (aVar == null || !((Boolean) aVar.mo51505b(C20199a.f51242D0)).booleanValue()) {
                    return false;
                }
                return true;
            } else if (aVar == null || !((Boolean) aVar.mo51505b(C12995d.f32165a)).booleanValue()) {
                return false;
            } else {
                return true;
            }
        } else if (aVar == null || !((Boolean) aVar.mo51505b(C19053d.f48487z)).booleanValue()) {
            return false;
        } else {
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
