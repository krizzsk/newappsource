package p066e0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: e0.a */
public final class C4414a extends C4447o {

    /* renamed from: a */
    public final Executor f15475a;

    /* renamed from: b */
    public final Handler f15476b;

    public C4414a(Executor executor, Handler handler) {
        if (executor != null) {
            this.f15475a = executor;
            if (handler != null) {
                this.f15476b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    /* renamed from: a */
    public final Executor mo19922a() {
        return this.f15475a;
    }

    /* renamed from: b */
    public final Handler mo19923b() {
        return this.f15476b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4447o)) {
            return false;
        }
        C4447o oVar = (C4447o) obj;
        if (!this.f15475a.equals(oVar.mo19922a()) || !this.f15476b.equals(oVar.mo19923b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f15475a.hashCode() ^ 1000003) * 1000003) ^ this.f15476b.hashCode();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CameraThreadConfig{cameraExecutor=");
        k.append(this.f15475a);
        k.append(", schedulerHandler=");
        k.append(this.f15476b);
        k.append("}");
        return k.toString();
    }
}
