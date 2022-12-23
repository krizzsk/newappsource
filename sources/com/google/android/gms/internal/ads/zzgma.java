package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p001a0.C0016g;

final class zzgma {
    public static String zza(zzgly zzgly, String str) {
        StringBuilder t = C0016g.m36t("# ", str);
        zzd(zzgly, t, 0);
        return t.toString();
    }

    public static final void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i, str, zzb2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgng.zza(zzgjg.zzx((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgjg) {
                sb.append(": \"");
                sb.append(zzgng.zza((zzgjg) obj));
                sb.append('\"');
            } else if (obj instanceof zzgko) {
                sb.append(" {");
                zzd((zzgko) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                zzb(sb, i4, LinksConfiguration.KEY_KEY, entry.getKey());
                zzb(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzgly zzgly, StringBuilder sb, int i) {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzgly.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String concat = C25541a.m63877g(str, 0, 1).concat(String.valueOf(str.substring(1, str.length() - 4)));
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(concat), zzgko.zzaL(method2, zzgly, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = C25541a.m63877g(str, 0, 1).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzgko.zzaL(method3, zzgly, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = C25541a.m63877g(str, 0, 1).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object zzaL = zzgko.zzaL(method4, zzgly, new Object[0]);
                    if (method5 == null) {
                        if (zzaL instanceof Boolean) {
                            if (!((Boolean) zzaL).booleanValue()) {
                            }
                        } else if (zzaL instanceof Integer) {
                            if (((Integer) zzaL).intValue() == 0) {
                            }
                        } else if (zzaL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaL).floatValue()) == 0) {
                            }
                        } else if (!(zzaL instanceof Double)) {
                            if (zzaL instanceof String) {
                                z = zzaL.equals("");
                            } else if (zzaL instanceof zzgjg) {
                                z = zzaL.equals(zzgjg.zzb);
                            } else if (zzaL instanceof zzgly) {
                                if (zzaL == ((zzgly) zzaL).zzbh()) {
                                }
                            } else if ((zzaL instanceof Enum) && ((Enum) zzaL).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaL).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgko.zzaL(method5, zzgly, new Object[0])).booleanValue()) {
                    }
                    zzb(sb, i, zzc(concat3), zzaL);
                }
            }
        }
        if (!(zzgly instanceof zzgkl)) {
            zzgnj zzgnj = ((zzgko) zzgly).zzc;
            if (zzgnj != null) {
                zzgnj.zzg(sb, i);
                return;
            }
            return;
        }
        zzgkl zzgkl = (zzgkl) zzgly;
        throw null;
    }
}
