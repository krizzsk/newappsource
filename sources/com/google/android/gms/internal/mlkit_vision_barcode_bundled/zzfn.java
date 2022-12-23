package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p001a0.C0016g;

final class zzfn {
    public static String zza(zzfl zzfl, String str) {
        StringBuilder t = C0016g.m36t("# ", str);
        zzd(zzfl, t, 0);
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
                sb.append(zzgn.zza(zzdb.zzs((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzdb) {
                sb.append(": \"");
                sb.append(zzgn.zza((zzdb) obj));
                sb.append('\"');
            } else if (obj instanceof zzec) {
                sb.append(" {");
                zzd((zzec) obj, sb, i + 2);
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
                sb.append(obj.toString());
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

    private static void zzd(zzfl zzfl, StringBuilder sb, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        String str7;
        String str8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzfl.getClass().getDeclaredMethods()) {
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
            String str9 = (String) it.next();
            if (str9.startsWith("get")) {
                str = str9.substring(3);
            } else {
                str = str9;
            }
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String g = C25541a.m63877g(str, 0, 1);
                String valueOf = String.valueOf(str.substring(1, str.length() - 4));
                if (valueOf.length() != 0) {
                    str8 = g.concat(valueOf);
                } else {
                    str8 = new String(g);
                }
                Method method2 = (Method) hashMap.get(str9);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i, zzc(str8), zzec.zzQ(method2, zzfl, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String g2 = C25541a.m63877g(str, 0, 1);
                String valueOf2 = String.valueOf(str.substring(1, str.length() - 3));
                if (valueOf2.length() != 0) {
                    str7 = g2.concat(valueOf2);
                } else {
                    str7 = new String(g2);
                }
                Method method3 = (Method) hashMap.get(str9);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i, zzc(str7), zzec.zzQ(method3, zzfl, new Object[0]));
                }
            }
            if (str.length() != 0) {
                str2 = "set".concat(str);
            } else {
                str2 = new String("set");
            }
            if (((Method) hashMap2.get(str2)) != null) {
                if (str.endsWith("Bytes")) {
                    String valueOf3 = String.valueOf(str.substring(0, str.length() - 5));
                    if (valueOf3.length() != 0) {
                        str6 = "get".concat(valueOf3);
                    } else {
                        str6 = new String("get");
                    }
                    if (hashMap.containsKey(str6)) {
                    }
                }
                String g3 = C25541a.m63877g(str, 0, 1);
                String valueOf4 = String.valueOf(str.substring(1));
                if (valueOf4.length() != 0) {
                    str3 = g3.concat(valueOf4);
                } else {
                    str3 = new String(g3);
                }
                if (str.length() != 0) {
                    str4 = "get".concat(str);
                } else {
                    str4 = new String("get");
                }
                Method method4 = (Method) hashMap.get(str4);
                if (str.length() != 0) {
                    str5 = "has".concat(str);
                } else {
                    str5 = new String("has");
                }
                Method method5 = (Method) hashMap.get(str5);
                if (method4 != null) {
                    Object zzQ = zzec.zzQ(method4, zzfl, new Object[0]);
                    if (method5 == null) {
                        if (zzQ instanceof Boolean) {
                            if (!((Boolean) zzQ).booleanValue()) {
                            }
                        } else if (zzQ instanceof Integer) {
                            if (((Integer) zzQ).intValue() == 0) {
                            }
                        } else if (zzQ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzQ).floatValue()) == 0) {
                            }
                        } else if (!(zzQ instanceof Double)) {
                            if (zzQ instanceof String) {
                                z = zzQ.equals("");
                            } else if (zzQ instanceof zzdb) {
                                z = zzQ.equals(zzdb.zzb);
                            } else if (zzQ instanceof zzfl) {
                                if (zzQ == ((zzfl) zzQ).zzX()) {
                                }
                            } else if ((zzQ instanceof Enum) && ((Enum) zzQ).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzQ).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzec.zzQ(method5, zzfl, new Object[0])).booleanValue()) {
                    }
                    zzb(sb, i, zzc(str3), zzQ);
                }
            }
        }
        if (zzfl instanceof zzdy) {
            Iterator zzf = ((zzdy) zzfl).zza.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry = (Map.Entry) zzf.next();
                zzb(sb, i, C13715c.m34242h(13, "[", ((zzdz) entry.getKey()).zza, "]"), entry.getValue());
            }
        }
        zzgq zzgq = ((zzec) zzfl).zzc;
        if (zzgq != null) {
            zzgq.zzg(sb, i);
        }
    }
}
