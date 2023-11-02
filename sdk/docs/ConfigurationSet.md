

# ConfigurationSet

The full version of the configuration set

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | The date referring to the creation date of the configuration set |  |
|**createdBy** | **String** | Who created the configuration set |  |
|**lastModifiedAt** | **OffsetDateTime** | The date referring to the date when the configuration set was last modified |  |
|**lastModifiedBy** | **String** | Who modified the configuration set most recently |  |
|**description** | **String** | Describes the configuration set |  [optional] |
|**items** | [**List&lt;ConfigurationItemSummary&gt;**](ConfigurationItemSummary.md) | The collection of the configuration items that this set contains. |  [optional] |
|**id** | [**ResourceId**](ResourceId.md) |  |  |
|**type** | **String** | The type (personal or shared) of the configuration set |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



