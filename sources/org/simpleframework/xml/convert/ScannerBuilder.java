package org.simpleframework.xml.convert;

import hj0.C23578d;
import java.lang.annotation.Annotation;
import org.simpleframework.xml.util.ConcurrentCache;

class ScannerBuilder extends ConcurrentCache<C23578d> {

    public static class Entry extends ConcurrentCache<Annotation> implements C23578d {
        private final Class root;

        public Entry(Class cls) {
            this.root = cls;
        }

        /* renamed from: a */
        public final <T extends Annotation> T mo58734a(Class<T> cls) {
            Annotation annotation;
            if (!contains(cls)) {
                Class cls2 = this.root;
                while (true) {
                    if (cls2 == null) {
                        annotation = null;
                        break;
                    }
                    annotation = cls2.getAnnotation(cls);
                    if (annotation != null) {
                        break;
                    }
                    cls2 = cls2.getSuperclass();
                }
                if (annotation != null) {
                    put(cls, annotation);
                }
            }
            return (Annotation) get(cls);
        }
    }
}
