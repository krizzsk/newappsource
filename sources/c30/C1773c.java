package c30;

import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.matrolanguage.MetroLanguage;
import com.tranzmate.moovit.protocol.gtfs.MVMetroLanguage;
import com.tranzmate.moovit.protocol.gtfs.MVMetroLanguagesResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p054d0.C4303q;
import p828tt.C19765f;

/* renamed from: c30.c */
public final class C1773c extends C13780t<C1772b, C1773c, MVMetroLanguagesResponse> {

    /* renamed from: m */
    public List<MetroLanguage> f6244m = Collections.emptyList();

    public C1773c() {
        super(MVMetroLanguagesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C1772b bVar = (C1772b) aVar;
        MVMetroLanguagesResponse mVMetroLanguagesResponse = (MVMetroLanguagesResponse) tBase;
        if (mVMetroLanguagesResponse.mo27453f()) {
            List<MVMetroLanguage> list = mVMetroLanguagesResponse.languages;
            C4303q qVar = new C4303q(14);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C13720d.m34276f(list, (C13722f) null, qVar, linkedHashSet);
            this.f6244m = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        }
        if (!C13723g.m34280a(this.f6244m, new C19765f(2))) {
            throw new BadResponseException("Missing default language!");
        }
    }
}
