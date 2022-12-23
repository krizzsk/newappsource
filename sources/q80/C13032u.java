package q80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: q80.u */
public final class C13032u extends C13780t<C13031t, C13032u, MVTicketMultiReceiptResponse> {
    public C13032u() {
        super(MVTicketMultiReceiptResponse.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.moovit.barcode.BarcodeFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r5v4, types: [m90.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v10, types: [com.moovit.barcode.BarcodeFormat] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.moovit.barcode.BarcodeFormat] */
    /* JADX WARNING: type inference failed for: r4v14, types: [com.moovit.barcode.BarcodeFormat] */
    /* JADX WARNING: type inference failed for: r7v12, types: [r90.a] */
    /* JADX WARNING: type inference failed for: r7v13, types: [q90.a] */
    /* JADX WARNING: type inference failed for: r7v14, types: [com.moovit.ticketing.validation.receipt.media.a] */
    /* JADX WARNING: type inference failed for: r7v15, types: [n90.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList m32945q(android.content.Context r17, java.util.List r18, java.util.List r19) {
        /*
            m90.c r0 = m90.C12892c.m32688r(r17)
            com.facebook.appevents.l r1 = new com.facebook.appevents.l
            r2 = 23
            r1.<init>(r2)
            a8.k r2 = c00.C13720d.f33796a
            r3 = r19
            java.util.HashMap r1 = c00.C13720d.m34274d(r3, r1, r2)
            java.util.Iterator r2 = r19.iterator()
        L_0x0017:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse r3 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse) r3
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions r3 = r3.cacheInstrunctions
            if (r0 == 0) goto L_0x0017
            if (r3 == 0) goto L_0x0017
            java.lang.String r3 = r3.flushCacheGroupKey
            if (r3 == 0) goto L_0x0017
            r0.mo39753p(r3)
            goto L_0x0017
        L_0x0031:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r18.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r18.iterator()
        L_0x003e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01cd
            java.lang.Object r4 = r3.next()
            com.moovit.ticketing.ticket.TicketId r4 = (com.moovit.ticketing.ticket.TicketId) r4
            java.lang.String r5 = r4.f23513d
            java.lang.Object r5 = r1.get(r5)
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse r5 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse) r5
            if (r5 != 0) goto L_0x0055
            goto L_0x003e
        L_0x0055:
            sz.r r6 = q80.C13036y.f32248a
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketCacheInstructions r6 = r5.cacheInstrunctions
            com.moovit.ticketing.ticket.TicketId r8 = new com.moovit.ticketing.ticket.TicketId
            com.moovit.network.model.ServerId r7 = r4.f23511b
            java.lang.String r9 = r4.f23512c
            java.lang.String r10 = r5.ticketId
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f23514e
            r8.<init>(r7, r9, r10, r4)
            r4 = 0
            if (r6 == 0) goto L_0x006d
            java.lang.String r7 = r6.cacheGroupKey
            r11 = r7
            goto L_0x006e
        L_0x006d:
            r11 = r4
        L_0x006e:
            if (r6 == 0) goto L_0x0073
            long r6 = r6.expirationTime
            goto L_0x0075
        L_0x0073:
            r6 = 0
        L_0x0075:
            r9 = r6
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt r5 = r5.receipt
            F r6 = r5.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.HTML
            r12 = 0
            r13 = 1
            if (r6 != r7) goto L_0x0082
            r14 = 1
            goto L_0x0083
        L_0x0082:
            r14 = 0
        L_0x0083:
            if (r14 == 0) goto L_0x00b2
            if (r6 != r7) goto L_0x0095
            java.lang.Object r4 = r5.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVHtmlTicketReceipt r4 = (com.tranzmate.moovit.protocol.ticketingV2.MVHtmlTicketReceipt) r4
            n90.a r5 = new n90.a
            java.lang.String r12 = r4.html
            r7 = r5
            r7.<init>(r8, r9, r11, r12)
            goto L_0x019c
        L_0x0095:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'html' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r5.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r2 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt.m28594l(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b2:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.MEDIA
            if (r6 != r7) goto L_0x00b8
            r14 = 1
            goto L_0x00b9
        L_0x00b8:
            r14 = 0
        L_0x00b9:
            if (r14 == 0) goto L_0x010d
            if (r6 != r7) goto L_0x00f0
            java.lang.Object r4 = r5.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt r4 = (com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceipt) r4
            zz.l0 r12 = new zz.l0
            long r5 = r4.validityStart
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r6 = r4.validityEnd
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r12.<init>(r5, r6)
            com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent r5 = r4.beforeValidityMedia
            com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent r13 = q80.C13036y.m32952d(r5)
            com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent r5 = r4.validityMedia
            com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent r14 = q80.C13036y.m32952d(r5)
            com.tranzmate.moovit.protocol.ticketingV2.MVMediaTicketReceiptContent r5 = r4.afterValidityMedia
            com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent r15 = q80.C13036y.m32952d(r5)
            boolean r4 = r4.showValidityTimer
            com.moovit.ticketing.validation.receipt.media.a r5 = new com.moovit.ticketing.validation.receipt.media.a
            r7 = r5
            r16 = r4
            r7.<init>(r8, r9, r11, r12, r13, r14, r15, r16)
            goto L_0x019c
        L_0x00f0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'media' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r5.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r2 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt.m28594l(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x010d:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.VISUAL_CODE
            if (r6 != r7) goto L_0x0113
            r14 = 1
            goto L_0x0114
        L_0x0113:
            r14 = 0
        L_0x0114:
            if (r14 == 0) goto L_0x0177
            if (r6 != r7) goto L_0x015a
            java.lang.Object r5 = r5.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt r5 = (com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeTicketReceipt) r5
            com.tranzmate.moovit.protocol.ticketingV2.MVVisualCodeFormat r6 = r5.format
            int[] r7 = q80.C13036y.C13037a.f32252d
            int r12 = r6.ordinal()
            r7 = r7[r12]
            if (r7 == r13) goto L_0x0150
            r4 = 2
            if (r7 == r4) goto L_0x014e
            r4 = 3
            if (r7 == r4) goto L_0x014b
            r4 = 4
            if (r7 != r4) goto L_0x0134
            com.moovit.barcode.BarcodeFormat r4 = com.moovit.barcode.BarcodeFormat.QR_CODE
            goto L_0x0150
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to decode format: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x014b:
            com.moovit.barcode.BarcodeFormat r4 = com.moovit.barcode.BarcodeFormat.CODE_128
            goto L_0x0150
        L_0x014e:
            com.moovit.barcode.BarcodeFormat r4 = com.moovit.barcode.BarcodeFormat.AZTEC
        L_0x0150:
            r12 = r4
            java.lang.String r13 = r5.data
            q90.a r5 = new q90.a
            r7 = r5
            r7.<init>(r8, r9, r11, r12, r13)
            goto L_0x019c
        L_0x015a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'visualCode' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r5.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r2 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt.m28594l(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0177:
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r7 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields.VDV
            if (r6 != r7) goto L_0x017c
            r12 = 1
        L_0x017c:
            if (r12 == 0) goto L_0x01c5
            if (r6 != r7) goto L_0x01a8
            java.lang.Object r5 = r5.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt r5 = (com.tranzmate.moovit.protocol.ticketingV2.MVVDVTicketReceipt) r5
            java.nio.ByteBuffer r6 = r5.data
            java.nio.ByteBuffer r6 = ui0.C25082a.m62850n(r6)
            r5.data = r6
            if (r6 != 0) goto L_0x018f
            goto L_0x0193
        L_0x018f:
            byte[] r4 = r6.array()
        L_0x0193:
            r13 = r4
            java.lang.String r12 = r5.orgId
            r90.a r5 = new r90.a
            r7 = r5
            r7.<init>(r8, r9, r11, r12, r13)
        L_0x019c:
            if (r0 == 0) goto L_0x01a3
            com.moovit.ticketing.ticket.TicketId r4 = r5.f31901a
            r0.put(r4, r5)
        L_0x01a3:
            r2.add(r5)
            goto L_0x003e
        L_0x01a8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'vdv' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r2 = r5.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt$_Fields r2 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt._Fields) r2
            vi0.c r2 = com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceipt.m28594l(r2)
            java.lang.String r2 = r2.f63355a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            com.moovit.commons.request.BadResponseException r0 = new com.moovit.commons.request.BadResponseException
            java.lang.String r1 = "Unsupported ticket receipt!"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C13032u.m32945q(android.content.Context, java.util.List, java.util.List):java.util.ArrayList");
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13031t tVar = (C13031t) aVar;
        m32945q(tVar.f51759b, tVar.f32242w, ((MVTicketMultiReceiptResponse) tBase).receipts);
    }
}
