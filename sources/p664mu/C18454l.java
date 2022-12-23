package p664mu;

import android.content.Context;
import c70.C13746a;
import c70.C13752e;
import c70.C13780t;
import com.moovit.app.MoovitAppApplication;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ptb.activations.MVMotUserAvailabilityResponse;
import java.io.IOException;
import java.util.HashSet;
import org.apache.thrift.TBase;
import p646lz.C18299a;
import p824tp.C19722a0;
import p874vr.C20199a;
import p929xy.C20664g;
import q00.C19047a;

/* renamed from: mu.l */
public final class C18454l extends C20664g<Boolean> {

    /* renamed from: mu.l$a */
    public static class C18455a extends C13746a<C18455a, C18456b> {
        public C18455a(C13752e eVar) {
            super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_mot_user_config, false, C18456b.class);
        }
    }

    /* renamed from: mu.l$b */
    public static class C18456b extends C13780t<C18455a, C18456b, MVMotUserAvailabilityResponse> {

        /* renamed from: m */
        public boolean f47043m = false;

        public C18456b() {
            super(MVMotUserAvailabilityResponse.class);
        }

        /* renamed from: m */
        public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
            C18455a aVar2 = (C18455a) aVar;
            this.f47043m = ((MVMotUserAvailabilityResponse) tBase).isEnabled;
        }
    }

    /* renamed from: k */
    public static boolean m45315k() {
        return Boolean.TRUE.equals(MoovitAppApplication.m37038x().f37321e.mo50690c("MOT_SUPPORT_VALIDATOR"));
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        return b;
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        try {
            boolean z = true;
            if (!((Boolean) ((C19047a) aVar.mo50690c("CONFIGURATION")).mo51505b(C20199a.f51242D0)).booleanValue()) {
                C19722a0 a0Var = eVar.f33853b;
                if (a0Var != null) {
                    if (a0Var.f50160a.f32927c.f15142b == 1) {
                        z = ((C18456b) new C18455a(eVar).mo52626J()).f47043m;
                    }
                }
                z = false;
            }
            if (z) {
                return Boolean.TRUE;
            }
            throw new AppDataPartLoadFailedException("MOT not supported in the current metro configuration.", (String) null, (Throwable) null);
        } catch (Exception e) {
            throw new AppDataPartLoadFailedException("MOT not supported in the current metro configuration.", (String) null, e);
        }
    }
}
