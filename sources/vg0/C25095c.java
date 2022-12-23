package vg0;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;
import p583jk.C17884p;

/* renamed from: vg0.c */
public final class C25095c extends AbstractList<String> implements RandomAccess, C25096d {

    /* renamed from: c */
    public static final C25105i f63307c = new C25105i(new C25095c());

    /* renamed from: b */
    public final ArrayList f63308b;

    public C25095c() {
        this.f63308b = new ArrayList();
    }

    /* renamed from: A */
    public final C25105i mo61636A() {
        return new C25105i(this);
    }

    /* renamed from: B0 */
    public final C25091a mo61637B0(int i) {
        C25091a aVar;
        Object obj = this.f63308b.get(i);
        if (obj instanceof C25091a) {
            aVar = (C25091a) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
            C25097e eVar = C25091a.f63298b;
            try {
                aVar = new C25097e(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            C25097e eVar2 = C25091a.f63298b;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            aVar = new C25097e(bArr2);
        }
        if (aVar != obj) {
            this.f63308b.set(i, aVar);
        }
        return aVar;
    }

    public final void add(int i, Object obj) {
        this.f63308b.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        this.f63308b.clear();
        this.modCount++;
    }

    public final Object get(int i) {
        String str;
        Object obj = this.f63308b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C25091a) {
            C25091a aVar = (C25091a) obj;
            aVar.getClass();
            try {
                str = aVar.mo61615B();
                if (aVar.mo61623n()) {
                    this.f63308b.set(i, str);
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = C24084f.f61087a;
            try {
                str = new String(bArr, "UTF-8");
                boolean z = false;
                if (C17884p.m44344O(0, bArr.length, bArr) == 0) {
                    z = true;
                }
                if (z) {
                    this.f63308b.set(i, str);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
        return str;
    }

    /* renamed from: p1 */
    public final void mo61643p1(C25097e eVar) {
        this.f63308b.add(eVar);
        this.modCount++;
    }

    public final Object remove(int i) {
        Object remove = this.f63308b.remove(i);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C25091a) {
            C25091a aVar = (C25091a) remove;
            aVar.getClass();
            try {
                return aVar.mo61615B();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) remove;
            byte[] bArr2 = C24084f.f61087a;
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
    }

    public final Object set(int i, Object obj) {
        Object obj2 = this.f63308b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C25091a) {
            C25091a aVar = (C25091a) obj2;
            aVar.getClass();
            try {
                return aVar.mo61615B();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj2;
            byte[] bArr2 = C24084f.f61087a;
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException("UTF-8 not supported?", e2);
            }
        }
    }

    public final int size() {
        return this.f63308b.size();
    }

    /* renamed from: w */
    public final List<?> mo61647w() {
        return Collections.unmodifiableList(this.f63308b);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof C25096d) {
            collection = ((C25096d) collection).mo61647w();
        }
        boolean addAll = this.f63308b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public C25095c(C25096d dVar) {
        this.f63308b = new ArrayList(dVar.size());
        addAll(dVar);
    }
}
