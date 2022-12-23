package p406cg;

import java.io.IOException;
import java.io.Writer;

/* renamed from: cg.k */
public final class C13822k {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        return p359ag.C13451h.f33305b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Exception) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0017 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0010 A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p359ag.C13450g m34498a(com.google.gson.stream.JsonReader r2) throws com.google.gson.JsonParseException {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0025, MalformedJsonException -> 0x001e, IOException -> 0x0017, NumberFormatException -> 0x0010 }
            r0 = 0
            dg.o$u r1 = p437dg.C16626o.f43316C     // Catch:{ EOFException -> 0x000e, MalformedJsonException -> 0x001e, IOException -> 0x0017, NumberFormatException -> 0x0010 }
            r1.getClass()     // Catch:{ EOFException -> 0x000e, MalformedJsonException -> 0x001e, IOException -> 0x0017, NumberFormatException -> 0x0010 }
            ag.g r2 = p437dg.C16626o.C16654u.m42215c(r2)     // Catch:{ EOFException -> 0x000e, MalformedJsonException -> 0x001e, IOException -> 0x0017, NumberFormatException -> 0x0010 }
            return r2
        L_0x000e:
            r2 = move-exception
            goto L_0x0027
        L_0x0010:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x0017:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x001e:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        L_0x0025:
            r2 = move-exception
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            ag.h r2 = p359ag.C13451h.f33305b
            return r2
        L_0x002c:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Exception) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p406cg.C13822k.m34498a(com.google.gson.stream.JsonReader):ag.g");
    }

    /* renamed from: cg.k$a */
    public static final class C13823a extends Writer {

        /* renamed from: b */
        public final Appendable f34017b;

        /* renamed from: c */
        public final C13824a f34018c = new C13824a();

        /* renamed from: cg.k$a$a */
        public static class C13824a implements CharSequence {

            /* renamed from: b */
            public char[] f34019b;

            public final char charAt(int i) {
                return this.f34019b[i];
            }

            public final int length() {
                return this.f34019b.length;
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f34019b, i, i2 - i);
            }
        }

        public C13823a(Appendable appendable) {
            this.f34017b = appendable;
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final void write(char[] cArr, int i, int i2) throws IOException {
            C13824a aVar = this.f34018c;
            aVar.f34019b = cArr;
            this.f34017b.append(aVar, i, i2 + i);
        }

        public final void write(int i) throws IOException {
            this.f34017b.append((char) i);
        }
    }
}
