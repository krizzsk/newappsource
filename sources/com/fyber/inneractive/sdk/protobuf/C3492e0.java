package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3609z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e0 */
public class C3492e0 extends C3482c<String> implements C3497f0, RandomAccess {

    /* renamed from: b */
    public final List<Object> f12423b;

    static {
        new C3492e0(10).f12405a = false;
    }

    public C3492e0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* renamed from: a */
    public C3497f0 mo14819a() {
        return this.f12405a ? new C3559p1(this) : this;
    }

    public void add(int i, Object obj) {
        mo14793e();
        this.f12423b.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(this.f12423b.size(), collection);
    }

    /* renamed from: b */
    public C3609z.C3620j mo14808b(int i) {
        if (i >= this.f12423b.size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f12423b);
            return new C3492e0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public List<?> mo14823c() {
        return Collections.unmodifiableList(this.f12423b);
    }

    public void clear() {
        mo14793e();
        this.f12423b.clear();
        this.modCount++;
    }

    public Object get(int i) {
        String str;
        Object obj = this.f12423b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3508i) {
            C3508i iVar = (C3508i) obj;
            str = iVar.mo14940i();
            if (iVar.mo14934e()) {
                this.f12423b.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C3609z.f12640a);
            if (C3576s1.m9504a(bArr)) {
                this.f12423b.set(i, str);
            }
        }
        return str;
    }

    public Object remove(int i) {
        mo14793e();
        Object remove = this.f12423b.remove(i);
        this.modCount++;
        return m8773a(remove);
    }

    public Object set(int i, Object obj) {
        mo14793e();
        return m8773a(this.f12423b.set(i, (String) obj));
    }

    public int size() {
        return this.f12423b.size();
    }

    public C3492e0(ArrayList<Object> arrayList) {
        this.f12423b = arrayList;
    }

    /* renamed from: a */
    public void mo14821a(C3508i iVar) {
        mo14793e();
        this.f12423b.add(iVar);
        this.modCount++;
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo14793e();
        if (collection instanceof C3497f0) {
            collection = ((C3497f0) collection).mo14823c();
        }
        boolean addAll = this.f12423b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: a */
    public Object mo14820a(int i) {
        return this.f12423b.get(i);
    }

    /* renamed from: a */
    public static String m8773a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C3508i) {
            return ((C3508i) obj).mo14940i();
        }
        return new String((byte[]) obj, C3609z.f12640a);
    }
}
