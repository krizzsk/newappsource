package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.Stack;
import p001a0.C0016g;
import p358af.C13437d;

public class XMLWriter {
    private static final String PROLOG = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
    private Stack<String> elementStack;
    private boolean rootElement;
    private final Writer writer;
    private final String xmlns;

    public XMLWriter(Writer writer2) {
        this(writer2, (String) null);
    }

    private void append(String str) {
        try {
            this.writer.append(str);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to write XML document", e);
        }
    }

    private String escapeXMLEntities(String str) {
        if (str.contains("&")) {
            str = str.replace("&quot;", "\"").replace("&apos;", "'").replace("&lt;", "<").replace("&gt;", ">").replace("&amp;", "&");
        }
        return str.replace("&", "&amp;").replace("\"", "&quot;").replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public XMLWriter endElement() {
        append(C13437d.m33706k("</", this.elementStack.pop(), ">"));
        return this;
    }

    public XMLWriter startElement(String str) {
        append(C25541a.m63881k("<", str));
        if (this.rootElement && this.xmlns != null) {
            append(C0016g.m31o(C13555b.m33972k(" xmlns=\""), this.xmlns, "\""));
            this.rootElement = false;
        }
        append(">");
        this.elementStack.push(str);
        return this;
    }

    public XMLWriter value(String str) {
        append(escapeXMLEntities(str));
        return this;
    }

    public XMLWriter(Writer writer2, String str) {
        this.elementStack = new Stack<>();
        this.rootElement = true;
        this.writer = writer2;
        this.xmlns = str;
        append(PROLOG);
    }

    public XMLWriter value(Date date) {
        append(escapeXMLEntities(StringUtils.fromDate(date)));
        return this;
    }

    public XMLWriter value(Object obj) {
        append(escapeXMLEntities(obj.toString()));
        return this;
    }
}
