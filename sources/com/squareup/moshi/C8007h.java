package com.squareup.moshi;

import com.squareup.moshi.C8011k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import nb0.C12949m;

/* renamed from: com.squareup.moshi.h */
public abstract class C8007h<C extends Collection<T>, T> extends C8011k<C> {

    /* renamed from: b */
    public static final C8008a f24262b = new C8008a();

    /* renamed from: a */
    public final C8011k<T> f24263a;

    /* renamed from: com.squareup.moshi.h$a */
    public class C8008a implements C8011k.C8012a {
        /* renamed from: a */
        public final C8011k<?> mo25038a(Type type, Set<? extends Annotation> set, C8017o oVar) {
            Class<?> c = C12949m.m32789c(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (c == List.class || c == Collection.class) {
                return new C8009i(oVar.mo25081b(C12949m.m32787a(type, Collection.class))).mo25050c();
            }
            if (c == Set.class) {
                return new C8010j(oVar.mo25081b(C12949m.m32787a(type, Collection.class))).mo25050c();
            }
            return null;
        }
    }

    public C8007h(C8011k kVar) {
        this.f24263a = kVar;
    }

    public final String toString() {
        return this.f24263a + ".collection()";
    }
}
