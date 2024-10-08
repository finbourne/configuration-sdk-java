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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * The information required to create a configuration item
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateConfigurationItem {
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

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BLOCK_REVEAL = "blockReveal";
  @SerializedName(SERIALIZED_NAME_BLOCK_REVEAL)
  private Boolean blockReveal;

  public CreateConfigurationItem() {
  }

  public CreateConfigurationItem key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the new configuration item
   * @return key
  **/
  @jakarta.annotation.Nonnull
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CreateConfigurationItem value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the new configuration item     The maximum size for secrets is 4KB and for text values is 2MB
   * @return value
  **/
  @jakarta.annotation.Nonnull
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CreateConfigurationItem valueType(String valueType) {
    
    this.valueType = valueType;
    return this;
  }

   /**
   * The type (text, number, boolean, textCollection, numberCollection) of the new configuration item&#39;s value.  The validation for each type is as follows:  - text: any value  - number: double (e.g. \&quot;5.5\&quot;)  - boolean: true/false  - textCollection: comma separated list (e.g. \&quot;a,b,c\&quot;)  - numberCollection: comma separated list of doubles (e.g. \&quot;1,2,3\&quot;)
   * @return valueType
  **/
  @jakarta.annotation.Nullable
  public String getValueType() {
    return valueType;
  }


  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  public CreateConfigurationItem isSecret(Boolean isSecret) {
    
    this.isSecret = isSecret;
    return this;
  }

   /**
   * Defines whether or not the value is a secret
   * @return isSecret
  **/
  @jakarta.annotation.Nonnull
  public Boolean getIsSecret() {
    return isSecret;
  }


  public void setIsSecret(Boolean isSecret) {
    this.isSecret = isSecret;
  }


  public CreateConfigurationItem description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the new configuration item
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateConfigurationItem blockReveal(Boolean blockReveal) {
    
    this.blockReveal = blockReveal;
    return this;
  }

   /**
   * A property to indicate if revealing the value is blocked.
   * @return blockReveal
  **/
  @jakarta.annotation.Nullable
  public Boolean getBlockReveal() {
    return blockReveal;
  }


  public void setBlockReveal(Boolean blockReveal) {
    this.blockReveal = blockReveal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateConfigurationItem createConfigurationItem = (CreateConfigurationItem) o;
    return Objects.equals(this.key, createConfigurationItem.key) &&
        Objects.equals(this.value, createConfigurationItem.value) &&
        Objects.equals(this.valueType, createConfigurationItem.valueType) &&
        Objects.equals(this.isSecret, createConfigurationItem.isSecret) &&
        Objects.equals(this.description, createConfigurationItem.description) &&
        Objects.equals(this.blockReveal, createConfigurationItem.blockReveal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valueType, isSecret, description, blockReveal);
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
    sb.append("class CreateConfigurationItem {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    isSecret: ").append(toIndentedString(isSecret)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    blockReveal: ").append(toIndentedString(blockReveal)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("blockReveal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("isSecret");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateConfigurationItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateConfigurationItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateConfigurationItem is not found in the empty JSON string", CreateConfigurationItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateConfigurationItem.openapiRequiredFields) {
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
      if ((jsonObj.get("valueType") != null && !jsonObj.get("valueType").isJsonNull()) && !jsonObj.get("valueType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueType").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateConfigurationItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateConfigurationItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateConfigurationItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateConfigurationItem.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateConfigurationItem>() {
           @Override
           public void write(JsonWriter out, CreateConfigurationItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateConfigurationItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateConfigurationItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateConfigurationItem
  * @throws IOException if the JSON string is invalid with respect to CreateConfigurationItem
  */
  public static CreateConfigurationItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateConfigurationItem.class);
  }

 /**
  * Convert an instance of CreateConfigurationItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
