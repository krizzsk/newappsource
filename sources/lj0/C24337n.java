package lj0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Properties;
import javax.xml.stream.FactoryConfigurationError;
import org.simpleframework.xml.stream.StreamReader;
import ze0.C25346a;
import ze0.C25350d;

/* renamed from: lj0.n */
public final class C24337n implements C24335l {

    /* renamed from: a */
    public final C25350d f61636a;

    public C24337n() {
        ClassLoader classLoader;
        Object obj;
        InputStream inputStream;
        boolean z = C25346a.f63707a;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            Class cls = C25346a.f63708b;
            if (cls == null) {
                cls = C25346a.class$("javax.xml.stream.FactoryFinder");
                C25346a.f63708b = cls;
            }
            stringBuffer.append(cls.getName());
            stringBuffer.append("$ClassLoaderFinderConcrete");
            classLoader = ((C25346a.C25347a) Class.forName(stringBuffer.toString()).newInstance()).mo61932a();
        } catch (LinkageError unused) {
            Class cls2 = C25346a.f63708b;
            if (cls2 == null) {
                cls2 = C25346a.class$("javax.xml.stream.FactoryFinder");
                C25346a.f63708b = cls2;
            }
            classLoader = cls2.getClassLoader();
        } catch (ClassNotFoundException unused2) {
            Class cls3 = C25346a.f63708b;
            if (cls3 == null) {
                cls3 = C25346a.class$("javax.xml.stream.FactoryFinder");
                C25346a.f63708b = cls3;
            }
            classLoader = cls3.getClassLoader();
        } catch (Exception e) {
            throw new FactoryConfigurationError(e.toString(), e);
        }
        try {
            String property = System.getProperty("javax.xml.stream.XMLInputFactory");
            if (property != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("found system property");
                stringBuffer2.append(property);
                C25346a.m63676a(stringBuffer2.toString());
                obj = C25346a.m63677b(classLoader, property);
                this.f61636a = (C25350d) obj;
            }
        } catch (SecurityException unused3) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(property2);
            String str = File.separator;
            stringBuffer3.append(str);
            stringBuffer3.append("lib");
            stringBuffer3.append(str);
            stringBuffer3.append("jaxp.properties");
            File file = new File(stringBuffer3.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty("javax.xml.stream.XMLInputFactory");
                if (property3 != null && property3.length() > 0) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("found java.home property ");
                    stringBuffer4.append(property3);
                    C25346a.m63676a(stringBuffer4.toString());
                    obj = C25346a.m63677b(classLoader, property3);
                    this.f61636a = (C25350d) obj;
                }
            }
        } catch (Exception e2) {
            if (C25346a.f63707a) {
                e2.printStackTrace();
            }
        }
        if (classLoader == null) {
            try {
                inputStream = ClassLoader.getSystemResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory");
            } catch (Exception e3) {
                if (C25346a.f63707a) {
                    e3.printStackTrace();
                }
            }
        } else {
            inputStream = classLoader.getResourceAsStream("META-INF/services/javax.xml.stream.XMLInputFactory");
        }
        if (inputStream != null) {
            C25346a.m63676a("found META-INF/services/javax.xml.stream.XMLInputFactory");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null && !"".equals(readLine)) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("loaded from services: ");
                stringBuffer5.append(readLine);
                C25346a.m63676a(stringBuffer5.toString());
                obj = C25346a.m63677b(classLoader, readLine);
                this.f61636a = (C25350d) obj;
            }
        }
        C25346a.m63676a("loaded from fallback value: com.bea.xml.stream.MXParserFactory");
        obj = C25346a.m63677b(classLoader, "com.bea.xml.stream.MXParserFactory");
        this.f61636a = (C25350d) obj;
    }

    /* renamed from: a */
    public final C24328e mo60474a(StringReader stringReader) throws Exception {
        return new StreamReader(this.f61636a.mo61935a());
    }
}
