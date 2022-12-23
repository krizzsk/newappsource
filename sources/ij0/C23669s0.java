package ij0;

import java.lang.reflect.Constructor;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: ij0.s0 */
public final class C23669s0 {

    /* renamed from: a */
    public final ConcurrentCache f59829a = new ConcurrentCache();

    /* renamed from: ij0.s0$a */
    public class C23670a implements C23666r0 {

        /* renamed from: a */
        public Object f59830a;

        /* renamed from: b */
        public Class f59831b;

        public C23670a(Class cls) {
            this.f59831b = cls;
        }

        /* renamed from: a */
        public final boolean mo58773a() {
            return false;
        }

        /* renamed from: b */
        public final Object mo58774b(Object obj) throws Exception {
            this.f59830a = obj;
            return obj;
        }

        public final Object getInstance() throws Exception {
            if (this.f59830a == null) {
                C23669s0 s0Var = C23669s0.this;
                Class cls = this.f59831b;
                Constructor constructor = (Constructor) s0Var.f59829a.get(cls);
                if (constructor == null) {
                    constructor = cls.getDeclaredConstructor(new Class[0]);
                    if (!constructor.isAccessible()) {
                        constructor.setAccessible(true);
                    }
                    s0Var.f59829a.put(cls, constructor);
                }
                this.f59830a = constructor.newInstance(new Object[0]);
            }
            return this.f59830a;
        }

        public final Class getType() {
            return this.f59831b;
        }
    }
}
