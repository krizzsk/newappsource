package okhttp3.internal.connection;

import ii0.C23610d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    /* renamed from: a */
    public final void mo60861a(IOException iOException) {
        IOException iOException2 = this.firstException;
        Method method = C23610d.f59693j;
        if (method != null) {
            try {
                method.invoke(iOException2, new Object[]{iOException});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.lastException = iOException;
    }

    /* renamed from: b */
    public final IOException mo60862b() {
        return this.firstException;
    }

    /* renamed from: c */
    public final IOException mo60863c() {
        return this.lastException;
    }
}
