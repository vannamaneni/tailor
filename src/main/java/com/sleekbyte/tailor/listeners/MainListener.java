package com.sleekbyte.tailor.listeners;

import com.sleekbyte.tailor.common.Messages;
import com.sleekbyte.tailor.output.Printer;
import com.sleekbyte.tailor.antlr.SwiftParser;
import com.sleekbyte.tailor.antlr.SwiftBaseListener;

public class MainListener extends SwiftBaseListener {

    private static MainListenerHelper listenerHelper;

    public MainListener(Printer printer) {
        listenerHelper = new MainListenerHelper(printer);
    }

    @Override
    public void enterClassName(SwiftParser.ClassNameContext ctx) {
        listenerHelper.verifyUpperCamelCase(Messages.CLASS_NAME + Messages.UPPER_CAMEL_CASE, ctx);
    }

    @Override
    public void enterEnumName(SwiftParser.EnumNameContext ctx) {
        listenerHelper.verifyUpperCamelCase(Messages.ENUM_NAME + Messages.UPPER_CAMEL_CASE, ctx);
    }

    @Override
    public void enterEnumCaseName(SwiftParser.EnumCaseNameContext ctx) {
        listenerHelper.verifyUpperCamelCase(Messages.ENUM_CASE_NAME + Messages.UPPER_CAMEL_CASE, ctx);
    }

    @Override
    public void enterStructName(SwiftParser.StructNameContext ctx) {
        listenerHelper.verifyUpperCamelCase(Messages.STRUCT_NAME + Messages.UPPER_CAMEL_CASE, ctx);
    }

    @Override
    public void enterProtocolName(SwiftParser.ProtocolNameContext ctx) {
        listenerHelper.verifyUpperCamelCase(Messages.PROTOCOL_NAME + Messages.UPPER_CAMEL_CASE, ctx);
    }

}
