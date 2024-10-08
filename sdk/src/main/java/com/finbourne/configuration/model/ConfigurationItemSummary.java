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
 * A single configuration object
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationItemSummary {
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

  public ConfigurationItemSummary() {
  }

  
  public ConfigurationItemSummary(
     String ref
  ) {
    this();
    this.ref = ref;
  }

  public ConfigurationItemSummary key(String key) {
    
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


  public ConfigurationItemSummary value(String value) {
    
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


  public ConfigurationItemSummary valueType(String valueType) {
    
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


  public ConfigurationItemSummary isSecret(Boolean isSecret) {
    
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




  public ConfigurationItemSummary blockReveal(Boolean blockReveal) {
    
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


  public ConfigurationItemSummary links(List<Link> links) {
    
    this.links = links;
    return this;
  }

  public ConfigurationItemSummary addLinksItem(Link linksItem) {
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
    ConfigurationItemSummary configurationItemSummary = (ConfigurationItemSummary) o;
    return Objects.equals(this.key, configurationItemSummary.key) &&
        Objects.equals(this.value, configurationItemSummary.value) &&
        Objects.equals(this.valueType, configurationItemSummary.valueType) &&
        Objects.equals(this.isSecret, configurationItemSummary.isSecret) &&
        Objects.equals(this.ref, configurationItemSummary.ref) &&
        Objects.equals(this.blockReveal, configurationItemSummary.blockReveal) &&
        Objects.equals(this.links, configurationItemSummary.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valueType, isSecret, ref, blockReveal, links);
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
    sb.append("class ConfigurationItemSummary {\n");
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
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("valueType");
    openapiFields.add("isSecret");
    openapiFields.add("ref");
    openapiFields.add("blockReveal");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
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
  * @throws IOException if the JSON Element is invalid with respect to ConfigurationItemSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ConfigurationItemSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigurationItemSummary is not found in the empty JSON string", ConfigurationItemSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConfigurationItemSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
       if (!ConfigurationItemSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigurationItemSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigurationItemSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigurationItemSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigurationItemSummary>() {
           @Override
           public void write(JsonWriter out, ConfigurationItemSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigurationItemSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigurationItemSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigurationItemSummary
  * @throws IOException if the JSON string is invalid with respect to ConfigurationItemSummary
  */
  public static ConfigurationItemSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigurationItemSummary.class);
  }

 /**
  * Convert an instance of ConfigurationItemSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
