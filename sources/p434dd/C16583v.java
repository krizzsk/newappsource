package p434dd;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import p120i5.C5282c;

/* renamed from: dd.v */
public final class C16583v extends C5282c {
    public C16583v(Object obj, Field field, Class cls) {
        super(obj, field, (Class) Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: e */
    public final void mo49358e(List list) {
        int i;
        Object[] objArr = (Object[]) mo21086c();
        if (objArr == null) {
            i = 0;
        } else {
            i = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f17450b).getType().getComponentType(), list.size() + i);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : list) {
            objArr2[i] = obj;
            i++;
        }
        mo21087d(objArr2);
    }

    /* renamed from: f */
    public final void mo49359f(Collection collection) {
        int i;
        Object[] objArr = (Object[]) mo21086c();
        int i2 = 0;
        if (objArr == null) {
            i = 0;
        } else {
            i = objArr.length;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f17450b).getType().getComponentType(), collection.size() + i);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i2] = obj;
            i2++;
        }
        mo21087d(objArr2);
    }
}
