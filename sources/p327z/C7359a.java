package p327z;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: z.a */
public final class C7359a {

    /* renamed from: a */
    public final C7362c f22587a;

    /* renamed from: z.a$a */
    public static class C7360a implements C7362c {

        /* renamed from: a */
        public final InputConfiguration f22588a;

        public C7360a(Object obj) {
            this.f22588a = (InputConfiguration) obj;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7362c)) {
                return false;
            }
            return Objects.equals(this.f22588a, ((C7362c) obj).getInputConfiguration());
        }

        public final Object getInputConfiguration() {
            return this.f22588a;
        }

        public final int hashCode() {
            return this.f22588a.hashCode();
        }

        public final String toString() {
            return this.f22588a.toString();
        }
    }

    /* renamed from: z.a$b */
    public static final class C7361b extends C7360a {
        public C7361b(Object obj) {
            super(obj);
        }
    }

    /* renamed from: z.a$c */
    public interface C7362c {
        Object getInputConfiguration();
    }

    public C7359a(C7360a aVar) {
        this.f22587a = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7359a)) {
            return false;
        }
        return this.f22587a.equals(((C7359a) obj).f22587a);
    }

    public final int hashCode() {
        return this.f22587a.hashCode();
    }

    public final String toString() {
        return this.f22587a.toString();
    }
}
