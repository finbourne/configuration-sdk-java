# com.finbourne.configuration.model.UpdateConfigurationItem
The information required to update a configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The new value of the configuration item | [default to String]
**description** | **String** | The new description of the configuration item | [optional] [default to String]
**blockReveal** | **Boolean** | The requested new state of BlockReveal | [optional] [default to Boolean]

```java
import com.finbourne.configuration.model.UpdateConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
@jakarta.annotation.Nullable String Description = "example Description";
Boolean BlockReveal = true;


UpdateConfigurationItem updateConfigurationItemInstance = new UpdateConfigurationItem()
    .Value(Value)
    .Description(Description)
    .BlockReveal(BlockReveal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
