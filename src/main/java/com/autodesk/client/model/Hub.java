/*
 * Forge SDK
 * The Forge Platform contains an expanding collection of web service components that can be used with Autodesk cloud-based products or your own technologies. Take advantage of Autodesk’s expertise in design and engineering.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: forge.help@autodesk.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.autodesk.client.model;

import java.util.Objects;

import com.autodesk.client.model.HubAttributes;
import com.autodesk.client.model.HubRelationships;
import com.autodesk.client.model.JsonApiDocument;
import com.autodesk.client.model.JsonApiLinks;
import com.autodesk.client.model.JsonApiMeta;
import com.autodesk.client.model.JsonApiResource;
import com.autodesk.client.model.JsonApiVersionJsonapi;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Hub
 */

public class Hub   {
  @JsonProperty("jsonapi")
  private JsonApiVersionJsonapi jsonapi = null;

  @JsonProperty("data")
  private JsonApiResource data = null;

  @JsonProperty("included")
  private List<JsonApiResource> included = new ArrayList<JsonApiResource>();

  @JsonProperty("links")
  private JsonApiLinks links = null;

  @JsonProperty("id")
  private String id = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HUBS("hubs");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("attributes")
  private HubAttributes attributes = null;

  @JsonProperty("meta")
  private JsonApiMeta meta = null;

  @JsonProperty("relationships")
  private HubRelationships relationships = null;

  public Hub jsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
    return this;
  }

   /**
   * Get jsonapi
   * @return jsonapi
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiVersionJsonapi getJsonapi() {
    return jsonapi;
  }

  public void setJsonapi(JsonApiVersionJsonapi jsonapi) {
    this.jsonapi = jsonapi;
  }

  public Hub data(JsonApiResource data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiResource getData() {
    return data;
  }

  public void setData(JsonApiResource data) {
    this.data = data;
  }

  public Hub included(List<JsonApiResource> included) {
    this.included = included;
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<JsonApiResource> getIncluded() {
    return included;
  }

  public void setIncluded(List<JsonApiResource> included) {
    this.included = included;
  }

  public Hub links(JsonApiLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public JsonApiLinks getLinks() {
    return links;
  }

  public void setLinks(JsonApiLinks links) {
    this.links = links;
  }

  public Hub id(String id) {
    this.id = id;
    return this;
  }

   /**
   * resource id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "resource id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Hub type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Hub attributes(HubAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "null", value = "")
  public HubAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(HubAttributes attributes) {
    this.attributes = attributes;
  }

  public Hub meta(JsonApiMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public JsonApiMeta getMeta() {
    return meta;
  }

  public void setMeta(JsonApiMeta meta) {
    this.meta = meta;
  }

  public Hub relationships(HubRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @ApiModelProperty(example = "null", value = "")
  public HubRelationships getRelationships() {
    return relationships;
  }

  public void setRelationships(HubRelationships relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hub hub = (Hub) o;
    return Objects.equals(this.jsonapi, hub.jsonapi) &&
        Objects.equals(this.data, hub.data) &&
        Objects.equals(this.included, hub.included) &&
        Objects.equals(this.links, hub.links) &&
        Objects.equals(this.id, hub.id) &&
        Objects.equals(this.type, hub.type) &&
        Objects.equals(this.attributes, hub.attributes) &&
        Objects.equals(this.meta, hub.meta) &&
        Objects.equals(this.relationships, hub.relationships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonapi, data, included, links, id, type, attributes, meta, relationships);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hub {\n");
    
    sb.append("    jsonapi: ").append(toIndentedString(jsonapi)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

