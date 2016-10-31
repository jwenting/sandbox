package com.captainduckman.sandbox;

import com.captainduckman.sandbox.service.XsltConverter;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by JeroenWenting on 31-Oct-16.
 */
public class XsltConversion {

    public static void main(String... args) throws Exception {
        XsltConverter converter = new XsltConverter("testxml2txt.xsl");
        FileReader reader = new FileReader("test.xml");
        BufferedReader r = new BufferedReader(reader);
        StringBuilder builder = new StringBuilder();
        String s = r.readLine();
        while (s != null) {
            builder.append(s);
            s = r.readLine();
        }
        System.out.println(builder.toString());
        String result = converter.transform(builder.toString());
        System.out.println(result);
    }

}
