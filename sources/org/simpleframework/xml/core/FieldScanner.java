package org.simpleframework.xml.core;

import gj0.C23422a;
import gj0.C23424c;
import gj0.C23425d;
import gj0.C23426e;
import gj0.C23427f;
import gj0.C23428g;
import gj0.C23429h;
import gj0.C23430i;
import gj0.C23435n;
import gj0.C23436o;
import gj0.C23437p;
import ij0.C23611a;
import ij0.C23659p;
import ij0.C23660p0;
import ij0.C23675u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.DefaultType;
import p583jk.C17884p;

class FieldScanner extends ContactList {
    private final ContactMap done = new ContactMap();
    private final C23611a factory;
    private final C24664u support;

    /* renamed from: org.simpleframework.xml.core.FieldScanner$a */
    public static class C24640a {

        /* renamed from: a */
        public final Class f62344a;

        /* renamed from: b */
        public final String f62345b;

        public C24640a(Field field) {
            this.f62344a = field.getDeclaringClass();
            this.f62345b = field.getName();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C24640a)) {
                return false;
            }
            C24640a aVar = (C24640a) obj;
            if (aVar.f62344a != this.f62344a) {
                return false;
            }
            return aVar.f62345b.equals(this.f62345b);
        }

        public final int hashCode() {
            return this.f62345b.hashCode();
        }
    }

    public FieldScanner(C23675u uVar, C24664u uVar2) throws Exception {
        ParameterizedType parameterizedType;
        Class[] clsArr;
        ContactList b;
        this.factory = new C23611a(uVar, uVar2);
        this.support = uVar2;
        DefaultType l = uVar.mo58859l();
        DefaultType o = uVar.mo58862o();
        Class p = uVar.mo58863p();
        if (!(p == null || (b = uVar2.mo61101b(p, l)) == null)) {
            addAll(b);
        }
        List<C23660p0> n = uVar.mo58861n();
        if (o == DefaultType.FIELD) {
            for (C23660p0 next : n) {
                Annotation[] annotationArr = next.f59819a;
                Field field = next.f59820b;
                Class<?> type = field.getType();
                if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                    Type genericType = field.getGenericType();
                    if (genericType instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) genericType;
                    } else {
                        parameterizedType = null;
                    }
                    if (parameterizedType != null) {
                        clsArr = C17884p.m44386z(parameterizedType);
                    } else {
                        clsArr = new Class[0];
                    }
                    Annotation a = this.factory.mo58738a(type, clsArr);
                    if (a != null) {
                        mo60995a(field, a, annotationArr);
                    }
                }
            }
        }
        for (C23660p0 next2 : uVar.mo58861n()) {
            Annotation[] annotationArr2 = next2.f59819a;
            Field field2 = next2.f59820b;
            for (Annotation annotation : annotationArr2) {
                if (annotation instanceof C23422a) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23430i) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23427f) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23429h) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23426e) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23425d) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23428g) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23424c) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23437p) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23435n) {
                    mo60995a(field2, annotation, annotationArr2);
                }
                if (annotation instanceof C23436o) {
                    this.done.remove(new C24640a(field2));
                }
            }
        }
        Iterator<C23659p> it = this.done.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [ij0.p] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60995a(java.lang.reflect.Field r2, java.lang.annotation.Annotation r3, java.lang.annotation.Annotation[] r4) {
        /*
            r1 = this;
            ij0.o0 r0 = new ij0.o0
            r0.<init>(r2, r3, r4)
            org.simpleframework.xml.core.FieldScanner$a r3 = new org.simpleframework.xml.core.FieldScanner$a
            r3.<init>(r2)
            boolean r4 = r2.isAccessible()
            if (r4 != 0) goto L_0x0014
            r4 = 1
            r2.setAccessible(r4)
        L_0x0014:
            org.simpleframework.xml.core.ContactMap r2 = r1.done
            java.lang.Object r2 = r2.remove(r3)
            ij0.p r2 = (ij0.C23659p) r2
            if (r2 == 0) goto L_0x0027
            java.lang.annotation.Annotation r4 = r0.mo58838a()
            boolean r4 = r4 instanceof gj0.C23435n
            if (r4 == 0) goto L_0x0027
            r0 = r2
        L_0x0027:
            org.simpleframework.xml.core.ContactMap r2 = r1.done
            r2.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.core.FieldScanner.mo60995a(java.lang.reflect.Field, java.lang.annotation.Annotation, java.lang.annotation.Annotation[]):void");
    }
}
