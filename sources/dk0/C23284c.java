package dk0;

import ck0.C21230e;
import com.google.gson.Gson;
import hi0.C23536e0;
import hi0.C23562t;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p359ag.C13458o;
import si0.C24902i;

/* renamed from: dk0.c */
public final class C23284c<T> implements C21230e<C23536e0, T> {

    /* renamed from: a */
    public final Gson f59054a;

    /* renamed from: b */
    public final C13458o<T> f59055b;

    public C23284c(Gson gson, C13458o<T> oVar) {
        this.f59054a = gson;
        this.f59055b = oVar;
    }

    public final Object convert(Object obj) throws IOException {
        Charset charset;
        C23536e0 e0Var = (C23536e0) obj;
        Gson gson = this.f59054a;
        C23536e0.C23537a aVar = e0Var.f59456b;
        if (aVar == null) {
            C24902i t = e0Var.mo53600t();
            C23562t q = e0Var.mo53599q();
            if (q != null) {
                charset = q.mo58710a(StandardCharsets.UTF_8);
            } else {
                charset = StandardCharsets.UTF_8;
            }
            aVar = new C23536e0.C23537a(t, charset);
            e0Var.f59456b = aVar;
        }
        try {
            return this.f59055b.mo40320a(gson.newJsonReader(aVar));
        } finally {
            e0Var.close();
        }
    }
}
