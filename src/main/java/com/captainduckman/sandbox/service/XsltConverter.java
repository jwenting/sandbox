package com.captainduckman.sandbox.service;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by JeroenWenting on 31-Oct-16.
 */
public class XsltConverter {

    private Transformer transformer;

    public XsltConverter(final String stylesheet) {
        StreamSource stylesource = new StreamSource(stylesheet);
        TransformerFactory factory = TransformerFactory.newInstance();
        try {
            transformer = factory.newTransformer(stylesource);
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        }
    }

    public String transform(final String xml) {
        StringReader reader = new StringReader(xml);
        Source input = new StreamSource(reader);
        StringWriter writer = new StringWriter();
        Result output = new StreamResult(writer);
        String result = null;
        try {
            transformer.transform(input, output);
            writer.flush();
            result = writer.toString();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
        return result;
    }
}
