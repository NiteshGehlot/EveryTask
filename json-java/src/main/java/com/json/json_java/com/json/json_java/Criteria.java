package com.json.json_java.com.json.json_java;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data              //getter - setter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor         //
@ToString
public class Criteria {
	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "rules")
	private List<Rule> rules;
	
	

}
