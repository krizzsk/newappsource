package p120i5;

import com.airbnb.lottie.C1912x;
import com.google.android.play.core.internal.zzbx;
import java.lang.reflect.Field;

/* renamed from: i5.c */
public class C5282c {

    /* renamed from: a */
    public Object f17449a;

    /* renamed from: b */
    public final Object f17450b;

    /* renamed from: c */
    public Object f17451c;

    public /* synthetic */ C5282c(Object obj, Object obj2, Object obj3) {
        this.f17450b = obj;
        this.f17451c = obj2;
        this.f17449a = obj3;
    }

    public /* synthetic */ C5282c(Object obj, Field field, Class cls) {
        this.f17449a = obj;
        this.f17450b = field;
        this.f17451c = cls;
    }

    /* renamed from: a */
    public Object mo21084a(C5281b bVar) {
        return this.f17449a;
    }

    /* renamed from: b */
    public final Object mo21085b(Object obj, Object obj2) {
        C5281b bVar = (C5281b) this.f17450b;
        bVar.f17447a = obj;
        bVar.f17448b = obj2;
        return mo21084a(bVar);
    }

    /* renamed from: c */
    public final Object mo21086c() {
        try {
            return ((Class) this.f17451c).cast(((Field) this.f17450b).get(this.f17449a));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to get value of field %s of type %s on object of type %s", new Object[]{((Field) this.f17450b).getName(), this.f17449a.getClass().getName(), ((Class) this.f17451c).getName()}), e);
        }
    }

    /* renamed from: d */
    public final void mo21087d(Object obj) {
        try {
            ((Field) this.f17450b).set(this.f17449a, obj);
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to set value of field %s of type %s on object of type %s", new Object[]{((Field) this.f17450b).getName(), this.f17449a.getClass().getName(), ((Class) this.f17451c).getName()}), e);
        }
    }

    public /* synthetic */ C5282c() {
        this.f17450b = new C5281b();
        this.f17449a = null;
    }

    public /* synthetic */ C5282c(C1912x xVar) {
        this.f17450b = new C5281b();
        this.f17449a = xVar;
    }
}
