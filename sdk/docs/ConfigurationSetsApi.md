# ConfigurationSetsApi

All URIs are relative to *https://fbn-prd.lusid.com/configuration*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addConfigurationToSet**](ConfigurationSetsApi.md#addConfigurationToSet) | **POST** /api/sets/{type}/{scope}/{code}/items | [EARLY ACCESS] AddConfigurationToSet: Add a configuration item to an existing set |
| [**checkAccessTokenExists**](ConfigurationSetsApi.md#checkAccessTokenExists) | **HEAD** /api/sets/personal/me | [DEPRECATED] CheckAccessTokenExists: Check the Personal Access Token exists for the current user |
| [**createConfigurationSet**](ConfigurationSetsApi.md#createConfigurationSet) | **POST** /api/sets | [EARLY ACCESS] CreateConfigurationSet: Create a configuration set |
| [**deleteAccessToken**](ConfigurationSetsApi.md#deleteAccessToken) | **DELETE** /api/sets/personal/me | [DEPRECATED] DeleteAccessToken: Delete any stored Personal Access Token for the current user |
| [**deleteConfigurationItem**](ConfigurationSetsApi.md#deleteConfigurationItem) | **DELETE** /api/sets/{type}/{scope}/{code}/items/{key} | [EARLY ACCESS] DeleteConfigurationItem: Remove the specified configuration item from the specified configuration set |
| [**deleteConfigurationSet**](ConfigurationSetsApi.md#deleteConfigurationSet) | **DELETE** /api/sets/{type}/{scope}/{code} | [EARLY ACCESS] DeleteConfigurationSet: Deletes a configuration set along with all their configuration items |
| [**generateAccessToken**](ConfigurationSetsApi.md#generateAccessToken) | **PUT** /api/sets/personal/me | [DEPRECATED] GenerateAccessToken: Generate a Personal Access Token for the current user and stores it in the me token |
| [**getConfigurationItem**](ConfigurationSetsApi.md#getConfigurationItem) | **GET** /api/sets/{type}/{scope}/{code}/items/{key} | [EARLY ACCESS] GetConfigurationItem: Get the specific configuration item within an existing set |
| [**getConfigurationSet**](ConfigurationSetsApi.md#getConfigurationSet) | **GET** /api/sets/{type}/{scope}/{code} | [EARLY ACCESS] GetConfigurationSet: Get a configuration set, including all the associated metadata. By default secrets will not be revealed |
| [**getSystemConfigurationItems**](ConfigurationSetsApi.md#getSystemConfigurationItems) | **GET** /api/sets/system/{code}/items/{key} | [EARLY ACCESS] GetSystemConfigurationItems: Get the specific system configuration items within a system set  All users have access to this endpoint |
| [**getSystemConfigurationSets**](ConfigurationSetsApi.md#getSystemConfigurationSets) | **GET** /api/sets/system/{code} | [EARLY ACCESS] GetSystemConfigurationSets: Get the specified system configuration sets, including all their associated metadata. By default secrets will not be revealed  All users have access to this endpoint |
| [**listConfigurationSets**](ConfigurationSetsApi.md#listConfigurationSets) | **GET** /api/sets | [EARLY ACCESS] ListConfigurationSets: List all configuration sets summaries (I.e. list of scope/code combinations available) |
| [**updateConfigurationItem**](ConfigurationSetsApi.md#updateConfigurationItem) | **PUT** /api/sets/{type}/{scope}/{code}/items/{key} | [EARLY ACCESS] UpdateConfigurationItem: Update a configuration item&#39;s value and/or description |
| [**updateConfigurationSet**](ConfigurationSetsApi.md#updateConfigurationSet) | **PUT** /api/sets/{type}/{scope}/{code} | [EARLY ACCESS] UpdateConfigurationSet: Update the description of a configuration set |



## addConfigurationToSet

> ConfigurationSet addConfigurationToSet(type, scope, code, createConfigurationItem, userId)

[EARLY ACCESS] AddConfigurationToSet: Add a configuration item to an existing set

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        CreateConfigurationItem createConfigurationItem = new CreateConfigurationItem(); // CreateConfigurationItem | The data to create a configuration item
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationSet result = apiInstance.addConfigurationToSet(type, scope, code, createConfigurationItem, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#addConfigurationToSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **createConfigurationItem** | [**CreateConfigurationItem**](CreateConfigurationItem.md)| The data to create a configuration item | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationSet**](ConfigurationSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration set exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## checkAccessTokenExists

> checkAccessTokenExists()

[DEPRECATED] CheckAccessTokenExists: Check the Personal Access Token exists for the current user

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        try {
            apiInstance.checkAccessTokenExists().execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#checkAccessTokenExists");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Personal Access Token exists |  -  |
| **404** | The Personal Access Token does not exist |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## createConfigurationSet

> ConfigurationSet createConfigurationSet(createConfigurationSet, userId)

[EARLY ACCESS] CreateConfigurationSet: Create a configuration set

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        CreateConfigurationSet createConfigurationSet = new CreateConfigurationSet(); // CreateConfigurationSet | The data to create a configuration set
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationSet result = apiInstance.createConfigurationSet(createConfigurationSet, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#createConfigurationSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createConfigurationSet** | [**CreateConfigurationSet**](CreateConfigurationSet.md)| The data to create a configuration set | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationSet**](ConfigurationSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteAccessToken

> deleteAccessToken()

[DEPRECATED] DeleteAccessToken: Delete any stored Personal Access Token for the current user

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        try {
            apiInstance.deleteAccessToken().execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#deleteAccessToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteConfigurationItem

> deleteConfigurationItem(type, scope, code, key, userId)

[EARLY ACCESS] DeleteConfigurationItem: Remove the specified configuration item from the specified configuration set

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        String key = "key_example"; // String | The key that identifies a configuration item
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            apiInstance.deleteConfigurationItem(type, scope, code, key, userId).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#deleteConfigurationItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **key** | **String**| The key that identifies a configuration item | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration item exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## deleteConfigurationSet

> deleteConfigurationSet(type, scope, code, userId)

[EARLY ACCESS] DeleteConfigurationSet: Deletes a configuration set along with all their configuration items

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            apiInstance.deleteConfigurationSet(type, scope, code, userId).execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#deleteConfigurationSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

null (empty response body)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration set exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## generateAccessToken

> PersonalAccessToken generateAccessToken(action)

[DEPRECATED] GenerateAccessToken: Generate a Personal Access Token for the current user and stores it in the me token

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String action = "action_example"; // String | action=regenerate = Even if an existing parameter exists, forcibly regenerate a new one (deleting the old)  action=ensure = If no parameter exists, create one. If one does already exist, verify that it is still valid (call a service?), and if so, return it. If it is not still valid, then regenerate a new one.  action=default = If a parameter exists, return it. If not then create one. If this parameter is not provided, this is the default behaviour.
        try {
            PersonalAccessToken result = apiInstance.generateAccessToken(action).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#generateAccessToken");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**| action&#x3D;regenerate &#x3D; Even if an existing parameter exists, forcibly regenerate a new one (deleting the old)  action&#x3D;ensure &#x3D; If no parameter exists, create one. If one does already exist, verify that it is still valid (call a service?), and if so, return it. If it is not still valid, then regenerate a new one.  action&#x3D;default &#x3D; If a parameter exists, return it. If not then create one. If this parameter is not provided, this is the default behaviour. | [optional] |

### Return type

[**PersonalAccessToken**](PersonalAccessToken.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getConfigurationItem

> ConfigurationItem getConfigurationItem(type, scope, code, key, reveal, userId)

[EARLY ACCESS] GetConfigurationItem: Get the specific configuration item within an existing set

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        String key = "key_example"; // String | The key that identifies a configuration item
        Boolean reveal = true; // Boolean | Whether to reveal the secrets. This is only available when the userId query setting has not been specified.
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationItem result = apiInstance.getConfigurationItem(type, scope, code, key, reveal, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#getConfigurationItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **key** | **String**| The key that identifies a configuration item | |
| **reveal** | **Boolean**| Whether to reveal the secrets. This is only available when the userId query setting has not been specified. | [optional] |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationItem**](ConfigurationItem.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration item exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getConfigurationSet

> ConfigurationSet getConfigurationSet(type, scope, code, reveal, userId)

[EARLY ACCESS] GetConfigurationSet: Get a configuration set, including all the associated metadata. By default secrets will not be revealed

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        Boolean reveal = true; // Boolean | Whether to reveal the secrets. This is only available when the userId query setting has not been specified.
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationSet result = apiInstance.getConfigurationSet(type, scope, code, reveal, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#getConfigurationSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **reveal** | **Boolean**| Whether to reveal the secrets. This is only available when the userId query setting has not been specified. | [optional] |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationSet**](ConfigurationSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration set exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSystemConfigurationItems

> ResourceListOfConfigurationItem getSystemConfigurationItems(code, key, reveal)

[EARLY ACCESS] GetSystemConfigurationItems: Get the specific system configuration items within a system set  All users have access to this endpoint

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String code = "code_example"; // String | The code that identifies a system configuration set
        String key = "key_example"; // String | The key that identifies a system configuration item
        Boolean reveal = true; // Boolean | Whether to reveal the secrets
        try {
            ResourceListOfConfigurationItem result = apiInstance.getSystemConfigurationItems(code, key, reveal).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#getSystemConfigurationItems");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| The code that identifies a system configuration set | |
| **key** | **String**| The key that identifies a system configuration item | |
| **reveal** | **Boolean**| Whether to reveal the secrets | [optional] |

### Return type

[**ResourceListOfConfigurationItem**](ResourceListOfConfigurationItem.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No system configuration item exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## getSystemConfigurationSets

> ResourceListOfConfigurationSet getSystemConfigurationSets(code, reveal)

[EARLY ACCESS] GetSystemConfigurationSets: Get the specified system configuration sets, including all their associated metadata. By default secrets will not be revealed  All users have access to this endpoint

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String code = "code_example"; // String | The code that identifies a system configuration set
        Boolean reveal = true; // Boolean | Whether to reveal the secrets
        try {
            ResourceListOfConfigurationSet result = apiInstance.getSystemConfigurationSets(code, reveal).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#getSystemConfigurationSets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**| The code that identifies a system configuration set | |
| **reveal** | **Boolean**| Whether to reveal the secrets | [optional] |

### Return type

[**ResourceListOfConfigurationSet**](ResourceListOfConfigurationSet.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No system configuration set exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## listConfigurationSets

> ResourceListOfConfigurationSetSummary listConfigurationSets(type, userId)

[EARLY ACCESS] ListConfigurationSets: List all configuration sets summaries (I.e. list of scope/code combinations available)

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ResourceListOfConfigurationSetSummary result = apiInstance.listConfigurationSets(type, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#listConfigurationSets");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | [optional] |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ResourceListOfConfigurationSetSummary**](ResourceListOfConfigurationSetSummary.md)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateConfigurationItem

> ConfigurationItem updateConfigurationItem(type, scope, code, key, updateConfigurationItem, userId)

[EARLY ACCESS] UpdateConfigurationItem: Update a configuration item&#39;s value and/or description

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        String key = "key_example"; // String | The key that identifies a configuration item
        UpdateConfigurationItem updateConfigurationItem = new UpdateConfigurationItem(); // UpdateConfigurationItem | The data to update a configuration item
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationItem result = apiInstance.updateConfigurationItem(type, scope, code, key, updateConfigurationItem, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#updateConfigurationItem");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **key** | **String**| The key that identifies a configuration item | |
| **updateConfigurationItem** | [**UpdateConfigurationItem**](UpdateConfigurationItem.md)| The data to update a configuration item | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationItem**](ConfigurationItem.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration item exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)


## updateConfigurationSet

> ConfigurationSet updateConfigurationSet(type, scope, code, updateConfigurationSet, userId)

[EARLY ACCESS] UpdateConfigurationSet: Update the description of a configuration set

### Example

```java
import com.finbourne.configuration.model.*;
import com.finbourne.configuration.api.ConfigurationSetsApi;
import com.finbourne.configuration.extensions.ApiConfigurationException;
import com.finbourne.configuration.extensions.ApiFactoryBuilder;
import com.finbourne.configuration.extensions.auth.FinbourneTokenException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ConfigurationSetsApiExample {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, ApiConfigurationException, FinbourneTokenException {
        String fileName = "secrets.json";
        try(PrintWriter writer = new PrintWriter(fileName, "UTF-8")) {
          writer.write("{" +
            "\"api\": {" +
            "    \"tokenUrl\": \"<your-token-url>\"," +
            "    \"_configurationUrl\": \"https://<your-domain>.lusid.com/configuration\"," +
            "    \"username\": \"<your-username>\"," +
            "    \"password\": \"<your-password>\"," +
            "    \"clientId\": \"<your-client-id>\"," +
            "    \"clientSecret\": \"<your-client-secret>\"" +
            "  }" +
            "}");
        }

        ConfigurationSetsApi apiInstance = ApiFactoryBuilder.build(fileName).build(ConfigurationSetsApi.class);
        String type = "type_example"; // String | Whether the configuration set is Personal or Shared
        String scope = "scope_example"; // String | The scope that identifies a configuration set
        String code = "code_example"; // String | The code that identifies a configuration set
        UpdateConfigurationSet updateConfigurationSet = new UpdateConfigurationSet(); // UpdateConfigurationSet | The data to update a configuration set
        String userId = "userId_example"; // String | Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user.
        try {
            ConfigurationSet result = apiInstance.updateConfigurationSet(type, scope, code, updateConfigurationSet, userId).execute();
            System.out.println(result.toJson());
        } catch (ApiException e) {
            System.err.println("Exception when calling ConfigurationSetsApi#updateConfigurationSet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **type** | **String**| Whether the configuration set is Personal or Shared | |
| **scope** | **String**| The scope that identifies a configuration set | |
| **code** | **String**| The code that identifies a configuration set | |
| **updateConfigurationSet** | [**UpdateConfigurationSet**](UpdateConfigurationSet.md)| The data to update a configuration set | |
| **userId** | **String**| Feature that allows Administrators to administer personal settings (but never reveal the value of secrets) of a specific user. | [optional] |

### Return type

[**ConfigurationSet**](ConfigurationSet.md)

### HTTP request headers

- **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | The details of the input related failure |  -  |
| **404** | No configuration set exists with the provided identifiers |  -  |
| **0** | Error response |  -  |

[Back to top](#) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to Model list](../README.md#documentation-for-models) &#8226; [Back to README](../README.md)

