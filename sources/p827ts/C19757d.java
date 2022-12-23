package p827ts;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVUserAvatarRequest;

/* renamed from: ts.d */
public final class C19757d extends C13778r<C19757d, C19758e, MVUserAvatarRequest> {
    public C19757d(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.api_path_get_user_avatar, C19758e.class);
        RO mVUserAvatarRequest = new MVUserAvatarRequest();
        mVUserAvatarRequest.avatarId = serverId.f15142b;
        mVUserAvatarRequest.mo35481g();
        this.f33922v = mVUserAvatarRequest;
    }
}
