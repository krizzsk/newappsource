package p643lw;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13772m;
import c70.C13779s;
import com.moovit.app.surveys.configuration.SurveyConfiguration;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.surveys.MVSurveysConfiguration;
import java.io.IOException;
import java.util.Collections;
import org.apache.thrift.TBase;
import p009a8.C0111k;
import p435de.C16596f;
import p646lz.C18299a;
import p824tp.C19728f;
import p929xy.C20664g;

/* renamed from: lw.a */
public final class C18281a extends C20664g<SurveyConfiguration> {

    /* renamed from: lw.a$a */
    public static class C18282a extends C13779s<C18282a, MVSurveysConfiguration, SurveyConfiguration> {
        public C18282a() {
            super(MVSurveysConfiguration.class);
        }

        /* renamed from: e */
        public final Object mo23773e(TBase tBase) throws BadResponseException {
            MVSurveysConfiguration mVSurveysConfiguration = (MVSurveysConfiguration) tBase;
            return new SurveyConfiguration(C13720d.m34277g(mVSurveysConfiguration.types, (C13722f) null, new C0111k(1)), mVSurveysConfiguration.delayIntervalSec);
        }
    }

    /* renamed from: f */
    public final Object mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            return (SurveyConfiguration) super.mo6591f(context, aVar, str);
        } catch (Throwable th) {
            C16596f.m42113a().mo49364c(new AppDataPartLoadFailedException("Failed to load survey configuration", (String) null, th));
            return new SurveyConfiguration(Collections.emptySet(), Integer.MAX_VALUE);
        }
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return (SurveyConfiguration) ((C18282a) new C13772m(eVar, C13772m.m34411L(eVar.f33852a, R.string.server_path_cdn_server_url, R.string.api_path_survey_configuration_path, "", eVar.f33853b, (C19728f) null), C18282a.class).mo52626J()).f33924g;
    }
}
