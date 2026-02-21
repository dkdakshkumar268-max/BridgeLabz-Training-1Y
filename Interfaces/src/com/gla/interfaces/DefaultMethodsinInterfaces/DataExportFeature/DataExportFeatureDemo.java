package com.gla.interfaces.DefaultMethodsinInterfaces.DataExportFeature;
public class DataExportFeatureDemo {
    public static void main(String[] args) {
        DataExporter exporter = new ReportExporter();
        exporter.exportCSV();
        exporter.exportPDF();
        exporter.exportToJSON();
    }
}