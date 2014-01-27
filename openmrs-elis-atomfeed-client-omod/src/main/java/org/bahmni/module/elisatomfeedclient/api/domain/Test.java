package org.bahmni.module.elisatomfeedclient.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Test {
    String id;
    String name;
    String description;
    String shortName;
    String resultType;
    Sample sample;
    Department department;
}
