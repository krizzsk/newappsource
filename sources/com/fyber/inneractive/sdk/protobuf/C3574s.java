package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3494f;
import com.fyber.inneractive.sdk.protobuf.C3562q;
import com.fyber.inneractive.sdk.protobuf.C3584t1;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s */
public final class C3574s extends C3567r<GeneratedMessageLite.C3467c> {
    /* renamed from: a */
    public boolean mo15164a(C3564q0 q0Var) {
        return q0Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    /* renamed from: b */
    public C3596u<GeneratedMessageLite.C3467c> mo15165b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    /* renamed from: c */
    public void mo15166c(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.mo15226g();
    }

    /* renamed from: a */
    public C3596u<GeneratedMessageLite.C3467c> mo15158a(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    /* renamed from: a */
    public <UT, UB> UB mo15159a(C3493e1 e1Var, Object obj, C3562q qVar, C3596u<GeneratedMessageLite.C3467c> uVar, UB ub, C3550m1<UT, UB> m1Var) throws IOException {
        Object a;
        Object obj2;
        ArrayList arrayList;
        GeneratedMessageLite.C3468d dVar = (GeneratedMessageLite.C3468d) obj;
        GeneratedMessageLite.C3467c cVar = dVar.f12376d;
        int i = cVar.f12369b;
        if (!cVar.f12371d || !cVar.f12372e) {
            Object obj3 = null;
            C3584t1.C3586b bVar = cVar.f12370c;
            if (bVar != C3584t1.C3586b.ENUM) {
                switch (bVar.ordinal()) {
                    case 0:
                        obj2 = Double.valueOf(e1Var.mo14848h());
                        break;
                    case 1:
                        obj2 = Float.valueOf(e1Var.mo14854k());
                        break;
                    case 2:
                        obj2 = Long.valueOf(e1Var.mo14862o());
                        break;
                    case 3:
                        obj2 = Long.valueOf(e1Var.mo14844f());
                        break;
                    case 4:
                        obj2 = Integer.valueOf(e1Var.mo14840d());
                        break;
                    case 5:
                        obj2 = Long.valueOf(e1Var.mo14846g());
                        break;
                    case 6:
                        obj2 = Integer.valueOf(e1Var.mo14866q());
                        break;
                    case 7:
                        obj2 = Boolean.valueOf(e1Var.mo14868r());
                        break;
                    case 8:
                        obj2 = e1Var.mo14860n();
                        break;
                    case 9:
                        obj2 = e1Var.mo14829a(dVar.f12375c.getClass(), qVar);
                        break;
                    case 10:
                        obj2 = e1Var.mo14835b(dVar.f12375c.getClass(), qVar);
                        break;
                    case 11:
                        obj2 = e1Var.mo14827a();
                        break;
                    case 12:
                        obj2 = Integer.valueOf(e1Var.mo14838c());
                        break;
                    case 13:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 14:
                        obj2 = Integer.valueOf(e1Var.mo14858m());
                        break;
                    case 15:
                        obj2 = Long.valueOf(e1Var.mo14870t());
                        break;
                    case 16:
                        obj2 = Integer.valueOf(e1Var.mo14852j());
                        break;
                    case 17:
                        obj2 = Long.valueOf(e1Var.mo14856l());
                        break;
                }
            } else {
                int d = e1Var.mo14840d();
                if (dVar.f12376d.f12368a.mo15253a(d) == null) {
                    Class<?> cls = C3507h1.f12439a;
                    if (ub == null) {
                        ub = m1Var.mo15105a();
                    }
                    m1Var.mo15116b(ub, i, (long) d);
                    return ub;
                }
                obj2 = Integer.valueOf(d);
            }
            obj3 = obj2;
            GeneratedMessageLite.C3467c cVar2 = dVar.f12376d;
            if (cVar2.f12371d) {
                uVar.mo15215a(cVar2, (Object) obj3);
            } else {
                int ordinal = cVar2.f12370c.ordinal();
                if ((ordinal == 9 || ordinal == 10) && (a = uVar.mo15214a(dVar.f12376d)) != null) {
                    obj3 = C3609z.m9637a(a, (Object) obj3);
                }
                uVar.mo15218c(dVar.f12376d, obj3);
            }
        } else {
            switch (cVar.f12370c.ordinal()) {
                case 0:
                    arrayList = new ArrayList();
                    e1Var.mo14853j(arrayList);
                    break;
                case 1:
                    arrayList = new ArrayList();
                    e1Var.mo14841d(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e1Var.mo14855k(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e1Var.mo14830a(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e1Var.mo14863o(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e1Var.mo14861n(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e1Var.mo14843e(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e1Var.mo14857l(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e1Var.mo14850i(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e1Var.mo14865p(arrayList);
                    ub = C3507h1.m8929a(i, (List<Integer>) arrayList, dVar.f12376d.f12368a, ub, m1Var);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e1Var.mo14845f(arrayList);
                    break;
                case 15:
                    arrayList = new ArrayList();
                    e1Var.mo14859m(arrayList);
                    break;
                case 16:
                    arrayList = new ArrayList();
                    e1Var.mo14839c(arrayList);
                    break;
                case 17:
                    arrayList = new ArrayList();
                    e1Var.mo14847g(arrayList);
                    break;
                default:
                    StringBuilder k = C13555b.m33972k("Type cannot be packed: ");
                    k.append(dVar.f12376d.f12370c);
                    throw new IllegalStateException(k.toString());
            }
            uVar.mo15218c(dVar.f12376d, arrayList);
        }
        return ub;
    }

    /* renamed from: a */
    public Object mo15160a(C3562q qVar, C3564q0 q0Var, int i) {
        return qVar.f12536a.get(new C3562q.C3563a(q0Var, i));
    }

    /* renamed from: a */
    public int mo15157a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C3467c) entry.getKey()).f12369b;
    }

    /* renamed from: a */
    public void mo15163a(C3599u1 u1Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C3467c cVar = (GeneratedMessageLite.C3467c) entry.getKey();
        if (cVar.f12371d) {
            switch (cVar.f12370c.ordinal()) {
                case 0:
                    C3507h1.m8941b(cVar.f12369b, (List<Double>) (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 1:
                    C3507h1.m8953f(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 2:
                    C3507h1.m8959h(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 3:
                    C3507h1.m8968n(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 4:
                    C3507h1.m8956g(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 5:
                    C3507h1.m8950e(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 6:
                    C3507h1.m8947d(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 7:
                    C3507h1.m8933a(cVar.f12369b, (List<Boolean>) (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 8:
                    C3507h1.m8939b(cVar.f12369b, (List<String>) (List) entry.getValue(), u1Var);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C3507h1.m8932a(cVar.f12369b, (List<?>) (List) entry.getValue(), u1Var, (C3498f1) C3481b1.f12402c.mo14786a(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C3507h1.m8940b(cVar.f12369b, (List<?>) (List) entry.getValue(), u1Var, (C3498f1) C3481b1.f12402c.mo14786a(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    C3507h1.m8931a(cVar.f12369b, (List<C3508i>) (List) entry.getValue(), u1Var);
                    return;
                case 12:
                    C3507h1.m8967m(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 13:
                    C3507h1.m8956g(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 14:
                    C3507h1.m8962i(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 15:
                    C3507h1.m8964j(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 16:
                    C3507h1.m8965k(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                case 17:
                    C3507h1.m8966l(cVar.f12369b, (List) entry.getValue(), u1Var, cVar.f12372e);
                    return;
                default:
                    return;
            }
        } else {
            switch (cVar.f12370c.ordinal()) {
                case 0:
                    ((C3548m) u1Var).mo15098a(cVar.f12369b, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    ((C3548m) u1Var).mo15099a(cVar.f12369b, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    ((C3548m) u1Var).f12518a.mo15073g(cVar.f12369b, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    ((C3548m) u1Var).f12518a.mo15073g(cVar.f12369b, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    ((C3548m) u1Var).f12518a.mo15074h(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    ((C3548m) u1Var).f12518a.mo15070f(cVar.f12369b, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    ((C3548m) u1Var).f12518a.mo15072g(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    ((C3548m) u1Var).f12518a.mo15064b(cVar.f12369b, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    ((C3548m) u1Var).f12518a.mo15063b(cVar.f12369b, (String) entry.getValue());
                    return;
                case 9:
                    ((C3548m) u1Var).mo15103a(cVar.f12369b, entry.getValue(), C3481b1.f12402c.mo14786a(entry.getValue().getClass()));
                    return;
                case 10:
                    ((C3548m) u1Var).mo15104b(cVar.f12369b, entry.getValue(), C3481b1.f12402c.mo14786a(entry.getValue().getClass()));
                    return;
                case 11:
                    ((C3548m) u1Var).f12518a.mo15061b(cVar.f12369b, (C3508i) entry.getValue());
                    return;
                case 12:
                    ((C3548m) u1Var).f12518a.mo15076j(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    ((C3548m) u1Var).f12518a.mo15074h(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    ((C3548m) u1Var).f12518a.mo15072g(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    ((C3548m) u1Var).f12518a.mo15070f(cVar.f12369b, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    ((C3548m) u1Var).mo15100a(cVar.f12369b, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    ((C3548m) u1Var).mo15101a(cVar.f12369b, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo15161a(C3493e1 e1Var, Object obj, C3562q qVar, C3596u<GeneratedMessageLite.C3467c> uVar) throws IOException {
        GeneratedMessageLite.C3468d dVar = (GeneratedMessageLite.C3468d) obj;
        uVar.mo15218c(dVar.f12376d, e1Var.mo14835b(dVar.f12375c.getClass(), qVar));
    }

    /* renamed from: a */
    public void mo15162a(C3508i iVar, Object obj, C3562q qVar, C3596u<GeneratedMessageLite.C3467c> uVar) throws IOException {
        GeneratedMessageLite.C3468d dVar = (GeneratedMessageLite.C3468d) obj;
        GeneratedMessageLite b = ((GeneratedMessageLite.C3465a) dVar.f12375c.newBuilderForType()).mo14760b();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.mo14938h());
        if (wrap.hasArray()) {
            C3494f.C3496b bVar = new C3494f.C3496b(wrap, true);
            C3481b1 b1Var = C3481b1.f12402c;
            b1Var.getClass();
            b1Var.mo14786a(b.getClass()).mo14891a(b, bVar, qVar);
            uVar.mo15218c(dVar.f12376d, b);
            if (bVar.mo14869s() != Integer.MAX_VALUE) {
                throw C3476a0.m8727a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
