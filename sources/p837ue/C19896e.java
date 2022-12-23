package p837ue;

import com.amazonaws.util.DateUtils;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import p789se.C19449c;
import p789se.C19451e;
import p789se.C19452f;
import p813te.C19669b;
import p988j$.util.DesugarTimeZone;

/* renamed from: ue.e */
public final class C19896e implements C19669b<C19896e> {

    /* renamed from: e */
    public static final C19892a f50519e = new C19892a();

    /* renamed from: f */
    public static final C19893b f50520f = new C19893b();

    /* renamed from: g */
    public static final C19894c f50521g = new C19894c();

    /* renamed from: h */
    public static final C19897a f50522h = new C19897a();

    /* renamed from: a */
    public final HashMap f50523a;

    /* renamed from: b */
    public final HashMap f50524b;

    /* renamed from: c */
    public C19892a f50525c = f50519e;

    /* renamed from: d */
    public boolean f50526d = false;

    /* renamed from: ue.e$a */
    public static final class C19897a implements C19451e<Date> {

        /* renamed from: a */
        public static final SimpleDateFormat f50527a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            f50527a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        public final void encode(Object obj, Object obj2) throws IOException {
            ((C19452f) obj2).add(f50527a.format((Date) obj));
        }
    }

    public C19896e() {
        HashMap hashMap = new HashMap();
        this.f50523a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f50524b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f50520f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, f50521g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f50522h);
        hashMap.remove(cls3);
    }

    public final C19669b registerEncoder(Class cls, C19449c cVar) {
        this.f50523a.put(cls, cVar);
        this.f50524b.remove(cls);
        return this;
    }
}
