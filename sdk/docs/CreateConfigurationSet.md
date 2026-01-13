# com.finbourne.configuration.model.CreateConfigurationSet
The information required to create a new configuration set

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**type** | **String** | The type (personal or shared) of the new configuration set | [default to String]
**description** | **String** | The description of the new configuration set | [optional] [default to String]

```java
import com.finbourne.configuration.model.CreateConfigurationSet;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String Type = "example Type";
@jakarta.annotation.Nullable String Description = "example Description";


CreateConfigurationSet createConfigurationSetInstance = new CreateConfigurationSet()
    .Id(Id)
    .Type(Type)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
