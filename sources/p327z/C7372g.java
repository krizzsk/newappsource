package p327z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import androidx.camera.camera2.internal.C0524n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p327z.C7359a;
import p327z.C7365c;
import p327z.C7367d;

/* renamed from: z.g */
public final class C7372g {

    /* renamed from: a */
    public final C7375c f22600a;

    /* renamed from: z.g$a */
    public static final class C7373a implements C7375c {

        /* renamed from: a */
        public final SessionConfiguration f22601a;

        /* renamed from: b */
        public final List<C7363b> f22602b;

        public C7373a(ArrayList arrayList, Executor executor, C0524n nVar) {
            C7365c cVar;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, C7372g.m16985a(arrayList), executor, nVar);
            this.f22601a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration next : outputConfigurations) {
                C7363b bVar = null;
                if (next != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        cVar = new C7369e((Object) next);
                    } else if (i >= 26) {
                        cVar = new C7367d((Object) new C7367d.C7368a(next));
                    } else if (i >= 24) {
                        cVar = new C7365c((Object) new C7365c.C7366a(next));
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        bVar = new C7363b(cVar);
                    }
                }
                arrayList2.add(bVar);
            }
            this.f22602b = Collections.unmodifiableList(arrayList2);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C7373a)) {
                return false;
            }
            return Objects.equals(this.f22601a, ((C7373a) obj).f22601a);
        }

        public final Executor getExecutor() {
            return this.f22601a.getExecutor();
        }

        public final C7359a getInputConfiguration() {
            int i;
            C7359a aVar;
            InputConfiguration inputConfiguration = this.f22601a.getInputConfiguration();
            if (inputConfiguration == null || (i = Build.VERSION.SDK_INT) < 23) {
                return null;
            }
            if (i >= 31) {
                aVar = new C7359a(new C7359a.C7361b(inputConfiguration));
            } else {
                aVar = new C7359a(new C7359a.C7360a(inputConfiguration));
            }
            return aVar;
        }

        public final List<C7363b> getOutputConfigurations() {
            return this.f22602b;
        }

        public final Object getSessionConfiguration() {
            return this.f22601a;
        }

        public final int getSessionType() {
            return this.f22601a.getSessionType();
        }

        public final CameraCaptureSession.StateCallback getStateCallback() {
            return this.f22601a.getStateCallback();
        }

        public final int hashCode() {
            return this.f22601a.hashCode();
        }

        public final void setSessionParameters(CaptureRequest captureRequest) {
            this.f22601a.setSessionParameters(captureRequest);
        }
    }

    /* renamed from: z.g$b */
    public static final class C7374b implements C7375c {

        /* renamed from: a */
        public final List<C7363b> f22603a;

        /* renamed from: b */
        public final CameraCaptureSession.StateCallback f22604b;

        /* renamed from: c */
        public final Executor f22605c;

        /* renamed from: d */
        public int f22606d = 0;

        public C7374b(ArrayList arrayList, Executor executor, C0524n nVar) {
            this.f22603a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.f22604b = nVar;
            this.f22605c = executor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7374b) {
                C7374b bVar = (C7374b) obj;
                bVar.getClass();
                if (this.f22606d == bVar.f22606d && this.f22603a.size() == bVar.f22603a.size()) {
                    for (int i = 0; i < this.f22603a.size(); i++) {
                        if (!this.f22603a.get(i).equals(bVar.f22603a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final Executor getExecutor() {
            return this.f22605c;
        }

        public final C7359a getInputConfiguration() {
            return null;
        }

        public final List<C7363b> getOutputConfigurations() {
            return this.f22603a;
        }

        public final Object getSessionConfiguration() {
            return null;
        }

        public final int getSessionType() {
            return this.f22606d;
        }

        public final CameraCaptureSession.StateCallback getStateCallback() {
            return this.f22604b;
        }

        public final int hashCode() {
            int hashCode = this.f22603a.hashCode() ^ 31;
            int i = ((hashCode << 5) - hashCode) ^ 0;
            return this.f22606d ^ ((i << 5) - i);
        }

        public final void setSessionParameters(CaptureRequest captureRequest) {
        }
    }

    /* renamed from: z.g$c */
    public interface C7375c {
        Executor getExecutor();

        C7359a getInputConfiguration();

        List<C7363b> getOutputConfigurations();

        Object getSessionConfiguration();

        int getSessionType();

        CameraCaptureSession.StateCallback getStateCallback();

        void setSessionParameters(CaptureRequest captureRequest);
    }

    public C7372g(ArrayList arrayList, Executor executor, C0524n nVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f22600a = new C7374b(arrayList, executor, nVar);
        } else {
            this.f22600a = new C7373a(arrayList, executor, nVar);
        }
    }

    /* renamed from: a */
    public static ArrayList m16985a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((C7363b) it.next()).f22589a.getOutputConfiguration());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7372g)) {
            return false;
        }
        return this.f22600a.equals(((C7372g) obj).f22600a);
    }

    public final int hashCode() {
        return this.f22600a.hashCode();
    }
}
