package p359ag;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import p437dg.C16626o;

/* renamed from: ag.g */
public abstract class C13450g {
    /* renamed from: B */
    public String mo40326B() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public abstract C13450g mo40330e();

    /* renamed from: i */
    public boolean mo40333i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: m */
    public double mo40335m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: n */
    public float mo40336n() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: p */
    public int mo40337p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: s */
    public final C13447d mo40340s() {
        if (this instanceof C13447d) {
            return (C13447d) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            C16626o.f43316C.mo40321b(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: u */
    public final C13452i mo40342u() {
        if (this instanceof C13452i) {
            return (C13452i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: x */
    public final C13454k mo40343x() {
        if (this instanceof C13454k) {
            return (C13454k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: z */
    public long mo40339z() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }
}
