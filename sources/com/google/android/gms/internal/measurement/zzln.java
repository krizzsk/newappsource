package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p001a0.C0016g;

final class zzln {
    public static String zza(zzll zzll, String str) {
        StringBuilder t = C0016g.m36t("# ", str);
        zzd(zzll, t, 0);
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
                sb.append(zzml.zza(zzjd.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzjd) {
                sb.append(": \"");
                sb.append(zzml.zza((zzjd) obj));
                sb.append('\"');
            } else if (obj instanceof zzke) {
                sb.append(" {");
                zzd((zzke) obj, sb, i + 2);
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

    private static void zzd(zzll zzll, StringBuilder sb, int i) {
        String str;
        boolean z;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzll.getClass().getDeclaredMethods()) {
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
                    zzb(sb, i, zzc(concat), zzke.zzbH(method2, zzll, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String concat2 = C25541a.m63877g(str, 0, 1).concat(String.valueOf(str.substring(1, str.length() - 3)));
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(concat2), zzke.zzbH(method3, zzll, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(str.substring(0, str.length() - 5)))))) {
                String concat3 = C25541a.m63877g(str, 0, 1).concat(String.valueOf(str.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object zzbH = zzke.zzbH(method4, zzll, new Object[0]);
                    if (method5 == null) {
                        if (zzbH instanceof Boolean) {
                            if (!((Boolean) zzbH).booleanValue()) {
                            }
                        } else if (zzbH instanceof Integer) {
                            if (((Integer) zzbH).intValue() == 0) {
                            }
                        } else if (zzbH instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbH).floatValue()) == 0) {
                            }
                        } else if (!(zzbH instanceof Double)) {
                            if (zzbH instanceof String) {
                                z = zzbH.equals("");
                            } else if (zzbH instanceof zzjd) {
                                z = zzbH.equals(zzjd.zzb);
                            } else if (zzbH instanceof zzll) {
                                if (zzbH == ((zzll) zzbH).zzbO()) {
                                }
                            } else if ((zzbH instanceof Enum) && ((Enum) zzbH).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzbH).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzke.zzbH(method5, zzll, new Object[0])).booleanValue()) {
                    }
                    zzb(sb, i, zzc(concat3), zzbH);
                }
            }
        }
        if (!(zzll instanceof zzkb)) {
            zzmo zzmo = ((zzke) zzll).zzc;
            if (zzmo != null) {
                zzmo.zzg(sb, i);
                return;
            }
            return;
        }
        zzkb zzkb = (zzkb) zzll;
        throw null;
    }
}
