package p213pb;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import com.appboy.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p126ib.C5332a;

/* renamed from: pb.d */
public final class C6115d {

    /* renamed from: a */
    public final String f19424a;

    /* renamed from: b */
    public final String f19425b;

    /* renamed from: c */
    public final boolean f19426c;

    /* renamed from: d */
    public final long f19427d;

    /* renamed from: e */
    public final long f19428e;

    /* renamed from: f */
    public final C6117f f19429f;

    /* renamed from: g */
    public final String[] f19430g;

    /* renamed from: h */
    public final String f19431h;

    /* renamed from: i */
    public final String f19432i;

    /* renamed from: j */
    public final C6115d f19433j;

    /* renamed from: k */
    public final HashMap<String, Integer> f19434k;

    /* renamed from: l */
    public final HashMap<String, Integer> f19435l;

    /* renamed from: m */
    public ArrayList f19436m;

    public C6115d(String str, String str2, long j, long j2, C6117f fVar, String[] strArr, String str3, String str4, C6115d dVar) {
        boolean z;
        this.f19424a = str;
        this.f19425b = str2;
        this.f19432i = str4;
        this.f19429f = fVar;
        this.f19430g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f19426c = z;
        this.f19427d = j;
        this.f19428e = j2;
        str3.getClass();
        this.f19431h = str3;
        this.f19433j = dVar;
        this.f19434k = new HashMap<>();
        this.f19435l = new HashMap<>();
    }

    /* renamed from: a */
    public static C6115d m14660a(String str) {
        return new C6115d((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (C6117f) null, (String[]) null, "", (String) null, (C6115d) null);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m14661e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C5332a.C5333a aVar = new C5332a.C5333a();
            aVar.f17606a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((C5332a.C5333a) treeMap.get(str)).f17606a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final C6115d mo22071b(int i) {
        ArrayList arrayList = this.f19436m;
        if (arrayList != null) {
            return (C6115d) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int mo22072c() {
        ArrayList arrayList = this.f19436m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void mo22073d(TreeSet<Long> treeSet, boolean z) {
        boolean z2;
        boolean equals = Constants.APPBOY_PUSH_PRIORITY_KEY.equals(this.f19424a);
        boolean equals2 = "div".equals(this.f19424a);
        if (z || equals || (equals2 && this.f19432i != null)) {
            long j = this.f19427d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f19428e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f19436m != null) {
            for (int i = 0; i < this.f19436m.size(); i++) {
                C6115d dVar = (C6115d) this.f19436m.get(i);
                if (z || equals) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.mo22073d(treeSet, z2);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo22074f(long j) {
        long j2 = this.f19427d;
        return (j2 == -9223372036854775807L && this.f19428e == -9223372036854775807L) || (j2 <= j && this.f19428e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f19428e) || (j2 <= j && j < this.f19428e));
    }

    /* renamed from: g */
    public final void mo22075g(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.f19431h)) {
            str = this.f19431h;
        }
        if (!mo22074f(j) || !"div".equals(this.f19424a) || this.f19432i == null) {
            for (int i = 0; i < mo22072c(); i++) {
                mo22071b(i).mo22075g(j, str, arrayList);
            }
            return;
        }
        arrayList.add(new Pair(str, this.f19432i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0260 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22076h(long r19, java.util.Map r21, java.util.Map r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            r18 = this;
            r0 = r18
            r8 = r21
            boolean r1 = r18.mo22074f(r19)
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.String r1 = r0.f19431h
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0018
            r9 = r23
            goto L_0x001b
        L_0x0018:
            java.lang.String r1 = r0.f19431h
            r9 = r1
        L_0x001b:
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r0.f19435l
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0264
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f19434k
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x004c
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r0.f19434k
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x004d
        L_0x004c:
            r5 = 0
        L_0x004d:
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r5 == r2) goto L_0x025a
            r10 = r24
            java.lang.Object r4 = r10.get(r4)
            ib.a$a r4 = (p126ib.C5332a.C5333a) r4
            r4.getClass()
            r11 = r22
            java.lang.Object r6 = r11.get(r9)
            pb.e r6 = (p213pb.C6116e) r6
            r6.getClass()
            int r6 = r6.f19446j
            pb.f r7 = r0.f19429f
            java.lang.String[] r12 = r0.f19430g
            pb.f r7 = com.google.android.play.core.appupdate.C14226d.m35337D0(r7, r12, r8)
            java.lang.CharSequence r12 = r4.f17606a
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
            if (r12 != 0) goto L_0x0086
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>()
            r4.f17606a = r12
        L_0x0086:
            if (r7 == 0) goto L_0x025e
            pb.d r13 = r0.f19433j
            int r14 = r7.f19454h
            r3 = -1
            if (r14 != r3) goto L_0x0094
            int r15 = r7.f19455i
            if (r15 != r3) goto L_0x0094
            goto L_0x00a2
        L_0x0094:
            r15 = 1
            if (r14 != r15) goto L_0x0099
            r14 = 1
            goto L_0x009a
        L_0x0099:
            r14 = 0
        L_0x009a:
            int r3 = r7.f19455i
            if (r3 != r15) goto L_0x00a0
            r3 = 2
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r3 = r3 | r14
        L_0x00a2:
            r15 = -1
            if (r3 == r15) goto L_0x00ca
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            int r14 = r7.f19454h
            r17 = r1
            if (r14 != r15) goto L_0x00b3
            int r1 = r7.f19455i
            if (r1 != r15) goto L_0x00b3
            r1 = -1
            goto L_0x00c1
        L_0x00b3:
            r1 = 1
            if (r14 != r1) goto L_0x00b8
            r14 = 1
            goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            int r15 = r7.f19455i
            if (r15 != r1) goto L_0x00bf
            r1 = 2
            goto L_0x00c0
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            r1 = r1 | r14
        L_0x00c1:
            r3.<init>(r1)
            r1 = 33
            r12.setSpan(r3, r5, r2, r1)
            goto L_0x00ce
        L_0x00ca:
            r17 = r1
            r1 = 33
        L_0x00ce:
            int r3 = r7.f19452f
            r14 = 1
            if (r3 != r14) goto L_0x00d6
            r16 = 1
            goto L_0x00d8
        L_0x00d6:
            r16 = 0
        L_0x00d8:
            if (r16 == 0) goto L_0x00e2
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r1)
        L_0x00e2:
            int r3 = r7.f19453g
            if (r3 != r14) goto L_0x00e8
            r3 = 1
            goto L_0x00e9
        L_0x00e8:
            r3 = 0
        L_0x00e9:
            if (r3 == 0) goto L_0x00f3
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            r12.setSpan(r3, r5, r2, r1)
        L_0x00f3:
            boolean r1 = r7.f19449c
            if (r1 == 0) goto L_0x010e
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            boolean r3 = r7.f19449c
            if (r3 == 0) goto L_0x0106
            int r3 = r7.f19448b
            r1.<init>(r3)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
            goto L_0x010e
        L_0x0106:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Font color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x010e:
            boolean r1 = r7.f19451e
            if (r1 == 0) goto L_0x0129
            android.text.style.BackgroundColorSpan r1 = new android.text.style.BackgroundColorSpan
            boolean r3 = r7.f19451e
            if (r3 == 0) goto L_0x0121
            int r3 = r7.f19450d
            r1.<init>(r3)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
            goto L_0x0129
        L_0x0121:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Background color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x0129:
            java.lang.String r1 = r7.f19447a
            if (r1 == 0) goto L_0x0137
            android.text.style.TypefaceSpan r1 = new android.text.style.TypefaceSpan
            java.lang.String r3 = r7.f19447a
            r1.<init>(r3)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
        L_0x0137:
            pb.b r1 = r7.f19464r
            r3 = 3
            if (r1 == 0) goto L_0x015e
            int r14 = r1.f19405a
            r15 = -1
            if (r14 != r15) goto L_0x014e
            r15 = 2
            if (r6 == r15) goto L_0x014a
            r14 = 1
            if (r6 != r14) goto L_0x0148
            goto L_0x014a
        L_0x0148:
            r6 = 1
            goto L_0x014b
        L_0x014a:
            r6 = 3
        L_0x014b:
            r14 = r6
            r6 = 1
            goto L_0x0150
        L_0x014e:
            int r6 = r1.f19406b
        L_0x0150:
            int r1 = r1.f19407c
            r15 = -2
            if (r1 != r15) goto L_0x0156
            r1 = 1
        L_0x0156:
            mb.d r15 = new mb.d
            r15.<init>(r14, r6, r1)
            p584jl.C17885a.m44437f(r12, r15, r5, r2)
        L_0x015e:
            int r1 = r7.f19459m
            r6 = 2
            if (r1 == r6) goto L_0x0176
            if (r1 == r3) goto L_0x0169
            r6 = 4
            if (r1 == r6) goto L_0x0169
            goto L_0x01c9
        L_0x0169:
            pb.a r1 = new pb.a
            r1.<init>()
            r6 = 33
            r12.setSpan(r1, r5, r2, r6)
        L_0x0173:
            r6 = 0
            goto L_0x01f4
        L_0x0176:
            if (r13 == 0) goto L_0x018b
            pb.f r6 = r13.f19429f
            java.lang.String[] r14 = r13.f19430g
            pb.f r6 = com.google.android.play.core.appupdate.C14226d.m35337D0(r6, r14, r8)
            if (r6 == 0) goto L_0x0188
            int r6 = r6.f19459m
            r14 = 1
            if (r6 != r14) goto L_0x0188
            goto L_0x018c
        L_0x0188:
            pb.d r13 = r13.f19433j
            goto L_0x0176
        L_0x018b:
            r13 = 0
        L_0x018c:
            if (r13 != 0) goto L_0x018f
            goto L_0x01c9
        L_0x018f:
            java.util.ArrayDeque r6 = new java.util.ArrayDeque
            r6.<init>()
            r6.push(r13)
        L_0x0197:
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L_0x01c6
            java.lang.Object r14 = r6.pop()
            pb.d r14 = (p213pb.C6115d) r14
            pb.f r15 = r14.f19429f
            java.lang.String[] r1 = r14.f19430g
            pb.f r1 = com.google.android.play.core.appupdate.C14226d.m35337D0(r15, r1, r8)
            if (r1 == 0) goto L_0x01b3
            int r1 = r1.f19459m
            if (r1 != r3) goto L_0x01b3
            r1 = r14
            goto L_0x01c7
        L_0x01b3:
            int r1 = r14.mo22072c()
            r15 = -1
            int r1 = r1 + r15
        L_0x01b9:
            if (r1 < 0) goto L_0x0197
            pb.d r15 = r14.mo22071b(r1)
            r6.push(r15)
            int r1 = r1 + -1
            r15 = -1
            goto L_0x01b9
        L_0x01c6:
            r1 = 0
        L_0x01c7:
            if (r1 != 0) goto L_0x01ca
        L_0x01c9:
            goto L_0x0173
        L_0x01ca:
            int r6 = r1.mo22072c()
            r14 = 1
            if (r6 != r14) goto L_0x0173
            r6 = 0
            pb.d r14 = r1.mo22071b(r6)
            java.lang.String r14 = r14.f19425b
            if (r14 == 0) goto L_0x01f4
            pb.d r1 = r1.mo22071b(r6)
            java.lang.String r1 = r1.f19425b
            int r14 = p277ub.C6774a0.f20959a
            pb.f r13 = r13.f19429f
            if (r13 == 0) goto L_0x01e9
            int r13 = r13.f19460n
            goto L_0x01ea
        L_0x01e9:
            r13 = -1
        L_0x01ea:
            mb.c r14 = new mb.c
            r14.<init>(r1, r13)
            r1 = 33
            r12.setSpan(r14, r5, r2, r1)
        L_0x01f4:
            int r1 = r7.f19463q
            r13 = 1
            if (r1 != r13) goto L_0x01fa
            r6 = 1
        L_0x01fa:
            if (r6 == 0) goto L_0x0204
            mb.a r1 = new mb.a
            r1.<init>()
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
        L_0x0204:
            int r1 = r7.f19456j
            r6 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r13) goto L_0x0227
            r13 = 2
            if (r1 == r13) goto L_0x021c
            if (r1 == r3) goto L_0x0210
            goto L_0x0233
        L_0x0210:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r3 = r7.f19457k
            float r3 = r3 / r6
            r1.<init>(r3)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
            goto L_0x0233
        L_0x021c:
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r3 = r7.f19457k
            r1.<init>(r3)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
            goto L_0x0233
        L_0x0227:
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r3 = r7.f19457k
            int r3 = (int) r3
            r13 = 1
            r1.<init>(r3, r13)
            p584jl.C17885a.m44437f(r12, r1, r5, r2)
        L_0x0233:
            java.lang.String r1 = r0.f19424a
            java.lang.String r2 = "p"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0260
            float r1 = r7.f19465s
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x024d
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            float r1 = r1 / r6
            r4.f17622q = r1
        L_0x024d:
            android.text.Layout$Alignment r1 = r7.f19461o
            if (r1 == 0) goto L_0x0253
            r4.f17608c = r1
        L_0x0253:
            android.text.Layout$Alignment r1 = r7.f19462p
            if (r1 == 0) goto L_0x0260
            r4.f17609d = r1
            goto L_0x0260
        L_0x025a:
            r11 = r22
            r10 = r24
        L_0x025e:
            r17 = r1
        L_0x0260:
            r1 = r17
            goto L_0x0025
        L_0x0264:
            r11 = r22
            r10 = r24
            r6 = 0
            r12 = 0
        L_0x026a:
            int r1 = r18.mo22072c()
            if (r12 >= r1) goto L_0x0283
            pb.d r1 = r0.mo22071b(r12)
            r2 = r19
            r4 = r21
            r5 = r22
            r6 = r9
            r7 = r24
            r1.mo22076h(r2, r4, r5, r6, r7)
            int r12 = r12 + 1
            goto L_0x026a
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p213pb.C6115d.mo22076h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    /* renamed from: i */
    public final void mo22077i(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        this.f19434k.clear();
        this.f19435l.clear();
        if (!"metadata".equals(this.f19424a)) {
            if (!"".equals(this.f19431h)) {
                str = this.f19431h;
            }
            if (this.f19426c && z) {
                SpannableStringBuilder e = m14661e(str, treeMap);
                String str2 = this.f19425b;
                str2.getClass();
                e.append(str2);
            } else if ("br".equals(this.f19424a) && z) {
                m14661e(str, treeMap).append(10);
            } else if (mo22074f(j)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((C5332a.C5333a) entry.getValue()).f17606a;
                    charSequence.getClass();
                    this.f19434k.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = Constants.APPBOY_PUSH_PRIORITY_KEY.equals(this.f19424a);
                for (int i = 0; i < mo22072c(); i++) {
                    C6115d b = mo22071b(i);
                    if (z || equals) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b.mo22077i(j, z2, str, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e2 = m14661e(str, treeMap);
                    int length = e2.length();
                    do {
                        length--;
                        if (length < 0 || e2.charAt(length) != ' ') {
                            if (length >= 0 && e2.charAt(length) != 10) {
                                e2.append(10);
                            }
                        }
                        length--;
                        break;
                    } while (e2.charAt(length) != ' ');
                    e2.append(10);
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((C5332a.C5333a) entry2.getValue()).f17606a;
                    charSequence2.getClass();
                    this.f19435l.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
