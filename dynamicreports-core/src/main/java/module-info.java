
module dynamicreports {

    requires java.desktop;
    requires java.sql;
    requires org.apache.commons.lang3;
    requires jasperreports;
    requires jfreechart;
    requires java.xml.bind;

    exports net.sf.dynamicreports.design.base;
    exports net.sf.dynamicreports.design.constant;
    exports net.sf.dynamicreports.design.definition;
    exports net.sf.dynamicreports.design.exception;
    exports net.sf.dynamicreports.design.transformation;
    exports net.sf.dynamicreports.jasper.base;
    exports net.sf.dynamicreports.jasper.builder;
    exports net.sf.dynamicreports.jasper.constant;
    exports net.sf.dynamicreports.jasper.definition;
    exports net.sf.dynamicreports.jasper.exception;
    exports net.sf.dynamicreports.jasper.transformation;
    exports net.sf.dynamicreports.report.base;
    exports net.sf.dynamicreports.report;
    exports net.sf.dynamicreports.report.builder;
    exports net.sf.dynamicreports.report.component;
    exports net.sf.dynamicreports.report.constant;
    exports net.sf.dynamicreports.report.datasource;
    exports net.sf.dynamicreports.report.defaults;
    exports net.sf.dynamicreports.report.definition;
    exports net.sf.dynamicreports.report.exception;
}