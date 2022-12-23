package ze0;

import java.io.PrintStream;
import javax.xml.stream.FactoryConfigurationError;

/* renamed from: ze0.a */
public final class C25346a {

    /* renamed from: a */
    public static boolean f63707a = false;

    /* renamed from: b */
    public static /* synthetic */ Class f63708b;

    /* renamed from: ze0.a$a */
    public static abstract class C25347a {
        /* renamed from: a */
        public abstract ClassLoader mo61932a();
    }

    static {
        try {
            f63707a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m63676a(String str) {
        if (f63707a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    /* renamed from: b */
    public static Object m63677b(ClassLoader classLoader, String str) throws FactoryConfigurationError {
        Class<?> cls;
        if (classLoader == null) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Provider ");
                stringBuffer.append(str);
                stringBuffer.append(" not found");
                throw new FactoryConfigurationError(stringBuffer.toString(), e);
            } catch (Exception e2) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Provider ");
                stringBuffer2.append(str);
                stringBuffer2.append(" could not be instantiated: ");
                stringBuffer2.append(e2);
                throw new FactoryConfigurationError(stringBuffer2.toString(), e2);
            }
        } else {
            cls = classLoader.loadClass(str);
        }
        return cls.newInstance();
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
