# com.finbourne.configuration.model.PersonalAccessToken
Representation of a Personal Access Token under a Configuration Item format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | Value of the Personal Access Token. | [readonly] [default to String]
**type** | **String** | The type of the Personal Access Token. | [readonly] [default to String]
**description** | **String** | The description of the Personal Access Token. | [readonly] [default to String]
**ref** | **String** | The reference to the Personal Access Token | [readonly] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.configuration.model.PersonalAccessToken;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
String Type = "example Type";
String Description = "example Description";
String Ref = "example Ref";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PersonalAccessToken personalAccessTokenInstance = new PersonalAccessToken()
    .Value(Value)
    .Type(Type)
    .Description(Description)
    .Ref(Ref)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
