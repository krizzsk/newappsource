package p827ts;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.general.userprofile.avatars.Avatar;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.users.MVAvatar;
import com.tranzmate.moovit.protocol.users.MVAvatarsResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.thrift.TBase;

/* renamed from: ts.c */
public final class C19756c extends C13780t<C19755b, C19756c, MVAvatarsResponse> {

    /* renamed from: m */
    public C19754a f50236m;

    public C19756c() {
        super(MVAvatarsResponse.class);
    }

    /* renamed from: q */
    public static ArrayList m47205q(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MVAvatar mVAvatar = (MVAvatar) it.next();
            arrayList.add(new Avatar(C16028g.m40823a(Integer.valueOf(mVAvatar.image)), new ServerId(mVAvatar.avatarId), mVAvatar.name));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19755b bVar = (C19755b) aVar;
        MVAvatarsResponse mVAvatarsResponse = (MVAvatarsResponse) tBase;
        this.f50236m = new C19754a(m47205q(mVAvatarsResponse.avatars), m47205q(mVAvatarsResponse.specialUsersAvatars), mVAvatarsResponse.enableSpecialUsersAvatars);
    }
}
