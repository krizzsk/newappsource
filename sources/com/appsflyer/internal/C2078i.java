package com.appsflyer.internal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001a0.C0016g;

/* renamed from: com.appsflyer.internal.i */
public final class C2078i {

    /* renamed from: com.appsflyer.internal.i$a */
    public enum C2079a {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        
        public String values;

        private C2079a(String str) {
            this.values = str;
        }
    }

    /* renamed from: com.appsflyer.internal.i$c */
    public enum C2080c {
        UNKNOWN,
        ACCELEROMETER,
        MAGNETOMETER,
        RESERVED,
        GYROSCOPE
    }

    /* renamed from: com.appsflyer.internal.i$e */
    public enum C2081e {
        NONE,
        FIRST,
        ALL
    }

    private static List<BigDecimal> values(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(0)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(1)).toString())));
        arrayList2.add(BigDecimal.valueOf(Double.parseDouble(((Float) arrayList.get(2)).toString())));
        return arrayList2;
    }

    public final Map $$b(List<Map<String, Object>> list) {
        boolean z;
        boolean z2;
        C2081e eVar;
        C2081e eVar2;
        Object obj;
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        for (Map next : list) {
            HashMap hashMap2 = new HashMap();
            if (next.get("sVS") != null) {
                z = true;
            } else {
                z = false;
            }
            if (next.get("sVE") != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                eVar = C2081e.ALL;
            } else if (z) {
                eVar = C2081e.FIRST;
            } else {
                eVar = C2081e.NONE;
            }
            if (eVar == C2081e.NONE) {
                return C0016g.m37u("er", "na");
            }
            Integer num = (Integer) next.get("sT");
            String str = (String) next.get("sN");
            if (str != null) {
                hashMap2.put("n", str);
            } else {
                hashMap2.put("n", "uk");
            }
            C2080c cVar = C2080c.values()[num.intValue()];
            ArrayList arrayList2 = new ArrayList(values(next.get("sVS")));
            if (eVar == C2081e.ALL) {
                arrayList2.addAll(values(next.get("sVE")));
            }
            if (cVar == C2080c.MAGNETOMETER) {
                ArrayList arrayList3 = new ArrayList();
                C2081e eVar3 = eVar;
                BigDecimal valueOf = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                DecimalFormat decimalFormat = new DecimalFormat("##.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat.format(valueOf))));
                DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                arrayList3.add(Double.valueOf(Double.parseDouble(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                ArrayList arrayList4 = new ArrayList();
                if (arrayList2.size() > 5) {
                    obj = "er";
                    eVar2 = eVar3;
                    BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf);
                    DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                    decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat3.format(subtract))));
                    BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                    decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                    arrayList4.add(Double.valueOf(Double.parseDouble(decimalFormat4.format(subtract2))));
                } else {
                    obj = "er";
                    eVar2 = eVar3;
                }
                arrayList = new ArrayList();
                arrayList.add(arrayList3);
                arrayList.add(arrayList4);
            } else {
                eVar2 = eVar;
                obj = "er";
                ArrayList arrayList5 = new ArrayList();
                if (arrayList2.size() > 5) {
                    BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                    DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                    decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat5.format(subtract3))));
                    BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                    DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                    decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat6.format(subtract4))));
                    BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                    DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                    decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                    arrayList5.add(Double.valueOf(Double.parseDouble(decimalFormat7.format(subtract5))));
                }
                ArrayList arrayList6 = new ArrayList();
                DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                arrayList6.add(Double.valueOf(Double.parseDouble(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                ArrayList arrayList7 = new ArrayList();
                arrayList7.add(arrayList6);
                arrayList7.add(arrayList5);
                arrayList = arrayList7;
            }
            hashMap2.put("v", arrayList);
            hashMap.put(C2079a.values()[num.intValue()].values, hashMap2);
            if (eVar2 == C2081e.FIRST) {
                hashMap.put(obj, "no_svs");
            }
        }
        return hashMap;
    }
}
