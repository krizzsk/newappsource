package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p434dd.C16542a0;

/* renamed from: com.google.android.play.core.assetpacks.d0 */
public final class C14255d0 extends C16542a0 {

    /* renamed from: b */
    public final TreeMap f35821b = new TreeMap();

    public C14255d0(File file, File file2) throws IOException {
        ArrayList a = C14297n2.m35571a(file, file2);
        if (!a.isEmpty()) {
            Iterator it = a.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.f35821b.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new zzck(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    public final void close() {
    }

    /* renamed from: e */
    public final long mo42808e() {
        Map.Entry lastEntry = this.f35821b.lastEntry();
        return ((File) lastEntry.getValue()).length() + ((Long) lastEntry.getKey()).longValue();
    }

    /* renamed from: f */
    public final InputStream mo42809f(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new zzck(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo42808e()) {
            Long l = (Long) this.f35821b.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.f35821b.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new C14251c0(mo42810g(j, l), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo42810g(j, l));
            Collection values = this.f35821b.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C14312r1(Collections.enumeration(values)));
            }
            arrayList.add(new C14251c0(new FileInputStream((File) this.f35821b.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo42808e()), Long.valueOf(j3)}));
    }

    /* renamed from: g */
    public final FileInputStream mo42810g(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f35821b.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }
}
