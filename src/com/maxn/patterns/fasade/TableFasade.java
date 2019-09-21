package com.maxn.patterns.fasade;

public class TableFasade {

    private TableHeader tableHeader = new TableHeader();
    private TableRows tableRows = new TableRows();
    private TableFooter tableFooter = new TableFooter();

    public void setup() {
        tableHeader.setup();
        tableRows.setup();
        tableFooter.setup();
    }

}
