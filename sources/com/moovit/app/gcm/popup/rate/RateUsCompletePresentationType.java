package com.moovit.app.gcm.popup.rate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.general.userprofile.UpdateUserAction;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.tranzmate.R;
import p543hq.C17474b;
import p567iq.C17635b;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p977zz.C20927a0;

public enum RateUsCompletePresentationType implements Parcelable {
    THANK_YOU(R.string.report_thank_you, R.string.pop_up_rate_us_average_rating_text),
    REQUEST_FEEDBACK(R.string.report_thank_you, R.string.pop_up_rate_us_bad_rating_text) {
        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$getAction$0(C14884a aVar) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_rate_us_feedback_button_type");
            aVar.mo22564R1(aVar2.mo49933a());
            aVar.startActivity(FeedbackFormActivity.m37597y2(aVar.getContext(), "RateUs"));
        }

        @SuppressLint({"WrongConstant"})
        public Runnable getAction(C14884a aVar) {
            return new C14886c(aVar);
        }

        public int getActionText() {
            return R.string.pop_up_rate_us_bad_rating_button;
        }
    },
    REQUEST_APP_STORE_REVIEW(R.string.report_thank_you, R.string.pop_up_rate_us_great_rating_text) {
        /* access modifiers changed from: private */
        public static void lambda$getAction$0(C14884a aVar) {
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "popup_rate_us_rate_now_button_type");
            aVar.mo22564R1(aVar2.mo49933a());
            ((C17635b) MoovitAppApplication.m37038x().mo44558j()).f50172b.mo42913b(new UpdateUserAction(aVar.f40792c, UpdateUserAction.UserActionType.RATE_ON_STORE), true);
            Context context = aVar.getContext();
            C20927a0.m49018m(context, context.getPackageName());
        }

        public Runnable getAction(C14884a aVar) {
            return new C14887d(aVar);
        }

        public int getActionText() {
            return R.string.action_rate_us;
        }
    };
    
    public static final C19577c<RateUsCompletePresentationType> CODER = null;
    public static final Parcelable.Creator<RateUsCompletePresentationType> CREATOR = null;
    public final int subtitleResId;
    public final int titleResId;

    /* renamed from: com.moovit.app.gcm.popup.rate.RateUsCompletePresentationType$a */
    public class C14883a implements Parcelable.Creator<RateUsCompletePresentationType> {
        public final Object createFromParcel(Parcel parcel) {
            return (RateUsCompletePresentationType) C19612n.m46981v(parcel, RateUsCompletePresentationType.CODER);
        }

        public final Object[] newArray(int i) {
            return new RateUsCompletePresentationType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        RateUsCompletePresentationType rateUsCompletePresentationType;
        C148811 r1;
        C148822 r4;
        CREATOR = new C14883a();
        CODER = new C19577c<>(RateUsCompletePresentationType.class, rateUsCompletePresentationType, r1, r4);
    }

    public int describeContents() {
        return 0;
    }

    public Runnable getAction(C14884a aVar) {
        return null;
    }

    public int getActionText() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }

    private RateUsCompletePresentationType(int i, int i2) {
        this.titleResId = i;
        this.subtitleResId = i2;
    }
}
