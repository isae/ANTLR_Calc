package ru.ifmo.ctddev.isaev;

import jdk.internal.util.xml.impl.Input;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import ru.ifmo.ctddev.isaev.gen.GLexer;
import ru.ifmo.ctddev.isaev.gen.GParser;

import java.io.*;
import java.util.Map;

/**
 * Created by xottab on 5/4/15.
 */
public class Calculator {
    static InputStream in = System.in;//Reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {
            in = new FileInputStream(args[0]);
            ANTLRInputStream input = new ANTLRInputStream(in);
            GLexer lexer = new GLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GParser parser = new GParser(tokens);
            parser.file();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
