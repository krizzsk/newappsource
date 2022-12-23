package p900wt;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdRequest;
import java.util.ArrayList;
import java.util.List;
import p054d0.C4303q;

/* renamed from: wt.d */
public final class C20414d extends C13778r<C20414d, C20416f, MVGetMetroAreasByIdRequest> {
    public C20414d(C13752e eVar, List<ServerId> list) {
        super(eVar, R.string.api_path_get_metro_areas_by_ids, C20416f.class);
        ArrayList<O> c = C13720d.m34273c(list, (C13722f) null, new C4303q(2));
        RO mVGetMetroAreasByIdRequest = new MVGetMetroAreasByIdRequest();
        mVGetMetroAreasByIdRequest.metroAreaIds = c;
        this.f33922v = mVGetMetroAreasByIdRequest;
    }
}
