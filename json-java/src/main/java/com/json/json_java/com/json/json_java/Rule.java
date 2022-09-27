package com.json.json_java.com.json.json_java;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data              //getter - setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor         //
@ToString
public class Rule {
	@JsonProperty(value = "field_name")
	private String fieldName;
	@JsonProperty(value = "field_type")
	private String fieldType;
	@JsonProperty(value = "condition")
	private Condition condition;

}
