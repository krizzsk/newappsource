package com.moovit.app.mot.protocol;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVEmptyRequest;
import p736pu.C18998g;
import p824tp.C19728f;

public final class GetMotUserActivationsRequest extends C13778r<GetMotUserActivationsRequest, C18998g, MVEmptyRequest> {

    /* renamed from: w */
    public final C19728f f39025w;

    public enum Source {
        CURRENT(R.string.api_path_get_current_activations),
        HISTORICAL(R.string.api_path_get_historical_activations);
        
        /* access modifiers changed from: private */
        public final int servicePath;

        private Source(int i) {
            this.servicePath = i;
        }
    }

    public GetMotUserActivationsRequest(C13752e eVar, C19728f fVar, Source source) {
        super(eVar, R.string.server_path_app_server_secured_url, source.servicePath, C18998g.class);
        this.f39025w = fVar;
        C21100e.m49373x(source, "source");
        this.f33922v = new MVEmptyRequest();
    }
}
