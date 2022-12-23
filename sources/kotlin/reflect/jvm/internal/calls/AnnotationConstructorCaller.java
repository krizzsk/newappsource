package kotlin.reflect.jvm.internal.calls;

import cf0.C21136j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;
import sf0.C24855b;
import uf0.C25032b;

public final class AnnotationConstructorCaller implements C25032b {

    /* renamed from: a */
    public final Class<?> f60290a;

    /* renamed from: b */
    public final List<String> f60291b;

    /* renamed from: c */
    public final CallMode f60292c;

    /* renamed from: d */
    public final List<Method> f60293d;

    /* renamed from: e */
    public final ArrayList f60294e;

    /* renamed from: f */
    public final ArrayList f60295f;

    /* renamed from: g */
    public final ArrayList f60296g;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(Class cls, ArrayList arrayList, CallMode callMode, Origin origin, List list) {
        C24362h.m61211f(cls, "jClass");
        C24362h.m61211f(callMode, "callMode");
        C24362h.m61211f(origin, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        C24362h.m61211f(list, "methods");
        this.f60290a = cls;
        this.f60291b = arrayList;
        this.f60292c = callMode;
        this.f60293d = list;
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Method) it.next()).getGenericReturnType());
        }
        this.f60294e = arrayList2;
        List<Method> list2 = this.f60293d;
        ArrayList arrayList3 = new ArrayList(C21136j.m49436X(list2, 10));
        for (Method returnType : list2) {
            Class<?> returnType2 = returnType.getReturnType();
            C24362h.m61210e(returnType2, "it");
            List<C24855b<? extends Object>> list3 = ReflectClassUtilKt.f60530a;
            Class<?> cls2 = ReflectClassUtilKt.f60532c.get(returnType2);
            if (cls2 != null) {
                returnType2 = cls2;
            }
            arrayList3.add(returnType2);
        }
        this.f60295f = arrayList3;
        List<Method> list4 = this.f60293d;
        ArrayList arrayList4 = new ArrayList(C21136j.m49436X(list4, 10));
        for (Method defaultValue : list4) {
            arrayList4.add(defaultValue.getDefaultValue());
        }
        this.f60296g = arrayList4;
        if (this.f60292c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA) {
            List<String> list5 = this.f60291b;
            C24362h.m61211f(list5, "<this>");
            ArrayList arrayList5 = new ArrayList(C21136j.m49436X(list5, 10));
            Iterator<T> it2 = list5.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (!z && C24362h.m61206a(next, "value")) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    arrayList5.add(next);
                }
            }
            if (!arrayList5.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (r7.isInstance(r5) != false) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo59358a(java.lang.Object[] r14) {
        /*
            r13 = this;
            uf0.C25032b.C25033a.m62749a(r13, r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r14.length
            r0.<init>(r1)
            int r1 = r14.length
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x0140
            r5 = r14[r3]
            int r3 = r3 + 1
            int r6 = r4 + 1
            if (r5 != 0) goto L_0x0025
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r7 = r13.f60292c
            kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode r8 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME
            if (r7 != r8) goto L_0x0025
            java.util.ArrayList r5 = r13.f60296g
            java.lang.Object r5 = r5.get(r4)
            goto L_0x008a
        L_0x0025:
            java.util.ArrayList r7 = r13.f60295f
            java.lang.Object r7 = r7.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r8 = r5 instanceof java.lang.Class
            r9 = 0
            if (r8 == 0) goto L_0x0033
            goto L_0x0089
        L_0x0033:
            boolean r8 = r5 instanceof sf0.C24855b
            if (r8 == 0) goto L_0x003e
            sf0.b r5 = (sf0.C24855b) r5
            java.lang.Class r5 = mf0.C24361g.m61144N(r5)
            goto L_0x0082
        L_0x003e:
            boolean r8 = r5 instanceof java.lang.Object[]
            if (r8 == 0) goto L_0x0082
            r8 = r5
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            boolean r10 = r8 instanceof java.lang.Class[]
            if (r10 == 0) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            boolean r10 = r8 instanceof sf0.C24855b[]
            if (r10 == 0) goto L_0x0081
            if (r5 == 0) goto L_0x0079
            sf0.b[] r5 = (sf0.C24855b[]) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r5.length
            r8.<init>(r10)
            int r10 = r5.length
            r11 = 0
        L_0x005a:
            if (r11 >= r10) goto L_0x0068
            r12 = r5[r11]
            int r11 = r11 + 1
            java.lang.Class r12 = mf0.C24361g.m61144N(r12)
            r8.add(r12)
            goto L_0x005a
        L_0x0068:
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Object[] r5 = r8.toArray(r5)
            if (r5 == 0) goto L_0x0071
            goto L_0x0082
        L_0x0071:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r14.<init>(r0)
            throw r14
        L_0x0079:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>"
            r14.<init>(r0)
            throw r14
        L_0x0081:
            r5 = r8
        L_0x0082:
            boolean r7 = r7.isInstance(r5)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r5 = r9
        L_0x008a:
            if (r5 != 0) goto L_0x013a
            java.util.List<java.lang.String> r14 = r13.f60291b
            java.lang.Object r14 = r14.get(r4)
            java.lang.String r14 = (java.lang.String) r14
            java.util.ArrayList r0 = r13.f60295f
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            boolean r1 = mf0.C24362h.m61206a(r0, r1)
            if (r1 == 0) goto L_0x00ab
            java.lang.Class<sf0.b> r0 = sf0.C24855b.class
            sf0.b r0 = mf0.C24365j.m61219a(r0)
            goto L_0x00c8
        L_0x00ab:
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x00c4
            java.lang.Class r1 = r0.getComponentType()
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            boolean r1 = mf0.C24362h.m61206a(r1, r2)
            if (r1 == 0) goto L_0x00c4
            java.lang.Class<sf0.b[]> r0 = sf0.C24855b[].class
            sf0.b r0 = mf0.C24365j.m61219a(r0)
            goto L_0x00c8
        L_0x00c4:
            sf0.b r0 = mf0.C24365j.m61219a(r0)
        L_0x00c8:
            java.lang.String r1 = r0.mo59302b()
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            sf0.b r2 = mf0.C24365j.m61219a(r2)
            java.lang.String r2 = r2.mo59302b()
            boolean r1 = mf0.C24362h.m61206a(r1, r2)
            if (r1 == 0) goto L_0x010f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.mo59302b()
            r1.append(r2)
            r2 = 60
            r1.append(r2)
            java.lang.Class r0 = mf0.C24361g.m61144N(r0)
            java.lang.Class r0 = r0.getComponentType()
            java.lang.String r2 = "kotlinClass.java.componentType"
            mf0.C24362h.m61210e(r0, r2)
            sf0.b r0 = mf0.C24365j.m61219a(r0)
            java.lang.String r0 = r0.mo59302b()
            r1.append(r0)
            r0 = 62
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0113
        L_0x010f:
            java.lang.String r0 = r0.mo59302b()
        L_0x0113:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Argument #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = " is not of the required type "
            r2.append(r14)
            r2.append(r0)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x013a:
            r0.add(r5)
            r4 = r6
            goto L_0x000d
        L_0x0140:
            java.lang.Class<?> r14 = r13.f60290a
            java.util.List<java.lang.String> r1 = r13.f60291b
            java.util.ArrayList r0 = kotlin.collections.C23825c.m58505Q0(r1, r0)
            java.util.Map r0 = kotlin.collections.C23826d.m58536a0(r0)
            java.util.List<java.lang.reflect.Method> r1 = r13.f60293d
            java.lang.Object r14 = kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.m58657a(r14, r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.mo59358a(java.lang.Object[]):java.lang.Object");
    }

    /* renamed from: b */
    public final List<Type> mo59359b() {
        return this.f60294e;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Member mo59360c() {
        return null;
    }

    /* renamed from: i */
    public final Type mo59361i() {
        return this.f60290a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.ArrayList r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = cf0.C21136j.m49436X(r8, r0)
            r5.<init>(r0)
            java.util.Iterator r0 = r8.iterator()
        L_0x000f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r1, r2)
            r5.add(r1)
            goto L_0x000f
        L_0x0026:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.<init>(java.lang.Class, java.util.ArrayList, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin):void");
    }
}
