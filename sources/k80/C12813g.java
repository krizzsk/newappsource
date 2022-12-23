package k80;

import c70.C13746a;
import c70.C13752e;
import com.moovit.commons.request.ServerException;
import com.moovit.util.time.C7925b;
import f00.C16919g;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p824tp.C19728f;
import p824tp.C19746x;

/* renamed from: k80.g */
public final class C12813g extends C13746a<C12813g, C12814h> {

    /* renamed from: v */
    public static final C16919g.C16925f f31677v = new C16919g.C16925f("seen_time", 0);

    public C12813g(C13752e eVar, C19728f fVar) {
        super(eVar, C19746x.server_path_cdn_server_url, C19746x.api_path_service_alert_digests_count, false, C12814h.class);
        mo52629r("metroAreaId", fVar.f50165a.f16126a.mo19751c());
        mo52628q(fVar.f50165a.f16127b);
    }

    /* renamed from: E */
    public final List<C12814h> mo21059E() throws IOException, ServerException {
        if (!C7925b.m18027o(System.currentTimeMillis(), f31677v.mo19759a(this.f51759b.getSharedPreferences("service_alert_digests_counter", 0)).longValue())) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList((C12814h) mo40056C());
    }
}
