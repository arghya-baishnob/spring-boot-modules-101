module spbm.persistance {
    requires spring.context;
    requires static lombok;
    requires org.slf4j;

    requires spbm.domain;

    exports com.ab.spbm.repo;
}