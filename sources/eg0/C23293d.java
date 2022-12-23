package eg0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import mf0.C24361g;
import mf0.C24362h;
import p172m9.C5720b;
import qg0.C24736a;
import qg0.C24741d;
import qg0.C24757k;
import ug0.C25065b;
import ug0.C25069e;
import ug0.C25071g;
import uh0.C25081h;

/* renamed from: eg0.d */
public final class C23293d implements C24757k {

    /* renamed from: a */
    public final Class<?> f59074a;

    /* renamed from: b */
    public final KotlinClassHeader f59075b;

    /* renamed from: eg0.d$a */
    public static final class C23294a {
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            if (r0.f60777d == null) goto L_0x0069;
         */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static eg0.C23293d m57365a(java.lang.Class r12) {
            /*
                java.lang.String r0 = "klass"
                mf0.C24362h.m61211f(r12, r0)
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.a r0 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.a
                r0.<init>()
                p172m9.C5720b.m14074y(r12, r0)
                eg0.d r1 = new eg0.d
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.f60780g
                r3 = 0
                if (r2 == 0) goto L_0x0069
                int[] r2 = r0.f60774a
                if (r2 != 0) goto L_0x0019
                goto L_0x0069
            L_0x0019:
                tg0.e r6 = new tg0.e
                int[] r2 = r0.f60774a
                int r4 = r0.f60776c
                r4 = r4 & 8
                r5 = 1
                r7 = 0
                if (r4 == 0) goto L_0x0027
                r4 = 1
                goto L_0x0028
            L_0x0027:
                r4 = 0
            L_0x0028:
                r6.<init>(r2, r4)
                boolean r2 = r6.mo61538c()
                if (r2 != 0) goto L_0x0038
                java.lang.String[] r2 = r0.f60777d
                r0.f60779f = r2
                r0.f60777d = r3
                goto L_0x004f
            L_0x0038:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = r0.f60780g
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS
                if (r2 == r4) goto L_0x0048
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.FILE_FACADE
                if (r2 == r4) goto L_0x0048
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.MULTIFILE_CLASS_PART
                if (r2 != r4) goto L_0x0047
                goto L_0x0048
            L_0x0047:
                r5 = 0
            L_0x0048:
                if (r5 == 0) goto L_0x004f
                java.lang.String[] r2 = r0.f60777d
                if (r2 != 0) goto L_0x004f
                goto L_0x0069
            L_0x004f:
                java.lang.String[] r2 = r0.f60781h
                if (r2 == 0) goto L_0x0056
                tg0.C24982a.m62683b(r2)
            L_0x0056:
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader
                kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r5 = r0.f60780g
                java.lang.String[] r7 = r0.f60777d
                java.lang.String[] r8 = r0.f60779f
                java.lang.String[] r9 = r0.f60778e
                java.lang.String r10 = r0.f60775b
                int r11 = r0.f60776c
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x006a
            L_0x0069:
                r2 = r3
            L_0x006a:
                if (r2 != 0) goto L_0x006d
                return r3
            L_0x006d:
                r1.<init>(r12, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: eg0.C23293d.C23294a.m57365a(java.lang.Class):eg0.d");
        }
    }

    public C23293d() {
        throw null;
    }

    public C23293d(Class cls, KotlinClassHeader kotlinClassHeader) {
        this.f59074a = cls;
        this.f59075b = kotlinClassHeader;
    }

    /* renamed from: a */
    public final void mo58418a(C24736a aVar) {
        String str;
        String str2;
        boolean z;
        C24736a aVar2 = aVar;
        Class<?> cls = this.f59074a;
        C24362h.m61211f(cls, "klass");
        Method[] declaredMethods = cls.getDeclaredMethods();
        C24362h.m61210e(declaredMethods, "klass.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            str = "annotations";
            str2 = "parameterType";
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            i++;
            C25069e i2 = C25069e.m62820i(method.getName());
            StringBuilder k = C13555b.m33972k("(");
            Class[] parameterTypes = method.getParameterTypes();
            C24362h.m61210e(parameterTypes, "method.parameterTypes");
            int length2 = parameterTypes.length;
            int i3 = 0;
            while (i3 < length2) {
                Class cls2 = parameterTypes[i3];
                i3++;
                C24362h.m61210e(cls2, str2);
                k.append(ReflectClassUtilKt.m58950b(cls2));
            }
            k.append(")");
            Class<?> returnType = method.getReturnType();
            C24362h.m61210e(returnType, "method.returnType");
            k.append(ReflectClassUtilKt.m58950b(returnType));
            String sb = k.toString();
            C24362h.m61210e(sb, "sb.toString()");
            C24736a.C24737a b = aVar2.mo61224b(i2, sb);
            Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
            C24362h.m61210e(declaredAnnotations, "method.declaredAnnotations");
            int length3 = declaredAnnotations.length;
            int i4 = 0;
            while (i4 < length3) {
                Annotation annotation = declaredAnnotations[i4];
                i4++;
                C24362h.m61210e(annotation, "annotation");
                C5720b.m14036D(b, annotation);
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            C24362h.m61210e(parameterAnnotations, "method.parameterAnnotations");
            Annotation[][] annotationArr = parameterAnnotations;
            int length4 = annotationArr.length;
            int i5 = 0;
            while (i5 < length4) {
                Annotation[] annotationArr2 = annotationArr[i5];
                int i6 = i5 + 1;
                C24362h.m61210e(annotationArr2, str);
                int length5 = annotationArr2.length;
                int i7 = 0;
                while (i7 < length5) {
                    Annotation annotation2 = annotationArr2[i7];
                    i7++;
                    Class N = C24361g.m61144N(C24361g.m61140J(annotation2));
                    Method[] methodArr = declaredMethods;
                    int i8 = length;
                    C24741d c = b.mo61225c(i5, ReflectClassUtilKt.m58949a(N), new C23291b(annotation2));
                    if (c != null) {
                        C5720b.m14037E(c, annotation2, N);
                    }
                    declaredMethods = methodArr;
                    length = i8;
                }
                i5 = i6;
            }
            Method[] methodArr2 = declaredMethods;
            int i9 = length;
            b.mo59591a();
        }
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        C24362h.m61210e(declaredConstructors, "klass.declaredConstructors");
        int length6 = declaredConstructors.length;
        int i11 = 0;
        while (i11 < length6) {
            Constructor constructor = declaredConstructors[i11];
            int i12 = i11 + 1;
            C25069e eVar = C25071g.f63270e;
            C24362h.m61210e(constructor, "constructor");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(");
            Class[] parameterTypes2 = constructor.getParameterTypes();
            C24362h.m61210e(parameterTypes2, "constructor.parameterTypes");
            int length7 = parameterTypes2.length;
            int i13 = 0;
            while (i13 < length7) {
                Constructor[] constructorArr = declaredConstructors;
                Class cls3 = parameterTypes2[i13];
                i13++;
                C24362h.m61210e(cls3, str2);
                sb2.append(ReflectClassUtilKt.m58950b(cls3));
                declaredConstructors = constructorArr;
            }
            Constructor[] constructorArr2 = declaredConstructors;
            sb2.append(")V");
            String sb3 = sb2.toString();
            C24362h.m61210e(sb3, "sb.toString()");
            C24736a.C24737a b2 = aVar2.mo61224b(eVar, sb3);
            Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
            C24362h.m61210e(declaredAnnotations2, "constructor.declaredAnnotations");
            int length8 = declaredAnnotations2.length;
            int i14 = 0;
            while (i14 < length8) {
                Annotation annotation3 = declaredAnnotations2[i14];
                i14++;
                C24362h.m61210e(annotation3, "annotation");
                C5720b.m14036D(b2, annotation3);
            }
            Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
            C24362h.m61210e(parameterAnnotations2, "parameterAnnotations");
            if (parameterAnnotations2.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int length9 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                int length10 = parameterAnnotations2.length;
                int i15 = 0;
                while (i15 < length10) {
                    Annotation[] annotationArr3 = parameterAnnotations2[i15];
                    int i16 = i15 + 1;
                    C24362h.m61210e(annotationArr3, str);
                    int i17 = length6;
                    int length11 = annotationArr3.length;
                    int i18 = i12;
                    int i19 = 0;
                    while (i19 < length11) {
                        int i21 = length11;
                        Annotation annotation4 = annotationArr3[i19];
                        int i22 = i19 + 1;
                        Class N2 = C24361g.m61144N(C24361g.m61140J(annotation4));
                        String str3 = str;
                        int i23 = length9;
                        String str4 = str2;
                        C24741d c2 = b2.mo61225c(i15 + length9, ReflectClassUtilKt.m58949a(N2), new C23291b(annotation4));
                        if (c2 != null) {
                            C5720b.m14037E(c2, annotation4, N2);
                        }
                        length11 = i21;
                        str = str3;
                        i19 = i22;
                        length9 = i23;
                        str2 = str4;
                    }
                    i15 = i16;
                    length6 = i17;
                    i12 = i18;
                }
            }
            b2.mo59591a();
            declaredConstructors = constructorArr2;
            length6 = length6;
            i11 = i12;
            str = str;
            str2 = str2;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        C24362h.m61210e(declaredFields, "klass.declaredFields");
        int length12 = declaredFields.length;
        int i24 = 0;
        while (i24 < length12) {
            Field field = declaredFields[i24];
            i24++;
            C25069e i25 = C25069e.m62820i(field.getName());
            Class<?> type = field.getType();
            C24362h.m61210e(type, "field.type");
            C24736a.C24738b a = aVar2.mo61223a(i25, ReflectClassUtilKt.m58950b(type));
            Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
            C24362h.m61210e(declaredAnnotations3, "field.declaredAnnotations");
            int length13 = declaredAnnotations3.length;
            int i26 = 0;
            while (i26 < length13) {
                Annotation annotation5 = declaredAnnotations3[i26];
                i26++;
                C24362h.m61210e(annotation5, "annotation");
                C5720b.m14036D(a, annotation5);
            }
            a.mo59591a();
        }
    }

    /* renamed from: b */
    public final void mo58419b(C24757k.C24760c cVar) {
        C5720b.m14074y(this.f59074a, cVar);
    }

    /* renamed from: c */
    public final KotlinClassHeader mo58420c() {
        return this.f59075b;
    }

    /* renamed from: d */
    public final C25065b mo58421d() {
        return ReflectClassUtilKt.m58949a(this.f59074a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23293d) && C24362h.m61206a(this.f59074a, ((C23293d) obj).f59074a);
    }

    public final String getLocation() {
        return C24362h.m61216k(".class", C25081h.m62834E(this.f59074a.getName(), '.', '/'));
    }

    public final int hashCode() {
        return this.f59074a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C23293d.class, sb, ": ");
        sb.append(this.f59074a);
        return sb.toString();
    }
}
