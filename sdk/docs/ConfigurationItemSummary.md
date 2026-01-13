# com.finbourne.configuration.model.ConfigurationItemSummary
A single configuration object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key which identifies the configuration item | [default to String]
**value** | **String** | The value of the configuration item | [default to String]
**valueType** | **String** | The type of the configuration item&#39;s value | [default to String]
**isSecret** | **Boolean** | Defines whether or not the value is a secret. | [default to Boolean]
**ref** | **String** | The reference to the configuration item | [readonly] [default to String]
**blockReveal** | **Boolean** | Defines whether the value is blocked with non-internal request. | [default to Boolean]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.configuration.model.ConfigurationItemSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Value = "example Value";
String ValueType = "example ValueType";
Boolean IsSecret = true;
String Ref = "example Ref";
Boolean BlockReveal = true;
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ConfigurationItemSummary configurationItemSummaryInstance = new ConfigurationItemSummary()
    .Key(Key)
    .Value(Value)
    .ValueType(ValueType)
    .IsSecret(IsSecret)
    .Ref(Ref)
    .BlockReveal(BlockReveal)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
