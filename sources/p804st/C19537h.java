package p804st;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVEmployeePersonalDetailsRequest;

/* renamed from: st.h */
public final class C19537h extends C13778r<C19537h, C19538i, MVEmployeePersonalDetailsRequest> {
    public C19537h(C13752e eVar, String str, String str2) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_first_time_personal_details, C19538i.class);
        RO mVEmployeePersonalDetailsRequest = new MVEmployeePersonalDetailsRequest();
        mVEmployeePersonalDetailsRequest.email = str;
        mVEmployeePersonalDetailsRequest.employeeId = str2;
        this.f33922v = mVEmployeePersonalDetailsRequest;
    }
}
