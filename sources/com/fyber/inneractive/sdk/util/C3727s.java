package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.util.s */
public class C3727s {
    /* renamed from: a */
    public static StringBuffer m9991a(InputStream inputStream, boolean z) throws IOException {
        ByteBuffer b = C3676d.f12833b.mo15347b();
        StringBuffer stringBuffer = new StringBuffer();
        C3676d.f12833b.getClass();
        byte[] array = (b == null || !b.hasArray()) ? new byte[8192] : b.array();
        int i = 0;
        while (i != -1) {
            stringBuffer.append(new String(array, 0, i));
            i = inputStream.read(array);
        }
        if (z) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
        C3676d.f12833b.f12834a.offer(b);
        return stringBuffer;
    }

    /* renamed from: b */
    public static void m9995b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m9994a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream != null) {
            byte[] bArr = new byte[SQLiteDatabase.OPEN_FULLMUTEX];
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                outputStream.write(bArr, 0, read);
            }
            IAlog.m9902a("Copied stream content length = %d", Integer.valueOf(i));
            if (i > 0) {
                return true;
            }
            return false;
        }
        throw new IOException("Unable to copy from or to a null stream.");
    }

    /* renamed from: a */
    public static String m9990a(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return "------\r\n" + stringWriter.toString() + "------\r\n";
        } catch (Exception unused) {
            return "bad stackToString";
        }
    }

    /* renamed from: a */
    public static void m9992a(View view) {
        if (view != null && view.getParent() != null) {
            try {
                if (view.getParent() instanceof ViewGroup) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m9988a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i3 = i;
        while (i3 >= 0 && i3 < i + i2 && i3 < stackTrace.length) {
            sb.append(stackTrace[i3].toString());
            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            i3++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static <T> T m9987a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: a */
    public static int m9986a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public static void m9993a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m9989a(Long l) {
        return l == null ? "" : String.valueOf(l);
    }
}
