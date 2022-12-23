package p327z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import mf0.C24361g;

/* renamed from: z.c */
public class C7365c extends C7370f {

    /* renamed from: z.c$a */
    public static final class C7366a {

        /* renamed from: a */
        public final OutputConfiguration f22590a;

        /* renamed from: b */
        public String f22591b;

        public C7366a(OutputConfiguration outputConfiguration) {
            this.f22590a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7366a)) {
                return false;
            }
            C7366a aVar = (C7366a) obj;
            if (!Objects.equals(this.f22590a, aVar.f22590a) || !Objects.equals(this.f22591b, aVar.f22591b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.f22590a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            int i2 = 0;
            int i3 = i ^ 0;
            int i4 = (i3 << 5) - i3;
            String str = this.f22591b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i2 ^ i4;
        }
    }

    public C7365c(Surface surface) {
        super((Object) new C7366a(new OutputConfiguration(surface)));
    }

    /* renamed from: a */
    public void mo23575a(String str) {
        ((C7366a) this.f22594a).f22591b = str;
    }

    public Object getOutputConfiguration() {
        C24361g.m61175n(this.f22594a instanceof C7366a);
        return ((C7366a) this.f22594a).f22590a;
    }

    public String getPhysicalCameraId() {
        return ((C7366a) this.f22594a).f22591b;
    }

    public final Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    public C7365c(Object obj) {
        super(obj);
    }
}
