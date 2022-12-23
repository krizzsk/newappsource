package p213pb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p126ib.C5332a;
import p126ib.C5336d;
import p277ub.C6774a0;

/* renamed from: pb.g */
public final class C6118g implements C5336d {

    /* renamed from: b */
    public final C6115d f19466b;

    /* renamed from: c */
    public final long[] f19467c;

    /* renamed from: d */
    public final Map<String, C6117f> f19468d;

    /* renamed from: e */
    public final Map<String, C6116e> f19469e;

    /* renamed from: f */
    public final Map<String, String> f19470f;

    public C6118g(C6115d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f19466b = dVar;
        this.f19469e = hashMap2;
        this.f19470f = hashMap3;
        this.f19468d = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        dVar.mo22073d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f19467c = jArr;
    }

    /* renamed from: a */
    public final int mo21121a(long j) {
        int b = C6774a0.m15942b(this.f19467c, j, false);
        if (b < this.f19467c.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: b */
    public final List<C5332a> mo21122b(long j) {
        C6115d dVar = this.f19466b;
        Map<String, C6117f> map = this.f19468d;
        Map<String, C6116e> map2 = this.f19469e;
        Map<String, String> map3 = this.f19470f;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        dVar.mo22075g(j, dVar.f19431h, arrayList);
        TreeMap treeMap = new TreeMap();
        C6115d dVar2 = dVar;
        long j2 = j;
        dVar2.mo22077i(j2, false, dVar.f19431h, treeMap);
        dVar2.mo22076h(j2, map, map2, dVar.f19431h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C6116e eVar = map2.get(pair.first);
                eVar.getClass();
                C5332a.C5333a aVar = new C5332a.C5333a();
                aVar.f17607b = decodeByteArray;
                aVar.f17613h = eVar.f19438b;
                aVar.f17614i = 0;
                aVar.f17610e = eVar.f19439c;
                aVar.f17611f = 0;
                aVar.f17612g = eVar.f19441e;
                aVar.f17617l = eVar.f19442f;
                aVar.f17618m = eVar.f19443g;
                aVar.f17621p = eVar.f19446j;
                arrayList2.add(aVar.mo21116a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C6116e eVar2 = map2.get(entry.getKey());
            eVar2.getClass();
            C5332a.C5333a aVar2 = (C5332a.C5333a) entry.getValue();
            CharSequence charSequence = aVar2.f17606a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C6109a aVar3 : (C6109a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C6109a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar3), spannableStringBuilder.getSpanEnd(aVar3), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = eVar2.f19439c;
            int i9 = eVar2.f19440d;
            aVar2.f17610e = f;
            aVar2.f17611f = i9;
            aVar2.f17612g = eVar2.f19441e;
            aVar2.f17613h = eVar2.f19438b;
            aVar2.f17617l = eVar2.f19442f;
            float f2 = eVar2.f19445i;
            int i11 = eVar2.f19444h;
            aVar2.f17616k = f2;
            aVar2.f17615j = i11;
            aVar2.f17621p = eVar2.f19446j;
            arrayList2.add(aVar2.mo21116a());
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final long mo21123c(int i) {
        return this.f19467c[i];
    }

    /* renamed from: f */
    public final int mo21124f() {
        return this.f19467c.length;
    }
}
