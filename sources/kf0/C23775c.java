package kf0;

import cf0.C21136j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kf0.C23767b;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.p980io.FileWalkDirection;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: kf0.c */
public class C23775c extends C17885a {
    /* renamed from: Q0 */
    public static final boolean m58350Q0(File file) {
        FileWalkDirection fileWalkDirection = FileWalkDirection.BOTTOM_UP;
        C24362h.m61211f(fileWalkDirection, "direction");
        C23767b.C23769b bVar = new C23767b.C23769b();
        while (true) {
            boolean z = true;
            while (true) {
                if (!bVar.hasNext()) {
                    return z;
                }
                File file2 = (File) bVar.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: R0 */
    public static final File m58351R0(File file, File file2) {
        boolean z;
        C24362h.m61211f(file, "<this>");
        String path = file2.getPath();
        C24362h.m61210e(path, "path");
        boolean z2 = false;
        if (C17885a.m44430a0(path) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return file2;
        }
        String file3 = file.toString();
        C24362h.m61210e(file3, "this.toString()");
        if (file3.length() == 0) {
            z2 = true;
        }
        if (z2 || C24179b.m60560H(file3, File.separatorChar)) {
            return new File(C16530d.m42013f(file3, file2));
        }
        StringBuilder k = C13555b.m33972k(file3);
        k.append(File.separatorChar);
        k.append(file2);
        return new File(k.toString());
    }

    /* renamed from: S0 */
    public static final File m58352S0(File file, String str) {
        C24362h.m61211f(file, "<this>");
        return m58351R0(file, new File(str));
    }

    /* renamed from: T0 */
    public static final File m58353T0(File file, String str) {
        boolean z;
        List list;
        File file2;
        C24362h.m61211f(file, "<this>");
        C24362h.m61211f(str, "relative");
        File file3 = new File(str);
        String path = file.getPath();
        C24362h.m61210e(path, "path");
        int a0 = C17885a.m44430a0(path);
        String substring = path.substring(0, a0);
        C24362h.m61210e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = path.substring(a0);
        C24362h.m61210e(substring2, "this as java.lang.String).substring(startIndex)");
        if (substring2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = EmptyList.f60173b;
        } else {
            List<String> X = C24179b.m60576X(substring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(C21136j.m49436X(X, 10));
            for (String file4 : X) {
                arrayList.add(new File(file4));
            }
            list = arrayList;
        }
        File file5 = new File(substring);
        C24362h.m61211f(list, "segments");
        if (list.size() == 0) {
            file2 = new File("..");
        } else {
            int size = list.size() - 1;
            if (size < 0 || size > list.size()) {
                throw new IllegalArgumentException();
            }
            List subList = list.subList(0, size);
            String str2 = File.separator;
            C24362h.m61210e(str2, "separator");
            file2 = new File(C23825c.m58520q0(subList, str2, (String) null, (String) null, (C24236l) null, 62));
        }
        return m58351R0(m58351R0(file5, file2), file3);
    }
}
