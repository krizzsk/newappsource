package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p025b6.C1487b;

public final class GlideException extends Exception {

    /* renamed from: b */
    public static final StackTraceElement[] f7022b = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private C1487b key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    public static void m5638a(Throwable th, ArrayList arrayList) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).causes) {
                m5638a(a, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    /* renamed from: b */
    public static void m5639b(List list, C2165a aVar) {
        try {
            m5640c(list, aVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m5640c(List list, C2165a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append((CharSequence) "Cause (");
            int i2 = i + 1;
            aVar.append((CharSequence) String.valueOf(i2));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).mo10940e(aVar);
            } else {
                m5641d(th, aVar);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m5641d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: e */
    public final void mo10940e(Appendable appendable) {
        m5641d(this, appendable);
        m5639b(this.causes, new C2165a(appendable));
    }

    /* renamed from: f */
    public final void mo10941f(C1487b bVar, DataSource dataSource2, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public final Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public final void mo10943g(RuntimeException runtimeException) {
        this.exception = runtimeException;
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            StringBuilder k = C13555b.m33972k(", ");
            k.append(this.dataClass);
            str = k.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            StringBuilder k2 = C13555b.m33972k(", ");
            k2.append(this.dataSource);
            str2 = k2.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            StringBuilder k3 = C13555b.m33972k(", ");
            k3.append(this.key);
            str3 = k3.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        m5638a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public final void printStackTrace() {
        mo10940e(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f7022b);
        this.causes = list;
    }

    public final void printStackTrace(PrintStream printStream) {
        mo10940e(printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        mo10940e(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C2165a implements Appendable {

        /* renamed from: b */
        public final Appendable f7023b;

        /* renamed from: c */
        public boolean f7024c = true;

        public C2165a(Appendable appendable) {
            this.f7023b = appendable;
        }

        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f7024c) {
                this.f7024c = false;
                this.f7023b.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f7024c = z;
            this.f7023b.append(c);
            return this;
        }

        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f7024c) {
                this.f7024c = false;
                this.f7023b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f7024c = z;
            this.f7023b.append(charSequence, i, i2);
            return this;
        }
    }
}
