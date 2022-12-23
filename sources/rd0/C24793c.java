package rd0;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hi0.C23536e0;
import java.io.IOException;
import p359ag.C13452i;
import qd0.C24728d;

/* renamed from: rd0.c */
public final class C24793c implements C24791a<C23536e0, C13452i> {

    /* renamed from: a */
    public static final Gson f62715a = new GsonBuilder().create();

    /* renamed from: a */
    public final Object mo61242a(C24728d.C24729a aVar) throws IOException {
        try {
            return (C13452i) f62715a.fromJson(aVar.mo58649v(), C13452i.class);
        } finally {
            aVar.close();
        }
    }
}
