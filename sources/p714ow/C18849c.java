package p714ow;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.moovit.app.surveys.recorder.events.SurveyEvent;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.surveys.MVSurveyRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ow.c */
public final class C18849c extends C13778r<C18849c, C18850d, MVSurveyRequest> {

    /* renamed from: w */
    public final List<SurveyEvent> f47990w;

    public C18849c(C13752e eVar, List list, ArrayList arrayList) {
        super(eVar, R.string.api_path_send_survey_events, C18850d.class);
        this.f47990w = arrayList;
        ArrayList c = C13720d.m34273c(list, (C13722f) null, new C18847a(0));
        ArrayList c2 = C13720d.m34273c(arrayList, (C13722f) null, new C18848b(0));
        int i = eVar.f33853b.f50160a.f32926b;
        RO mVSurveyRequest = new MVSurveyRequest();
        mVSurveyRequest.contexts = c;
        mVSurveyRequest.events = c2;
        mVSurveyRequest.percentage = i;
        mVSurveyRequest.mo31974i();
        this.f33922v = mVSurveyRequest;
    }
}
