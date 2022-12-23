package dk0;

import ck0.C21230e;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p509gg.C17189a;

/* renamed from: dk0.a */
public final class C23282a extends C21230e.C21231a {

    /* renamed from: a */
    public final Gson f59049a;

    public C23282a(Gson gson) {
        this.f59049a = gson;
    }

    /* renamed from: a */
    public final C21230e mo53581a(Type type) {
        return new C23283b(this.f59049a, this.f59049a.getAdapter(new C17189a(type)));
    }

    /* renamed from: b */
    public final C21230e mo53582b(Type type, Annotation[] annotationArr) {
        return new C23284c(this.f59049a, this.f59049a.getAdapter(new C17189a(type)));
    }
}
