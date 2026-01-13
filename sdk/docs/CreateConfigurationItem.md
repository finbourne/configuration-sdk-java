# com.finbourne.configuration.model.CreateConfigurationItem
The information required to create a configuration item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the new configuration item | [default to String]
**value** | **String** | The value of the new configuration item   The maximum size for secrets is 4KB and for text values is 2MB | [default to String]
**valueType** | **String** | The type (text, number, boolean, textCollection, numberCollection) of the new configuration item&#39;s value. The validation for each type is as follows: - text: any value - number: double (e.g. \&quot;5.5\&quot;) - boolean: true/false - textCollection: comma separated list (e.g. \&quot;a,b,c\&quot;) - numberCollection: comma separated list of doubles (e.g. \&quot;1,2,3\&quot;) | [optional] [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret | [default to Boolean]
**description** | **String** | The description of the new configuration item | [optional] [default to String]
**blockReveal** | **Boolean** | A property to indicate if revealing the value is blocked. | [optional] [default to Boolean]

```java
import com.finbourne.configuration.model.CreateConfigurationItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Value = "example Value";
@jakarta.annotation.Nullable String ValueType = "example ValueType";
Boolean IsSecret = true;
@jakarta.annotation.Nullable String Description = "example Description";
Boolean BlockReveal = true;


CreateConfigurationItem createConfigurationItemInstance = new CreateConfigurationItem()
    .Key(Key)
    .Value(Value)
    .ValueType(ValueType)
    .IsSecret(IsSecret)
    .Description(Description)
    .BlockReveal(BlockReveal);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
