package com.veriff.sdk.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001a0.C0016g;

public final class abr {

    /* renamed from: a */
    public static final Logger f53575a = Logger.getLogger(abr.class.getName());

    private abr() {
    }

    /* renamed from: a */
    public static abk m50508a(aca aca) {
        return new abv(aca);
    }

    /* renamed from: b */
    public static abz m50517b(File file) throws FileNotFoundException {
        if (file != null) {
            return m50510a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    public static abz m50520c(File file) throws FileNotFoundException {
        if (file != null) {
            return m50510a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static abj m50507a(abz abz) {
        return new abu(abz);
    }

    /* renamed from: a */
    public static abz m50510a(OutputStream outputStream) {
        return m50511a(outputStream, new acb());
    }

    /* renamed from: b */
    public static aca m50518b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            abg c = m50519c(socket);
            return c.mo53835a(m50515a(socket.getInputStream(), (acb) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: c */
    private static abg m50519c(final Socket socket) {
        return new abg() {
            /* renamed from: a */
            public IOException mo53753a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            /* renamed from: a */
            public void mo53754a() {
                try {
                    socket.close();
                } catch (Exception e) {
                    Logger logger = abr.f53575a;
                    Level level = Level.WARNING;
                    StringBuilder k = C13555b.m33972k("Failed to close timed out socket ");
                    k.append(socket);
                    logger.log(level, k.toString(), e);
                } catch (AssertionError e2) {
                    if (abr.m50516a(e2)) {
                        Logger logger2 = abr.f53575a;
                        Level level2 = Level.WARNING;
                        StringBuilder k2 = C13555b.m33972k("Failed to close timed out socket ");
                        k2.append(socket);
                        logger2.log(level2, k2.toString(), e2);
                        return;
                    }
                    throw e2;
                }
            }
        };
    }

    /* renamed from: a */
    private static abz m50511a(final OutputStream outputStream, final acb acb) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (acb != null) {
            return new abz() {
                /* renamed from: a */
                public acb mo53674a() {
                    return acb.this;
                }

                /* renamed from: a_ */
                public void mo53675a_(abi abi, long j) throws IOException {
                    acc.m50627a(abi.f53556b, 0, j);
                    while (j > 0) {
                        acb.this.mo53960g();
                        abw abw = abi.f53555a;
                        int min = (int) Math.min(j, (long) (abw.f53598c - abw.f53597b));
                        outputStream.write(abw.f53596a, abw.f53597b, min);
                        int i = abw.f53597b + min;
                        abw.f53597b = i;
                        long j2 = (long) min;
                        j -= j2;
                        abi.f53556b -= j2;
                        if (i == abw.f53598c) {
                            abi.f53555a = abw.mo53988b();
                            abx.m50590a(abw);
                        }
                    }
                }

                public void close() throws IOException {
                    outputStream.close();
                }

                public void flush() throws IOException {
                    outputStream.flush();
                }

                public String toString() {
                    StringBuilder k = C13555b.m33972k("sink(");
                    k.append(outputStream);
                    k.append(")");
                    return k.toString();
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static abz m50512a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            abg c = m50519c(socket);
            return c.mo53834a(m50511a(socket.getOutputStream(), (acb) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static aca m50514a(InputStream inputStream) {
        return m50515a(inputStream, new acb());
    }

    /* renamed from: a */
    private static aca m50515a(final InputStream inputStream, final acb acb) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (acb != null) {
            return new aca() {
                /* renamed from: a */
                public long mo53671a(abi abi, long j) throws IOException {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            acb.this.mo53960g();
                            abw e = abi.mo53885e(1);
                            int read = inputStream.read(e.f53596a, e.f53598c, (int) Math.min(j, (long) (8192 - e.f53598c)));
                            if (read == -1) {
                                return -1;
                            }
                            e.f53598c += read;
                            long j2 = (long) read;
                            abi.f53556b += j2;
                            return j2;
                        } catch (AssertionError e2) {
                            if (abr.m50516a(e2)) {
                                throw new IOException(e2);
                            }
                            throw e2;
                        }
                    }
                }

                public void close() throws IOException {
                    inputStream.close();
                }

                public String toString() {
                    StringBuilder k = C13555b.m33972k("source(");
                    k.append(inputStream);
                    k.append(")");
                    return k.toString();
                }

                /* renamed from: a */
                public acb mo53672a() {
                    return acb.this;
                }
            };
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static aca m50513a(File file) throws FileNotFoundException {
        if (file != null) {
            return m50514a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static abz m50509a() {
        return new abz() {
            /* renamed from: a */
            public acb mo53674a() {
                return acb.f53608c;
            }

            /* renamed from: a_ */
            public void mo53675a_(abi abi, long j) throws IOException {
                abi.mo53900i(j);
            }

            public void close() throws IOException {
            }

            public void flush() throws IOException {
            }
        };
    }

    /* renamed from: a */
    public static boolean m50516a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
