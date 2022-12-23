package t30;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityReportDamageRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l30.C5570c0;
import p638lr.C18267n;

/* renamed from: t30.s */
public final class C6579s extends C13778r<C6579s, C6580t, MVMicroMobilityReportDamageRequest> implements Callable<C6580t> {

    /* renamed from: A */
    public static final /* synthetic */ int f20395A = 0;

    /* renamed from: w */
    public final String f20396w;

    /* renamed from: x */
    public final String f20397x;

    /* renamed from: y */
    public final String f20398y;

    /* renamed from: z */
    public final List<String> f20399z;

    public C6579s(C13752e eVar, String str, String str2, String str3, List<String> list) {
        super(eVar, C5570c0.server_path_app_server_secured_url, C5570c0.api_path_micro_mobility_report_damage, C6580t.class);
        C21100e.m49373x(str, "serviceId");
        this.f20396w = str;
        C21100e.m49373x(str2, "itemId");
        this.f20397x = str2;
        C21100e.m49373x(str3, TwitterUser.DESCRIPTION_KEY);
        this.f20398y = str3;
        C21100e.m49373x(list, "imagesPaths");
        this.f20399z = list;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        ArrayList<O> c = C13720d.m34273c(this.f20399z, (C13722f) null, new C18267n(16));
        String str = this.f20396w;
        String str2 = this.f20397x;
        String str3 = this.f20398y;
        RO mVMicroMobilityReportDamageRequest = new MVMicroMobilityReportDamageRequest();
        mVMicroMobilityReportDamageRequest.serviceId = str;
        mVMicroMobilityReportDamageRequest.itemId = str2;
        mVMicroMobilityReportDamageRequest.damageDescription = str3;
        mVMicroMobilityReportDamageRequest.images = c;
        this.f33922v = mVMicroMobilityReportDamageRequest;
        super.mo5818H();
    }

    public final Object call() throws Exception {
        return (C6580t) mo52626J();
    }
}
