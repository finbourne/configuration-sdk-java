# com.finbourne.configuration.model.ConfigurationSetSummary
A group of configuration items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the configuration set | [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.configuration.model.ConfigurationSetSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Type = "example Type";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ConfigurationSetSummary configurationSetSummaryInstance = new ConfigurationSetSummary()
    .Id(Id)
    .Type(Type)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
