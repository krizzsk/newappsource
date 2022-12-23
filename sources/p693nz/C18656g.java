package p693nz;

import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import e00.C16761b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import mf0.C24361g;
import p693nz.C18656g.C18657a;
import p786rz.C19387a;
import p810sz.C19578d;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: nz.g */
public abstract class C18656g<K, V, M extends C18657a> extends C18652d<K, V> implements Comparator<String> {

    /* renamed from: b */
    public final File f47521b;

    /* renamed from: c */
    public final File f47522c;

    /* renamed from: d */
    public final C19589j<? extends V> f47523d;

    /* renamed from: e */
    public final C19600l<? super V> f47524e;

    /* renamed from: f */
    public final boolean f47525f;

    /* renamed from: g */
    public final C18658b<M> f47526g = new C18658b<>(this);

    /* renamed from: h */
    public boolean f47527h = false;

    /* renamed from: i */
    public long f47528i;

    /* renamed from: j */
    public long f47529j;

    /* renamed from: nz.g$b */
    public static class C18658b<M> extends C16761b<String, M> {

        /* renamed from: c */
        public final TreeSet<String> f47531c;

        public C18658b(C18656g gVar) {
            super(new HashMap());
            this.f47531c = new TreeSet<>(gVar);
        }

        /* renamed from: a */
        public final Object put(Object obj, String str) {
            boolean z;
            boolean remove = this.f47531c.remove(str);
            Object put = super.put(str, obj);
            if (put != null) {
                z = true;
            } else {
                z = false;
            }
            if (remove ^ z) {
                throw new ApplicationBugException("File names sync failure!");
            } else if (this.f47531c.add(str)) {
                return put;
            } else {
                throw new ApplicationBugException("File names tree already contain the specified file name!");
            }
        }

        public final void clear() {
            this.f47531c.clear();
            super.clear();
        }

        public final Set<Map.Entry<String, M>> entrySet() {
            return Collections.unmodifiableSet(super.entrySet());
        }

        public final Set<String> keySet() {
            return Collections.unmodifiableSet(super.keySet());
        }

        public final void putAll(Map<? extends String, ? extends M> map) {
            this.f47531c.removeAll(map.keySet());
            super.putAll(map);
            this.f47531c.addAll(map.keySet());
        }

        public final M remove(Object obj) {
            boolean z;
            boolean remove = this.f47531c.remove(obj);
            M remove2 = super.remove(obj);
            if (remove2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!(remove ^ z)) {
                return remove2;
            }
            throw new ApplicationBugException("File names sync failure!");
        }
    }

    public C18656g(File file, long j, boolean z, C19589j<? extends V> jVar, C19600l<? super V> lVar) {
        C21100e.m49373x(file, "directory");
        File absoluteFile = file.getAbsoluteFile();
        this.f47521b = absoluteFile;
        C21100e.m49373x(lVar, "writer");
        this.f47524e = lVar;
        C21100e.m49373x(jVar, "reader");
        this.f47523d = jVar;
        this.f47525f = z;
        this.f47522c = new File(absoluteFile, ".tm_cache_metadata");
        if (this.f47528i != j) {
            C21100e.m49367u(j, "maxSize");
            this.f47528i = j;
            if (this.f47527h) {
                mo39751o(j);
            }
        }
    }

    /* renamed from: b */
    public V mo51033b(K k) {
        BufferedInputStream bufferedInputStream;
        mo51038c();
        String j = mo39749j(k);
        if (!this.f47526g.containsKey(j)) {
            return null;
        }
        File i = mo51041i(j);
        try {
            if (!i.isFile()) {
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(i));
                V q = new C19578d(bufferedInputStream).mo51962q(this.f47523d);
                bufferedInputStream.close();
                return q;
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } catch (IOException unused) {
            remove(k);
            return null;
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo51038c() {
        if (!this.f47527h) {
            throw new IllegalStateException("Trying to use an uninitialized filesystem cache");
        }
    }

    public boolean clear() {
        mo51038c();
        this.f47526g.clear();
        return C19387a.m46676h(this.f47521b) & mo51039d();
    }

    /* renamed from: d */
    public final boolean mo51039d() {
        boolean z;
        if (this.f47525f) {
            try {
                mo51040e();
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo51040e() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.f47522c)));
        try {
            dataOutputStream.writeInt(this.f47526g.size());
            for (V a : this.f47526g.values()) {
                a.mo39757a(dataOutputStream);
            }
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public int compare(String str, String str2) {
        return str.compareTo(str2);
    }

    /* renamed from: g */
    public abstract M mo39746g(DataInputStream dataInputStream) throws IOException;

    /* renamed from: h */
    public abstract C18657a mo39748h(Object obj, String str, Object obj2);

    /* renamed from: i */
    public final File mo51041i(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || "|\\?*<\":>+[]/'.".indexOf(charAt) >= 0) {
                throw new IllegalArgumentException("Entry file names may not contain the character '" + charAt + "' (ASCII CODE " + charAt + ")");
            }
        }
        if (str.length() > 127) {
            throw new IllegalArgumentException("Entry file names may not contain more than 127 characters");
        } else if (!str.equals(".tm_cache_metadata")) {
            return new File(this.f47521b, str);
        } else {
            throw new IllegalArgumentException("Entry file names may not be \".tm_cache_metadata\"");
        }
    }

    /* renamed from: j */
    public String mo39749j(K k) {
        return String.valueOf(k);
    }

    /* renamed from: k */
    public abstract long mo23807k(K k, V v);

    /* renamed from: l */
    public final void mo51042l() throws IOException {
        DataInputStream dataInputStream;
        if (!this.f47527h) {
            if (!this.f47521b.exists()) {
                if (!this.f47521b.mkdirs()) {
                    StringBuilder k = C13555b.m33972k("Unable to create directory ");
                    k.append(this.f47521b);
                    throw new IOException(k.toString());
                }
            } else if (!this.f47521b.isDirectory()) {
                throw new IllegalArgumentException(this.f47521b + " already exists, but is not a directory");
            }
            int i = 0;
            if (!this.f47522c.exists()) {
                mo51040e();
            } else if (this.f47522c.isFile()) {
                try {
                    dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(this.f47522c)));
                    int readInt = dataInputStream.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i2 = 0; i2 < readInt; i2++) {
                        arrayList.add(mo39746g(dataInputStream));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C18657a aVar = (C18657a) it.next();
                        String str = aVar.f47530a;
                        if (mo51041i(str).isFile() && !mo39750m(aVar)) {
                            this.f47526g.put(aVar, str);
                        }
                    }
                    dataInputStream.close();
                } catch (IOException unused) {
                    this.f47526g.clear();
                    C19387a.m46676h(this.f47521b);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                StringBuilder k2 = C13555b.m33972k("Metadata file ");
                k2.append(this.f47522c);
                k2.append(" exists, but is not a regular file");
                throw new IOException(k2.toString());
            }
            if (this.f47521b.exists()) {
                File[] listFiles = this.f47521b.listFiles(new C18655f(this.f47526g.keySet()));
                if (!C24361g.m61154X(listFiles)) {
                    for (File file : listFiles) {
                        file.getName();
                        if (file.isDirectory()) {
                            C19387a.m46676h(file);
                        } else {
                            file.delete();
                        }
                    }
                }
            }
            for (String file2 : this.f47526g.keySet()) {
                i = (int) (new File(this.f47521b, file2).length() + ((long) i));
            }
            this.f47529j = (long) i;
            this.f47527h = true;
            mo39751o(this.f47528i);
            return;
        }
        throw new IllegalStateException("Trying to reinitialize a filesystem cache");
        throw th;
    }

    /* renamed from: m */
    public abstract boolean mo39750m(M m);

    /* renamed from: n */
    public final boolean mo51043n(String str) {
        File i = mo51041i(str);
        long length = i.length();
        boolean delete = i.delete();
        if (delete) {
            C21100e.m49371w(this.f47526g.remove(str));
            this.f47529j -= length;
        }
        return delete;
    }

    /* renamed from: o */
    public boolean mo39751o(long j) {
        String str;
        mo51038c();
        long j2 = this.f47529j;
        boolean z = true;
        if (j2 <= j) {
            return true;
        }
        boolean z2 = false;
        if (j2 <= 0) {
            Iterator it = new ArrayList(this.f47526g.keySet()).iterator();
            while (it.hasNext()) {
                z &= mo51043n((String) it.next());
            }
        } else {
            while (true) {
                if (this.f47529j <= j) {
                    break;
                }
                C18658b<M> bVar = this.f47526g;
                if (bVar.f47531c.isEmpty()) {
                    str = null;
                } else {
                    str = bVar.f47531c.first();
                }
                if (str != null) {
                    if (!mo51043n(str)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (this.f47529j > j) {
                z = false;
            }
        }
        z2 = z;
        return mo51039d() & z2;
    }

    public void onLowMemory() {
    }

    public final boolean remove(K k) {
        mo51038c();
        boolean n = mo51043n(mo39749j(k));
        if (n) {
            return mo51039d();
        }
        return n;
    }

    /* renamed from: nz.g$a */
    public static class C18657a {

        /* renamed from: a */
        public final String f47530a;

        public C18657a(DataInputStream dataInputStream) throws IOException {
            this.f47530a = dataInputStream.readUTF();
        }

        /* renamed from: a */
        public void mo39757a(DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeUTF(this.f47530a);
        }

        public C18657a(String str) {
            this.f47530a = str;
        }
    }
}
