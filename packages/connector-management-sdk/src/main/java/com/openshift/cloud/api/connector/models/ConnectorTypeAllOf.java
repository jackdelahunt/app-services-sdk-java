/*
 * Connector Service Fleet Manager
 * Connector Service Fleet Manager is a Rest API to manage connectors.
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.openshift.cloud.api.connector.models;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.openshift.cloud.api.connector.models.Channel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ConnectorTypeAllOf
 */
@JsonPropertyOrder({
  ConnectorTypeAllOf.JSON_PROPERTY_NAME,
  ConnectorTypeAllOf.JSON_PROPERTY_VERSION,
  ConnectorTypeAllOf.JSON_PROPERTY_CHANNELS,
  ConnectorTypeAllOf.JSON_PROPERTY_DESCRIPTION,
  ConnectorTypeAllOf.JSON_PROPERTY_ICON_HREF,
  ConnectorTypeAllOf.JSON_PROPERTY_LABELS,
  ConnectorTypeAllOf.JSON_PROPERTY_CAPABILITIES,
  ConnectorTypeAllOf.JSON_PROPERTY_SCHEMA,
  ConnectorTypeAllOf.JSON_PROPERTY_JSON_SCHEMA
})
@JsonTypeName("ConnectorType_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConnectorTypeAllOf {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_CHANNELS = "channels";
  private List<Channel> channels = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ICON_HREF = "icon_href";
  private String iconHref;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private List<String> capabilities = null;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private Object schema;

  public static final String JSON_PROPERTY_JSON_SCHEMA = "json_schema";
  private Object jsonSchema;

  public ConnectorTypeAllOf() { 
  }

  public ConnectorTypeAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the connector type.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the connector type.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ConnectorTypeAllOf version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version of the connector type.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the connector type.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public ConnectorTypeAllOf channels(List<Channel> channels) {
    
    this.channels = channels;
    return this;
  }

  public ConnectorTypeAllOf addChannelsItem(Channel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * Channels of the connector type.
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Channels of the connector type.")
  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Channel> getChannels() {
    return channels;
  }


  @JsonProperty(JSON_PROPERTY_CHANNELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannels(List<Channel> channels) {
    this.channels = channels;
  }


  public ConnectorTypeAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the connector.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the connector.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ConnectorTypeAllOf iconHref(String iconHref) {
    
    this.iconHref = iconHref;
    return this;
  }

   /**
   * URL to an icon of the connector.
   * @return iconHref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to an icon of the connector.")
  @JsonProperty(JSON_PROPERTY_ICON_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIconHref() {
    return iconHref;
  }


  @JsonProperty(JSON_PROPERTY_ICON_HREF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIconHref(String iconHref) {
    this.iconHref = iconHref;
  }


  public ConnectorTypeAllOf labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public ConnectorTypeAllOf addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Labels used to categorize the connector
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Labels used to categorize the connector")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLabels() {
    return labels;
  }


  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public ConnectorTypeAllOf capabilities(List<String> capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  public ConnectorTypeAllOf addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * The capabilities supported by the conenctor
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The capabilities supported by the conenctor")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }


  public ConnectorTypeAllOf schema(Object schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * A json schema that can be used to validate a ConnectorRequest connector field.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A json schema that can be used to validate a ConnectorRequest connector field.")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(Object schema) {
    this.schema = schema;
  }


  public ConnectorTypeAllOf jsonSchema(Object jsonSchema) {
    
    this.jsonSchema = jsonSchema;
    return this;
  }

   /**
   * A json schema that can be used to validate a ConnectorRequest connector field.
   * @return jsonSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A json schema that can be used to validate a ConnectorRequest connector field.")
  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getJsonSchema() {
    return jsonSchema;
  }


  @JsonProperty(JSON_PROPERTY_JSON_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsonSchema(Object jsonSchema) {
    this.jsonSchema = jsonSchema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorTypeAllOf connectorTypeAllOf = (ConnectorTypeAllOf) o;
    return Objects.equals(this.name, connectorTypeAllOf.name) &&
        Objects.equals(this.version, connectorTypeAllOf.version) &&
        Objects.equals(this.channels, connectorTypeAllOf.channels) &&
        Objects.equals(this.description, connectorTypeAllOf.description) &&
        Objects.equals(this.iconHref, connectorTypeAllOf.iconHref) &&
        Objects.equals(this.labels, connectorTypeAllOf.labels) &&
        Objects.equals(this.capabilities, connectorTypeAllOf.capabilities) &&
        Objects.equals(this.schema, connectorTypeAllOf.schema) &&
        Objects.equals(this.jsonSchema, connectorTypeAllOf.jsonSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, channels, description, iconHref, labels, capabilities, schema, jsonSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorTypeAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconHref: ").append(toIndentedString(iconHref)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
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

