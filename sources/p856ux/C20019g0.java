package p856ux;

import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import x90.C13242b;

/* renamed from: ux.g0 */
public final class C20019g0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        SharedPreferences sharedPreferences = eVar.f33852a.getSharedPreferences("payment_account_manager", 0);
        Integer num = null;
        String string = sharedPreferences.getString("default_payment_gateway", (String) null);
        if (string != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("default_payment_gateway");
            char c = 65535;
            switch (string.hashCode()) {
                case -1534821982:
                    if (string.equals("google_pay")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1029412550:
                    if (string.equals("payment_method")) {
                        c = 1;
                        break;
                    }
                    break;
                case 427175348:
                    if (string.equals("clearance_provider")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 0;
                    break;
                case 2:
                    num = 2;
                    break;
            }
            if (num != null) {
                edit.putInt("default_payment_gateway_type", num.intValue());
            }
            edit.apply();
        }
    }

    public final String toString() {
        return "Upgrader531To532";
    }
}
