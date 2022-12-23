package p609km;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1021l0;
import androidx.lifecycle.C1037q0;
import bf0.C21049c;
import bi0.C21066e;
import ff0.C23349c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentSkipListMap;
import lf0.C24225a;
import mf0.C24362h;
import p406cg.C13821j;
import sf0.C24855b;
import wh0.C25192l;

/* renamed from: km.c */
public class C18097c implements C13821j {

    /* renamed from: b */
    public static final C18097c f46262b = new C18097c();

    /* renamed from: c */
    public static Method f46263c;

    /* renamed from: d */
    public static boolean f46264d;

    /* renamed from: e */
    public static Field f46265e;

    /* renamed from: f */
    public static boolean f46266f;

    /* renamed from: a */
    public static final C1037q0 m44767a(C21049c cVar) {
        return (C1037q0) cVar.getValue();
    }

    /* renamed from: b */
    public static final C1021l0 m44768b(Fragment fragment, C24855b bVar, C24225a aVar, C24225a aVar2, C24225a aVar3) {
        C24362h.m61211f(fragment, "<this>");
        C24362h.m61211f(bVar, "viewModelClass");
        return new C1021l0(bVar, aVar, aVar3, aVar2);
    }

    /* renamed from: c */
    public static final C25192l m44769c(C23349c cVar) {
        if (!(cVar instanceof C21066e)) {
            return new C25192l(1, cVar);
        }
        C25192l l = ((C21066e) cVar).mo53197l();
        if (l != null) {
            if (!l.mo61826A()) {
                l = null;
            }
            if (l != null) {
                return l;
            }
        }
        return new C25192l(2, cVar);
    }

    /* renamed from: d */
    public void mo23705d(View view, int i, int i2, int i3, int i4) {
        if (!f46264d) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f46263c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f46264d = true;
        }
        Method method = f46263c;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: e */
    public void mo23706e(int i, View view) {
        if (!f46266f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f46265e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f46266f = true;
        }
        Field field = f46265e;
        if (field != null) {
            try {
                f46265e.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new ConcurrentSkipListMap();
    }
}
