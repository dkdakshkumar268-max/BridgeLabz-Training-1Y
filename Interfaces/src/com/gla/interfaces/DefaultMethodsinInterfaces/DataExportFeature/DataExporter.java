package com.gla.interfaces.DefaultMethodsinInterfaces.DataExportFeature;

public interface DataExporter {
    void exportCSV();
    void exportPDF();
    default void exportToJSON() {
        System.out.println("Exporting data in JSON format.");
    }
}