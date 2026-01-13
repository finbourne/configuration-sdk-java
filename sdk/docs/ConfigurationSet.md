# com.finbourne.configuration.model.ConfigurationSet
The full version of the configuration set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the creation date of the configuration set | [default to OffsetDateTime]
**createdBy** | **String** | Who created the configuration set | [default to String]
**lastModifiedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date referring to the date when the configuration set was last modified | [default to OffsetDateTime]
**lastModifiedBy** | **String** | Who modified the configuration set most recently | [default to String]
**description** | **String** | Describes the configuration set | [optional] [default to String]
**items** | [**List&lt;ConfigurationItemSummary&gt;**](ConfigurationItemSummary.md) | The collection of the configuration items that this set contains. | [optional] [default to List<ConfigurationItemSummary>]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the configuration set | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.configuration.model.ConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime CreatedAt = OffsetDateTime.now();
String CreatedBy = "example CreatedBy";
OffsetDateTime LastModifiedAt = OffsetDateTime.now();
String LastModifiedBy = "example LastModifiedBy";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ConfigurationItemSummary> Items = new List<ConfigurationItemSummary>();
ResourceId Id = new ResourceId();
String Type = "example Type";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ConfigurationSet configurationSetInstance = new ConfigurationSet()
    .CreatedAt(CreatedAt)
    .CreatedBy(CreatedBy)
    .LastModifiedAt(LastModifiedAt)
    .LastModifiedBy(LastModifiedBy)
    .Description(Description)
    .Items(Items)
    .Id(Id)
    .Type(Type)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
