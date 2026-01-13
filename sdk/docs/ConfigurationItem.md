# com.finbourne.configuration.model.ConfigurationItem
The full version of the configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the creation date of the configuration item | [default to OffsetDateTime]
**createdBy** | **String** | Who created the configuration item | [default to String]
**lastModifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the date when the configuration item was last modified | [default to OffsetDateTime]
**lastModifiedBy** | **String** | Who modified the configuration item most recently | [default to String]
**description** | **String** | Describes the configuration item | [optional] [default to String]
**key** | **String** | The key which identifies the configuration item | [default to String]
**value** | **String** | The value of the configuration item | [default to String]
**valueType** | **String** | The type of the configuration item&#39;s value | [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret. | [default to Boolean]
**ref** | **String** | The reference to the configuration item | [readonly] [default to String]
**blockReveal** | **Boolean** | Defines whether the value is blocked with non-internal request. | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.configuration.model.ConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime CreatedAt = OffsetDateTime.now();
String CreatedBy = "example CreatedBy";
OffsetDateTime LastModifiedAt = OffsetDateTime.now();
String LastModifiedBy = "example LastModifiedBy";
@jakarta.annotation.Nullable String Description = "example Description";
String Key = "example Key";
String Value = "example Value";
String ValueType = "example ValueType";
Boolean IsSecret = true;
String Ref = "example Ref";
Boolean BlockReveal = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ConfigurationItem configurationItemInstance = new ConfigurationItem()
    .CreatedAt(CreatedAt)
    .CreatedBy(CreatedBy)
    .LastModifiedAt(LastModifiedAt)
    .LastModifiedBy(LastModifiedBy)
    .Description(Description)
    .Key(Key)
    .Value(Value)
    .ValueType(ValueType)
    .IsSecret(IsSecret)
    .Ref(Ref)
    .BlockReveal(BlockReveal)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
