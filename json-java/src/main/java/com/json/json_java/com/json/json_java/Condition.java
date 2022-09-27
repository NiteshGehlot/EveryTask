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
public class Condition {
	@JsonProperty(value = "type")
	private String type;
	@JsonProperty(value = "operator")
	private String operator;
	@JsonProperty(value = "value")
	private String value;
	

}
