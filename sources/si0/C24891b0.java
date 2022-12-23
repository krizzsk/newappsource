package si0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mf0.C24362h;

/* renamed from: si0.b0 */
public final class C24891b0 extends C24888b {

    /* renamed from: k */
    public final Socket f62937k;

    public C24891b0(Socket socket) {
        C24362h.m61211f(socket, "socket");
        this.f62937k = socket;
    }

    /* renamed from: j */
    public final IOException mo60787j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* renamed from: k */
    public final void mo59055k() {
        try {
            this.f62937k.close();
        } catch (Exception e) {
            Logger logger = C24912s.f62972a;
            Level level = Level.WARNING;
            StringBuilder k = C13555b.m33972k("Failed to close timed out socket ");
            k.append(this.f62937k);
            logger.log(level, k.toString(), e);
        } catch (AssertionError e2) {
            if (C24911r.m62548d(e2)) {
                Logger logger2 = C24912s.f62972a;
                Level level2 = Level.WARNING;
                StringBuilder k2 = C13555b.m33972k("Failed to close timed out socket ");
                k2.append(this.f62937k);
                logger2.log(level2, k2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
