package p737pv;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.Event;
import com.tranzmate.moovit.protocol.ridesharing.MVSuggestionResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p066e0.C4454r0;

/* renamed from: pv.r */
public final class C19028r extends C13780t<C19027q, C19028r, MVSuggestionResponse> {

    /* renamed from: m */
    public List<Event> f48394m = null;

    public C19028r() {
        super(MVSuggestionResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19027q qVar = (C19027q) aVar;
        MVSuggestionResponse mVSuggestionResponse = (MVSuggestionResponse) tBase;
        if (mVSuggestionResponse.mo31412f() && !C13717b.m34258e(mVSuggestionResponse.superEvents)) {
            this.f48394m = Collections.unmodifiableList(C13720d.m34273c(mVSuggestionResponse.superEvents, (C13722f) null, new C4454r0(5)));
        }
    }
}
