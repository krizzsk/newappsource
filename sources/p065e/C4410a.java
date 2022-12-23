package p065e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;

/* renamed from: e.a */
public abstract class C4410a<I, O> {

    /* renamed from: e.a$a */
    public static final class C4411a<T> {

        /* renamed from: a */
        public final T f15474a;

        public C4411a(T t) {
            this.f15474a = t;
        }
    }

    /* renamed from: a */
    public abstract Intent mo3996a(ComponentActivity componentActivity, Object obj);

    /* renamed from: b */
    public C4411a mo19921b(ComponentActivity componentActivity, Object obj) {
        C24362h.m61211f(componentActivity, AppActionRequest.KEY_CONTEXT);
        return null;
    }

    /* renamed from: c */
    public abstract O mo3997c(int i, Intent intent);
}
