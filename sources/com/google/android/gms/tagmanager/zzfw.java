package com.google.android.gms.tagmanager;

import android.content.Context;
import com.appsflyer.ServerParameters;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ShowFirstParty
@VisibleForTesting
public final class zzfw extends zzft {
    private static final String zza = zza.UNIVERSAL_ANALYTICS.toString();
    private static final String zzb = zzb.ACCOUNT.toString();
    private static final String zzc = zzb.ANALYTICS_PASS_THROUGH.toString();
    private static final String zzd = zzb.ENABLE_ECOMMERCE.toString();
    private static final String zze = zzb.ECOMMERCE_USE_DATA_LAYER.toString();
    private static final String zzf = zzb.ECOMMERCE_MACRO_DATA.toString();
    private static final String zzg = zzb.ANALYTICS_FIELDS.toString();
    private static final String zzh = zzb.TRACK_TRANSACTION.toString();
    private static final String zzi = zzb.TRANSACTION_DATALAYER_MAP.toString();
    private static final String zzj = zzb.TRANSACTION_ITEM_DATALAYER_MAP.toString();
    private static final List<String> zzk = Arrays.asList(new String[]{ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, ProductAction.ACTION_PURCHASE, ProductAction.ACTION_REFUND});
    private static final Pattern zzl = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzm = Pattern.compile("metric(\\d+)");
    private static Map<String, String> zzn;
    private static Map<String, String> zzo;
    private final Set<String> zzp;
    private final zzfs zzq;
    private final DataLayer zzr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfw(Context context, DataLayer dataLayer) {
        super(zza, new String[0]);
        zzfs zzfs = new zzfs(context);
        this.zzr = dataLayer;
        this.zzq = zzfs;
        HashSet hashSet = new HashSet();
        this.zzp = hashSet;
        hashSet.add("");
        hashSet.add("0");
        hashSet.add("false");
    }

    private final String zzd(String str) {
        Object obj = this.zzr.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    private final Map<String, String> zzh(zzak zzak) {
        if (zzak == null) {
            return new HashMap();
        }
        Map<String, String> zzm2 = zzm(zzak);
        if (zzm2 == null) {
            return new HashMap();
        }
        String str = zzm2.get("&aip");
        if (str != null && this.zzp.contains(str.toLowerCase())) {
            zzm2.remove("&aip");
        }
        return zzm2;
    }

    private static final void zzi(Map<String, String> map, String str, String str2) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private static final boolean zzj(Map<String, zzak> map, String str) {
        zzak zzak = map.get(str);
        if (zzak == null) {
            return false;
        }
        return zzfv.zzg(zzfv.zzl(zzak)).booleanValue();
    }

    private static final Double zzk(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Double: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Double: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        } else {
            if (obj instanceof Double) {
                return (Double) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Double: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Double: ");
            }
            throw new RuntimeException(str);
        }
    }

    private static final Integer zzl(Object obj) {
        String str;
        String str2;
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Cannot convert the object to Integer: ".concat(valueOf);
                } else {
                    str2 = new String("Cannot convert the object to Integer: ");
                }
                throw new RuntimeException(str2);
            }
        } else if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        } else {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            String valueOf2 = String.valueOf(obj.toString());
            if (valueOf2.length() != 0) {
                str = "Cannot convert the object to Integer: ".concat(valueOf2);
            } else {
                str = new String("Cannot convert the object to Integer: ");
            }
            throw new RuntimeException(str);
        }
    }

    private static final Map<String, String> zzm(zzak zzak) {
        Object zzl2 = zzfv.zzl(zzak);
        if (!(zzl2 instanceof Map)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) zzl2).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static final Product zzn(Map<String, Object> map) {
        String str;
        String str2;
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(String.valueOf(obj));
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            product.setName(String.valueOf(obj2));
        }
        Object obj3 = map.get(ServerParameters.BRAND);
        if (obj3 != null) {
            product.setBrand(String.valueOf(obj3));
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(String.valueOf(obj4));
        }
        Object obj5 = map.get("variant");
        if (obj5 != null) {
            product.setVariant(String.valueOf(obj5));
        }
        Object obj6 = map.get("coupon");
        if (obj6 != null) {
            product.setCouponCode(String.valueOf(obj6));
        }
        Object obj7 = map.get("position");
        if (obj7 != null) {
            product.setPosition(zzl(obj7).intValue());
        }
        Object obj8 = map.get(InAppPurchaseMetaData.KEY_PRICE);
        if (obj8 != null) {
            product.setPrice(zzk(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(zzl(obj9).intValue());
        }
        for (String next : map.keySet()) {
            Matcher matcher = zzl.matcher(next);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(next)));
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(next);
                    if (valueOf.length() != 0) {
                        str2 = "illegal number in custom dimension value: ".concat(valueOf);
                    } else {
                        str2 = new String("illegal number in custom dimension value: ");
                    }
                    zzdh.zzc(str2);
                }
            } else {
                Matcher matcher2 = zzm.matcher(next);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zzl(map.get(next)).intValue());
                    } catch (NumberFormatException unused2) {
                        String valueOf2 = String.valueOf(next);
                        if (valueOf2.length() != 0) {
                            str = "illegal number in custom metric value: ".concat(valueOf2);
                        } else {
                            str = new String("illegal number in custom metric value: ");
                        }
                        zzdh.zzc(str);
                    }
                }
            }
        }
        return product;
    }

    public final /* bridge */ /* synthetic */ boolean zzb() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(java.util.Map<java.lang.String, com.google.android.gms.internal.gtm.zzak> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "actionField"
            java.lang.String r1 = "&t"
            com.google.android.gms.tagmanager.zzfs r2 = r13.zzq
            java.lang.String r3 = "_GTM_DEFAULT_TRACKER_"
            com.google.android.gms.analytics.Tracker r2 = r2.zza(r3)
            java.lang.String r3 = "collect_adid"
            boolean r3 = zzj(r14, r3)
            r2.enableAdvertisingIdCollection(r3)
            java.lang.String r3 = zzd
            boolean r3 = zzj(r14, r3)
            java.lang.String r4 = "name"
            java.lang.String r5 = "&cu"
            r6 = 0
            if (r3 == 0) goto L_0x02a2
            com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder r1 = new com.google.android.gms.analytics.HitBuilders$ScreenViewBuilder
            r1.<init>()
            java.lang.String r3 = zzg
            java.lang.Object r3 = r14.get(r3)
            com.google.android.gms.internal.gtm.zzak r3 = (com.google.android.gms.internal.gtm.zzak) r3
            java.util.Map r3 = r13.zzh(r3)
            r1.setAll(r3)
            java.lang.String r7 = zze
            boolean r7 = zzj(r14, r7)
            if (r7 == 0) goto L_0x004d
            com.google.android.gms.tagmanager.DataLayer r14 = r13.zzr
            java.lang.String r7 = "ecommerce"
            java.lang.Object r14 = r14.get(r7)
            boolean r7 = r14 instanceof java.util.Map
            if (r7 == 0) goto L_0x0060
            java.util.Map r14 = (java.util.Map) r14
            goto L_0x0061
        L_0x004d:
            java.lang.String r7 = zzf
            java.lang.Object r14 = r14.get(r7)
            com.google.android.gms.internal.gtm.zzak r14 = (com.google.android.gms.internal.gtm.zzak) r14
            java.lang.Object r14 = com.google.android.gms.tagmanager.zzfv.zzl(r14)
            boolean r7 = r14 instanceof java.util.Map
            if (r7 == 0) goto L_0x0060
            java.util.Map r14 = (java.util.Map) r14
            goto L_0x0061
        L_0x0060:
            r14 = r6
        L_0x0061:
            if (r14 == 0) goto L_0x029a
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0073
            java.lang.String r3 = "currencyCode"
            java.lang.Object r3 = r14.get(r3)
            java.lang.String r3 = (java.lang.String) r3
        L_0x0073:
            if (r3 == 0) goto L_0x0078
            r1.set(r5, r3)
        L_0x0078:
            java.lang.String r3 = "impressions"
            java.lang.Object r3 = r14.get(r3)
            boolean r5 = r3 instanceof java.util.List
            java.lang.String r7 = "Failed to extract a product from DataLayer. "
            java.lang.String r8 = "list"
            if (r5 == 0) goto L_0x00c3
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x008c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00c3
            java.lang.Object r5 = r3.next()
            java.util.Map r5 = (java.util.Map) r5
            com.google.android.gms.analytics.ecommerce.Product r9 = zzn(r5)     // Catch:{ RuntimeException -> 0x00a6 }
            java.lang.Object r5 = r5.get(r8)     // Catch:{ RuntimeException -> 0x00a6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RuntimeException -> 0x00a6 }
            r1.addImpression(r9, r5)     // Catch:{ RuntimeException -> 0x00a6 }
            goto L_0x008c
        L_0x00a6:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r9 = r5.length()
            if (r9 == 0) goto L_0x00ba
            java.lang.String r5 = r7.concat(r5)
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r7)
        L_0x00bf:
            com.google.android.gms.tagmanager.zzdh.zza(r5)
            goto L_0x008c
        L_0x00c3:
            java.lang.String r3 = "promoClick"
            boolean r5 = r14.containsKey(r3)
            java.lang.String r9 = "promotions"
            if (r5 == 0) goto L_0x00db
            java.lang.Object r5 = r14.get(r3)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r9)
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            goto L_0x00f0
        L_0x00db:
            java.lang.String r5 = "promoView"
            boolean r10 = r14.containsKey(r5)
            if (r10 == 0) goto L_0x00f0
            java.lang.Object r5 = r14.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r9)
            r6 = r5
            java.util.List r6 = (java.util.List) r6
        L_0x00f0:
            java.lang.String r5 = "id"
            if (r6 == 0) goto L_0x0171
            java.util.Iterator r6 = r6.iterator()
        L_0x00f8:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x015c
            java.lang.Object r9 = r6.next()
            java.util.Map r9 = (java.util.Map) r9
            com.google.android.gms.analytics.ecommerce.Promotion r10 = new com.google.android.gms.analytics.ecommerce.Promotion     // Catch:{ RuntimeException -> 0x013d }
            r10.<init>()     // Catch:{ RuntimeException -> 0x013d }
            java.lang.Object r11 = r9.get(r5)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ RuntimeException -> 0x013d }
            if (r11 == 0) goto L_0x0114
            r10.setId(r11)     // Catch:{ RuntimeException -> 0x013d }
        L_0x0114:
            java.lang.Object r11 = r9.get(r4)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ RuntimeException -> 0x013d }
            if (r11 == 0) goto L_0x011f
            r10.setName(r11)     // Catch:{ RuntimeException -> 0x013d }
        L_0x011f:
            java.lang.String r11 = "creative"
            java.lang.Object r11 = r9.get(r11)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ RuntimeException -> 0x013d }
            if (r11 == 0) goto L_0x012c
            r10.setCreative(r11)     // Catch:{ RuntimeException -> 0x013d }
        L_0x012c:
            java.lang.String r11 = "position"
            java.lang.Object r9 = r9.get(r11)     // Catch:{ RuntimeException -> 0x013d }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ RuntimeException -> 0x013d }
            if (r9 == 0) goto L_0x0139
            r10.setPosition(r9)     // Catch:{ RuntimeException -> 0x013d }
        L_0x0139:
            r1.addPromotion(r10)     // Catch:{ RuntimeException -> 0x013d }
            goto L_0x00f8
        L_0x013d:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "Failed to extract a promotion from DataLayer. "
            int r11 = r9.length()
            if (r11 == 0) goto L_0x0153
            java.lang.String r9 = r10.concat(r9)
            goto L_0x0158
        L_0x0153:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r10)
        L_0x0158:
            com.google.android.gms.tagmanager.zzdh.zza(r9)
            goto L_0x00f8
        L_0x015c:
            boolean r3 = r14.containsKey(r3)
            java.lang.String r4 = "&promoa"
            if (r3 == 0) goto L_0x016b
            java.lang.String r14 = "click"
            r1.set(r4, r14)
            goto L_0x029a
        L_0x016b:
            java.lang.String r3 = "view"
            r1.set(r4, r3)
        L_0x0171:
            java.util.List<java.lang.String> r3 = zzk
            java.util.Iterator r3 = r3.iterator()
        L_0x0177:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x029a
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r6 = r14.containsKey(r4)
            if (r6 == 0) goto L_0x0177
            java.lang.Object r14 = r14.get(r4)
            java.util.Map r14 = (java.util.Map) r14
            java.lang.String r3 = "products"
            java.lang.Object r3 = r14.get(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x01ce
            java.util.Iterator r3 = r3.iterator()
        L_0x019d:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01ce
            java.lang.Object r6 = r3.next()
            java.util.Map r6 = (java.util.Map) r6
            com.google.android.gms.analytics.ecommerce.Product r6 = zzn(r6)     // Catch:{ RuntimeException -> 0x01b1 }
            r1.addProduct(r6)     // Catch:{ RuntimeException -> 0x01b1 }
            goto L_0x019d
        L_0x01b1:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r6 = r7.concat(r6)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x01ca:
            com.google.android.gms.tagmanager.zzdh.zza(r6)
            goto L_0x019d
        L_0x01ce:
            boolean r3 = r14.containsKey(r0)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x0273
            java.lang.Object r14 = r14.get(r0)     // Catch:{ RuntimeException -> 0x027c }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ RuntimeException -> 0x027c }
            com.google.android.gms.analytics.ecommerce.ProductAction r0 = new com.google.android.gms.analytics.ecommerce.ProductAction     // Catch:{ RuntimeException -> 0x027c }
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x027c }
            java.lang.Object r3 = r14.get(r5)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x01ec
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionId(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x01ec:
            java.lang.String r3 = "affiliation"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x01fb
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionAffiliation(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x01fb:
            java.lang.String r3 = "coupon"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionCouponCode(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x020a:
            java.lang.Object r3 = r14.get(r8)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x0217
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x027c }
            r0.setProductActionList(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x0217:
            java.lang.String r3 = "option"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x0226
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x027c }
            r0.setCheckoutOptions(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x0226:
            java.lang.String r3 = "revenue"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x0239
            java.lang.Double r3 = zzk(r3)     // Catch:{ RuntimeException -> 0x027c }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionRevenue(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x0239:
            java.lang.String r3 = "tax"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x024c
            java.lang.Double r3 = zzk(r3)     // Catch:{ RuntimeException -> 0x027c }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionTax(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x024c:
            java.lang.String r3 = "shipping"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r3 == 0) goto L_0x025f
            java.lang.Double r3 = zzk(r3)     // Catch:{ RuntimeException -> 0x027c }
            double r3 = r3.doubleValue()     // Catch:{ RuntimeException -> 0x027c }
            r0.setTransactionShipping(r3)     // Catch:{ RuntimeException -> 0x027c }
        L_0x025f:
            java.lang.String r3 = "step"
            java.lang.Object r14 = r14.get(r3)     // Catch:{ RuntimeException -> 0x027c }
            if (r14 == 0) goto L_0x0278
            java.lang.Integer r14 = zzl(r14)     // Catch:{ RuntimeException -> 0x027c }
            int r14 = r14.intValue()     // Catch:{ RuntimeException -> 0x027c }
            r0.setCheckoutStep(r14)     // Catch:{ RuntimeException -> 0x027c }
            goto L_0x0278
        L_0x0273:
            com.google.android.gms.analytics.ecommerce.ProductAction r0 = new com.google.android.gms.analytics.ecommerce.ProductAction     // Catch:{ RuntimeException -> 0x027c }
            r0.<init>(r4)     // Catch:{ RuntimeException -> 0x027c }
        L_0x0278:
            r1.setProductAction(r0)     // Catch:{ RuntimeException -> 0x027c }
            goto L_0x029a
        L_0x027c:
            r14 = move-exception
            java.lang.String r14 = r14.getMessage()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "Failed to extract a product action from DataLayer. "
            int r3 = r14.length()
            if (r3 == 0) goto L_0x0292
            java.lang.String r14 = r0.concat(r14)
            goto L_0x0297
        L_0x0292:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
        L_0x0297:
            com.google.android.gms.tagmanager.zzdh.zza(r14)
        L_0x029a:
            java.util.Map r14 = r1.build()
            r2.send(r14)
            return
        L_0x02a2:
            java.lang.String r0 = zzc
            boolean r0 = zzj(r14, r0)
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = zzg
            java.lang.Object r14 = r14.get(r0)
            com.google.android.gms.internal.gtm.zzak r14 = (com.google.android.gms.internal.gtm.zzak) r14
            java.util.Map r14 = r13.zzh(r14)
            r2.send(r14)
            return
        L_0x02ba:
            java.lang.String r0 = zzh
            boolean r0 = zzj(r14, r0)
            if (r0 == 0) goto L_0x0451
            java.lang.String r0 = "transactionId"
            java.lang.String r3 = r13.zzd(r0)
            if (r3 != 0) goto L_0x02d1
            java.lang.String r14 = "Cannot find transactionId in data layer."
            com.google.android.gms.tagmanager.zzdh.zza(r14)
            return
        L_0x02d1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r8 = zzg     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r8 = r14.get(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            com.google.android.gms.internal.gtm.zzak r8 = (com.google.android.gms.internal.gtm.zzak) r8     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map r8 = r13.zzh(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = "transaction"
            r8.put(r1, r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = zzi     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r9 = r14.get(r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            com.google.android.gms.internal.gtm.zzak r9 = (com.google.android.gms.internal.gtm.zzak) r9     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r10 = "&ti"
            if (r9 == 0) goto L_0x02f9
            java.util.Map r0 = zzm(r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x032f
        L_0x02f9:
            java.util.Map<java.lang.String, java.lang.String> r9 = zzn     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r9 != 0) goto L_0x032d
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IllegalArgumentException -> 0x044a }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x044a }
            r9.put(r0, r10)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionAffiliation"
            java.lang.String r11 = "&ta"
            r9.put(r0, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionTax"
            java.lang.String r11 = "&tt"
            r9.put(r0, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionShipping"
            java.lang.String r11 = "&ts"
            r9.put(r0, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionTotal"
            java.lang.String r11 = "&tr"
            r9.put(r0, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionCurrency"
            r9.put(r0, r5)     // Catch:{ IllegalArgumentException -> 0x044a }
            zzn = r9     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x032d:
            java.util.Map<java.lang.String, java.lang.String> r0 = zzn     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x032f:
            java.util.Set r0 = r0.entrySet()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0337:
            boolean r9 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r9 == 0) goto L_0x0357
            java.lang.Object r9 = r0.next()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r11 = r9.getValue()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r9 = r9.getKey()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = r13.zzd(r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            zzi(r8, r11, r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x0337
        L_0x0357:
            r7.add(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            com.google.android.gms.tagmanager.DataLayer r0 = r13.zzr     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r8 = "transactionProducts"
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r0 != 0) goto L_0x0366
            goto L_0x038b
        L_0x0366:
            boolean r6 = r0 instanceof java.util.List     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r6 == 0) goto L_0x0441
            r6 = r0
            java.util.List r6 = (java.util.List) r6     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0371:
            boolean r8 = r6.hasNext()     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r8 == 0) goto L_0x0388
            java.lang.Object r8 = r6.next()     // Catch:{ IllegalArgumentException -> 0x044a }
            boolean r8 = r8 instanceof java.util.Map     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r8 == 0) goto L_0x0380
            goto L_0x0371
        L_0x0380:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "Each element of transactionProducts should be of type Map."
            r14.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x044a }
            throw r14     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0388:
            r6 = r0
            java.util.List r6 = (java.util.List) r6     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x038b:
            if (r6 == 0) goto L_0x042c
            java.util.Iterator r0 = r6.iterator()     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0391:
            boolean r6 = r0.hasNext()     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r6 == 0) goto L_0x042c
            java.lang.Object r6 = r0.next()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r8 = r6.get(r4)     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r8 != 0) goto L_0x03a9
            java.lang.String r14 = "Unable to send transaction item hit due to missing 'name' field."
            com.google.android.gms.tagmanager.zzdh.zza(r14)     // Catch:{ IllegalArgumentException -> 0x044a }
            return
        L_0x03a9:
            java.lang.String r8 = zzg     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r8 = r14.get(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            com.google.android.gms.internal.gtm.zzak r8 = (com.google.android.gms.internal.gtm.zzak) r8     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map r8 = r13.zzh(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = "item"
            r8.put(r1, r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            r8.put(r10, r3)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r9 = zzj     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r9 = r14.get(r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            com.google.android.gms.internal.gtm.zzak r9 = (com.google.android.gms.internal.gtm.zzak) r9     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r9 == 0) goto L_0x03cc
            java.util.Map r9 = zzm(r9)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x03ff
        L_0x03cc:
            java.util.Map<java.lang.String, java.lang.String> r9 = zzo     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r9 != 0) goto L_0x03fd
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IllegalArgumentException -> 0x044a }
            r9.<init>()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "&in"
            r9.put(r4, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "sku"
            java.lang.String r12 = "&ic"
            r9.put(r11, r12)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "category"
            java.lang.String r12 = "&iv"
            r9.put(r11, r12)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "price"
            java.lang.String r12 = "&ip"
            r9.put(r11, r12)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "quantity"
            java.lang.String r12 = "&iq"
            r9.put(r11, r12)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = "currency"
            r9.put(r11, r5)     // Catch:{ IllegalArgumentException -> 0x044a }
            zzo = r9     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x03fd:
            java.util.Map<java.lang.String, java.lang.String> r9 = zzo     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x03ff:
            java.util.Set r9 = r9.entrySet()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0407:
            boolean r11 = r9.hasNext()     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r11 == 0) goto L_0x0427
            java.lang.Object r11 = r9.next()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r12 = r11.getValue()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r11 = r11.getKey()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x044a }
            zzi(r8, r12, r11)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x0407
        L_0x0427:
            r7.add(r8)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x0391
        L_0x042c:
            java.util.Iterator r14 = r7.iterator()     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x0430:
            boolean r0 = r14.hasNext()     // Catch:{ IllegalArgumentException -> 0x044a }
            if (r0 == 0) goto L_0x0440
            java.lang.Object r0 = r14.next()     // Catch:{ IllegalArgumentException -> 0x044a }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IllegalArgumentException -> 0x044a }
            r2.send(r0)     // Catch:{ IllegalArgumentException -> 0x044a }
            goto L_0x0430
        L_0x0440:
            return
        L_0x0441:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x044a }
            java.lang.String r0 = "transactionProducts should be of type List."
            r14.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x044a }
            throw r14     // Catch:{ IllegalArgumentException -> 0x044a }
        L_0x044a:
            r14 = move-exception
            java.lang.String r0 = "Unable to send transaction"
            com.google.android.gms.tagmanager.zzdh.zzb(r0, r14)
            return
        L_0x0451:
            java.lang.String r14 = "Ignoring unknown tag."
            com.google.android.gms.tagmanager.zzdh.zzc(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.zzfw.zzc(java.util.Map):void");
    }
}
