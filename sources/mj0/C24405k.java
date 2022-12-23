package mj0;

/* renamed from: mj0.k */
public final class C24405k implements C24415u<Class> {
    /* renamed from: a */
    public final Object mo60538a(String str) throws Exception {
        Class cls;
        if (str.equals("byte")) {
            cls = Byte.TYPE;
        } else if (str.equals("short")) {
            cls = Short.TYPE;
        } else if (str.equals("int")) {
            cls = Integer.TYPE;
        } else if (str.equals("long")) {
            cls = Long.TYPE;
        } else if (str.equals("char")) {
            cls = Character.TYPE;
        } else if (str.equals("float")) {
            cls = Float.TYPE;
        } else if (str.equals("double")) {
            cls = Double.TYPE;
        } else if (str.equals("boolean")) {
            cls = Boolean.TYPE;
        } else if (str.equals("void")) {
            cls = Void.TYPE;
        } else {
            cls = null;
        }
        if (cls != null) {
            return cls;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            contextClassLoader = C24405k.class.getClassLoader();
        }
        return contextClassLoader.loadClass(str);
    }
}
