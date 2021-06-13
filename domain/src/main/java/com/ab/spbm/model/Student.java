package com.ab.spbm.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter @Setter
public class Student {
    private int id;
    private String name;
    private String city;
}
