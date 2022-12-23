package si0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.text.C24179b;
import mf0.C24362h;

/* renamed from: si0.r */
public final class C24911r {
    /* renamed from: a */
    public static final C24915u m62545a(File file) throws FileNotFoundException {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(file, "$this$appendingSink");
        return m62550f(new FileOutputStream(file, true));
    }

    /* renamed from: b */
    public static final C24917w m62546b(C24887a0 a0Var) {
        return new C24917w(a0Var);
    }

    /* renamed from: c */
    public static final C24918x m62547c(C24893c0 c0Var) {
        C24362h.m61211f(c0Var, "$this$buffer");
        return new C24918x(c0Var);
    }

    /* renamed from: d */
    public static final boolean m62548d(AssertionError assertionError) {
        boolean z;
        Logger logger = C24912s.f62972a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = C24179b.m60559G(message, "getsockname failed", false);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final C24892c m62549e(Socket socket) throws IOException {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(socket, "$this$sink");
        C24891b0 b0Var = new C24891b0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C24362h.m61210e(outputStream, "getOutputStream()");
        return new C24892c(b0Var, new C24915u(outputStream, b0Var));
    }

    /* renamed from: f */
    public static final C24915u m62550f(OutputStream outputStream) {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(outputStream, "$this$sink");
        return new C24915u(outputStream, new C24895d0());
    }

    /* renamed from: g */
    public static final C24894d m62551g(Socket socket) throws IOException {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(socket, "$this$source");
        C24891b0 b0Var = new C24891b0(socket);
        InputStream inputStream = socket.getInputStream();
        C24362h.m61210e(inputStream, "getInputStream()");
        return new C24894d(b0Var, new C24910q(inputStream, b0Var));
    }

    /* renamed from: h */
    public static final C24910q m62552h(File file) throws FileNotFoundException {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(file, "$this$source");
        return m62553i(new FileInputStream(file));
    }

    /* renamed from: i */
    public static final C24910q m62553i(InputStream inputStream) {
        Logger logger = C24912s.f62972a;
        C24362h.m61211f(inputStream, "$this$source");
        return new C24910q(inputStream, new C24895d0());
    }
}
