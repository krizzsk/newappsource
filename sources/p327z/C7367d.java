package p327z;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;
import mf0.C24361g;

/* renamed from: z.d */
public class C7367d extends C7365c {

    /* renamed from: z.d$a */
    public static final class C7368a {

        /* renamed from: a */
        public final OutputConfiguration f22592a;

        /* renamed from: b */
        public String f22593b;

        public C7368a(OutputConfiguration outputConfiguration) {
            this.f22592a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7368a)) {
                return false;
            }
            C7368a aVar = (C7368a) obj;
            if (!Objects.equals(this.f22592a, aVar.f22592a) || !Objects.equals(this.f22593b, aVar.f22593b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.f22592a.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            String str = this.f22593b;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i2;
        }
    }

    public C7367d(Surface surface) {
        super((Object) new C7368a(new OutputConfiguration(surface)));
    }

    /* renamed from: a */
    public void mo23575a(String str) {
        ((C7368a) this.f22594a).f22593b = str;
    }

    public Object getOutputConfiguration() {
        C24361g.m61175n(this.f22594a instanceof C7368a);
        return ((C7368a) this.f22594a).f22592a;
    }

    public String getPhysicalCameraId() {
        return ((C7368a) this.f22594a).f22593b;
    }

    public C7367d(Object obj) {
        super(obj);
    }
}
