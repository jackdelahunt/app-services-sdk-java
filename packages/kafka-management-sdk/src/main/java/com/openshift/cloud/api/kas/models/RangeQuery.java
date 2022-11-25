/*
 * Kafka Management API
 * Kafka Management API is a REST API to manage Kafka instances
 *
 * The version of the OpenAPI document: 1.14.0
 * Contact: rhosak-support@redhat.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.kas.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.kas.models.Values;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RangeQuery
 */
@JsonPropertyOrder({
  RangeQuery.JSON_PROPERTY_METRIC,
  RangeQuery.JSON_PROPERTY_VALUES
})
@JsonTypeName("RangeQuery")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RangeQuery {
  public static final String JSON_PROPERTY_METRIC = "metric";
  private Map<String, String> metric = null;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Values> values = null;

  public RangeQuery() { 
  }

  public RangeQuery metric(Map<String, String> metric) {
    
    this.metric = metric;
    return this;
  }

  public RangeQuery putMetricItem(String key, String metricItem) {
    if (this.metric == null) {
      this.metric = new HashMap<>();
    }
    this.metric.put(key, metricItem);
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(Map<String, String> metric) {
    this.metric = metric;
  }


  public RangeQuery values(List<Values> values) {
    
    this.values = values;
    return this;
  }

  public RangeQuery addValuesItem(Values valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Values> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<Values> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RangeQuery rangeQuery = (RangeQuery) o;
    return Objects.equals(this.metric, rangeQuery.metric) &&
        Objects.equals(this.values, rangeQuery.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RangeQuery {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

