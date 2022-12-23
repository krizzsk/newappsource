package p479ey;

import c70.C13752e;
import c70.C13778r;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVExternalSystemLoginDetails;
import com.tranzmate.moovit.protocol.users.MVLoginDetails;
import com.tranzmate.moovit.protocol.users.MVUsersLoginRequest;

/* renamed from: ey.m */
public final class C16902m extends C13778r<C16902m, C16904n, MVUsersLoginRequest> {

    /* renamed from: w */
    public ConnectProvider f43917w;

    /* renamed from: ey.m$a */
    public static /* synthetic */ class C16903a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.app.useraccount.providers.ConnectProvider[] r0 = com.moovit.app.useraccount.providers.ConnectProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43918a = r0
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.FACEBOOK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43918a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.GOOGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43918a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.MOOVIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p479ey.C16902m.C16903a.<clinit>():void");
        }
    }

    public C16902m(C13752e eVar, String str, String str2, ConnectProvider connectProvider) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_login_request, C16904n.class);
        this.f43917w = connectProvider;
        RO mVUsersLoginRequest = new MVUsersLoginRequest();
        MVExternalSystemLoginDetails mVExternalSystemLoginDetails = new MVExternalSystemLoginDetails();
        mVExternalSystemLoginDetails.f30406id = str;
        mVExternalSystemLoginDetails.token = str2;
        MVLoginDetails mVLoginDetails = new MVLoginDetails();
        int i = C16903a.f43918a[connectProvider.ordinal()];
        if (i == 1) {
            mVLoginDetails.setField_ = MVLoginDetails._Fields.FB_DETAILS;
            mVLoginDetails.value_ = mVExternalSystemLoginDetails;
        } else if (i == 2) {
            mVLoginDetails.setField_ = MVLoginDetails._Fields.GOOGLE_DETAILS;
            mVLoginDetails.value_ = mVExternalSystemLoginDetails;
        } else if (i == 3) {
            mVLoginDetails.setField_ = MVLoginDetails._Fields.MOOVIT_DETAILS;
            mVLoginDetails.value_ = mVExternalSystemLoginDetails;
        } else {
            StringBuilder k = C13555b.m33972k("No mapping found for provider: ");
            k.append(connectProvider.name());
            k.append(". have you added a new provider and forgot to map it?");
            throw new IllegalArgumentException(k.toString());
        }
        mVUsersLoginRequest.details = mVLoginDetails;
        this.f33922v = mVUsersLoginRequest;
    }
}
