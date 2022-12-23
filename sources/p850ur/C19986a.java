package p850ur;

import android.os.Parcelable;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.carpool.survey.SurveyOption;
import com.tranzmate.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: ur.a */
public final class C19986a {

    /* renamed from: a */
    public static final List<SurveyOption> f50821a = Arrays.asList(new SurveyOption[]{new SurveyOption("option_1", MoovitAppApplication.m37038x().getString(R.string.carpool_ride_annulled_survey_1)), new SurveyOption("option_2", MoovitAppApplication.m37038x().getString(R.string.carpool_ride_annulled_survey_2)), new SurveyOption("option_3", MoovitAppApplication.m37038x().getString(R.string.carpool_ride_annulled_survey_3))});

    static {
        Parcelable.Creator<SurveyOption> creator = SurveyOption.CREATOR;
    }
}
