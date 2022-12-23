package g20;

import android.content.Context;

/* renamed from: g20.d */
public abstract class C17142d<O, T> {

    /* renamed from: a */
    public static final C17143a f44377a = new C17143a();

    /* renamed from: g20.d$a */
    public class C17143a extends C17142d<Object, Object> {
        /* renamed from: a */
        public final Object mo49725a(Context context, Object obj) {
            return null;
        }

        public final String toString() {
            return "NULL";
        }
    }

    /* renamed from: g20.d$b */
    public class C17144b extends C17142d<Object, String> {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo49725a(Context context, Object obj) {
            return "";
        }

        public final String toString() {
            return "EMPTY_STRING";
        }
    }

    static {
        new C17144b();
    }

    /* renamed from: a */
    public abstract T mo49725a(Context context, O o);

    /* renamed from: b */
    public T mo49727b(Context context, O o) {
        return mo49725a(context, o);
    }
}
