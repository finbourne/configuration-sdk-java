/*
 * FINBOURNE ConfigurationService API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.configuration.model;

import java.util.Objects;
import com.finbourne.configuration.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.configuration.JSON;

/**
 * The full version of the configuration item
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationItem {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_AT = "lastModifiedAt";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_AT)
  private OffsetDateTime lastModifiedAt;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY = "lastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VALUE_TYPE = "valueType";
  @SerializedName(SERIALIZED_NAME_VALUE_TYPE)
  private String valueType;

  public static final String SERIALIZED_NAME_IS_SECRET = "isSecret";
  @SerializedName(SERIALIZED_NAME_IS_SECRET)
  private Boolean isSecret;

  public static final String SERIALIZED_NAME_REF = "ref";
  @SerializedName(SERIALIZED_NAME_REF)
  private String ref;

  public static final String SERIALIZED_NAME_BLOCK_REVEAL = "blockReveal";
  @SerializedName(SERIALIZED_NAME_BLOCK_REVEAL)
  private Boolean blockReveal;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<Link> links;

  public ConfigurationItem() {
  }

  
  public ConfigurationItem(
     String ref
  ) {
    this();
    this.ref = ref;
  }

  public ConfigurationItem createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date referring to the creation date of the configuration item
   * @return createdAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ConfigurationItem createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Who created the configuration item
   * @return createdBy
  **/
  @jakarta.annotation.Nonnull
  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public ConfigurationItem lastModifiedAt(OffsetDateTime lastModifiedAt) {
    
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

   /**
   * The date referring to the date when the configuration item was last modified
   * @return lastModifiedAt
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getLastModifiedAt() {
    return lastModifiedAt;
  }


  public void setLastModifiedAt(OffsetDateTime lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }


  public ConfigurationItem lastModifiedBy(String lastModifiedBy) {
    
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * Who modified the configuration item most recently
   * @return lastModifiedBy
  **/
  @jakarta.annotation.Nonnull
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }


  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  public ConfigurationItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Describes the configuration item
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ConfigurationItem key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key which identifies the configuration item
   * @return key
  **/
  @jakarta.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ConfigurationItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the configuration item
   * @return value
  **/
  @jakarta.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ConfigurationItem valueType(String valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The type of the configuration item&#39;s value
   * @return valueType
  **/
  @jakarta.annotation.Nonnull
  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public ConfigurationItem isSecret(Boolean isSecret) {
    
    this.isSecret = isSecret;
    return this;
  }

   /**
   * Defines whether or not the value is a secret.
   * @return isSecret
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIsSecret() {
    return isSecret;
  }


  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }


   /**
   * The reference to the configuration item
   * @return ref
  **/
  @jakarta.annotation.Nonnull
  public String getRef() {
    return ref;
  }




  public ConfigurationItem blockReveal(Boolean blockReveal) {
    
    this.blockReveal = blockReveal;
    return this;
  }

   /**
   * Defines whether the value is blocked with non-internal request.
   * @return blockReveal
  **/
  @jakarta.annotation.Nonnull
  public Boolean getBlockReveal() {
    return blockReveal;
  }


  public void setBlockReveal(Boolean blockReveal) {
    this.blockReveal = blockReveal;
  }


  public ConfigurationItem links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public ConfigurationItem addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  public List<Link> getLinks() {
    return links;
  }


  public void setLinks(List<Link> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationItem configurationItem = (ConfigurationItem) o;
    return Objects.equals(this.createdAt, configurationItem.createdAt) &&
        Objects.equals(this.createdBy, configurationItem.createdBy) &&
        Objects.equals(this.lastModifiedAt, configurationItem.lastModifiedAt) &&
        Objects.equals(this.lastModifiedBy, configurationItem.lastModifiedBy) &&
        Objects.equals(this.description, configurationItem.description) &&
        Objects.equals(this.key, configurationItem.key) &&
        Objects.equals(this.value, configurationItem.value) &&
        Objects.equals(this.valueType, configurationItem.valueType) &&
        Objects.equals(this.isSecret, configurationItem.isSecret) &&
        Objects.equals(this.ref, configurationItem.ref) &&
        Objects.equals(this.blockReveal, configurationItem.blockReveal) &&
        Objects.equals(this.links, configurationItem.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, lastModifiedAt, lastModifiedBy, description, key, value, valueType, isSecret, ref, blockReveal, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationItem {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    blockReveal: ").append(toIndentedString(blockReveal)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("createdAt");
    openapiFields.add("createdBy");
    openapiFields.add("lastModifiedAt");
    openapiFields.add("lastModifiedBy");
    openapiFields.add("description");
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("valueType");
    openapiFields.add("isSecret");
    openapiFields.add("ref");
    openapiFields.add("blockReveal");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("createdBy");
    openapiRequiredFields.add("lastModifiedAt");
    openapiRequiredFields.add("lastModifiedBy");
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("valueType");
    openapiRequiredFields.add("isSecret");
    openapiRequiredFields.add("ref");
    openapiRequiredFields.add("blockReveal");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ConfigurationItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigurationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationItem is not found in the empty JSON string", ConfigurationItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigurationItem.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("createdBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdBy").toString()));
      }
      if (!jsonObj.get("lastModifiedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModifiedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModifiedBy").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("valueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueType").toString()));
      }
      if (!jsonObj.get("ref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ref").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            Link.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigurationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationItem>() {
           @Override
           public void write(JsonWriter out, ConfigurationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationItem
  * @throws IOException if the JSON string is invalid with respect to ConfigurationItem
  */
  public static ConfigurationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationItem.class);
  }

 /**
  * Convert an instance of ConfigurationItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
