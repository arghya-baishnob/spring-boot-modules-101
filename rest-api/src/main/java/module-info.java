module spbm.rest {
    requires spring.web;
    requires spring.beans;

    requires spbm.domain;
    requires spbm.persistance;

    exports com.ab.spbm.rest;
}