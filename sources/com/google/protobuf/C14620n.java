package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p911xg.C20498h;
import p911xg.C20515w;

/* renamed from: com.google.protobuf.n */
public final class C14620n extends C14596c<String> implements C20498h, RandomAccess {

    /* renamed from: c */
    public final ArrayList f36867c;

    static {
        new C14620n(10).f36836b = false;
    }

    public C14620n(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* renamed from: A */
    public final C20498h mo44105A() {
        if (this.f36836b) {
            return new C20515w(this);
        }
        return this;
    }

    public final void add(int i, Object obj) {
        mo44030e();
        this.f36867c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: c1 */
    public final C14610k.C14615e mo44086c1(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f36867c);
            return new C14620n((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        mo44030e();
        this.f36867c.clear();
        this.modCount++;
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f36867c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            byteString.getClass();
            Charset charset = C14610k.f36861a;
            if (byteString.size() == 0) {
                str = "";
            } else {
                str = byteString.mo43902u(charset);
            }
            if (byteString.mo43896m()) {
                this.f36867c.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, C14610k.f36861a);
            boolean z = false;
            if (Utf8.f36813a.mo43980b(0, bArr.length, bArr) == 0) {
                z = true;
            }
            if (z) {
                this.f36867c.set(i, str);
            }
        }
        return str;
    }

    public final Object getRaw(int i) {
        return this.f36867c.get(i);
    }

    /* renamed from: k */
    public final void mo44109k(ByteString byteString) {
        mo44030e();
        this.f36867c.add(byteString);
        this.modCount++;
    }

    public final Object remove(int i) {
        mo44030e();
        Object remove = this.f36867c.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof ByteString)) {
            return new String((byte[]) remove, C14610k.f36861a);
        }
        ByteString byteString = (ByteString) remove;
        byteString.getClass();
        Charset charset = C14610k.f36861a;
        if (byteString.size() == 0) {
            return "";
        }
        return byteString.mo43902u(charset);
    }

    public final Object set(int i, Object obj) {
        mo44030e();
        Object obj2 = this.f36867c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, C14610k.f36861a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        Charset charset = C14610k.f36861a;
        if (byteString.size() == 0) {
            return "";
        }
        return byteString.mo43902u(charset);
    }

    public final int size() {
        return this.f36867c.size();
    }

    /* renamed from: w */
    public final List<?> mo44112w() {
        return Collections.unmodifiableList(this.f36867c);
    }

    public C14620n(ArrayList<Object> arrayList) {
        this.f36867c = arrayList;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo44030e();
        if (collection instanceof C20498h) {
            collection = ((C20498h) collection).mo44112w();
        }
        boolean addAll = this.f36867c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }
}
