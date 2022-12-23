package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import lf0.C24240p;

@Metadata(mo59059d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo59060d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "currentIndex", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
final class StringsKt__StringsKt$rangesDelimitedBy$2 extends Lambda implements C24240p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ List<String> $delimitersList;
    public final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$2(List<String> list, boolean z) {
        super(2);
        this.$delimitersList = list;
        this.$ignoreCase = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            mf0.C24362h.m61211f(r14, r0)
            java.util.List<java.lang.String> r0 = r13.$delimitersList
            boolean r7 = r13.$ignoreCase
            r1 = 0
            r8 = 0
            if (r7 != 0) goto L_0x0036
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = kotlin.collections.C23825c.m58490B0(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 4
            int r14 = kotlin.text.C24179b.m60565M(r14, r0, r15, r1, r2)
            if (r14 >= 0) goto L_0x002b
            goto L_0x00c2
        L_0x002b:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r0)
            goto L_0x00c3
        L_0x0036:
            rf0.h r2 = new rf0.h
            if (r15 >= 0) goto L_0x003b
            r15 = 0
        L_0x003b:
            int r1 = r14.length()
            r2.<init>(r15, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x0087
            int r9 = r2.f62729c
            int r10 = r2.f62730d
            if (r10 <= 0) goto L_0x004e
            if (r15 <= r9) goto L_0x0052
        L_0x004e:
            if (r10 >= 0) goto L_0x00c2
            if (r9 > r15) goto L_0x00c2
        L_0x0052:
            java.util.Iterator r11 = r0.iterator()
        L_0x0056:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r12 = r11.next()
            r4 = r12
            java.lang.String r4 = (java.lang.String) r4
            r1 = 0
            r5 = r14
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.length()
            r2 = r15
            r6 = r7
            boolean r1 = uh0.C25081h.m62832C(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0056
            goto L_0x0075
        L_0x0074:
            r12 = r8
        L_0x0075:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x0083
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r12)
            goto L_0x00c3
        L_0x0083:
            if (r15 == r9) goto L_0x00c2
            int r15 = r15 + r10
            goto L_0x0052
        L_0x0087:
            int r1 = r2.f62729c
            int r2 = r2.f62730d
            if (r2 <= 0) goto L_0x008f
            if (r15 <= r1) goto L_0x0093
        L_0x008f:
            if (r2 >= 0) goto L_0x00c2
            if (r1 > r15) goto L_0x00c2
        L_0x0093:
            java.util.Iterator r3 = r0.iterator()
        L_0x0097:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00af
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.length()
            boolean r5 = kotlin.text.C24179b.m60572T(r5, r14, r15, r6, r7)
            if (r5 == 0) goto L_0x0097
            goto L_0x00b0
        L_0x00af:
            r4 = r8
        L_0x00b0:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x00be
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r15 = new kotlin.Pair
            r15.<init>(r14, r4)
            goto L_0x00c3
        L_0x00be:
            if (r15 == r1) goto L_0x00c2
            int r15 = r15 + r2
            goto L_0x0093
        L_0x00c2:
            r15 = r8
        L_0x00c3:
            if (r15 == 0) goto L_0x00dc
            java.lang.Object r14 = r15.mo59068c()
            java.lang.Object r15 = r15.mo59069d()
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            kotlin.Pair r8 = new kotlin.Pair
            r8.<init>(r14, r15)
        L_0x00dc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.StringsKt__StringsKt$rangesDelimitedBy$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
